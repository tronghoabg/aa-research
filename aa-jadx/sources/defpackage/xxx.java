package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xxx extends defpackage.xxy implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final defpackage.xxy a;

    public xxx(defpackage.xxy xxyVar) {
        this.a = xxyVar;
    }

    @Override // defpackage.xxy
    public final java.lang.Object b(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        defpackage.abnv abnvVarV = defpackage.abnv.v((byte[]) obj);
        abnvVarV.getClass();
        return abnvVarV;
    }

    @Override // defpackage.xxy
    protected final java.lang.Object c(java.lang.Object obj) {
        throw new java.lang.AssertionError();
    }

    @Override // defpackage.xyd
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.xxx) {
            return this.a.equals(((defpackage.xxx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return ~this.a.hashCode();
    }

    public final java.lang.String toString() {
        return this.a.toString().concat(".reverse()");
    }
}
