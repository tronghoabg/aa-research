package defpackage;

/* loaded from: classes.dex */
final class xfi extends kfn {
    final /* synthetic */ xfj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfi(xfj xfjVar) {
        super(null);
        this.a = xfjVar;
    }

    @Override // defpackage.kfn
    public final void a(qrn qrnVar) {
        ((ype) xfj.a.l().ai((char) 10227)).u("Car connected");
        sab sabVar = (sab) kgq.c(new kiz(qrnVar, 9), "GH.PassengerModeUiContr", yzz.LOCK_SCREEN, yzy.ju, true, "Could not get car window manager", new Object[0]);
        xfj xfjVar = this.a;
        xfjVar.d = sabVar;
        sab sabVar2 = xfjVar.d;
        if (sabVar2 == null) {
            tss.q("GH.PassengerModeUiContr", "could not get reference to CarWindowManager", new Object[0]);
        } else {
            xfjVar.b(sabVar2.k());
        }
    }

    @Override // defpackage.kfn
    public final void b() {
        ((ype) xfj.a.l().ai((char) 10228)).u("Car disconnected");
        xfj xfjVar = this.a;
        xfjVar.d.h(xfjVar.b);
    }

    @Override // defpackage.kfn
    public final void c(qrn qrnVar) {
        ((ype) xfj.a.l().ai((char) 10229)).u("Car service connected");
    }

    @Override // defpackage.kfn
    public final void d(rbu rbuVar) {
        ((ype) xfj.a.l().ai((char) 10230)).u("Car service connection failed");
    }

    @Override // defpackage.kfn
    public final void fz() {
        ((ype) xfj.a.l().ai((char) 10231)).u("Car service connection suspended");
        xfj xfjVar = this.a;
        xfjVar.d.h(xfjVar.b);
    }
}
