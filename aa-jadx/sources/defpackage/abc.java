package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class abc {
    public static final java.lang.Object a = new java.lang.Object();

    public static final java.lang.Object a(defpackage.abb abbVar, int i) {
        java.lang.Object obj;
        int iA = defpackage.abg.a(abbVar.b, abbVar.d, i);
        if (iA < 0 || (obj = abbVar.c[iA]) == a) {
            return null;
        }
        return obj;
    }

    public static final void b(defpackage.abb abbVar) {
        int i = abbVar.d;
        int[] iArr = abbVar.b;
        java.lang.Object[] objArr = abbVar.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            java.lang.Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        abbVar.a = false;
        abbVar.d = i2;
    }
}
