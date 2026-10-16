package defpackage;

/* loaded from: classes2.dex */
public final class lox {
    public final eqj a;
    public final eqj b;

    public lox(eqj eqjVar, eqj eqjVar2) {
        this.a = eqjVar;
        this.b = eqjVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lox) {
            lox loxVar = (lox) obj;
            if (this.a.equals(loxVar.a) && this.b.equals(loxVar.b)) {
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
        eqj eqjVar = this.b;
        return "MediaBrowserAndControllerConnectionLiveDataPair{browser=" + this.a.toString() + ", controller=" + eqjVar.toString() + "}";
    }

    public lox() {
        throw null;
    }
}
