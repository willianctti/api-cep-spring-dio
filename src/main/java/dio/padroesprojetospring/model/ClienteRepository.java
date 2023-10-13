package dio.padroesprojetospring.model;
import org.springframework.data.repository.CrudRepository;
import dio.padroesprojetospring.model.Endereco;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
