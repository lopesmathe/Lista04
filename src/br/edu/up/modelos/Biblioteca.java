package br.edu.up.modelos;

public class Biblioteca {
    String codigo;
    String titulo;
    String[] autores;
    long isbn;
    int ano;
    
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String[] getAutores() {
        return autores;
    }
    public void setAutores(String[] autores) {
        this.autores = autores;
    }
    public long getIsbn() {
        return isbn;
    }
    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
}
