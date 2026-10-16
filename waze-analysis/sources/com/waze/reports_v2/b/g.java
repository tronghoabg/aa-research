package com.waze.reports_v2.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g extends i {

    /* renamed from: a, reason: collision with root package name */
    private final int f34096a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34097b;

    /* renamed from: c, reason: collision with root package name */
    private final s f34098c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f34099d;

    /* renamed from: e, reason: collision with root package name */
    private final Integer f34100e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i2, int i3, s sVar, com.waze.shared_infra.h.c cVar, Integer num) {
        super(null);
        h.g.b.x.f(sVar, "useCase");
        this.f34096a = i2;
        this.f34097b = i3;
        this.f34098c = sVar;
        this.f34099d = cVar;
        this.f34100e = num;
    }

    public final int a() {
        return this.f34096a;
    }

    public final int b() {
        return this.f34097b;
    }

    public final s c() {
        return this.f34098c;
    }

    public final com.waze.shared_infra.h.c d() {
        return this.f34099d;
    }

    public final Integer e() {
        return this.f34100e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f34096a == gVar.f34096a && this.f34097b == gVar.f34097b && this.f34098c == gVar.f34098c && h.g.b.x.n(this.f34099d, gVar.f34099d) && h.g.b.x.n(this.f34100e, gVar.f34100e);
    }

    public final int hashCode() {
        return (((((((this.f34096a * 31) + this.f34097b) * 31) + this.f34098c.hashCode()) * 31) + this.f34099d.hashCode()) * 31) + this.f34100e.hashCode();
    }

    public final String toString() {
        return "ClosureReportAdditionalData(fromNodeId=" + this.f34096a + ", toNodeId=" + this.f34097b + ", useCase=" + this.f34098c + ", segmentStartPosition=" + this.f34099d + ", azimuth=" + this.f34100e + ")";
    }
}
