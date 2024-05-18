package vn.edu.iuh.fit.subjectservice.repositories;

public interface LichHocRepository extends org.springframework.data.jpa.repository.JpaRepository<vn.edu.iuh.fit.subjectservice.model.LichHoc, vn.edu.iuh.fit.subjectservice.keys.LichHocKey> ,org.springframework.data.jpa.repository.JpaSpecificationExecutor<vn.edu.iuh.fit.subjectservice.model.LichHoc> {
  }