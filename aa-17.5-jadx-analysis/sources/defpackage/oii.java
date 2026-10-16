package defpackage;

/* loaded from: classes.dex */
public final class oii extends kfn {
    final /* synthetic */ oij a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oii(oij oijVar) {
        super(null);
        this.a = oijVar;
    }

    @Override // defpackage.kfn
    public final void a(qrn qrnVar) {
        qrnVar.getClass();
        oij.h.l().y("onCarConnected, carClientToken is %s", qrnVar);
        if (lej.a.a().f()) {
            khc.t(new wci("GH.CarThemeVersionLD", yzz.CAR_THEME, yzy.ML, "Car no longer connected", new Object[0]), new nlh(qrnVar, this.a, 16, null));
        }
    }
}
