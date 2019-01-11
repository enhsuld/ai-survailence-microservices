package ai.svl.services.oauth2server.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import ai.svl.services.oauth2server.models.TcRole;

/**
 * LutUser repository for CRUD operations.
 */
public interface RoleRepository extends JpaRepository<TcRole,Long> {

}
