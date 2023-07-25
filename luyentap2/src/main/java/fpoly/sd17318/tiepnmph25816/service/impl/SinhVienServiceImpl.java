package fpoly.sd17318.tiepnmph25816.service.impl;

import fpoly.sd17318.tiepnmph25816.entity.SinhVien;
import fpoly.sd17318.tiepnmph25816.service.SinhVienService;

import java.util.ArrayList;
import java.util.List;

public class SinhVienServiceImpl implements SinhVienService {

    private List<SinhVien> listSinhVien = new ArrayList<>();

    public SinhVienServiceImpl() {
        listSinhVien.add(new SinhVien(1, "Cao Van Bac", 12, "Thai Binh", true));
        listSinhVien.add(new SinhVien(2, "Chu Van Tram", 32, "Thai Binh", false));
        listSinhVien.add(new SinhVien(3, "Nguyen Thanh Tung", 18, "Thai Binh", true));
        listSinhVien.add(new SinhVien(4, "Hoang Hai Yen", 39, "Thai Binh", false));
    }

    @Override
    public List<SinhVien> getAll() {
        return listSinhVien;
    }

    @Override
    public List<SinhVien> search(List<SinhVien> list, String ten) {
        List<SinhVien> listSinhVien = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTen().equalsIgnoreCase(ten)) {
                listSinhVien.add(list.get(i));
            }
        }
        return listSinhVien;
    }

    @Override
    public List<SinhVien> sinhVienNam(List<SinhVien> list, boolean gioiTinh) {
        List<SinhVien> listSinhVien = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isGioiTinh() == gioiTinh) {
                listSinhVien.add(list.get(i));
            }
        }
        return listSinhVien;
    }

    @Override
    public void sapXep(List<SinhVien> list) {
        list.sort((o1, o2) -> o2.getTuoi() - o1.getTuoi());
    }

    @Override
    public int viTri(List<SinhVien> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void add(SinhVien sinhVien) {
        listSinhVien.add(sinhVien);
    }

    @Override
    public SinhVien detail(List<SinhVien> list, int id) {
        int viTri = viTri(list, id);
        return listSinhVien.get(viTri);
    }

    @Override
    public SinhVien update(List<SinhVien> list, int id) {
        int viTri = viTri(list, id);
        return listSinhVien.get(viTri);
    }

    @Override
    public void delete(List<SinhVien> list, int id) {
        int viTri = viTri(list, id);
        listSinhVien.remove(viTri);
    }
}
