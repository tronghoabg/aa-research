package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lpf {
    public final defpackage.eqp a;
    public final defpackage.eqp b;

    public lpf(defpackage.eqp eqpVar, defpackage.eqp eqpVar2) {
        this.a = eqpVar;
        this.b = eqpVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lpf) {
            defpackage.lpf lpfVar = (defpackage.lpf) obj;
            if (this.a.equals(lpfVar.a) && this.b.equals(lpfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final java.lang.String toString() {
        defpackage.eqp eqpVar = this.b;
        return "MediaBrowserAndControllerConnectionLiveDataPair{browser=" + this.a.toString() + ", controller=" + eqpVar.toString() + "}";
    }

    public lpf() {
        throw null;
    }
}
