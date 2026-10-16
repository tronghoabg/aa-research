package com.waze.an.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f14523a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.waze.an.a.u f14524b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f14525c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.waze.asks.av f14526d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f14527e;

    public /* synthetic */ w(y yVar, com.waze.asks.av avVar, h.g.a.l lVar, com.waze.an.a.u uVar, int i2) {
        this.f14527e = i2;
        this.f14525c = yVar;
        this.f14526d = avVar;
        this.f14523a = lVar;
        this.f14524b = uVar;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        if (this.f14527e != 0) {
            com.waze.an.a.u uVar = this.f14524b;
            h.g.a.l lVar = this.f14523a;
            return y.h(this.f14525c, this.f14526d, lVar, uVar);
        }
        com.waze.asks.av avVar = this.f14526d;
        y yVar = this.f14525c;
        return y.e(this.f14523a, this.f14524b, yVar, avVar);
    }

    public /* synthetic */ w(h.g.a.l lVar, com.waze.an.a.u uVar, y yVar, com.waze.asks.av avVar, int i2) {
        this.f14527e = i2;
        this.f14523a = lVar;
        this.f14524b = uVar;
        this.f14525c = yVar;
        this.f14526d = avVar;
    }
}
