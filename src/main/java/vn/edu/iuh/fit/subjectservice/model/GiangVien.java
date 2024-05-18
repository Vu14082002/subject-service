package vn.edu.iuh.fit.subjectservice.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import vn.edu.iuh.fit.subjectservice.enums.ChucDanhEnum;

@Getter
@Setter
@Entity
@Table(name = "giangvien")
public class GiangVien {
        @Id
        private String id;
        private String hoten;
        @Enumerated(jakarta.persistence.EnumType.ORDINAL)
        private ChucDanhEnum chucDanh;
}
