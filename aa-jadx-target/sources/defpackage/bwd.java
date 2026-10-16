package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bwd {
    public static final java.util.Comparator a = new defpackage.azq(2);

    public static final int a(defpackage.bzl bzlVar, int i, int i2) {
        int i3 = 0;
        while (i > 0 && i != i2) {
            i = bzlVar.e(i);
            i3++;
        }
        return i3;
    }

    public static final int b(java.util.List list, int i) {
        int iC = c(list, i);
        return iC < 0 ? -(iC + 1) : iC;
    }

    public static final int c(java.util.List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iB = defpackage.afga.b(((defpackage.bwk) list.get(i3)).a, i);
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

    public static final defpackage.bwk d(java.util.List list, int i, int i2) {
        int iB = b(list, i);
        if (iB >= list.size()) {
            return null;
        }
        defpackage.bwk bwkVar = (defpackage.bwk) list.get(iB);
        if (bwkVar.a < i2) {
            return bwkVar;
        }
        return null;
    }

    public static final defpackage.bwk e(java.util.List list, int i) {
        int iC = c(list, i);
        if (iC >= 0) {
            return (defpackage.bwk) list.remove(iC);
        }
        return null;
    }

    public static final void f(defpackage.bzl bzlVar, java.util.List list, int i) {
        if (bzlVar.B(i)) {
            list.add(bzlVar.o(i));
            return;
        }
        int iC = i + 1;
        int iC2 = i + bzlVar.c(i);
        while (iC < iC2) {
            f(bzlVar, list, iC);
            iC += bzlVar.c(iC);
        }
    }

    public static final void g(defpackage.bzp bzpVar, int i, java.lang.Object obj) {
        int iD = bzpVar.d(i);
        java.lang.Object[] objArr = bzpVar.c;
        java.lang.Object obj2 = objArr[iD];
        objArr[iD] = defpackage.bvd.a;
        if (obj == obj2) {
            return;
        }
        defpackage.bvg.b(defpackage.a.bv(obj2, obj, "Slot table is out of sync (expected ", ", got ", ")"));
    }

    public static final void h(java.util.List list, int i, int i2) {
        int iB = b(list, i);
        while (iB < list.size() && ((defpackage.bwk) list.get(iB)).a < i2) {
        }
    }
}
