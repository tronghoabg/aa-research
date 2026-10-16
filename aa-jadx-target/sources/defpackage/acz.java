package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acz {
    public final float a;
    public final float b;
    public final long c;

    public acz(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.acz)) {
            return false;
        }
        defpackage.acz aczVar = (defpackage.acz) obj;
        return java.lang.Float.compare(this.a, aczVar.a) == 0 && java.lang.Float.compare(this.b, aczVar.b) == 0 && this.c == aczVar.c;
    }

    public final int hashCode() {
        int iFloatToIntBits = (java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b);
        long j = this.c;
        return (iFloatToIntBits * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final java.lang.String toString() {
        return "FlingInfo(initialVelocity=" + this.a + ", distance=" + this.b + ", duration=" + this.c + ")";
    }
}
