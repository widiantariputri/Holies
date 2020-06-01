package com.example.cactushome;

import java.util.ArrayList;

public class BlogData {
    private static String[] itemNames = {
            "Apa Bedanya Kaktus dan Sukulen?",
            "5 Jenis Kaktus Ini Masih Jarang Banget Dikenal Orang",
            "Begini Cara Merawat Sukulen yang Benar",
            "Manfaat Kaktus Dalam Ruangan",
            "Desain Unik Tanaman Sukulen Untuk Mempercantik Taman",
            "Tips Memilih Bunga Kaktus Yang Sehat",
            "6 Langkah Mudah Menanam Kaktus Di Pot Mungil",
            "Tips Merawat Tanaman Sukulen",
            "Tanaman Sukulen, Cantik di Tanah Kering",
            "Kaktus, Tanaman Abadi yang Dilindungi"
    };

    private static String[] itemDetails = {
            "Kalau bicara soal tanaman, biasanya yang terbayang di kepala adalah berkebun di lahan yang luas atau bercocok tanam di sawah. Tetapi bagi yang tinggal di perkotaan, jumlah lahan seringkali menjadi hambatan. Oleh karena itu, untuk menyiasatinya, warga perkotaan biasanya menggunakan alternatif kebun vertikal.",
            "Geliat tanaman hias di Indonesia ternyata begitu tinggi, tak terkecuali adalah kaktus. Siapa sih yang nggak kenal dengan jenis tanaman satu ini. Tanaman yang terkenal karena daya tahan hidupnya yang tinggi di berbagai kondisi ini banyak banget digandrungi oleh berbagai kalangan lo. ",
            "Sukulen merupakan salah satu jenis tanaman hias yang tergolong mudah perawatannya. Tanaman yang dikenal dari bentuk daunnya yang tebal ini mampu menyimpan air sehingga tidak mudah layu seperti daun pada umumnya. Ada banyak jenis bentuk dan warna sukulen. Selain abu-abu dan hijau, ada pula yang berwarna hitam, merah, dan kuning",
            "Kaktus merupakan tanaman kaya manfaat dengan perawatan rendah serta terlihat unik sebagai tanaman hias. Banyak manfaat dari penempatan kaktus sebagai indoor plant. Kaktus dalam ruangan memberi warna tersendiri. Walaupun berduri namun memiliki bunga yang indah",
            "Ada banyak bentuk sukulen, diantaranya yang berbentuk bunga, daun, seperti batu dan seperti biji. Namun tidak semua sukulen bisa tahan hidup di tempat yang banyak terkena sinar matahari. Sukulen yang berwarna cerah lah yang cenderung dapat hidup di tempat yang panas.",
            "Cara mudah mendapatkan kaktus adalah dengan cara membeli di nursery atau penjual kaktus. Disana terdapat berbagai jenis kaktus yang ditawarkan . Masing-masing kaktus mempunyai ukuran dan harga yang berbeda. Sering kali pembeli kesulitan dalam memilih kaktus yang berkualitas.",
            "Sekarang tanaman kaktus mungil sudah sering dijumpa di toko-toko tanaman. Biasanya, para penjual tanaman kaktus menanamnya pada pot dengan komposisi satu kaktus satu pot. Jika area rumah Anda terbatas, Anda bisa mencoba menanam sejumlah kaktus dalam satu pot.",
            "Salah satu dekorasi yang akhir-akhir ini cukup populer adalah tanaman sukulen. Tidak sedikit orang berpendapat jika tanaman yang satu ini sangat mudah dirawat. Yang mereka ketahui hanyalah tanaman ini hanya perlu disiram sesekali dan pencahayaan harus pas. ",
            "Nama sukulen berasal dari bahasa Latin, succos, yang berarti juice. Kaktus dan lidah buaya termasuk dalam tanaman sukulen. Sesuai namanya, tanaman ini sanggup menyimpan makanan atau air di dalam tubuhnya sebagai cadangan.",
            "Tanaman yang masih famili Cactaceae ini mencakup lebih dari 2.000 jenis tumbuhan aneh yang ditemukan di Amerika Utara dan sebagian kecil ditemukan di Amerika Selatan, Afrika, dan Srilanka. Kaktus menyimpan air dalam batangnya yang tebal dan berbentuk aneh."
    };

    private static int[] itemImages = {
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
            R.drawable.j
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
