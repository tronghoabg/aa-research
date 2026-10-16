package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xrx {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public xrx(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.xrx)) {
            return false;
        }
        defpackage.xrx xrxVar = (defpackage.xrx) obj;
        return java.lang.Float.compare(this.a, xrxVar.a) == 0 && java.lang.Float.compare(this.b, xrxVar.b) == 0 && java.lang.Float.compare(this.c, xrxVar.c) == 0 && java.lang.Float.compare(this.d, xrxVar.d) == 0;
    }

    public final int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d);
    }

    public final java.lang.String toString() {
        return "RadiiSums(sumTop=" + this.a + ", sumBottom=" + this.b + ", sumLeft=" + this.c + ", sumRight=" + this.d + ")";
    }
}
