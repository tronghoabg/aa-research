package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* renamed from: j$.time.chrono.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2899g implements InterfaceC2897e, Temporal, j$.time.temporal.m, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* renamed from: a, reason: collision with root package name */
    private final transient InterfaceC2894b f37515a;

    /* renamed from: b, reason: collision with root package name */
    private final transient j$.time.k f37516b;

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object B(j$.time.temporal.r rVar) {
        return AbstractC2901i.l(this, rVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: F */
    public final /* synthetic */ int compareTo(InterfaceC2897e interfaceC2897e) {
        return AbstractC2901i.c(this, interfaceC2897e);
    }

    static C2899g S(InterfaceC2894b interfaceC2894b, j$.time.k kVar) {
        return new C2899g(interfaceC2894b, kVar);
    }

    static C2899g R(m mVar, Temporal temporal) {
        C2899g c2899g = (C2899g) temporal;
        if (mVar.equals(c2899g.f37515a.a())) {
            return c2899g;
        }
        throw new ClassCastException("Chronology mismatch, required: " + mVar.n() + ", actual: " + c2899g.f37515a.a().n());
    }

    @Override // j$.time.chrono.InterfaceC2897e
    public final m a() {
        return this.f37515a.a();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal o(long j8, ChronoUnit chronoUnit) {
        return R(this.f37515a.a(), j$.time.temporal.l.b(this, j8, chronoUnit));
    }

    private C2899g(InterfaceC2894b interfaceC2894b, j$.time.k kVar) {
        Objects.requireNonNull(interfaceC2894b, "date");
        Objects.requireNonNull(kVar, "time");
        this.f37515a = interfaceC2894b;
        this.f37516b = kVar;
    }

    private C2899g Y(Temporal temporal, j$.time.k kVar) {
        InterfaceC2894b interfaceC2894b = this.f37515a;
        return (interfaceC2894b == temporal && this.f37516b == kVar) ? this : new C2899g(AbstractC2896d.R(interfaceC2894b.a(), temporal), kVar);
    }

    @Override // j$.time.chrono.InterfaceC2897e
    public final InterfaceC2894b c() {
        return this.f37515a;
    }

    @Override // j$.time.chrono.InterfaceC2897e
    public final j$.time.k b() {
        return this.f37516b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar != null && qVar.t(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        return aVar.D() || aVar.T();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (!((j$.time.temporal.a) qVar).T()) {
                return this.f37515a.t(qVar);
            }
            j$.time.k kVar = this.f37516b;
            kVar.getClass();
            return j$.time.temporal.l.d(kVar, qVar);
        }
        return qVar.B(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int q(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).T() ? this.f37516b.q(qVar) : this.f37515a.q(qVar);
        }
        return t(qVar).a(w(qVar), qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).T() ? this.f37516b.w(qVar) : this.f37515a.w(qVar);
        }
        return qVar.s(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal s(j$.time.g gVar) {
        return Y(gVar, this.f37516b);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final C2899g d(long j8, j$.time.temporal.q qVar) {
        boolean z2 = qVar instanceof j$.time.temporal.a;
        InterfaceC2894b interfaceC2894b = this.f37515a;
        if (z2) {
            boolean zT = ((j$.time.temporal.a) qVar).T();
            j$.time.k kVar = this.f37516b;
            if (zT) {
                return Y(interfaceC2894b, kVar.d(j8, qVar));
            }
            return Y(interfaceC2894b.d(j8, qVar), kVar);
        }
        return R(interfaceC2894b.a(), qVar.w(this, j8));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final C2899g e(long j8, TemporalUnit temporalUnit) {
        boolean z2 = temporalUnit instanceof ChronoUnit;
        InterfaceC2894b interfaceC2894b = this.f37515a;
        if (z2) {
            int i5 = AbstractC2898f.f37514a[((ChronoUnit) temporalUnit).ordinal()];
            j$.time.k kVar = this.f37516b;
            switch (i5) {
                case 1:
                    return V(this.f37515a, 0L, 0L, 0L, j8);
                case 2:
                    C2899g c2899gY = Y(interfaceC2894b.e(j8 / 86400000000L, (TemporalUnit) ChronoUnit.DAYS), kVar);
                    return c2899gY.V(c2899gY.f37515a, 0L, 0L, 0L, (j8 % 86400000000L) * 1000);
                case 3:
                    C2899g c2899gY2 = Y(interfaceC2894b.e(j8 / 86400000, (TemporalUnit) ChronoUnit.DAYS), kVar);
                    return c2899gY2.V(c2899gY2.f37515a, 0L, 0L, 0L, (j8 % 86400000) * 1000000);
                case 4:
                    return U(j8);
                case 5:
                    return V(this.f37515a, 0L, j8, 0L, 0L);
                case 6:
                    return V(this.f37515a, j8, 0L, 0L, 0L);
                case 7:
                    C2899g c2899gY3 = Y(interfaceC2894b.e(j8 / 256, (TemporalUnit) ChronoUnit.DAYS), kVar);
                    return c2899gY3.V(c2899gY3.f37515a, (j8 % 256) * 12, 0L, 0L, 0L);
                default:
                    return Y(interfaceC2894b.e(j8, temporalUnit), kVar);
            }
        }
        return R(interfaceC2894b.a(), temporalUnit.o(this, j8));
    }

    final C2899g U(long j8) {
        return V(this.f37515a, 0L, 0L, j8, 0L);
    }

    private C2899g V(InterfaceC2894b interfaceC2894b, long j8, long j10, long j11, long j12) {
        long j13 = j8 | j10 | j11 | j12;
        j$.time.k kVarB0 = this.f37516b;
        if (j13 == 0) {
            return Y(interfaceC2894b, kVarB0);
        }
        long j14 = j10 / 1440;
        long j15 = j8 / 24;
        long j16 = (j10 % 1440) * 60000000000L;
        long j17 = ((j8 % 24) * 3600000000000L) + j16 + ((j11 % 86400) * 1000000000) + (j12 % 86400000000000L);
        long jJ0 = kVarB0.j0();
        long j18 = j17 + jJ0;
        long jF = j$.time.b.f(j18, 86400000000000L) + j15 + j14 + (j11 / 86400) + (j12 / 86400000000000L);
        long jE = j$.time.b.e(j18, 86400000000000L);
        if (jE != jJ0) {
            kVarB0 = j$.time.k.b0(jE);
        }
        return Y(interfaceC2894b.e(jF, (TemporalUnit) ChronoUnit.DAYS), kVarB0);
    }

    @Override // j$.time.chrono.InterfaceC2897e
    public final ChronoZonedDateTime p(ZoneId zoneId) {
        return l.R(zoneId, null, this);
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        InterfaceC2894b interfaceC2894b = this.f37515a;
        InterfaceC2897e interfaceC2897eC = interfaceC2894b.a().C(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.between(this, interfaceC2897eC);
        }
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        boolean z2 = ((ChronoUnit) temporalUnit).compareTo(chronoUnit) < 0;
        j$.time.k kVar = this.f37516b;
        if (!z2) {
            InterfaceC2894b interfaceC2894bC = interfaceC2897eC.c();
            if (interfaceC2897eC.b().compareTo(kVar) < 0) {
                interfaceC2894bC = interfaceC2894bC.o(1L, chronoUnit);
            }
            return interfaceC2894b.f(interfaceC2894bC, temporalUnit);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        long jW = interfaceC2897eC.w(aVar) - interfaceC2894b.w(aVar);
        switch (AbstractC2898f.f37514a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                jW = j$.time.b.g(jW, 86400000000000L);
                break;
            case 2:
                jW = j$.time.b.g(jW, 86400000000L);
                break;
            case 3:
                jW = j$.time.b.g(jW, 86400000L);
                break;
            case 4:
                jW = j$.time.b.g(jW, 86400);
                break;
            case 5:
                jW = j$.time.b.g(jW, 1440);
                break;
            case 6:
                jW = j$.time.b.g(jW, 24);
                break;
            case 7:
                jW = j$.time.b.g(jW, 2);
                break;
        }
        return j$.time.b.b(jW, kVar.f(interfaceC2897eC.b(), temporalUnit));
    }

    @Override // j$.time.temporal.m
    public final Temporal D(Temporal temporal) {
        return temporal.d(c().x(), j$.time.temporal.a.EPOCH_DAY).d(b().j0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    private Object writeReplace() {
        return new F((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.f37515a);
        objectOutput.writeObject(this.f37516b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC2897e) && AbstractC2901i.c(this, (InterfaceC2897e) obj) == 0;
    }

    public final int hashCode() {
        return this.f37515a.hashCode() ^ this.f37516b.hashCode();
    }

    public final Instant W(ZoneOffset zoneOffset) {
        return Instant.X(AbstractC2901i.o(this, zoneOffset), this.f37516b.X());
    }

    public final String toString() {
        return this.f37515a.toString() + "T" + this.f37516b.toString();
    }
}
