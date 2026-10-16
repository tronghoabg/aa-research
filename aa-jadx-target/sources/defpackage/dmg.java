package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dmg implements defpackage.dme {
    private final float[] a;
    private final float[] b;

    public dmg(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length) {
            throw new java.lang.IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.a = fArr;
        this.b = fArr2;
    }

    @Override // defpackage.dme
    public final float a(float f) {
        return defpackage.dmh.e(f, this.b, this.a);
    }

    @Override // defpackage.dme
    public final float b(float f) {
        return defpackage.dmh.e(f, this.a, this.b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof defpackage.dmg)) {
            return false;
        }
        defpackage.dmg dmgVar = (defpackage.dmg) obj;
        return java.util.Arrays.equals(this.a, dmgVar.a) && java.util.Arrays.equals(this.b, dmgVar.b);
    }

    public final int hashCode() {
        return (java.util.Arrays.hashCode(this.a) * 31) + java.util.Arrays.hashCode(this.b);
    }

    public final java.lang.String toString() {
        java.lang.String string = java.util.Arrays.toString(this.a);
        string.getClass();
        java.lang.String string2 = java.util.Arrays.toString(this.b);
        string2.getClass();
        return defpackage.a.bB(string2, string, "FontScaleConverter{fromSpValues=", ", toDpValues=", "}");
    }
}
