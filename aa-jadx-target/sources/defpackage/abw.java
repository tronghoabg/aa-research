package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class abw implements defpackage.affg {
    private final /* synthetic */ int a;

    public /* synthetic */ abw(int i) {
        this.a = i;
    }

    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                defpackage.acj acjVar = (defpackage.acj) obj2;
                return java.lang.Boolean.valueOf(((defpackage.acj) obj) == acjVar && acjVar == defpackage.acj.c);
            case 1:
                return new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L));
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return java.lang.Integer.valueOf(((defpackage.all) obj2).c());
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.axx axxVar = (defpackage.axx) obj2;
                defpackage.cdz cdzVar = defpackage.axx.q;
                return defpackage.afga.ac(java.lang.Integer.valueOf(axxVar.b()), java.lang.Integer.valueOf(axxVar.c()));
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.aye ayeVar = (defpackage.aye) obj2;
                int i = defpackage.aye.g;
                return defpackage.afga.ac(java.lang.Integer.valueOf(ayeVar.b()), java.lang.Integer.valueOf(ayeVar.c()));
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                java.util.Map mapB = ((defpackage.bag) obj2).b();
                if (mapB.isEmpty()) {
                    return null;
                }
                return mapB;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.bau bauVar = (defpackage.bau) obj2;
                defpackage.cdz cdzVar2 = defpackage.bau.b;
                return defpackage.afga.ac(java.lang.Integer.valueOf(bauVar.j()), java.lang.Float.valueOf(defpackage.afqt.d(bauVar.c(), -0.5f, 0.5f)), java.lang.Integer.valueOf(bauVar.b()));
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.bff bffVar = (defpackage.bff) obj2;
                defpackage.cdz cdzVar3 = defpackage.bff.b;
                return defpackage.afga.ac(java.lang.Float.valueOf(bffVar.b()), java.lang.Boolean.valueOf(bffVar.c() == defpackage.apn.a));
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.tna.ax((defpackage.bve) obj, ((java.lang.Integer) obj2).intValue());
            case 9:
                return defpackage.tna.ax((defpackage.bve) obj, ((java.lang.Integer) obj2).intValue());
            case 10:
                defpackage.bve bveVar = (defpackage.bve) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                if (bveVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                    throw null;
                }
                bveVar.s();
                return defpackage.afbk.a;
            case 11:
                defpackage.cdu cduVar = (defpackage.cdu) obj2;
                defpackage.aau aauVar = cduVar.c;
                java.lang.Object[] objArr = aauVar.b;
                java.lang.Object[] objArr2 = aauVar.c;
                long[] jArr = aauVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = i2 - length;
                            int i4 = 0;
                            while (true) {
                                int i5 = 8 - ((~i3) >>> 31);
                                if (i4 < i5) {
                                    if ((255 & j) < 128) {
                                        int i6 = (i2 << 3) + i4;
                                        cduVar.a.put(objArr[i6], ((defpackage.cdv) objArr2[i6]).b());
                                    }
                                    j >>= 8;
                                    i4++;
                                } else {
                                    obj3 = null;
                                    if (i5 == 8) {
                                    }
                                }
                            }
                        } else {
                            obj3 = null;
                        }
                        if (i2 != length) {
                            i2++;
                        }
                    }
                } else {
                    obj3 = null;
                }
                java.util.Map map = cduVar.a;
                defpackage.afga.bp(map.values(), new defpackage.bwy(2));
                return map.isEmpty() ? obj3 : map;
            case 12:
                return obj2;
            case 13:
                return defpackage.tna.ax((defpackage.bve) obj, ((java.lang.Integer) obj2).intValue());
            case 14:
                ((defpackage.cxl) obj).ae((defpackage.cgf) obj2);
                return defpackage.afbk.a;
            case 15:
                ((defpackage.cxl) obj).ay((defpackage.cdd) obj2);
                return defpackage.afbk.a;
            case 16:
                ((defpackage.cxl) obj).ad((defpackage.cty) obj2);
                return defpackage.afbk.a;
            case 17:
                ((defpackage.cxl) obj).aa(((java.lang.Integer) obj2).intValue());
                return defpackage.afbk.a;
            case 18:
                return defpackage.tna.ax((defpackage.bve) obj, ((java.lang.Integer) obj2).intValue());
            case 19:
                java.util.Collection collection = (java.util.List) obj;
                java.util.List list = (java.util.List) obj2;
                if (collection == null) {
                    collection = defpackage.afce.a;
                }
                return defpackage.afga.aS(collection, list);
            default:
                java.util.List list2 = (java.util.List) obj;
                java.util.List list3 = (java.util.List) obj2;
                if (list2 == null) {
                    return list3;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(list2);
                arrayList.addAll(list3);
                return arrayList;
        }
    }
}
