package com.carstream.tech.launcher;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import defpackage.e7;
import defpackage.r;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class Weather {
    public static final int DONG = 3;
    public static final int MAY = 1;
    private static final long MOI_MS = 1800000;
    public static final int MUA = 2;
    public static final int NANG = 0;
    private static final String PREF = "weather";
    private final Listener cb;
    private final Context ctx;
    private final Handler h = new Handler(Looper.getMainLooper());

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public interface Listener {
        void onWeather(String str, int i);
    }

    public Weather(Context context, Listener listener) {
        this.ctx = context.getApplicationContext();
        this.cb = listener;
    }

    private static int kieu(int i) {
        if (i >= 95) {
            return 3;
        }
        if (i >= 71 && i <= 77) {
            return 3;
        }
        if (i >= 51) {
            return 2;
        }
        return i >= 1 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$nap$0(String str, int i) {
        this.cb.onWeather(str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nap() {
        String str;
        try {
            LocationManager locationManager = (LocationManager) this.ctx.getSystemService("location");
            Location lastKnownLocation = locationManager.getLastKnownLocation("gps");
            if (lastKnownLocation == null) {
                lastKnownLocation = locationManager.getLastKnownLocation("network");
            }
            if (lastKnownLocation == null) {
                return;
            }
            Locale locale = Locale.US;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://api.open-meteo.com/v1/forecast?latitude=" + String.format(locale, "%.3f", Double.valueOf(lastKnownLocation.getLatitude())) + "&longitude=" + String.format(locale, "%.3f", Double.valueOf(lastKnownLocation.getLongitude())) + "&current=temperature_2m,weather_code").openConnection();
            httpURLConnection.setConnectTimeout(6000);
            httpURLConnection.setReadTimeout(6000);
            StringBuilder sb = new StringBuilder();
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i <= 0) {
                            break;
                        } else {
                            sb.append(new String(bArr, 0, i, "UTF-8"));
                        }
                    }
                    inputStream.close();
                    httpURLConnection.disconnect();
                    JSONObject jSONObject = new JSONObject(sb.toString()).getJSONObject("current");
                    int iRound = (int) Math.round(jSONObject.getDouble("temperature_2m"));
                    int iOptInt = jSONObject.optInt("weather_code", 0);
                    String locality = null;
                    try {
                        List<Address> fromLocation = new Geocoder(this.ctx, new Locale("vi")).getFromLocation(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), 1);
                        if (fromLocation != null && !fromLocation.isEmpty()) {
                            Address address = fromLocation.get(0);
                            locality = address.getLocality() != null ? address.getLocality() : address.getAdminArea();
                        }
                    } catch (Throwable unused) {
                    }
                    if (locality == null) {
                        str = "";
                    } else {
                        str = " · " + locality;
                    }
                    String str2 = iRound + "°" + str;
                    int iKieu = kieu(iOptInt);
                    this.ctx.getSharedPreferences(PREF, 0).edit().putString("txt", str2).putInt("kind", iKieu).putLong("luc", System.currentTimeMillis()).apply();
                    if (this.cb != null) {
                        this.h.post(new e7(this, str2, iKieu));
                    }
                } finally {
                }
            } catch (Throwable th) {
                httpURLConnection.disconnect();
                throw th;
            }
        } catch (Throwable unused2) {
        }
    }

    public void start() {
        Listener listener;
        SharedPreferences sharedPreferences = this.ctx.getSharedPreferences(PREF, 0);
        String string = sharedPreferences.getString("txt", null);
        int i = sharedPreferences.getInt("kind", 0);
        if (string != null && (listener = this.cb) != null) {
            listener.onWeather(string, i);
        }
        if (System.currentTimeMillis() - sharedPreferences.getLong("luc", 0L) < MOI_MS) {
            return;
        }
        new Thread(new r(this, 10), PREF).start();
    }
}
