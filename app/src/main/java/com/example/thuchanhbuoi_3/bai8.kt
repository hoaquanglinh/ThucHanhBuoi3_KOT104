package com.example.thuchanhbuoi_3

import com.example.thuchanhbuoi_3.modal_bai7.CBGV
import com.example.thuchanhbuoi_3.modal_bai8.TheMuon

fun main() {
    var listThe = mutableListOf<TheMuon>()

    val tm1 = TheMuon("Nguyen Van Linh", 20, "MD18302", "PM01", 10, 30, "Sach01")
    val tm2 = TheMuon("Hoa Quang Phuc", 22, "MD18309", "PM02", 5, 29, "Sach02")

    listThe.add(tm1)
    listThe.add(tm2)

    do {
        println("------Chuc nang-------")
        println("1. Xem danh sach the muon")
        println("2. Them the muon")
        println("3. Xoa the muon")

        print("Moi chon chuc nang: ")
        var s = readLine()!!.toInt()

        when (s) {
            1 -> {
                for ( i in listThe){
                    println(i.getThongTin())
                }
            }
            2 -> addTheMuon(listThe)
            3 -> deleteTheMuon(listThe)
        }

        print("Ban co muon tiep tuc khong? (y/n): ")
        var check = readLine()
        if (check.equals("n"))
            break
    } while (true)
}


fun addTheMuon(listThe: MutableList<TheMuon>) {
    print("Nhap ho ten sinh vien: ")
    var hoten = readLine()
    print("Nhap tuoi: ")
    var tuoi = readLine()!!.toInt()
    print("Nhap lop: ")
    var lop = readLine()
    print("Nhap ma the muon: ")
    var matm = readLine()
    print("Ngay muon: ")
    var ngaymuon = readLine()!!.toInt()
    print("Han tra: ")
    var hantra = readLine()!!.toInt()
    print("So hieu sach: ")
    var sohieusach = readLine()

    val tm = TheMuon(hoten!!, tuoi, lop!!, matm!!, ngaymuon, hantra, sohieusach!!)

    listThe.add(tm)

    for ( i in listThe){
        println(i.getThongTin())
    }
}

fun deleteTheMuon(listThe: MutableList<TheMuon>) {
    print("Nhap ma the muon can xoa: ")
    var matm = readLine()
    var check = false
    for (tm in listThe) {
        if (tm.mapm.equals(matm)) {
            listThe.remove(tm)
            check = true
            break
        }
    }
    if (check == false)
        println("Giao vien khong ton tai")
    for ( i in listThe){
        println(i.getThongTin())
    }
}