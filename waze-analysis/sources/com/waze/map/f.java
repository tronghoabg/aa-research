package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f implements cl {

    /* renamed from: a, reason: collision with root package name */
    private final v f28879a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.p.a f28880b;

    public f(v vVar, com.waze.shared_infra.p.a aVar) {
        h.g.b.x.f(vVar, "renderThread");
        h.g.b.x.f(aVar, "bgThread");
        this.f28879a = vVar;
        this.f28880b = aVar;
    }

    @Override // com.waze.map.cl
    public final kotlinx.coroutines.ab a(cv cvVar) {
        h.g.b.x.f(cvVar, "mapType");
        cv cvVar2 = cv.f28707a;
        int iOrdinal = cvVar.ordinal();
        if (iOrdinal == 0) {
            int i2 = kotlinx.coroutines.av.f51370a;
            return kotlinx.coroutines.e.ac.f51860a.c();
        }
        if (iOrdinal == 1) {
            return this.f28880b.a();
        }
        throw new h.i();
    }

    @Override // com.waze.map.cl
    public final kotlinx.coroutines.ab b(cv cvVar) {
        h.g.b.x.f(cvVar, "mapType");
        cv cvVar2 = cv.f28707a;
        int iOrdinal = cvVar.ordinal();
        if (iOrdinal == 0) {
            int i2 = kotlinx.coroutines.av.f51370a;
            return kotlinx.coroutines.e.ac.f51860a.c();
        }
        if (iOrdinal == 1) {
            return this.f28879a.b();
        }
        throw new h.i();
    }
}
