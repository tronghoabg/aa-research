package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC2894b;
import j$.time.temporal.TemporalAccessor;

/* loaded from: classes2.dex */
final class s implements TemporalAccessor {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2894b f37612a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TemporalAccessor f37613b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j$.time.chrono.m f37614c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ZoneId f37615d;

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int q(j$.time.temporal.q qVar) {
        return j$.time.temporal.l.a(this, qVar);
    }

    s(InterfaceC2894b interfaceC2894b, TemporalAccessor temporalAccessor, j$.time.chrono.m mVar, ZoneId zoneId) {
        this.f37612a = interfaceC2894b;
        this.f37613b = temporalAccessor;
        this.f37614c = mVar;
        this.f37615d = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        InterfaceC2894b interfaceC2894b = this.f37612a;
        if (interfaceC2894b != null && qVar.D()) {
            return interfaceC2894b.g(qVar);
        }
        return this.f37613b.g(qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        InterfaceC2894b interfaceC2894b = this.f37612a;
        if (interfaceC2894b != null && qVar.D()) {
            return interfaceC2894b.t(qVar);
        }
        return this.f37613b.t(qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        InterfaceC2894b interfaceC2894b = this.f37612a;
        if (interfaceC2894b != null && qVar.D()) {
            return interfaceC2894b.w(qVar);
        }
        return this.f37613b.w(qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object B(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.e()) {
            return this.f37614c;
        }
        if (rVar == j$.time.temporal.l.k()) {
            return this.f37615d;
        }
        if (rVar == j$.time.temporal.l.i()) {
            return this.f37613b.B(rVar);
        }
        return rVar.h(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.m mVar = this.f37614c;
        if (mVar != null) {
            str = " with chronology " + mVar;
        } else {
            str = "";
        }
        ZoneId zoneId = this.f37615d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.f37613b + str + str2;
    }
}
