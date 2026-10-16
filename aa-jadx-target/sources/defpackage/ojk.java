package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ojk {
    public final int a;
    public final boolean b;
    public final java.util.Set c;

    public ojk(int i, boolean z, java.util.Set set) {
        set.getClass();
        this.a = i;
        this.b = z;
        this.c = set;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ojk)) {
            return false;
        }
        defpackage.ojk ojkVar = (defpackage.ojk) obj;
        return this.a == ojkVar.a && this.b == ojkVar.b && defpackage.afga.f(this.c, ojkVar.c);
    }

    public final int hashCode() {
        return (((this.a * 31) + defpackage.a.e(this.b)) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "ThermalState(thermalStatus=" + this.a + ", batteryTemperatureAboveSevereThreshold=" + this.b + ", potentialCauses=" + this.c + ")";
    }
}
