package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bna {
    public final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;

    public bna(float f, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.bna)) {
            defpackage.bna bnaVar = (defpackage.bna) obj;
            if (java.lang.Float.compare(this.a, bnaVar.a) == 0 && java.lang.Float.compare(this.b, bnaVar.b) == 0 && java.lang.Float.compare(this.c, bnaVar.c) == 0 && java.lang.Float.compare(this.d, bnaVar.d) == 0 && java.lang.Float.compare(this.e, bnaVar.e) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.e);
    }
}
