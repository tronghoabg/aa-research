package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xug {
    public final int a;
    public final int b;
    public final int c;

    static {
        new java.util.LinkedHashMap();
        new java.util.LinkedHashMap();
    }

    public xug(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.xug)) {
            return false;
        }
        defpackage.xug xugVar = (defpackage.xug) obj;
        return this.a == xugVar.a && this.b == xugVar.b && this.c == xugVar.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final java.lang.String toString() {
        return "EnergyColors(mid=" + this.a + ", end=" + this.b + ", neural=" + this.c + ")";
    }
}
