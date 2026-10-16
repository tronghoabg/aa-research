package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class c0 extends d {
    private static final long serialVersionUID = 1300372329181994526L;
    public final transient LocalDate a;

    public c0(LocalDate localDate) {
        Objects.a(localDate, "isoDate");
        this.a = localDate;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new e0((byte) 7, this);
    }

    @Override // j$.time.chrono.d
    public final b A(long j) {
        return K(this.a.R(j));
    }

    @Override // j$.time.chrono.d
    public final b B(long j) {
        return K(this.a.S(j));
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        int i = b0.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i == 4) {
            int I = I();
            if (I < 1) {
                I = 1 - I;
            }
            return I;
        }
        LocalDate localDate = this.a;
        if (i == 5) {
            return ((I() * 12) + localDate.b) - 1;
        }
        if (i == 6) {
            return I();
        }
        if (i != 7) {
            return localDate.C(nVar);
        }
        return I() < 1 ? 0 : 1;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final e D(LocalTime localTime) {
        return new g(this, localTime);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b F(TemporalAmount temporalAmount) {
        return (c0) super.F(temporalAmount);
    }

    @Override // j$.time.chrono.d
    public final b H(long j) {
        return K(this.a.U(j));
    }

    public final int I() {
        return this.a.a - 1911;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.chrono.c0 a(long r9, j$.time.temporal.n r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof j$.time.temporal.a
            if (r0 == 0) goto L97
            r0 = r11
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            long r1 = r8.C(r0)
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 != 0) goto L10
            return r8
        L10:
            int[] r1 = j$.time.chrono.b0.a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            r3 = 7
            r4 = 6
            r5 = 4
            j$.time.LocalDate r6 = r8.a
            if (r2 == r5) goto L49
            r7 = 5
            if (r2 == r7) goto L27
            if (r2 == r4) goto L49
            if (r2 == r3) goto L49
            goto L5f
        L27:
            j$.time.chrono.a0 r11 = j$.time.chrono.a0.c
            j$.time.temporal.q r11 = r11.C(r0)
            r11.b(r9, r0)
            int r11 = r8.I()
            long r0 = (long) r11
            r2 = 12
            long r0 = r0 * r2
            short r11 = r6.b
            long r2 = (long) r11
            long r0 = r0 + r2
            r2 = 1
            long r0 = r0 - r2
            long r9 = r9 - r0
            j$.time.LocalDate r9 = r6.S(r9)
            j$.time.chrono.c0 r8 = r8.K(r9)
            return r8
        L49:
            j$.time.chrono.a0 r2 = j$.time.chrono.a0.c
            j$.time.temporal.q r2 = r2.C(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r5) goto L82
            if (r0 == r4) goto L77
            if (r0 == r3) goto L68
        L5f:
            j$.time.LocalDate r9 = r6.a(r9, r11)
            j$.time.chrono.c0 r8 = r8.K(r9)
            return r8
        L68:
            int r9 = r8.I()
            int r9 = 1912 - r9
            j$.time.LocalDate r9 = r6.Y(r9)
            j$.time.chrono.c0 r8 = r8.K(r9)
            return r8
        L77:
            int r2 = r2 + 1911
            j$.time.LocalDate r9 = r6.Y(r2)
            j$.time.chrono.c0 r8 = r8.K(r9)
            return r8
        L82:
            int r9 = r8.I()
            r10 = 1
            if (r9 < r10) goto L8c
            int r2 = r2 + 1911
            goto L8e
        L8c:
            int r2 = 1912 - r2
        L8e:
            j$.time.LocalDate r9 = r6.Y(r2)
            j$.time.chrono.c0 r8 = r8.K(r9)
            return r8
        L97:
            j$.time.chrono.b r8 = super.a(r9, r11)
            j$.time.chrono.c0 r8 = (j$.time.chrono.c0) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.c0.a(long, j$.time.temporal.n):j$.time.chrono.c0");
    }

    public final c0 K(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new c0(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.Temporal
    public final b b(long j, TemporalUnit temporalUnit) {
        return (c0) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            return this.a.equals(((c0) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.b
    public final a getChronology() {
        return a0.c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final m getEra() {
        return I() >= 1 ? d0.ROC : d0.BEFORE_ROC;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        a0.c.getClass();
        return this.a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: k */
    public final Temporal x(LocalDate localDate) {
        return (c0) super.x(localDate);
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
        int i = b0.a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.l(nVar);
        }
        if (i != 4) {
            return a0.c.C(aVar);
        }
        j$.time.temporal.q qVar = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.q.f(1L, I() <= 0 ? (-qVar.a) + 1912 : qVar.d - 1911);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* renamed from: t */
    public final b y(long j, TemporalUnit temporalUnit) {
        return (c0) super.y(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long toEpochDay() {
        return this.a.toEpochDay();
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b x(j$.time.temporal.l lVar) {
        return (c0) super.x(lVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal y(long j, ChronoUnit chronoUnit) {
        return (c0) super.y(j, chronoUnit);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal b(long j, TemporalUnit temporalUnit) {
        return (c0) super.b(j, temporalUnit);
    }
}
