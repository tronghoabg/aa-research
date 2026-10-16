package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rga {
    public final defpackage.zbe a;
    public final defpackage.zbd b;

    public rga(defpackage.zbe zbeVar, defpackage.zbd zbdVar) {
        this.a = zbeVar;
        this.b = zbdVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.rga) {
            defpackage.rga rgaVar = (defpackage.rga) obj;
            if (this.a.equals(rgaVar.a) && this.b.equals(rgaVar.b)) {
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
        defpackage.zbd zbdVar = this.b;
        return "EventBatch{context=" + this.a.toString() + ", action=" + zbdVar.toString() + "}";
    }

    public rga() {
        throw null;
    }
}
