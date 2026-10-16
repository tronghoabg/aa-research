package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ckf extends defpackage.cke {
    private float[] a;

    public ckf(float[] fArr) {
        super(new android.graphics.ColorMatrixColorFilter(fArr));
        this.a = fArr;
    }

    private final float[] a() {
        float[] fArr = this.a;
        if (fArr != null) {
            return fArr;
        }
        android.graphics.ColorFilter colorFilter = this.b;
        if (!(colorFilter instanceof android.graphics.ColorMatrixColorFilter)) {
            throw new java.lang.IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
        }
        android.graphics.ColorMatrix colorMatrix = new android.graphics.ColorMatrix();
        a$.ExternalSyntheticApiModelOutline1.m((android.graphics.ColorMatrixColorFilter) colorFilter, colorMatrix);
        float[] array = colorMatrix.getArray();
        this.a = array;
        return array;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.ckf) && java.util.Arrays.equals(a(), ((defpackage.ckf) obj).a());
    }

    public final int hashCode() {
        float[] fArr = this.a;
        if (fArr != null) {
            return java.util.Arrays.hashCode(fArr);
        }
        return 0;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        float[] fArr = this.a;
        if (fArr == null) {
            str = "null";
        } else {
            str = "ColorMatrix(values=" + java.util.Arrays.toString(fArr) + ")";
        }
        return defpackage.a.bp(str, "ColorMatrixColorFilter(colorMatrix=", ")");
    }
}
