package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tnj {
    public final android.content.Context a;
    public final defpackage.xyn b;
    private final defpackage.xyn c;
    private final defpackage.xyn d;

    public tnj(android.content.Context context, defpackage.xyn xynVar, defpackage.xyn xynVar2, defpackage.xyn xynVar3) {
        this.a = context;
        this.c = xynVar;
        this.d = xynVar2;
        this.b = xynVar3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.tnj) {
            defpackage.tnj tnjVar = (defpackage.tnj) obj;
            if (this.a.equals(tnjVar.a) && this.c.equals(tnjVar.c) && this.d.equals(tnjVar.d) && this.b.equals(tnjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.d.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003)) * 1000003) ^ 1237) * 1000003) ^ 2040732332;
    }

    public final java.lang.String toString() {
        defpackage.xyn xynVar = this.b;
        defpackage.xyn xynVar2 = this.d;
        defpackage.xyn xynVar3 = this.c;
        return "CollectionBasisContext{context=" + java.lang.String.valueOf(this.a) + ", accountNames=" + java.lang.String.valueOf(xynVar3) + ", stacktrace=" + java.lang.String.valueOf(xynVar2) + ", googlerOverridesCheckbox=false, executor=" + java.lang.String.valueOf(xynVar) + "}";
    }

    public tnj() {
        throw null;
    }
}
