package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class q extends d {
    private static final long serialVersionUID = -5207853542612002020L;
    public final transient o a;
    public final transient int b;
    public final transient int c;
    public final transient int d;

    public q(o oVar, long j) {
        int i = (int) j;
        oVar.P();
        if (i < oVar.e || i >= oVar.f) {
            j$.time.g.g("Hijrah date out of range");
            throw null;
        }
        int iBinarySearch = Arrays.binarySearch(oVar.d, i);
        iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
        int[] iArr = {oVar.R(iBinarySearch), ((oVar.g + iBinarySearch) % 12) + 1, (i - oVar.d[iBinarySearch]) + 1};
        this.a = oVar;
        this.b = iArr[0];
        this.c = iArr[1];
        this.d = iArr[2];
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new e0((byte) 6, this);
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        int i = p.a[((j$.time.temporal.a) nVar).ordinal()];
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.b;
        switch (i) {
            case 1:
                return i3;
            case 2:
                return I();
            case 3:
                return ((i3 - 1) / 7) + 1;
            case 4:
                return ((int) j$.desugar.sun.nio.fs.g.F(toEpochDay() + 3, 7L)) + 1;
            case 5:
                return ((i3 - 1) % 7) + 1;
            case 6:
                return ((I() - 1) % 7) + 1;
            case 7:
                return toEpochDay();
            case 8:
                return ((I() - 1) / 7) + 1;
            case 9:
                return i2;
            case 10:
                return ((i4 * 12) + i2) - 1;
            case 11:
                return i4;
            case 12:
                return i4;
            case 13:
                return i4 <= 1 ? 0 : 1;
            default:
                j$.time.g.e("Unsupported field: ".concat(String.valueOf(nVar)));
                return 0L;
        }
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final e D(LocalTime localTime) {
        return new g(this, localTime);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b F(TemporalAmount temporalAmount) {
        return (q) super.F(temporalAmount);
    }

    @Override // j$.time.chrono.d
    public final b H(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.b + ((int) j);
        int i = (int) j2;
        if (j2 == i) {
            return L(i, this.c, this.d);
        }
        throw new ArithmeticException();
    }

    public final int I() {
        return this.a.V(this.b, this.c - 1) + this.d;
    }

    @Override // j$.time.chrono.d
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final q A(long j) {
        return new q(this.a, toEpochDay() + j);
    }

    @Override // j$.time.chrono.d
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final q B(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.b * 12) + (this.c - 1) + j;
        long jY = j$.desugar.sun.nio.fs.g.y(j2, 12L);
        o oVar = this.a;
        if (jY >= oVar.R(0) && jY <= oVar.R(oVar.d.length - 1) - 1) {
            return L((int) jY, ((int) j$.desugar.sun.nio.fs.g.F(j2, 12L)) + 1, this.d);
        }
        throw new DateTimeException("Invalid Hijrah year: " + jY);
    }

    public final q L(int i, int i2, int i3) {
        o oVar = this.a;
        int iT = oVar.T(i, i2);
        if (i3 > iT) {
            i3 = iT;
        }
        return new q(oVar, i, i2, i3);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final q a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (q) super.a(j, nVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        o oVar = this.a;
        oVar.C(aVar).b(j, aVar);
        int i = (int) j;
        int i2 = p.a[aVar.ordinal()];
        int i3 = this.d;
        int i4 = this.c;
        int i5 = this.b;
        switch (i2) {
            case 1:
                return L(i5, i4, i);
            case 2:
                return A(Math.min(i, lengthOfYear()) - I());
            case 3:
                return A((j - C(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return A(j - (((int) j$.desugar.sun.nio.fs.g.F(toEpochDay() + 3, 7L)) + 1));
            case 5:
                return A(j - C(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return A(j - C(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new q(oVar, j);
            case 8:
                return A((j - C(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return L(i5, i, i3);
            case 10:
                return B(j - (((i5 * 12) + i4) - 1));
            case 11:
                if (i5 < 1) {
                    i = 1 - i;
                }
                return L(i, i4, i3);
            case 12:
                return L(i, i4, i3);
            case 13:
                return L(1 - i5, i4, i3);
            default:
                j$.time.g.e("Unsupported field: ".concat(String.valueOf(nVar)));
                return null;
        }
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.Temporal
    public final b b(long j, TemporalUnit temporalUnit) {
        return (q) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.b == qVar.b && this.c == qVar.c && this.d == qVar.d && this.a.equals(qVar.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.b
    public final a getChronology() {
        return this.a;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final m getEra() {
        return r.AH;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        this.a.getClass();
        int i = this.b;
        return ((i & (-2048)) ^ 2100100019) ^ (((i << 11) + (this.c << 6)) + this.d);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final boolean isLeapYear() {
        return this.a.isLeapYear(this.b);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: k */
    public final Temporal x(LocalDate localDate) {
        return (q) super.x(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.k
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.k(this);
        }
        if (!j$.desugar.sun.nio.fs.g.j(this, nVar)) {
            j$.time.g.e("Unsupported field: ".concat(String.valueOf(nVar)));
            return null;
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        int i = p.a[aVar.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? this.a.C(aVar) : j$.time.temporal.q.f(1L, 5L) : j$.time.temporal.q.f(1L, lengthOfYear()) : j$.time.temporal.q.f(1L, r2.T(this.b, this.c));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int lengthOfYear() {
        return this.a.V(this.b, 12);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* renamed from: t */
    public final b y(long j, TemporalUnit temporalUnit) {
        return (q) super.y(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long toEpochDay() {
        return this.a.S(this.b, this.c, this.d);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b x(j$.time.temporal.l lVar) {
        return (q) super.x(lVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal y(long j, ChronoUnit chronoUnit) {
        return (q) super.y(j, chronoUnit);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal b(long j, TemporalUnit temporalUnit) {
        return (q) super.b(j, temporalUnit);
    }

    public q(o oVar, int i, int i2, int i3) {
        oVar.S(i, i2, i3);
        this.a = oVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}
