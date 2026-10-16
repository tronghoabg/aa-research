package defpackage;

/* loaded from: classes2.dex */
public final class pzk {
    private final int a;
    private final int b;
    private final int c;

    public pzk(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzk)) {
            return false;
        }
        pzk pzkVar = (pzk) obj;
        return this.a == pzkVar.a && this.b == pzkVar.b && this.c == pzkVar.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return this.a + "." + this.b + "." + this.c;
    }
}
