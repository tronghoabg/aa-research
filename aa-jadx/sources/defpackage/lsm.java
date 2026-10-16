package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lsm implements defpackage.mnr {
    public final /* synthetic */ defpackage.lhm a;
    private final /* synthetic */ int b;

    public /* synthetic */ lsm(defpackage.lhm lhmVar, int i) {
        this.b = i;
        this.a = lhmVar;
    }

    @Override // defpackage.mnr
    public final void a(java.io.PrintWriter printWriter) {
        int i = this.b;
        defpackage.lhm lhmVar = this.a;
        if (i != 0) {
            ((defpackage.lqz) lhmVar).e(printWriter);
        } else {
            ((defpackage.lsq) lhmVar).a(printWriter);
        }
    }
}
