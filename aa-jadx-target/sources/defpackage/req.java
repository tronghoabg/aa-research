package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class req implements defpackage.saa {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ req(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.saa
    public final void a() throws android.os.RemoteException {
        int i = this.c;
        if (i == 0) {
            ((defpackage.lam) ((defpackage.ret) this.a).c).E(new defpackage.rer(this.b, 7));
            return;
        }
        int i2 = 0;
        int i3 = 1;
        if (i != 1) {
            int i4 = 2;
            if (i != 2) {
                ((defpackage.lam) ((defpackage.ret) this.a).a).E(new defpackage.rer(this.b, i4));
                return;
            } else {
                ((defpackage.lam) ((defpackage.ret) this.a).b).E(new defpackage.rer(this.b, i2));
                return;
            }
        }
        defpackage.ref refVar = (defpackage.ref) this.a;
        defpackage.ysr.bk(refVar.p(defpackage.rbf.x), "This API can only be used if multi-region is enabled");
        if (defpackage.omv.c("CAR.CLIENT", 3)) {
            boolean z = defpackage.rrx.a;
            defpackage.rrx.d(3, "CAR.CLIENT", null, "Multi-region client enabled. RegisterCarDisplayLayoutUpdateCompleteListener", new java.lang.Object[0]);
        }
        refVar.k.E(new defpackage.rer(this.b, i3));
    }
}
