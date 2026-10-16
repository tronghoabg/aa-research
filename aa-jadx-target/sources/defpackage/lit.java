package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lit implements defpackage.liz {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public lit(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.liz
    public final void a(defpackage.liy liyVar) {
        int i = this.b;
        if (i == 0) {
            defpackage.yqj yqjVar = (defpackage.yqj) defpackage.liu.a.l().ai(3971);
            java.lang.Object obj = this.a;
            yqjVar.M("Location manager parking state changed from %s to %s", ((defpackage.liu) obj).h, liyVar);
            defpackage.tna.i(new defpackage.kzz(obj, liyVar, 7, null));
            return;
        }
        if (i == 1) {
            ((kbq) this.a).g(kbq.h(liyVar));
            return;
        }
        defpackage.liy liyVar2 = defpackage.liy.a;
        java.lang.Object obj2 = this.a;
        if (liyVar == liyVar2) {
            ((xds) obj2).g(false);
        } else {
            ((xds) obj2).h();
        }
    }

    @Override // defpackage.liz
    public final void b(java.lang.Float f) {
    }
}
