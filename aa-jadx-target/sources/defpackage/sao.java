package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class sao implements defpackage.rdf {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public sao(defpackage.ror rorVar, int i) {
        this.b = i;
        this.a = rorVar;
    }

    @Override // defpackage.rdf
    public final void a(com.google.android.gms.car.CarUiInfo carUiInfo) {
        int i = this.b;
        java.lang.Object obj = this.a;
        if (i != 0) {
            ((defpackage.ror) obj).w();
            return;
        }
        defpackage.rpm rpmVar = ((defpackage.sau) obj).g;
        if (rpmVar == null) {
            defpackage.rrx.d(5, "CAR.CLIENT.WM.WIN", null, "Received CarUiInfoChanged after presentation is null. CarUiInfo: %s", carUiInfo);
        } else {
            defpackage.sau.r(rpmVar, carUiInfo);
        }
    }

    public /* synthetic */ sao(defpackage.sau sauVar, int i) {
        this.b = i;
        this.a = sauVar;
    }
}
