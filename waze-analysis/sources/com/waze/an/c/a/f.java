package com.waze.an.c.a;

import com.waze.an.c.ac;
import com.waze.an.c.ae;
import com.waze.an.c.af;
import h.g.b.x;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f implements af {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.an.a.a.g f14680a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.af f14681b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f14682c;

    /* renamed from: d, reason: collision with root package name */
    private final ch f14683d;

    /* renamed from: e, reason: collision with root package name */
    private final ae f14684e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.location.q f14685f;

    public f(com.waze.an.a.a.g gVar) {
        x.f(gVar, "approachingSegmentInsightDescriptor");
        this.f14680a = gVar;
        kotlinx.coroutines.af afVarP = com.waze.ui.a.l.p(this, null);
        this.f14681b = afVarP;
        this.f14685f = gVar.m();
        this.f14682c = ((com.waze.j) gVar.b().d()).c() != null;
        k kVar = new k(gVar.b(), this, 1);
        int i2 = bz.f51630a;
        this.f14683d = ai.V(kVar, afVarP, by.c(), k((com.waze.j) gVar.b().d()));
        this.f14684e = ae.f14750b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ac k(com.waze.j jVar) {
        return new ac(jVar.j(), jVar.o(), h.a.i.h(), new c((Object) this, 2, (char[]) null), new c((Object) this, 3, (short[]) null), 32);
    }

    @Override // com.waze.an.c.af
    public final ae a() {
        return this.f14684e;
    }

    @Override // com.waze.an.c.af
    public final ch b() {
        return this.f14683d;
    }

    @Override // com.waze.an.c.af
    public final /* bridge */ /* synthetic */ com.waze.an.e.g c(com.waze.an.e.a aVar) {
        x.f(aVar, "<this>");
        com.waze.an.a.a.g gVar = this.f14680a;
        return new com.waze.an.e.d(new com.waze.an.e.h(gVar.e(), gVar.g()));
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aj.h(this.f14681b, null);
    }

    @Override // com.waze.an.c.k
    public final void e() {
        this.f14680a.k();
    }

    @Override // com.waze.an.c.k
    public final void g() {
        this.f14680a.l();
    }

    @Override // com.waze.an.c.k
    public final com.waze.location.q h() {
        return this.f14685f;
    }

    public final boolean j() {
        return this.f14682c;
    }
}
