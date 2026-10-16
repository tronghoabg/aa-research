package defpackage;

/* loaded from: classes2.dex */
public final class htw {
    public final int a;
    public final int b;

    public htw(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (!ify.i(i)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!ify.i(i2)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htw)) {
            return false;
        }
        htw htwVar = (htw) obj;
        return this.a == htwVar.a && this.b == htwVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ")";
    }
}
