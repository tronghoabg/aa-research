package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mlt implements ngs {
    private static final defpackage.mls a = new defpackage.mls(defpackage.acxk.i(), defpackage.acbk.o, defpackage.zbe.USER_EDUCATION_SETTINGS);
    private final defpackage.ngy b;

    public mlt(defpackage.ngy ngyVar) {
        this.b = ngyVar;
    }

    public final /* bridge */ /* synthetic */ ngx a(ngt ngtVar) {
        if (ngtVar != ngu.a || !defpackage.acxk.h()) {
            return null;
        }
        defpackage.mqj mqjVarF = defpackage.mpj.b().f();
        if (mqjVarF != null && mqjVarF.a().equals(defpackage.mkt.s)) {
            return null;
        }
        defpackage.ngy ngyVar = this.b;
        if (ngyVar.m(mlr.a)) {
            return null;
        }
        defpackage.mls mlsVar = a;
        if (ngyVar.j(mlsVar) || ngyVar.a() < ((int) defpackage.acxk.b())) {
            return null;
        }
        return mlsVar;
    }
}
