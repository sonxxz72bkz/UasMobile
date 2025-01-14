package com.example.tugasuts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SelesaikanPembayaranActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selesaikan_pembayaran_anda);

        TextView detailPesanan = findViewById(R.id.detail_pemesanan);
        Button btnKonfirmasiPembayaran = findViewById(R.id.konfirmasi_pembayaran); // Tambahkan ID tombol dari XML

        String userId = getIntent().getStringExtra("USER_ID");
        String serverId = getIntent().getStringExtra("SERVER_ID");
        String jumlahDiamond = getIntent().getStringExtra("JUMLAH_DIAMOND");
        String email = getIntent().getStringExtra("EMAIL");

        String detail = "ID: " + userId + "\nServer: " + serverId + "\nJumlah Pesanan: " + jumlahDiamond + "\nE-mail: " + email;
        detailPesanan.setText(detail);

        btnKonfirmasiPembayaran.setOnClickListener(v -> {
            Intent intent = new Intent(SelesaikanPembayaranActivity.this, PembayaranBerhasilActivity.class);

            intent.putExtra("USER_ID", userId);
            intent.putExtra("SERVER_ID", serverId);
            intent.putExtra("JUMLAH_DIAMOND", jumlahDiamond);
            intent.putExtra("EMAIL", email);

            startActivity(intent);
        });
    }
}


