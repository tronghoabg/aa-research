package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class gm extends gl implements he {
    public final hg a;
    private final Context b;
    private final ActionBarContextView c;
    private final gk f;
    private WeakReference g;
    private boolean h;

    public gm(Context context, ActionBarContextView actionBarContextView, gk gkVar) {
        this.b = context;
        this.c = actionBarContextView;
        this.f = gkVar;
        hg hgVar = new hg(actionBarContextView.getContext());
        hgVar.C();
        this.a = hgVar;
        hgVar.b = this;
    }

    @Override // defpackage.he
    public final void I(hg hgVar) {
        g();
        this.c.o();
    }

    @Override // defpackage.he
    public final boolean M(hg hgVar, MenuItem menuItem) {
        return this.f.b(this, menuItem);
    }

    @Override // defpackage.gl
    public final Menu a() {
        return this.a;
    }

    @Override // defpackage.gl
    public final MenuInflater b() {
        return new gr(this.c.getContext());
    }

    @Override // defpackage.gl
    public final View c() {
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.gl
    public final CharSequence d() {
        return this.c.h;
    }

    @Override // defpackage.gl
    public final CharSequence e() {
        return this.c.g;
    }

    @Override // defpackage.gl
    public final void f() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f.a(this);
    }

    @Override // defpackage.gl
    public final void g() {
        this.f.d(this, this.a);
    }

    @Override // defpackage.gl
    public final void h(View view) {
        this.c.j(view);
        this.g = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.gl
    public final void i(int i) {
        j(this.b.getString(i));
    }

    @Override // defpackage.gl
    public final void j(CharSequence charSequence) {
        this.c.k(charSequence);
    }

    @Override // defpackage.gl
    public final void k(int i) {
        l(this.b.getString(i));
    }

    @Override // defpackage.gl
    public final void l(CharSequence charSequence) {
        this.c.l(charSequence);
    }

    @Override // defpackage.gl
    public final void m(boolean z) {
        this.e = z;
        this.c.m(z);
    }

    @Override // defpackage.gl
    public final boolean n() {
        return this.c.j;
    }
}
