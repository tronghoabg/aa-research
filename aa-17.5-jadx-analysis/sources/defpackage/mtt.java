package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class mtt {
    public noh b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    final /* synthetic */ mtv j;
    private final SharedPreferences k;
    public final nso a = nsr.c().b();
    public boolean i = true;

    public mtt(mtv mtvVar) {
        this.j = mtvVar;
        SharedPreferences sharedPreferences = mki.a.c.getSharedPreferences("DashWinController_Pref_File", 0);
        sharedPreferences.getClass();
        this.k = sharedPreferences;
    }

    public final int a() {
        return this.k.getInt("DashWinController_SavedDragStep", 1);
    }

    public final void b(muc mucVar) {
        this.j.c.m(mucVar);
    }

    public final void c(int i) {
        SharedPreferences.Editor editorEdit = this.k.edit();
        editorEdit.getClass();
        mtv.b.l().w("Saved drag step: %d", i);
        editorEdit.putInt("DashWinController_SavedDragStep", i);
        editorEdit.apply();
    }
}
