package vn.edu.iuh.fit.subjectservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import vn.edu.iuh.fit.subjectservice.converters.TrangThaiDangKyEnumConverter;
import vn.edu.iuh.fit.subjectservice.enums.TrangThaiDangKyEnum;

import java.time.LocalDate;

@Entity
@Table(name = "sinhviendangkylop")
@Getter
@Setter
public class SinhVienLopHocPhan {

    @Id
    @ManyToOne
    @JoinColumn(name = "mssv")
    private SinhVien maSinhVien;

    @Id
    @ManyToOne
    @JoinColumn(name = "maLopHocPhan")
    private LopHocPhanChoDangKy maLopHocPhan;

    private LocalDate ngayDangKy;

    @Convert(converter = TrangThaiDangKyEnumConverter.class)
    private TrangThaiDangKyEnum trangThaiDangKy;
}
