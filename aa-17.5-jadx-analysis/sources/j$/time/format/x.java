package j$.time.format;

import j$.time.ZoneId;
import j$.util.Objects;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class x {
    public final j$.time.temporal.k a;
    public final DateTimeFormatter b;
    public int c;

    public x(j$.time.temporal.k kVar, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.a aVar = dateTimeFormatter.d;
        if (aVar != null) {
            j$.time.chrono.a aVar2 = (j$.time.chrono.a) kVar.w(j$.time.temporal.o.b);
            ZoneId zoneId = (ZoneId) kVar.w(j$.time.temporal.o.a);
            j$.time.chrono.b bVarL = null;
            aVar = Objects.equals(aVar, aVar2) ? null : aVar;
            Objects.equals(null, zoneId);
            if (aVar != null) {
                j$.time.chrono.a aVar3 = aVar != null ? aVar : aVar2;
                if (aVar != null) {
                    if (kVar.d(j$.time.temporal.a.EPOCH_DAY)) {
                        bVarL = aVar3.l(kVar);
                    } else if (aVar != j$.time.chrono.s.c || aVar2 != null) {
                        for (j$.time.temporal.a aVar4 : j$.time.temporal.a.values()) {
                            if (aVar4.isDateBased() && kVar.d(aVar4)) {
                                j$.time.g.g(j$.time.e.a("Unable to apply override chronology '", String.valueOf(aVar), "' because the temporal object being formatted contains date fields but does not represent a whole date: ", String.valueOf(kVar)));
                                throw null;
                            }
                        }
                    }
                }
                kVar = new w(bVarL, kVar, aVar3, zoneId);
            }
        }
        this.a = kVar;
        this.b = dateTimeFormatter;
    }

    public final Long a(j$.time.temporal.n nVar) {
        int i = this.c;
        j$.time.temporal.k kVar = this.a;
        if (i <= 0 || kVar.d(nVar)) {
            return Long.valueOf(kVar.C(nVar));
        }
        return null;
    }

    public final Object b(j$.desugar.sun.nio.fs.n nVar) {
        j$.time.temporal.k kVar = this.a;
        Object objW = kVar.w(nVar);
        if (objW != null || this.c != 0) {
            return objW;
        }
        j$.time.g.g(j$.time.e.a("Unable to extract ", String.valueOf(nVar), " from temporal ", String.valueOf(kVar)));
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
