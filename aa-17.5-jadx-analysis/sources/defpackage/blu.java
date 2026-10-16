package defpackage;

/* loaded from: classes.dex */
public final class blu {
    public final long a;
    public final long b;

    public blu(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blu)) {
            return false;
        }
        blu bluVar = (blu) obj;
        return this.a == bluVar.a && this.b == bluVar.b;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        long j = this.b;
        return "SelectionColors(selectionHandleColor=" + cjv.g(this.a) + ", selectionBackgroundColor=" + cjv.g(j) + ")";
    }
}
