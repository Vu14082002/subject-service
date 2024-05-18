package vn.edu.iuh.fit.subjectservice.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vn.edu.iuh.fit.subjectservice.converters.LoaiMonHocConverter;
import vn.edu.iuh.fit.subjectservice.enums.LoaiMonHocEnum;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "monhoc")
public class MonHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maMonHoc;

    private String tenMonHoc;

    @OneToMany(mappedBy = "maMonHoc")
    private Set<MonHoc> monHocTruoc = new HashSet<>();

    @OneToMany(mappedBy = "maMonHoc")
    private Set<MonHoc> danhSachMonHocPhuThuoc;

    @Convert(converter = LoaiMonHocConverter.class)
    private LoaiMonHocEnum loaiMonHoc;

    private String mota;

    @ElementCollection
    @CollectionTable(name = "monhoc_chuyennganh", joinColumns = @JoinColumn(name = "chuyennganh_id"))
    private Set<String> chuyenNganh;

}
