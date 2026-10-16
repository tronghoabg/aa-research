package android.support.v7.app;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ay extends android.support.v7.view.b implements android.support.v7.view.menu.o {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ az f559a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f560b;

    /* renamed from: c, reason: collision with root package name */
    private final android.support.v7.view.menu.q f561c;

    /* renamed from: d, reason: collision with root package name */
    private android.support.v7.view.a f562d;

    /* renamed from: e, reason: collision with root package name */
    private WeakReference f563e;

    public ay(az azVar, Context context, android.support.v7.view.a aVar) {
        this.f559a = azVar;
        this.f560b = context;
        this.f562d = aVar;
        android.support.v7.view.menu.q qVar = new android.support.v7.view.menu.q(context);
        qVar.J();
        this.f561c = qVar;
        qVar.t(this);
    }

    @Override // android.support.v7.view.menu.o
    public final void O(android.support.v7.view.menu.q qVar) {
        if (this.f562d == null) {
            return;
        }
        g();
        this.f559a.f567d.s();
    }

    @Override // android.support.v7.view.menu.o
    public final boolean U(android.support.v7.view.menu.q qVar, MenuItem menuItem) {
        android.support.v7.view.a aVar = this.f562d;
        if (aVar != null) {
            return aVar.b(this, menuItem);
        }
        return false;
    }

    @Override // android.support.v7.view.b
    public final Menu a() {
        return this.f561c;
    }

    @Override // android.support.v7.view.b
    public final MenuInflater b() {
        return new android.support.v7.view.i(this.f560b);
    }

    @Override // android.support.v7.view.b
    public final View c() {
        WeakReference weakReference = this.f563e;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // android.support.v7.view.b
    public final CharSequence d() {
        return this.f559a.f567d.h();
    }

    @Override // android.support.v7.view.b
    public final CharSequence e() {
        return this.f559a.f567d.i();
    }

    @Override // android.support.v7.view.b
    public final void f() {
        az azVar = this.f559a;
        if (azVar.f569f != this) {
            return;
        }
        if (az.q(azVar.f573j, false)) {
            this.f562d.a(this);
        } else {
            azVar.f570g = this;
            azVar.f571h = this.f562d;
        }
        this.f562d = null;
        azVar.k(false);
        azVar.f567d.j();
        azVar.f565b.g(azVar.f575l);
        azVar.f569f = null;
    }

    @Override // android.support.v7.view.b
    public final void g() {
        if (this.f559a.f569f != this) {
            return;
        }
        android.support.v7.view.menu.q qVar = this.f561c;
        qVar.x();
        try {
            this.f562d.d(this, qVar);
        } finally {
            this.f561c.w();
        }
    }

    @Override // android.support.v7.view.b
    public final void h(View view) {
        this.f559a.f567d.m(view);
        this.f563e = new WeakReference(view);
    }

    @Override // android.support.v7.view.b
    public final void i(int i2) {
        j(this.f559a.f564a.getResources().getString(i2));
    }

    @Override // android.support.v7.view.b
    public final void j(CharSequence charSequence) {
        this.f559a.f567d.n(charSequence);
    }

    @Override // android.support.v7.view.b
    public final void k(int i2) {
        l(this.f559a.f564a.getResources().getString(i2));
    }

    @Override // android.support.v7.view.b
    public final void l(CharSequence charSequence) {
        this.f559a.f567d.o(charSequence);
    }

    @Override // android.support.v7.view.b
    public final void m(boolean z) {
        super.m(z);
        this.f559a.f567d.p(z);
    }

    public final boolean n() {
        android.support.v7.view.menu.q qVar = this.f561c;
        qVar.x();
        try {
            return this.f562d.c(this, qVar);
        } finally {
            this.f561c.w();
        }
    }

    @Override // android.support.v7.view.b
    public final boolean o() {
        return this.f559a.f567d.q();
    }
}
