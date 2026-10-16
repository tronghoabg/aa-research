package defpackage;

/* loaded from: classes.dex */
public final class acs {
    public final float a;
    public final float b;
    public final long c;

    public acs(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acs)) {
            return false;
        }
        acs acsVar = (acs) obj;
        return Float.compare(this.a, acsVar.a) == 0 && Float.compare(this.b, acsVar.b) == 0 && this.c == acsVar.c;
    }

    public final int hashCode() {
        int iFloatToIntBits = (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
        long j = this.c;
        return (iFloatToIntBits * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.a + ", distance=" + this.b + ", duration=" + this.c + ")";
    }
}
