package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ofk extends defpackage.kfp {
    final /* synthetic */ defpackage.ofl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofk(defpackage.ofl oflVar) {
        super(null);
        this.a = oflVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, qwn] */
    @Override // defpackage.kfp
    public final void a(defpackage.qsh qshVar) throws rlo {
        java.lang.String strG;
        java.lang.String str = null;
        try {
            defpackage.mkp.a.g();
            defpackage.rov rovVarJ = defpackage.oml.j(qshVar);
            if (defpackage.omv.c("CAR.BT", 3)) {
                defpackage.rrx.a("CAR.BT", null, "getCarBluetoothAddress");
            }
            try {
                strG = rovVarJ.a.g();
            } catch (android.os.RemoteException | java.lang.IllegalStateException e) {
                rovVarJ.a(e);
                strG = null;
            }
            ((defpackage.yqj) ((defpackage.yqj) defpackage.ofl.a.f()).ai(5658)).y("car bluetooth address: %s", strG);
            str = strG;
        } catch (defpackage.qst | defpackage.qsu e2) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.ofl.a.h()).p(e2)).ai((char) 5659)).u("Error getting car bluetooth address");
        }
        defpackage.ofl oflVar = this.a;
        oflVar.i = str;
        defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CALL, oflVar.i != null ? defpackage.zbd.Eb : defpackage.zbd.Ec).l());
    }
}
