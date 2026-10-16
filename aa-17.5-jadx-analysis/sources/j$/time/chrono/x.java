package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class x extends d {
    public static final LocalDate d = LocalDate.O(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    public final transient LocalDate a;
    public final transient y b;
    public final transient int c;

    public x(LocalDate localDate) {
        if (localDate.K(d)) {
            j$.time.g.g("JapaneseDate before Meiji 6 is not supported");
            throw null;
        }
        y yVarC = y.c(localDate);
        this.b = yVarC;
        this.c = (localDate.a - yVarC.b.a) + 1;
        this.a = localDate;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new e0((byte) 4, this);
    }

    @Override // j$.time.chrono.d
    public final b A(long j) {
        return L(this.a.R(j));
    }

    @Override // j$.time.chrono.d
    public final b B(long j) {
        return L(this.a.S(j));
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        int i = w.a[((j$.time.temporal.a) nVar).ordinal()];
        int i2 = this.c;
        y yVar = this.b;
        LocalDate localDate = this.a;
        switch (i) {
            case 2:
                return i2 == 1 ? (localDate.I() - yVar.b.I()) + 1 : localDate.I();
            case 3:
                return i2;
            case 4:
            case 5:
            case 6:
            case 7:
                j$.time.g.e("Unsupported field: ".concat(String.valueOf(nVar)));
                return 0L;
            case 8:
                return yVar.a;
            default:
                return localDate.C(nVar);
        }
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final e D(LocalTime localTime) {
        return new g(this, localTime);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b F(TemporalAmount temporalAmount) {
        return (x) super.F(temporalAmount);
    }

    @Override // j$.time.chrono.d
    public final b H(long j) {
        return L(this.a.U(j));
    }

    public final x I(long j, ChronoUnit chronoUnit) {
        return (x) super.b(j, (TemporalUnit) chronoUnit);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final x a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (x) super.a(j, nVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        if (C(aVar) == j) {
            return this;
        }
        int[] iArr = w.a;
        int i = iArr[aVar.ordinal()];
        LocalDate localDate = this.a;
        if (i == 3 || i == 8 || i == 9) {
            v vVar = v.c;
            int iA = vVar.C(aVar).a(j, aVar);
            int i2 = iArr[aVar.ordinal()];
            if (i2 == 3) {
                return L(localDate.Y(vVar.B(this.b, iA)));
            }
            if (i2 == 8) {
                return L(localDate.Y(vVar.B(y.i(iA), this.c)));
            }
            if (i2 == 9) {
                return L(localDate.Y(iA));
            }
        }
        return L(localDate.a(j, nVar));
    }

    public final x K(j$.desugar.sun.nio.fs.n nVar) {
        return (x) super.x(nVar);
    }

    public final x L(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new x(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.Temporal
    public final b b(long j, TemporalUnit temporalUnit) {
        return (x) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || nVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || nVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || nVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).isDateBased() : nVar != null && nVar.h(this);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            return this.a.equals(((x) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.b
    public final a getChronology() {
        return v.c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final m getEra() {
        return this.b;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        v.c.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: k */
    public final Temporal x(LocalDate localDate) {
        return (x) super.x(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.k
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.k(this);
        }
        if (!d(nVar)) {
            j$.time.g.e("Unsupported field: ".concat(String.valueOf(nVar)));
            return null;
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        int i = w.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.q.f(1L, this.a.lengthOfMonth());
        }
        if (i == 2) {
            return j$.time.temporal.q.f(1L, lengthOfYear());
        }
        if (i != 3) {
            return v.c.C(aVar);
        }
        y yVar = this.b;
        int i2 = yVar.b.a;
        return yVar.f() != null ? j$.time.temporal.q.f(1L, (r5.b.a - i2) + 1) : j$.time.temporal.q.f(1L, 999999999 - i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // j$.time.chrono.d, j$.time.chrono.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int lengthOfYear() {
        /*
            r6 = this;
            j$.time.chrono.y r0 = r6.b
            j$.time.chrono.y r1 = r0.f()
            j$.time.LocalDate r2 = r6.a
            r3 = 1
            if (r1 == 0) goto L19
            j$.time.LocalDate r1 = r1.b
            int r4 = r1.a
            int r5 = r2.a
            if (r4 != r5) goto L19
            int r1 = r1.I()
            int r1 = r1 - r3
            goto L1d
        L19:
            int r1 = r2.lengthOfYear()
        L1d:
            int r6 = r6.c
            if (r6 != r3) goto L29
            j$.time.LocalDate r6 = r0.b
            int r6 = r6.I()
            int r6 = r6 - r3
            int r1 = r1 - r6
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.x.lengthOfYear():int");
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* renamed from: t */
    public final b y(long j, TemporalUnit temporalUnit) {
        return (x) super.y(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long toEpochDay() {
        return this.a.toEpochDay();
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b x(j$.time.temporal.l lVar) {
        return (x) super.x(lVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal y(long j, ChronoUnit chronoUnit) {
        return (x) super.y(j, chronoUnit);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal b(long j, TemporalUnit temporalUnit) {
        return (x) super.b(j, temporalUnit);
    }

    public x(y yVar, int i, LocalDate localDate) {
        if (!localDate.K(d)) {
            this.b = yVar;
            this.c = i;
            this.a = localDate;
            return;
        }
        j$.time.g.g("JapaneseDate before Meiji 6 is not supported");
        throw null;
    }
}
