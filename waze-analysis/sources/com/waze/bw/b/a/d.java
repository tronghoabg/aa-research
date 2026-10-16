package com.waze.bw.b.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f17687a;

    /* renamed from: b, reason: collision with root package name */
    private final j f17688b;

    /* renamed from: c, reason: collision with root package name */
    private final long f17689c;

    /* renamed from: d, reason: collision with root package name */
    private final long f17690d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, j jVar, long j2, long j3) {
        super(null);
        x.f(str, "requestId");
        this.f17687a = str;
        this.f17688b = jVar;
        this.f17689c = j2;
        this.f17690d = j3;
    }

    public final long a() {
        return this.f17690d;
    }

    public final long b() {
        return this.f17689c;
    }

    @Override // com.waze.bw.b.a.f
    public final j c() {
        return this.f17688b;
    }

    @Override // com.waze.bw.b.a.f
    public final String d() {
        return this.f17687a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return x.n(this.f17687a, dVar.f17687a) && this.f17688b == dVar.f17688b && this.f17689c == dVar.f17689c && this.f17690d == dVar.f17690d;
    }

    public final int hashCode() {
        int iHashCode = this.f17687a.hashCode() * 31;
        j jVar = this.f17688b;
        return ((((iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31) + a.a.b(this.f17689c)) * 31) + a.a.b(this.f17690d);
    }

    public final String toString() {
        return "Future(requestId=" + this.f17687a + ", trafficInfo=" + this.f17688b + ", departureTimeEpocSec=" + this.f17689c + ", arrivalTimeEpocSec=" + this.f17690d + ")";
    }
}
