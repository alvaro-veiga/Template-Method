package org.example;

public class Admin extends User {
    public String verificarStatus() {
        if (this.isAdmin() == true) {
            return "Admin";
        }
        else {
            return "Sem permissão de admin";
        }
    }

    @Override
    public String getTipo() {
        return "Usuário Admin";
    }

}
