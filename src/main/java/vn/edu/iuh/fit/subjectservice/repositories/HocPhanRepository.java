package vn.edu.iuh.fit.subjectservice.repositories;

public interface HocPhanRepository extends org.springframework.data.jpa.repository.JpaRepository<vn.edu.iuh.fit.subjectservice.model.HocPhan, vn.edu.iuh.fit.subjectservice.keys.HocPhanKey> ,org.springframework.data.jpa.repository.JpaSpecificationExecutor<vn.edu.iuh.fit.subjectservice.model.HocPhan> {
  }