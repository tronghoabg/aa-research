package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xyr implements java.io.Serializable, defpackage.xyp {
    private static final long serialVersionUID = 0;
    final defpackage.xyp a;

    public xyr(defpackage.xyp xypVar) {
        this.a = xypVar;
    }

    @Override // defpackage.xyp
    public final boolean a(java.lang.Object obj) {
        return !this.a.a(obj);
    }

    @Override // defpackage.xyp
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.xyr) {
            return this.a.equals(((defpackage.xyr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return ~this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Predicates.not(" + this.a.toString() + ")";
    }
}
