package defpackage;

/* loaded from: classes2.dex */
public final class qii {
    public yzy a;
    public yyv b;
    public final String c;
    public final boolean d;

    public qii(abrp abrpVar) {
        yzy yzyVarB;
        yyv yyvVarB;
        int i = abrpVar.b;
        int iAd = wox.ad(i);
        if (iAd == 0) {
            throw null;
        }
        int i2 = iAd - 1;
        if (i2 == 0) {
            if (i == 1) {
                yzyVarB = yzy.b(((Integer) abrpVar.c).intValue());
                if (yzyVarB == null) {
                    yzyVarB = yzy.sm;
                }
            } else {
                yzyVarB = yzy.a;
            }
            this.a = yzyVarB;
        } else if (i2 != 1) {
            ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.HATS_SURVEY, yzy.hs).l());
        } else {
            if (i != 2 || (yyvVarB = yyv.b(((Integer) abrpVar.c).intValue())) == null) {
                yyvVarB = yyv.UNKNOWN_ACTION;
            }
            this.b = yyvVarB;
        }
        this.c = abrpVar.d;
        this.d = abrpVar.e;
    }

    public final String toString() {
        xxg xxgVarAn = woy.an(qii.class);
        xxgVarAn.b("uiAction", this.a);
        xxgVarAn.b("nonUiAction", this.b);
        xxgVarAn.b("triggerId", this.c);
        xxgVarAn.c();
        return xxgVarAn.toString();
    }
}
