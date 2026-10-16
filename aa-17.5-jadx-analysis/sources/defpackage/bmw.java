package defpackage;

/* loaded from: classes.dex */
public final class bmw {
    public final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;

    public bmw(float f, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof bmw)) {
            bmw bmwVar = (bmw) obj;
            if (Float.compare(this.a, bmwVar.a) == 0 && Float.compare(this.b, bmwVar.b) == 0 && Float.compare(this.c, bmwVar.c) == 0 && Float.compare(this.d, bmwVar.d) == 0 && Float.compare(this.e, bmwVar.e) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e);
    }
}
