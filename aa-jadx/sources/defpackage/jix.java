package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jix {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public jix(float f, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.jix) {
            defpackage.jix jixVar = (defpackage.jix) obj;
            if (java.lang.Float.floatToIntBits(this.a) == java.lang.Float.floatToIntBits(jixVar.a)) {
                if (java.lang.Float.floatToIntBits(this.b) == java.lang.Float.floatToIntBits(jixVar.b)) {
                    if (java.lang.Float.floatToIntBits(this.c) == java.lang.Float.floatToIntBits(jixVar.c)) {
                        if (java.lang.Float.floatToIntBits(this.d) == java.lang.Float.floatToIntBits(jixVar.d)) {
                            if (java.lang.Float.floatToIntBits(this.e) == java.lang.Float.floatToIntBits(jixVar.e)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = ((((((java.lang.Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ java.lang.Float.floatToIntBits(this.b)) * 1000003) ^ java.lang.Float.floatToIntBits(this.c)) * 1000003) ^ java.lang.Float.floatToIntBits(this.d);
        return java.lang.Float.floatToIntBits(this.e) ^ (iFloatToIntBits * 1000003);
    }

    public final java.lang.String toString() {
        return "DecorationState{cornerRadius=" + this.a + ", offsetLeft=" + this.b + ", offsetTop=" + this.c + ", offsetRight=" + this.d + ", offsetBottom=" + this.e + "}";
    }

    public jix() {
        throw null;
    }
}
