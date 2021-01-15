package com.lnjr.viewpapertext1;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
public class LoginActivity1 extends BaseActivity {
    private EditText accountEdit;
    private EditText passwordEdit;
    private Button click;
    private CheckBox remberPass;
    private CheckBox remeberAccount;
    private SharedPreferences pre;
    private SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);
        accountEdit=findViewById(R.id.account);
        passwordEdit=findViewById(R.id.password);
        remberPass=findViewById(R.id.remeberPass);
        remeberAccount=findViewById(R.id.remeberAccount);
        click=findViewById(R.id.click);
        pre= PreferenceManager.getDefaultSharedPreferences(this);
        boolean isRemember=pre.getBoolean("remberPass",false);
        if(isRemember){
            //将账号密码都设置到文本框中
            String account=pre.getString("account","");
            String password=pre.getString("password","");
            accountEdit.setText(account);
            passwordEdit.setText(password);
            remberPass.setChecked(true);
            remeberAccount.setChecked(true);
        }
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String account=accountEdit.getText().toString();
                String password=passwordEdit.getText().toString();
                if (account.equals("123")&& password.equals("sll")){//记住密码
                    editor=pre.edit();
                    if(remberPass.isChecked()&& remeberAccount.isChecked()){
                        editor.putBoolean("remberPass",true);
                        editor.putString("password",password);
                        editor.putBoolean("remeberAccount",true);
                        editor.putString("account",account);
                    }
                    else {
                        editor.clear();
                    }
                    editor.apply();
                    Intent intent=new Intent(LoginActivity1.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }else {
                    Toast.makeText(LoginActivity1.this,"账号或密码不正确",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}