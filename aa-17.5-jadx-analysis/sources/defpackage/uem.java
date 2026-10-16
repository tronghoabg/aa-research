package defpackage;

/* loaded from: classes3.dex */
public final class uem {
    public final trn a;
    private final abiv b;

    public uem(trn trnVar, abiv abivVar) {
        this.a = trnVar;
        abivVar.getClass();
        this.b = abivVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uem) {
            uem uemVar = (uem) obj;
            if (this.a.equals(uemVar.a) && this.b.equals(uemVar.b)) {
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
        abiv abivVar = this.b;
        return "{" + this.a.toString() + ", " + abivVar.toString() + "}";
    }

    public uem() {
        throw null;
    }
}
