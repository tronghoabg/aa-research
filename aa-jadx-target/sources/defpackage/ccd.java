package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ccd<K, V, T> extends defpackage.ccb<K, V, T> implements java.util.Iterator<T>, defpackage.afhc {
    public final defpackage.ccc d;
    public int e;
    private java.lang.Object f;
    private boolean g;

    public ccd(defpackage.ccc cccVar, defpackage.ccl[] cclVarArr) {
        super(cccVar.a, cclVarArr);
        this.d = cccVar;
        this.e = cccVar.c;
    }

    public final void b(int i, defpackage.cck cckVar, java.lang.Object obj, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            defpackage.ccl[] cclVarArr = this.a;
            defpackage.ccl cclVar = cclVarArr[i2];
            java.lang.Object[] objArr = cckVar.b;
            cclVar.c(objArr, objArr.length, 0);
            while (!defpackage.afga.f(cclVarArr[i2].a(), obj)) {
                cclVarArr[i2].b += 2;
            }
            this.b = i2;
            return;
        }
        int i4 = 1 << ((i >> i3) & 31);
        if (cckVar.m(i4)) {
            int iB = cckVar.b(i4);
            defpackage.ccl cclVar2 = this.a[i2];
            java.lang.Object[] objArr2 = cckVar.b;
            int iA = cckVar.a();
            cclVar2.c(objArr2, iA + iA, iB);
            this.b = i2;
            return;
        }
        int iC = cckVar.c(i4);
        defpackage.cck cckVarI = cckVar.i(iC);
        defpackage.ccl cclVar3 = this.a[i2];
        java.lang.Object[] objArr3 = cckVar.b;
        int iA2 = cckVar.a();
        cclVar3.c(objArr3, iA2 + iA2, iC);
        b(i, cckVarI, obj, i2 + 1);
    }

    @Override // defpackage.ccb, java.util.Iterator
    public final T next() {
        if (this.d.c != this.e) {
            throw new java.util.ConcurrentModificationException();
        }
        this.f = a();
        this.g = true;
        return (T) super.next();
    }

    @Override // defpackage.ccb, java.util.Iterator
    public final void remove() {
        if (!this.g) {
            throw new java.lang.IllegalStateException();
        }
        if (this.c) {
            java.lang.Object objA = a();
            defpackage.ccc cccVar = this.d;
            java.lang.Object obj = this.f;
            defpackage.afgz.i(cccVar);
            cccVar.remove(obj);
            b(objA != null ? objA.hashCode() : 0, cccVar.a, objA, 0);
        } else {
            defpackage.ccc cccVar2 = this.d;
            java.lang.Object obj2 = this.f;
            defpackage.afgz.i(cccVar2);
            cccVar2.remove(obj2);
        }
        this.f = null;
        this.g = false;
        this.e = this.d.c;
    }
}
