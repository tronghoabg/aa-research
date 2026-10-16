package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zpi {
    public final defpackage.zoz a;
    public final boolean b;
    public final boolean c;

    public zpi(defpackage.zoz zozVar, boolean z, boolean z2) {
        this.a = zozVar;
        this.b = z;
        this.c = z2;
    }

    public static defpackage.zph a() {
        defpackage.zph zphVar = new defpackage.zph();
        zphVar.a = null;
        zphVar.b(false);
        zphVar.b = true;
        zphVar.c = (byte) (zphVar.c | 2);
        return zphVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.zpi) {
            defpackage.zpi zpiVar = (defpackage.zpi) obj;
            defpackage.zoz zozVar = this.a;
            if (zozVar != null ? zozVar.equals(zpiVar.a) : zpiVar.a == null) {
                if (this.b == zpiVar.b && this.c == zpiVar.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.zoz zozVar = this.a;
        int iHashCode = zozVar == null ? 0 : zozVar.hashCode();
        return ((((iHashCode ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        return "ParsingOptions{defaultRegion=" + java.lang.String.valueOf(this.a) + ", keepRawInput=" + this.b + ", stripNationalPrefixAfterCountryCode=" + this.c + "}";
    }

    public zpi() {
        throw null;
    }
}
