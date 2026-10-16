package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nfq extends defpackage.eqp {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.EtcStatusLiveData");
    public final defpackage.qsh h;
    public final defpackage.qsy i = new defpackage.lji(this, 4);
    public defpackage.rpe j;

    public nfq(defpackage.qsh qshVar) {
        this.h = qshVar;
    }

    @Override // defpackage.eqp
    protected final void c() {
        defpackage.khg.v(new defpackage.wde("GH.EtcStatusLiveData", defpackage.zbe.ETC_STATUS, defpackage.zbd.ps, "Could not listen to toll card status updates", new java.lang.Object[0]), new defpackage.nas(this, 11));
    }

    @Override // defpackage.eqp
    protected final void d() {
        defpackage.rpe rpeVar = this.j;
        if (rpeVar != null) {
            rpeVar.b(this.i);
            this.j = null;
        }
    }
}
