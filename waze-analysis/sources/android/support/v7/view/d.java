package android.support.v7.view;

import android.content.Context;
import android.support.v7.view.menu.o;
import android.support.v7.view.menu.q;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class d extends b implements o {

    /* renamed from: a, reason: collision with root package name */
    private final Context f670a;

    /* renamed from: b, reason: collision with root package name */
    private final ActionBarContextView f671b;

    /* renamed from: c, reason: collision with root package name */
    private final a f672c;

    /* renamed from: d, reason: collision with root package name */
    private WeakReference f673d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f674e;

    /* renamed from: f, reason: collision with root package name */
    private final q f675f;

    public d(Context context, ActionBarContextView actionBarContextView, a aVar) {
        this.f670a = context;
        this.f671b = actionBarContextView;
        this.f672c = aVar;
        q qVar = new q(actionBarContextView.getContext());
        qVar.J();
        this.f675f = qVar;
        qVar.t(this);
    }

    @Override // android.support.v7.view.menu.o
    public final void O(q qVar) {
        g();
        this.f671b.s();
    }

    @Override // android.support.v7.view.menu.o
    public final boolean U(q qVar, MenuItem menuItem) {
        return this.f672c.b(this, menuItem);
    }

    @Override // android.support.v7.view.b
    public final Menu a() {
        return this.f675f;
    }

    @Override // android.support.v7.view.b
    public final MenuInflater b() {
        return new i(this.f671b.getContext());
    }

    @Override // android.support.v7.view.b
    public final View c() {
        WeakReference weakReference = this.f673d;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // android.support.v7.view.b
    public final CharSequence d() {
        return this.f671b.h();
    }

    @Override // android.support.v7.view.b
    public final CharSequence e() {
        return this.f671b.i();
    }

    @Override // android.support.v7.view.b
    public final void f() {
        if (this.f674e) {
            return;
        }
        this.f674e = true;
        this.f672c.a(this);
    }

    @Override // android.support.v7.view.b
    public final void g() {
        this.f672c.d(this, this.f675f);
    }

    @Override // android.support.v7.view.b
    public final void h(View view) {
        this.f671b.m(view);
        this.f673d = view != null ? new WeakReference(view) : null;
    }

    @Override // android.support.v7.view.b
    public final void i(int i2) {
        j(this.f670a.getString(i2));
    }

    @Override // android.support.v7.view.b
    public final void j(CharSequence charSequence) {
        this.f671b.n(charSequence);
    }

    @Override // android.support.v7.view.b
    public final void k(int i2) {
        l(this.f670a.getString(i2));
    }

    @Override // android.support.v7.view.b
    public final void l(CharSequence charSequence) {
        this.f671b.o(charSequence);
    }

    @Override // android.support.v7.view.b
    public final void m(boolean z) {
        super.m(z);
        this.f671b.p(z);
    }

    @Override // android.support.v7.view.b
    public final boolean o() {
        return this.f671b.q();
    }
}
