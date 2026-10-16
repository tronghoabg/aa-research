package j$.time;

import androidx.compose.foundation.style.StylePropertiesKt;
import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.b0;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class j implements TemporalAccessor, j$.time.temporal.k, Comparable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f50011c = 0;
    private static final long serialVersionUID = -939150713474957432L;

    /* renamed from: a, reason: collision with root package name */
    public final int f50012a;

    /* renamed from: b, reason: collision with root package name */
    public final int f50013b;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.e("--");
        dateTimeFormatterBuilder.m(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        dateTimeFormatterBuilder.d('-');
        dateTimeFormatterBuilder.m(j$.time.temporal.a.DAY_OF_MONTH, 2);
        dateTimeFormatterBuilder.r(Locale.getDefault(), b0.SMART, null);
    }

    public j(int i2, int i3) {
        this.f50012a = i2;
        this.f50013b = i3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o(StylePropertiesKt.LeftId, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return mVar.k(this);
        }
        int i2 = i.f50010a[((j$.time.temporal.a) mVar).ordinal()];
        if (i2 == 1) {
            return this.f50013b;
        }
        if (i2 == 2) {
            return this.f50012a;
        }
        f.f("Unsupported field: ".concat(String.valueOf(mVar)));
        return 0L;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.m mVar) {
        return mVar instanceof j$.time.temporal.a ? mVar == j$.time.temporal.a.MONTH_OF_YEAR || mVar == j$.time.temporal.a.DAY_OF_MONTH : mVar != null && mVar.f(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        j jVar = (j) obj;
        int i2 = this.f50012a - jVar.f50012a;
        return i2 == 0 ? this.f50013b - jVar.f50013b : i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f50012a == jVar.f50012a && this.f50013b == jVar.f50013b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int f(j$.time.temporal.m mVar) {
        return k(mVar).a(D(mVar), mVar);
    }

    public final int hashCode() {
        return (this.f50012a << 6) + this.f50013b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(j$.time.temporal.m mVar) {
        if (mVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return mVar.range();
        }
        if (mVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return j$.time.temporal.n.d(this, mVar);
        }
        int iOrdinal = Month.N(this.f50012a).ordinal();
        return j$.time.temporal.p.g(1L, iOrdinal != 1 ? (iOrdinal == 3 || iOrdinal == 5 || iOrdinal == 8 || iOrdinal == 10) ? 30 : 31 : 28, Month.N(r6).M());
    }

    @Override // j$.time.temporal.k
    public final Temporal m(Temporal temporal) {
        if (!Chronology.CC.a(temporal).equals(j$.time.chrono.r.f49878d)) {
            f.h("Adjustment only supported on ISO date-time");
            return null;
        }
        Temporal temporalA = temporal.a(this.f50012a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return temporalA.a(Math.min(temporalA.k(aVar).f50075d, this.f50013b), aVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        int i2 = this.f50012a;
        sb.append(i2 < 10 ? "0" : "");
        sb.append(i2);
        int i3 = this.f50013b;
        sb.append(i3 < 10 ? "-0" : "-");
        sb.append(i3);
        return sb.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object x(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.n.f50066b ? j$.time.chrono.r.f49878d : j$.time.temporal.n.c(this, nVar);
    }
}
