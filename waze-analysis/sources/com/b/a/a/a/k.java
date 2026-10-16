package com.b.a.a.a;

import android.content.Context;
import android.support.v4.app.bd;
import com.b.b.a.n;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2538a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final com.b.a.a.b.j f2539b = new com.b.a.a.b.j();

    /* renamed from: c, reason: collision with root package name */
    private static final d f2540c = new j();

    /* renamed from: d, reason: collision with root package name */
    private final n f2541d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f2542e;

    /* renamed from: f, reason: collision with root package name */
    private final com.b.a.a.b.h f2543f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.firebase.h.c f2544g;

    /* renamed from: h, reason: collision with root package name */
    private final com.b.a.a.b.i f2545h;

    /* renamed from: i, reason: collision with root package name */
    private final com.google.firebase.perf.e.f f2546i;

    /* renamed from: j, reason: collision with root package name */
    private final bd f2547j;

    static {
        com.b.a.a.b.a aVar = new com.b.a.a.b.a();
        com.b.b.a.i.c(aVar);
        com.b.b.a.i.b(aVar);
    }

    k(n nVar, com.google.firebase.h.c cVar, com.b.a.a.b.i iVar, bd bdVar, com.google.firebase.perf.e.f fVar, com.b.a.a.b.h hVar) {
        this.f2541d = nVar;
        this.f2544g = cVar;
        this.f2545h = iVar;
        this.f2547j = bdVar;
        this.f2546i = fVar;
        this.f2543f = hVar;
    }

    public static void a(Context context, b bVar, c cVar) {
        d dVar = f2540c;
        if (!com.b.a.a.b.j.b(context)) {
            cVar.b(new com.b.a.a.a.a.b());
        } else {
            com.b.a.a.b.h hVarC = com.b.a.a.b.h.c(context, bVar, com.b.a.a.b.j.a(context));
            hVarC.h(new i((j) dVar, hVarC, cVar));
        }
    }

    public static void b(k kVar) {
        if (kVar == null || !kVar.f2542e) {
            return;
        }
        kVar.c();
    }

    final void c() {
        this.f2542e = false;
        this.f2541d.e();
        this.f2543f.i();
    }

    public final boolean d() {
        return this.f2542e;
    }

    final void e() {
        this.f2542e = true;
    }

    public final com.google.firebase.perf.e.f f() {
        return this.f2546i;
    }

    public final com.b.a.a.b.i g() {
        return this.f2545h;
    }

    public final com.google.firebase.h.c h() {
        return this.f2544g;
    }

    public final bd i() {
        return this.f2547j;
    }
}
