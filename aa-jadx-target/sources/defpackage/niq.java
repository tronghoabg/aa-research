package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class niq implements defpackage.afer {
    private final /* synthetic */ int a;

    public /* synthetic */ niq(int i) {
        this.a = i;
    }

    @Override // defpackage.afer
    public final java.lang.Object invoke() throws defpackage.qst {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                defpackage.yqm yqmVar = njd.a;
                java.util.List list = defpackage.nje.j;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(defpackage.afqt.e(defpackage.afga.P(defpackage.afga.aj(list, 10)), 16));
                defpackage.afbo afboVar = new defpackage.afbo((defpackage.afbr) list);
                while (afboVar.hasNext()) {
                    java.lang.Object next = afboVar.next();
                    linkedHashMap.put(next, new defpackage.cit());
                }
                return linkedHashMap;
            case 1:
                defpackage.yqm yqmVar2 = defpackage.nif.a;
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.yqm yqmVar3 = njd.a;
                return new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.nje.a, defpackage.bxv.c);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.yqm yqmVar4 = njd.a;
                return new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.afja[] afjaVarArr = njv.a;
                return java.lang.Boolean.valueOf(defpackage.lzm.c());
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.nke nkeVar = defpackage.nkj.a;
                return java.lang.Boolean.valueOf(defpackage.mpr.f().a().g("key_settings_show_rail_widget", false) && defpackage.nte.c().b().L());
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.nke nkeVar2 = defpackage.nkj.a;
                defpackage.mkp.a.g();
                defpackage.oml.E(defpackage.kit.b().e(), com.google.android.gms.car.display.CarRegionId.a);
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                nks nksVar = nks.a;
                defpackage.ngk.a.a().b();
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                nks nksVar2 = nks.a;
                defpackage.ngk ngkVarA = defpackage.ngk.a.a();
                defpackage.qsh qshVarE = defpackage.kit.b().e();
                qshVarE.getClass();
                ngkVarA.f(qshVarE);
                return defpackage.afbk.a;
            case 9:
                nks nksVar3 = nks.a;
                defpackage.ngk ngkVarA2 = defpackage.ngk.a.a();
                defpackage.qsh qshVarE2 = defpackage.kit.b().e();
                qshVarE2.getClass();
                ngkVarA2.e(qshVarE2);
                return defpackage.afbk.a;
            case 10:
                defpackage.yqm yqmVar5 = nlf.a;
                return defpackage.afbk.a;
            case 11:
                return defpackage.afbk.a;
            case 12:
                return defpackage.afbk.a;
            case 13:
                return java.lang.Boolean.valueOf(defpackage.mpr.f().a().g("key_settings_show_rail_widget", false));
            case 14:
                defpackage.yqm yqmVar6 = defpackage.non.a;
                return defpackage.afbk.a;
            case 15:
                defpackage.yqm yqmVar7 = defpackage.non.a;
                return defpackage.afbk.a;
            case 16:
                return new defpackage.npu();
            case 17:
                return new defpackage.nqw();
            case 18:
                return defpackage.afbk.a;
            case 19:
                defpackage.yqm yqmVar8 = defpackage.nrm.c;
                return defpackage.a.P();
            default:
                java.lang.Object objU = defpackage.khg.u(new defpackage.wde("GH.ImmersiveToolbarFrag", defpackage.zbe.IMMERSIVE_MODE, defpackage.zbd.Me, "Failed to get car window manager.", new java.lang.Object[0]), new defpackage.nyn(1));
                objU.getClass();
                return (defpackage.sax) objU;
        }
    }
}
