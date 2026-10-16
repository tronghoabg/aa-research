package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class isg {
    public final defpackage.zbe a;
    public final defpackage.zbd b;

    public isg(defpackage.zbe zbeVar, defpackage.zbd zbdVar) {
        this.a = zbeVar;
        this.b = zbdVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.isg) {
            defpackage.isg isgVar = (defpackage.isg) obj;
            if (this.a.equals(isgVar.a) && this.b.equals(isgVar.b)) {
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

    public isg() {
        throw null;
    }
}
