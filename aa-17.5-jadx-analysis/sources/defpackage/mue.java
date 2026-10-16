package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class mue {
    public final nso a = nsr.c().b();
    public noh b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final SharedPreferences g;
    public final /* synthetic */ mug h;

    public mue(mug mugVar) {
        this.h = mugVar;
        SharedPreferences sharedPreferences = mki.a.c.getSharedPreferences("DashWinController_Pref_File", 0);
        sharedPreferences.getClass();
        this.g = sharedPreferences;
    }

    public final void a(muc mucVar) {
        this.h.c.m(mucVar);
    }

    public final boolean b() {
        return this.g.getBoolean("DashWinController_IsFullScreenMaps", false);
    }
}
