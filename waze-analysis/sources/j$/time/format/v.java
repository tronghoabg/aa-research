package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalAccessor;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class v implements TemporalAccessor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j$.time.chrono.b f49995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TemporalAccessor f49996b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Chronology f49997c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ZoneId f49998d;

    public v(j$.time.chrono.b bVar, TemporalAccessor temporalAccessor, Chronology chronology, ZoneId zoneId) {
        this.f49995a = bVar;
        this.f49996b = temporalAccessor;
        this.f49997c = chronology;
        this.f49998d = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.m mVar) {
        j$.time.chrono.b bVar = this.f49995a;
        return (bVar == null || !mVar.isDateBased()) ? this.f49996b.D(mVar) : bVar.D(mVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.m mVar) {
        j$.time.chrono.b bVar = this.f49995a;
        return (bVar == null || !mVar.isDateBased()) ? this.f49996b.c(mVar) : bVar.c(mVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int f(j$.time.temporal.m mVar) {
        return j$.time.temporal.n.a(this, mVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(j$.time.temporal.m mVar) {
        j$.time.chrono.b bVar = this.f49995a;
        return (bVar == null || !mVar.isDateBased()) ? this.f49996b.k(mVar) : bVar.k(mVar);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f49996b);
        Chronology chronology = this.f49997c;
        String strConcat = chronology != null ? " with chronology ".concat(String.valueOf(chronology)) : "";
        ZoneId zoneId = this.f49998d;
        return j$.desugar.sun.nio.fs.h.a(strValueOf, strConcat, zoneId != null ? " with zone ".concat(String.valueOf(zoneId)) : "");
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object x(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.n.f50066b ? this.f49997c : nVar == j$.time.temporal.n.f50065a ? this.f49998d : nVar == j$.time.temporal.n.f50067c ? this.f49996b.x(nVar) : nVar.d(this);
    }
}
