package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mul {
    public final defpackage.ntb a = defpackage.nte.c().b();
    public defpackage.noz b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final android.content.SharedPreferences g;
    public final /* synthetic */ defpackage.mun h;

    public mul(defpackage.mun munVar) {
        this.h = munVar;
        android.content.SharedPreferences sharedPreferences = defpackage.mkp.a.c.getSharedPreferences("DashWinController_Pref_File", 0);
        sharedPreferences.getClass();
        this.g = sharedPreferences;
    }

    public final void a(defpackage.mui muiVar) {
        this.h.c.m(muiVar);
    }

    public final boolean b() {
        return this.g.getBoolean("DashWinController_IsFullScreenMaps", false);
    }
}
