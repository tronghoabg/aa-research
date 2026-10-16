package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nsn implements defpackage.lhn {
    static final defpackage.yhx a = defpackage.yhx.r(defpackage.mkt.e, defpackage.mkt.b, new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.companion.settings.DefaultSettingsActivity"), defpackage.mkt.v);
    public static final android.content.ComponentName b = new android.content.ComponentName("NewsAssistantAction", "");
    public android.app.backup.BackupManager c;
    public final java.lang.Object d = new java.lang.Object();
    public defpackage.yhe e;
    public final android.content.SharedPreferences f;
    java.lang.Boolean g;
    defpackage.yhe h;
    public final android.content.SharedPreferences i;
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener j;
    private final android.content.SharedPreferences k;

    public nsn(final android.content.Context context) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("LAUNCHER_APP_ENABLED_DISABLED", 0);
        this.f = sharedPreferences;
        android.content.SharedPreferences sharedPreferences2 = context.getSharedPreferences("CUSTOMIZATION_ENABLED_DISABLED", 0);
        this.k = sharedPreferences2;
        android.content.SharedPreferences sharedPreferences3 = context.getSharedPreferences("LAUNCHER_APP_POSITIONS", 0);
        this.i = sharedPreferences3;
        android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new android.content.SharedPreferences.OnSharedPreferenceChangeListener() { // from class: nsm
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences4, java.lang.String str) {
                if (!defpackage.acxk.f() || android.os.Build.VERSION.SDK_INT < 30) {
                    return;
                }
                defpackage.nsn nsnVar = this.a;
                android.app.backup.BackupManager backupManager = nsnVar.c;
                if (backupManager == null) {
                    backupManager = new android.app.backup.BackupManager(context);
                }
                nsnVar.c = backupManager;
                nsnVar.c.dataChanged();
            }
        };
        this.j = onSharedPreferenceChangeListener;
        if (android.os.Build.VERSION.SDK_INT < 30 || !defpackage.acxk.f()) {
            return;
        }
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        sharedPreferences2.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        sharedPreferences3.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public static defpackage.nsn e() {
        return (defpackage.nsn) defpackage.mkp.a.i(defpackage.nsn.class);
    }

    public static final boolean k(android.content.ComponentName componentName) {
        return (a.contains(componentName) || defpackage.lfr.c().d().equals(componentName.getPackageName())) ? false : true;
    }

    private final int l(android.content.ComponentName componentName) {
        android.content.SharedPreferences sharedPreferences = this.i;
        java.lang.String strFlattenToString = componentName.flattenToString();
        int iIntValue = 0;
        for (java.util.Map.Entry<java.lang.String, ?> entry : sharedPreferences.getAll().entrySet()) {
            if ((entry.getValue() instanceof java.lang.Integer) && ((java.lang.Integer) entry.getValue()).intValue() > iIntValue) {
                iIntValue = ((java.lang.Integer) entry.getValue()).intValue();
            }
        }
        int i = iIntValue + 1;
        sharedPreferences.edit().putInt(strFlattenToString, i).commit();
        synchronized (this.d) {
            if (this.h != null) {
                this.h = defpackage.yhe.j(sharedPreferences.getAll());
            }
        }
        return i;
    }

    private final boolean m() {
        return !this.i.getAll().isEmpty();
    }

    private final boolean n(android.content.ComponentName componentName) {
        java.lang.String strFlattenToString = componentName.flattenToString();
        defpackage.yhe yheVar = this.e;
        yheVar.getClass();
        java.lang.Object obj = yheVar.get(strFlattenToString);
        return obj == null || ((java.lang.Boolean) obj).booleanValue();
    }

    public final int a(android.content.ComponentName componentName) {
        int iIntValue;
        synchronized (this.d) {
            if (this.h == null) {
                return b(componentName);
            }
            java.lang.String strFlattenToString = componentName.flattenToString();
            defpackage.yhe yheVar = this.h;
            yheVar.getClass();
            java.lang.Object obj = yheVar.get(strFlattenToString);
            if (obj == null && n(componentName) && m()) {
                iIntValue = l(componentName);
            } else {
                iIntValue = obj != null ? ((java.lang.Integer) obj).intValue() : Integer.MAX_VALUE;
            }
            return iIntValue;
        }
    }

    public final int b(android.content.ComponentName componentName) {
        android.content.SharedPreferences sharedPreferences = this.i;
        java.lang.String strFlattenToString = componentName.flattenToString();
        return (!sharedPreferences.contains(strFlattenToString) && h(componentName) && m()) ? l(componentName) : sharedPreferences.getInt(strFlattenToString, Integer.MAX_VALUE);
    }

    @Override // defpackage.lhn
    public final void d() {
        synchronized (this.d) {
            this.e = null;
            this.g = null;
            this.h = null;
        }
    }

    @Override // defpackage.lhn
    public final void eQ() {
        synchronized (this.d) {
            this.e = defpackage.yhe.j(this.f.getAll());
            this.h = defpackage.yhe.j(this.i.getAll());
            this.g = java.lang.Boolean.valueOf(this.k.getBoolean("CUSTOMIZATION_STATUS_KEY", false));
        }
    }

    public final void f(boolean z) {
        this.k.edit().putBoolean("CUSTOMIZATION_STATUS_KEY", z).commit();
    }

    public final boolean g(android.content.ComponentName componentName) {
        synchronized (this.d) {
            if (this.e == null) {
                return h(componentName);
            }
            return n(componentName);
        }
    }

    public final boolean h(android.content.ComponentName componentName) {
        return this.f.getBoolean(componentName.flattenToString(), true);
    }

    public final boolean i() {
        return this.k.getBoolean("CUSTOMIZATION_STATUS_KEY", false);
    }

    public final boolean j() {
        synchronized (this.d) {
            java.lang.Boolean bool = this.g;
            if (bool == null) {
                return i();
            }
            return bool.booleanValue();
        }
    }
}
