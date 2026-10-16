package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ajg implements defpackage.affc {
    private final /* synthetic */ int a;

    public /* synthetic */ ajg(int i) {
        this.a = i;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        boolean z = false;
        switch (this.a) {
            case 0:
                ((defpackage.cxn) obj).q();
                return defpackage.afbk.a;
            case 1:
                return java.lang.Float.valueOf(((defpackage.ael) obj).a);
            case 2:
                return defpackage.afbk.a;
            case 3:
                ((java.lang.Long) obj).longValue();
                return defpackage.afbk.a;
            case 4:
                defpackage.cdd cddVar = (defpackage.cdd) obj;
                defpackage.bvm bvmVar = defpackage.alc.a;
                int i = defpackage.ajb.a;
                android.content.Context context = (android.content.Context) defpackage.dai.az(cddVar, defpackage.daj.b);
                defpackage.dlo dloVar = (defpackage.dlo) defpackage.dai.az(cddVar, defpackage.dbl.d);
                defpackage.ala alaVar = (defpackage.ala) defpackage.dai.az(cddVar, defpackage.alb.a);
                if (alaVar == null) {
                    return null;
                }
                return new defpackage.aja(context, dloVar, alaVar.a);
            case 5:
                defpackage.dbb.i((defpackage.dek) obj, defpackage.ddv.a);
                return defpackage.afbk.a;
            case 6:
                return new defpackage.all(((java.lang.Integer) obj).intValue());
            case 7:
                defpackage.crl crlVar = (defpackage.crl) obj;
                return java.lang.Boolean.valueOf(crlVar == null || crlVar.a != 2);
            case 8:
                float fFloatValue = ((java.lang.Float) obj).floatValue();
                defpackage.aej aejVar = defpackage.amj.a;
                return java.lang.Float.valueOf(fFloatValue / 2.0f);
            case 9:
                return java.lang.Boolean.TRUE;
            case 10:
                ((java.lang.Integer) obj).intValue();
                return java.lang.Float.valueOf(Float.NaN);
            case 11:
                return java.lang.Boolean.TRUE;
            case 12:
                defpackage.and andVar = defpackage.anf.a;
                return !((android.content.Context) defpackage.dai.az((defpackage.cdd) obj, defpackage.daj.b)).getPackageManager().hasSystemFeature("android.software.leanback") ? defpackage.anc.b : defpackage.anf.a;
            case 13:
                return defpackage.afbk.a;
            case 14:
                return java.lang.Boolean.TRUE;
            case 15:
                ((java.lang.Long) obj).longValue();
                return defpackage.afbk.a;
            case 16:
                ((java.lang.Float) obj).floatValue();
                return defpackage.afbk.a;
            case 17:
                defpackage.crd crdVar = (defpackage.crd) obj;
                if (crdVar.d && crdVar.h) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case 18:
                return defpackage.afbk.a;
            case 19:
                return defpackage.afbk.a;
            default:
                return defpackage.afbk.a;
        }
    }
}
