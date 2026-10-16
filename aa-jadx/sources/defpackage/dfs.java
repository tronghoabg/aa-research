package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dfs {
    public final defpackage.dfr a = null;
    public final defpackage.dfq b;

    public dfs(defpackage.dfq dfqVar) {
        this.b = dfqVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dfs)) {
            return false;
        }
        defpackage.dfs dfsVar = (defpackage.dfs) obj;
        if (!defpackage.afga.f(this.b, dfsVar.b)) {
            return false;
        }
        defpackage.dfr dfrVar = dfsVar.a;
        return true;
    }

    public final int hashCode() {
        return 38347;
    }

    public final java.lang.String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.b + ")";
    }
}
