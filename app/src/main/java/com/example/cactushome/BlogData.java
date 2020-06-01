package com.example.cactushome;

import java.util.ArrayList;

public class BlogData {
    private static String[] itemNames = {
            "Cara Budidaya Ayam Kampung dengan Modal Kecil",
            "Jenis-jenis Penyakit Khas Sapi Bali",
            "Cara Cerdas Memilih Telur Tetas Bebek",
            "Tiga Tipe Peternak",
            "Jenis-jenis Kambing Perah Unggul",
            "Cara Ternak Jangkrik yang Efektif",
            "Cara Memilih Bibit Sapi yang Baik dan Benar",
            "Manfaat Telur Ayam Kampung, Apa bedanya dengan telur biasa?",
            "Apa manfaat beternak domba?",
            "Pentingnya Memahami Kandungan Pakan Sapi yang Diberikan"
    };

    private static String[] itemDetails = {
            "Baca Selengkapnya >>",
            "Baca Selengkapnya >>",
            "Baca Selengkapnya >>",
            "Baca Selengkapnya >>",
            "Baca Selengkapnya >>",
            "Baca Selengkapnya >>",
            "Baca Selengkapnya >>",
            "Baca Selengkapnya >>",
            "Baca Selengkapnya >>",
            "Baca Selengkapnya >>"
    };

    private static int[] itemImages = {
            R.drawable.ayam,
            R.drawable.sapi,
            R.drawable.tb2,
            R.drawable.pet3,
            R.drawable.etawa,
            R.drawable.j1,
            R.drawable.sapi,
            R.drawable.t4,
            R.drawable.domba,
            R.drawable.sapi1
    };

    static ArrayList<Blog> getListData() {
        ArrayList<Blog> list = new ArrayList<>();
        for (int position = 0; position < itemNames.length; position++) {
            Blog item = new Blog();
            item.setName(itemNames[position]);
            item.setDetail(itemDetails[position]);
            item.setPhoto(itemImages[position]);
            list.add(item);
        }
        return list;
    }
}
