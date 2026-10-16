package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nfh {
    public final int a;
    public final float b;
    public final int c;

    public nfh(int i, int i2, float f) {
        this.a = i;
        this.c = i2;
        this.b = f;
    }

    public final boolean a() {
        int i = this.c;
        return (i == 2 || i == 1) ? false : true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.nfh)) {
            return false;
        }
        defpackage.nfh nfhVar = (defpackage.nfh) obj;
        return this.a == nfhVar.a && this.c == nfhVar.c && java.lang.Float.compare(this.b, nfhVar.b) == 0;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.c) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BatteryStatus(level=");
        sb.append(this.a);
        sb.append(", chargingType=");
        int i = this.c;
        if (i == 1) {
            str = "UNKNOWN";
        } else if (i == 2) {
            str = "NONE";
        } else if (i == 3) {
            str = "WIRELESS";
        } else if (i != 4) {
            str = i != 5 ? "DOCK" : "AC";
        } else {
            str = "USB";
        }
        sb.append((java.lang.Object) str);
        sb.append(", temperature=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
