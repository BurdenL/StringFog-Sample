package com.jerry.stringfog_sample;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    // Test static final fields
    private static final String STATIC_FINAL_FIELD_1 = "test_private_static_final";
    protected static final String STATIC_FINAL_FIELD_2 = "test_protected_static_final";
    public static final String STATIC_FINAL_FIELD_3 = "test_public_static_final";

    // Test static fields
    private static String static_field_1 = "test_private_static";
    protected static String static_field_2 = "test_protected_static";
    public static String static_field_3 = "test_public_static";

    // Test final fields
    private final String final_field_1 = "test_private_final";
    protected final String final_field_2 = "test_protected_final";
    public final String final_field_3 = "test_public_final";

    // Test normal fields
    private String normal_field_1 = "test_private_normal";
    protected String normal_field_2 = "test_protected_normal";
    public String normal_field_3 = "test_public_normal";

    // Test null static final value
    public static final String null_static_final;

    // Test null static value
    public static String null_static;

    static {
        null_static_final = "test_null_static_final";
        null_static = "test_null_static";

        // Test static block
        Log.i("stringfog", "test static block");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        String tag = "stringfog";

        Log.i(tag, STATIC_FINAL_FIELD_1);
        Log.i(tag, STATIC_FINAL_FIELD_2);
        Log.i(tag, STATIC_FINAL_FIELD_3);

        Log.i(tag, static_field_1);
        Log.i(tag, static_field_2);
        Log.i(tag, static_field_3);

        Log.i(tag, final_field_1);
        Log.i(tag, final_field_2);
        Log.i(tag, final_field_3);

        Log.i(tag, normal_field_1);
        Log.i(tag, normal_field_2);
        Log.i(tag, normal_field_3);

        Log.i(tag, null_static_final);
        Log.i(tag, null_static);
    }
}