package defpackage;

/* loaded from: classes.dex */
public final class mlo implements nfz {
    private static final mln a = new mln(acwi.i(), acai.o, yzz.USER_EDUCATION_SETTINGS);
    private final ngf b;

    public mlo(ngf ngfVar) {
        this.b = ngfVar;
    }

    @Override // defpackage.nfz
    public final /* bridge */ /* synthetic */ nge a(nga ngaVar) {
        if (ngaVar != ngb.a || !acwi.h()) {
            return null;
        }
        mqc mqcVarF = mpd.b().f();
        if (mqcVarF != null && mqcVarF.a().equals(mkn.s)) {
            return null;
        }
        ngf ngfVar = this.b;
        if (ngfVar.m(mlm.a)) {
            return null;
        }
        mln mlnVar = a;
        if (ngfVar.j(mlnVar) || ngfVar.a() < ((int) acwi.b())) {
            return null;
        }
        return mlnVar;
    }
}
