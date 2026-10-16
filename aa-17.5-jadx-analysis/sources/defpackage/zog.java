package defpackage;

/* loaded from: classes3.dex */
public final class zog {
    public final znx a;
    public final boolean b;
    public final boolean c;

    public zog(znx znxVar, boolean z, boolean z2) {
        this.a = znxVar;
        this.b = z;
        this.c = z2;
    }

    public static zof a() {
        zof zofVar = new zof();
        zofVar.a = null;
        zofVar.b(false);
        zofVar.b = true;
        zofVar.c = (byte) (zofVar.c | 2);
        return zofVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zog) {
            zog zogVar = (zog) obj;
            znx znxVar = this.a;
            if (znxVar != null ? znxVar.equals(zogVar.a) : zogVar.a == null) {
                if (this.b == zogVar.b && this.c == zogVar.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        znx znxVar = this.a;
        int iHashCode = znxVar == null ? 0 : znxVar.hashCode();
        return ((((iHashCode ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        return "ParsingOptions{defaultRegion=" + String.valueOf(this.a) + ", keepRawInput=" + this.b + ", stripNationalPrefixAfterCountryCode=" + this.c + "}";
    }

    public zog() {
        throw null;
    }
}
