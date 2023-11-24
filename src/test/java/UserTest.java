
import org.example.Client;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class UsuarioClienteTest {

    @Test
    void deveRetornarAdmin() {
        Client user = new Client();
        user.setAdmin(true);
        assertEquals("Usuário é admin, porem em pagina de cliente", user.verificarStatus());
    }

    @Test
    void deveRetornarSemPermissao() {
        Client user = new Client();
        user.setAdmin(false);
        assertEquals("Usuário comum", user.verificarStatus());
    }

    @Test
    void deveRetornarInformacoes() {
        Client user = new Client();
        user.setNome("Cleitinho");
        user.setSenha("123");
        user.setAdmin(false);
        assertEquals("Usuario{nome = 'Cleitinho', status = Usuário comum}", user.getInfo());
    }

}