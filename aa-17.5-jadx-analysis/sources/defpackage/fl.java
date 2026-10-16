package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class fl extends ef {
    public final Window.Callback a;
    boolean b;
    public final nk c;
    final izj d;
    private boolean e;
    private boolean f;
    private final ArrayList g = new ArrayList();
    private final Runnable h = new ap(this, 17, null);
    private final izj i;

    public fl(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        izj izjVar = new izj(this);
        this.i = izjVar;
        nk nkVar = new nk(toolbar, false);
        this.c = nkVar;
        callback.getClass();
        this.a = callback;
        nkVar.d = callback;
        toolbar.C = izjVar;
        nkVar.i(charSequence);
        this.d = new izj(this);
    }

    @Override // defpackage.ef
    public final int a() {
        return this.c.b;
    }

    @Override // defpackage.ef
    public final Context b() {
        return this.c.a();
    }

    @Override // defpackage.ef
    public final void d(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        ArrayList arrayList = this.g;
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
        nk nkVar = this.c;
        nkVar.g(nkVar.a().getText(i));
    }

    @Override // defpackage.ef
    public final void j(CharSequence charSequence) {
        this.c.g(charSequence);
    }

    @Override // defpackage.ef
    public final void k(CharSequence charSequence) {
        this.c.i(charSequence);
    }

    @Override // defpackage.ef
    public final boolean l() {
        return this.c.k();
    }

    @Override // defpackage.ef
    public final boolean m() {
        nk nkVar = this.c;
        if (!nkVar.j()) {
            return false;
        }
        nkVar.b();
        return true;
    }

    @Override // defpackage.ef
    public final boolean n() {
        Toolbar toolbar = this.c.a;
        Runnable runnable = this.h;
        toolbar.removeCallbacks(runnable);
        int[] iArr = ebm.a;
        toolbar.postOnAnimation(runnable);
        return true;
    }

    @Override // defpackage.ef
    public final boolean o(int i, KeyEvent keyEvent) {
        Menu menuV = v();
        if (menuV == null) {
            return false;
        }
        menuV.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuV.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.ef
    public final boolean p(KeyEvent keyEvent) {
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

    public final Menu v() {
        if (!this.e) {
            nk nkVar = this.c;
            fk fkVar = new fk(this);
            is isVar = new is(this, 1);
            Toolbar toolbar = nkVar.a;
            toolbar.y = fkVar;
            toolbar.z = isVar;
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView != null) {
                actionMenuView.i(fkVar, isVar);
            }
            this.e = true;
        }
        return this.c.a.f();
    }

    public final void w(int i, int i2) {
        nk nkVar = this.c;
        nkVar.d((i & i2) | (nkVar.b & (~i2)));
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
