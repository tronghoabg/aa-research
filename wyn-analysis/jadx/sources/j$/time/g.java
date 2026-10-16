package j$.time;

import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import j$.time.chrono.AbstractC2901i;
import j$.time.chrono.InterfaceC2894b;
import j$.time.chrono.InterfaceC2897e;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes2.dex */
public final class g implements Temporal, j$.time.temporal.m, InterfaceC2894b, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final g f37632d = g0(-999999999, 1, 1);

    /* renamed from: e, reason: collision with root package name */
    public static final g f37633e = g0(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;

    /* renamed from: a, reason: collision with root package name */
    private final int f37634a;

    /* renamed from: b, reason: collision with root package name */
    private final short f37635b;

    /* renamed from: c, reason: collision with root package name */
    private final short f37636c;

    @Override // j$.time.chrono.InterfaceC2894b
    public final InterfaceC2894b M(long j8, TemporalUnit temporalUnit) {
        return e(-1L, (ChronoUnit) temporalUnit);
    }

    static {
        g0(1970, 1, 1);
    }

    public static g f0(b bVar) {
        Objects.requireNonNull(bVar, "clock");
        Instant instantV = Instant.V(System.currentTimeMillis());
        ZoneId zoneIdA = bVar.a();
        Objects.requireNonNull(instantV, "instant");
        Objects.requireNonNull(zoneIdA, "zone");
        return i0(b.f(instantV.T() + zoneIdA.S().d(instantV).Z(), 86400));
    }

    public static g h0(int i5, m mVar, int i10) {
        j$.time.temporal.a.YEAR.S(i5);
        Objects.requireNonNull(mVar, "month");
        j$.time.temporal.a.DAY_OF_MONTH.S(i10);
        return S(i5, mVar.getValue(), i10);
    }

    public static g g0(int i5, int i10, int i11) {
        j$.time.temporal.a.YEAR.S(i5);
        j$.time.temporal.a.MONTH_OF_YEAR.S(i10);
        j$.time.temporal.a.DAY_OF_MONTH.S(i11);
        return S(i5, i10, i11);
    }

    public static g j0(int i5, int i10) {
        long j8 = i5;
        j$.time.temporal.a.YEAR.S(j8);
        j$.time.temporal.a.DAY_OF_YEAR.S(i10);
        j$.time.chrono.t.f37543d.getClass();
        boolean zS = j$.time.chrono.t.S(j8);
        if (i10 == 366 && !zS) {
            throw new c("Invalid date 'DayOfYear 366' as '" + i5 + "' is not a leap year");
        }
        m mVarU = m.U(((i10 - 1) / 31) + 1);
        if (i10 > (mVarU.S(zS) + mVarU.R(zS)) - 1) {
            mVarU = mVarU.V();
        }
        return new g(i5, mVarU.getValue(), (i10 - mVarU.R(zS)) + 1);
    }

    public static g i0(long j8) {
        long j10;
        j$.time.temporal.a.EPOCH_DAY.S(j8);
        long j11 = 719468 + j8;
        if (j11 < 0) {
            long j12 = ((j8 + 719469) / 146097) - 1;
            j10 = j12 * 400;
            j11 += (-j12) * 146097;
        } else {
            j10 = 0;
        }
        long j13 = ((j11 * 400) + 591) / 146097;
        long j14 = j11 - ((j13 / 400) + (((j13 / 4) + (j13 * 365)) - (j13 / 100)));
        if (j14 < 0) {
            j13--;
            j14 = j11 - ((j13 / 400) + (((j13 / 4) + (365 * j13)) - (j13 / 100)));
        }
        int i5 = (int) j14;
        int i10 = ((i5 * 5) + 2) / 153;
        return new g(j$.time.temporal.a.YEAR.R(j13 + j10 + (i10 / 10)), ((i10 + 2) % 12) + 1, (i5 - (((i10 * 306) + 5) / 10)) + 1);
    }

    public static g T(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        g gVar = (g) temporalAccessor.B(j$.time.temporal.l.f());
        if (gVar != null) {
            return gVar;
        }
        throw new c("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    private static g S(int i5, int i10, int i11) {
        int i12 = 28;
        if (i11 > 28) {
            if (i10 != 2) {
                i12 = (i10 == 4 || i10 == 6 || i10 == 9 || i10 == 11) ? 30 : 31;
            } else {
                j$.time.chrono.t.f37543d.getClass();
                if (j$.time.chrono.t.S(i5)) {
                    i12 = 29;
                }
            }
            if (i11 > i12) {
                if (i11 == 29) {
                    throw new c("Invalid date 'February 29' as '" + i5 + "' is not a leap year");
                }
                throw new c("Invalid date '" + m.U(i10).name() + StringUtils.SPACE + i11 + "'");
            }
        }
        return new g(i5, i10, i11);
    }

    private static g p0(int i5, int i10, int i11) {
        if (i10 == 2) {
            j$.time.chrono.t.f37543d.getClass();
            i11 = Math.min(i11, j$.time.chrono.t.S((long) i5) ? 29 : 28);
        } else if (i10 == 4 || i10 == 6 || i10 == 9 || i10 == 11) {
            i11 = Math.min(i11, 30);
        }
        return new g(i5, i10, i11);
    }

    private g(int i5, int i10, int i11) {
        this.f37634a = i5;
        this.f37635b = (short) i10;
        this.f37636c = (short) i11;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        return AbstractC2901i.i(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.B(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        if (!aVar.D()) {
            throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
        }
        int i5 = f.f37559a[aVar.ordinal()];
        if (i5 == 1) {
            return j$.time.temporal.t.j(1L, d0());
        }
        if (i5 == 2) {
            return j$.time.temporal.t.j(1L, c0() ? 366 : 365);
        }
        if (i5 != 3) {
            return i5 != 4 ? ((j$.time.temporal.a) qVar).o() : this.f37634a <= 0 ? j$.time.temporal.t.j(1L, 1000000000L) : j$.time.temporal.t.j(1L, 999999999L);
        }
        return j$.time.temporal.t.j(1L, (m.U(this.f37635b) != m.FEBRUARY || c0()) ? 5L : 4L);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int q(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return U(qVar);
        }
        return j$.time.temporal.l.a(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.EPOCH_DAY) {
                return x();
            }
            if (qVar == j$.time.temporal.a.PROLEPTIC_MONTH) {
                return Z();
            }
            return U(qVar);
        }
        return qVar.s(this);
    }

    private int U(j$.time.temporal.q qVar) {
        int i5;
        int i10 = f.f37559a[((j$.time.temporal.a) qVar).ordinal()];
        short s10 = this.f37636c;
        int i11 = this.f37634a;
        switch (i10) {
            case 1:
                return s10;
            case 2:
                return X();
            case 3:
                i5 = (s10 - 1) / 7;
                break;
            case 4:
                return i11 >= 1 ? i11 : 1 - i11;
            case 5:
                return W().getValue();
            case 6:
                i5 = (s10 - 1) % 7;
                break;
            case 7:
                return ((X() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.s("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((X() - 1) / 7) + 1;
            case 10:
                return this.f37635b;
            case 11:
                throw new j$.time.temporal.s("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i11;
            case 13:
                return i11 >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
        }
        return i5 + 1;
    }

    private long Z() {
        return ((this.f37634a * 12) + this.f37635b) - 1;
    }

    @Override // j$.time.chrono.InterfaceC2894b
    public final j$.time.chrono.m a() {
        return j$.time.chrono.t.f37543d;
    }

    @Override // j$.time.chrono.InterfaceC2894b
    public final j$.time.chrono.n E() {
        return this.f37634a >= 1 ? j$.time.chrono.u.CE : j$.time.chrono.u.BCE;
    }

    public final int a0() {
        return this.f37634a;
    }

    public final int Y() {
        return this.f37635b;
    }

    public final int X() {
        return (m.U(this.f37635b).R(c0()) + this.f37636c) - 1;
    }

    public final int V() {
        return this.f37636c;
    }

    public final DayOfWeek W() {
        return DayOfWeek.R(((int) b.e(x() + 3, 7)) + 1);
    }

    public final boolean c0() {
        j$.time.chrono.t tVar = j$.time.chrono.t.f37543d;
        long j8 = this.f37634a;
        tVar.getClass();
        return j$.time.chrono.t.S(j8);
    }

    public final int d0() {
        short s10 = this.f37635b;
        return s10 != 2 ? (s10 == 4 || s10 == 6 || s10 == 9 || s10 == 11) ? 30 : 31 : c0() ? 29 : 28;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: r0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final g s(j$.time.temporal.m mVar) {
        if (mVar instanceof g) {
            return (g) mVar;
        }
        return (g) mVar.D(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public final g d(long j8, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (g) qVar.w(this, j8);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.S(j8);
        int i5 = f.f37559a[aVar.ordinal()];
        short s10 = this.f37636c;
        short s11 = this.f37635b;
        int i10 = this.f37634a;
        switch (i5) {
            case 1:
                int i11 = (int) j8;
                if (s10 != i11) {
                    return g0(i10, s11, i11);
                }
                return this;
            case 2:
                return s0((int) j8);
            case 3:
                return n0(j8 - w(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (i10 < 1) {
                    j8 = 1 - j8;
                }
                return t0((int) j8);
            case 5:
                return l0(j8 - W().getValue());
            case 6:
                return l0(j8 - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return l0(j8 - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return i0(j8);
            case 9:
                return n0(j8 - w(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i12 = (int) j8;
                if (s11 != i12) {
                    j$.time.temporal.a.MONTH_OF_YEAR.S(i12);
                    return p0(i10, i12, s10);
                }
                return this;
            case 11:
                return m0(j8 - Z());
            case 12:
                return t0((int) j8);
            case 13:
                if (w(j$.time.temporal.a.ERA) != j8) {
                    return t0(1 - i10);
                }
                return this;
            default:
                throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
        }
    }

    public final g t0(int i5) {
        if (this.f37634a == i5) {
            return this;
        }
        j$.time.temporal.a.YEAR.S(i5);
        return p0(i5, this.f37635b, this.f37636c);
    }

    public final g s0(int i5) {
        return X() == i5 ? this : j0(this.f37634a, i5);
    }

    @Override // j$.time.chrono.InterfaceC2894b
    public final InterfaceC2894b I(j$.time.temporal.p pVar) {
        if (pVar instanceof s) {
            return m0(((s) pVar).d()).l0(r4.a());
        }
        Objects.requireNonNull(pVar, "amountToAdd");
        return (g) pVar.o(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public final g e(long j8, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (g) temporalUnit.o(this, j8);
        }
        switch (f.f37560b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return l0(j8);
            case 2:
                return n0(j8);
            case 3:
                return m0(j8);
            case 4:
                return o0(j8);
            case 5:
                return o0(b.g(j8, 10));
            case 6:
                return o0(b.g(j8, 100));
            case 7:
                return o0(b.g(j8, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(b.b(w(aVar), j8), aVar);
            default:
                throw new j$.time.temporal.s("Unsupported unit: " + temporalUnit);
        }
    }

    public final g o0(long j8) {
        return j8 == 0 ? this : p0(j$.time.temporal.a.YEAR.R(this.f37634a + j8), this.f37635b, this.f37636c);
    }

    public final g m0(long j8) {
        if (j8 == 0) {
            return this;
        }
        long j10 = (this.f37634a * 12) + (this.f37635b - 1) + j8;
        long j11 = 12;
        return p0(j$.time.temporal.a.YEAR.R(b.f(j10, j11)), ((int) b.e(j10, j11)) + 1, this.f37636c);
    }

    public final g n0(long j8) {
        return l0(b.g(j8, 7));
    }

    public final g l0(long j8) {
        if (j8 == 0) {
            return this;
        }
        long j10 = this.f37636c + j8;
        if (j10 > 0) {
            short s10 = this.f37635b;
            int i5 = this.f37634a;
            if (j10 <= 28) {
                return new g(i5, s10, (int) j10);
            }
            if (j10 <= 59) {
                long jD0 = d0();
                if (j10 <= jD0) {
                    return new g(i5, s10, (int) j10);
                }
                if (s10 < 12) {
                    return new g(i5, s10 + 1, (int) (j10 - jD0));
                }
                int i10 = i5 + 1;
                j$.time.temporal.a.YEAR.S(i10);
                return new g(i10, 1, (int) (j10 - jD0));
            }
        }
        return i0(b.b(x(), j8));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal o(long j8, ChronoUnit chronoUnit) {
        return j8 == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j8, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object B(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.l.f() ? this : AbstractC2901i.k(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal D(Temporal temporal) {
        return AbstractC2901i.a(this, temporal);
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        g gVarT = T(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, gVarT);
        }
        switch (f.f37560b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return gVarT.x() - x();
            case 2:
                return (gVarT.x() - x()) / 7;
            case 3:
                return e0(gVarT);
            case 4:
                return e0(gVarT) / 12;
            case 5:
                return e0(gVarT) / 120;
            case 6:
                return e0(gVarT) / 1200;
            case 7:
                return e0(gVarT) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return gVarT.w(aVar) - w(aVar);
            default:
                throw new j$.time.temporal.s("Unsupported unit: " + temporalUnit);
        }
    }

    private long e0(g gVar) {
        return (((gVar.Z() * 32) + gVar.f37636c) - ((Z() * 32) + this.f37636c)) / 32;
    }

    @Override // j$.time.chrono.InterfaceC2894b
    public final InterfaceC2897e z(k kVar) {
        return LocalDateTime.f0(this, kVar);
    }

    @Override // j$.time.chrono.InterfaceC2894b
    public final long x() {
        long j8 = this.f37634a;
        long j10 = this.f37635b;
        long j11 = 365 * j8;
        long j12 = (((367 * j10) - 362) / 12) + (j8 >= 0 ? ((j8 + 399) / 400) + (((3 + j8) / 4) - ((99 + j8) / 100)) + j11 : j11 - ((j8 / (-400)) + ((j8 / (-4)) - (j8 / (-100))))) + (this.f37636c - 1);
        if (j10 > 2) {
            j12 = !c0() ? j12 - 2 : j12 - 1;
        }
        return j12 - 719528;
    }

    @Override // java.lang.Comparable
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC2894b interfaceC2894b) {
        if (interfaceC2894b instanceof g) {
            return R((g) interfaceC2894b);
        }
        return AbstractC2901i.b(this, interfaceC2894b);
    }

    final int R(g gVar) {
        int i5 = this.f37634a - gVar.f37634a;
        if (i5 != 0) {
            return i5;
        }
        int i10 = this.f37635b - gVar.f37635b;
        return i10 == 0 ? this.f37636c - gVar.f37636c : i10;
    }

    public final boolean b0(InterfaceC2894b interfaceC2894b) {
        return interfaceC2894b instanceof g ? R((g) interfaceC2894b) < 0 : x() < interfaceC2894b.x();
    }

    @Override // j$.time.chrono.InterfaceC2894b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && R((g) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC2894b
    public final int hashCode() {
        int i5 = this.f37634a;
        return (((i5 << 11) + (this.f37635b << 6)) + this.f37636c) ^ (i5 & BackupConstant.CLOSE_NOT_SHOW_CODE);
    }

    @Override // j$.time.chrono.InterfaceC2894b
    public final String toString() {
        int i5 = this.f37634a;
        int iAbs = Math.abs(i5);
        StringBuilder sb2 = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i5 > 9999) {
                sb2.append('+');
            }
            sb2.append(i5);
        } else if (i5 < 0) {
            sb2.append(i5 - 10000);
            sb2.deleteCharAt(1);
        } else {
            sb2.append(i5 + 10000);
            sb2.deleteCharAt(0);
        }
        short s10 = this.f37635b;
        sb2.append(s10 < 10 ? "-0" : "-");
        sb2.append((int) s10);
        short s11 = this.f37636c;
        sb2.append(s11 < 10 ? "-0" : "-");
        sb2.append((int) s11);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new t((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void u0(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.f37634a);
        dataOutput.writeByte(this.f37635b);
        dataOutput.writeByte(this.f37636c);
    }
}
