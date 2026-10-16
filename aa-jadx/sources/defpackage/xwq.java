package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xwq implements java.io.Serializable {
    private static final long serialVersionUID = -8514239465808977353L;
    public final java.lang.String a;
    public final java.lang.Long b = null;
    private final java.util.List c = new java.util.ArrayList();

    public xwq(java.lang.String str) {
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.xwq)) {
            return false;
        }
        defpackage.xwq xwqVar = (defpackage.xwq) obj;
        if (j$.util.Objects.equals(this.a, xwqVar.a)) {
            java.lang.Long l = xwqVar.b;
            if (j$.util.Objects.equals(null, null) && j$.util.Objects.equals(this.c, xwqVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a, null, this.c);
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.b("tokenValue", this.a);
        xymVarBy.b("expirationTimeMillis", null);
        xymVarBy.b("scopes", this.c);
        return xymVarBy.toString();
    }
}
