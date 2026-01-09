package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }

    public Curso(String titulo, String descricao, int cargaHoraria) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            System.err.println("Erro: Título inválido!");
            return;
        }
        super.setTitulo(titulo);
    }

    @Override
    public void setDescricao(String descricao) {
        if (descricao == null || descricao.trim().isEmpty()) {
            System.err.println("Erro: Descrição inválida!");
            return;
        }
        super.setDescricao(descricao);
    }

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria <= 0) {
            System.err.println("Erro: Carga horária deve ser positiva!");
            return;
        }
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
