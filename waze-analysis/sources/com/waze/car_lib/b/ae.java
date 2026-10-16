package com.waze.car_lib.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ae implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.b.am f18951a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.an.a.l f18952b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f18953c;

    ae(h.g.b.am amVar, com.waze.an.a.l lVar, int i2) {
        this.f18953c = i2;
        this.f18951a = amVar;
        this.f18952b = lVar;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f18953c;
        h.g.b.am amVar = this.f18951a;
        if (i2 != 0) {
            amVar.f48101a = true;
            this.f18952b.l();
            return h.ab.f48028a;
        }
        if (amVar.f48101a) {
            amVar.f48101a = false;
            this.f18952b.k();
        }
        return h.ab.f48028a;
    }
}
