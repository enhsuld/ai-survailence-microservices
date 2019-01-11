package ai.svl.services.oauth2server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ai.svl.services.oauth2server.models.TcOrg;

public interface OrgRepository extends JpaRepository<TcOrg,Long> {

}
