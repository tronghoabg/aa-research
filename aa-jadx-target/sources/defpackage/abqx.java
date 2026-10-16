package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class abqx {
    private static volatile int a = 100;

    public static defpackage.abqy b(java.lang.Object obj) {
        return ((defpackage.abox) obj).al;
    }

    public static defpackage.abqy c(defpackage.abqy abqyVar, defpackage.abqy abqyVar2) {
        defpackage.abqy abqyVar3 = defpackage.abqy.a;
        if (abqyVar3.equals(abqyVar2)) {
            return abqyVar;
        }
        if (abqyVar3.equals(abqyVar)) {
            int i = abqyVar.b + abqyVar2.b;
            int[] iArrCopyOf = java.util.Arrays.copyOf(abqyVar.c, i);
            java.lang.System.arraycopy(abqyVar2.c, 0, iArrCopyOf, abqyVar.b, abqyVar2.b);
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(abqyVar.d, i);
            java.lang.System.arraycopy(abqyVar2.d, 0, objArrCopyOf, abqyVar.b, abqyVar2.b);
            return new defpackage.abqy(i, iArrCopyOf, objArrCopyOf, true);
        }
        if (abqyVar2.equals(abqyVar3)) {
            return abqyVar;
        }
        abqyVar.b();
        int i2 = abqyVar.b + abqyVar2.b;
        abqyVar.c(i2);
        java.lang.System.arraycopy(abqyVar2.c, 0, abqyVar.c, abqyVar.b, abqyVar2.b);
        java.lang.System.arraycopy(abqyVar2.d, 0, abqyVar.d, abqyVar.b, abqyVar2.b);
        abqyVar.b = i2;
        return abqyVar;
    }

    public static void d(java.lang.Object obj, defpackage.abqy abqyVar) {
        ((defpackage.abox) obj).al = abqyVar;
    }

    public static final defpackage.abqy e(java.lang.Object obj) {
        defpackage.abox aboxVar = (defpackage.abox) obj;
        defpackage.abqy abqyVar = aboxVar.al;
        if (abqyVar != defpackage.abqy.a) {
            return abqyVar;
        }
        defpackage.abqy abqyVar2 = new defpackage.abqy();
        aboxVar.al = abqyVar2;
        return abqyVar2;
    }

    final boolean a(java.lang.Object obj, defpackage.abnz abnzVar, int i) throws java.io.IOException {
        int i2 = abnzVar.b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            ((defpackage.abqy) obj).e(i3 << 3, java.lang.Long.valueOf(abnzVar.k()));
            return true;
        }
        if (i4 == 1) {
            defpackage.abqy abqyVar = (defpackage.abqy) obj;
            abqyVar.e((i3 << 3) | 1, java.lang.Long.valueOf(abnzVar.j()));
            return true;
        }
        if (i4 == 2) {
            ((defpackage.abqy) obj).e((i3 << 3) | 2, abnzVar.o());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new defpackage.abpp("Protocol message end-group tag did not match expected tag.");
            }
            if (i4 != 5) {
                throw new defpackage.abpo();
            }
            ((defpackage.abqy) obj).e(5 | (i3 << 3), java.lang.Integer.valueOf(abnzVar.e()));
            return true;
        }
        int i5 = i3 << 3;
        defpackage.abqy abqyVar2 = new defpackage.abqy();
        int i6 = i + 1;
        if (i6 >= a) {
            throw new defpackage.abpp("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (abnzVar.c() != Integer.MAX_VALUE && a(abqyVar2, abnzVar, i6)) {
        }
        if ((i5 | 4) != abnzVar.b) {
            throw new defpackage.abpp("Protocol message end-group tag did not match expected tag.");
        }
        abqyVar2.d();
        ((defpackage.abqy) obj).e(i5 | 3, abqyVar2);
        return true;
    }
}
