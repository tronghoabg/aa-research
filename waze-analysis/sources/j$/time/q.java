package j$.time;

import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.media3.common.C;
import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.b0;
import j$.time.format.c0;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class q implements Temporal, j$.time.temporal.k, Comparable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f50027b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* renamed from: a, reason: collision with root package name */
    public final int f50028a;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.n(j$.time.temporal.a.YEAR, 4, 10, c0.EXCEEDS_PAD);
        dateTimeFormatterBuilder.r(Locale.getDefault(), b0.SMART, null);
    }

    public q(int i2) {
        this.f50028a = i2;
    }

    public static q B(int i2) {
        j$.time.temporal.a.YEAR.z(i2);
        return new q(i2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o(StylePropertiesKt.WidthFractionId, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return mVar.k(this);
        }
        int i2 = p.f50025a[((j$.time.temporal.a) mVar).ordinal()];
        int i3 = this.f50028a;
        if (i2 == 1) {
            if (i3 < 1) {
                i3 = 1 - i3;
            }
            return i3;
        }
        if (i2 == 2) {
            return i3;
        }
        if (i2 == 3) {
            return i3 < 1 ? 0 : 1;
        }
        f.f("Unsupported field: ".concat(String.valueOf(mVar)));
        return 0L;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final q b(long j2, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (q) temporalUnit.f(this, j2);
        }
        int i2 = p.f50026b[((ChronoUnit) temporalUnit).ordinal()];
        if (i2 == 1) {
            return M(j2);
        }
        if (i2 == 2) {
            return M(j$.com.android.tools.r8.a.Q(j2, 10L));
        }
        if (i2 == 3) {
            return M(j$.com.android.tools.r8.a.Q(j2, 100L));
        }
        if (i2 == 4) {
            return M(j$.com.android.tools.r8.a.Q(j2, 1000L));
        }
        if (i2 == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return a(j$.com.android.tools.r8.a.P(D(aVar), j2), aVar);
        }
        f.f("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        return null;
    }

    public final q M(long j2) {
        if (j2 == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return B(aVar.f50048b.a(this.f50028a + j2, aVar));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final q a(long j2, j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return (q) mVar.x(this, j2);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) mVar;
        aVar.z(j2);
        int i2 = p.f50025a[aVar.ordinal()];
        int i3 = this.f50028a;
        if (i2 == 1) {
            if (i3 < 1) {
                j2 = 1 - j2;
            }
            return B((int) j2);
        }
        if (i2 == 2) {
            return B((int) j2);
        }
        if (i2 == 3) {
            return D(j$.time.temporal.a.ERA) == j2 ? this : B(1 - i3);
        }
        f.f("Unsupported field: ".concat(String.valueOf(mVar)));
        return null;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.m mVar) {
        return mVar instanceof j$.time.temporal.a ? mVar == j$.time.temporal.a.YEAR || mVar == j$.time.temporal.a.YEAR_OF_ERA || mVar == j$.time.temporal.a.ERA : mVar != null && mVar.f(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f50028a - ((q) obj).f50028a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            if (this.f50028a == ((q) obj).f50028a) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int f(j$.time.temporal.m mVar) {
        return k(mVar).a(D(mVar), mVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: h */
    public final Temporal y(LocalDate localDate) {
        localDate.getClass();
        return (q) j$.com.android.tools.r8.a.a(localDate, this);
    }

    public final int hashCode() {
        return this.f50028a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(j$.time.temporal.m mVar) {
        if (mVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.p.f(1L, this.f50028a <= 0 ? C.NANOS_PER_SECOND : 999999999L);
        }
        return j$.time.temporal.n.d(this, mVar);
    }

    @Override // j$.time.temporal.k
    public final Temporal m(Temporal temporal) {
        if (Chronology.CC.a(temporal).equals(j$.time.chrono.r.f49878d)) {
            return temporal.a(this.f50028a, j$.time.temporal.a.YEAR);
        }
        f.h("Adjustment only supported on ISO date-time");
        return null;
    }

    public final String toString() {
        return Integer.toString(this.f50028a);
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        q qVarB;
        if (temporal instanceof q) {
            qVarB = (q) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!j$.time.chrono.r.f49878d.equals(Chronology.CC.a(temporal))) {
                    temporal = LocalDate.M(temporal);
                }
                qVarB = B(temporal.f(j$.time.temporal.a.YEAR));
            } catch (c e2) {
                throw new c(j$.desugar.sun.nio.fs.h.b("Unable to obtain Year from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e2);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, qVarB);
        }
        long j2 = qVarB.f50028a - this.f50028a;
        int i2 = p.f50026b[((ChronoUnit) temporalUnit).ordinal()];
        if (i2 == 1) {
            return j2;
        }
        if (i2 == 2) {
            return j2 / 10;
        }
        if (i2 == 3) {
            return j2 / 100;
        }
        if (i2 == 4) {
            return j2 / 1000;
        }
        if (i2 == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return qVarB.D(aVar) - D(aVar);
        }
        f.f("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        return 0L;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object x(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.n.f50066b ? j$.time.chrono.r.f49878d : nVar == j$.time.temporal.n.f50067c ? ChronoUnit.YEARS : j$.time.temporal.n.c(this, nVar);
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
}
