package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class cbv<K, V, T> implements Iterator<T>, afgc {
    public final ccf[] a;
    public int b;
    public boolean c = true;

    public cbv(cce cceVar, ccf[] ccfVarArr) {
        this.a = ccfVarArr;
        ccf ccfVar = ccfVarArr[0];
        Object[] objArr = cceVar.b;
        int iA = cceVar.a();
        ccfVar.c(objArr, iA + iA, 0);
        this.b = 0;
        d();
    }

    private final int b(int i) {
        ccf[] ccfVarArr = this.a;
        if (ccfVarArr[i].d()) {
            return i;
        }
        if (!ccfVarArr[i].e()) {
            return -1;
        }
        ccf ccfVar = ccfVarArr[i];
        ccfVar.e();
        Object obj = ccfVar.a[ccfVar.b];
        obj.getClass();
        cce cceVar = (cce) obj;
        if (i == 6) {
            ccf ccfVar2 = ccfVarArr[7];
            Object[] objArr = cceVar.b;
            ccfVar2.c(objArr, objArr.length, 0);
        } else {
            ccf ccfVar3 = ccfVarArr[i + 1];
            Object[] objArr2 = cceVar.b;
            int iA = cceVar.a();
            ccfVar3.c(objArr2, iA + iA, 0);
        }
        return b(i + 1);
    }

    private final void c() {
        if (!this.c) {
            throw new NoSuchElementException();
        }
    }

    private final void d() {
        ccf[] ccfVarArr = this.a;
        if (ccfVarArr[this.b].d()) {
            return;
        }
        for (int i = this.b; i >= 0; i--) {
            int iB = b(i);
            if (iB == -1) {
                if (ccfVarArr[i].e()) {
                    ccfVarArr[i].b();
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
                ccfVarArr[i - 1].b();
            }
            ccfVarArr[i].c(cce.a.b, 0, 0);
        }
        this.c = false;
    }

    protected final Object a() {
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
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
