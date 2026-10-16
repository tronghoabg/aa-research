package defpackage;

import j$.util.Optional;

/* loaded from: classes2.dex */
public final class lni {
    public final lok a;
    public final Optional b;
    public final Optional c;

    public lni(lok lokVar, Optional optional, Optional optional2) {
        this.a = lokVar;
        this.b = optional;
        this.c = optional2;
    }

    static lni a(lok lokVar) {
        woy.O(lokVar != lok.b, "createNonConnected must take non-CONNECTED status");
        return new lni(lokVar, Optional.empty(), Optional.empty());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lni) {
            lni lniVar = (lni) obj;
            if (this.a.equals(lniVar.a) && this.b.equals(lniVar.b) && this.c.equals(lniVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        return this.c.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        Optional optional = this.c;
        Optional optional2 = this.b;
        return "AaMediaBrowserAndControllerConnection{connectionStatus=" + this.a.toString() + ", browser=" + optional2.toString() + ", controller=" + optional.toString() + "}";
    }

    public lni() {
        throw null;
    }
}
