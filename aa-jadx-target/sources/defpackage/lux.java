package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lux extends defpackage.luw {
    public static final /* synthetic */ int b = 0;
    private static final defpackage.yhx c = new defpackage.ynu(defpackage.nzd.b);

    @Override // defpackage.luw
    public final defpackage.ygm a(defpackage.qsh qshVar, defpackage.nze nzeVar) {
        j$.util.stream.Stream map = j$.util.Collection.-EL.stream(defpackage.mkc.b().c(qshVar, new defpackage.nzf(new android.content.Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER"), defpackage.qqe.i, nzeVar.c(c)))).filter(new defpackage.kqi(20)).map(new defpackage.lvg(1));
        int i = defpackage.ygw.d;
        return (defpackage.ygm) map.collect(defpackage.yds.a);
    }
}
