package com.example.tookteste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder viewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Text
        this.viewHolder.userName = findViewById(R.id.userName);
        this.viewHolder.userAge = findViewById(R.id.userAge);
        this.viewHolder.userEmail = findViewById(R.id.userEmail);
        this.viewHolder.userPhone = findViewById(R.id.userPhone);
        this.viewHolder.userAddress = findViewById(R.id.userAddress);
        this.viewHolder.userKey = findViewById(R.id.userKey);
        this.viewHolder.userPassword = findViewById(R.id.userPassword);
        //Check
        this.viewHolder.userPhysicallyDisabled = findViewById(R.id.userPhysicallyDisabled);
        this.viewHolder.userVisuallyDisabled = findViewById(R.id.userVisuallyDisabled);
        this.viewHolder.userHearingDisabled = findViewById(R.id.userHearingDisabled);
        this.viewHolder.userIntellectuallyDisabled = findViewById(R.id.userIntellectuallyDisabled);
        //Button
        this.viewHolder.userSaveButton = findViewById(R.id.userSaveButton);

        this.viewHolder.userSaveButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.userSaveButton){

            String name = this.viewHolder.userName.getText().toString();
            String age = this.viewHolder.userAge.getText().toString();
            String email = this.viewHolder.userEmail.getText().toString();
            String phone = this.viewHolder.userPhone.getText().toString();
            String address = this.viewHolder.userAddress.getText().toString();
            String key = this.viewHolder.userKey.getText().toString();
            String password = this.viewHolder.userPassword.getText().toString();

            if ("".equals(name) || "".equals(age) || "".equals(email) || "".equals(phone) || "".equals(address) || "".equals(key) || "".equals(password)){
                Toast.makeText(this, "Preencha todos os dados", Toast.LENGTH_LONG).show();
            }
            else{
                //Aplica a logica de salvar os dados do usuario
                //User user = new User(name, email,...);
            }
        }

        boolean physicallyDisabledCheck = this.viewHolder.userPhysicallyDisabled.isChecked();
        boolean visualyDisabledCheck = this.viewHolder.userVisuallyDisabled.isChecked();
        boolean hearingDisabledCheck = this.viewHolder.userHearingDisabled.isChecked();
        boolean intellectuallyDisabledCheck = this.viewHolder.userIntellectuallyDisabled.isChecked();

        if (visualyDisabledCheck){
            //Aplica a logica de salvar os dados do usuario
        }

        if (physicallyDisabledCheck){
            //Aplica a logica de salvar os dados do usuario
        }

        if (hearingDisabledCheck){
            //Aplica a logica de salvar os dados do usuario
        }

        if (intellectuallyDisabledCheck){
            //Aplica a logica de salvar os dados do usuario
        }
    }

    private static class ViewHolder {
        EditText userName;
        EditText userAge;
        EditText userEmail;
        EditText userPhone;
        EditText userAddress;
        EditText userKey;
        EditText userPassword;

        CheckBox userPhysicallyDisabled;
        CheckBox userVisuallyDisabled;
        CheckBox userHearingDisabled;
        CheckBox userIntellectuallyDisabled;

        Button userSaveButton;
    }

}