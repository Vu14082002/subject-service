package vn.edu.iuh.fit.subjectservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "lophocphan")
public class LopHoc {
    @Id
    private String maLopHocPhan;
    private String tenLopHocPhan;
    @ElementCollection(targetClass = String.class, fetch = FetchType.EAGER)

    @CollectionTable(name = "lophocphan_sinhvien", joinColumns = @JoinColumn(name = "lopHocPhan"))
    @Column(name = "sinhvien", nullable = false)
    private Set<String> danhSachSinhVienDangKy = new HashSet<>();
}
