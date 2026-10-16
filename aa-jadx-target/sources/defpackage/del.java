package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class del {
    public static final defpackage.affg a;
    private static final java.util.Comparator[] b;

    static {
        java.util.Comparator[] comparatorArr = new java.util.Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new defpackage.dab(new defpackage.mql((java.util.Comparator) (i == 0 ? cjd.c : cjd.b), defpackage.cxl.b, 1), 3, null);
            i++;
        }
        b = comparatorArr;
        a = new defpackage.cor(14);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00f1 A[LOOP:1: B:12:0x0047->B:31:0x00f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fa A[EDGE_INSN: B:49:0x00fa->B:33:0x00fa BREAK  A[LOOP:1: B:12:0x0047->B:31:0x00f1], SYNTHETIC] */
    public static final java.util.List a(defpackage.dec decVar, defpackage.affc affcVar, defpackage.affc affcVar2, java.util.List list) {
        int i;
        java.util.ArrayList arrayList;
        defpackage.zo zoVar = defpackage.zp.a;
        defpackage.zo zoVar2 = new defpackage.zo(6);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            b((defpackage.dec) list.get(i2), arrayList2, affcVar, affcVar2, zoVar2);
        }
        char c = decVar.a.s == defpackage.dlz.b ? (char) 0 : (char) 1;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2.size() / 2);
        int size2 = arrayList2.size() - 1;
        if (size2 >= 0) {
            int i3 = 0;
            while (true) {
                defpackage.dec decVar2 = (defpackage.dec) arrayList2.get(i3);
                if (i3 != 0) {
                    float f = decVar2.c().c;
                    float f2 = decVar2.c().e;
                    int size3 = arrayList3.size() - 1;
                    if (size3 >= 0) {
                        int i4 = 0;
                        while (true) {
                            defpackage.cjj cjjVar = (defpackage.cjj) ((defpackage.afau) arrayList3.get(i4)).a;
                            i = 0;
                            float f3 = cjjVar.c;
                            float f4 = cjjVar.e;
                            if (f < f2 && f3 < f4 && java.lang.Math.max(f, f3) < java.lang.Math.min(f2, f4)) {
                                arrayList = arrayList2;
                                arrayList3.set(i4, new defpackage.afau(new defpackage.cjj(java.lang.Math.max(cjjVar.b, 0.0f), java.lang.Math.max(f3, f), java.lang.Math.min(cjjVar.d, Float.POSITIVE_INFINITY), java.lang.Math.min(f4, f2)), ((defpackage.afau) arrayList3.get(i4)).b));
                                ((java.util.List) ((defpackage.afau) arrayList3.get(i4)).b).add(decVar2);
                                break;
                            }
                            arrayList = arrayList2;
                            if (i4 != size3) {
                                i4++;
                                arrayList2 = arrayList;
                            }
                        }
                        if (i3 != size2) {
                            break;
                        }
                        i3++;
                        arrayList2 = arrayList;
                    } else {
                        arrayList = arrayList2;
                        i = 0;
                    }
                } else {
                    arrayList = arrayList2;
                    i = 0;
                    i3 = 0;
                }
                defpackage.cjj cjjVarC = decVar2.c();
                defpackage.dec[] decVarArr = new defpackage.dec[1];
                decVarArr[i] = decVar2;
                arrayList3.add(new defpackage.afau(cjjVarC, defpackage.afga.ae(decVarArr)));
                if (i3 != size2) {
                    break;
                    break;
                }
                i3++;
                arrayList2 = arrayList;
            }
        } else {
            i = 0;
        }
        defpackage.afga.am(arrayList3, cjd.d);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Comparator comparator = b[c];
        int size4 = arrayList3.size();
        for (int i5 = i; i5 < size4; i5++) {
            java.lang.Object obj = ((defpackage.afau) arrayList3.get(i5)).b;
            defpackage.afga.am((java.util.List) obj, comparator);
            arrayList4.addAll((java.util.Collection) obj);
        }
        defpackage.afga.am(arrayList4, new defpackage.dab(a, 2));
        int size5 = i;
        while (size5 <= arrayList4.size() - 1) {
            java.util.List list2 = (java.util.List) zoVar2.a(((defpackage.dec) arrayList4.get(size5)).c);
            if (list2 != null) {
                if (((java.lang.Boolean) affcVar2.invoke(arrayList4.get(size5))).booleanValue()) {
                    size5++;
                } else {
                    arrayList4.remove(size5);
                }
                arrayList4.addAll(size5, list2);
                size5 += list2.size();
            } else {
                size5++;
            }
        }
        return arrayList4;
    }

    private static final void b(defpackage.dec decVar, java.util.ArrayList arrayList, defpackage.affc affcVar, defpackage.affc affcVar2, defpackage.zo zoVar) {
        boolean zBooleanValue = ((java.lang.Boolean) decVar.b.d(defpackage.def.n, new defpackage.bmd(12))).booleanValue();
        if (zBooleanValue || ((java.lang.Boolean) affcVar2.invoke(decVar)).booleanValue()) {
            if (((java.lang.Boolean) affcVar.invoke(decVar)).booleanValue()) {
                arrayList.add(decVar);
            }
            if (zBooleanValue) {
                zoVar.g(decVar.c, a(decVar, affcVar, affcVar2, decVar.k((4 & 1) != 0 ? !decVar.e : false, false & ((4 & 2) == 0))));
                return;
            }
        }
        java.util.List listK = decVar.k((4 & 1) != 0 ? !decVar.e : false, false & ((4 & 2) == 0));
        int size = listK.size();
        for (int i = 0; i < size; i++) {
            b((defpackage.dec) listK.get(i), arrayList, affcVar, affcVar2, zoVar);
        }
    }
}
