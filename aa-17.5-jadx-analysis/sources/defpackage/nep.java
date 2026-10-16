package defpackage;

/* loaded from: classes.dex */
public final class nep {
    public final int a;
    public final float b;
    public final int c;

    public nep(int i, int i2, float f) {
        this.a = i;
        this.c = i2;
        this.b = f;
    }

    public final boolean a() {
        int i = this.c;
        return (i == 2 || i == 1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nep)) {
            return false;
        }
        nep nepVar = (nep) obj;
        return this.a == nepVar.a && this.c == nepVar.c && Float.compare(this.b, nepVar.b) == 0;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.c) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BatteryStatus(level=");
        sb.append(this.a);
        sb.append(", chargingType=");
        int i = this.c;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "DOCK" : "AC" : "USB" : "WIRELESS" : "NONE" : "UNKNOWN"));
        sb.append(", temperature=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
