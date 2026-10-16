package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rbl {
    final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public rbl(boolean z, boolean z2, boolean z3, int i, int i2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.rbl rblVar = (defpackage.rbl) obj;
            if (this.a == rblVar.a && this.b == rblVar.b && this.c == rblVar.c && this.d == rblVar.d && this.e == rblVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + this.d) * 31) + this.e;
    }

    public final java.lang.String toString() {
        return "Config{hasTouchScreen=" + this.a + ", hasRotaryController=" + this.b + ", hasTouchpadForNavigation=" + this.c + ", touchpadMoveThresholdPx=" + this.d + ", touchpadMultimoveThresholdPx=" + this.e + "}";
    }
}
