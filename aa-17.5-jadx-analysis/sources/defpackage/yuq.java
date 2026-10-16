package defpackage;

import j$.util.Objects;

/* loaded from: classes3.dex */
public final class yuq extends yur {
    public final yur a;
    private final double b;

    public yuq(yur yurVar) {
        Double dValueOf = Double.valueOf(0.5d);
        woy.S(true, "randomnessFactor (%s) must be >= 0.0", dValueOf);
        woy.S(true, "randomnessFactor (%s) must be <= 1.0", dValueOf);
        this.a = yurVar;
        this.b = 0.5d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yuq)) {
            return false;
        }
        yuq yuqVar = (yuq) obj;
        if (!this.a.equals(yuqVar.a)) {
            return false;
        }
        double d = yuqVar.b;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Double.valueOf(0.5d));
    }

    public final String toString() {
        return this.a.toString() + ".withRandomization(0.5)";
    }
}
