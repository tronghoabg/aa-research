package defpackage;

/* loaded from: classes.dex */
public final class aav {
    public static final Object a = new Object();

    public static final Object a(aau aauVar, int i) {
        Object obj;
        int iA = aaz.a(aauVar.b, aauVar.d, i);
        if (iA < 0 || (obj = aauVar.c[iA]) == a) {
            return null;
        }
        return obj;
    }

    public static final void b(aau aauVar) {
        int i = aauVar.d;
        int[] iArr = aauVar.b;
        Object[] objArr = aauVar.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        aauVar.a = false;
        aauVar.d = i2;
    }
}
