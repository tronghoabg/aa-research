package defpackage;

import java.io.Serializable;
import java.util.Collection;

/* loaded from: classes3.dex */
final class yhd implements Serializable {
    private static final long serialVersionUID = 0;
    private final Object[] a;
    private final Object[] b;
    private final Object[] c;
    private final int[] d;
    private final int[] e;

    private yhd(Object[] objArr, Object[] objArr2, Object[] objArr3, int[] iArr, int[] iArr2) {
        this.a = objArr;
        this.b = objArr2;
        this.c = objArr3;
        this.d = iArr;
        this.e = iArr2;
    }

    static yhd a(yhe yheVar, int[] iArr, int[] iArr2) {
        Object[] array = yheVar.n().toArray();
        Object[] array2 = yheVar.m().toArray();
        Collection collectionB = yheVar.a;
        if (collectionB == null) {
            collectionB = yheVar.b();
            yheVar.a = collectionB;
        }
        return new yhd(array, array2, ((yfg) collectionB).toArray(), iArr, iArr2);
    }

    Object readResolve() {
        Object[] objArr = this.c;
        int length = objArr.length;
        if (length == 0) {
            return yms.b;
        }
        if (length == 1) {
            return new ymq(this.a[0], this.b[0], objArr[0]);
        }
        yfl yflVar = new yfl(length);
        for (int i = 0; i < objArr.length; i++) {
            yflVar.i(yhe.o(this.a[this.d[i]], this.b[this.e[i]], objArr[i]));
        }
        return ymc.p(yflVar.g(), ygr.o(this.a), ygr.o(this.b));
    }
}
