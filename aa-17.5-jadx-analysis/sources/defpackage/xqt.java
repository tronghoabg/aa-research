package defpackage;

/* loaded from: classes3.dex */
public final class xqt {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public xqt(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqt)) {
            return false;
        }
        xqt xqtVar = (xqt) obj;
        return Float.compare(this.a, xqtVar.a) == 0 && Float.compare(this.b, xqtVar.b) == 0 && Float.compare(this.c, xqtVar.c) == 0 && Float.compare(this.d, xqtVar.d) == 0;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
    }

    public final String toString() {
        return "RadiiSums(sumTop=" + this.a + ", sumBottom=" + this.b + ", sumLeft=" + this.c + ", sumRight=" + this.d + ")";
    }
}
