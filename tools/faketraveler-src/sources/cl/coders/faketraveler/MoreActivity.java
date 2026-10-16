package cl.coders.faketraveler;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.timepicker.TimeModel;
import java.util.Locale;

/* loaded from: classes.dex */
public class MoreActivity extends AppCompatActivity {
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_more);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.more_layout), new OnApplyWindowInsetsListener() { // from class: cl.coders.faketraveler.MoreActivity$$ExternalSyntheticLambda1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return MoreActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(MainActivity.sharedPrefKey, 0);
        TextView textView = (TextView) findViewById(R.id.tv_LeafletLicense);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setText(Html.fromHtml(getString(R.string.ActivityMore_LeafletLicense), 0));
        } else {
            textView.setText(Html.fromHtml(getString(R.string.ActivityMore_LeafletLicense)));
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        final EditText editText = (EditText) findViewById(R.id.et_DMockLat);
        editText.setText(MainActivity.DECIMAL_FORMAT.format(SharedPrefsUtil.getDouble(sharedPreferences, "dLat", 0.0d)));
        editText.addTextChangedListener(new TextWatcher() { // from class: cl.coders.faketraveler.MoreActivity.1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                SharedPreferences.Editor editorEdit = MoreActivity.this.getApplicationContext().getSharedPreferences(MainActivity.sharedPrefKey, 0).edit();
                if (GeoUri$$ExternalSyntheticRecord1.m(editText.getText().toString())) {
                    SharedPrefsUtil.putDouble(editorEdit, "dLat", 0.0d);
                } else {
                    try {
                        SharedPrefsUtil.putDouble(editorEdit, "dLat", Double.parseDouble(editText.getText().toString()));
                    } catch (Throwable th) {
                        Log.e(MoreActivity.class.toString(), "Could not parse dLat!", th);
                    }
                }
                editorEdit.apply();
            }
        });
        final EditText editText2 = (EditText) findViewById(R.id.et_DMockLon);
        editText2.setText(MainActivity.DECIMAL_FORMAT.format(SharedPrefsUtil.getDouble(sharedPreferences, "dLng", 0.0d)));
        editText2.addTextChangedListener(new TextWatcher() { // from class: cl.coders.faketraveler.MoreActivity.2
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                SharedPreferences.Editor editorEdit = MoreActivity.this.getApplicationContext().getSharedPreferences(MainActivity.sharedPrefKey, 0).edit();
                if (GeoUri$$ExternalSyntheticRecord1.m(editText2.getText().toString())) {
                    SharedPrefsUtil.putDouble(editorEdit, "dLng", 0.0d);
                } else {
                    try {
                        SharedPrefsUtil.putDouble(editorEdit, "dLng", Double.parseDouble(editText2.getText().toString()));
                    } catch (Throwable th) {
                        Log.e(MoreActivity.class.toString(), "Could not parse dLng!", th);
                    }
                }
                editorEdit.apply();
            }
        });
        final EditText editText3 = (EditText) findViewById(R.id.et_MockCount);
        editText3.setText(String.format(Locale.ROOT, TimeModel.NUMBER_FORMAT, Integer.valueOf(sharedPreferences.getInt("mockCount", 0))));
        editText3.addTextChangedListener(new TextWatcher() { // from class: cl.coders.faketraveler.MoreActivity.3
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                SharedPreferences.Editor editorEdit = MoreActivity.this.getApplicationContext().getSharedPreferences(MainActivity.sharedPrefKey, 0).edit();
                if (GeoUri$$ExternalSyntheticRecord1.m(editText3.getText().toString())) {
                    editorEdit.putInt("mockCount", 0);
                } else {
                    try {
                        editorEdit.putInt("mockCount", Integer.parseInt(editText3.getText().toString()));
                    } catch (Throwable th) {
                        Log.e(MoreActivity.class.toString(), "Could not parse mockCount!", th);
                    }
                }
                editorEdit.apply();
            }
        });
        final EditText editText4 = (EditText) findViewById(R.id.et_MockFrequency);
        editText4.setText(String.format(Locale.ROOT, TimeModel.NUMBER_FORMAT, Integer.valueOf(sharedPreferences.getInt("mockFrequency", 10))));
        editText4.addTextChangedListener(new TextWatcher() { // from class: cl.coders.faketraveler.MoreActivity.4
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                SharedPreferences.Editor editorEdit = MoreActivity.this.getApplicationContext().getSharedPreferences(MainActivity.sharedPrefKey, 0).edit();
                if (GeoUri$$ExternalSyntheticRecord1.m(editText4.getText().toString())) {
                    editorEdit.putInt("mockFrequency", 10);
                } else {
                    try {
                        editorEdit.putInt("mockFrequency", Integer.parseInt(editText4.getText().toString()));
                    } catch (Throwable th) {
                        Log.e(MoreActivity.class.toString(), "Could not parse mockFrequency!", th);
                    }
                }
                editorEdit.apply();
            }
        });
        final CheckBox checkBox = (CheckBox) findViewById(R.id.cb_MockSpeed);
        checkBox.setChecked(sharedPreferences.getBoolean("mockSpeed", true));
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: cl.coders.faketraveler.MoreActivity$$ExternalSyntheticLambda2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f$0.lambda$onCreate$1(checkBox, compoundButton, z);
            }
        });
        final EditText editText5 = (EditText) findViewById(R.id.et_MapProvider);
        editText5.setText(sharedPreferences.getString("mapProvider", MapProviderUtil.getDefaultMapProvider(Locale.getDefault())));
        editText5.addTextChangedListener(new TextWatcher() { // from class: cl.coders.faketraveler.MoreActivity.5
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                SharedPreferences.Editor editorEdit = MoreActivity.this.getApplicationContext().getSharedPreferences(MainActivity.sharedPrefKey, 0).edit();
                if (GeoUri$$ExternalSyntheticRecord1.m(editText5.getText().toString())) {
                    editorEdit.putString("mapProvider", MapProviderUtil.getDefaultMapProvider(Locale.getDefault()));
                } else {
                    editorEdit.putString("mapProvider", editText5.getText().toString());
                }
                editorEdit.apply();
            }
        });
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return WindowInsetsCompat.CONSUMED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1(CheckBox checkBox, CompoundButton compoundButton, boolean z) {
        SharedPreferences.Editor editorEdit = getApplicationContext().getSharedPreferences(MainActivity.sharedPrefKey, 0).edit();
        editorEdit.putBoolean("mockSpeed", checkBox.isChecked());
        editorEdit.apply();
    }
}
