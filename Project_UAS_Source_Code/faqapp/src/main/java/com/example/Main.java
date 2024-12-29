package com.example;

import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.net.URI;

class Main {
    private static JFrame mainFrame;

    public static void main(String[] args) {
        if (mainFrame == null) {
            mainFrame = new JFrame("FAQ IT Governance");
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setSize(500, 400);
            mainFrame.setLayout(new BorderLayout());

            JLabel title = new JLabel("Panduan GMGIT 2.0", JLabel.CENTER);
            JLabel description = new JLabel("Berikut ini beberapa hal yang mungkin anda tanyakan terkait GMGIT 2.0.", JLabel.CENTER);

            String[] questions = {
                    "Bagaimana cara memulai daftar aset IT hijau?",
                    "Bagaimana mengetahui apakah perangkat lunak saya ramah lingkungan?",
                    "Apa saja yang harus dimasukkan dalam kebijakan Green IT sederhana?",
                    "Bagaimana cara memulai efisiensi tanpa anggaran besar?",
                    "Apa kriteria perangkat hemat energi?",
                    "Ke mana saya harus mengirim perangkat keras bekas?",
                    "Bagaimana mengurangi kebutuhan printer?",
                    "Bagaimana cara mengatur penjadwalan otomatis pada perangkat?",
                    "Apa langkah pertama untuk mengelola konsumsi energi?",
                    "Bagaimana menjaga konsistensi Green IT di tim?"
            };
            JComboBox<String> questionBox = new JComboBox<>(questions);

            JButton exitButton = new JButton("Exit");
            JButton nextButton = new JButton("Next");

            JPanel centerPanel = new JPanel(new GridLayout(3, 1));
            centerPanel.add(title);
            centerPanel.add(description);
            centerPanel.add(questionBox);

            JPanel bottomPanel = new JPanel(new FlowLayout());
            bottomPanel.add(nextButton);
            bottomPanel.add(exitButton);

            mainFrame.add(centerPanel, BorderLayout.CENTER);
            mainFrame.add(bottomPanel, BorderLayout.SOUTH);

            exitButton.addActionListener(e -> System.exit(0));
            nextButton.addActionListener(e -> {
                String selectedQuestion = (String) questionBox.getSelectedItem();
                FAQFrame.displayFAQ(mainFrame, selectedQuestion);
            });

            mainFrame.setVisible(true);
        } else {
            mainFrame.setVisible(true);
        }
    }
}

class FAQFrame {
    public static void displayFAQ(JFrame mainFrame, String question) {
        JFrame faqFrame = new JFrame("Frequently Asked Questions");
        faqFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        faqFrame.setSize(500, 400);
        faqFrame.setLayout(new BorderLayout());

        String answer = switch (question) {
            case "Bagaimana cara memulai daftar aset IT hijau?" -> "<html><body style='font-family:Arial; font-size:14px;'><b>Identifikasi dan Klasifikasi Aset IT Hijau</b><br>" +
                    "<br>" +
                    "Pertanyaan yang paling sering ditanya oleh masyarakat adalah <u>Bagaimana cara memulai daftar aset IT hijau?</u><br>" +
                    "<br>" +
                    "Kami akan memberikan anda solusi mengenai permasalahan ini!<br>" +
                    "<br>" +
                    "Anda dapat menggunakan template Excel atau membuat template sendiri untuk membuat sebuah tabel inventaris.<br>" +
                    "Lalu anda dapat menambahkan kolom seperti Nama Perangkat, Efesiensi Energi, dan Tanggal Pembelian. Kemudian, anda dapat<br>" +
                    "memberi tanda pada perangkat yang hemat energi dengan simbol (✔).<br>" +
                    "<br>" +
                    "Untuk melihat panduan menggunakan template Excel, Anda bisa mengunjungi link ini -> " +
                    "<a href='https://learn.microsoft.com/id-id/dynamics365/customer-insights/journeys/manage-excel-templates'>Panduan Template Excel</a> (Klik tulisan berwarna biru).<br>" +
                    "<br>" +
                    "Contohnya, Laptop Azel dengan i7 11th gen ditandai sebagai efisien karena konsumsi daya rendah (15W TDP) dan memiliki umur pakai yang panjang.</html>";
            case "Bagaimana mengetahui apakah perangkat lunak saya ramah lingkungan?" -> "<html><body style='font-family:Arial; font-size:14px;'><b>Manajemen Lisensi Perangkat Lunak</b><br>" +
                    "<br>" +
                    "Pertanyaan yang paling sering ditanya oleh masyarakat adalah <u>Bagaimana mengetahui apakah perangkat lunak saya ramah lingkungan?</u><br>" +
                    "<br>" +
                    "Kami akan memberikan anda solusi mengenai permasalahan ini!<br>" +
                    "<br>" +
                    "Anda dapat mencari informasi konsumsi daya perangkat di situs resmi dari perangkat yang anda gunakan<br>" +
                    "atau melalui review online yang kebanyakan orang melihat melalui Youtube.<br>" +
                    "<br>" +
                    "Contoh informasi mengenai daya perangkat laptop Asus dari website resmi, Anda bisa mengunjungi link ini -> " +
                    "<a href='https://www.asus.com/id/support/faq/1032726/'>Penggunaan Daya Perangkat</a> (Klik tulisan berwarna biru).<br>" +
                    "<br>" +
                    "Contoh informasi mengenai daya perangkat laptop Asus dari Youtube, Anda bisa mengunjungi link ini -> " +
                    "<a href='https://youtu.be/o4xEEoHRWEU?si=RvDYtspbSFVeygbj'>Penggunaan Daya Perangkat [Youtube]</a> (Klik tulisan berwarna biru).<br></html>";
            case "Apa saja yang harus dimasukkan dalam kebijakan Green IT sederhana?" -> "<html><body style='font-family:Arial; font-size:14px;'><b>Kebijakan dan Strategi Green IT</b><br>" +
                    "<br>" +
                    "Pertanyaan yang paling sering ditanya oleh masyarakat adalah <u>Apa saja yang harus dimasukkan dalam kebijakan Green IT sederhana?</u><br>" +
                    "<br>" +
                    "Kami akan memberikan anda solusi mengenai permasalahan ini!<br>" +
                    "<br>" +
                    "Pemakaian perangkat hemat energi dan optimalisasi perangkat keras dapat menjadi solusi untuk Anda.<br>" +
                    "Anda dapat melihat panduan penghematan energi dan optimalisasi perangkat keras yang bisa dicari di google.<br>" +
                    "<br>" +
                    "Contoh informasi mengenai panduan penghematan energi<br>" +
                    "dan optimalisasi perangkat keras, Anda bisa mengunjungi link ini -> " +
                    "<a href='https://support.microsoft.com/id-id/windows/tips-menghemat-baterai-untuk-windows-a850d64d-ee8e-c8d2-6c75-8ffe6ea3ea99'>Panduan Penghematan dan Optimalisasi</a> (Klik tulisan berwarna biru).<br></html>";
            case "Bagaimana cara memulai efisiensi tanpa anggaran besar?" -> "<html><body style='font-family:Arial; font-size:14px;'><b>Efisiensi Pusat Data</b><br>" +
                    "<br>" +
                    "Pertanyaan yang paling sering ditanya oleh masyarakat adalah <u>Bagaimana cara memulai efisiensi tanpa anggaran besar?</u><br>" +
                    "<br>" +
                    "Kami akan memberikan anda solusi mengenai permasalahan ini!<br>" +
                    "<br>" +
                    "Misalkan Anda menggunakan laptop, maka Anda dapat membuat jarak pada perangkat keras yang anda gunakan untuk efesiensi tanpa anggaran besar.<br>" +
                    "Gunakan pendingin tambahan seperti kipas dan sebagainya.<br>" +
                    "<br>" +
                    "Contoh informasi mengenai efesiensi<br>" +
                    "penggunaan tanpa anggaran besar, Anda bisa mengunjungi link ini -> " +
                    "<a href='https://www.kanakomputer.com/fan-cooler/'>Efesiensi Penggunaan</a> (Klik tulisan berwarna biru).<br></html>";
            case "Apa kriteria perangkat hemat energi?" -> "<html><body style='font-family:Arial; font-size:14px;'><b>Pengadaan IT Berkelanjutan</b><br>" +
                    "<br>" +
                    "Pertanyaan yang paling sering ditanya oleh masyarakat adalah <u>Apa kriteria perangkat hemat energi?</u><br>" +
                    "<br>" +
                    "Kami akan memberikan anda solusi mengenai permasalahan ini!<br>" +
                    "<br>" +
                    "Anda dapat memilih perangkat dengan label seperti Energy Star atau TCO Certified.<br>" +
                    "Sertifikasi TCO menjamin bahwa produk komputer yang dibeli oleh perusahaan telah memenuhi standar ekologi.<br>" +
                    "ENERGY STAR adalah program sukarela dari Badan Perlindungan Lingkungan (EPA) AS yang membantu bisnis dan individu<br>" +
                    "untuk menghemat biaya serta melindungi iklim dengan efisiensi energi yang superior.<br>" +
                    "<br>" +
                    "Untuk mencari produk dengan TCO Certified, Anda bisa mengunjungi link ini -> " +
                    "<a href='https://tcocertified.com/product-finder/'>TCO Certified Products</a> (Klik tulisan berwarna biru).<br></html>";
            case "Ke mana saya harus mengirim perangkat keras bekas?" -> "<html><body style='font-family:Arial; font-size:14px;'><b>Pengelolaan Daur Ulang</b><br>" +
                    "<br>" +
                    "Pertanyaan yang paling sering ditanya oleh masyarakat adalah <u>Ke mana saya harus mengirim perangkat keras bekas?</u><br>" +
                    "<br>" +
                    "Kami akan memberikan anda solusi mengenai permasalahan ini!<br>" +
                    "<br>" +
                    "Anda dapat menghubungi layanan daur ulang seperti <i>e-waste centers</i> atau toko elektronik lokal.<br>" +
                    "Contohnya Laptop yang sudah rusak akan dikirim ke program daur ulang di toko elektronik lokal.<br>" +
                    "<br>" +
                    "Untuk detail lebih lengkap mengenai <i>E-Waste</i> yang ada di Indonesia, Anda bisa mengunjungi link ini -> " +
                    "<a href='https://retron.id/'>RETRON E-WASTE</a> (Klik tulisan berwarna biru).<br></html>";
            case "Bagaimana mengurangi kebutuhan printer?" -> "<html><body style='font-family:Arial; font-size:14px;'><b>Pengurangan Perangkat Cetak</b><br>" +
                    "<br>" +
                    "Pertanyaan yang paling sering ditanya oleh masyarakat adalah <u>Bagaimana mengurangi kebutuhan printer?</u><br>" +
                    "<br>" +
                    "Kami akan memberikan anda solusi mengenai permasalahan ini!<br>" +
                    "<br>" +
                    "Anda dapat menetapkan kebijakan digital-first (e-signature dan dokumen online). Atur printer bersama dengan cetak duplex sebagai standar.<br>" +
                    "Contohnya Mengurangi 3 printer biasa menjadi 1 printer hemat energi.<br>" +
                    "<br>" +
                    "Untuk detail lebih lengkap mengenai printer hemat energi, Anda bisa mengunjungi link ini -> " +
                    "<a href='https://www.viva.co.id/digital/piranti/1640494-epson-luncurkan-printer-flatbed-hemat-energi'>Printer Hemat Energi</a> (Klik tulisan berwarna biru).<br></html>";
            case "Bagaimana cara mengatur penjadwalan otomatis pada perangkat?" -> "<html><body style='font-family:Arial; font-size:14px;'><b>Penjadwalan Otomatis</b><br>" +
                    "<br>" +
                    "Pertanyaan yang paling sering ditanya oleh masyarakat adalah <u>Bagaimana cara mengatur penjadwalan otomatis pada perangkat?</u><br>" +
                    "<br>" +
                    "Kami akan memberikan anda solusi mengenai permasalahan ini!<br>" +
                    "<br>" +
                    "Anda dapat mengaktifkan fitur bawaan perangkat seperti Sleep Mode dan Automatic ShutDown. Gunakan perangkat lunak pihak ketiga jika perlu.<br>" +
                    "Contohnya komputer kantor akan dimatikan secara otomatis jam 10 malam.<br>" +
                    "<br>" +
                    "Panduan lebih lengkap untuk mematikan komputer dan laptop secara otomatis, Anda bisa mengunjungi link ini -> " +
                    "<a href='https://carisinyal.com/cara-mematikan-komputer-secara-otomatis/'>Automatic ShutDown</a> (Klik tulisan berwarna biru).<br>" +
                    "<br>" +
                    "Panduan lebih lengkap untuk memasuki SleepMode komputer dan laptop secara otomatis, Anda bisa mengunjungi link ini -> " +
                    "<a href='https://support.microsoft.com/id-id/windows/cara-menyesuaikan-pengaturan-daya-dan-tidur-di-windows-26f623b5-4fcc-4194-863d-b824e5ea7679'>Automatic SleepMode</a> (Klik tulisan berwarna biru).<br></html>";
            case "Apa langkah pertama untuk mengelola konsumsi energi?" -> "<html><body style='font-family:Arial; font-size:14px;'><b>Pengelolaan Konsumsi Energi</b><br>" +
                    "<br>" +
                    "Pertanyaan yang paling sering ditanya oleh masyarakat adalah <u>Apa langkah pertama untuk mengelola konsumsi energi?</u><br>" +
                    "<br>" +
                    "Kami akan memberikan anda solusi mengenai permasalahan ini!<br>" +
                    "<br>" +
                    "Anda dapat melakukan analisis terhadap tagihan listrik. Mematikan perangkat yang tidak digunakan.<br>" +
                    "Contohnya Mematikan monitor yang tidak dipakai saat ada rapat.<br>" +
                    "<br>" +
                    "Untuk melakukan analisis tagihan listrik yang baik dan benar, Anda bisa mengunjungi link ini sebagai referensi -> " +
                    "<a href='https://sunenergy.id/cara-menghitung-biaya-listrik'>Analisis Tagihan Listrik</a> (Klik tulisan berwarna biru).<br></html>";
            case "Bagaimana menjaga konsistensi Green IT di tim?" -> "<html><body style='font-family:Arial; font-size:14px;'><b>Peningkatan Berkelanjutan</b><br>" +
                    "<br>" +
                    "Pertanyaan yang paling sering ditanya oleh masyarakat adalah <u>Bagaimana menjaga konsistensi Green IT di tim?</u><br>" +
                    "<br>" +
                    "Kami akan memberikan anda solusi mengenai permasalahan ini!<br>" +
                    "<br>" +
                    "Anda dapat mengadakan pertemuan bulanan selama 15 menit untuk meninjau progres.<br>" +
                    "Contohnya Anda dapat menambahkan ide seperti pemakaian laptop hemat energi setelah evaluasi.   <br>" +
                    "<br>" +
                    "Untuk detail lebih lengkap mengenai Peningkatan Berkelanjutan, Anda bisa mengunjungi link ini -> " +
                    "<a href='https://clickup.com/id/blog/170010/contoh-peningkatan-berkelanjutan'>Peningkatan Berkelanjutan</a> (Klik tulisan berwarna biru).<br></html>";

            default -> "Jawaban tidak ditemukan.";
        };

        JEditorPane editorPane = new JEditorPane("text/html", answer);
        editorPane.setEditable(false);
        editorPane.setOpaque(false);


        editorPane.addHyperlinkListener(e -> {
            if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                try {
                    Desktop.getDesktop().browse(new URI(e.getURL().toString()));
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Gagal membuka tautan: " + ex.getMessage());
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JScrollPane(editorPane)); // Tambahkan scroll jika teks panjang
        JOptionPane.showMessageDialog(null, panel, "Frequently Asked Question", JOptionPane.INFORMATION_MESSAGE);

        JLabel answerLabel = new JLabel("<html><body style='text-align: center;'>" + answer + "</body></html>", JLabel.CENTER);
        JButton backButton = new JButton("Back");

        faqFrame.add(answerLabel, BorderLayout.CENTER);
        faqFrame.add(backButton, BorderLayout.SOUTH);

        backButton.addActionListener(e -> {
            faqFrame.setVisible(false);
            mainFrame.setVisible(true);
        });

        faqFrame.setVisible(true);
        mainFrame.setVisible(false);
    }
}