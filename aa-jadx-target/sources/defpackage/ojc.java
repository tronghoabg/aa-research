package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ojc extends defpackage.kfp {
    final /* synthetic */ defpackage.ojd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojc(defpackage.ojd ojdVar) {
        super(null);
        this.a = ojdVar;
    }

    @Override // defpackage.kfp
    public final void a(defpackage.qsh qshVar) {
        qshVar.getClass();
        defpackage.ojd.h.l().y("onCarConnected, carClientToken is %s", qshVar);
        if (defpackage.leo.a.a().f()) {
            defpackage.khg.u(new defpackage.wde("GH.CarThemeVersionLD", defpackage.zbe.CAR_THEME, defpackage.zbd.MP, "Car no longer connected", new java.lang.Object[0]), new defpackage.nma(qshVar, this.a, 17, null));
        }
    }
}
