package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xzl implements java.io.Serializable, defpackage.xzi {
    private static final long serialVersionUID = 0;
    public final java.lang.Object a;

    public xzl(java.lang.Object obj) {
        this.a = obj;
    }

    @Override // defpackage.xzi
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.xzl) {
            return j$.util.Objects.equals(this.a, ((defpackage.xzl) obj).a);
        }
        return false;
    }

    @Override // defpackage.xzi
    public final java.lang.Object fF() {
        return this.a;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a);
    }

    public final java.lang.String toString() {
        return "Suppliers.ofInstance(" + java.lang.String.valueOf(this.a) + ")";
    }
}
