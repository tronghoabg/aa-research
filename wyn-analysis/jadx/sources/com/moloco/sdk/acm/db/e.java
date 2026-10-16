package com.moloco.sdk.acm.db;

import S3.h;
import a9.C1342b;
import o3.g;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final MetricsDb_Impl f28362a;

    /* renamed from: b, reason: collision with root package name */
    public final d f28363b;

    /* renamed from: c, reason: collision with root package name */
    public final C1342b f28364c = new C1342b();

    /* renamed from: d, reason: collision with root package name */
    public final h f28365d;

    public e(MetricsDb_Impl metricsDb_Impl) {
        this.f28362a = metricsDb_Impl;
        this.f28363b = new d(this, metricsDb_Impl, 0);
        new d(this, metricsDb_Impl, 1);
        new h(metricsDb_Impl, 17);
        this.f28365d = new h(metricsDb_Impl, 18);
    }

    public final void a(a aVar) {
        MetricsDb_Impl metricsDb_Impl = this.f28362a;
        metricsDb_Impl.b();
        metricsDb_Impl.c();
        try {
            d dVar = this.f28363b;
            g gVarA = dVar.a();
            try {
                dVar.w(gVarA, aVar);
                gVarA.v();
                dVar.q(gVarA);
                metricsDb_Impl.n();
            } catch (Throwable th) {
                dVar.q(gVarA);
                throw th;
            }
        } finally {
            metricsDb_Impl.j();
        }
    }
}
