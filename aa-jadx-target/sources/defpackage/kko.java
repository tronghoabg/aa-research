package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kko implements defpackage.affc {
    private final /* synthetic */ int a;

    public /* synthetic */ kko(int i) {
        this.a = i;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) throws java.io.IOException {
        defpackage.zbd zbdVarB;
        defpackage.zaa zaaVarB;
        int i = 10;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                kki kkiVar = (kkl) obj;
                kkiVar.getClass();
                if (kkiVar instanceof kki) {
                    return kkiVar.a;
                }
                return null;
            case 1:
                defpackage.yqm yqmVar = defpackage.kic.a;
                j$.util.stream.Stream streamFlatMap = j$.util.Collection.-EL.stream(((java.util.Map) obj).values()).flatMap(new defpackage.khy(0));
                int i2 = defpackage.ygw.d;
                return (java.util.List) streamFlatMap.collect(defpackage.yds.a);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.util.List list = (java.util.List) obj;
                int i3 = klg.a;
                list.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : list) {
                    if (obj2 instanceof kjo) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                int i4 = klg.a;
                if (iIntValue == 1) {
                    return "Compact UI";
                }
                return "Unknown Metadata " + iIntValue;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                java.util.List list2 = (java.util.List) obj;
                list2.getClass();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj3 : list2) {
                    if (obj3 instanceof kjo) {
                        arrayList2.add(obj3);
                    }
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList(defpackage.afga.aj(arrayList2, 10));
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((kjo) it.next()).a);
                }
                return arrayList3;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                java.util.List list3 = (java.util.List) obj;
                list3.getClass();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                for (java.lang.Object obj4 : list3) {
                    if (obj4 instanceof kjq) {
                        arrayList4.add(obj4);
                    }
                }
                return arrayList4;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.chw chwVar = (defpackage.chw) obj;
                chwVar.getClass();
                chwVar.a();
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.cim cimVar = (defpackage.cim) obj;
                cimVar.getClass();
                cimVar.g(new defpackage.kko(6));
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                rsg rsgVar = (rsg) obj;
                rsgVar.getClass();
                rsd rsdVar = rsgVar.c;
                if (rsdVar == null) {
                    rsdVar = rsd.a;
                }
                java.lang.String str = rsdVar.c;
                str.getClass();
                return str;
            case 9:
                defpackage.absb absbVar = (defpackage.absb) obj;
                absbVar.getClass();
                return "{" + juu.h(absbVar) + "}";
            case 10:
                abse abseVar = (abse) obj;
                return abseVar.b + "/" + abseVar.c;
            case 11:
                abse abseVar2 = (abse) obj;
                return abseVar2.b + "/" + abseVar2.c;
            case 12:
                defpackage.absh abshVar = (defpackage.absh) obj;
                abshVar.getClass();
                java.lang.String strBo = defpackage.afga.bo(new defpackage.abph(abshVar.d, defpackage.absh.a), null, "[", "]", new defpackage.kko(16), 25);
                defpackage.absb absbVar2 = abshVar.c;
                if (absbVar2 == null) {
                    absbVar2 = defpackage.absb.a;
                }
                absbVar2.getClass();
                return defpackage.a.bp("Display Type: " + strBo + ", " + juu.h(absbVar2), "{", "}");
            case 13:
                defpackage.absb absbVar3 = (defpackage.absb) obj;
                absbVar3.getClass();
                return "{" + juu.h(absbVar3) + "}";
            case 14:
                abss abssVar = (abss) obj;
                int i5 = abssVar.b;
                int iF = acal.f(i5);
                if (iF == 0) {
                    throw null;
                }
                int i6 = iF - 1;
                if (i6 != 0) {
                    if (i6 != 1) {
                        return "unknown trigger";
                    }
                    if (i5 != 2 || (zaaVarB = defpackage.zaa.b(((java.lang.Integer) abssVar.c).intValue())) == null) {
                        zaaVarB = defpackage.zaa.UNKNOWN_ACTION;
                    }
                    return "NonUiAction ".concat(java.lang.String.valueOf(zaaVarB.name()));
                }
                if (i5 == 1) {
                    zbdVarB = defpackage.zbd.b(((java.lang.Integer) abssVar.c).intValue());
                    if (zbdVarB == null) {
                        zbdVarB = defpackage.zbd.sm;
                    }
                } else {
                    zbdVarB = defpackage.zbd.a;
                }
                return "UiAction ".concat(zbdVarB.sn);
            case 15:
                defpackage.abpj abpjVar = ((absp) obj).b;
                abpjVar.getClass();
                return defpackage.afga.bo(abpjVar, null, null, null, new defpackage.kko(11), 31);
            case 16:
                return ((absj) obj).name();
            case 17:
                defpackage.rsb rsbVar = (defpackage.rsb) obj;
                rsbVar.getClass();
                return defpackage.a.bp("Make: " + rsbVar.c + ", Model: " + rsbVar.d + ", Year: " + rsbVar.e + ", HU Make: " + rsbVar.h + ", HU Model: " + rsbVar.f + ", Exclude: " + rsbVar.g, "{", "}");
            case 18:
                absm absmVar = (absm) obj;
                defpackage.abpj abpjVar2 = absmVar.b;
                abpjVar2.getClass();
                java.lang.String strBo2 = defpackage.afga.bo(abpjVar2, null, null, null, null, 63);
                defpackage.abpj abpjVar3 = absmVar.c;
                abpjVar3.getClass();
                return "Manufacturers: " + strBo2 + ", Widgets: " + defpackage.afga.bo(abpjVar3, null, "[", "]", new defpackage.kko(15), 25);
            case 19:
                defpackage.abpj abpjVar4 = ((absp) obj).b;
                abpjVar4.getClass();
                return defpackage.afga.bo(abpjVar4, null, null, null, new defpackage.kko(i), 31);
            default:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                entry.getClass();
                java.lang.Object key = entry.getKey();
                java.lang.Object value = entry.getValue();
                value.getClass();
                return "{" + key + ": " + juu.w((defpackage.addf) value) + "}";
        }
    }
}
