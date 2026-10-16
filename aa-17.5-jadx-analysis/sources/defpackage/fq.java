package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class fq extends gl implements he {
    public final hg a;
    public gk b;
    final /* synthetic */ fr c;
    private final Context f;
    private WeakReference g;

    public fq(fr frVar, Context context, gk gkVar) {
        this.c = frVar;
        this.f = context;
        this.b = gkVar;
        hg hgVar = new hg(context);
        hgVar.C();
        this.a = hgVar;
        hgVar.b = this;
    }

    @Override // defpackage.he
    public final void I(hg hgVar) {
        if (this.b == null) {
            return;
        }
        g();
        this.c.d.o();
    }

    @Override // defpackage.he
    public final boolean M(hg hgVar, MenuItem menuItem) {
        gk gkVar = this.b;
        if (gkVar != null) {
            return gkVar.b(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.gl
    public final Menu a() {
        return this.a;
    }

    @Override // defpackage.gl
    public final MenuInflater b() {
        return new gr(this.f);
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
        return this.c.d.h;
    }

    @Override // defpackage.gl
    public final CharSequence e() {
        return this.c.d.g;
    }

    @Override // defpackage.gl
    public final void f() {
        fr frVar = this.c;
        if (frVar.f != this) {
            return;
        }
        if (fr.y(frVar.k, false)) {
            this.b.a(this);
        } else {
            frVar.g = this;
            frVar.h = this.b;
        }
        this.b = null;
        frVar.v(false);
        ActionBarContextView actionBarContextView = frVar.d;
        if (actionBarContextView.i == null) {
            actionBarContextView.i();
        }
        frVar.b.k(frVar.m);
        frVar.f = null;
    }

    @Override // defpackage.gl
    public final void g() {
        if (this.c.f != this) {
            return;
        }
        hg hgVar = this.a;
        hgVar.s();
        try {
            this.b.d(this, hgVar);
        } finally {
            this.a.r();
        }
    }

    @Override // defpackage.gl
    public final void h(View view) {
        this.c.d.j(view);
        this.g = new WeakReference(view);
    }

    @Override // defpackage.gl
    public final void i(int i) {
        j(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.gl
    public final void j(CharSequence charSequence) {
        this.c.d.k(charSequence);
    }

    @Override // defpackage.gl
    public final void k(int i) {
        l(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.gl
    public final void l(CharSequence charSequence) {
        this.c.d.l(charSequence);
    }

    @Override // defpackage.gl
    public final void m(boolean z) {
        this.e = z;
        this.c.d.m(z);
    }

    @Override // defpackage.gl
    public final boolean n() {
        return this.c.d.j;
    }
}
