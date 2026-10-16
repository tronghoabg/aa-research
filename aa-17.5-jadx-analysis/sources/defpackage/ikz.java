package defpackage;

import android.app.backup.BackupManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class ikz {
    public static final yph a = yph.c("CAR.SETTING");
    private static final ygr e = ygr.t("rotary_use_focus_finder", "touchpad_focus_navigation_history_max_size", "touchpad_focus_navigation_history_max_age_ms", "car_module_feature_set", "projected_presentation_config_max_checks", "projected_presentation_config_check_delay", new String[0]);
    private static ikz f;
    public final Context b;
    public final SharedPreferences c;
    public BackupManager d;
    private SharedPreferences.OnSharedPreferenceChangeListener g;

    public ikz(final Context context) {
        this.b = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("carservice", 0);
        this.c = sharedPreferences;
        yph yphVar = a;
        if (yphVar.l().Z()) {
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                ((ype) yphVar.l().ai(228)).M("%s: %s", entry.getKey(), entry.getValue());
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ikx
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                    yph yphVar2 = ikz.a;
                    ype ypeVar = (ype) ((ype) yphVar2.f()).ai(229);
                    acwi acwiVar = acwi.a;
                    ypeVar.M("Shared preferences changed, applying changes: %s allowlist has %s", str, acwiVar.gu().c().b);
                    if (acwiVar.gu().c().b.contains(str)) {
                        ikz ikzVar = this.a;
                        BackupManager backupManager = ikzVar.d;
                        if (backupManager == null) {
                            backupManager = new BackupManager(context.getApplicationContext());
                        }
                        ikzVar.d = backupManager;
                        ((ype) yphVar2.l().ai((char) 230)).y("backupManager.dataChanged with key: %s", str);
                        ikzVar.d.dataChanged();
                    }
                }
            };
            this.g = onSharedPreferenceChangeListener;
            this.c.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }
    }

    public static synchronized ikz a(Context context) {
        ikz ikzVar;
        ikzVar = f;
        if (ikzVar == null) {
            ikzVar = new ikz(context.getApplicationContext());
            f = ikzVar;
        }
        return ikzVar;
    }

    public final String b(String str, String str2) {
        return this.c.getString(str, str2);
    }

    public final Set c(String str, Set set) {
        Set<String> stringSet = this.c.getStringSet(str, set);
        return stringSet == null ? yly.a : ygr.n(stringSet);
    }

    public final void d(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.c.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public final void e(String str, boolean z) {
        this.c.edit().putBoolean(str, z).apply();
    }

    public final void f(String str, String str2, String str3, String str4, boolean z) {
        this.c.edit().putBoolean(String.format("%s_%s_%s_%s", str, str2, str3, str4), z).apply();
    }

    public final void g(String str, int i) {
        this.c.edit().putInt(str, i).apply();
    }

    public final void h(boolean z) {
        e("has_video_focus", z);
        this.c.edit().putLong("last_focus_change_time", System.currentTimeMillis()).apply();
    }

    public final void i(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.c.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public final boolean j(String str) {
        return this.c.contains(str);
    }

    public final boolean k(String str, boolean z) {
        return this.c.getBoolean(str, z);
    }

    public final boolean l() {
        return this.c.getBoolean("car_save_audio", false);
    }

    public final boolean m() {
        return this.c.getBoolean("car_disable_anr_monitoring", false);
    }

    public final boolean n() {
        return this.c.getBoolean("car_enable_debug_background", false);
    }

    public final boolean o(String str) {
        return e.contains(str);
    }

    public final boolean p(String str, String str2, String str3, String str4) {
        return this.c.getBoolean(String.format("%s_%s_%s_%s", str, str2, str3, str4), false);
    }

    public final long q(String str) {
        return this.c.getLong(str, 0L);
    }
}
