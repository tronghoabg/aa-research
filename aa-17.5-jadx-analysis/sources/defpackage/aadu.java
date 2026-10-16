package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aadu {
    public final double a;
    public final double b;

    static {
        new aadu(0.0d, 0.0d);
    }

    public aadu(double d, double d2) {
        aclh.o((Double.isNaN(d) || Double.isNaN(d2)) ? false : true, "NaN is not a valid value: (%s,%s)", new Object[]{Double.valueOf(d), Double.valueOf(d2)});
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aadu)) {
            return false;
        }
        aadu aaduVar = (aadu) obj;
        return this.a == aaduVar.a && this.b == aaduVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.a), Double.valueOf(this.b)});
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.c("x", this.a);
        zsaVarA.c("y", this.b);
        return zsaVarA.toString();
    }
}
