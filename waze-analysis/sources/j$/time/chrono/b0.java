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

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class b0 extends d {
    private static final long serialVersionUID = 1300372329181994526L;

    /* renamed from: a, reason: collision with root package name */
    public final transient LocalDate f49839a;

    public b0(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.f49839a = localDate;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new d0((byte) 7, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return mVar.k(this);
        }
        int i2 = a0.f49838a[((j$.time.temporal.a) mVar).ordinal()];
        if (i2 == 4) {
            int iP = P();
            if (iP < 1) {
                iP = 1 - iP;
            }
            return iP;
        }
        LocalDate localDate = this.f49839a;
        if (i2 == 5) {
            return ((P() * 12) + localDate.getMonthValue()) - 1;
        }
        if (i2 == 6) {
            return P();
        }
        if (i2 != 7) {
            return localDate.D(mVar);
        }
        return P() < 1 ? 0 : 1;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final e E(LocalTime localTime) {
        return new g(this, localTime);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b H(TemporalAmount temporalAmount) {
        return (b0) super.H(temporalAmount);
    }

    @Override // j$.time.chrono.d
    public final b M(long j2) {
        return R(this.f49839a.W(j2));
    }

    @Override // j$.time.chrono.d
    public final b N(long j2) {
        return R(this.f49839a.plusMonths(j2));
    }

    @Override // j$.time.chrono.d
    public final b O(long j2) {
        return R(this.f49839a.Y(j2));
    }

    public final int P() {
        return this.f49839a.getYear() - 1911;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.chrono.b0 a(long r9, j$.time.temporal.m r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof j$.time.temporal.a
            if (r0 == 0) goto L99
            r0 = r11
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            long r1 = r8.D(r0)
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 != 0) goto L10
            return r8
        L10:
            int[] r1 = j$.time.chrono.a0.f49838a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            r3 = 7
            r4 = 6
            r5 = 4
            j$.time.LocalDate r6 = r8.f49839a
            if (r2 == r5) goto L4b
            r7 = 5
            if (r2 == r7) goto L27
            if (r2 == r4) goto L4b
            if (r2 == r3) goto L4b
            goto L61
        L27:
            j$.time.chrono.z r11 = j$.time.chrono.z.f49893d
            j$.time.temporal.p r11 = r11.o(r0)
            r11.b(r9, r0)
            int r11 = r8.P()
            long r0 = (long) r11
            r2 = 12
            long r0 = r0 * r2
            int r11 = r6.getMonthValue()
            long r2 = (long) r11
            long r0 = r0 + r2
            r2 = 1
            long r0 = r0 - r2
            long r9 = r9 - r0
            j$.time.LocalDate r9 = r6.plusMonths(r9)
            j$.time.chrono.b0 r8 = r8.R(r9)
            return r8
        L4b:
            j$.time.chrono.z r2 = j$.time.chrono.z.f49893d
            j$.time.temporal.p r2 = r2.o(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r5) goto L84
            if (r0 == r4) goto L79
            if (r0 == r3) goto L6a
        L61:
            j$.time.LocalDate r9 = r6.a(r9, r11)
            j$.time.chrono.b0 r8 = r8.R(r9)
            return r8
        L6a:
            int r9 = r8.P()
            int r9 = 1912 - r9
            j$.time.LocalDate r9 = r6.c0(r9)
            j$.time.chrono.b0 r8 = r8.R(r9)
            return r8
        L79:
            int r2 = r2 + 1911
            j$.time.LocalDate r9 = r6.c0(r2)
            j$.time.chrono.b0 r8 = r8.R(r9)
            return r8
        L84:
            int r9 = r8.P()
            r10 = 1
            if (r9 < r10) goto L8e
            int r2 = r2 + 1911
            goto L90
        L8e:
            int r2 = 1912 - r2
        L90:
            j$.time.LocalDate r9 = r6.c0(r2)
            j$.time.chrono.b0 r8 = r8.R(r9)
            return r8
        L99:
            j$.time.chrono.b r8 = super.a(r9, r11)
            j$.time.chrono.b0 r8 = (j$.time.chrono.b0) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.b0.a(long, j$.time.temporal.m):j$.time.chrono.b0");
    }

    public final b0 R(LocalDate localDate) {
        return localDate.equals(this.f49839a) ? this : new b0(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.Temporal
    public final b b(long j2, TemporalUnit temporalUnit) {
        return (b0) super.b(j2, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            return this.f49839a.equals(((b0) obj).f49839a);
        }
        return false;
    }

    @Override // j$.time.chrono.b
    public final Chronology getChronology() {
        return z.f49893d;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final l getEra() {
        return P() >= 1 ? c0.ROC : c0.BEFORE_ROC;
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: h */
    public final Temporal y(LocalDate localDate) {
        return (b0) super.y(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        z.f49893d.getClass();
        return this.f49839a.hashCode() ^ (-1990173233);
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
        int i2 = a0.f49838a[aVar.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return this.f49839a.k(mVar);
        }
        if (i2 != 4) {
            return z.f49893d.o(aVar);
        }
        j$.time.temporal.p pVar = j$.time.temporal.a.YEAR.f50048b;
        return j$.time.temporal.p.f(1L, P() <= 0 ? (-pVar.f50072a) + 1912 : pVar.f50075d - 1911);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* renamed from: s */
    public final b z(long j2, TemporalUnit temporalUnit) {
        return (b0) super.z(j2, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long toEpochDay() {
        return this.f49839a.toEpochDay();
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b y(j$.time.temporal.k kVar) {
        return (b0) super.y(kVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal z(long j2, ChronoUnit chronoUnit) {
        return (b0) super.z(j2, chronoUnit);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal b(long j2, TemporalUnit temporalUnit) {
        return (b0) super.b(j2, temporalUnit);
    }
}
