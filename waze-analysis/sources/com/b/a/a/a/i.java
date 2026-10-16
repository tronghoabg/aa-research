package com.b.a.a.a;

import android.support.v4.app.bd;
import com.b.b.a.n;
import com.b.b.a.o;
import com.b.b.a.x;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class i implements o {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.b.a.a.b.h f2536a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f2537b;

    i(j jVar, com.b.a.a.b.h hVar, c cVar) {
        this.f2536a = hVar;
        this.f2537b = cVar;
        Objects.requireNonNull(jVar);
    }

    @Override // com.b.b.a.o
    public final void a(n nVar) {
        com.b.a.a.b.k kVar = new com.b.a.a.b.k(nVar);
        com.google.firebase.h.c cVar = new com.google.firebase.h.c(kVar);
        com.b.a.a.b.i iVar = new com.b.a.a.b.i(kVar);
        bd bdVar = new bd(kVar);
        com.google.firebase.perf.e.f fVar = new com.google.firebase.perf.e.f((n) kVar);
        com.b.a.a.b.h hVar = this.f2536a;
        k kVar2 = new k(kVar, cVar, iVar, bdVar, fVar, hVar);
        kVar2.e();
        kVar.f(new com.b.a.a.b.i(kVar2));
        c cVar2 = this.f2537b;
        hVar.j(new f(this, kVar2, cVar2));
        x xVarW = kVar2.i().w();
        xVarW.c(new g(this, cVar2, kVar2));
        xVarW.g(new h(this, cVar2));
    }

    @Override // com.b.b.a.o
    public final void b(Throwable th) {
        com.b.b.a.i.g();
        this.f2536a.i();
        String strA = th instanceof com.b.b.a.a.a ? ((com.b.b.a.a.a) th).a() : null;
        String message = th.getMessage();
        if (!(th instanceof com.b.a.a.a.a.h)) {
            th = "com.spotify.error.client_authentication_failed".equals(strA) ? new com.b.a.a.a.a.a(message, th) : "com.spotify.error.unsupported_version".equals(strA) ? new com.b.a.a.a.a.i(message, th) : "com.spotify.error.offline_mode_active".equals(strA) ? new com.b.a.a.a.a.e(message, th) : "com.spotify.error.user_not_authorized".equals(strA) ? new com.b.a.a.a.a.j(message, th) : "com.spotify.error.not_logged_in".equals(strA) ? new com.b.a.a.a.a.d(message, th) : new com.b.b.b.a(message, th);
        }
        this.f2537b.b(th);
    }
}
