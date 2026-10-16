package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adly {
    public final java.util.List a;
    public final defpackage.adjs b;
    public final java.lang.Object[][] c;

    public adly(java.util.List list, defpackage.adjs adjsVar, java.lang.Object[][] objArr) {
        list.getClass();
        this.a = list;
        adjsVar.getClass();
        this.b = adjsVar;
        objArr.getClass();
        this.c = objArr;
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.b("addrs", this.a);
        xymVarBy.b("attrs", this.b);
        xymVarBy.b("customOptions", java.util.Arrays.deepToString(this.c));
        return xymVarBy.toString();
    }
}
