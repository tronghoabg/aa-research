package defpackage;

/* loaded from: classes3.dex */
public final class vcw {
    public final zpg a;
    private final zpi b;

    public vcw(zpg zpgVar, zpi zpiVar) {
        if (zpgVar == null) {
            throw new NullPointerException("Null signedOutState");
        }
        this.a = zpgVar;
        if (zpiVar == null) {
            throw new NullPointerException("Null signedOutStateResponse");
        }
        this.b = zpiVar;
    }

    public static vcw a(zpi zpiVar) {
        zpg zpgVar;
        zpf zpfVar = zpiVar.c;
        if (zpfVar == null) {
            zpfVar = zpf.a;
        }
        if (zpfVar.b.B()) {
            zpgVar = zpg.a;
        } else {
            try {
                zpgVar = (zpg) abnv.y(zpg.a, zpfVar.b, abnj.a);
            } catch (abon unused) {
                zpgVar = zpg.a;
            }
        }
        return new vcw(zpgVar, zpiVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vcw) {
            vcw vcwVar = (vcw) obj;
            if (this.a.equals(vcwVar.a) && this.b.equals(vcwVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        zpi zpiVar = this.b;
        return "SignedOutStateHandler{signedOutState=" + this.a.toString() + ", signedOutStateResponse=" + zpiVar.toString() + "}";
    }

    public vcw() {
        throw null;
    }
}
