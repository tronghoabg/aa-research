package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class h implements TemporalAmount, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f49850e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* renamed from: a, reason: collision with root package name */
    public final Chronology f49851a;

    /* renamed from: b, reason: collision with root package name */
    public final int f49852b;

    /* renamed from: c, reason: collision with root package name */
    public final int f49853c;

    /* renamed from: d, reason: collision with root package name */
    public final int f49854d;

    static {
        j$.com.android.tools.r8.a.I(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public h(Chronology chronology, int i2, int i3, int i4) {
        Objects.requireNonNull(chronology, "chrono");
        this.f49851a = chronology;
        this.f49852b = i2;
        this.f49853c = i3;
        this.f49854d = i4;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f49852b == hVar.f49852b && this.f49853c == hVar.f49853c && this.f49854d == hVar.f49854d && this.f49851a.equals(hVar.f49851a);
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal f(Temporal temporal) {
        Objects.requireNonNull(temporal, "temporal");
        Chronology chronology = (Chronology) temporal.x(j$.time.temporal.n.f50066b);
        Chronology chronology2 = this.f49851a;
        if (chronology != null && !chronology2.equals(chronology)) {
            j$.time.f.h(j$.desugar.sun.nio.fs.h.b("Chronology mismatch, expected: ", chronology2.getId(), ", actual: ", chronology.getId()));
            return null;
        }
        int i2 = this.f49852b;
        int i3 = this.f49853c;
        if (i3 != 0) {
            j$.time.temporal.p pVarO = chronology2.o(j$.time.temporal.a.MONTH_OF_YEAR);
            long j2 = pVarO.f50072a;
            long j3 = pVarO.f50075d;
            long j4 = (j2 == pVarO.f50073b && pVarO.f50074c == j3 && pVarO.d()) ? (j3 - pVarO.f50072a) + 1 : -1L;
            if (j4 > 0) {
                temporal = temporal.b((i2 * j4) + i3, ChronoUnit.MONTHS);
            } else {
                if (i2 != 0) {
                    temporal = temporal.b(i2, ChronoUnit.YEARS);
                }
                temporal = temporal.b(i3, ChronoUnit.MONTHS);
            }
        } else if (i2 != 0) {
            temporal = temporal.b(i2, ChronoUnit.YEARS);
        }
        int i4 = this.f49854d;
        return i4 != 0 ? temporal.b(i4, ChronoUnit.DAYS) : temporal;
    }

    public final int hashCode() {
        return this.f49851a.hashCode() ^ (Integer.rotateLeft(this.f49854d, 16) + (Integer.rotateLeft(this.f49853c, 8) + this.f49852b));
    }

    public final String toString() {
        Chronology chronology = this.f49851a;
        int i2 = this.f49854d;
        int i3 = this.f49853c;
        int i4 = this.f49852b;
        if (i4 == 0 && i3 == 0 && i2 == 0) {
            return chronology.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(chronology.toString());
        sb.append(" P");
        if (i4 != 0) {
            sb.append(i4);
            sb.append('Y');
        }
        if (i3 != 0) {
            sb.append(i3);
            sb.append('M');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('D');
        }
        return sb.toString();
    }

    public Object writeReplace() {
        return new d0((byte) 9, this);
    }
}
