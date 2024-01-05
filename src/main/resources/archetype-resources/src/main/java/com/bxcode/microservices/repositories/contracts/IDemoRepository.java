
package com.bxcode.microservices.repositories.contracts;

import com.bxcode.microservices.repositories.entities.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * IDemoRepository
 * <p>
 * IDemoRepository interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BXCODE APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author bxcode
 * @author bacsystem.sac@gmail.com
 * @since 28/12/2023
 */

@Repository
public interface IDemoRepository extends JpaRepository<DemoEntity,Long> {
}

