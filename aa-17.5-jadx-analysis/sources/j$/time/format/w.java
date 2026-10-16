package j$.time.format;

import j$.time.ZoneId;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class w implements j$.time.temporal.k {
    public final /* synthetic */ j$.time.chrono.b a;
    public final /* synthetic */ j$.time.temporal.k b;
    public final /* synthetic */ j$.time.chrono.a c;
    public final /* synthetic */ ZoneId d;

    public w(j$.time.chrono.b bVar, j$.time.temporal.k kVar, j$.time.chrono.a aVar, ZoneId zoneId) {
        this.a = bVar;
        this.b = kVar;
        this.c = aVar;
        this.d = zoneId;
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        j$.time.chrono.b bVar = this.a;
        return (bVar == null || !nVar.isDateBased()) ? this.b.C(nVar) : bVar.C(nVar);
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        j$.time.chrono.b bVar = this.a;
        return (bVar == null || !nVar.isDateBased()) ? this.b.d(nVar) : bVar.d(nVar);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ int h(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.a(this, nVar);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        j$.time.chrono.b bVar = this.a;
        return (bVar == null || !nVar.isDateBased()) ? this.b.l(nVar) : bVar.l(nVar);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        j$.time.chrono.a aVar = this.c;
        String strConcat = aVar != null ? " with chronology ".concat(String.valueOf(aVar)) : "";
        ZoneId zoneId = this.d;
        return strValueOf + strConcat + (zoneId != null ? " with zone ".concat(String.valueOf(zoneId)) : "");
    }

    @Override // j$.time.temporal.k
    public final Object w(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.o.b ? this.c : nVar == j$.time.temporal.o.a ? this.d : nVar == j$.time.temporal.o.c ? this.b.w(nVar) : nVar.c(this);
    }
}
