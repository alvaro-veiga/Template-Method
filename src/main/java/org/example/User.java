package org.example;

public abstract class User {
    private String nome;
    private String senha;
    private boolean admin;

    public abstract String verificarStatus();

    public boolean isAdmin() {
        return admin;
    }

    public User setAdmin(boolean admin) {
        this.admin = admin;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public User setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getSenha() {
        return senha;
    }

    public User setSenha(String senha) {
        this.senha = senha;
        return this;
    }

    public String getTipo() {
        return "Usuario";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "nome = '" + this.nome + '\'' +
                ", status = " + this.verificarStatus() +
                '}';
    }
}
