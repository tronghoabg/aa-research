package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class njy implements defpackage.affc {
    private final /* synthetic */ int a;

    public /* synthetic */ njy(int i) {
        this.a = i;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                java.util.List list = (java.util.List) obj;
                defpackage.nke nkeVar = defpackage.nkj.a;
                list.getClass();
                defpackage.nne nneVar = (defpackage.nne) defpackage.afga.aB(list);
                return nneVar == null ? defpackage.kfn.h() : nneVar;
            case 1:
                ((java.lang.Boolean) obj).booleanValue();
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.nne nneVar2 = (defpackage.nne) obj;
                defpackage.nke nkeVar2 = defpackage.nkj.a;
                if (nneVar2 != null) {
                    return nneVar2.b;
                }
                return null;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                android.content.ComponentName componentName = (android.content.ComponentName) obj;
                defpackage.nke nkeVar3 = defpackage.nkj.a;
                componentName.getClass();
                java.lang.String strFlattenToString = componentName.flattenToString();
                strFlattenToString.getClass();
                return strFlattenToString;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.nke nkeVar4 = defpackage.nkj.a;
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.mqj mqjVar = (defpackage.mqj) obj;
                defpackage.nke nkeVar5 = defpackage.nkj.a;
                mqjVar.getClass();
                return mqjVar.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.nkj.b.l().y("Media and InCall hotseat updated to %s", (defpackage.nne) obj);
                return obj;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.nkj.b.l().y("Nav hotseat type %s", (defpackage.nkf) obj);
                return obj;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.nkj.b.l().y("Nav hotseat updated to %s", (defpackage.nne) obj);
                return obj;
            case 9:
                defpackage.mqj mqjVar2 = (defpackage.mqj) obj;
                mqjVar2.getClass();
                return java.lang.Boolean.valueOf(mqjVar2.b == defpackage.mqg.NAVIGATION);
            case 10:
                java.util.Map map = (java.util.Map) obj;
                map.getClass();
                defpackage.mqj mqjVar3 = (defpackage.mqj) map.get(com.google.android.gms.car.display.CarRegionId.a);
                if (mqjVar3 != null) {
                    return mqjVar3.a();
                }
                return null;
            case 11:
                defpackage.nkj.b.l().y("Primary region app %s", (android.content.ComponentName) obj);
                return obj;
            case 12:
                defpackage.nkj.b.l().y("Recent app hotseat updated to %s", (defpackage.nne) obj);
                return obj;
            case 13:
                defpackage.nkj.b.l().y("Media and InCall hotseat updated to %s", (defpackage.nne) obj);
                return obj;
            case 14:
                defpackage.nkj.b.l().y("Phone hotseat updated to %s", (defpackage.nne) obj);
                return obj;
            case 15:
                defpackage.nkj.b.l().y("Media hotseat updated to %s", (defpackage.nne) obj);
                return obj;
            case 16:
                ((java.lang.Boolean) obj).booleanValue();
                return defpackage.afbk.a;
            case 17:
                ((java.lang.Boolean) obj).booleanValue();
                return defpackage.afbk.a;
            case 18:
                nlf.a.l().y("currentFanDirectionState: %s", (kkl) obj);
                return obj;
            case 19:
                nlf.a.l().y("Allowed Directions: %s", (java.util.Set) obj);
                return obj;
            default:
                nph nphVar = (nph) obj;
                nphVar.getClass();
                int iOrdinal = nphVar.ordinal();
                if (iOrdinal == 0) {
                    return nlh.b;
                }
                if (iOrdinal == 1 || iOrdinal == 2) {
                    return nlh.a;
                }
                throw new defpackage.afas();
        }
    }
}
