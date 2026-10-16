package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class kmy implements SharedPreferences {
    private static final yph b = yph.c("GH.ConProvSharedPrefs");
    private static final ygr c = ygr.t("aaw_device_compatibility", "common_user_settings", "connectivity_logger_state", "connectivity_session_id_file", "dongle_associations", "frxrewind", "gearhead_config", "os_upgrade_manager", "soft_minversion_dismissed_prefs", "vn_dev_settings", "wireless_custom_Settings");
    public final HashMap a;
    private final Context d;
    private final Handler e;
    private final Uri f;
    private final String g;

    public kmy(Context context, String str) {
        woy.aa(c.contains(str), "Unknown shared preferences!");
        this.d = context;
        this.e = new Handler(context.getMainLooper());
        this.f = new Uri.Builder().scheme("content").authority("com.google.android.gearhead.shared_preferences_provider").appendPath(str).build();
        this.a = new HashMap();
        this.g = str;
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Key cannot be null or empty");
        }
    }

    private final Bundle b(Bundle bundle) {
        return c("GET", bundle, bundle.getString("EXTRA_KEY", "default"));
    }

    private final Bundle c(String str, Bundle bundle, String str2) throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            Context context = this.d;
            Uri uri = this.f;
            String str3 = this.g;
            Integer numValueOf = Integer.valueOf(i);
            Bundle bundleCall = context.getContentResolver().call(uri, str, str3, bundle);
            if (bundleCall != null) {
                return bundleCall;
            }
            ((ype) ((ype) b.h()).ai(3242)).R("Got null, op: %s, key: %s, attempt: %d", str, str2, numValueOf);
            try {
                Thread.sleep(25L);
            } catch (InterruptedException e) {
                ((ype) ((ype) ((ype) b.h()).p(e)).ai((char) 3243)).u("Unexpected interruption!");
            }
        }
        throw new kmw(String.format(Locale.getDefault(), "Null while reading %s:%s", this.g, str2));
    }

    private static final Bundle d(String str, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_KEY", str);
        bundle.putInt("EXTRA_TYPE", i);
        return bundle;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_KEY", str);
        return c("CONTAINS", bundle, str).getBoolean("RETURN_VALUE", false);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new kmv(this.d, this.f, this.g);
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() throws InterruptedException {
        Bundle bundleC = c("GET_ALL", new Bundle(), "<*>");
        HashMap map = new HashMap(bundleC.keySet().size());
        for (String str : bundleC.keySet()) {
            Object hashSet = bundleC.get(str);
            if (hashSet instanceof ArrayList) {
                hashSet = new HashSet(bundleC.getStringArrayList(str));
            }
            map.put(str, hashSet);
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Bundle bundleD = d(str, 6);
        bundleD.putBoolean("DEFAULT_VALUE", z);
        return b(bundleD).getBoolean("RETURN_VALUE", z);
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Bundle bundleD = d(str, 5);
        bundleD.putFloat("DEFAULT_VALUE", f);
        return b(bundleD).getFloat("RETURN_VALUE");
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Bundle bundleD = d(str, 3);
        bundleD.putInt("DEFAULT_VALUE", i);
        return b(bundleD).getInt("RETURN_VALUE");
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Bundle bundleD = d(str, 4);
        bundleD.putLong("DEFAULT_VALUE", j);
        return b(bundleD).getLong("RETURN_VALUE");
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Bundle bundleD = d(str, 1);
        bundleD.putString("DEFAULT_VALUE", str2);
        return b(bundleD).getString("RETURN_VALUE");
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Bundle bundleD = d(str, 2);
        bundleD.putStringArrayList("DEFAULT_VALUE", new ArrayList<>(set));
        return new HashSet(b(bundleD).getStringArrayList("RETURN_VALUE"));
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        onSharedPreferenceChangeListener.getClass();
        kmx kmxVar = new kmx(onSharedPreferenceChangeListener, this.e, this);
        this.a.put(onSharedPreferenceChangeListener, kmxVar);
        this.d.getContentResolver().registerContentObserver(this.f, true, kmxVar);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        onSharedPreferenceChangeListener.getClass();
        kmx kmxVar = (kmx) this.a.remove(onSharedPreferenceChangeListener);
        if (kmxVar != null) {
            this.d.getContentResolver().unregisterContentObserver(kmxVar);
        }
    }
}
