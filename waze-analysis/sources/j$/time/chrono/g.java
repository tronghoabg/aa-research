package j$.time.chrono;

import androidx.compose.material3.internal.CalendarModelKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.common.C;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class g implements e, Temporal, j$.time.temporal.k, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* renamed from: a, reason: collision with root package name */
    public final transient b f49847a;

    /* renamed from: b, reason: collision with root package name */
    public final transient LocalTime f49848b;

    public g(b bVar, LocalTime localTime) {
        Objects.requireNonNull(bVar, "date");
        Objects.requireNonNull(localTime, "time");
        this.f49847a = bVar;
        this.f49848b = localTime;
    }

    public static g B(Chronology chronology, Temporal temporal) {
        g gVar = (g) temporal;
        if (chronology.equals(gVar.f49847a.getChronology())) {
            return gVar;
        }
        throw new ClassCastException(j$.desugar.sun.nio.fs.h.b("Chronology mismatch, required: ", chronology.getId(), ", actual: ", gVar.f49847a.getChronology().getId()));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new d0((byte) 2, this);
    }

    @Override // j$.time.chrono.e
    public final ChronoZonedDateTime A(ZoneId zoneId) {
        return k.B(zoneId, null, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.m mVar) {
        return mVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) mVar).B() ? this.f49848b.D(mVar) : this.f49847a.D(mVar) : mVar.k(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: G */
    public final /* synthetic */ int compareTo(e eVar) {
        return j$.com.android.tools.r8.a.e(this, eVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final g b(long j2, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        b bVar = this.f49847a;
        if (!z) {
            return B(bVar.getChronology(), temporalUnit.f(this, j2));
        }
        int i2 = f.f49845a[((ChronoUnit) temporalUnit).ordinal()];
        LocalTime localTime = this.f49848b;
        switch (i2) {
            case 1:
                return M(bVar, 0L, 0L, 0L, j2);
            case 2:
                g gVarO = O(bVar.b(j2 / 86400000000L, (TemporalUnit) ChronoUnit.DAYS), localTime);
                return gVarO.M(gVarO.f49847a, 0L, 0L, 0L, (j2 % 86400000000L) * 1000);
            case 3:
                g gVarO2 = O(bVar.b(j2 / CalendarModelKt.MillisecondsIn24Hours, (TemporalUnit) ChronoUnit.DAYS), localTime);
                return gVarO2.M(gVarO2.f49847a, 0L, 0L, 0L, (j2 % CalendarModelKt.MillisecondsIn24Hours) * 1000000);
            case 4:
                return M(bVar, 0L, 0L, j2, 0L);
            case 5:
                return M(bVar, 0L, j2, 0L, 0L);
            case 6:
                return M(bVar, j2, 0L, 0L, 0L);
            case 7:
                g gVarO3 = O(bVar.b(j2 / 256, (TemporalUnit) ChronoUnit.DAYS), localTime);
                return gVarO3.M(gVarO3.f49847a, (j2 % 256) * 12, 0L, 0L, 0L);
            default:
                return O(bVar.b(j2, temporalUnit), localTime);
        }
    }

    public final g M(b bVar, long j2, long j3, long j4, long j5) {
        long j6 = j2 | j3 | j4 | j5;
        LocalTime localTimeP = this.f49848b;
        if (j6 == 0) {
            return O(bVar, localTimeP);
        }
        long j7 = j3 / 1440;
        long j8 = j2 / 24;
        long j9 = (j3 % 1440) * 60000000000L;
        long j10 = ((j2 % 24) * 3600000000000L) + j9 + ((j4 % 86400) * C.NANOS_PER_SECOND) + (j5 % 86400000000000L);
        long jW = localTimeP.W();
        long j11 = j10 + jW;
        long jF = j$.com.android.tools.r8.a.F(j11, 86400000000000L) + j8 + j7 + (j4 / 86400) + (j5 / 86400000000000L);
        long jO = j$.com.android.tools.r8.a.O(j11, 86400000000000L);
        if (jO != jW) {
            localTimeP = LocalTime.P(jO);
        }
        return O(bVar.b(jF, (TemporalUnit) ChronoUnit.DAYS), localTimeP);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final g a(long j2, j$.time.temporal.m mVar) {
        boolean z = mVar instanceof j$.time.temporal.a;
        b bVar = this.f49847a;
        if (!z) {
            return B(bVar.getChronology(), mVar.x(this, j2));
        }
        boolean zB = ((j$.time.temporal.a) mVar).B();
        LocalTime localTime = this.f49848b;
        return zB ? O(bVar, localTime.a(j2, mVar)) : O(bVar.a(j2, mVar), localTime);
    }

    public final g O(Temporal temporal, LocalTime localTime) {
        b bVar = this.f49847a;
        return (bVar == temporal && this.f49848b == localTime) ? this : new g(d.B(bVar.getChronology(), temporal), localTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return mVar != null && mVar.f(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) mVar;
        return aVar.isDateBased() || aVar.B();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && j$.com.android.tools.r8.a.e(this, (e) obj) == 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int f(j$.time.temporal.m mVar) {
        return mVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) mVar).B() ? this.f49848b.f(mVar) : this.f49847a.f(mVar) : k(mVar).a(D(mVar), mVar);
    }

    @Override // j$.time.chrono.e
    public final Chronology getChronology() {
        return this.f49847a.getChronology();
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: h */
    public final Temporal y(LocalDate localDate) {
        if (j$.desugar.sun.nio.fs.h.c(localDate)) {
            return O(localDate, this.f49848b);
        }
        Chronology chronology = this.f49847a.getChronology();
        localDate.getClass();
        return B(chronology, (g) j$.com.android.tools.r8.a.a(localDate, this));
    }

    public final int hashCode() {
        return this.f49848b.hashCode() ^ this.f49847a.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return mVar.h(this);
        }
        if (!((j$.time.temporal.a) mVar).B()) {
            return this.f49847a.k(mVar);
        }
        LocalTime localTime = this.f49848b;
        localTime.getClass();
        return j$.time.temporal.n.d(localTime, mVar);
    }

    @Override // j$.time.temporal.k
    public final Temporal m(Temporal temporal) {
        return temporal.a(toLocalDate().toEpochDay(), j$.time.temporal.a.EPOCH_DAY).a(toLocalTime().W(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // j$.time.chrono.e
    public final /* synthetic */ long toEpochSecond(ZoneOffset zoneOffset) {
        return j$.com.android.tools.r8.a.u(this, zoneOffset);
    }

    @Override // j$.time.chrono.e
    public final b toLocalDate() {
        return this.f49847a;
    }

    @Override // j$.time.chrono.e
    public final LocalTime toLocalTime() {
        return this.f49848b;
    }

    public final String toString() {
        return j$.desugar.sun.nio.fs.h.a(this.f49847a.toString(), ExifInterface.GPS_DIRECTION_TRUE, this.f49848b.toString());
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        b bVar = this.f49847a;
        e eVarF = bVar.getChronology().F(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.between(this, eVarF);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        ChronoUnit chronoUnit2 = ChronoUnit.DAYS;
        int iCompareTo = chronoUnit.compareTo(chronoUnit2);
        LocalTime localTime = this.f49848b;
        if (iCompareTo >= 0) {
            b localDate = eVarF.toLocalDate();
            if (eVarF.toLocalTime().compareTo(localTime) < 0) {
                localDate = localDate.z(1L, chronoUnit2);
            }
            return bVar.until(localDate, temporalUnit);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        long jD = eVarF.D(aVar) - bVar.D(aVar);
        switch (f.f49845a[chronoUnit.ordinal()]) {
            case 1:
                jD = j$.com.android.tools.r8.a.Q(jD, 86400000000000L);
                break;
            case 2:
                jD = j$.com.android.tools.r8.a.Q(jD, 86400000000L);
                break;
            case 3:
                jD = j$.com.android.tools.r8.a.Q(jD, CalendarModelKt.MillisecondsIn24Hours);
                break;
            case 4:
                jD = j$.com.android.tools.r8.a.Q(jD, 86400L);
                break;
            case 5:
                jD = j$.com.android.tools.r8.a.Q(jD, 1440L);
                break;
            case 6:
                jD = j$.com.android.tools.r8.a.Q(jD, 24L);
                break;
            case 7:
                jD = j$.com.android.tools.r8.a.Q(jD, 2L);
                break;
        }
        return j$.com.android.tools.r8.a.P(jD, localTime.until(eVarF.toLocalTime(), temporalUnit));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object x(j$.desugar.sun.nio.fs.n nVar) {
        return j$.com.android.tools.r8.a.r(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal z(long j2, ChronoUnit chronoUnit) {
        return B(this.f49847a.getChronology(), j$.time.temporal.n.b(this, j2, chronoUnit));
    }
}
