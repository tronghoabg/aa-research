package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ilj {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.SETTING");
    private static final defpackage.yhx e = defpackage.yhx.t("rotary_use_focus_finder", "touchpad_focus_navigation_history_max_size", "touchpad_focus_navigation_history_max_age_ms", "car_module_feature_set", "projected_presentation_config_max_checks", "projected_presentation_config_check_delay", new java.lang.String[0]);
    private static defpackage.ilj f;
    public final android.content.Context b;
    public final android.content.SharedPreferences c;
    public android.app.backup.BackupManager d;
    private android.content.SharedPreferences.OnSharedPreferenceChangeListener g;

    public ilj(final android.content.Context context) {
        this.b = context;
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("carservice", 0);
        this.c = sharedPreferences;
        defpackage.yqm yqmVar = a;
        if (yqmVar.l().Z()) {
            for (java.util.Map.Entry<java.lang.String, ?> entry : sharedPreferences.getAll().entrySet()) {
                ((defpackage.yqj) yqmVar.l().ai(228)).M("%s: %s", entry.getKey(), entry.getValue());
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new android.content.SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ilh
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences2, java.lang.String str) {
                    defpackage.yqm yqmVar2 = defpackage.ilj.a;
                    defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai(229);
                    defpackage.acxk acxkVar = defpackage.acxk.a;
                    yqjVar.M("Shared preferences changed, applying changes: %s allowlist has %s", str, acxkVar.fF().c().b);
                    if (acxkVar.fF().c().b.contains(str)) {
                        defpackage.ilj iljVar = this.a;
                        android.app.backup.BackupManager backupManager = iljVar.d;
                        if (backupManager == null) {
                            backupManager = new android.app.backup.BackupManager(context.getApplicationContext());
                        }
                        iljVar.d = backupManager;
                        ((defpackage.yqj) yqmVar2.l().ai((char) 230)).y("backupManager.dataChanged with key: %s", str);
                        iljVar.d.dataChanged();
                    }
                }
            };
            this.g = onSharedPreferenceChangeListener;
            this.c.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }
    }

    public static synchronized defpackage.ilj a(android.content.Context context) {
        defpackage.ilj iljVar;
        iljVar = f;
        if (iljVar == null) {
            iljVar = new defpackage.ilj(context.getApplicationContext());
            f = iljVar;
        }
        return iljVar;
    }

    public final java.lang.String b(java.lang.String str, java.lang.String str2) {
        return this.c.getString(str, str2);
    }

    public final java.util.Set c(java.lang.String str, java.util.Set set) {
        java.util.Set<java.lang.String> stringSet = this.c.getStringSet(str, set);
        return stringSet == null ? defpackage.ynd.a : defpackage.yhx.n(stringSet);
    }

    public final void d(android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.c.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public final void e(java.lang.String str, boolean z) {
        this.c.edit().putBoolean(str, z).apply();
    }

    public final void f(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z) {
        this.c.edit().putBoolean(java.lang.String.format("%s_%s_%s_%s", str, str2, str3, str4), z).apply();
    }

    public final void g(java.lang.String str, int i) {
        this.c.edit().putInt(str, i).apply();
    }

    public final void h(boolean z) {
        e("has_video_focus", z);
        this.c.edit().putLong("last_focus_change_time", java.lang.System.currentTimeMillis()).apply();
    }

    public final void i(android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.c.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public final boolean j(java.lang.String str) {
        return this.c.contains(str);
    }

    public final boolean k(java.lang.String str, boolean z) {
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

    public final boolean o(java.lang.String str) {
        return e.contains(str);
    }

    public final boolean p(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return this.c.getBoolean(java.lang.String.format("%s_%s_%s_%s", str, str2, str3, str4), false);
    }

    public final long q(java.lang.String str) {
        return this.c.getLong(str, 0L);
    }
}
