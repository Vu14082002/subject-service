package vn.edu.iuh.fit.subjectservice.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "sinhvien")
public class SinhVien {

    @Id
    private Integer mssv;
    private String hoTen;
    private String lopDanhNghia;
    private String chuyenNganh;

    @ManyToMany
    private Set<HocPhan> danhSachMonHocDangKy;
}
