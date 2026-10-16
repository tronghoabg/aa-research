package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ccb<K, V, T> implements java.util.Iterator<T>, defpackage.afhc {
    public final defpackage.ccl[] a;
    public int b;
    public boolean c = true;

    public ccb(defpackage.cck cckVar, defpackage.ccl[] cclVarArr) {
        this.a = cclVarArr;
        defpackage.ccl cclVar = cclVarArr[0];
        java.lang.Object[] objArr = cckVar.b;
        int iA = cckVar.a();
        cclVar.c(objArr, iA + iA, 0);
        this.b = 0;
        d();
    }

    private final int b(int i) {
        defpackage.ccl[] cclVarArr = this.a;
        if (cclVarArr[i].d()) {
            return i;
        }
        if (!cclVarArr[i].e()) {
            return -1;
        }
        defpackage.ccl cclVar = cclVarArr[i];
        cclVar.e();
        java.lang.Object obj = cclVar.a[cclVar.b];
        obj.getClass();
        defpackage.cck cckVar = (defpackage.cck) obj;
        if (i == 6) {
            defpackage.ccl cclVar2 = cclVarArr[7];
            java.lang.Object[] objArr = cckVar.b;
            cclVar2.c(objArr, objArr.length, 0);
        } else {
            defpackage.ccl cclVar3 = cclVarArr[i + 1];
            java.lang.Object[] objArr2 = cckVar.b;
            int iA = cckVar.a();
            cclVar3.c(objArr2, iA + iA, 0);
        }
        return b(i + 1);
    }

    private final void c() {
        if (!this.c) {
            throw new java.util.NoSuchElementException();
        }
    }

    private final void d() {
        defpackage.ccl[] cclVarArr = this.a;
        if (cclVarArr[this.b].d()) {
            return;
        }
        for (int i = this.b; i >= 0; i--) {
            int iB = b(i);
            if (iB == -1) {
                if (cclVarArr[i].e()) {
                    cclVarArr[i].b();
                    iB = b(i);
                } else {
                    iB = -1;
                }
            }
            if (iB != -1) {
                this.b = iB;
                return;
            }
            if (i > 0) {
                cclVarArr[i - 1].b();
            }
            cclVarArr[i].c(defpackage.cck.a.b, 0, 0);
        }
        this.c = false;
    }

    protected final java.lang.Object a() {
        c();
        return this.a[this.b].a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // java.util.Iterator
    public T next() {
        c();
        T next = this.a[this.b].next();
        d();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
