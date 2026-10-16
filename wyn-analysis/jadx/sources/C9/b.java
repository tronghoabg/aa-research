package c9;

import W9.u;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f19802a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f19803b;

    /* renamed from: c, reason: collision with root package name */
    public final Comparator f19804c;

    public b() {
        q6.d dVar = s9.h.f45373b;
        this.f19802a = new Object[0];
        this.f19803b = new Object[0];
        this.f19804c = dVar;
    }

    @Override // c9.c
    public final boolean a(Object obj) {
        return j(obj) != -1;
    }

    @Override // c9.c
    public final Object b(s9.h hVar) {
        int iJ = j(hVar);
        if (iJ != -1) {
            return this.f19803b[iJ];
        }
        return null;
    }

    @Override // c9.c
    public final Comparator c() {
        return this.f19804c;
    }

    @Override // c9.c
    public final Object d() {
        Object[] objArr = this.f19802a;
        if (objArr.length > 0) {
            return objArr[objArr.length - 1];
        }
        return null;
    }

    @Override // c9.c
    public final Object e() {
        Object[] objArr = this.f19802a;
        if (objArr.length > 0) {
            return objArr[0];
        }
        return null;
    }

    @Override // c9.c
    public final int f(s9.k kVar) {
        return j(kVar);
    }

    @Override // c9.c
    public final c g(Object obj, Object obj2) {
        int iJ = j(obj);
        Comparator comparator = this.f19804c;
        Object[] objArr = this.f19803b;
        Object[] objArr2 = this.f19802a;
        if (iJ != -1) {
            if (objArr2[iJ] == obj && objArr[iJ] == obj2) {
                return this;
            }
            int length = objArr2.length;
            Object[] objArr3 = new Object[length];
            System.arraycopy(objArr2, 0, objArr3, 0, length);
            objArr3[iJ] = obj;
            int length2 = objArr.length;
            Object[] objArr4 = new Object[length2];
            System.arraycopy(objArr, 0, objArr4, 0, length2);
            objArr4[iJ] = obj2;
            return new b(comparator, objArr3, objArr4);
        }
        if (objArr2.length > 25) {
            HashMap map = new HashMap(objArr2.length + 1);
            for (int i5 = 0; i5 < objArr2.length; i5++) {
                map.put(objArr2[i5], objArr[i5]);
            }
            map.put(obj, obj2);
            return u.c(new ArrayList(map.keySet()), map, comparator);
        }
        int i10 = 0;
        while (i10 < objArr2.length && comparator.compare(objArr2[i10], obj) < 0) {
            i10++;
        }
        Object[] objArr5 = new Object[objArr2.length + 1];
        System.arraycopy(objArr2, 0, objArr5, 0, i10);
        objArr5[i10] = obj;
        int i11 = i10 + 1;
        System.arraycopy(objArr2, i10, objArr5, i11, (r5 - i10) - 1);
        Object[] objArr6 = new Object[objArr.length + 1];
        System.arraycopy(objArr, 0, objArr6, 0, i10);
        objArr6[i10] = obj2;
        System.arraycopy(objArr, i10, objArr6, i11, (r3 - i10) - 1);
        return new b(comparator, objArr5, objArr6);
    }

    @Override // c9.c
    public final Iterator h(Object obj) {
        int i5 = 0;
        while (true) {
            Object[] objArr = this.f19802a;
            if (i5 >= objArr.length || this.f19804c.compare(objArr[i5], obj) >= 0) {
                break;
            }
            i5++;
        }
        return new C1591a(this, i5);
    }

    @Override // c9.c
    public final c i(Object obj) {
        int iJ = j(obj);
        if (iJ == -1) {
            return this;
        }
        Object[] objArr = this.f19802a;
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, iJ);
        int i5 = iJ + 1;
        System.arraycopy(objArr, i5, objArr2, iJ, length - iJ);
        Object[] objArr3 = this.f19803b;
        int length2 = objArr3.length - 1;
        Object[] objArr4 = new Object[length2];
        System.arraycopy(objArr3, 0, objArr4, 0, iJ);
        System.arraycopy(objArr3, i5, objArr4, iJ, length2 - iJ);
        return new b(this.f19804c, objArr2, objArr4);
    }

    @Override // c9.c
    public final boolean isEmpty() {
        return this.f19802a.length == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1591a(this, 0);
    }

    public final int j(Object obj) {
        int i5 = 0;
        for (Object obj2 : this.f19802a) {
            if (this.f19804c.compare(obj, obj2) == 0) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    @Override // c9.c
    public final int size() {
        return this.f19802a.length;
    }

    public b(Comparator comparator, Object[] objArr, Object[] objArr2) {
        this.f19802a = objArr;
        this.f19803b = objArr2;
        this.f19804c = comparator;
    }
}
