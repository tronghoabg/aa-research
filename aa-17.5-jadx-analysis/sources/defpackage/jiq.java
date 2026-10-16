package defpackage;

/* loaded from: classes.dex */
public final class jiq {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public jiq(float f, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jiq) {
            jiq jiqVar = (jiq) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(jiqVar.a)) {
                if (Float.floatToIntBits(this.b) == Float.floatToIntBits(jiqVar.b)) {
                    if (Float.floatToIntBits(this.c) == Float.floatToIntBits(jiqVar.c)) {
                        if (Float.floatToIntBits(this.d) == Float.floatToIntBits(jiqVar.d)) {
                            if (Float.floatToIntBits(this.e) == Float.floatToIntBits(jiqVar.e)) {
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
        int iFloatToIntBits = ((((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ Float.floatToIntBits(this.d);
        return Float.floatToIntBits(this.e) ^ (iFloatToIntBits * 1000003);
    }

    public final String toString() {
        return "DecorationState{cornerRadius=" + this.a + ", offsetLeft=" + this.b + ", offsetTop=" + this.c + ", offsetRight=" + this.d + ", offsetBottom=" + this.e + "}";
    }

    public jiq() {
        throw null;
    }
}
