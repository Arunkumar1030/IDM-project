package com.Project.ProjectBackend.IdmRepo;

import com.Project.ProjectBackend.entity.Idm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface IdmRepo extends JpaRepository<Idm,Integer> {
}
