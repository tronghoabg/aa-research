package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class oyq implements rdb {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ oyq(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final void a(com.google.android.gms.car.display.CarDisplayUiFeatures carDisplayUiFeatures) {
        if (this.b != 0) {
            carDisplayUiFeatures.getClass();
            ((defpackage.ngk) this.a).g(carDisplayUiFeatures, "listener");
            return;
        }
        java.lang.Object obj = this.a;
        boolean zL = defpackage.oyr.l(carDisplayUiFeatures);
        defpackage.oyr oyrVar = (defpackage.oyr) obj;
        if (oyrVar.b == zL) {
            return;
        }
        oyrVar.b = zL;
        android.content.Intent intentH = oyrVar.h();
        android.content.Intent intentG = oyrVar.g();
        intentH.setAction("com.google.android.gms.car.ACTION_UPDATE_TURN_CARD_STATE");
        intentG.setAction("com.google.android.gms.car.ACTION_UPDATE_TURN_CARD_STATE");
        oyrVar.j(intentH, intentG);
    }
}
