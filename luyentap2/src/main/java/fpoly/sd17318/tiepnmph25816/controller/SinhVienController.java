package fpoly.sd17318.tiepnmph25816.controller;

import fpoly.sd17318.tiepnmph25816.entity.SinhVien;
import fpoly.sd17318.tiepnmph25816.service.SinhVienService;
import fpoly.sd17318.tiepnmph25816.service.impl.SinhVienServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SinhVienController {

    private SinhVienService sinhVienService = new SinhVienServiceImpl();
    private List<SinhVien> listSinhVien = new ArrayList<>();

    @GetMapping("/sinh-vien/hien-thi")
    public String hienThi(Model model) {
        listSinhVien = sinhVienService.getAll();
        model.addAttribute("listSinhVien", listSinhVien);
        return "hien-thi";
    }

    @GetMapping("/sinh-vien/detail/{id}")
    public String detail(Model model, @PathVariable("id") int id) {
        SinhVien sv = sinhVienService.detail(listSinhVien, id);
        model.addAttribute("sv", sv);
        return "detail";
    }

    @GetMapping("/sinh-vien/delete/{id}")
    public String delete(Model model, @PathVariable("id") int id) {
        sinhVienService.delete(listSinhVien, id);
        model.addAttribute("listSinhVien", listSinhVien);
        return "hien-thi";
    }

    @GetMapping("/sinh-vien/search")
    public String search(Model model, @RequestParam("ten") String ten) {
        listSinhVien = sinhVienService.search(listSinhVien, ten);
        model.addAttribute("listSinhVien", listSinhVien);
        return "hien-thi";
    }

    @GetMapping("/sinh-vien/sap-xep")
    public String search(Model model) {
        sinhVienService.sapXep(listSinhVien);
        model.addAttribute("listSinhVien", listSinhVien);
        return "hien-thi";
    }

    @GetMapping("/sinh-vien/sinh-vien-nam")
    public String sinhVienNam(Model model) {
        listSinhVien = sinhVienService.sinhVienNam(listSinhVien, true);
        model.addAttribute("listSinhVien", listSinhVien);
        return "hien-thi";
    }

    @GetMapping("/sinh-vien/view-add")
    public String viewAdd() {
        return "add";
    }


    @PostMapping("/sinh-vien/add")
    public String add(@RequestParam("id") int id,
                      @RequestParam("ten") String ten,
                      @RequestParam("tuoi") int tuoi,
                      @RequestParam("diaChi") String diaChi,
                      @RequestParam("gioiTinh") boolean gioiTinh
    ) {
        SinhVien sinhVien = SinhVien.builder()
                .id(id)
                .ten(ten)
                .tuoi(tuoi)
                .diaChi(diaChi)
                .gioiTinh(gioiTinh)
                .build();
        sinhVienService.add(sinhVien);
        return "redirect:/sinh-vien/hien-thi";
    }

    @GetMapping("/sinh-vien/view-update/{id}")
    public String viewUpdate(Model model, @PathVariable("id") int id) {
        SinhVien sv = sinhVienService.update(listSinhVien, id);
        model.addAttribute("sv", sv);
        return "update";
    }

    @PostMapping("/sinh-vien/update")
    public String update(@RequestParam("id") int id,
                         @RequestParam("ten") String ten,
                         @RequestParam("tuoi") int tuoi,
                         @RequestParam("diaChi") String diaChi,
                         @RequestParam("gioiTinh") boolean gioiTinh
    ) {
        SinhVien sv = sinhVienService.update(listSinhVien, id);
        sv.setTen(ten);
        sv.setTuoi(tuoi);
        sv.setDiaChi(diaChi);
        sv.setGioiTinh(gioiTinh);
        listSinhVien.set(sinhVienService.viTri(listSinhVien, sv.getId()), sv);
        return "redirect:/sinh-vien/hien-thi";
    }

}
