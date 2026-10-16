package defpackage;

/* loaded from: classes.dex */
public final class rpu {
    public final xxh a;
    public final xxh b;
    public final xxh c;
    public final xxh d;

    public rpu(xxh xxhVar, xxh xxhVar2, xxh xxhVar3, xxh xxhVar4) {
        this.a = xxhVar;
        this.b = xxhVar2;
        this.c = xxhVar3;
        this.d = xxhVar4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rpu) {
            rpu rpuVar = (rpu) obj;
            if (this.a.equals(rpuVar.a) && this.b.equals(rpuVar.b) && this.c.equals(rpuVar.c) && this.d.equals(rpuVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        return this.d.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        xxh xxhVar = this.d;
        xxh xxhVar2 = this.c;
        xxh xxhVar3 = this.b;
        return "CarSensorInfo{speedMillimetersPerSec=" + String.valueOf(this.a) + ", nightMode=" + String.valueOf(xxhVar3) + ", drivingStatus=" + String.valueOf(xxhVar2) + ", gearData=" + String.valueOf(xxhVar) + "}";
    }

    public rpu() {
        throw null;
    }
}
