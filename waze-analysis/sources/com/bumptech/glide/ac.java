package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ac implements ComponentCallbacks2, com.bumptech.glide.manager.g {

    /* renamed from: d, reason: collision with root package name */
    private static final com.bumptech.glide.e.i f2741d;

    /* renamed from: a, reason: collision with root package name */
    protected final c f2742a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f2743b;

    /* renamed from: c, reason: collision with root package name */
    final com.bumptech.glide.manager.f f2744c;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.manager.p f2745e;

    /* renamed from: f, reason: collision with root package name */
    private final com.bumptech.glide.manager.o f2746f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.manager.w f2747g;

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f2748h;

    /* renamed from: i, reason: collision with root package name */
    private final com.bumptech.glide.manager.c f2749i;

    /* renamed from: j, reason: collision with root package name */
    private final CopyOnWriteArrayList f2750j;

    /* renamed from: k, reason: collision with root package name */
    private com.bumptech.glide.e.i f2751k;

    static {
        com.bumptech.glide.e.i iVarB = com.bumptech.glide.e.i.b(Bitmap.class);
        iVarB.ab();
        f2741d = iVarB;
        com.bumptech.glide.e.i.b(com.bumptech.glide.load.c.d.e.class).ab();
    }

    public ac(c cVar, com.bumptech.glide.manager.f fVar, com.bumptech.glide.manager.o oVar, Context context) {
        com.bumptech.glide.manager.p pVar = new com.bumptech.glide.manager.p();
        this.f2747g = new com.bumptech.glide.manager.w();
        aa aaVar = new aa(this);
        this.f2748h = aaVar;
        this.f2742a = cVar;
        this.f2744c = fVar;
        this.f2746f = oVar;
        this.f2745e = pVar;
        this.f2743b = context;
        com.bumptech.glide.manager.c cVarA = com.bumptech.glide.manager.e.a(context.getApplicationContext(), new ab(this, pVar));
        this.f2749i = cVarA;
        cVar.i(this);
        if (com.bumptech.glide.g.r.l()) {
            com.bumptech.glide.g.r.i(aaVar);
        } else {
            fVar.a(this);
        }
        fVar.a(cVarA);
        this.f2750j = new CopyOnWriteArrayList(cVar.c().g());
        l(cVar.c().f());
    }

    private final synchronized void o() {
        com.bumptech.glide.manager.w wVar = this.f2747g;
        Iterator it = wVar.a().iterator();
        while (it.hasNext()) {
            f((com.bumptech.glide.e.a.g) it.next());
        }
        wVar.b();
    }

    public final z a(Class cls) {
        return new z(this.f2742a, this, cls, this.f2743b);
    }

    public final z b() {
        return a(Bitmap.class).i(f2741d);
    }

    public final z c() {
        return a(Drawable.class);
    }

    final synchronized com.bumptech.glide.e.i d() {
        return this.f2751k;
    }

    final List e() {
        return this.f2750j;
    }

    public final void f(com.bumptech.glide.e.a.g gVar) {
        if (gVar == null) {
            return;
        }
        boolean zN = n(gVar);
        com.bumptech.glide.e.d dVarBm = gVar.bm();
        if (zN || this.f2742a.k(gVar) || dVarBm == null) {
            return;
        }
        gVar.f(null);
        dVarBm.c();
    }

    @Override // com.bumptech.glide.manager.g
    public final synchronized void g() {
        this.f2747g.g();
        o();
        this.f2745e.a();
        com.bumptech.glide.manager.f fVar = this.f2744c;
        fVar.b(this);
        fVar.b(this.f2749i);
        com.bumptech.glide.g.r.j(this.f2748h);
        this.f2742a.j(this);
    }

    @Override // com.bumptech.glide.manager.g
    public final synchronized void h() {
        k();
        this.f2747g.h();
    }

    @Override // com.bumptech.glide.manager.g
    public final synchronized void i() {
        this.f2747g.i();
        j();
    }

    public final synchronized void j() {
        this.f2745e.b();
    }

    public final synchronized void k() {
        this.f2745e.d();
    }

    protected final synchronized void l(com.bumptech.glide.e.i iVar) {
        com.bumptech.glide.e.i iVar2 = (com.bumptech.glide.e.i) iVar.j();
        iVar2.ae();
        this.f2751k = iVar2;
    }

    final synchronized void m(com.bumptech.glide.e.a.g gVar, com.bumptech.glide.e.d dVar) {
        this.f2747g.c(gVar);
        this.f2745e.e(dVar);
    }

    final synchronized boolean n(com.bumptech.glide.e.a.g gVar) {
        com.bumptech.glide.e.d dVarBm = gVar.bm();
        if (dVarBm == null) {
            return true;
        }
        if (!this.f2745e.f(dVarBm)) {
            return false;
        }
        this.f2747g.d(gVar);
        gVar.f(null);
        return true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
    }

    public final synchronized String toString() {
        com.bumptech.glide.manager.o oVar;
        com.bumptech.glide.manager.p pVar;
        oVar = this.f2746f;
        pVar = this.f2745e;
        return super.toString() + "{tracker=" + String.valueOf(pVar) + ", treeNode=" + String.valueOf(oVar) + "}";
    }
}
