package com.waze.bd.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.a.p f16221a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.av.a.p f16222b;

    /* renamed from: c, reason: collision with root package name */
    private final o f16223c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f16224d;

    /* renamed from: e, reason: collision with root package name */
    private final l f16225e;

    /* renamed from: f, reason: collision with root package name */
    private final t f16226f;

    public u(com.waze.av.a.p pVar, com.waze.av.a.p pVar2, o oVar, Integer num, l lVar, t tVar) {
        x.f(pVar2, "destination");
        x.f(lVar, "destinationType");
        x.f(tVar, "driveType");
        this.f16221a = pVar;
        this.f16222b = pVar2;
        this.f16223c = oVar;
        this.f16224d = num;
        this.f16225e = lVar;
        this.f16226f = tVar;
    }

    public final com.waze.av.a.p a() {
        return this.f16222b;
    }

    public final l b() {
        return this.f16225e;
    }

    public final t c() {
        return this.f16226f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return x.n(this.f16221a, uVar.f16221a) && x.n(this.f16222b, uVar.f16222b) && x.n(this.f16223c, uVar.f16223c) && x.n(this.f16224d, uVar.f16224d) && x.n(this.f16225e, uVar.f16225e) && x.n(this.f16226f, uVar.f16226f);
    }

    public final int hashCode() {
        com.waze.av.a.p pVar = this.f16221a;
        int iHashCode = ((pVar == null ? 0 : pVar.hashCode()) * 31) + this.f16222b.hashCode();
        o oVar = this.f16223c;
        int iHashCode2 = ((iHashCode * 31) + (oVar == null ? 0 : oVar.hashCode())) * 31;
        Integer num = this.f16224d;
        return ((((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + this.f16225e.hashCode()) * 31) + this.f16226f.hashCode();
    }

    public final String toString() {
        return "PredictionData(origin=" + this.f16221a + ", destination=" + this.f16222b + ", driveTime=" + this.f16223c + ", driveId=" + this.f16224d + ", destinationType=" + this.f16225e + ", driveType=" + this.f16226f + ")";
    }
}
