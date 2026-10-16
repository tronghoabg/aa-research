package defpackage;

/* loaded from: classes.dex */
public final class ayp {
    public final int a;
    public final int b;

    public ayp(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i < 0) {
            asl.c("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        asl.c("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayp)) {
            return false;
        }
        ayp aypVar = (ayp) obj;
        return this.a == aypVar.a && this.b == aypVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "Interval(start=" + this.a + ", end=" + this.b + ")";
    }
}
