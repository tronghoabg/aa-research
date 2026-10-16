package defpackage;

import android.app.backup.BackupManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

/* loaded from: classes.dex */
public final class qhp implements SharedPreferences.OnSharedPreferenceChangeListener, mkq {
    private static final yph a = yph.c("GH.UserSettings");
    private final mko b;
    private final scx c;
    private final SharedPreferences d;
    private final Context e;
    private BackupManager f;

    public qhp(Context context) {
        this.e = context;
        SharedPreferences sharedPreferencesA = ((lbi) mki.a.i(lbi.class)).a(context, "common_user_settings");
        this.d = sharedPreferencesA;
        SharedPreferences sharedPreferences = context.getSharedPreferences("common_user_settings", 0);
        this.b = new mko(context, sharedPreferencesA, sharedPreferences);
        this.c = new scy(context, sharedPreferencesA);
        sharedPreferencesA.registerOnSharedPreferenceChangeListener(this);
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
    }

    @Override // defpackage.mkq
    public final mko a() {
        return this.b;
    }

    @Override // defpackage.mkq
    public final scx b() {
        return this.c;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        wer.c();
        yph yphVar = a;
        ype ypeVar = (ype) ((ype) yphVar.f()).ai(7261);
        acwi acwiVar = acwi.a;
        ypeVar.M("Shared preferences changed, applying changes: %s allowlist has %s", str, acwiVar.gu().b().b);
        if (Build.VERSION.SDK_INT < 30 || !acwiVar.gu().b().b.contains(str)) {
            return;
        }
        BackupManager backupManager = this.f;
        if (backupManager == null) {
            backupManager = new BackupManager(this.e.getApplicationContext());
        }
        this.f = backupManager;
        ((ype) yphVar.l().ai((char) 7262)).y("backupManager.dataChanged with key: %s", str);
        this.f.dataChanged();
    }
}
