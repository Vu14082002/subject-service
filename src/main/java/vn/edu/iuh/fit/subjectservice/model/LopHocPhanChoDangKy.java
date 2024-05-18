package vn.edu.iuh.fit.subjectservice.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import vn.edu.iuh.fit.subjectservice.converters.TrangThaiHocPhanConverter;
import vn.edu.iuh.fit.subjectservice.enums.TrangThaiHocPhanEnum;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "lophochocphan")
@Getter
@Setter
public class LopHocPhanChoDangKy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maLopHocPhan;

    @ManyToOne
    private LopHoc lopHocDuKien;

    @ManyToOne
    private HocPhan hocPhan;

    private int soLuongSinhVienToiDa;

    @Convert(converter = TrangThaiHocPhanConverter.class)
    private TrangThaiHocPhanEnum trangThaiHocPhan;

    @OneToMany(mappedBy = "lopHocPhan")
    private Set<ChiTietLopHocPhan> danhSachChiTietLopHocPhan = new HashSet<>();
}
