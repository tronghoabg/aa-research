package defpackage;

/* loaded from: classes3.dex */
final class ubj {
    public final ufg a;
    public final abal b;
    public final int c;
    public final int d;

    public ubj(ufg ufgVar, abal abalVar, int i, int i2) {
        this.a = ufgVar;
        abalVar.getClass();
        this.b = abalVar;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ubj) {
            ubj ubjVar = (ubj) obj;
            if (this.a.equals(ubjVar.a) && this.b.equals(ubjVar.b) && this.c == ubjVar.c && this.d == ubjVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        abal abalVar = this.b;
        return "{" + this.a.toString() + ", " + abalVar.toString() + ", " + this.c + ", " + qrv.ae(this.d) + "}";
    }

    public ubj() {
        throw null;
    }
}
