package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class cbx<K, V, T> extends cbv<K, V, T> implements Iterator<T>, afgc {
    public final cbw d;
    public int e;
    private Object f;
    private boolean g;

    public cbx(cbw cbwVar, ccf[] ccfVarArr) {
        super(cbwVar.a, ccfVarArr);
        this.d = cbwVar;
        this.e = cbwVar.c;
    }

    public final void b(int i, cce cceVar, Object obj, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            ccf[] ccfVarArr = this.a;
            ccf ccfVar = ccfVarArr[i2];
            Object[] objArr = cceVar.b;
            ccfVar.c(objArr, objArr.length, 0);
            while (!affa.f(ccfVarArr[i2].a(), obj)) {
                ccfVarArr[i2].b += 2;
            }
            this.b = i2;
            return;
        }
        int i4 = 1 << ((i >> i3) & 31);
        if (cceVar.m(i4)) {
            int iB = cceVar.b(i4);
            ccf ccfVar2 = this.a[i2];
            Object[] objArr2 = cceVar.b;
            int iA = cceVar.a();
            ccfVar2.c(objArr2, iA + iA, iB);
            this.b = i2;
            return;
        }
        int iC = cceVar.c(i4);
        cce cceVarI = cceVar.i(iC);
        ccf ccfVar3 = this.a[i2];
        Object[] objArr3 = cceVar.b;
        int iA2 = cceVar.a();
        ccfVar3.c(objArr3, iA2 + iA2, iC);
        b(i, cceVarI, obj, i2 + 1);
    }

    @Override // defpackage.cbv, java.util.Iterator
    public final T next() {
        if (this.d.c != this.e) {
            throw new ConcurrentModificationException();
        }
        this.f = a();
        this.g = true;
        return (T) super.next();
    }

    @Override // defpackage.cbv, java.util.Iterator
    public final void remove() {
        if (!this.g) {
            throw new IllegalStateException();
        }
        if (this.c) {
            Object objA = a();
            cbw cbwVar = this.d;
            Object obj = this.f;
            affz.i(cbwVar);
            cbwVar.remove(obj);
            b(objA != null ? objA.hashCode() : 0, cbwVar.a, objA, 0);
        } else {
            cbw cbwVar2 = this.d;
            Object obj2 = this.f;
            affz.i(cbwVar2);
            cbwVar2.remove(obj2);
        }
        this.f = null;
        this.g = false;
        this.e = this.d.c;
    }
}
