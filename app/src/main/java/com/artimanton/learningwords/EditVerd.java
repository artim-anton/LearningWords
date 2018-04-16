package com.artimanton.learningwords;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import io.realm.Realm;

public class EditVerd extends AppCompatActivity {
    private Realm mRealm;
    EditText edTxVerb;
    EditText edTxTranslate;
    EditText esTxExample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_verd);
        mRealm = Realm.getInstance(getApplicationContext());
        edTxVerb = (EditText) findViewById(R.id.verbEditText);
        edTxTranslate = (EditText) findViewById(R.id.translateEditText);
        esTxExample = (EditText) findViewById(R.id.exampleEditText);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mRealm.close();
    }


    public void buttonSaveVerb(View view) {
        mRealm.beginTransaction();
        Words words = mRealm.createObject(Words.class);
        words.setVerb(edTxVerb.getText().toString());
        words.setTranslate(edTxTranslate.toString());
        words.setExample(esTxExample.toString());
        mRealm.commitTransaction();
    }
}
