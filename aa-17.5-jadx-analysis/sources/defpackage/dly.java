package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class dly implements dlw {
    private final float[] a;
    private final float[] b;

    public dly(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.a = fArr;
        this.b = fArr2;
    }

    @Override // defpackage.dlw
    public final float a(float f) {
        return dlz.f(f, this.b, this.a);
    }

    @Override // defpackage.dlw
    public final float b(float f) {
        return dlz.f(f, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof dly)) {
            return false;
        }
        dly dlyVar = (dly) obj;
        return Arrays.equals(this.a, dlyVar.a) && Arrays.equals(this.b, dlyVar.b);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        String string = Arrays.toString(this.a);
        string.getClass();
        String string2 = Arrays.toString(this.b);
        string2.getClass();
        return a.bC(string2, string, "FontScaleConverter{fromSpValues=", ", toDpValues=", "}");
    }
}
