package defpackage;

/* loaded from: classes.dex */
public final class auy {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public auy(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof auy)) {
            return false;
        }
        auy auyVar = (auy) obj;
        return this.a == auyVar.a && this.b == auyVar.b && this.c == auyVar.c && this.d == auyVar.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "InsetsValues(left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + ")";
    }
}
