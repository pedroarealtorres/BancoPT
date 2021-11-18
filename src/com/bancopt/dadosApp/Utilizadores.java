package com.bancopt.dadosApp;

import com.bancopt.contas.Conta;
import com.bancopt.operacoes.Operacao;
import com.bancopt.utilizadores.Cliente;
import com.bancopt.utilizadores.GestorConta;
import com.bancopt.utilizadores.Utilizador;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static jdk.nashorn.internal.objects.NativeMath.round;

/**
 *
 * @author pedro.torres
 */
public class Utilizadores {
    
    private static String nomesProprios[] = new String[] { "Pedro", "Nelson", "António", "Carlos", "Henrique", "João", "Carla", "Ana", "Raquel", "Sara", "Joana", "Eduardo", "Cátia", "Augusto", "Hernáni", "Nuno"};
    private static String apelidos[] = new String[] { "Torres", "Silva", "Mourão", "Amorim", "Rocha", "Sousa", "Rocha", "Azevedo", "Abreu", "Gonçalves", "Magalhães", "Mesquita" };
   
    private static final int NUM_UTILIZADORES = 200;
    private static final int DATA_MIN = (int) LocalDate.of(1900, 1, 1).toEpochDay();
    private static final int DATA_MAX = (int) LocalDate.now().toEpochDay();
    private static final int NIF_SIZE = 9;
    private static final int NUM_CLIENTES_BY_GESTOR = 3;
    private static final int NUM_CONTAS_BY_CLIENTE = 2;
    private static final int NUM_GESTORES = 3;
    private static final int NUM_CLIENTES = 15;
    private static final int NUM_CONTAS = 30;
    private static final int NUM_OPERACOES = 100;
    private static final int NUM_OPERACOES_BY_CONTA = 5;
    
    public static List<Utilizador> gerarUtilizadores() {
        
        List<Utilizador> listUtilizadores = new ArrayList<Utilizador>();
        String[] nomes = gerarNomes(nomesProprios, apelidos);
        
        for(int i = 0; i < NUM_UTILIZADORES; i++) {
            Utilizador utilizador = new Utilizador();
            utilizador.setNome(nomes[i]);
            utilizador.setDataNascimento(gerarDatas());
            utilizador.setNif(gerarNif());
            
            listUtilizadores.add(utilizador);
        }
        return listUtilizadores;
    }
    
    public static List<Operacao> gerarOperacoes() {
        List<Operacao> listOperacoes = new ArrayList<Operacao>();
        
        for(int i = 1; i <= NUM_OPERACOES; i++) {
            Operacao operacao = new Operacao();
            if(i < 10) {
                operacao.setNome("Operação nº 0" + i);
            }  else {
                operacao.setNome("Operação nº " + i);
            }
            //operacao.getTipo()
            operacao.setDataOperacao(gerarDatas());
            operacao.setMontante(gerarMontante());
            operacao.setIbanDestino(gerarIban());
            
            listOperacoes.add(operacao);
        }
        return listOperacoes;
    }
    
    private static double gerarMontante(){
        final double MIN_VAL = 0.0f;
        final double MAX_VAL = 1000.0f;
        
        Random r = new Random();
        double rDouble = MIN_VAL + (MAX_VAL - MIN_VAL) * r.nextDouble();
        
        return rDouble;
    }
    
    private static String gerarIban(){
        String iban = "PT50";
        final int IBAN_SIZE = 21;
        
        for(int i = 0; i < IBAN_SIZE; i++) {
            Random r = new Random();
            int rInt = r.nextInt(8);
            
            iban += rInt;
        }
        return iban;
    }
    
    public static List<Conta> gerarContas(List<Operacao> listOperacoes) {
        List<Conta> listContas = new ArrayList<Conta>();
        
        for(int i = 0; i < NUM_CONTAS; i++) {
            List<Operacao> listOperacoesByCliente = new ArrayList<Operacao>();
            
            Conta conta = new Conta();
            conta.setNomeConta("Conta nº " + i);
            conta.setMontante(gerarMontante());
            conta.setIban(gerarIban());
            //conta.setTipoConta(tipoConta);
            //conta.setNumeroConta(num_conta);
            
            for(int j = 0; j < NUM_OPERACOES_BY_CONTA; j++) {
                Random r = new Random();
                int rNumero = r.nextInt(15);
                
                Operacao operacao = listOperacoes.get(j*rNumero);
                listOperacoesByCliente.add(operacao);
            }
            conta.setListOperacoes(listOperacoesByCliente);
            listContas.add(conta);
        }
        
        return listContas;
    }
    
    public static List<Cliente> gerarClientes(List<Conta> listContas) {
        List<Cliente> listClientes = new ArrayList<Cliente>();
        String[] nomes = gerarNomes(nomesProprios, apelidos);
        
        for(int i = 0; i < NUM_CLIENTES; i++) {
            List<Conta> listContasByCliente = new ArrayList<Conta>();
            Cliente cliente = new Cliente();
            cliente.setNome(nomes[i]);
            cliente.setDataNascimento(gerarDatas());
            cliente.setNif(gerarNif());

            for(int j = 0; j < NUM_CONTAS_BY_CLIENTE; j++) {
                Random r = new Random();
                int rConta = r.nextInt(NUM_CONTAS-1);
                Conta conta = listContas.get(rConta);
                listContasByCliente.add(conta);
            }
            cliente.setListContas(listContasByCliente);
            listClientes.add(cliente);
        }
        
        return listClientes;
    }
    
    public static List<GestorConta> gerarGestores(List<Cliente> listClientes) {
        
        List<GestorConta> listGestores = new ArrayList<GestorConta>();
        String[] nomes = gerarNomes(nomesProprios, apelidos);
        
        for(int i = 0; i < NUM_GESTORES; i++) {
            List<Cliente> listClientesByGestor = new ArrayList<Cliente>();
            GestorConta gestorConta = new GestorConta();
            gestorConta.setNome(nomes[i]);
            gestorConta.setDataNascimento(gerarDatas());
            gestorConta.setNif(gerarNif());

            for(int j = 0; j < NUM_CLIENTES_BY_GESTOR; j++) {
                Random r = new Random();
                int rCliente = r.nextInt(NUM_CLIENTES-1);
                Cliente cliente = listClientes.get(rCliente);
                listClientesByGestor.add(cliente);
            }
            gestorConta.setListClientes(listClientesByGestor);
            listGestores.add(gestorConta);
        }
        
        return listGestores;
    }
    /**
     * Método para gerar nomes
     */
    private static String[] gerarNomes(String[] nomesProprios, String[] apelidos) {
        
        String nomes[] = new String[NUM_UTILIZADORES]; 
        
        for(int i = 0; i < NUM_UTILIZADORES; i++) {
            //Instancia classe Random
            Random r = new Random();
            int r_nomeProp = r.nextInt(nomesProprios.length);
            int r_apelidos = r.nextInt(apelidos.length);

            nomes[i] = nomesProprios[r_nomeProp] + " " + apelidos[r_apelidos];
        }
        return nomes;
    }

    /**
     * Método para gerar datas
     */
    private static LocalDate gerarDatas() {
        Random random = new Random();
        long rData = DATA_MIN + random.nextInt(DATA_MAX - DATA_MIN);

        LocalDate rDataNascimento = LocalDate.ofEpochDay(rData);
        
        return rDataNascimento;
    }
    
    private static String gerarNif() {
        String nif = new String(); 
        
        for(int i = 0; i < NIF_SIZE; i++) {
            //Instancia classe Random
            Random r = new Random();
            int rNumero = r.nextInt(8);

            nif += rNumero;
        }
        return nif;
    }
    
}
