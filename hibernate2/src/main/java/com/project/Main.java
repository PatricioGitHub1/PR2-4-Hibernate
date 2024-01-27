package com.project;

import java.io.File;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String basePath = System.getProperty("user.dir") + "/data/";

        // Crear la carpeta 'data' si no existeix
        File dir = new File(basePath);
        if (!dir.exists()){
            if(!dir.mkdirs()) {
                System.out.println("Error en la creació de la carpeta 'data'");
            }
        }

        Manager.createSessionFactory();

        // Afegir llibres

        Llibre lib00 = Manager.addLlibre("LL00B0", "Editorial 0");
        Llibre lib01 = Manager.addLlibre("LL01B0", "Editorial 1");
        Llibre lib02 = Manager.addLlibre("LL02B0", "Editorial 2");
        Llibre lib03 = Manager.addLlibre("LL03B0", "Editorial 3");
        Llibre lib04 = Manager.addLlibre("LL04B0", "Editorial 4");


        Llibre lib05 = Manager.addLlibre("LL00B1", "Editorial 0");
        Llibre lib06 = Manager.addLlibre("LL01B1", "Editorial 1");
        Llibre lib07 = Manager.addLlibre("LL02B1", "Editorial 2");
        Llibre lib08 = Manager.addLlibre("LL03B1", "Editorial 3");
        Llibre lib09 = Manager.addLlibre("LL04B1", "Editorial 4");


        Llibre lib10 = Manager.addLlibre("LL00B2", "Editorial 0");
        Llibre lib11 = Manager.addLlibre("LL01B2", "Editorial 1");
        Llibre lib12 = Manager.addLlibre("LL02B2", "Editorial 2");
        Llibre lib13 = Manager.addLlibre("LL03B2", "Editorial 3");
        Llibre lib14 = Manager.addLlibre("LL04B2", "Editorial 4");

        // Afegir biblioteques

        Biblioteca bib0 = Manager.addBiblioteca("Biblio 0", "Ciutat 0");
        Set<Llibre> llibresBib0 = new HashSet<Llibre>();
        llibresBib0.add(lib00);
        llibresBib0.add(lib01);
        llibresBib0.add(lib02);
        llibresBib0.add(lib03);
        llibresBib0.add(lib04);
        Manager.updateBiblioteca(bib0.getBibliotecaId(), 
            bib0.getNom(), bib0.getCiutat(), llibresBib0);


        Biblioteca bib1 = Manager.addBiblioteca("Biblio 1", "Ciutat 1");
        Set<Llibre> llibresBib1 = new HashSet<Llibre>();
        llibresBib1.add(lib05);
        llibresBib1.add(lib06);
        llibresBib1.add(lib07);
        llibresBib1.add(lib08);
        llibresBib1.add(lib09);
        Manager.updateBiblioteca(bib1.getBibliotecaId(), 
            bib1.getNom(), bib1.getCiutat(), llibresBib1);


        Biblioteca bib2 = Manager.addBiblioteca("Biblio 2", "Ciutat 2");
        Set<Llibre> llibresBib2 = new HashSet<Llibre>();
        llibresBib2.add(lib10);
        llibresBib2.add(lib11);
        llibresBib2.add(lib12);
        llibresBib2.add(lib13);
        llibresBib2.add(lib14);
        Manager.updateBiblioteca(bib2.getBibliotecaId(), 
            bib2.getNom(), bib2.getCiutat(), llibresBib2);


        // Afegir persones

        Persona per0 = Manager.addPersona("000000A", "Persona 0", "+34 000 00 00 00");
        Set<Llibre> llibresPer0 = new HashSet<Llibre>();
        llibresPer0.add(lib00);
        llibresPer0.add(lib01);
        llibresPer0.add(lib02);
        Manager.updatePersona(per0.getPersonaId(), 
            per0.getDni(), per0.getNom(), per0.getTelefon(), llibresPer0);


        Persona per1 = Manager.addPersona("000001B", "Persona 1", "+34 000 00 00 01");
        Set<Llibre> llibresPer1 = new HashSet<Llibre>();
        llibresPer1.add(lib05);
        llibresPer1.add(lib06);
        llibresPer1.add(lib07);
        Manager.updatePersona(per1.getPersonaId(), 
            per1.getDni(), per1.getNom(), per1.getTelefon(), llibresPer1);


        Persona per2 = Manager.addPersona("000002C", "Persona 2", "+34 000 00 00 02");
        Set<Llibre> llibresPer2 = new HashSet<Llibre>();
        llibresPer2.add(lib03);
        llibresPer2.add(lib04);
        Manager.updatePersona(per2.getPersonaId(), 
            per2.getDni(), per2.getNom(), per2.getTelefon(), llibresPer2);


        Persona per3 = Manager.addPersona("000003D", "Persona 3", "+34 000 00 00 03");
        Set<Llibre> llibresPer3 = new HashSet<Llibre>();
        llibresPer3.add(lib08);
        llibresPer3.add(lib09);
        Manager.updatePersona(per3.getPersonaId(), 
            per3.getDni(), per3.getNom(), per3.getTelefon(), llibresPer3);


        Persona per4 = Manager.addPersona("000004E", "Persona 4", "+34 000 00 00 04");
        Set<Llibre> llibresPer4 = new HashSet<Llibre>();
        llibresPer4.add(lib10);
        llibresPer4.add(lib11);
        Manager.updatePersona(per4.getPersonaId(), 
            per4.getDni(), per4.getNom(), per4.getTelefon(), llibresPer4);


        Persona per5 = Manager.addPersona("000005F", "Persona 5", "+34 000 00 00 05");
        Set<Llibre> llibresPer5 = new HashSet<Llibre>();
        llibresPer5.add(lib12);
        Manager.updatePersona(per5.getPersonaId(), 
            per5.getDni(), per5.getNom(), per5.getTelefon(), llibresPer5);


        Persona per6 = Manager.addPersona("000006G", "Persona 6", "+34 000 00 00 06");
        Set<Llibre> llibresPer6 = new HashSet<Llibre>();
        llibresPer6.add(lib13);
        Manager.updatePersona(per6.getPersonaId(), 
            per6.getDni(), per6.getNom(), per6.getTelefon(), llibresPer6);


        Persona per7 = Manager.addPersona("000007H", "Persona 7", "+34 000 00 00 07");
        Set<Llibre> llibresPer7 = new HashSet<Llibre>();
        llibresPer7.add(lib14);  
        Manager.updatePersona(per7.getPersonaId(), 
            per7.getDni(), per7.getNom(), per7.getTelefon(), llibresPer7);


        Manager.addPersona("000008I", "Persona 8", "+34 000 00 00 08");
        Manager.addPersona("000009J", "Persona 9", "+34 000 00 00 09");

        // Afegir autors

        Autor aut0 = Manager.addAutor("Autor 0");
        Set<Llibre> llibresAut0 = new HashSet<Llibre>();
        llibresAut0.add(lib00);
        llibresAut0.add(lib05);
        llibresAut0.add(lib10);
        Manager.updateAutor(aut0.getAutorId(), aut0.getNom(), llibresAut0);


        Autor aut1 = Manager.addAutor("Autor 1");
        Set<Llibre> llibresAut1 = new HashSet<Llibre>();
        llibresAut1.add(lib01);
        llibresAut1.add(lib06);
        llibresAut1.add(lib11);
        Manager.updateAutor(aut1.getAutorId(), aut1.getNom(), llibresAut1);


        Autor aut2 = Manager.addAutor("Autor 2");
        Set<Llibre> llibresAut2 = new HashSet<Llibre>();
        llibresAut2.add(lib02);
        llibresAut2.add(lib07);
        llibresAut2.add(lib12);
        Manager.updateAutor(aut2.getAutorId(), aut2.getNom(), llibresAut2);


        Autor aut3 = Manager.addAutor("Autor 3");
        Set<Llibre> llibresAut3 = new HashSet<Llibre>();
        llibresAut3.add(lib03);
        llibresAut3.add(lib08);
        llibresAut3.add(lib13);
        Manager.updateAutor(aut3.getAutorId(), aut3.getNom(), llibresAut3);


        Autor aut4 = Manager.addAutor("Autor 4");
        Set<Llibre> llibresAut4 = new HashSet<Llibre>();
        llibresAut4.add(lib04);
        llibresAut4.add(lib09);
        llibresAut4.add(lib14);
        Manager.updateAutor(aut4.getAutorId(), aut4.getNom(), llibresAut4);

        // LListar dades

        @SuppressWarnings("unchecked")
        Collection<Llibre> colLlibres = (Collection<Llibre>) Manager.listCollection(Llibre.class, "");
        System.out.println(Manager.collectionToString(Llibre.class, colLlibres));

        @SuppressWarnings("unchecked")
        Collection<Biblioteca> colBiblios = (Collection<Biblioteca>) Manager.listCollection(Biblioteca.class, "");
        System.out.println(Manager.collectionToString(Biblioteca.class, colBiblios));


        @SuppressWarnings("unchecked")
        Collection<Persona> colPersones = (Collection<Persona>) Manager.listCollection(Persona.class, "");
        System.out.println(Manager.collectionToString(Persona.class, colPersones));


        @SuppressWarnings("unchecked")
        Collection<Autor> colAutors = (Collection<Autor>) Manager.listCollection(Autor.class, "");
        System.out.println(Manager.collectionToString(Autor.class, colAutors));


        Manager.close();

    }
}