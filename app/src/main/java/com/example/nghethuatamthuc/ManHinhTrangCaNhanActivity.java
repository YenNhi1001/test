package com.example.nghethuatamthuc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;

public class ManHinhTrangCaNhanActivity extends AppCompatActivity {
    Toolbar toolbarTrangCaNhan;
    ImageView imgAnhBia;
    CircleImageView imgAnhDaiDien;
    TextView txtUser, txtNgayThamGia;
    Button btnQuanLyTaiKhoan, btnQuanLyBaiViet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.man_hinh_trang_ca_nhan_layout);

    }
}
