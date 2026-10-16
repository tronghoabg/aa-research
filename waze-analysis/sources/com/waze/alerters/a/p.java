package com.waze.alerters.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.j f14179a;

    /* renamed from: b, reason: collision with root package name */
    private final o f14180b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14181c;

    public p(com.waze.j jVar, o oVar, int i2) {
        h.g.b.x.f(jVar, "alerter");
        h.g.b.x.f(oVar, "mode");
        this.f14179a = jVar;
        this.f14180b = oVar;
        this.f14181c = i2;
    }

    public static final p d(com.waze.j jVar, o oVar, int i2) {
        h.g.b.x.f(jVar, "alerter");
        h.g.b.x.f(oVar, "mode");
        return new p(jVar, oVar, i2);
    }

    public static /* synthetic */ p e(p pVar, com.waze.j jVar, o oVar, int i2, int i3) {
        if ((i3 & 1) != 0) {
            jVar = pVar.f14179a;
        }
        if ((i3 & 2) != 0) {
            oVar = pVar.f14180b;
        }
        if ((i3 & 4) != 0) {
            i2 = pVar.f14181c;
        }
        return d(jVar, oVar, i2);
    }

    public final int a() {
        return this.f14181c;
    }

    public final com.waze.j b() {
        return this.f14179a;
    }

    public final o c() {
        return this.f14180b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return h.g.b.x.n(this.f14179a, pVar.f14179a) && this.f14180b == pVar.f14180b && this.f14181c == pVar.f14181c;
    }

    public final int hashCode() {
        return (((this.f14179a.hashCode() * 31) + this.f14180b.hashCode()) * 31) + this.f14181c;
    }

    public final String toString() {
        return "State(alerter=" + this.f14179a + ", mode=" + this.f14180b + ", triggerDistanceMeters=" + this.f14181c + ")";
    }
}
