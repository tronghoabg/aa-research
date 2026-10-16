package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class y extends AbstractC2896d {

    /* renamed from: d, reason: collision with root package name */
    static final j$.time.g f37548d = j$.time.g.g0(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* renamed from: a, reason: collision with root package name */
    private final transient j$.time.g f37549a;

    /* renamed from: b, reason: collision with root package name */
    private transient z f37550b;

    /* renamed from: c, reason: collision with root package name */
    private transient int f37551c;

    y(j$.time.g gVar) {
        if (gVar.b0(f37548d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 is not supported");
        }
        z zVarH = z.h(gVar);
        this.f37550b = zVarH;
        this.f37551c = (gVar.a0() - zVarH.n().a0()) + 1;
        this.f37549a = gVar;
    }

    y(z zVar, int i5, j$.time.g gVar) {
        if (gVar.b0(f37548d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 is not supported");
        }
        this.f37550b = zVar;
        this.f37551c = i5;
        this.f37549a = gVar;
    }

    @Override // j$.time.chrono.InterfaceC2894b
    public final m a() {
        return w.f37546d;
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.chrono.InterfaceC2894b
    public final int hashCode() {
        w.f37546d.getClass();
        return this.f37549a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.chrono.InterfaceC2894b
    public final n E() {
        return this.f37550b;
    }

    public final z W() {
        return this.f37550b;
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.chrono.InterfaceC2894b, j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || qVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || qVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || qVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).D();
        }
        return qVar != null && qVar.t(this);
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.B(this);
        }
        if (!g(qVar)) {
            throw new j$.time.temporal.s(j$.time.d.a("Unsupported field: ", qVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i5 = x.f37547a[aVar.ordinal()];
        j$.time.g gVar = this.f37549a;
        if (i5 == 1) {
            return j$.time.temporal.t.j(1L, gVar.d0());
        }
        z zVar = this.f37550b;
        if (i5 != 2) {
            if (i5 != 3) {
                return w.f37546d.K(aVar);
            }
            int iA0 = zVar.n().a0();
            return zVar.r() != null ? j$.time.temporal.t.j(1L, (r0.n().a0() - iA0) + 1) : j$.time.temporal.t.j(1L, 999999999 - iA0);
        }
        z zVarR = zVar.r();
        int iX = (zVarR == null || zVarR.n().a0() != gVar.a0()) ? gVar.c0() ? 366 : 365 : zVarR.n().X() - 1;
        if (this.f37551c == 1) {
            iX -= zVar.n().X() - 1;
        }
        return j$.time.temporal.t.j(1L, iX);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.s(this);
        }
        int i5 = x.f37547a[((j$.time.temporal.a) qVar).ordinal()];
        int i10 = this.f37551c;
        z zVar = this.f37550b;
        j$.time.g gVar = this.f37549a;
        switch (i5) {
            case 2:
                return i10 == 1 ? (gVar.X() - zVar.n().X()) + 1 : gVar.X();
            case 3:
                return i10;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.s(j$.time.d.a("Unsupported field: ", qVar));
            case 8:
                return zVar.getValue();
            default:
                return gVar.w(qVar);
        }
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.temporal.Temporal
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final y d(long j8, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            if (w(aVar) == j8) {
                return this;
            }
            int[] iArr = x.f37547a;
            int i5 = iArr[aVar.ordinal()];
            j$.time.g gVar = this.f37549a;
            if (i5 == 3 || i5 == 8 || i5 == 9) {
                w wVar = w.f37546d;
                int iA = wVar.K(aVar).a(j8, aVar);
                int i10 = iArr[aVar.ordinal()];
                if (i10 == 3) {
                    return Z(gVar.t0(wVar.h(this.f37550b, iA)));
                }
                if (i10 == 8) {
                    return Z(gVar.t0(wVar.h(z.v(iA), this.f37551c)));
                }
                if (i10 == 9) {
                    return Z(gVar.t0(iA));
                }
            }
            return Z(gVar.d(j8, qVar));
        }
        return (y) super.d(j8, qVar);
    }

    public final y a0(j$.time.temporal.o oVar) {
        return (y) super.s(oVar);
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.chrono.InterfaceC2894b
    /* renamed from: l */
    public final InterfaceC2894b s(j$.time.temporal.m mVar) {
        return (y) super.s(mVar);
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.temporal.Temporal
    public final Temporal s(j$.time.g gVar) {
        return (y) super.s(gVar);
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.chrono.InterfaceC2894b
    public final InterfaceC2894b I(j$.time.temporal.p pVar) {
        return (y) super.I(pVar);
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.chrono.InterfaceC2894b
    public final InterfaceC2897e z(j$.time.k kVar) {
        return C2899g.S(this, kVar);
    }

    @Override // j$.time.chrono.AbstractC2896d
    final InterfaceC2894b V(long j8) {
        return Z(this.f37549a.o0(j8));
    }

    @Override // j$.time.chrono.AbstractC2896d
    final InterfaceC2894b U(long j8) {
        return Z(this.f37549a.m0(j8));
    }

    @Override // j$.time.chrono.AbstractC2896d
    final InterfaceC2894b T(long j8) {
        return Z(this.f37549a.l0(j8));
    }

    public final y X(long j8, ChronoUnit chronoUnit) {
        return (y) super.e(j8, (TemporalUnit) chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.chrono.InterfaceC2894b, j$.time.temporal.Temporal
    public final InterfaceC2894b e(long j8, TemporalUnit temporalUnit) {
        return (y) super.e(j8, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.temporal.Temporal
    public final Temporal e(long j8, TemporalUnit temporalUnit) {
        return (y) super.e(j8, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.chrono.InterfaceC2894b
    /* renamed from: M */
    public final InterfaceC2894b o(long j8, TemporalUnit temporalUnit) {
        return (y) super.o(j8, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.temporal.Temporal
    public final Temporal o(long j8, ChronoUnit chronoUnit) {
        return (y) super.o(j8, chronoUnit);
    }

    private y Z(j$.time.g gVar) {
        return gVar.equals(this.f37549a) ? this : new y(gVar);
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.chrono.InterfaceC2894b
    public final long x() {
        return this.f37549a.x();
    }

    @Override // j$.time.chrono.AbstractC2896d, j$.time.chrono.InterfaceC2894b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return this.f37549a.equals(((y) obj).f37549a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 4, this);
    }
}
