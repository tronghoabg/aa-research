package defpackage;

/* loaded from: classes.dex */
public final class crn {
    public long a;
    public float b;

    public crn(long j, float f) {
        this.a = j;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crn)) {
            return false;
        }
        crn crnVar = (crn) obj;
        return this.a == crnVar.a && Float.compare(this.b, crnVar.b) == 0;
    }

    public final int hashCode() {
        long j = this.a;
        return (((int) (j ^ (j >>> 32))) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "DataPointAtTime(time=" + this.a + ", dataPoint=" + this.b + ")";
    }
}
