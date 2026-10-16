package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class cmr implements defpackage.affc {
    private final /* synthetic */ int a;

    public /* synthetic */ cmr(int i) {
        this.a = i;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                defpackage.dai.U((defpackage.cml) obj, 0L, 0L, 0L, 0.0f, null, 126);
                return defpackage.afbk.a;
            case 1:
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                boolean z = ((cqo) obj).b;
                return java.lang.Boolean.TRUE;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((defpackage.cxl) obj).u = true;
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.cwi cwiVar = (defpackage.cwi) obj;
                cwiVar.b = true;
                defpackage.dai.G(cwiVar);
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.cwi) obj).v();
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((defpackage.cwf) obj).i().c = false;
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ((defpackage.cwf) obj).i().d = false;
                return defpackage.afbk.a;
            case 9:
                defpackage.cwf cwfVar = (defpackage.cwf) obj;
                cwfVar.i().e = cwfVar.i().d;
                return defpackage.afbk.a;
            case 10:
                obj.getClass();
                return java.lang.Boolean.valueOf(!((defpackage.cyv) obj).w());
            case 11:
                java.lang.Class cls = defpackage.czz.a;
                return java.lang.Boolean.TRUE;
            case 12:
                defpackage.zm zmVar = defpackage.dah.a;
                return java.lang.Boolean.valueOf(defpackage.vx.d((defpackage.dec) obj));
            case 13:
                ((java.lang.Long) obj).longValue();
                int i = defpackage.ddg.d;
                return defpackage.afbk.a;
            case 14:
                return java.lang.Integer.valueOf(((ddm) obj).b);
            case 15:
                return java.lang.Integer.valueOf(((ddm) obj).c.a());
            case 16:
                defpackage.dmm dmmVar = (defpackage.dmm) obj;
                dmmVar.getHandler().post(new defpackage.ku(dmmVar.q, 19, null));
                return defpackage.afbk.a;
            case 17:
                return defpackage.afbk.a;
            case 18:
                return defpackage.afbk.a;
            case 19:
                return defpackage.afbk.a;
            default:
                defpackage.dej dejVar = defpackage.def.z;
                defpackage.afbk afbkVar = defpackage.afbk.a;
                ((defpackage.dek) obj).a(dejVar, afbkVar);
                return afbkVar;
        }
    }
}
