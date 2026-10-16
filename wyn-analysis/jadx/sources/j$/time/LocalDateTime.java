package j$.time;

import j$.time.chrono.AbstractC2901i;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.InterfaceC2894b;
import j$.time.chrono.InterfaceC2897e;
import j$.time.format.DateTimeFormatter;
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
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* loaded from: classes2.dex */
public final class LocalDateTime implements Temporal, j$.time.temporal.m, InterfaceC2897e, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final LocalDateTime f37480c = f0(g.f37632d, k.f37640e);

    /* renamed from: d, reason: collision with root package name */
    public static final LocalDateTime f37481d = f0(g.f37633e, k.f37641f);
    private static final long serialVersionUID = 6207766400415563566L;

    /* renamed from: a, reason: collision with root package name */
    private final g f37482a;

    /* renamed from: b, reason: collision with root package name */
    private final k f37483b;

    @Override // j$.time.chrono.InterfaceC2897e
    public final j$.time.chrono.m a() {
        return ((g) c()).a();
    }

    public static LocalDateTime d0(int i5) {
        return new LocalDateTime(g.g0(i5, 12, 31), k.Z(0));
    }

    public static LocalDateTime e0(int i5, int i10, int i11, int i12, int i13, int i14, int i15) {
        return new LocalDateTime(g.g0(i5, i10, i11), k.a0(i12, i13, i14, i15));
    }

    public static LocalDateTime f0(g gVar, k kVar) {
        Objects.requireNonNull(gVar, "date");
        Objects.requireNonNull(kVar, "time");
        return new LocalDateTime(gVar, kVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal D(Temporal temporal) {
        return temporal.d(((g) c()).x(), j$.time.temporal.a.EPOCH_DAY).d(b().j0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public static LocalDateTime g0(long j8, int i5, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        long j10 = i5;
        j$.time.temporal.a.NANO_OF_SECOND.S(j10);
        return new LocalDateTime(g.i0(b.f(j8 + zoneOffset.Z(), 86400)), k.b0((((int) b.e(r5, r7)) * 1000000000) + j10));
    }

    public static LocalDateTime S(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporalAccessor).X();
        }
        if (temporalAccessor instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
        }
        try {
            return new LocalDateTime(g.T(temporalAccessor), k.T(temporalAccessor));
        } catch (c e7) {
            throw new c("Unable to obtain LocalDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e7);
        }
    }

    public static LocalDateTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDateTime) dateTimeFormatter.d(charSequence, new h());
    }

    private LocalDateTime(g gVar, k kVar) {
        this.f37482a = gVar;
        this.f37483b = kVar;
    }

    private LocalDateTime n0(g gVar, k kVar) {
        return (this.f37482a == gVar && this.f37483b == kVar) ? this : new LocalDateTime(gVar, kVar);
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
            if (((j$.time.temporal.a) qVar).T()) {
                k kVar = this.f37483b;
                kVar.getClass();
                return j$.time.temporal.l.d(kVar, qVar);
            }
            return this.f37482a.t(qVar);
        }
        return qVar.B(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int q(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).T() ? this.f37483b.q(qVar) : this.f37482a.q(qVar);
        }
        return j$.time.temporal.l.a(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).T() ? this.f37483b.w(qVar) : this.f37482a.w(qVar);
        }
        return qVar.s(this);
    }

    private int R(LocalDateTime localDateTime) {
        int iR = this.f37482a.R(localDateTime.f37482a);
        return iR == 0 ? this.f37483b.compareTo(localDateTime.f37483b) : iR;
    }

    @Override // j$.time.chrono.InterfaceC2897e
    public final InterfaceC2894b c() {
        return this.f37482a;
    }

    public final g k0() {
        return this.f37482a;
    }

    public final int a0() {
        return this.f37482a.a0();
    }

    public final int X() {
        return this.f37482a.Y();
    }

    public final int T() {
        return this.f37482a.V();
    }

    public final DayOfWeek U() {
        return this.f37482a.W();
    }

    @Override // j$.time.chrono.InterfaceC2897e
    public final k b() {
        return this.f37483b;
    }

    public final int V() {
        return this.f37483b.V();
    }

    public final int W() {
        return this.f37483b.W();
    }

    public final int Z() {
        return this.f37483b.Y();
    }

    public final int Y() {
        return this.f37483b.X();
    }

    public final LocalDateTime m0(g gVar) {
        return n0(gVar, this.f37483b);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal s(g gVar) {
        return n0(gVar, this.f37483b);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime d(long j8, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            boolean zT = ((j$.time.temporal.a) qVar).T();
            k kVar = this.f37483b;
            g gVar = this.f37482a;
            if (zT) {
                return n0(gVar, kVar.d(j8, qVar));
            }
            return n0(gVar.d(j8, qVar), kVar);
        }
        return (LocalDateTime) qVar.w(this, j8);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime e(long j8, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDateTime) temporalUnit.o(this, j8);
        }
        switch (i.f37637a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return j0(this.f37482a, 0L, 0L, 0L, j8);
            case 2:
                LocalDateTime localDateTimePlusDays = plusDays(j8 / 86400000000L);
                return localDateTimePlusDays.j0(localDateTimePlusDays.f37482a, 0L, 0L, 0L, (j8 % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimePlusDays2 = plusDays(j8 / 86400000);
                return localDateTimePlusDays2.j0(localDateTimePlusDays2.f37482a, 0L, 0L, 0L, (j8 % 86400000) * 1000000);
            case 4:
                return i0(j8);
            case 5:
                return j0(this.f37482a, 0L, j8, 0L, 0L);
            case 6:
                return j0(this.f37482a, j8, 0L, 0L, 0L);
            case 7:
                LocalDateTime localDateTimePlusDays3 = plusDays(j8 / 256);
                return localDateTimePlusDays3.j0(localDateTimePlusDays3.f37482a, (j8 % 256) * 12, 0L, 0L, 0L);
            default:
                return n0(this.f37482a.e(j8, temporalUnit), this.f37483b);
        }
    }

    public LocalDateTime plusWeeks(long j8) {
        return n0(this.f37482a.n0(j8), this.f37483b);
    }

    public LocalDateTime plusDays(long j8) {
        return n0(this.f37482a.l0(j8), this.f37483b);
    }

    public final LocalDateTime i0(long j8) {
        return j0(this.f37482a, 0L, 0L, j8, 0L);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal o(long j8, ChronoUnit chronoUnit) {
        return j8 == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j8, chronoUnit);
    }

    private LocalDateTime j0(g gVar, long j8, long j10, long j11, long j12) {
        long j13 = j8 | j10 | j11 | j12;
        k kVarB0 = this.f37483b;
        if (j13 == 0) {
            return n0(gVar, kVarB0);
        }
        long j14 = j8 / 24;
        long j15 = j14 + (j10 / 1440) + (j11 / 86400) + (j12 / 86400000000000L);
        long j16 = 1;
        long j17 = ((j8 % 24) * 3600000000000L) + ((j10 % 1440) * 60000000000L) + ((j11 % 86400) * 1000000000) + (j12 % 86400000000000L);
        long jJ0 = kVarB0.j0();
        long j18 = (j17 * j16) + jJ0;
        long jF = b.f(j18, 86400000000000L) + (j15 * j16);
        long jE = b.e(j18, 86400000000000L);
        if (jE != jJ0) {
            kVarB0 = k.b0(jE);
        }
        return n0(gVar.l0(jF), kVarB0);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object B(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.f()) {
            return this.f37482a;
        }
        return AbstractC2901i.l(this, rVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    @Override // j$.time.temporal.Temporal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long f(j$.time.temporal.Temporal r10, j$.time.temporal.TemporalUnit r11) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.LocalDateTime.f(j$.time.temporal.Temporal, j$.time.temporal.TemporalUnit):long");
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.chrono.InterfaceC2897e
    public final ChronoZonedDateTime p(ZoneId zoneId) {
        return ZonedDateTime.of(this, zoneId);
    }

    @Override // java.lang.Comparable
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC2897e interfaceC2897e) {
        if (interfaceC2897e instanceof LocalDateTime) {
            return R((LocalDateTime) interfaceC2897e);
        }
        return AbstractC2901i.c(this, interfaceC2897e);
    }

    public final boolean b0(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return R(localDateTime) > 0;
        }
        long jX = this.f37482a.x();
        long jX2 = localDateTime.f37482a.x();
        if (jX <= jX2) {
            return jX == jX2 && this.f37483b.j0() > localDateTime.f37483b.j0();
        }
        return true;
    }

    public final boolean c0(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return R(localDateTime) < 0;
        }
        long jX = this.f37482a.x();
        long jX2 = localDateTime.f37482a.x();
        if (jX >= jX2) {
            return jX == jX2 && this.f37483b.j0() < localDateTime.f37483b.j0();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.f37482a.equals(localDateTime.f37482a) && this.f37483b.equals(localDateTime.f37483b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f37482a.hashCode() ^ this.f37483b.hashCode();
    }

    public final String toString() {
        return this.f37482a.toString() + "T" + this.f37483b.toString();
    }

    private Object writeReplace() {
        return new t((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void o0(DataOutput dataOutput) throws IOException {
        this.f37482a.u0(dataOutput);
        this.f37483b.n0(dataOutput);
    }
}
