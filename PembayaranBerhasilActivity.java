package com.example.tugasuts;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class PembayaranBerhasilActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pembayaran_berhasil);

        TextView buktiPesanan = findViewById(R.id.bukti_pemesanan);

        String userId = getIntent().getStringExtra("USER_ID");
        String serverId = getIntent().getStringExtra("SERVER_ID");
        String jumlahDiamond = getIntent().getStringExtra("JUMLAH_DIAMOND");
        String email = getIntent().getStringExtra("EMAIL");

        String detail = "ID: " + userId + "\nServer: " + serverId + "\nJumlah Pesanan: " + jumlahDiamond + "\nE-mail: " + email;
        buktiPesanan.setText(detail);
    }
}

