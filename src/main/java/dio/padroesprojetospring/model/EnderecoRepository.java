package dio.padroesprojetospring.model;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import dio.padroesprojetospring.model.Endereco;
@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}
