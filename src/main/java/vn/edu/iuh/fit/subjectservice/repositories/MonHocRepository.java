package vn.edu.iuh.fit.subjectservice.repositories;

public interface MonHocRepository extends org.springframework.data.jpa.repository.JpaRepository<vn.edu.iuh.fit.subjectservice.model.MonHoc, java.lang.Integer> ,org.springframework.data.jpa.repository.JpaSpecificationExecutor<vn.edu.iuh.fit.subjectservice.model.MonHoc> {
  }