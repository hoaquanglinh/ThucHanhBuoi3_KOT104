package com.example.thuchanhbuoi_3.modal_bai8

class TheMuon(
    hoten: String, tuoi: Int, lop: String,
    var mapm: String, var ngaymuon: Int, var hantra: Int, var sohieusach: String
) : SinhVien(hoten, tuoi, lop) {

    override fun getThongTin() : String {
        return  super.getThongTin() + ", mapm: $mapm,  ngay muon: $ngaymuon, hantra: $hantra, sohieusach: $sohieusach"
    }
}
