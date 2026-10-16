package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class admf {
    public final java.util.List a;
    public final defpackage.adjs b;
    public final java.lang.Object c;

    public admf(java.util.List list, defpackage.adjs adjsVar, java.lang.Object obj) {
        list.getClass();
        this.a = j$.util.DesugarCollections.unmodifiableList(new java.util.ArrayList(list));
        adjsVar.getClass();
        this.b = adjsVar;
        this.c = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.admf)) {
            return false;
        }
        defpackage.admf admfVar = (defpackage.admf) obj;
        return j$.util.Objects.equals(this.a, admfVar.a) && j$.util.Objects.equals(this.b, admfVar.b) && j$.util.Objects.equals(this.c, admfVar.c);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, this.c});
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.b("addresses", this.a);
        xymVarBy.b("loadBalancingPolicyConfig", this.c);
        xymVarBy.b("attributes", this.b);
        return xymVarBy.toString();
    }
}
