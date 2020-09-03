/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.telaaula5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author marce
 */
public class Operacoes {
    
    //1) Desenvolva o código para gerar um arquivo com o seguinte conteúdo: “Linguagem de programação II”. O nome do arquivo deve ser “disciplinas.txt”
    public void q1(){
        try {
            FileWriter fw;
            fw=new FileWriter("D:\\disciplinas.txt");
            fw.write("Linguagem de programação II");
            fw.close();
        } catch (Exception e) {

        }
    }
    //2)Desenvolva o código para adicionar o nome das outras duas disciplinas (Empreendedorismo  e Análise de Sistemas) no arquivo criado anteriormente, uma disciplina em cada linha;
    public void q2(){
        try {
            FileWriter fw;
            fw=new FileWriter("D:\\disciplinas.txt",true);
            fw.write("\n");
            fw.write("Empreendedorismo");
            fw.write("\r\n");
            fw.write("Análise de Sistemas");
            fw.close();
        } catch (Exception e) {

        }
    }

    //3)Desenvolva o código para criar um arquivo com o nome disciplinas1.txt. O conteúdo do arquivo deve ser as disciplinas do primeiro módulo (Lógica de Programação, Introdução à Informática e Aplicativos, Introdução à Manutenção de Computadores, Direito Legislação e Ética), uma disciplina em cada linha;
    public void q3(){
        try {
            FileWriter fw;
            fw=new FileWriter("D:\\disciplinas1.txt");
            fw.write("Lógica de Programação\n");
            fw.write("Introdução à Informática e Aplicativos\n");
            fw.write("Introdução à Manutenção de Computadores\n");
            fw.write("Direito Legislação e Ética\n");
            fw.close();
        } catch (Exception e) {

        }
    }
    //4)Desenvolva o código para adicionar os números de 5 até 20 dentro do arquivo;
    public void q4(){
        try {
                FileWriter fw;
                fw=new FileWriter("D:\\disciplinas1.txt",true);
                for(int i=5;i<=20;i++){
                        fw.write(i+"\n");
                }
                fw.close();
        } catch (Exception e) {

        }
    }
    
    //5)Desenvolva o código para ler o arquivo com uma linha (desenvolvido na questão 1). A linha deve ser impressa na tela, utilizando o comando System.out.println.
    public void q5(){
        try {
            FileReader fr;
            fr = new FileReader("D:\\disciplinas.txt");

            BufferedReader bf;
            bf=new BufferedReader(fr);

            String linha;
            linha=bf.readLine();
            System.out.println(linha);

        } catch (Exception e) {

        }
    }

    //6)Desenvolva o código para ler o arquivo com as três disciplinas (desenvolvido na questão 2). Cada linha deve ser impressa na tela, utilizando o comando System.out.println.
    public void q6(){
        try {
            FileReader fr;
            fr = new FileReader("D:\\disciplinas.txt");

            BufferedReader bf;
            bf=new BufferedReader(fr);

            String linha;
            linha=bf.readLine();
            while(linha!=null){
                    System.out.println(linha);
                    linha=bf.readLine();
            }
        } catch (Exception e) {

        }
    }
    
    //7) Desenvolva o código para exibir na tela apenas a segunda linha de um arquivo;
    public void q7(){
        try {
            FileReader fr;
            fr = new FileReader("D:\\disciplinas1.txt");

            BufferedReader bf;
            bf=new BufferedReader(fr);

            String linha;
            bf.readLine();
            linha=bf.readLine();
            System.out.println(linha);
        } catch (Exception e) {

        }
    }
    
    //8)Desenvolva o código para adicionar os primeiros 50 números pares em um arquivo;
    public void q8(){
        try {
            FileWriter fw;
            fw=new FileWriter("D:\\pares.txt");
            for(int i=0;i<50;i++){
                    fw.write((i*2)+"\n");
            }
            fw.close();
        } catch (Exception e) {

        }
    }

    //9)Desenvolva o código para ler as linhas ímpares de um arquivo;
    public void q9(){
        try {
            FileReader fr;
            fr = new FileReader("D:\\pares.txt");

            BufferedReader bf;
            bf=new BufferedReader(fr);

            String linha;
            linha=bf.readLine();
            while(linha!=null){
                    System.out.println(linha);
                    bf.readLine();
                    linha=bf.readLine();
            }
        } catch (Exception e) {

        }
    }
    
    //10)Desenvolva o código para ler a penúltima linha de um arquivo;
    public void q10(){ 
        try {
            FileReader fr;
            fr = new FileReader("D:\\pares.txt");

            BufferedReader bf;
            bf=new BufferedReader(fr);

            String linha,ultima="",penultima="";
            linha=bf.readLine();
            while(linha!=null){
                    //System.out.println(linha);
            penultima=ultima;
                    ultima=linha;
                    linha=bf.readLine();
            }
            System.out.println(penultima);
        } catch (Exception e) {

        }
        
    } 
}
