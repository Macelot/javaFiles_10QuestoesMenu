/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.telaaula5;

import javax.swing.JOptionPane;

/**
 *
 * @author marce
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Operacoes operacoes;
        operacoes = new Operacoes();
        
        String opcao;
        




        for(;;){
           opcao = JOptionPane.showInputDialog("Digite a opção:\n" +
                   "1 - Gerar um arquivo com o seguinte conteúdo: Linguagem de programação II. O nome do arquivo deve ser disciplinas.txt.\n" +
                   "2 - adicionar o nome das outras duas disciplinas (Empreendedorismo e Análise de Sistemas) no arquivo criado anteriormente, uma disciplina em cada linha.\n" +
                   "3 - código para criar um arquivo com o nome disciplinas1.txt. O conteúdo do arquivo deve ser as disciplinas do primeiro módulo (Lógica de Programação, Introdução à Informática e Aplicativos, Introdução à Manutenção de Computadores, Direito Legislação e Ética), uma disciplina em cada linha \n" +
                   "4 - código para adicionar os números de 5 até 20 dentro do arquivo.\n" +
                   "5 - código para ler o arquivo com uma linha (desenvolvido na questão 1). A linha deve ser impressa na tela, utilizando o comando System.out.println.\n" +
                   "6 - código para ler o arquivo com as três disciplinas (desenvolvido na questão 2). Cada linha deve ser impressa na tela, utilizando o comando System.out.println.\n" +
                   "7 - código para exibir na tela apenas a segunda linha de um arquivo.\n" +
                   "8 - código para adicionar os primeiros 50 números pares em um arquivo.\n" +
                   "9 - código para ler as linhas ímpares de um arquivo.\n" +
                   "0 - código para ler a penúltima linha de um arquivo.\n" +
                   "f - Terminar o programa");
           if(opcao == null || opcao.equals("f"))
               break;
           else if(opcao.equals("1"))
                operacoes.q1();
           else if(opcao.equals("2"))
                operacoes.q2();
           else if(opcao.equals("3"))
               operacoes.q3();
           else if(opcao.equals("4"))
               operacoes.q4();
           else if(opcao.equals("5"))
               operacoes.q5();
           else if(opcao.equals("6"))
               operacoes.q6();
           else if(opcao.equals("7"))
               operacoes.q7();
           else if(opcao.equals("8"))
               operacoes.q8();
           else if(opcao.equals("9"))
               operacoes.q9();
           else if(opcao.equals("0"))
               operacoes.q10();        
       }
    }
}
