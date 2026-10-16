package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class xgi extends defpackage.kfp {
    final /* synthetic */ defpackage.xgj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xgi(defpackage.xgj xgjVar) {
        super(null);
        this.a = xgjVar;
    }

    @Override // defpackage.kfp
    public final void a(defpackage.qsh qshVar) {
        ((defpackage.yqj) defpackage.xgj.a.l().ai((char) 10255)).u("Car connected");
        defpackage.sax saxVar = (defpackage.sax) defpackage.kgu.c(new defpackage.kjf(qshVar, 9), "GH.PassengerModeUiContr", defpackage.zbe.LOCK_SCREEN, defpackage.zbd.ju, true, "Could not get car window manager", new java.lang.Object[0]);
        defpackage.xgj xgjVar = this.a;
        xgjVar.d = saxVar;
        defpackage.sax saxVar2 = xgjVar.d;
        if (saxVar2 == null) {
            defpackage.rox.o("GH.PassengerModeUiContr", "could not get reference to CarWindowManager", new java.lang.Object[0]);
        } else {
            xgjVar.b(saxVar2.k());
        }
    }

    @Override // defpackage.kfp
    public final void b() {
        ((defpackage.yqj) defpackage.xgj.a.l().ai((char) 10256)).u("Car disconnected");
        defpackage.xgj xgjVar = this.a;
        xgjVar.d.h(xgjVar.b);
    }

    @Override // defpackage.kfp
    public final void c(defpackage.qsh qshVar) {
        ((defpackage.yqj) defpackage.xgj.a.l().ai((char) 10257)).u("Car service connected");
    }

    @Override // defpackage.kfp
    public final void d(rcp rcpVar) {
        ((defpackage.yqj) defpackage.xgj.a.l().ai((char) 10258)).u("Car service connection failed");
    }

    @Override // defpackage.kfp
    public final void eH() {
        ((defpackage.yqj) defpackage.xgj.a.l().ai((char) 10259)).u("Car service connection suspended");
        defpackage.xgj xgjVar = this.a;
        xgjVar.d.h(xgjVar.b);
    }
}
