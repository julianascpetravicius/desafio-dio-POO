import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("descrição do curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("deescrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso2);
        System.out.println(curso1);
        System.out.println(mentoria );

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJuliana = new Dev();
        devJuliana.setNome("Juliana");
        devJuliana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devJuliana.getConteudosInscritos());
        devJuliana.progredir();
        devJuliana.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devJuliana.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devJuliana.getConteudosConcluidos());
        System.out.println("XP" + devJuliana.calcularTotalXp());

        System.out.println("-------");

        Dev devRafa = new Dev();
        devRafa.setNome("Rafa");
        devRafa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devRafa.getConteudosInscritos());
        devRafa.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devRafa.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devRafa.getConteudosConcluidos());
        System.out.println("XP" + devRafa.calcularTotalXp());




    }
}