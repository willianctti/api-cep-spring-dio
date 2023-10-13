package dio.padroesprojetospring.service.impl;
import dio.padroesprojetospring.model.Cliente;
import dio.padroesprojetospring.model.Endereco;

public interface ClienteService {
    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
