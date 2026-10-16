package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ngl extends defpackage.lhm {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.UserInterruptMgr");
    public static final j$.time.Duration b = j$.time.Duration.ofSeconds(10);
    public static final j$.time.Duration c = j$.time.Duration.ofSeconds(5);
    public static final j$.time.Duration d = j$.time.Duration.ofSeconds(35);
    public static final j$.time.Duration e = j$.time.Duration.ofSeconds(8);
    public long f = -1;
    public long g = -1;
    public int h = -1;
    public int i = 0;
    public final defpackage.eqs k = new defpackage.eqs(java.lang.Boolean.TRUE);
    public final android.os.Handler l = new android.os.Handler((android.os.Handler.Callback) new gmf(this, 8));

    public static defpackage.ngl a() {
        return (defpackage.ngl) defpackage.mkp.a.i(defpackage.ngl.class);
    }

    @Override // defpackage.lhm, defpackage.lhn
    public final void d() {
        super.d();
        ((defpackage.yqj) a.l().ai((char) 5262)).u("stop");
        ((defpackage.eqp) defpackage.ntl.a().a).l(this);
        this.l.removeMessages(1);
    }

    @Override // defpackage.lhm, defpackage.lhn
    public final void eQ() {
        super.eQ();
        ((defpackage.yqj) a.l().ai((char) 5261)).u("start");
        ((defpackage.eqp) defpackage.ntl.a().a).eM(this, new defpackage.mmz(this, 8));
    }
}
