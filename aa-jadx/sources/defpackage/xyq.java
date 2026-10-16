package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xyq implements java.io.Serializable, defpackage.xyp {
    private static final long serialVersionUID = 0;
    private final java.lang.Object a;

    public xyq(java.lang.Object obj) {
        this.a = obj;
    }

    @Override // defpackage.xyp
    public final boolean a(java.lang.Object obj) {
        return this.a.equals(obj);
    }

    @Override // defpackage.xyp
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.xyq) {
            return this.a.equals(((defpackage.xyq) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Predicates.equalTo(" + this.a.toString() + ")";
    }
}
