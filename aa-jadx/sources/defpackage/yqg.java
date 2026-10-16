package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yqg implements defpackage.ypq {
    private final defpackage.ypq a;
    private final java.lang.Object b;

    public yqg(defpackage.ypq ypqVar, java.lang.Object obj) {
        ypqVar.getClass();
        this.a = ypqVar;
        obj.getClass();
        this.b = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.yqg)) {
            return false;
        }
        defpackage.yqg yqgVar = (defpackage.yqg) obj;
        return this.a.equals(yqgVar.a) && this.b.equals(yqgVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.b;
        return "SpecializedLogSiteKey{ delegate='" + this.a.toString() + "', qualifier='" + obj.toString() + "' }";
    }
}
