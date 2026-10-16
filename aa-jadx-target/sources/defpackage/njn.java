package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class njn implements defpackage.affh {
    private final /* synthetic */ int a;

    public /* synthetic */ njn(int i) {
        this.a = i;
    }

    @Override // defpackage.affh
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i = this.a;
        if (i == 0) {
            boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
            java.lang.Boolean bool = (java.lang.Boolean) obj2;
            java.util.Map map = (java.util.Map) obj3;
            bool.getClass();
            map.getClass();
            defpackage.mqj mqjVar = (defpackage.mqj) map.get(com.google.android.gms.car.display.CarRegionId.a);
            boolean zF = defpackage.afga.f(mqjVar != null ? mqjVar.a() : null, defpackage.mkt.s);
            if (bool.booleanValue()) {
                return defpackage.njf.c;
            }
            if (zBooleanValue) {
                return defpackage.njf.a;
            }
            return zF ? defpackage.njf.b : defpackage.njf.d;
        }
        if (i != 1) {
            defpackage.cub cubVar = (defpackage.cub) obj;
            defpackage.ctx ctxVar = (defpackage.ctx) obj2;
            cubVar.getClass();
            ctxVar.getClass();
            long j = ((defpackage.dlm) obj3).a;
            defpackage.cux cuxVarV = ctxVar.v(j);
            int iA = defpackage.dlm.a(j);
            defpackage.ocd ocdVar = defpackage.obt.a;
            float f = iA / 13.0f;
            int iK = defpackage.afhi.k(java.lang.Float.intBitsToFloat((int) (defpackage.obt.a.b(f) >> 32)) + defpackage.afhi.k(f) + java.lang.Float.intBitsToFloat((int) (defpackage.obt.b.b(f) >> 32)));
            return cubVar.dS(iK, cuxVarV.b, defpackage.afcf.a, new defpackage.bfr(cubVar, cuxVarV, iK, 3));
        }
        defpackage.alu aluVar = (defpackage.alu) obj;
        defpackage.bve bveVar = (defpackage.bve) obj2;
        int iIntValue = ((java.lang.Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != bveVar.C(aluVar) ? 2 : 4;
        }
        if (bveVar.I((iIntValue & 19) != 18, iIntValue & 1)) {
            defpackage.cgc cgcVar = defpackage.cgf.e;
            long j2 = defpackage.alx.a;
            defpackage.cgf cgfVarD = defpackage.awj.d(defpackage.awj.r(defpackage.asq.I(cgcVar, 0.0f, 8.0f)), 1.0f);
            long j3 = aluVar.c;
            defpackage.atp.c(cgfVarD.a(new defpackage.ajc(-72057594037927936L, defpackage.cky.a)), bveVar, 0);
        } else {
            bveVar.s();
        }
        return defpackage.afbk.a;
    }
}
