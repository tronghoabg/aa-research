package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adko {
    private final java.lang.String a;

    public adko(java.lang.String str) {
        defpackage.adkr adkrVar = defpackage.adkr.d;
        this.a = str;
    }

    public final java.lang.Object a(defpackage.adkr adkrVar) {
        defpackage.adoc adocVar = adkrVar.f;
        java.lang.Object objD = adocVar == null ? null : adocVar.d(this, hashCode(), 0);
        if (objD == null) {
            return null;
        }
        return objD;
    }

    public final java.lang.String toString() {
        return this.a;
    }
}
