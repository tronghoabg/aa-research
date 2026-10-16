package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mdk extends defpackage.nzc {
    public static final /* synthetic */ int b = 0;
    private static final defpackage.yqm c = defpackage.yqm.c("GH.ParkedNativeApps");
    static final defpackage.yhx a = new defpackage.ynu(defpackage.nzd.b);

    public mdk() {
        super("CNA");
    }

    public static defpackage.mdk a() {
        return (defpackage.mdk) defpackage.mkp.a.b(defpackage.mdk.class, new defpackage.lga(4));
    }

    public static final defpackage.ygw d(defpackage.qsh qshVar) {
        if (defpackage.lzm.a(qshVar)) {
            return e(qshVar, defpackage.nze.a(), defpackage.acqh.d());
        }
        ((defpackage.yqj) c.l().ai((char) 4777)).u("Cannot launch on currently connected car");
        int i = defpackage.ygw.d;
        return defpackage.ymx.a;
    }

    private static final defpackage.ygw e(defpackage.qsh qshVar, defpackage.nze nzeVar, defpackage.absk abskVar) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        defpackage.qqe qqeVar = defpackage.qqe.j;
        defpackage.yhx yhxVar = a;
        defpackage.ygw ygwVarA = defpackage.mkc.b().a(qshVar, new defpackage.nzf(intent, qqeVar, nzeVar.c(yhxVar)));
        defpackage.yqm yqmVar = c;
        ((defpackage.yqj) yqmVar.l().ai((char) 4773)).y("Raw list of native apps found: %s", ygwVarA);
        j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(ygwVarA).filter(new defpackage.lpa(abskVar, 18));
        defpackage.ygw ygwVarA2 = defpackage.mkc.b().a(qshVar, new defpackage.nzf(new android.content.Intent("android.intent.action.MAIN").addCategory("android.intent.category.CAR_LAUNCHER"), qqeVar, nzeVar.c(yhxVar)));
        if (ygwVarA2.isEmpty()) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4776)).u("No opted-in native apps found");
        } else {
            ((defpackage.yqj) yqmVar.l().ai((char) 4775)).y("Raw list of opted-in native apps found: %s", ygwVarA2);
        }
        return (defpackage.ygw) j$.util.stream.Stream.-CC.concat(streamFilter, j$.util.Collection.-EL.stream(ygwVarA2)).distinct().map(new defpackage.lvg(11)).collect(defpackage.yds.a);
    }

    @Override // defpackage.nzc
    public final defpackage.ygw b(defpackage.qsh qshVar, defpackage.nze nzeVar) {
        if (nzeVar.e()) {
            if (!defpackage.lzm.a(qshVar)) {
                ((defpackage.yqj) c.l().ai((char) 4774)).u("Cannot launch on currently connected car");
                int i = defpackage.ygw.d;
                return defpackage.ymx.a;
            }
        } else if (!defpackage.lzm.b(qshVar, false)) {
            int i2 = defpackage.ygw.d;
            return defpackage.ymx.a;
        }
        return e(qshVar, nzeVar, defpackage.acqh.e());
    }

    @Override // defpackage.nzc, defpackage.mnj
    public final void h(java.io.PrintWriter printWriter) {
    }
}
