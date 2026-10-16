package defpackage;

/* loaded from: classes2.dex */
public final class mce {
    public static final mce a = new mce(16.0f, 16.0f, 24.0f, new kuu(16));
    public static final mce b = new mce(32.0f, 32.0f, 48.0f, new kuu(17));
    public final float c;
    public final float d;
    public final float e;
    public final afeg f;

    static {
        woy.dG(new llj(10));
    }

    private mce(float f, float f2, float f3, afeg afegVar) {
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = afegVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mce)) {
            return false;
        }
        mce mceVar = (mce) obj;
        return dlj.c(this.c, mceVar.c) && dlj.c(this.d, mceVar.d) && dlj.c(this.e, mceVar.e) && affa.f(this.f, mceVar.f);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + this.f.hashCode();
    }

    public final String toString() {
        float f = this.e;
        float f2 = this.d;
        return "CountBadgeSize(height=" + dlj.b(this.c) + ", defaultWidth=" + dlj.b(f2) + ", extendedWidth=" + dlj.b(f) + ", textStyle=" + this.f + ")";
    }
}
