package android.support.v4.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.core.util.Preconditions;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class bd {

    /* renamed from: a, reason: collision with root package name */
    private final Object f169a;

    public bd(android.support.a.i iVar) {
        h.g.b.x.f(iVar, "callback");
        this.f169a = iVar;
    }

    public static bd o(ba baVar) {
        Preconditions.checkNotNull(baVar, "callbacks == null");
        return new bd(baVar);
    }

    public final bv a() {
        return ((ba) this.f169a).k();
    }

    public final View b(View view, String str, Context context, AttributeSet attributeSet) {
        return ((ba) this.f169a).k().v().onCreateView(view, str, context, attributeSet);
    }

    public final void c() {
        ((ba) this.f169a).k().M();
    }

    public final void d() {
        ((ba) this.f169a).k().P();
    }

    public final void e() {
        ((ba) this.f169a).k().Q();
    }

    public final void f() {
        ((ba) this.f169a).k().X();
    }

    public final void g() {
        ((ba) this.f169a).k().aa();
    }

    public final void h() {
        ((ba) this.f169a).k().ab();
    }

    public final void i() {
        ((ba) this.f169a).k().ac();
    }

    public final void j() {
        ((ba) this.f169a).k().as();
    }

    public final boolean k(MenuItem menuItem) {
        return ((ba) this.f169a).k().aH(menuItem);
    }

    public final void l() {
        Object obj = this.f169a;
        ba baVar = (ba) obj;
        baVar.k().F(baVar, (ay) obj, null);
    }

    public final void m() {
        ((ba) this.f169a).k().be(true);
    }

    public final android.support.a.i n() {
        return (android.support.a.i) this.f169a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.b.b.c.a, java.lang.Object] */
    public final int p() {
        return this.f169a.a(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.b.b.c.a, java.lang.Object] */
    public final int q(int i2) {
        return this.f169a.a(i2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.b.b.c.a, java.lang.Object] */
    public final com.b.b.c.c r(int i2) {
        return this.f169a.b(i2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.b.b.c.a, java.lang.Object] */
    public final String s(int i2) {
        return this.f169a.c(i2);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.b.b.a.n, java.lang.Object] */
    public final com.b.b.a.b t(String str) {
        return this.f169a.b("com.spotify.set_saved", new com.b.b.d.k(str, true), com.b.b.d.c.class);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.b.b.a.n, java.lang.Object] */
    public final com.b.b.a.b u(String str) {
        return this.f169a.b("com.spotify.get_saved", new com.b.b.d.f(str), com.b.b.d.k.class);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.b.b.a.n, java.lang.Object] */
    public final com.b.b.a.b v(String str) {
        return this.f169a.b("com.spotify.set_saved", new com.b.b.d.k(str, false), com.b.b.d.c.class);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.b.b.a.n, java.lang.Object] */
    public final com.b.b.a.x w() {
        return this.f169a.c("com.spotify.status", com.b.b.d.x.class);
    }

    private bd(ba baVar) {
        this.f169a = baVar;
    }

    public bd(Object obj) {
        this.f169a = obj;
    }
}
