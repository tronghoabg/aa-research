package defpackage;

import j$.util.Objects;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class toi implements Serializable {
    static final long serialVersionUID = 2026947877447454771L;
    public final double a;
    public final double b;

    public toi(double d, double d2) {
        this.b = (d2 < -180.0d || d2 >= 180.0d) ? ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d : d2;
        this.a = Math.max(-90.0d, Math.min(90.0d, d));
    }

    private static boolean a(double d, double d2) {
        return (Double.doubleToLongBits(d) & (-2)) == (Double.doubleToLongBits(d2) & (-2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toi)) {
            return false;
        }
        toi toiVar = (toi) obj;
        return a(this.a, toiVar.a) && a(this.b, toiVar.b);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(Double.doubleToLongBits(this.a)), Long.valueOf(Double.doubleToLongBits(this.b)));
    }

    public final String toString() {
        return "lat/lng: (" + this.a + "," + this.b + ")";
    }

    public toi() {
        throw null;
    }
}
