/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //5 objetos (um a um)
        Atleta atleta01 = new Atleta(1, "Thiago", "Equipe1", "Pirajuí", "SP");
        Atleta atleta02 = new Atleta(2, "Gabriela", "Equipe2", "Bauru", "SP");
        Atleta atleta03 = new Atleta(3, "Marlon", "Equipe3", "Pirajuí", "SP");
        Atleta atleta04 = new Atleta(4, "Amanda", "Equipe4", "Lins", "SP");
        Atleta atleta05 = new Atleta(5, "Matheus", "Equipe5", "Cafelandia", "SP");

        //Adicionando num objeto da classe ArrayList
        ArrayList<Atleta> listaAtleta = new ArrayList<Atleta>();
        listaAtleta.add(atleta01);
        listaAtleta.add(atleta02);
        listaAtleta.add(atleta03);
        listaAtleta.add(atleta04);
        listaAtleta.add(atleta05);

        //5 objetos (usando o FOR) 
        //adicionando no mesmo objeto da classe ArrayList
        for (int i = 6; i < 11; i++) {
            Atleta objAtleta = new Atleta(i, "Atleta" + i, "Equipe" + i,
                    "Cidade do Aleta " + i, "Estado do " + i);
            listaAtleta.add(objAtleta);

        }

        //Percorrendo a lista e exibindo os dados de todos os atletas
        Atleta objAtleta = new Atleta();
        for (int i = 0; i < listaAtleta.size(); i++) {

            objAtleta = listaAtleta.get(i);

            System.out.println("ATLETA: " + objAtleta.getIdAtleta() + " - "
                    + objAtleta.getNome() + " - " + objAtleta.getEquipe() + " - "
                    + objAtleta.getCidade() + " - " + objAtleta.getEstado());
        }

        //Percorrer a lista e localizar UM atleta por ID, NOME ou EQUIPE
        Scanner entrada = new Scanner(System.in);
        int opc, idLoc;
        String nomeLoc, equipeLoc;

        System.out.println("\n\nLocalizar Atleta por:\n1-ID\n2-NOME\n3-EQUIPE");
        System.out.println("Opção: ");
        opc = entrada.nextInt();

        switch (opc) {
            case 1:
                System.out.println("\nInforme o ID do Atleta: ");
                idLoc = entrada.nextInt();
                for (int i = 0; i < listaAtleta.size(); i++) {
                    objAtleta = listaAtleta.get(i);
                    if (objAtleta.getIdAtleta() == idLoc) {
                        System.out.println("\nATLETA ENCONTRADO: " + objAtleta.getIdAtleta() + " - "
                                + objAtleta.getNome() + " - " + objAtleta.getEquipe());
                    }
                }
                break;
            case 2:
                System.out.println("\nInforme o NOME do Atleta: ");
                nomeLoc = entrada.next();
                for (int i = 0; i < listaAtleta.size(); i++) {
                    objAtleta = listaAtleta.get(i);
                    if (objAtleta.getNome().equalsIgnoreCase(nomeLoc)) {
                        System.out.println("\nATLETA ENCONTRADO: " + objAtleta.getIdAtleta() + " - "
                                + objAtleta.getNome() + " - " + objAtleta.getEquipe());
                    }
                }
                break;
            case 3:
                System.out.println("\nInforme a Equipe do Atleta: ");
                equipeLoc = entrada.next();
                for (int i = 0; i < listaAtleta.size(); i++) {
                    objAtleta = listaAtleta.get(i);
                    if (objAtleta.getEquipe().equalsIgnoreCase(equipeLoc)) {
                        System.out.println("\nATLETA ENCONTRADO: " + objAtleta.getIdAtleta() + " - "
                                + objAtleta.getNome() + " - " + objAtleta.getEquipe());
                    }
                }
                break;
            default:
                System.out.println("Opção invalida...");
                break;
        }

    }

}
