package ai.svl.services.oauth2server.repositories;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import ai.svl.services.oauth2server.models.TcUser;

/**
 * LutUser repository for CRUD operations.
 */
public interface UserRepository extends CrudRepository<TcUser,Long> {

    @Query("SELECT t FROM TcUser t where t.userNm = ?1")
    TcUser findByUsername(String username);
}
