package com.example.survey;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.survey.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

public class RegistrationActivity extends AppCompatActivity {
  /*  TextView logintext;
    private FirebaseAuth auth;
    FirebaseDatabase database;
    Button register;
    EditText password, email, name, profession;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";   
    ProgressDialog progressDialog;*/


    TextView tvlogin,skip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        tvlogin = findViewById(R.id.tvlogin);
        skip = findViewById(R.id.skip);
        tvlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistrationActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistrationActivity.this,MainScreen.class);
                startActivity(intent);
            }
        });
        /*logintext = findViewById(R.id.logintext);
        auth = FirebaseAuth.getInstance();
        register = findViewById(R.id.register);
        name = findViewById(R.id.name);
        profession = findViewById(R.id.profession);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        database = FirebaseDatabase.getInstance();
        progressDialog = new ProgressDialog(this);
        logintext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistrationActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputemail = email.getText().toString().trim();
                String inputpassword = password.getText().toString().trim();
                if (!email.getText().toString().matches(emailPattern)) {
                    email.setError("Enter correct Email");
                } else {
                    progressDialog.setMessage("Please Wait While Registration..");
                    progressDialog.setTitle("Registration..");
                    progressDialog.setCanceledOnTouchOutside(false);
                    progressDialog.show();

                    auth.createUserWithEmailAndPassword(inputemail, inputpassword).
                            addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {

                                    if (task.isSuccessful()) {
                                        progressDialog.dismiss();
                                        User user = new User(name.getText().toString(), profession.getText().toString()
                                                , email.getText().toString(), password.getText().toString());
                                        String id = task.getResult().getUser().getUid();
                                        database.getReference().child("Users").child(id).setValue(user);
                                        Toast.makeText(RegistrationActivity.this, "Successfull", Toast.LENGTH_SHORT).show();
                                    } else {
                                        progressDialog.dismiss();
                                        Toast.makeText(RegistrationActivity.this, "Error", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                }
            }
        });*/


    }
}