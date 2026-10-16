package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class kiu extends defpackage.kfp {
    final /* synthetic */ defpackage.kiv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kiu(defpackage.kiv kivVar) {
        super(null);
        this.a = kivVar;
    }

    @Override // defpackage.kfp
    public final void a(defpackage.qsh qshVar) {
        defpackage.yqm yqmVar = defpackage.kiv.a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3154)).u("onCarConnected");
        try {
            defpackage.mkp.a.f();
            com.google.android.gms.car.CarInfo carInfoD = defpackage.ooa.d(qshVar);
            if (carInfoD == null) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(3156)).u("No car info available.");
                carInfoD = defpackage.kiv.b;
            }
            this.a.c.set(carInfoD);
        } catch (java.lang.IllegalStateException | defpackage.qst unused) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.kiv.a.h()).ai((char) 3155)).u("Failed to get car info.");
        }
    }
}
