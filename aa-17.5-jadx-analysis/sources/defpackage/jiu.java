package defpackage;

/* loaded from: classes2.dex */
public final class jiu extends ebj {
    private final int a;
    private final int b;
    private final int c;

    public jiu(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jiu)) {
            return false;
        }
        jiu jiuVar = (jiu) obj;
        return this.a == jiuVar.a && this.b == jiuVar.b && this.c == jiuVar.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "(" + this.a + "," + this.b + "): #" + Integer.toHexString(this.c);
    }
}
