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
@Table(name = "hocphan")
public class HocPhan {

    @Id
    @ManyToOne
    @JoinColumn(name = "maMonHoc")
    private MonHoc monHoc;

    @Id
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "hocKy", referencedColumnName = "hocKy"),
            @JoinColumn(name = "namhoc", referencedColumnName = "namHoc")
    })
    private LichDangKyHocPhan lichDangKyHocPhan;
    private int soTinChiLyThuyet;
    private int soTinChiThucHanh;
    private Double hocPhiLyThuyet;
    private Double hocPhiThucHanh;

    @OneToMany(mappedBy = "hocPhan")
    private Set<LopHocPhanChoDangKy> danhSachLopHocPhanChoDangKy = new HashSet<>();
}
