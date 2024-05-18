package vn.edu.iuh.fit.subjectservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vn.edu.iuh.fit.subjectservice.converters.HocKyEnumConverter;
import vn.edu.iuh.fit.subjectservice.enums.HocKyEnum;

import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "lichDangKyHocPhan")
public class LichDangKyHocPhan {
    @Id
    private int namHoc;
    @Id
    @Convert(converter = HocKyEnumConverter.class)
    private HocKyEnum hocKy;

    @OneToMany(mappedBy = "lichDangKyHocPhan")
    private Set<HocPhan> danhSachHocPhanChoDangKy;
}
