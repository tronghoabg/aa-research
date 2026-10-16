package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class ded {
    public static final afeg a;
    private static final Comparator[] b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new czs(new mqf(i == 0 ? civ.c : civ.b, cxb.b, 1), 3, null);
            i++;
        }
        b = comparatorArr;
        a = new coi(14);
    }

    public static final List a(ddu dduVar, afec afecVar, afec afecVar2, List list) {
        int i;
        ArrayList arrayList;
        zh zhVar = zi.a;
        zh zhVar2 = new zh(6);
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            b((ddu) list.get(i2), arrayList2, afecVar, afecVar2, zhVar2);
        }
        char c = dduVar.a.s == dlr.b ? (char) 0 : (char) 1;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() / 2);
        int size2 = arrayList2.size() - 1;
        if (size2 >= 0) {
            int i3 = 0;
            while (true) {
                ddu dduVar2 = (ddu) arrayList2.get(i3);
                if (i3 != 0) {
                    float f = dduVar2.c().c;
                    float f2 = dduVar2.c().e;
                    int size3 = arrayList3.size() - 1;
                    if (size3 >= 0) {
                        int i4 = 0;
                        while (true) {
                            cjb cjbVar = (cjb) ((aezu) arrayList3.get(i4)).a;
                            i = 0;
                            float f3 = cjbVar.c;
                            float f4 = cjbVar.e;
                            if (f < f2 && f3 < f4 && Math.max(f, f3) < Math.min(f2, f4)) {
                                arrayList = arrayList2;
                                arrayList3.set(i4, new aezu(new cjb(Math.max(cjbVar.b, BitmapDescriptorFactory.HUE_RED), Math.max(f3, f), Math.min(cjbVar.d, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((aezu) arrayList3.get(i4)).b));
                                ((List) ((aezu) arrayList3.get(i4)).b).add(dduVar2);
                                break;
                            }
                            arrayList = arrayList2;
                            if (i4 == size3) {
                                break;
                            }
                            i4++;
                            arrayList2 = arrayList;
                        }
                    } else {
                        arrayList = arrayList2;
                        i = 0;
                    }
                } else {
                    arrayList = arrayList2;
                    i = 0;
                    i3 = 0;
                }
                cjb cjbVarC = dduVar2.c();
                ddu[] dduVarArr = new ddu[1];
                dduVarArr[i] = dduVar2;
                arrayList3.add(new aezu(cjbVarC, woy.bk(dduVarArr)));
                if (i3 == size2) {
                    break;
                }
                i3++;
                arrayList2 = arrayList;
            }
        } else {
            i = 0;
        }
        woy.bs(arrayList3, civ.d);
        ArrayList arrayList4 = new ArrayList();
        Comparator comparator = b[c];
        int size4 = arrayList3.size();
        for (int i5 = i; i5 < size4; i5++) {
            Object obj = ((aezu) arrayList3.get(i5)).b;
            woy.bs((List) obj, comparator);
            arrayList4.addAll((Collection) obj);
        }
        woy.bs(arrayList4, new czs(a, 2));
        int size5 = i;
        while (size5 <= arrayList4.size() - 1) {
            List list2 = (List) zhVar2.a(((ddu) arrayList4.get(size5)).c);
            if (list2 != null) {
                if (((Boolean) afecVar2.invoke(arrayList4.get(size5))).booleanValue()) {
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

    private static final void b(ddu dduVar, ArrayList arrayList, afec afecVar, afec afecVar2, zh zhVar) {
        boolean zBooleanValue = ((Boolean) dduVar.b.d(ddx.n, new blz(12))).booleanValue();
        if (zBooleanValue || ((Boolean) afecVar2.invoke(dduVar)).booleanValue()) {
            if (((Boolean) afecVar.invoke(dduVar)).booleanValue()) {
                arrayList.add(dduVar);
            }
            if (zBooleanValue) {
                zhVar.g(dduVar.c, a(dduVar, afecVar, afecVar2, dduVar.k((4 & 1) != 0 ? !dduVar.e : false, false & ((4 & 2) == 0))));
                return;
            }
        }
        List listK = dduVar.k((4 & 1) != 0 ? !dduVar.e : false, false & ((4 & 2) == 0));
        int size = listK.size();
        for (int i = 0; i < size; i++) {
            b((ddu) listK.get(i), arrayList, afecVar, afecVar2, zhVar);
        }
    }
}
