package vn.edu.iuh.fit.subjectservice;

import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner() {
//        return args -> {
//            // Chuyên ngành
//            ChuyenNganh CNTT = new ChuyenNganh("CNTT", "FIT", "Chuyên ngành công nghệ thông tin");
//            ChuyenNganh KTPM = new ChuyenNganh("KTPM", "FIT", "Chuyên ngành kỹ thuật phần mềm");
//            ChuyenNganh KHMT = new ChuyenNganh("KTMT", "FIT", "Chuyên ngành kỹ thuật máy tính");
//            ChuyenNganh HTTT = new ChuyenNganh("HTTT", "FIT", "Chuyên ngành hệ thống thông tin");
//
//            CNTT = chuyenNganhRepository.save(CNTT);
//            KTPM = chuyenNganhRepository.save(KTPM);
//            KHMT = chuyenNganhRepository.save(KHMT);
//            HTTT = chuyenNganhRepository.save(HTTT);
//
//            // Môn học
//            MonHoc nhapMonTinHoc = new MonHoc("Nhập môn công nghệ thông tin", LoaiMonHocEnum.BAT_BUOC, "Giới thiệu về công nghệ thông tin");
//            MonHoc CSDL = new MonHoc("Cơ sở dữ liệu", LoaiMonHocEnum.BAT_BUOC, "SQL");
//            MonHoc OOP = new MonHoc("Lập trình hướng đối tượng", LoaiMonHocEnum.BAT_BUOC, "Java OOP");
//            MonHoc WEB = new MonHoc("Lập trình web", LoaiMonHocEnum.BAT_BUOC, "HTML, CSS, JS, Bootstrap, JQuery");
//            MonHoc HSK = new MonHoc("Lập trình hướng sự kiện", LoaiMonHocEnum.BAT_BUOC, "Java Swing, JavaFX");
//            MonHoc TKHT = new MonHoc("Thiết kế hệ thống", LoaiMonHocEnum.BAT_BUOC, "UML, ERD");
//            MonHoc PTUD = new MonHoc("Phát triển ứng dụng", LoaiMonHocEnum.BAT_BUOC, "Java, C#, Python");
//            MonHoc AI = new MonHoc("Nhập môn Trí tuệ nhân tạo", LoaiMonHocEnum.TU_CHON, "Machine Learning, Deep Learning");
//            MonHoc ML = new MonHoc("Machine Learning", LoaiMonHocEnum.TU_CHON, "Machine Learning");
//            MonHoc DSA = new MonHoc("Cấu trúc dữ liệu và giải thuật", LoaiMonHocEnum.BAT_BUOC, "DSA");
//            MonHoc OS = new MonHoc("Hệ điều hành", LoaiMonHocEnum.BAT_BUOC, "Operating Systems");
//            MonHoc CNPM = new MonHoc("Công nghệ phần mềm", LoaiMonHocEnum.BAT_BUOC, "Software Engineering");
//            MonHoc HDH = new MonHoc("Hệ điều hành", LoaiMonHocEnum.BAT_BUOC, "Operating Systems");
//            MonHoc ANM = new MonHoc("An ninh mạng", LoaiMonHocEnum.BAT_BUOC, "Network Security");
//            MonHoc TTH = new MonHoc("Toán học ứng dụng", LoaiMonHocEnum.BAT_BUOC, "Applied Mathematics");
//            MonHoc LTHDT = new MonHoc("Lập trình hệ điều hành", LoaiMonHocEnum.TU_CHON, "OS Programming");
//            MonHoc QTT = new MonHoc("Quản trị mạng", LoaiMonHocEnum.TU_CHON, "Network Management");
//            MonHoc CSDLM = new MonHoc("Cơ sở dữ liệu mở", LoaiMonHocEnum.TU_CHON, "Open Source Databases");
//            MonHoc TKPM = new MonHoc("Thiết kế phần mềm", LoaiMonHocEnum.BAT_BUOC, "Software Design");
//
//            nhapMonTinHoc = monHocRepository.save(nhapMonTinHoc);
//            CSDL = monHocRepository.save(CSDL);
//            OOP = monHocRepository.save(OOP);
//            WEB = monHocRepository.save(WEB);
//            HSK = monHocRepository.save(HSK);
//            TKHT = monHocRepository.save(TKHT);
//            PTUD = monHocRepository.save(PTUD);
//            AI = monHocRepository.save(AI);
//            ML = monHocRepository.save(ML);
//            DSA = monHocRepository.save(DSA);
//            OS = monHocRepository.save(OS);
//            CNPM = monHocRepository.save(CNPM);
//            HDH = monHocRepository.save(HDH);
//            ANM = monHocRepository.save(ANM);
//            TTH = monHocRepository.save(TTH);
//            LTHDT = monHocRepository.save(LTHDT);
//            QTT = monHocRepository.save(QTT);
//            CSDLM = monHocRepository.save(CSDLM);
//            TKPM = monHocRepository.save(TKPM);
//
//            HSK.addMonHocTruoc(OOP);
//            ML.addMonHocTruoc(AI);
//            PTUD.addMonHocTruoc(HSK, TKHT);
//            ML.addMonHocTruoc(AI);
//
//// Lưu lại các môn học sau khi cập nhật MonHocTruoc
//            monHocRepository.save(HSK);
//            monHocRepository.save(ML);
//            monHocRepository.save(PTUD);
//            monHocRepository.save(OOP);
//            monHocRepository.save(DSA);
//            monHocRepository.save(OS);
//            monHocRepository.save(CNPM);
//            monHocRepository.save(HDH);
//            monHocRepository.save(ANM);
//            monHocRepository.save(TTH);
//            monHocRepository.save(LTHDT);
//            monHocRepository.save(QTT);
//            monHocRepository.save(CSDLM);
//            monHocRepository.save(TKPM);
//
////// Add MonHoc vào ChuyenNganh
////            CNTT.addMonHoc(nhapMonTinHoc, CSDL, OOP,WEB, HSK, DSA, OS, CNPM, HDH, ANM, TTH, LTHDT, QTT, CSDLM, TKPM);
////            KTPM.addMonHoc(nhapMonTinHoc, CSDL, OOP, WEB, HSK, PTUD, DSA, OS, CNPM, HDH, ANM, TTH, LTHDT, QTT, CSDLM, TKPM);
////            KHMT.addMonHoc(nhapMonTinHoc, CSDL, OOP, WEB, AI, PTUD, ML, DSA, OS, CNPM, HDH, ANM, TTH, LTHDT, QTT, CSDLM, TKPM);
////            HTTT.addMonHoc(nhapMonTinHoc, CSDL, OOP, WEB, DSA, OS, CNPM, HDH, ANM, TTH, LTHDT, QTT, CSDLM, TKPM);
////
////// Save ChuyenNganh
////            chuyenNganhRepository.save(CNTT);
////            chuyenNganhRepository.save(KTPM);
////            chuyenNganhRepository.save(KHMT);
////            chuyenNganhRepository.save(HTTT);
//
////            Tạo lịch dk
//
////          --------------------------------------------------------------------------------------------
//            LopHoc lopHoc1 = new LopHoc("DHKTPM16A", "Đai học KTPM 16 A");
//            LopHoc lopHoc2 = new LopHoc("DHKTPM16B", "Đai học KTPM 16 B");
//            LopHoc lopHoc3 = new LopHoc("DHKTPM16C", "Đai học KTPM 16 C");
//            LopHoc lopHoc4 = new LopHoc("DHKTPM16D", "Đai học KTPM 16 D");
//
//            LopHoc lopHoc5 = new LopHoc("DHHTTH16A", "Đai học HTTT 16 A");
//            LopHoc lopHoc6 = new LopHoc("DHHTTH16B", "Đai học HTTT 16 B");
//            LopHoc lopHoc7 = new LopHoc("DHHTTH16C", "Đai học HTTT 16 C");
//
//            LopHoc lopHoc8 = new LopHoc("DHKHMT16A", "Đai học KHMT 16 A");
//            LopHoc lopHoc9 = new LopHoc("DHKHMT16B", "Đai học KHMT 16 B");
//            LopHoc lopHoc10 = new LopHoc("DHKHMT16C", "Đai học KHMT 16 C");
//
//            LopHoc lopHoc11 = new LopHoc("DHCNTT16A", "Đai học CNTT 16 A");
//            LopHoc lopHoc12 = new LopHoc("DHCNTT16B", "Đai học CNTT 16 B");
//            LopHoc lopHoc13 = new LopHoc("DHCNTT16C", "Đai học CNTT 16 C");
//
//            lopHoc1 = lopHocRepository.save(lopHoc1);
//            lopHoc2 = lopHocRepository.save(lopHoc2);
//            lopHoc3 = lopHocRepository.save(lopHoc3);
//            lopHoc4 = lopHocRepository.save(lopHoc4);
//            lopHoc5 = lopHocRepository.save(lopHoc5);
//            lopHoc6 = lopHocRepository.save(lopHoc6);
//            lopHoc7 = lopHocRepository.save(lopHoc7);
//            lopHoc8 = lopHocRepository.save(lopHoc8);
//            lopHoc9 = lopHocRepository.save(lopHoc9);
//            lopHoc10 = lopHocRepository.save(lopHoc10);
//            lopHoc11 = lopHocRepository.save(lopHoc11);
//            lopHoc12 = lopHocRepository.save(lopHoc12);
//            lopHoc13 = lopHocRepository.save(lopHoc13);
//
//            List<LopHoc> listLopHoc = Arrays.asList(lopHoc1, lopHoc2, lopHoc3, lopHoc4, lopHoc5, lopHoc6, lopHoc7, lopHoc8, lopHoc9, lopHoc10, lopHoc11, lopHoc12, lopHoc13);
//
////--------------------------------------------------------------------------------------------
//            LichDangKyHocPhan lichDangKyHocPhan = new LichDangKyHocPhan(2024, HocKyEnum.HOC_KY1);
//            double hocPhiLyThuyet = 600;
//            double hocPhiThucHanh = 1000;
//            HocPhan hocPhan1 = new HocPhan(nhapMonTinHoc, lichDangKyHocPhan, 3, 1, hocPhiLyThuyet, hocPhiThucHanh);
//            hocPhan1.addLopHocPhanChoDangKy();
//
//            HocPhan hocPhan2 = new HocPhan(CSDL , 3, 1, hocPhiLyThuyet, hocPhiThucHanh);
//            HocPhan hocPhan3 = new HocPhan(OOP, 3, 1, hocPhiLyThuyet, hocPhiThucHanh);
//            HocPhan hocPhan4 = new HocPhan(WEB , 3, 1, hocPhiLyThuyet, hocPhiThucHanh);
//            HocPhan hocPhan5 = new HocPhan(HSK, 3, 1, hocPhiLyThuyet, hocPhiThucHanh);
//            HocPhan hocPhan6 = new HocPhan(DSA, 3, 1, hocPhiLyThuyet, hocPhiThucHanh);
//            HocPhan hocPhan7 = new HocPhan(OS, 3, 1, hocPhiLyThuyet, hocPhiThucHanh);
//            HocPhan hocPhan8 = new HocPhan(CNPM, 3, 1, hocPhiLyThuyet, hocPhiThucHanh);
//            HocPhan hocPhan9 = new HocPhan(HDH, 3, 1, hocPhiLyThuyet, hocPhiThucHanh);
//            HocPhan hocPhan10 = new HocPhan(ANM, 3, 1, hocPhiLyThuyet, hocPhiThucHanh);
//            HocPhan hocPhan11 = new HocPhan(TTH, 3, 1, hocPhiLyThuyet, hocPhiThucHanh);
//            HocPhan hocPhan12 = new HocPhan(LTHDT, 3, 1, hocPhiLyThuyet, hocPhiThucHanh);
//            HocPhan hocPhan13 = new HocPhan(QTT, 3, 1, hocPhiLyThuyet, hocPhiThucHanh);
//            HocPhan hocPhan14 = new HocPhan(CSDLM, 3, 1, hocPhiLyThuyet, hocPhiThucHanh);
//            HocPhan hocPhan15 = new HocPhan(TKPM, 3, 1, hocPhiLyThuyet, hocPhiThucHanh);
//            List<HocPhan> listHocPhan = Arrays.asList(hocPhan1, hocPhan2, hocPhan3, hocPhan4, hocPhan5, hocPhan6, hocPhan7, hocPhan8, hocPhan9, hocPhan10, hocPhan11, hocPhan12, hocPhan13, hocPhan14, hocPhan15);
//
////            mooi lop hoc se co cac danh sach lop hoc phan cho dang ky
//            List<HocPhan> listHocPhanNew = addLopPhanChoDangKy(listHocPhan, listLopHoc);
//            listHocPhanNew.forEach(hocPhan -> {
//                lichDangKyHocPhan.addHocPhan(hocPhan);
//            });
//            lichDangKyHocPhanRepository.save(lichDangKyHocPhan);
//        };
//
//    }

}
