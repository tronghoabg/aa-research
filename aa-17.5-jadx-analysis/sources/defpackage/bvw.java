package defpackage;

import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class bvw {
    public static final Comparator a = new azl(2);

    public static final int a(bzf bzfVar, int i, int i2) {
        int i3 = 0;
        while (i > 0 && i != i2) {
            i = bzfVar.e(i);
            i3++;
        }
        return i3;
    }

    public static final int b(List list, int i) {
        int iC = c(list, i);
        return iC < 0 ? -(iC + 1) : iC;
    }

    public static final int c(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iB = affa.b(((bwd) list.get(i3)).a, i);
            if (iB < 0) {
                i2 = i3 + 1;
            } else {
                if (iB <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final bwd d(List list, int i, int i2) {
        int iB = b(list, i);
        if (iB >= list.size()) {
            return null;
        }
        bwd bwdVar = (bwd) list.get(iB);
        if (bwdVar.a < i2) {
            return bwdVar;
        }
        return null;
    }

    public static final bwd e(List list, int i) {
        int iC = c(list, i);
        if (iC >= 0) {
            return (bwd) list.remove(iC);
        }
        return null;
    }

    public static final void f(bzf bzfVar, List list, int i) {
        if (bzfVar.B(i)) {
            list.add(bzfVar.o(i));
            return;
        }
        int iC = i + 1;
        int iC2 = i + bzfVar.c(i);
        while (iC < iC2) {
            f(bzfVar, list, iC);
            iC += bzfVar.c(iC);
        }
    }

    public static final void g(bzj bzjVar, int i, Object obj) {
        int iD = bzjVar.d(i);
        Object[] objArr = bzjVar.c;
        Object obj2 = objArr[iD];
        objArr[iD] = buw.a;
        if (obj == obj2) {
            return;
        }
        buz.b(a.bw(obj2, obj, "Slot table is out of sync (expected ", ", got ", ")"));
    }

    public static final void h(List list, int i, int i2) {
        int iB = b(list, i);
        while (iB < list.size() && ((bwd) list.get(iB)).a < i2) {
        }
    }
}
