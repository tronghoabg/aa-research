package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qil implements android.content.SharedPreferences.OnSharedPreferenceChangeListener, defpackage.mkw {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.UserSettings");
    private final defpackage.mku b;
    private final defpackage.sdt c;
    private final android.content.SharedPreferences d;
    private final android.content.Context e;
    private android.app.backup.BackupManager f;

    public qil(android.content.Context context) {
        this.e = context;
        android.content.SharedPreferences sharedPreferencesA = ((defpackage.lbn) defpackage.mkp.a.i(defpackage.lbn.class)).a(context, "common_user_settings");
        this.d = sharedPreferencesA;
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("common_user_settings", 0);
        this.b = new defpackage.mku(context, sharedPreferencesA, sharedPreferences);
        this.c = new defpackage.sdu(context, sharedPreferencesA);
        sharedPreferencesA.registerOnSharedPreferenceChangeListener(this);
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
    }

    @Override // defpackage.mkw
    public final defpackage.mku a() {
        return this.b;
    }

    @Override // defpackage.mkw
    public final defpackage.sdt b() {
        return this.c;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str) throws wfo {
        defpackage.wfp.c();
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(7286)).M("Shared preferences changed, applying changes: %s allowlist has %s", str, defpackage.acxk.c().b);
        if (android.os.Build.VERSION.SDK_INT < 30 || !defpackage.acxk.c().b.contains(str)) {
            return;
        }
        android.app.backup.BackupManager backupManager = this.f;
        if (backupManager == null) {
            backupManager = new android.app.backup.BackupManager(this.e.getApplicationContext());
        }
        this.f = backupManager;
        ((defpackage.yqj) yqmVar.l().ai((char) 7287)).y("backupManager.dataChanged with key: %s", str);
        this.f.dataChanged();
    }
}
