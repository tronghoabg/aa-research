package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uef implements defpackage.ufv {
    public final /* synthetic */ boolean a;

    public /* synthetic */ uef(boolean z) {
        this.a = z;
    }

    @Override // defpackage.ufv
    public final defpackage.ufu a(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.ypg ypgVar = defpackage.uen.a;
        if (this.a) {
            return defpackage.ufu.IGNORE;
        }
        defpackage.rkc rkcVar = (defpackage.rkc) obj;
        defpackage.rkc rkcVar2 = (defpackage.rkc) obj2;
        return rkcVar.a.equals(rkcVar2.a) ? defpackage.ufu.IGNORE : defpackage.uen.j(rkcVar, rkcVar2);
    }
}
