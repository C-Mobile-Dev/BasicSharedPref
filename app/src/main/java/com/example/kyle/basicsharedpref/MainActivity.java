package com.example.kyle.basicsharedpref;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*
     * Note the first time the application will run the
     * toast values will be set to the first set int and
     * string values.
     *
     * The Data is store in a Private File that only the application
     * can access. this file is not visible in the file heirarchy.
     *
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creating shared preferences instance(access the shared preferences file)
        SharedPreferences sp = getPreferences(MODE_PRIVATE);
        /*key value var is set to "don't know" (maditory to have a set value in
          the declaration for both int and string)
         */
        String name = sp.getString("name","Don't know");
        int year = sp.getInt("year",0000);

        Toast.makeText(this,name + ", " + year, Toast.LENGTH_LONG).show();
        //creating an editor to handle the passing of information.
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("name","Kyle");
        editor.putInt("year",1987);

        editor.commit();
    }
}
