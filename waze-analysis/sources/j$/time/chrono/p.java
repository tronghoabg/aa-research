package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class p extends d {
    private static final long serialVersionUID = -5207853542612002020L;

    /* renamed from: a, reason: collision with root package name */
    public final transient n f49873a;

    /* renamed from: b, reason: collision with root package name */
    public final transient int f49874b;

    /* renamed from: c, reason: collision with root package name */
    public final transient int f49875c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f49876d;

    public p(n nVar, long j2) {
        int i2 = (int) j2;
        nVar.M();
        if (i2 < nVar.f49865f || i2 >= nVar.f49866g) {
            j$.time.f.h("Hijrah date out of range");
            throw null;
        }
        int iBinarySearch = Arrays.binarySearch(nVar.f49864e, i2);
        iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
        int[] iArr = {nVar.O(iBinarySearch), ((nVar.f49867h + iBinarySearch) % 12) + 1, (i2 - nVar.f49864e[iBinarySearch]) + 1};
        this.f49873a = nVar;
        this.f49874b = iArr[0];
        this.f49875c = iArr[1];
        this.f49876d = iArr[2];
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new d0((byte) 6, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return mVar.k(this);
        }
        int i2 = o.f49872a[((j$.time.temporal.a) mVar).ordinal()];
        int i3 = this.f49875c;
        int i4 = this.f49876d;
        int i5 = this.f49874b;
        switch (i2) {
            case 1:
                return i4;
            case 2:
                return P();
            case 3:
                return ((i4 - 1) / 7) + 1;
            case 4:
                return ((int) j$.com.android.tools.r8.a.O(toEpochDay() + 3, 7L)) + 1;
            case 5:
                return ((i4 - 1) % 7) + 1;
            case 6:
                return ((P() - 1) % 7) + 1;
            case 7:
                return toEpochDay();
            case 8:
                return ((P() - 1) / 7) + 1;
            case 9:
                return i3;
            case 10:
                return ((i5 * 12) + i3) - 1;
            case 11:
                return i5;
            case 12:
                return i5;
            case 13:
                return i5 <= 1 ? 0 : 1;
            default:
                j$.time.f.f("Unsupported field: ".concat(String.valueOf(mVar)));
                return 0L;
        }
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final e E(LocalTime localTime) {
        return new g(this, localTime);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b H(TemporalAmount temporalAmount) {
        return (p) super.H(temporalAmount);
    }

    @Override // j$.time.chrono.d
    public final b O(long j2) {
        if (j2 == 0) {
            return this;
        }
        long j3 = this.f49874b + ((int) j2);
        int i2 = (int) j3;
        if (j3 == i2) {
            return S(i2, this.f49875c, this.f49876d);
        }
        throw new ArithmeticException();
    }

    public final int P() {
        return this.f49873a.S(this.f49874b, this.f49875c - 1) + this.f49876d;
    }

    @Override // j$.time.chrono.d
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final p M(long j2) {
        return new p(this.f49873a, toEpochDay() + j2);
    }

    @Override // j$.time.chrono.d
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final p N(long j2) {
        if (j2 == 0) {
            return this;
        }
        long j3 = (this.f49874b * 12) + (this.f49875c - 1) + j2;
        long jF = j$.com.android.tools.r8.a.F(j3, 12L);
        n nVar = this.f49873a;
        if (jF >= nVar.O(0) && jF <= nVar.O(nVar.f49864e.length - 1) - 1) {
            return S((int) jF, ((int) j$.com.android.tools.r8.a.O(j3, 12L)) + 1, this.f49876d);
        }
        throw new j$.time.c("Invalid Hijrah year: " + jF);
    }

    public final p S(int i2, int i3, int i4) {
        n nVar = this.f49873a;
        int iQ = nVar.Q(i2, i3);
        if (i4 > iQ) {
            i4 = iQ;
        }
        return new p(nVar, i2, i3, i4);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final p a(long j2, j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return (p) super.a(j2, mVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) mVar;
        n nVar = this.f49873a;
        nVar.o(aVar).b(j2, aVar);
        int i2 = (int) j2;
        int i3 = o.f49872a[aVar.ordinal()];
        int i4 = this.f49876d;
        int i5 = this.f49875c;
        int i6 = this.f49874b;
        switch (i3) {
            case 1:
                return S(i6, i5, i2);
            case 2:
                return M(Math.min(i2, lengthOfYear()) - P());
            case 3:
                return M((j2 - D(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return M(j2 - (((int) j$.com.android.tools.r8.a.O(toEpochDay() + 3, 7L)) + 1));
            case 5:
                return M(j2 - D(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return M(j2 - D(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new p(nVar, j2);
            case 8:
                return M((j2 - D(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return S(i6, i2, i4);
            case 10:
                return N(j2 - (((i6 * 12) + i5) - 1));
            case 11:
                if (i6 < 1) {
                    i2 = 1 - i2;
                }
                return S(i2, i5, i4);
            case 12:
                return S(i2, i5, i4);
            case 13:
                return S(1 - i6, i5, i4);
            default:
                j$.time.f.f("Unsupported field: ".concat(String.valueOf(mVar)));
                return null;
        }
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.Temporal
    public final b b(long j2, TemporalUnit temporalUnit) {
        return (p) super.b(j2, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f49874b == pVar.f49874b && this.f49875c == pVar.f49875c && this.f49876d == pVar.f49876d && this.f49873a.equals(pVar.f49873a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.b
    public final Chronology getChronology() {
        return this.f49873a;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final l getEra() {
        return q.AH;
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: h */
    public final Temporal y(LocalDate localDate) {
        return (p) super.y(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        this.f49873a.getClass();
        int i2 = this.f49874b;
        return ((i2 & (-2048)) ^ 2100100019) ^ (((i2 << 11) + (this.f49875c << 6)) + this.f49876d);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final boolean isLeapYear() {
        return this.f49873a.isLeapYear(this.f49874b);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return mVar.h(this);
        }
        if (!j$.com.android.tools.r8.a.o(this, mVar)) {
            j$.time.f.f("Unsupported field: ".concat(String.valueOf(mVar)));
            return null;
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) mVar;
        int i2 = o.f49872a[aVar.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? this.f49873a.o(aVar) : j$.time.temporal.p.f(1L, 5L) : j$.time.temporal.p.f(1L, lengthOfYear()) : j$.time.temporal.p.f(1L, r2.Q(this.f49874b, this.f49875c));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int lengthOfYear() {
        return this.f49873a.S(this.f49874b, 12);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* renamed from: s */
    public final b z(long j2, TemporalUnit temporalUnit) {
        return (p) super.z(j2, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long toEpochDay() {
        return this.f49873a.P(this.f49874b, this.f49875c, this.f49876d);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b y(j$.time.temporal.k kVar) {
        return (p) super.y(kVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal z(long j2, ChronoUnit chronoUnit) {
        return (p) super.z(j2, chronoUnit);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal b(long j2, TemporalUnit temporalUnit) {
        return (p) super.b(j2, temporalUnit);
    }

    public p(n nVar, int i2, int i3, int i4) {
        nVar.P(i2, i3, i4);
        this.f49873a = nVar;
        this.f49874b = i2;
        this.f49875c = i3;
        this.f49876d = i4;
    }
}
