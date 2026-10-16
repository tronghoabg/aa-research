package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lsp {
    public final android.content.ComponentName a;
    public final j$.util.Optional b;

    public lsp(android.content.ComponentName componentName, j$.util.Optional optional) {
        if (componentName == null) {
            throw new java.lang.NullPointerException("Null appName");
        }
        this.a = componentName;
        this.b = optional;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lsp) {
            defpackage.lsp lspVar = (defpackage.lsp) obj;
            if (this.a.equals(lspVar.a) && this.b.equals(lspVar.b)) {
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
        j$.util.Optional optional = this.b;
        return "AppNameWithValue{appName=" + this.a.toString() + ", value=" + optional.toString() + "}";
    }

    public lsp() {
        throw null;
    }
}
