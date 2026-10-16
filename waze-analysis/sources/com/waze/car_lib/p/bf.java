package com.waze.car_lib.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bf extends com.waze.car_lib.m.c {

    /* renamed from: a, reason: collision with root package name */
    private final be f20619a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20620b;

    /* renamed from: c, reason: collision with root package name */
    private final h.o.a f20621c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private bf(be beVar, boolean z, h.o.a aVar) {
        super(null, null);
        h.g.b.x.f(beVar, "prediction");
        this.f20619a = beVar;
        this.f20620b = z;
        this.f20621c = aVar;
    }

    public static /* synthetic */ bf i(bf bfVar, be beVar, h.o.a aVar, int i2) {
        if ((i2 & 1) != 0) {
            beVar = bfVar.f20619a;
        }
        boolean z = (i2 & 2) != 0 ? bfVar.f20620b : false;
        if ((i2 & 4) != 0) {
            aVar = bfVar.f20621c;
        }
        h.g.b.x.f(beVar, "prediction");
        return new bf(beVar, z, aVar);
    }

    public final be a() {
        return this.f20619a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf)) {
            return false;
        }
        bf bfVar = (bf) obj;
        return h.g.b.x.n(this.f20619a, bfVar.f20619a) && this.f20620b == bfVar.f20620b && h.g.b.x.n(this.f20621c, bfVar.f20621c);
    }

    public final h.o.a g() {
        return this.f20621c;
    }

    public final boolean h() {
        return this.f20620b;
    }

    public final int hashCode() {
        int iHashCode = this.f20619a.hashCode() * 31;
        h.o.a aVar = this.f20621c;
        return ((iHashCode + a.a.a(this.f20620b)) * 31) + (aVar == null ? 0 : a.a.b(aVar.w()));
    }

    public final String toString() {
        return "Data(prediction=" + this.f20619a + ", isRtlLanguage=" + this.f20620b + ", timerDuration=" + this.f20621c + ")";
    }

    public /* synthetic */ bf(be beVar, boolean z) {
        this(beVar, z, null);
    }
}
