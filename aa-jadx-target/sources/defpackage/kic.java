package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kic extends defpackage.khs {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.CPCalendarStoreMgr");
    private defpackage.gmz b;

    public static defpackage.khs f() {
        return android.os.Build.VERSION.SDK_INT >= 30 ? (defpackage.khs) defpackage.mkp.a.i(defpackage.kic.class) : defpackage.khs.e();
    }

    public static final defpackage.eqp g(defpackage.eqp eqpVar) {
        defpackage.eqr eqrVar = new defpackage.eqr();
        eqrVar.r(eqpVar, new defpackage.hlm(eqrVar, 18));
        return eqrVar;
    }

    @Override // defpackage.khs
    public final defpackage.eqp a(defpackage.eqp eqpVar) {
        return android.os.Build.VERSION.SDK_INT < 30 ? super.a(eqpVar) : defpackage.ebo.g(eqpVar, new defpackage.kgo(this, 8));
    }

    @Override // defpackage.khs
    public final defpackage.eqp b(defpackage.eqp eqpVar) {
        return android.os.Build.VERSION.SDK_INT < 30 ? super.b(eqpVar) : defpackage.ebo.g(eqpVar, new defpackage.kgo(this, 9));
    }

    @Override // defpackage.khs
    public final defpackage.eqp c(defpackage.eqp eqpVar, defpackage.eqp eqpVar2) {
        return android.os.Build.VERSION.SDK_INT < 30 ? super.c(eqpVar, eqpVar2) : defpackage.ebo.g(defpackage.tcu.z(eqpVar, eqpVar2), new defpackage.kgo(this, 7));
    }

    public final defpackage.gmz h() {
        defpackage.gmz gmzVar = this.b;
        if (gmzVar != null) {
            return gmzVar;
        }
        defpackage.gmz gmzVar2 = new defpackage.gmz(defpackage.kwu.b().d, (byte[]) null);
        this.b = gmzVar2;
        return gmzVar2;
    }
}
