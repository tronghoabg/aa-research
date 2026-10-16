package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ink implements java.lang.Runnable {
    public int a;
    public final defpackage.xzg b;
    final /* synthetic */ defpackage.inl c;

    public ink(defpackage.inl inlVar, int i) {
        defpackage.xzo xzoVar = defpackage.xxd.a;
        this.c = inlVar;
        this.a = i;
        this.b = new defpackage.xzg(xzoVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.inl inlVar = this.c;
        defpackage.inn innVar = (defpackage.inn) inlVar.v();
        if (innVar == null) {
            return;
        }
        java.lang.String strB = inlVar.b(this.a);
        ((defpackage.yqj) ((defpackage.yqj) defpackage.inn.a.f()).ai((char) 597)).y("Client ANR due to command time out %s.", new defpackage.zkf(defpackage.zke.a, strB));
        inlVar.l(this.a, false);
        inj injVar = inlVar.a;
        if (injVar != null) {
            injVar.b(this.a, false);
        }
        defpackage.xzg xzgVar = this.b;
        if (xzgVar.a) {
            innVar.K(strB, xzgVar.c());
        } else {
            innVar.K(strB, null);
        }
    }
}
