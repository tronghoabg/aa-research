package com.waze.bw.b.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f17691a;

    /* renamed from: b, reason: collision with root package name */
    private final j f17692b;

    /* renamed from: c, reason: collision with root package name */
    private final long f17693c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(String str, j jVar, long j2) {
        super(null);
        x.f(str, "requestId");
        this.f17691a = str;
        this.f17692b = jVar;
        this.f17693c = j2;
    }

    public final long a() {
        return this.f17693c;
    }

    @Override // com.waze.bw.b.a.f
    public final j c() {
        return this.f17692b;
    }

    @Override // com.waze.bw.b.a.f
    public final String d() {
        return this.f17691a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return x.n(this.f17691a, eVar.f17691a) && this.f17692b == eVar.f17692b && h.o.a.A(this.f17693c, eVar.f17693c);
    }

    public final int hashCode() {
        int iHashCode = this.f17691a.hashCode() * 31;
        j jVar = this.f17692b;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        long j2 = this.f17693c;
        h.o.c cVar = h.o.a.f48264a;
        return iHashCode2 + a.a.b(j2);
    }

    public final String toString() {
        return "Now(requestId=" + this.f17691a + ", trafficInfo=" + this.f17692b + ", routeDuration=" + h.o.a.y(this.f17693c) + ")";
    }
}
