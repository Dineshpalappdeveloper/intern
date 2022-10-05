package com.example.aminternship;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    TextView responseTv,res5;
    Button submit;
    LinearLayout linear4;
    EditText name, email, degree, contactNumber, hobbes, collageName, description;
    LottieAnimationView anim,loading;
    ArrayList<String> aaIds = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        res5 = findViewById(R.id.res5);
        responseTv = findViewById(R.id.responseTv);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        degree = findViewById(R.id.degree);
        linear4 = findViewById(R.id.linear4);
        contactNumber = findViewById(R.id.contactNumber);
        hobbes = findViewById(R.id.hobbes);
        collageName = findViewById(R.id.collageName);
        description = findViewById(R.id.description);
        anim = findViewById(R.id.anim);
        submit = findViewById(R.id.submit);
        loading = findViewById(R.id.loading2);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.getText().toString().isEmpty() &&
                        email.getText().toString().isEmpty() &&
                        degree.getText().toString().isEmpty() &&
                        collageName.getText().toString().isEmpty() &&
                        contactNumber.getText().toString().isEmpty() &&
                        hobbes.getText().toString().isEmpty() &&
                        description.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please Fill all field", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    postData(name.getText().toString(), email.getText().toString(), degree.getText().toString(), collageName.getText().toString(),
                            contactNumber.getText().toString(), hobbes.getText().toString(), description.getText().toString());
                }
            }


        });

        aaIds.add("Android App Development");
        aaIds.add("Flutter");
        aaIds.add("Web Development");
        aaIds.add("Ethical Hacking");
        aaIds.add("Cyber Security");
        aaIds.add("Digital Marketing");
        aaIds.add("Business  Management");

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, aaIds);
        spinner.setAdapter(spinnerAdapter);

    }
        private void postData(String name, String email, String degree, String contactNumber, String hobbes, String description, String collageName) {

            linear4.setVisibility(View.INVISIBLE);
             loading.setVisibility(View.VISIBLE);


            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://reqres.in/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            RetrofitAPI retrofitAPI = retrofit.create(RetrofitAPI.class);

            DataModel model = new DataModel(name,email,degree,contactNumber,hobbes,description,collageName);
            Call<DataModel>call = retrofitAPI.createPost(model);

            call.enqueue(new Callback<DataModel>() {
                @Override
                public void onResponse(Call<DataModel> call, retrofit2.Response<DataModel> response) {
                    Toast.makeText(MainActivity.this, "Apply Successful", Toast.LENGTH_SHORT).show();

                    loading.setVisibility(View.GONE);

                    DataModel responseFromAPI = response.body();

                  String responseString = "Response Code : "+ response.code()+"\n Name : " + responseFromAPI.getName()
                          +"\n" + "email : " + responseFromAPI.getEmail()
                          +"\n" + "degree : " + responseFromAPI.getHighsDegree()
                          +"\n" + "collage : " + responseFromAPI.getCollage()
                          +"\n" + "hobbes : " + responseFromAPI.getHobbes()
                          +"\n" + "description: " + responseFromAPI.getDescription()
                          +"\n" + "collageName : " + responseFromAPI.getCollage();

                        responseTv.setText(responseString);


                }

                @Override
                public void onFailure(Call<DataModel> call, Throwable t) {
                    responseTv.setText("Error found is : "+ t.getMessage());
                }
            });

        }



}

