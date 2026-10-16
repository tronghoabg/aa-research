package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class knf implements android.content.SharedPreferences {
    private static final defpackage.yqm b = defpackage.yqm.c("GH.ConProvSharedPrefs");
    private static final defpackage.yhx c = defpackage.yhx.t("aaw_device_compatibility", "common_user_settings", "connectivity_logger_state", "connectivity_session_id_file", "dongle_associations", "frxrewind", "gearhead_config", "os_upgrade_manager", "soft_minversion_dismissed_prefs", "vn_dev_settings", "wireless_custom_Settings");
    public final java.util.HashMap a;
    private final android.content.Context d;
    private final android.os.Handler e;
    private final android.net.Uri f;
    private final java.lang.String g;

    public knf(android.content.Context context, java.lang.String str) {
        defpackage.ysr.bk(c.contains(str), "Unknown shared preferences!");
        this.d = context;
        this.e = new android.os.Handler(context.getMainLooper());
        this.f = new android.net.Uri.Builder().scheme("content").authority("com.google.android.gearhead.shared_preferences_provider").appendPath(str).build();
        this.a = new java.util.HashMap();
        this.g = str;
    }

    public static void a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Key cannot be null or empty");
        }
    }

    private final android.os.Bundle b(android.os.Bundle bundle) {
        return c("GET", bundle, bundle.getString("EXTRA_KEY", "default"));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: knd */
    private final android.os.Bundle c(java.lang.String str, android.os.Bundle bundle, java.lang.String str2) throws knd {
        for (int i = 0; i < 3; i++) {
            android.content.Context context = this.d;
            android.net.Uri uri = this.f;
            java.lang.String str3 = this.g;
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
            android.os.Bundle bundleCall = context.getContentResolver().call(uri, str, str3, bundle);
            if (bundleCall != null) {
                return bundleCall;
            }
            ((defpackage.yqj) ((defpackage.yqj) b.h()).ai(3245)).R("Got null, op: %s, key: %s, attempt: %d", str, str2, numValueOf);
            try {
                java.lang.Thread.sleep(25L);
            } catch (java.lang.InterruptedException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) b.h()).p(e)).ai((char) 3246)).u("Unexpected interruption!");
            }
        }
        throw new knd(java.lang.String.format(java.util.Locale.getDefault(), "Null while reading %s:%s", this.g, str2));
    }

    private static final android.os.Bundle d(java.lang.String str, int i) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("EXTRA_KEY", str);
        bundle.putInt("EXTRA_TYPE", i);
        return bundle;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("EXTRA_KEY", str);
        return c("CONTAINS", bundle, str).getBoolean("RETURN_VALUE", false);
    }

    @Override // android.content.SharedPreferences
    public final android.content.SharedPreferences.Editor edit() {
        return new defpackage.knc(this.d, this.f, this.g);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: knd */
    @Override // android.content.SharedPreferences
    public final java.util.Map getAll() throws knd {
        android.os.Bundle bundleC = c("GET_ALL", new android.os.Bundle(), "<*>");
        java.util.HashMap map = new java.util.HashMap(bundleC.keySet().size());
        for (java.lang.String str : bundleC.keySet()) {
            java.lang.Object hashSet = bundleC.get(str);
            if (hashSet instanceof java.util.ArrayList) {
                hashSet = new java.util.HashSet(bundleC.getStringArrayList(str));
            }
            map.put(str, hashSet);
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(java.lang.String str, boolean z) {
        android.os.Bundle bundleD = d(str, 6);
        bundleD.putBoolean("DEFAULT_VALUE", z);
        return b(bundleD).getBoolean("RETURN_VALUE", z);
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(java.lang.String str, float f) {
        android.os.Bundle bundleD = d(str, 5);
        bundleD.putFloat("DEFAULT_VALUE", f);
        return b(bundleD).getFloat("RETURN_VALUE");
    }

    @Override // android.content.SharedPreferences
    public final int getInt(java.lang.String str, int i) {
        android.os.Bundle bundleD = d(str, 3);
        bundleD.putInt("DEFAULT_VALUE", i);
        return b(bundleD).getInt("RETURN_VALUE");
    }

    @Override // android.content.SharedPreferences
    public final long getLong(java.lang.String str, long j) {
        android.os.Bundle bundleD = d(str, 4);
        bundleD.putLong("DEFAULT_VALUE", j);
        return b(bundleD).getLong("RETURN_VALUE");
    }

    @Override // android.content.SharedPreferences
    public final java.lang.String getString(java.lang.String str, java.lang.String str2) {
        android.os.Bundle bundleD = d(str, 1);
        bundleD.putString("DEFAULT_VALUE", str2);
        return b(bundleD).getString("RETURN_VALUE");
    }

    @Override // android.content.SharedPreferences
    public final java.util.Set getStringSet(java.lang.String str, java.util.Set set) {
        android.os.Bundle bundleD = d(str, 2);
        bundleD.putStringArrayList("DEFAULT_VALUE", new java.util.ArrayList<>(set));
        return new java.util.HashSet(b(bundleD).getStringArrayList("RETURN_VALUE"));
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        onSharedPreferenceChangeListener.getClass();
        defpackage.kne kneVar = new defpackage.kne(onSharedPreferenceChangeListener, this.e, this);
        this.a.put(onSharedPreferenceChangeListener, kneVar);
        this.d.getContentResolver().registerContentObserver(this.f, true, kneVar);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        onSharedPreferenceChangeListener.getClass();
        defpackage.kne kneVar = (defpackage.kne) this.a.remove(onSharedPreferenceChangeListener);
        if (kneVar != null) {
            this.d.getContentResolver().unregisterContentObserver(kneVar);
        }
    }
}
