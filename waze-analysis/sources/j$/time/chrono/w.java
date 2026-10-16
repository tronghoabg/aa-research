package j$.time.chrono;

import com.waze.strings.DisplayStrings;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class w extends d {

    /* renamed from: d, reason: collision with root package name */
    public static final LocalDate f49883d = LocalDate.of(DisplayStrings.DS_SEARCH_RESULTS_BEST_MATCH, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* renamed from: a, reason: collision with root package name */
    public final transient LocalDate f49884a;

    /* renamed from: b, reason: collision with root package name */
    public final transient x f49885b;

    /* renamed from: c, reason: collision with root package name */
    public final transient int f49886c;

    public w(LocalDate localDate) {
        if (localDate.Q(f49883d)) {
            j$.time.f.h("JapaneseDate before Meiji 6 is not supported");
            throw null;
        }
        x xVarE = x.e(localDate);
        this.f49885b = xVarE;
        this.f49886c = (localDate.getYear() - xVarE.f49890b.getYear()) + 1;
        this.f49884a = localDate;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new d0((byte) 4, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return mVar.k(this);
        }
        int i2 = v.f49882a[((j$.time.temporal.a) mVar).ordinal()];
        int i3 = this.f49886c;
        x xVar = this.f49885b;
        LocalDate localDate = this.f49884a;
        switch (i2) {
            case 2:
                return i3 == 1 ? (localDate.O() - xVar.f49890b.O()) + 1 : localDate.O();
            case 3:
                return i3;
            case 4:
            case 5:
            case 6:
            case 7:
                j$.time.f.f("Unsupported field: ".concat(String.valueOf(mVar)));
                return 0L;
            case 8:
                return xVar.f49889a;
            default:
                return localDate.D(mVar);
        }
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final e E(LocalTime localTime) {
        return new g(this, localTime);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b H(TemporalAmount temporalAmount) {
        return (w) super.H(temporalAmount);
    }

    @Override // j$.time.chrono.d
    public final b M(long j2) {
        return S(this.f49884a.W(j2));
    }

    @Override // j$.time.chrono.d
    public final b N(long j2) {
        return S(this.f49884a.plusMonths(j2));
    }

    @Override // j$.time.chrono.d
    public final b O(long j2) {
        return S(this.f49884a.Y(j2));
    }

    public final w P(long j2, ChronoUnit chronoUnit) {
        return (w) super.b(j2, (TemporalUnit) chronoUnit);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final w a(long j2, j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return (w) super.a(j2, mVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) mVar;
        if (D(aVar) == j2) {
            return this;
        }
        int[] iArr = v.f49882a;
        int i2 = iArr[aVar.ordinal()];
        LocalDate localDate = this.f49884a;
        if (i2 == 3 || i2 == 8 || i2 == 9) {
            u uVar = u.f49881d;
            int iA = uVar.o(aVar).a(j2, aVar);
            int i3 = iArr[aVar.ordinal()];
            if (i3 == 3) {
                return S(localDate.c0(uVar.u(this.f49885b, iA)));
            }
            if (i3 == 8) {
                return S(localDate.c0(uVar.u(x.i(iA), this.f49886c)));
            }
            if (i3 == 9) {
                return S(localDate.c0(iA));
            }
        }
        return S(localDate.a(j2, mVar));
    }

    public final w R(j$.desugar.sun.nio.fs.n nVar) {
        return (w) super.y(nVar);
    }

    public final w S(LocalDate localDate) {
        return localDate.equals(this.f49884a) ? this : new w(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.Temporal
    public final b b(long j2, TemporalUnit temporalUnit) {
        return (w) super.b(j2, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.m mVar) {
        if (mVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || mVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || mVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || mVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return mVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) mVar).isDateBased() : mVar != null && mVar.f(this);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            return this.f49884a.equals(((w) obj).f49884a);
        }
        return false;
    }

    @Override // j$.time.chrono.b
    public final Chronology getChronology() {
        return u.f49881d;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final l getEra() {
        return this.f49885b;
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: h */
    public final Temporal y(LocalDate localDate) {
        return (w) super.y(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        u.f49881d.getClass();
        return this.f49884a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return mVar.h(this);
        }
        if (!c(mVar)) {
            j$.time.f.f("Unsupported field: ".concat(String.valueOf(mVar)));
            return null;
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) mVar;
        int i2 = v.f49882a[aVar.ordinal()];
        if (i2 == 1) {
            return j$.time.temporal.p.f(1L, this.f49884a.lengthOfMonth());
        }
        if (i2 == 2) {
            return j$.time.temporal.p.f(1L, lengthOfYear());
        }
        if (i2 != 3) {
            return u.f49881d.o(aVar);
        }
        x xVar = this.f49885b;
        int year = xVar.f49890b.getYear();
        return xVar.g() != null ? j$.time.temporal.p.f(1L, (r5.f49890b.getYear() - year) + 1) : j$.time.temporal.p.f(1L, 999999999 - year);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // j$.time.chrono.d, j$.time.chrono.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int lengthOfYear() {
        /*
            r6 = this;
            j$.time.chrono.x r0 = r6.f49885b
            j$.time.chrono.x r1 = r0.g()
            j$.time.LocalDate r2 = r6.f49884a
            r3 = 1
            if (r1 == 0) goto L1d
            j$.time.LocalDate r1 = r1.f49890b
            int r4 = r1.getYear()
            int r5 = r2.getYear()
            if (r4 != r5) goto L1d
            int r1 = r1.O()
            int r1 = r1 - r3
            goto L21
        L1d:
            int r1 = r2.lengthOfYear()
        L21:
            int r6 = r6.f49886c
            if (r6 != r3) goto L2d
            j$.time.LocalDate r6 = r0.f49890b
            int r6 = r6.O()
            int r6 = r6 - r3
            int r1 = r1 - r6
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.w.lengthOfYear():int");
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* renamed from: s */
    public final b z(long j2, TemporalUnit temporalUnit) {
        return (w) super.z(j2, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long toEpochDay() {
        return this.f49884a.toEpochDay();
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b y(j$.time.temporal.k kVar) {
        return (w) super.y(kVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal z(long j2, ChronoUnit chronoUnit) {
        return (w) super.z(j2, chronoUnit);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal b(long j2, TemporalUnit temporalUnit) {
        return (w) super.b(j2, temporalUnit);
    }

    public w(x xVar, int i2, LocalDate localDate) {
        if (!localDate.Q(f49883d)) {
            this.f49885b = xVar;
            this.f49886c = i2;
            this.f49884a = localDate;
            return;
        }
        j$.time.f.h("JapaneseDate before Meiji 6 is not supported");
        throw null;
    }
}
