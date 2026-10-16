package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class crw {
    public long a;
    public float b;

    public crw(long j, float f) {
        this.a = j;
        this.b = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.crw)) {
            return false;
        }
        defpackage.crw crwVar = (defpackage.crw) obj;
        return this.a == crwVar.a && java.lang.Float.compare(this.b, crwVar.b) == 0;
    }

    public final int hashCode() {
        long j = this.a;
        return (((int) (j ^ (j >>> 32))) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        return "DataPointAtTime(time=" + this.a + ", dataPoint=" + this.b + ")";
    }
}
