package com.waze.bw.b.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.a.p f17707a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.av.b.c f17708b;

    public n(com.waze.av.a.p pVar, com.waze.av.b.c cVar) {
        x.f(pVar, "wazeAddress");
        x.f(cVar, "eventInfo");
        this.f17707a = pVar;
        this.f17708b = cVar;
    }

    public final com.waze.av.a.p a() {
        return this.f17707a;
    }

    public final com.waze.av.b.c b() {
        return this.f17708b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return x.n(this.f17707a, nVar.f17707a) && x.n(this.f17708b, nVar.f17708b);
    }

    public final int hashCode() {
        return (this.f17707a.hashCode() * 31) + this.f17708b.hashCode();
    }

    public final String toString() {
        return "EtaRequest(wazeAddress=" + this.f17707a + ", eventInfo=" + this.f17708b + ")";
    }
}
