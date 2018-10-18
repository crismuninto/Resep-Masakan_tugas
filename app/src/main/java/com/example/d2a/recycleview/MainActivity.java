package com.example.d2a.recycleview;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private LinkedList<Resep> resep = new LinkedList<Resep>();
    private LinkedList<String> resep_nama = new LinkedList<String>();
    private LinkedList<String> resep_detail = new LinkedList<String>();
    private LinkedList<String> resep_ingredients = new LinkedList<String>();
    private LinkedList<String> resep_process = new LinkedList<String>();
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        resep.add(new Resep("Nasi Goreng","Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng atau margarin, biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya, seperti telur, ayam, dan kerupuk.", "1. Nasi yang telah masak\n2. kecap manis\n3. bubuk terasi (pasta udang)\n4. garam\n5. bawang putih\n6. bawang merah\n7. cabe rawit\n8. daun bawang\n9. pala, kunyit, minyak sayur, bawang merah, gula, pasta jahe, dan irisan mentimun serta tomat untuk hiasan", "1.process"));
        resep.add(new Resep("Sate ","adalah makanan khas Indonesia. Sate Ayam dibuat dari daging ayam. Pada umumnya sate ayam dimasak dengan cara dipanggang dengan menggunakan arang dan disajikan dengan pilihan bumbu kacang atau bumbu kecap", "1.Daging \n 2.rempah \n 3.cabai, ", "Pertama cuci daging fillet kemudian potong dengan bentuk dadu lalu tiriskan.\n" +
                "Ambil wadah dan letakkan daging ayam diatas bersama dengan jeruk nipis, garam dapur, bawang putih halus, lada dan gula pasir.\n" +
                "Aduk aduk sampai semua bumbu rata dengan daging ayam kemudian marinasi di kulkas.\n" +
                "Biarkan sampai meresap ke daging ayam atau diamkan kurang lebih 1/4 jam sampai 1/2 jam."));
        resep.add(new Resep("Rendang","Rendang atau randang adalah masakan daging bercita rasa pedas yang menggunakan campuran dari berbagai bumbu dan rempah-rempah. Masakan ini dihasilkan dari proses memasak yang dipanaskan berulang-ulang dengan santan kelapa. Proses memasaknya memakan waktu berjam-jam hingga kering dan berwarna hitam pekat.", "1. Daging\n2. Bumbu rendang", "1.process"));
        resep.add(new Resep("Pisang Goreng", "Makanan ini dibuat dari buah pisang, sesudah di kupas kulitnya dipotong-potong sesuai keinginan kemudian di lumuri bersama adonan kental terbuat dari campuran tepung, telur, sedikit garam dan gula selanjutnya digoreng dalam minyak goreng.","1.pisang \n2.tepung \n3,minyak goreng","1.kupas pisang \n2.potong2 Pisang"));
        resep.add(new Resep("Sate kambing", "dalah sejenis makanan sate terbuat dari daging kambing. Daging kambing tersebut disate (ditusuk dengan bambu yang dibentuk seperti lidi yang agak besar) dan dibumbui dengan rempah-rempah dan bumbu dapur, kemudian dibakar","1.daging kambing \n2.Bumbu \3.Arang\n4.Tomat","1.cuci daging sampe bersih \n2.iris tipis daging\n3.bakar daging hingga matang"));
        resep_process.add("1.process");
        setContentView(R.layout.activity_main);
        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerview);
        for(int i = 0; i < resep.size(); i++){
            resep_nama.add(resep.get(i).nama);
            resep_detail.add(resep.get(i).detail);
            resep_ingredients.add(resep.get(i).ingredients);
            resep_process.add(resep.get(i).proses);
        }
        // Create an adapter and supply the data to be displayed.
        mAdapter = new WordListAdapter(this, resep_nama, resep_detail, resep_ingredients, resep_process);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
