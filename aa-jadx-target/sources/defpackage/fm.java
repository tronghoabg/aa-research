package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class fm extends defpackage.ef {
    public final android.view.Window.Callback a;
    boolean b;
    public final defpackage.nm c;
    final defpackage.izq d;
    private boolean e;
    private boolean f;
    private final java.util.ArrayList g = new java.util.ArrayList();
    private final java.lang.Runnable h = new defpackage.ap(this, 14, null);
    private final defpackage.izq i;

    public fm(android.support.v7.widget.Toolbar toolbar, java.lang.CharSequence charSequence, android.view.Window.Callback callback) {
        defpackage.izq izqVar = new defpackage.izq(this);
        this.i = izqVar;
        defpackage.nm nmVar = new defpackage.nm(toolbar, false);
        this.c = nmVar;
        callback.getClass();
        this.a = callback;
        nmVar.d = callback;
        toolbar.C = izqVar;
        nmVar.i(charSequence);
        this.d = new defpackage.izq(this);
    }

    @Override // defpackage.ef
    public final int a() {
        return this.c.b;
    }

    @Override // defpackage.ef
    public final android.content.Context b() {
        return this.c.a();
    }

    @Override // defpackage.ef
    public final void d(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        java.util.ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ee) arrayList.get(i)).a();
        }
    }

    @Override // defpackage.ef
    public final void e() {
        this.c.a.removeCallbacks(this.h);
    }

    @Override // defpackage.ef
    public final void g(boolean z) {
        w(true != z ? 0 : 4, 4);
    }

    @Override // defpackage.ef
    public final void i(int i) {
        defpackage.nm nmVar = this.c;
        nmVar.g(nmVar.a().getText(i));
    }

    @Override // defpackage.ef
    public final void j(java.lang.CharSequence charSequence) {
        this.c.g(charSequence);
    }

    @Override // defpackage.ef
    public final void k(java.lang.CharSequence charSequence) {
        this.c.i(charSequence);
    }

    @Override // defpackage.ef
    public final boolean l() {
        return this.c.k();
    }

    @Override // defpackage.ef
    public final boolean m() {
        defpackage.nm nmVar = this.c;
        if (!nmVar.j()) {
            return false;
        }
        nmVar.b();
        return true;
    }

    @Override // defpackage.ef
    public final boolean n() {
        android.support.v7.widget.Toolbar toolbar = this.c.a;
        java.lang.Runnable runnable = this.h;
        toolbar.removeCallbacks(runnable);
        int[] iArr = defpackage.ebt.a;
        toolbar.postOnAnimation(runnable);
        return true;
    }

    @Override // defpackage.ef
    public final boolean o(int i, android.view.KeyEvent keyEvent) {
        android.view.Menu menuV = v();
        if (menuV == null) {
            return false;
        }
        menuV.setQwertyMode(android.view.KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuV.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.ef
    public final boolean p(android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    @Override // defpackage.ef
    public final boolean q() {
        return this.c.m();
    }

    @Override // defpackage.ef
    public final void s() {
        w(2, 2);
    }

    @Override // defpackage.ef
    public final void t() {
        w(0, 8);
    }

    @Override // defpackage.ef
    public final void u() {
        this.c.e(null);
    }

    public final android.view.Menu v() {
        if (!this.e) {
            defpackage.nm nmVar = this.c;
            defpackage.fl flVar = new defpackage.fl(this);
            defpackage.it itVar = new defpackage.it(this, 1);
            android.support.v7.widget.Toolbar toolbar = nmVar.a;
            toolbar.y = flVar;
            toolbar.z = itVar;
            android.support.v7.widget.ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView != null) {
                actionMenuView.i(flVar, itVar);
            }
            this.e = true;
        }
        return this.c.a.f();
    }

    public final void w(int i, int i2) {
        defpackage.nm nmVar = this.c;
        nmVar.d((i & i2) | (nmVar.b & (~i2)));
    }

    @Override // defpackage.ef
    public final void r() {
    }

    @Override // defpackage.ef
    public final void f(boolean z) {
    }

    @Override // defpackage.ef
    public final void h(boolean z) {
    }
}
