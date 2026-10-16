package defpackage;

/* loaded from: classes3.dex */
final class ubl {
    static final ubl a = a(ubm.c, ubm.d, 3);
    public final abfc b;
    public final ufg c;
    public final int d;

    public ubl(abfc abfcVar, ufg ufgVar, int i) {
        abfcVar.getClass();
        this.b = abfcVar;
        ufgVar.getClass();
        this.c = ufgVar;
        this.d = i;
    }

    static ubl a(abfc abfcVar, ufg ufgVar, int i) {
        if (ufgVar == null) {
            ufgVar = ubm.d;
        }
        return new ubl(abfcVar, ufgVar, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ubl) {
            ubl ublVar = (ubl) obj;
            if (this.b.equals(ublVar.b) && this.c.equals(ublVar.c) && this.d == ublVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d ^ ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        ufg ufgVar = this.c;
        return "{" + this.b.toString() + ", " + ufgVar.toString() + ", " + qrv.ae(this.d) + "}";
    }

    public ubl() {
        throw null;
    }
}
