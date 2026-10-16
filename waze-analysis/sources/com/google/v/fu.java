package com.google.v;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class fu {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f12982a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final ge f12983b = new ge();

    public static void A(int i2, List list, af afVar, ft ftVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            afVar.w(i2, list.get(i3), ftVar);
        }
    }

    public static void B(int i2, List list, af afVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        afVar.z(i2, list, z);
    }

    public static void C(int i2, List list, af afVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        afVar.B(i2, list, z);
    }

    public static void D(int i2, List list, af afVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        afVar.D(i2, list, z);
    }

    public static void E(int i2, List list, af afVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        afVar.F(i2, list, z);
    }

    public static void F(int i2, List list, af afVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        afVar.I(i2, list);
    }

    public static void G(int i2, List list, af afVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        afVar.K(i2, list, z);
    }

    public static void H(int i2, List list, af afVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        afVar.M(i2, list, z);
    }

    static int I(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * ae.ap(i2);
    }

    static int J(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * ae.aq(i2);
    }

    static void K(Object obj, Object obj2) {
        dh dhVarB = dc.b(obj2);
        if (dhVarB.q()) {
            return;
        }
        dc.c(obj).m(dhVarB);
    }

    static void L(Object obj, Object obj2) {
        gf gfVarD = ge.d(obj);
        gf gfVarD2 = ge.d(obj2);
        if (!gf.c().equals(gfVarD2)) {
            if (gf.c().equals(gfVarD)) {
                gfVarD = gf.d(gfVarD, gfVarD2);
            } else {
                gfVarD.m(gfVarD2);
            }
        }
        ge.e(obj, gfVarD);
    }

    private static /* synthetic */ int M(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ed)) {
            int iJ = 0;
            while (i2 < size) {
                iJ += ae.J(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return iJ;
        }
        ed edVar = (ed) list;
        int iJ2 = 0;
        while (i2 < size) {
            iJ2 += ae.J(edVar.d(i2));
            i2++;
        }
        return iJ2;
    }

    private static /* synthetic */ int N(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof fc)) {
            int iY = 0;
            while (i2 < size) {
                iY += ae.Y(((Long) list.get(i2)).longValue());
                i2++;
            }
            return iY;
        }
        fc fcVar = (fc) list;
        int iY2 = 0;
        while (i2 < size) {
            iY2 += ae.Y(fcVar.a(i2));
            i2++;
        }
        return iY2;
    }

    @Deprecated
    static int a(int i2, fi fiVar, ft ftVar) {
        int iU = ae.U(i2);
        return iU + iU + ((c) fiVar).getSerializedSize(ftVar);
    }

    static int b(c cVar, ft ftVar) {
        return ae.L(cVar.getSerializedSize(ftVar));
    }

    static int c(List list) {
        return M(list);
    }

    static int d(List list) {
        return list.size() * 4;
    }

    static int e(List list) {
        return list.size() * 8;
    }

    static int f(List list) {
        return M(list);
    }

    static int g(List list) {
        return N(list);
    }

    static int h(int i2, Object obj, ft ftVar) {
        return ae.U(i2) + b((c) obj, ftVar);
    }

    static int i(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ed)) {
            int iP = 0;
            while (i2 < size) {
                iP += ae.P(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return iP;
        }
        ed edVar = (ed) list;
        int iP2 = 0;
        while (i2 < size) {
            iP2 += ae.P(edVar.d(i2));
            i2++;
        }
        return iP2;
    }

    static int j(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof fc)) {
            int iR = 0;
            while (i2 < size) {
                iR += ae.R(((Long) list.get(i2)).longValue());
                i2++;
            }
            return iR;
        }
        fc fcVar = (fc) list;
        int iR2 = 0;
        while (i2 < size) {
            iR2 += ae.R(fcVar.a(i2));
            i2++;
        }
        return iR2;
    }

    static int k(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ed)) {
            int iW = 0;
            while (i2 < size) {
                iW += ae.W(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return iW;
        }
        ed edVar = (ed) list;
        int iW2 = 0;
        while (i2 < size) {
            iW2 += ae.W(edVar.d(i2));
            i2++;
        }
        return iW2;
    }

    static int l(List list) {
        return N(list);
    }

    public static ge m() {
        return f12983b;
    }

    static Object n(Object obj, int i2, List list, eh ehVar, Object obj2, ge geVar) {
        if (ehVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (ehVar.findValueByNumber(iIntValue) == null) {
                    obj2 = p(obj, i2, iIntValue, obj2, geVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Integer num = (Integer) list.get(i4);
            int iIntValue2 = num.intValue();
            if (ehVar.findValueByNumber(iIntValue2) != null) {
                if (i4 != i3) {
                    list.set(i3, num);
                }
                i3++;
            } else {
                obj2 = p(obj, i2, iIntValue2, obj2, geVar);
            }
        }
        if (i3 != size) {
            list.subList(i3, size).clear();
        }
        return obj2;
    }

    static Object o(Object obj, int i2, List list, ei eiVar, Object obj2, ge geVar) {
        if (eiVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!eiVar.isInRange(iIntValue)) {
                    obj2 = p(obj, i2, iIntValue, obj2, geVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Integer num = (Integer) list.get(i4);
            int iIntValue2 = num.intValue();
            if (eiVar.isInRange(iIntValue2)) {
                if (i4 != i3) {
                    list.set(i3, num);
                }
                i3++;
            } else {
                obj2 = p(obj, i2, iIntValue2, obj2, geVar);
            }
        }
        if (i3 != size) {
            list.subList(i3, size).clear();
        }
        return obj2;
    }

    static Object p(Object obj, int i2, int i3, Object obj2, ge geVar) {
        if (obj2 == null) {
            obj2 = ge.f(obj);
        }
        ge.c(obj2, i2, i3);
        return obj2;
    }

    public static void q(int i2, List list, af afVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        afVar.c(i2, list, z);
    }

    public static void r(int i2, List list, af afVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        afVar.e(i2, list);
    }

    public static void s(int i2, List list, af afVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        afVar.g(i2, list, z);
    }

    public static void t(int i2, List list, af afVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        afVar.j(i2, list, z);
    }

    public static void u(int i2, List list, af afVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        afVar.l(i2, list, z);
    }

    public static void v(int i2, List list, af afVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        afVar.n(i2, list, z);
    }

    public static void w(int i2, List list, af afVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        afVar.p(i2, list, z);
    }

    public static void x(int i2, List list, af afVar, ft ftVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            afVar.q(i2, list.get(i3), ftVar);
        }
    }

    public static void y(int i2, List list, af afVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        afVar.s(i2, list, z);
    }

    public static void z(int i2, List list, af afVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        afVar.u(i2, list, z);
    }
}
