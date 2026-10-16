package cl.coders.faketraveler;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import cl.coders.faketraveler.MockedLocationService;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* loaded from: classes.dex */
public class MainActivity extends AppCompatActivity implements ServiceConnection {
    public static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("0.######", DecimalFormatSymbols.getInstance(Locale.ROOT));
    public static final String sharedPrefKey = "cl.coders.faketraveler.sharedprefs";
    private MaterialButton buttonApplyStop;
    private Context context;
    private int currentVersion;
    private double dLat;
    private double dLng;
    private EditText editTextLat;
    private EditText editTextLng;
    private long endTime;
    private double lat;
    private double lng;
    private String mapProvider;
    private int mockCount;
    private int mockFrequency;
    private boolean mockSpeed;
    private int version;
    private WebView webView;
    private double zoom;
    private SourceChange srcChange = SourceChange.NONE;
    private MockedLocationService.MockedBinder binder = null;

    public enum SourceChange {
        NONE,
        LOAD,
        CHANGE_FROM_EDITTEXT,
        CHANGE_FROM_MAP
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) throws PackageManager.NameNotFoundException {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main_layout), new OnApplyWindowInsetsListener() { // from class: cl.coders.faketraveler.MainActivity$$ExternalSyntheticLambda5
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return MainActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        this.context = getApplicationContext();
        this.webView = (WebView) findViewById(R.id.webView0);
        WebAppInterface webAppInterface = new WebAppInterface(this);
        this.buttonApplyStop = (MaterialButton) findViewById(R.id.button_applyStop);
        MaterialButton materialButton = (MaterialButton) findViewById(R.id.button_settings);
        this.editTextLat = (EditText) findViewById(R.id.editTextLat);
        this.editTextLng = (EditText) findViewById(R.id.editTextLng);
        this.buttonApplyStop.setOnClickListener(new View.OnClickListener() { // from class: cl.coders.faketraveler.MainActivity$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$onCreate$1(view);
            }
        });
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: cl.coders.faketraveler.MainActivity$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$onCreate$2(view);
            }
        });
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.setWebChromeClient(new WebChromeClient());
        this.webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.webView.addJavascriptInterface(webAppInterface, "Android");
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            if (Build.VERSION.SDK_INT >= 28) {
                this.currentVersion = (int) (packageInfo.getLongVersionCode() >> 32);
            } else {
                this.currentVersion = packageInfo.versionCode;
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(MainActivity.class.toString(), "Could not read version info!", e);
        }
        loadSharedPrefs();
        applyIntentOrDefault(getIntent());
        this.editTextLat.addTextChangedListener(new TextWatcher() { // from class: cl.coders.faketraveler.MainActivity.1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (MainActivity.this.editTextLat.getText().toString().isEmpty() || MainActivity.this.editTextLat.getText().toString().equals("-") || MainActivity.this.srcChange == SourceChange.CHANGE_FROM_MAP) {
                    return;
                }
                try {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.lat = Double.parseDouble(mainActivity.editTextLat.getText().toString());
                    MainActivity mainActivity2 = MainActivity.this;
                    mainActivity2.setLatLng(mainActivity2.lat, MainActivity.this.lng, SourceChange.CHANGE_FROM_EDITTEXT);
                } catch (Throwable th) {
                    Log.e(MainActivity.class.toString(), "Could not read latitude!", th);
                }
            }
        });
        this.editTextLng.addTextChangedListener(new TextWatcher() { // from class: cl.coders.faketraveler.MainActivity.2
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (MainActivity.this.editTextLng.getText().toString().isEmpty() || MainActivity.this.editTextLng.getText().toString().equals("-") || MainActivity.this.srcChange == SourceChange.CHANGE_FROM_MAP) {
                    return;
                }
                try {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.lng = Double.parseDouble(mainActivity.editTextLng.getText().toString());
                    MainActivity mainActivity2 = MainActivity.this;
                    mainActivity2.setLatLng(mainActivity2.lat, MainActivity.this.lng, SourceChange.CHANGE_FROM_EDITTEXT);
                } catch (Throwable th) {
                    Log.e(MainActivity.class.toString(), "Could not read longitude!", th);
                }
            }
        });
        if (this.endTime > System.currentTimeMillis()) {
            changeButtonToStop();
        } else {
            this.endTime = 0L;
            saveSettings();
        }
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return WindowInsetsCompat.CONSUMED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1(View view) {
        bindService(new Intent(this, (Class<?>) MockedLocationService.class), this, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$2(View view) {
        startActivity(new Intent(getBaseContext(), (Class<?>) MoreActivity.class));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.context = getApplicationContext();
        loadSharedPrefs();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        loadSharedPrefs();
        applyIntentOrDefault(intent);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    private void loadSharedPrefs() {
        SharedPrefsUtil.migrateOldPreferences(this.context);
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(sharedPrefKey, 0);
        this.version = sharedPreferences.getInt("version", 0);
        this.lat = SharedPrefsUtil.getDouble(sharedPreferences, "lat", 12.0d);
        this.lng = SharedPrefsUtil.getDouble(sharedPreferences, "lng", 15.0d);
        this.zoom = SharedPrefsUtil.getDouble(sharedPreferences, "zoom", 12.0d);
        this.mockCount = sharedPreferences.getInt("mockCount", 0);
        int i = sharedPreferences.getInt("mockFrequency", 10);
        this.mockFrequency = i;
        if (i <= 0) {
            this.mockFrequency = 1;
        }
        this.dLat = SharedPrefsUtil.getDouble(sharedPreferences, "dLat", 0.0d);
        this.dLng = SharedPrefsUtil.getDouble(sharedPreferences, "dLng", 0.0d);
        this.mockSpeed = sharedPreferences.getBoolean("mockSpeed", true);
        this.endTime = sharedPreferences.getLong("endTime", 0L);
        this.mapProvider = sharedPreferences.getString("mapProvider", MapProviderUtil.getDefaultMapProvider(Locale.getDefault()));
        int i2 = this.version;
        int i3 = this.currentVersion;
        if (i2 != i3) {
            this.version = i3;
            saveSettings();
        }
    }

    private void saveSettings() {
        SharedPreferences.Editor editorEdit = this.context.getSharedPreferences(sharedPrefKey, 0).edit();
        editorEdit.putInt("version", this.version);
        SharedPrefsUtil.putDouble(editorEdit, "lat", this.lat);
        SharedPrefsUtil.putDouble(editorEdit, "lng", this.lng);
        SharedPrefsUtil.putDouble(editorEdit, "zoom", this.zoom);
        editorEdit.putInt("mockCount", this.mockCount);
        editorEdit.putInt("mockFrequency", this.mockFrequency);
        SharedPrefsUtil.putDouble(editorEdit, "dLat", this.dLat);
        SharedPrefsUtil.putDouble(editorEdit, "dLng", this.dLng);
        editorEdit.putBoolean("mockSpeed", this.mockSpeed);
        editorEdit.putLong("endTime", this.endTime);
        editorEdit.putString("mapProvider", this.mapProvider);
        editorEdit.apply();
    }

    private void applyIntentOrDefault(Intent intent) {
        String dataString = intent.getDataString();
        if (dataString != null) {
            try {
                GeoUri geoUri = GeoUri.parse(dataString);
                Log.i(MainActivity.class.toString(), "Received geo intent: " + geoUri);
                if (geoUri != null) {
                    this.lat = geoUri.lat();
                    this.lng = geoUri.lng();
                    Double dZoom = geoUri.zoom();
                    if (dZoom != null) {
                        this.zoom = dZoom.doubleValue();
                    }
                }
            } catch (Throwable th) {
                Log.e(MainActivity.class.toString(), "Could not read geo intent!", th);
            }
        }
        setLatLng(this.lat, this.lng, SourceChange.LOAD);
        this.webView.loadUrl(Uri.parse("file:///android_asset/map.html").buildUpon().appendQueryParameter("lat", "" + this.lat).appendQueryParameter("lng", "" + this.lng).appendQueryParameter("zoom", "" + this.zoom).appendQueryParameter("provider", this.mapProvider).build().toString());
    }

    protected void applyLocation() throws NumberFormatException {
        if (latIsEmpty() || lngIsEmpty()) {
            showSnackbar(this.context.getResources().getString(R.string.MainActivity_NoLatLong));
            return;
        }
        this.lat = Double.parseDouble(this.editTextLat.getText().toString());
        double d = Double.parseDouble(this.editTextLng.getText().toString());
        this.lng = d;
        if (this.binder != null) {
            float[] fArr = {0.0f};
            if (this.mockSpeed) {
                double d2 = this.lat;
                Location.distanceBetween(d2, d, (this.dLat / 1000000.0d) + d2, (this.dLng / 1000000.0d) + d, fArr);
                fArr[0] = fArr[0] / (this.mockFrequency * 1000);
            }
            this.binder.startMock(this.lng, this.lat, this.dLng / 1000000.0d, this.dLat / 1000000.0d, this.mockFrequency * 1000, this.mockCount, fArr[0]);
            this.endTime = System.currentTimeMillis() + ((this.mockCount - 1) * this.mockFrequency * 1000);
            saveSettings();
        }
    }

    void showSnackbar(String str) {
        Snackbar.make(findViewById(R.id.main_layout), str, -1).show();
    }

    void showSnackbar(int i) {
        Snackbar.make(findViewById(R.id.main_layout), i, -1).show();
    }

    boolean latIsEmpty() {
        return GeoUri$$ExternalSyntheticRecord1.m(this.editTextLat.getText().toString());
    }

    boolean lngIsEmpty() {
        return GeoUri$$ExternalSyntheticRecord1.m(this.editTextLng.getText().toString());
    }

    protected void setMapMarker(double d, double d2) {
        WebView webView = this.webView;
        if (webView == null || webView.getUrl() == null) {
            return;
        }
        this.webView.loadUrl("javascript:setOnMap(" + d + "," + d2 + ");");
    }

    void changeButtonToApply() {
        this.buttonApplyStop.setText(this.context.getResources().getString(R.string.ActivityMain_Apply));
        this.buttonApplyStop.setOnClickListener(new View.OnClickListener() { // from class: cl.coders.faketraveler.MainActivity$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$changeButtonToApply$3(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$changeButtonToApply$3(View view) {
        MockedLocationService.MockedBinder mockedBinder = this.binder;
        if (mockedBinder == null) {
            bindService(new Intent(this, (Class<?>) MockedLocationService.class), this, 1);
        } else {
            mockedBinder.continueMock();
        }
    }

    void changeButtonToStop() {
        this.buttonApplyStop.setText(this.context.getResources().getString(R.string.ActivityMain_Stop));
        this.buttonApplyStop.setOnClickListener(new View.OnClickListener() { // from class: cl.coders.faketraveler.MainActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$changeButtonToStop$4(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$changeButtonToStop$4(View view) {
        unbindService(this);
        disconnectService();
    }

    public void setZoom(double d) {
        this.zoom = d;
        saveSettings();
    }

    void setLatLng(double d, double d2, SourceChange sourceChange) {
        this.lat = d;
        this.lng = d2;
        if (sourceChange == SourceChange.CHANGE_FROM_EDITTEXT || sourceChange == SourceChange.LOAD) {
            setMapMarker(this.lat, this.lng);
        }
        if (sourceChange == SourceChange.CHANGE_FROM_MAP || sourceChange == SourceChange.LOAD) {
            this.srcChange = SourceChange.CHANGE_FROM_MAP;
            EditText editText = this.editTextLat;
            DecimalFormat decimalFormat = DECIMAL_FORMAT;
            editText.setText(decimalFormat.format(this.lat));
            this.editTextLng.setText(decimalFormat.format(this.lng));
            this.srcChange = SourceChange.NONE;
        }
        saveSettings();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        MockedLocationService.MockedBinder mockedBinder = (MockedLocationService.MockedBinder) iBinder;
        this.binder = mockedBinder;
        mockedBinder.mockState.observe(this, new Observer() { // from class: cl.coders.faketraveler.MainActivity$$ExternalSyntheticLambda2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) throws NumberFormatException {
                this.f$0.onMockedStateChange((MockState) obj);
            }
        });
        this.binder.mockedLocation.observe(this, new Observer() { // from class: cl.coders.faketraveler.MainActivity$$ExternalSyntheticLambda3
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f$0.onMockedLocationChange((Location) obj);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        disconnectService();
    }

    private void disconnectService() {
        MockedLocationService.MockedBinder mockedBinder = this.binder;
        if (mockedBinder == null) {
            return;
        }
        mockedBinder.mockState.removeObservers(this);
        this.binder.mockedLocation.removeObservers(this);
        this.binder = null;
        indicateMockStop();
    }

    /* renamed from: cl.coders.faketraveler.MainActivity$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$cl$coders$faketraveler$MockState;

        static {
            int[] iArr = new int[MockState.values().length];
            $SwitchMap$cl$coders$faketraveler$MockState = iArr;
            try {
                iArr[MockState.NOT_MOCKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cl$coders$faketraveler$MockState[MockState.SERVICE_BOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cl$coders$faketraveler$MockState[MockState.MOCKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$cl$coders$faketraveler$MockState[MockState.MOCK_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMockedStateChange(MockState mockState) throws NumberFormatException {
        int i = AnonymousClass3.$SwitchMap$cl$coders$faketraveler$MockState[mockState.ordinal()];
        if (i == 1) {
            indicateMockStop();
            return;
        }
        if (i == 2) {
            applyLocation();
            return;
        }
        if (i == 3) {
            changeButtonToStop();
            showSnackbar(R.string.MainActivity_MockApplied);
        } else {
            if (i != 4) {
                return;
            }
            showSnackbar(R.string.MainActivity_MockNotApplied);
        }
    }

    private void indicateMockStop() {
        showSnackbar(R.string.MainActivity_MockStopped);
        changeButtonToApply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMockedLocationChange(Location location) {
        setMapMarker(location.getLatitude(), location.getLongitude());
    }
}
