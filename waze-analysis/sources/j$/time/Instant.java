package j$.time;

import androidx.media3.common.C;
import androidx.media3.common.PlaybackException;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class Instant implements Temporal, j$.time.temporal.k, Comparable<Instant>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final Instant f49793c = new Instant(0, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final Instant f49794d = ofEpochSecond(-31557014167219200L, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final Instant f49795e = ofEpochSecond(31556889864403199L, 999999999);
    private static final long serialVersionUID = -665713676816604388L;

    /* renamed from: a, reason: collision with root package name */
    public final long f49796a;

    /* renamed from: b, reason: collision with root package name */
    public final int f49797b;

    public Instant(long j2, int i2) {
        this.f49796a = j2;
        this.f49797b = i2;
    }

    public static Instant B(long j2, int i2) {
        if ((i2 | j2) == 0) {
            return f49793c;
        }
        if (j2 >= -31557014167219200L && j2 <= 31556889864403199L) {
            return new Instant(j2, i2);
        }
        f.h("Instant exceeds minimum or maximum instant");
        return null;
    }

    public static Instant L(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return ofEpochSecond(temporalAccessor.D(j$.time.temporal.a.INSTANT_SECONDS), temporalAccessor.f(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (c e2) {
            throw new c(j$.desugar.sun.nio.fs.h.b("Unable to obtain Instant from TemporalAccessor: ", String.valueOf(temporalAccessor), " of type ", temporalAccessor.getClass().getName()), e2);
        }
    }

    public static Instant now() {
        int i2 = b.f49834a;
        a.f49832c.getClass();
        return ofEpochMilli(System.currentTimeMillis());
    }

    public static Instant ofEpochMilli(long j2) {
        return B(j$.com.android.tools.r8.a.F(j2, 1000L), ((int) j$.com.android.tools.r8.a.O(j2, 1000L)) * PlaybackException.CUSTOM_ERROR_CODE_BASE);
    }

    public static Instant ofEpochSecond(long j2, long j3) {
        return B(j$.com.android.tools.r8.a.P(j2, j$.com.android.tools.r8.a.F(j3, C.NANOS_PER_SECOND)), (int) j$.com.android.tools.r8.a.O(j3, C.NANOS_PER_SECOND));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 2, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return mVar.k(this);
        }
        int i2 = d.f49894a[((j$.time.temporal.a) mVar).ordinal()];
        int i3 = this.f49797b;
        if (i2 == 1) {
            return i3;
        }
        if (i2 == 2) {
            return i3 / 1000;
        }
        if (i2 == 3) {
            return i3 / PlaybackException.CUSTOM_ERROR_CODE_BASE;
        }
        if (i2 == 4) {
            return this.f49796a;
        }
        f.f("Unsupported field: ".concat(String.valueOf(mVar)));
        return 0L;
    }

    public final Instant M(long j2, long j3) {
        if ((j2 | j3) == 0) {
            return this;
        }
        return ofEpochSecond(j$.com.android.tools.r8.a.P(j$.com.android.tools.r8.a.P(this.f49796a, j2), j3 / C.NANOS_PER_SECOND), this.f49797b + (j3 % C.NANOS_PER_SECOND));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final Instant b(long j2, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Instant) temporalUnit.f(this, j2);
        }
        switch (d.f49895b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return M(0L, j2);
            case 2:
                return M(j2 / 1000000, (j2 % 1000000) * 1000);
            case 3:
                return plusMillis(j2);
            case 4:
                return plusSeconds(j2);
            case 5:
                return plusSeconds(j$.com.android.tools.r8.a.Q(j2, 60L));
            case 6:
                return plusSeconds(j$.com.android.tools.r8.a.Q(j2, 3600L));
            case 7:
                return plusSeconds(j$.com.android.tools.r8.a.Q(j2, 43200L));
            case 8:
                return plusSeconds(j$.com.android.tools.r8.a.Q(j2, 86400L));
            default:
                f.f("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return null;
        }
    }

    public final long O(Instant instant) {
        long jR = j$.com.android.tools.r8.a.R(instant.f49796a, this.f49796a);
        long j2 = instant.f49797b - this.f49797b;
        return (jR <= 0 || j2 >= 0) ? (jR >= 0 || j2 <= 0) ? jR : jR + 1 : jR - 1;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j2, j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return (Instant) mVar.x(this, j2);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) mVar;
        aVar.z(j2);
        int i2 = d.f49894a[aVar.ordinal()];
        int i3 = this.f49797b;
        long j3 = this.f49796a;
        if (i2 == 1) {
            return j2 != ((long) i3) ? B(j3, (int) j2) : this;
        }
        if (i2 == 2) {
            int i4 = ((int) j2) * 1000;
            return i4 != i3 ? B(j3, i4) : this;
        }
        if (i2 == 3) {
            int i5 = ((int) j2) * PlaybackException.CUSTOM_ERROR_CODE_BASE;
            return i5 != i3 ? B(j3, i5) : this;
        }
        if (i2 == 4) {
            return j2 != j3 ? B(j2, i3) : this;
        }
        f.f("Unsupported field: ".concat(String.valueOf(mVar)));
        return null;
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.B(this, zoneOffset);
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.L(this, zoneId);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.m mVar) {
        return mVar instanceof j$.time.temporal.a ? mVar == j$.time.temporal.a.INSTANT_SECONDS || mVar == j$.time.temporal.a.NANO_OF_SECOND || mVar == j$.time.temporal.a.MICRO_OF_SECOND || mVar == j$.time.temporal.a.MILLI_OF_SECOND : mVar != null && mVar.f(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int iCompare = Long.compare(this.f49796a, instant2.f49796a);
        return iCompare != 0 ? iCompare : this.f49797b - instant2.f49797b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.f49796a == instant.f49796a && this.f49797b == instant.f49797b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int f(j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.n.d(this, mVar).a(mVar.k(this), mVar);
        }
        int i2 = d.f49894a[((j$.time.temporal.a) mVar).ordinal()];
        int i3 = this.f49797b;
        if (i2 == 1) {
            return i3;
        }
        if (i2 == 2) {
            return i3 / 1000;
        }
        if (i2 == 3) {
            return i3 / PlaybackException.CUSTOM_ERROR_CODE_BASE;
        }
        if (i2 == 4) {
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            aVar.f50048b.a(this.f49796a, aVar);
        }
        f.f("Unsupported field: ".concat(String.valueOf(mVar)));
        return 0;
    }

    public long getEpochSecond() {
        return this.f49796a;
    }

    public int getNano() {
        return this.f49797b;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: h */
    public final Temporal y(LocalDate localDate) {
        localDate.getClass();
        return (Instant) j$.com.android.tools.r8.a.a(localDate, this);
    }

    public int hashCode() {
        long j2 = this.f49796a;
        return (this.f49797b * 51) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public boolean isAfter(Instant instant) {
        int iCompare = Long.compare(this.f49796a, instant.f49796a);
        if (iCompare == 0) {
            iCompare = this.f49797b - instant.f49797b;
        }
        return iCompare > 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(j$.time.temporal.m mVar) {
        return j$.time.temporal.n.d(this, mVar);
    }

    @Override // j$.time.temporal.k
    public final Temporal m(Temporal temporal) {
        return temporal.a(this.f49796a, j$.time.temporal.a.INSTANT_SECONDS).a(this.f49797b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public Instant minusMillis(long j2) {
        return j2 == Long.MIN_VALUE ? plusMillis(Long.MAX_VALUE).plusMillis(1L) : plusMillis(-j2);
    }

    public Instant plus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.f(this);
    }

    public Instant plusMillis(long j2) {
        return M(j2 / 1000, (j2 % 1000) * 1000000);
    }

    public Instant plusSeconds(long j2) {
        return M(j2, 0L);
    }

    public long toEpochMilli() {
        long j2 = this.f49796a;
        return (j2 >= 0 || this.f49797b <= 0) ? j$.com.android.tools.r8.a.P(j$.com.android.tools.r8.a.Q(j2, 1000L), r8 / PlaybackException.CUSTOM_ERROR_CODE_BASE) : j$.com.android.tools.r8.a.P(j$.com.android.tools.r8.a.Q(j2 + 1, 1000L), (r8 / PlaybackException.CUSTOM_ERROR_CODE_BASE) - 1000);
    }

    public final String toString() {
        return DateTimeFormatter.f49898g.format(this);
    }

    @Override // j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        Instant instantL = L(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, instantL);
        }
        int i2 = d.f49895b[((ChronoUnit) temporalUnit).ordinal()];
        int i3 = this.f49797b;
        long j2 = this.f49796a;
        switch (i2) {
            case 1:
                return j$.com.android.tools.r8.a.P(j$.com.android.tools.r8.a.Q(j$.com.android.tools.r8.a.R(instantL.f49796a, j2), C.NANOS_PER_SECOND), instantL.f49797b - i3);
            case 2:
                return j$.com.android.tools.r8.a.P(j$.com.android.tools.r8.a.Q(j$.com.android.tools.r8.a.R(instantL.f49796a, j2), C.NANOS_PER_SECOND), instantL.f49797b - i3) / 1000;
            case 3:
                return j$.com.android.tools.r8.a.R(instantL.toEpochMilli(), toEpochMilli());
            case 4:
                return O(instantL);
            case 5:
                return O(instantL) / 60;
            case 6:
                return O(instantL) / 3600;
            case 7:
                return O(instantL) / 43200;
            case 8:
                return O(instantL) / 86400;
            default:
                f.f("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                return 0L;
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object x(j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == j$.time.temporal.n.f50067c) {
            return ChronoUnit.NANOS;
        }
        if (nVar == j$.time.temporal.n.f50066b || nVar == j$.time.temporal.n.f50065a || nVar == j$.time.temporal.n.f50069e || nVar == j$.time.temporal.n.f50068d || nVar == j$.time.temporal.n.f50070f || nVar == j$.time.temporal.n.f50071g) {
            return null;
        }
        return nVar.d(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal z(long j2, ChronoUnit chronoUnit) {
        long j3;
        if (j2 == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, chronoUnit);
            j3 = 1;
        } else {
            j3 = -j2;
        }
        return this.b(j3, chronoUnit);
    }

    public static Instant ofEpochSecond(long j2) {
        return B(j2, 0);
    }
}
