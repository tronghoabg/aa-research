package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dq {

    /* renamed from: a, reason: collision with root package name */
    private final i.b.l.cd f30109a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30110b;

    public dq(i.b.l.cd cdVar, int i2) {
        h.g.b.x.f(cdVar, "element");
        this.f30109a = cdVar;
        this.f30110b = i2;
    }

    public final int a() {
        return this.f30110b;
    }

    public final i.b.l.cd b() {
        return this.f30109a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq)) {
            return false;
        }
        dq dqVar = (dq) obj;
        return h.g.b.x.n(this.f30109a, dqVar.f30109a) && this.f30110b == dqVar.f30110b;
    }

    public final int hashCode() {
        return (this.f30109a.hashCode() * 31) + this.f30110b;
    }

    public final String toString() {
        return "Request(element=" + this.f30109a + ", routingId=" + this.f30110b + ")";
    }
}
