package com.example.tugasuts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class HalamanTopupActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_topup);

        EditText userIdInput = findViewById(R.id.user_id_input);
        EditText serverIdInput = findViewById(R.id.server_id_input);
        EditText jumlahDiamondInput = findViewById(R.id.jumlah_diamond_input);
        EditText PembayaranInput = findViewById(R.id.pilihan_pembayaran);
        EditText emailInput = findViewById(R.id.email_input);
        Button btnLanjutkan = findViewById(R.id.btn_lanjutkan);

        btnLanjutkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userId = userIdInput.getText().toString();
                String serverId = serverIdInput.getText().toString();
                String jumlahDiamond = jumlahDiamondInput.getText().toString();
                String PilihanPembayaran = PembayaranInput.getText().toString();
                String email = emailInput.getText().toString();

                Intent intent = new Intent(HalamanTopupActivity.this, SelesaikanPembayaranActivity.class);

                intent.putExtra("USER ID", userId);
                intent.putExtra("SERVER ID", serverId);
                intent.putExtra("JUMLAH DIAMOND", jumlahDiamond);
                intent.putExtra("PEMBAYARAN", PilihanPembayaran);
                intent.putExtra("EMAIL", email);

                startActivity(intent);
            }
        });
    }
}


