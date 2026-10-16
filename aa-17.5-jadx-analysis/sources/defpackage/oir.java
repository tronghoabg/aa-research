package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class oir {
    public final int a;
    public final boolean b;
    public final Set c;

    public oir(int i, boolean z, Set set) {
        set.getClass();
        this.a = i;
        this.b = z;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oir)) {
            return false;
        }
        oir oirVar = (oir) obj;
        return this.a == oirVar.a && this.b == oirVar.b && affa.f(this.c, oirVar.c);
    }

    public final int hashCode() {
        return (((this.a * 31) + a.f(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ThermalState(thermalStatus=" + this.a + ", batteryTemperatureAboveSevereThreshold=" + this.b + ", potentialCauses=" + this.c + ")";
    }
}
