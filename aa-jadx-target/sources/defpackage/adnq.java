package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adnq {
    public final defpackage.adot a;
    public final defpackage.adjs b;
    public final defpackage.adno c;

    public adnq(defpackage.adot adotVar, defpackage.adjs adjsVar, defpackage.adno adnoVar) {
        this.a = adotVar;
        adjsVar.getClass();
        this.b = adjsVar;
        this.c = adnoVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.adnq)) {
            return false;
        }
        defpackage.adnq adnqVar = (defpackage.adnq) obj;
        return j$.util.Objects.equals(this.a, adnqVar.a) && j$.util.Objects.equals(this.b, adnqVar.b) && j$.util.Objects.equals(this.c, adnqVar.c);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, this.c});
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.b("addressesOrError", this.a.toString());
        xymVarBy.b("attributes", this.b);
        xymVarBy.b("serviceConfigOrError", this.c);
        return xymVarBy.toString();
    }
}
