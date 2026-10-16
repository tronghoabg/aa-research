package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class pup implements defpackage.xyp {
    private final /* synthetic */ int a;

    public /* synthetic */ pup(int i) {
        this.a = i;
    }

    @Override // defpackage.xyp
    public final boolean a(java.lang.Object obj) {
        int iOrdinal;
        abfc abfcVar;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                java.lang.Exception exc = (java.lang.Exception) obj;
                return (exc == null || (iOrdinal = pxn.c(exc).q.ordinal()) == 0 || iOrdinal == 1 || iOrdinal == 2 || (iOrdinal != 9 && (iOrdinal == 12 || iOrdinal == 15))) ? false : true;
            case 1:
                android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) obj;
                int i = defpackage.mat.a;
                return resolveInfo.serviceInfo != null && defpackage.kmv.c(defpackage.acvb.g(), new android.content.ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name).flattenToString());
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                android.content.pm.ResolveInfo resolveInfo2 = (android.content.pm.ResolveInfo) obj;
                int i2 = defpackage.qik.a;
                if (resolveInfo2.filter == null) {
                    return true;
                }
                return (resolveInfo2.filter.hasCategory("com.google.android.gms.car.category.CATEGORY_AUXILIARY_DISPLAY") || resolveInfo2.filter.hasCategory("com.google.android.gms.car.category.CATEGORY_CLUSTER_DISPLAY") || resolveInfo2.filter.hasCategory("com.google.android.gms.car.category.CATEGORY_SECONDARY_REGION")) ? false : true;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return ((trm) obj).b() != null;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return false;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                abdv abdvVar = (abdv) obj;
                return ((abdvVar.b & 8) == 0 || uxw.b(abdvVar)) ? false : true;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                abdv abdvVar2 = (abdv) obj;
                if ((abdvVar2.b & 8) != 0 && !uxw.b(abdvVar2)) {
                    defpackage.aboj abojVar = abas.b;
                    abdvVar2.j(abojVar);
                    if (!abdvVar2.w.m(abojVar.d)) {
                        return true;
                    }
                }
                return false;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                abdv abdvVar3 = (abdv) obj;
                abdg abdgVarA = uxw.a(abdvVar3);
                if ((!abdgVarA.equals(abci.V.b) && abdgVarA.m) || defpackage.acmh.F(defpackage.acmj.i(abdvVar3).c) == 17 || defpackage.acmh.F(defpackage.acmj.i(abdvVar3).c) == 20) {
                    return false;
                }
                defpackage.aboj abojVar2 = abci.E;
                abdvVar3.j(abojVar2);
                java.lang.Object objJ = abdvVar3.w.j(abojVar2.d);
                if (((ablt) (objJ == null ? abojVar2.b : abojVar2.c(objJ))).equals(ablt.a)) {
                    defpackage.aboj abojVar3 = abci.O;
                    abdvVar3.j(abojVar3);
                    defpackage.abon abonVar = abdvVar3.w;
                    defpackage.abow abowVar = abojVar3.d;
                    if (abonVar.m(abowVar)) {
                        abdvVar3.j(abojVar3);
                        java.lang.Object objJ2 = abdvVar3.w.j(abowVar);
                        abfcVar = (abfc) (objJ2 == null ? abojVar3.b : abojVar3.c(objJ2));
                    } else {
                        abfcVar = null;
                    }
                    if (abfcVar != null || defpackage.acmh.F(defpackage.acmj.i(abdvVar3).c) == 6 || uxw.b(abdvVar3) || (abdvVar3.h & 1) != 0) {
                        return false;
                    }
                    abdr abdrVar = abdvVar3.c;
                    if (abdrVar == null) {
                        abdrVar = abdr.a;
                    }
                    defpackage.abpj abpjVar = abdrVar.c;
                    abdr abdrVar2 = abdvVar3.d;
                    if (abdrVar2 == null) {
                        abdrVar2 = abdr.a;
                    }
                    defpackage.abpj abpjVar2 = abdrVar2.c;
                    if ((abdvVar3.b & 8) != 0 && !abpjVar.isEmpty() && (((abdq) abpjVar.get(0)).b & 1) == 0 && !abpjVar2.isEmpty() && (((abdq) abpjVar2.get(0)).b & 1) != 0) {
                        return true;
                    }
                }
                return false;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.ypg ypgVar = uen.a;
                return false;
            default:
                return ((j$.util.Optional) obj).isPresent();
        }
    }
}
