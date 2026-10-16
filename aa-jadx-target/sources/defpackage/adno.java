package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adno {
    public final defpackage.ador a;
    public final java.lang.Object b;

    public adno(defpackage.ador adorVar) {
        this.b = null;
        this.a = adorVar;
        defpackage.ysr.bc(!adorVar.g(), "cannot use OK status: %s", adorVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.adno adnoVar = (defpackage.adno) obj;
            if (j$.util.Objects.equals(this.a, adnoVar.a) && j$.util.Objects.equals(this.b, adnoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b});
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.b;
        if (obj != null) {
            defpackage.xym xymVarBy = defpackage.ysr.by(this);
            xymVarBy.b("config", obj);
            return xymVarBy.toString();
        }
        defpackage.xym xymVarBy2 = defpackage.ysr.by(this);
        xymVarBy2.b("error", this.a);
        return xymVarBy2.toString();
    }

    public adno(java.lang.Object obj) {
        this.b = obj;
        this.a = null;
    }
}
