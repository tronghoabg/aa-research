package com.google.firebase.perf.network;

import com.google.firebase.perf.e.m;
import java.io.IOException;
import okhttp3.al;
import okhttp3.aq;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g implements okhttp3.g {

    /* renamed from: a, reason: collision with root package name */
    private final okhttp3.g f10554a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.perf.metrics.f f10555b;

    /* renamed from: c, reason: collision with root package name */
    private final m f10556c;

    /* renamed from: d, reason: collision with root package name */
    private final long f10557d;

    public g(okhttp3.g gVar, com.google.firebase.perf.d.f fVar, m mVar, long j2) {
        this.f10554a = gVar;
        this.f10555b = com.google.firebase.perf.metrics.f.b(fVar);
        this.f10557d = j2;
        this.f10556c = mVar;
    }

    @Override // okhttp3.g
    public final void a(okhttp3.f fVar, IOException iOException) {
        al alVarA = fVar.a();
        if (alVarA != null) {
            com.google.firebase.perf.metrics.f fVar2 = this.f10555b;
            fVar2.p(alVarA.g().j().toString());
            if (alVarA.c() != null) {
                fVar2.f(alVarA.c());
            }
        }
        com.google.firebase.perf.metrics.f fVar3 = this.f10555b;
        fVar3.j(this.f10557d);
        fVar3.n(this.f10556c.b());
        h.c(fVar3);
        this.f10554a.a(fVar, iOException);
    }

    @Override // okhttp3.g
    public final void b(okhttp3.f fVar, aq aqVar) {
        FirebasePerfOkHttpClient.a(aqVar, this.f10555b, this.f10557d, this.f10556c.b());
        this.f10554a.b(fVar, aqVar);
    }
}
