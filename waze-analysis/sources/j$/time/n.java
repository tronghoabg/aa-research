package j$.time;

import androidx.compose.foundation.style.StylePropertiesKt;
import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class n implements TemporalAmount, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final n f50019d = new n(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* renamed from: a, reason: collision with root package name */
    public final int f50020a;

    /* renamed from: b, reason: collision with root package name */
    public final int f50021b;

    /* renamed from: c, reason: collision with root package name */
    public final int f50022c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        j$.com.android.tools.r8.a.I(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public n(int i2, int i3, int i4) {
        this.f50020a = i2;
        this.f50021b = i3;
        this.f50022c = i4;
    }

    public static n a(int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? f50019d : new n(i2, i3, i4);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o(StylePropertiesKt.TopId, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f50020a == nVar.f50020a && this.f50021b == nVar.f50021b && this.f50022c == nVar.f50022c) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal f(Temporal temporal) {
        Objects.requireNonNull(temporal, "temporal");
        Chronology chronology = (Chronology) temporal.x(j$.time.temporal.n.f50066b);
        if (chronology != null && !j$.time.chrono.r.f49878d.equals(chronology)) {
            throw new c("Chronology mismatch, expected: ISO, actual: " + chronology.getId());
        }
        int i2 = this.f50021b;
        int i3 = this.f50020a;
        if (i2 != 0) {
            long j2 = (i3 * 12) + i2;
            if (j2 != 0) {
                temporal = temporal.b(j2, ChronoUnit.MONTHS);
            }
        } else if (i3 != 0) {
            temporal = temporal.b(i3, ChronoUnit.YEARS);
        }
        int i4 = this.f50022c;
        return i4 != 0 ? temporal.b(i4, ChronoUnit.DAYS) : temporal;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f50022c, 16) + Integer.rotateLeft(this.f50021b, 8) + this.f50020a;
    }

    public final String toString() {
        if (this == f50019d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i2 = this.f50020a;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('Y');
        }
        int i3 = this.f50021b;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('M');
        }
        int i4 = this.f50022c;
        if (i4 != 0) {
            sb.append(i4);
            sb.append('D');
        }
        return sb.toString();
    }
}
