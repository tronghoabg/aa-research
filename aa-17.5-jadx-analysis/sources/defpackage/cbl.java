package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class cbl<E> extends afau<E> implements List, Collection, afgd {
    public int a;
    public Object[] b;
    public Object[] c;
    public int d;
    private cbf e;
    private Object[] f;
    private Object[] g;
    private czz h = new czz();

    public cbl(cbf cbfVar, Object[] objArr, Object[] objArr2, int i) {
        this.e = cbfVar;
        this.f = objArr;
        this.g = objArr2;
        this.a = i;
        this.b = this.f;
        this.c = this.g;
        this.d = this.e.size();
    }

    private final int A(afec afecVar, Object[] objArr, int i, ntn ntnVar) {
        Object[] objArrP = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) afecVar.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrP = p(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrP[i2] = obj;
                i2++;
            }
        }
        ntnVar.a = objArrP;
        return i2;
    }

    private final int B(afec afecVar, int i, ntn ntnVar) {
        int iA = A(afecVar, this.c, i, ntnVar);
        if (iA == i) {
            return i;
        }
        Object obj = ntnVar.a;
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        woy.cE(objArr, null, iA, i);
        this.c = objArr;
        this.d -= i - iA;
        return iA;
    }

    private final Object[] C(Object[] objArr, int i, int i2, Object obj, ntn ntnVar) {
        Object obj2;
        int i3 = (i2 >> i) & 31;
        int i4 = i3 + 1;
        if (i == 0) {
            ntnVar.a = objArr[31];
            Object[] objArrP = p(objArr);
            woy.dq(objArr, objArrP, i4, i3, 31);
            objArrP[i3] = obj;
            return objArrP;
        }
        Object[] objArrP2 = p(objArr);
        int i5 = i - 5;
        Object obj3 = objArrP2[i3];
        obj3.getClass();
        objArrP2[i3] = C((Object[]) obj3, i5, i2, obj, ntnVar);
        while (i4 < 32 && (obj2 = objArrP2[i4]) != null) {
            objArrP2[i4] = C((Object[]) obj2, i5, 0, ntnVar.a, ntnVar);
            i4++;
        }
        return objArrP2;
    }

    private final Object[] D(Object[] objArr, int i, int i2, ntn ntnVar) {
        Object[] objArrD;
        int i3 = ((i2 - 1) >> i) & 31;
        if (i == 5) {
            ntnVar.a = objArr[i3];
            objArrD = null;
        } else {
            Object obj = objArr[i3];
            obj.getClass();
            objArrD = D((Object[]) obj, i - 5, i2, ntnVar);
        }
        if (objArrD == null && i3 == 0) {
            return null;
        }
        Object[] objArrP = p(objArr);
        objArrP[i3] = objArrD;
        return objArrP;
    }

    private final Object[] E(Object[] objArr, int i, int i2, ntn ntnVar) {
        int i3 = (i2 >> i) & 31;
        int i4 = i3 + 1;
        if (i == 0) {
            Object obj = objArr[i3];
            Object[] objArrP = p(objArr);
            woy.dq(objArr, objArrP, i3, i4, 32);
            objArrP[31] = ntnVar.a;
            ntnVar.a = obj;
            return objArrP;
        }
        int iF = objArr[31] == null ? 31 & ((f() - 1) >> i) : 31;
        Object[] objArrP2 = p(objArr);
        int i5 = i - 5;
        if (i4 <= iF) {
            while (true) {
                Object obj2 = objArrP2[iF];
                obj2.getClass();
                objArrP2[iF] = E((Object[]) obj2, i5, 0, ntnVar);
                if (iF == i4) {
                    break;
                }
                iF--;
            }
        }
        Object obj3 = objArrP2[i3];
        obj3.getClass();
        objArrP2[i3] = E((Object[]) obj3, i5, i2, ntnVar);
        return objArrP2;
    }

    private final Object[] F(Object[] objArr, int i, int i2, Object obj, ntn ntnVar) {
        Object[] objArrP = p(objArr);
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            if (objArrP != objArr) {
                this.modCount++;
            }
            ntnVar.a = objArrP[i3];
            objArrP[i3] = obj;
            return objArrP;
        }
        Object obj2 = objArrP[i3];
        obj2.getClass();
        objArrP[i3] = F((Object[]) obj2, i - 5, i2, obj, ntnVar);
        return objArrP;
    }

    private final int f() {
        int i = this.d;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    private final int g() {
        return y(this.d);
    }

    private final Object h(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.d - i;
        Object[] objArr2 = this.c;
        if (i4 == 1) {
            Object obj = objArr2[0];
            l(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrP = p(objArr2);
        woy.dq(objArr2, objArrP, i3, i3 + 1, i4);
        objArrP[i4 - 1] = null;
        this.b = objArr;
        this.c = objArrP;
        this.d = (i + i4) - 1;
        this.a = i2;
        return obj2;
    }

    private final ListIterator i(int i) {
        Object[] objArr = this.b;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iF = f() >> 5;
        a.aH(i, iF);
        int i2 = this.a;
        return i2 == 0 ? new cbo(objArr, i) : new cbq(objArr, i, iF, i2 / 5);
    }

    private final void j(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        Object[] objArr3;
        Object[] objArr4 = this.b;
        if (objArr4 == null) {
            throw new IllegalStateException("root is null");
        }
        int i4 = i >> 5;
        if (objArr4 == null) {
            throw new IllegalStateException("root is null");
        }
        ListIterator listIteratorI = i(f() >> 5);
        Object[] objArrQ = objArr2;
        int i5 = i3;
        while (listIteratorI.previousIndex() != i4) {
            Object[] objArr5 = (Object[]) listIteratorI.previous();
            woy.dq(objArr5, objArrQ, 0, 32 - i2, 32);
            objArrQ = q(objArr5, i2);
            i5--;
            objArr[i5] = objArrQ;
        }
        Object[] objArr6 = (Object[]) listIteratorI.previous();
        int iF = i3 - (((f() >> 5) - 1) - i4);
        if (iF < i3) {
            Object[] objArr7 = objArr[iF];
            objArr7.getClass();
            objArr3 = objArr7;
        } else {
            objArr3 = objArr2;
        }
        n(collection, i, objArr6, 32, objArr, iF, objArr3);
    }

    private final void k(Object[] objArr, int i, Object obj) {
        int iG = g();
        Object[] objArrP = p(this.c);
        int i2 = i + 1;
        Object[] objArr2 = this.c;
        if (iG >= 32) {
            Object obj2 = objArr2[31];
            woy.dq(objArr2, objArrP, i2, i, 31);
            objArrP[i] = obj;
            m(objArr, objArrP, s(obj2));
            return;
        }
        woy.dq(objArr2, objArrP, i2, i, iG);
        objArrP[i] = obj;
        this.b = objArr;
        this.c = objArrP;
        this.d++;
    }

    private final void l(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.b = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.c = objArr;
            this.d = i;
            this.a = 0;
            return;
        }
        ntn ntnVar = new ntn(null, null);
        objArr.getClass();
        Object[] objArrD = D(objArr, i2, i, ntnVar);
        objArrD.getClass();
        Object obj = ntnVar.a;
        obj.getClass();
        this.c = (Object[]) obj;
        this.d = i;
        if (objArrD[1] == null) {
            this.b = (Object[]) objArrD[0];
            this.a = i2 - 5;
        } else {
            this.b = objArrD;
            this.a = i2;
        }
    }

    private final void m(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.d;
        int i2 = i >> 5;
        int i3 = this.a;
        if (i2 > (1 << i3)) {
            this.b = w(s(objArr), objArr2, this.a + 5);
            this.c = objArr3;
            this.a += 5;
            this.d++;
            return;
        }
        if (objArr == null) {
            this.b = objArr2;
            this.c = objArr3;
            this.d = i + 1;
        } else {
            this.b = w(objArr, objArr2, i3);
            this.c = objArr3;
            this.d++;
        }
    }

    private final void n(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrR;
        if (i3 <= 0) {
            bxc.a("requires at least one nullBuffer");
        }
        Object[] objArrP = p(objArr);
        objArr2[0] = objArrP;
        int i4 = i & 31;
        int size = ((i + collection.size()) - 1) & 31;
        int i5 = (i2 - i4) + size;
        int i6 = size + 1;
        if (i5 < 32) {
            woy.dq(objArrP, objArr3, i6, i4, i2);
        } else {
            int i7 = i5 - 31;
            if (i3 == 1) {
                objArrR = objArrP;
            } else {
                objArrR = r();
                i3--;
                objArr2[i3] = objArrR;
            }
            int i8 = i2 - i7;
            woy.dq(objArrP, objArr3, 0, i8, i2);
            woy.dq(objArrP, objArrR, i6, i4, i8);
            objArr3 = objArrR;
        }
        Iterator<E> it = collection.iterator();
        x(objArrP, i4, it);
        for (int i9 = 1; i9 < i3; i9++) {
            Object[] objArrR2 = r();
            x(objArrR2, 0, it);
            objArr2[i9] = objArrR2;
        }
        x(objArr3, 0, it);
    }

    private final boolean o(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.h;
    }

    private final Object[] p(Object[] objArr) {
        if (objArr == null) {
            return r();
        }
        if (o(objArr)) {
            return objArr;
        }
        Object[] objArrR = r();
        woy.dB(objArr, objArrR, 0, afpt.f(objArr.length, 32), 6);
        return objArrR;
    }

    private final Object[] q(Object[] objArr, int i) {
        int i2 = 32 - i;
        if (o(objArr)) {
            woy.dq(objArr, objArr, i, 0, i2);
            return objArr;
        }
        Object[] objArrR = r();
        woy.dq(objArr, objArrR, i, 0, i2);
        return objArrR;
    }

    private final Object[] r() {
        Object[] objArr = new Object[33];
        objArr[32] = this.h;
        return objArr;
    }

    private final Object[] s(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.h;
        return objArr;
    }

    private final Object[] t(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            bxc.a("shift should be positive");
        }
        if (i2 != 0) {
            int i3 = (i >> i2) & 31;
            Object obj = objArr[i3];
            obj.getClass();
            Object objT = t((Object[]) obj, i, i2 - 5);
            if (i3 < 31) {
                int i4 = i3 + 1;
                if (objArr[i4] != null) {
                    if (o(objArr)) {
                        woy.cE(objArr, null, i4, 32);
                    }
                    Object[] objArrR = r();
                    woy.dq(objArr, objArrR, 0, 0, i4);
                    objArr = objArrR;
                }
            }
            if (objT != objArr[i3]) {
                Object[] objArrP = p(objArr);
                objArrP[i3] = objT;
                return objArrP;
            }
        }
        return objArr;
    }

    private final Object[] u(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            bxc.a("invalid buffersIterator");
        }
        if (i2 < 0) {
            bxc.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrP = p(objArr);
        int i3 = (i >> i2) & 31;
        int i4 = i2 - 5;
        objArrP[i3] = u((Object[]) objArrP[i3], i, i4, it);
        while (true) {
            i3++;
            if (i3 >= 32 || !it.hasNext()) {
                break;
            }
            objArrP[i3] = u((Object[]) objArrP[i3], 0, i4, it);
        }
        return objArrP;
    }

    private final Object[] v(Object[] objArr, int i, Object[][] objArr2) {
        Iterator itD = afez.d(objArr2);
        int i2 = this.a;
        Object[] objArrU = (i >> 5) < (1 << i2) ? u(objArr, i, i2, itD) : p(objArr);
        while (itD.hasNext()) {
            this.a += 5;
            objArrU = s(objArrU);
            int i3 = this.a;
            u(objArrU, 1 << i3, i3, itD);
        }
        return objArrU;
    }

    private final Object[] w(Object[] objArr, Object[] objArr2, int i) {
        Object[] objArrP = p(objArr);
        int i2 = ((this.d - 1) >> i) & 31;
        if (i == 5) {
            objArrP[i2] = objArr2;
            return objArrP;
        }
        objArrP[i2] = w((Object[]) objArrP[i2], objArr2, i - 5);
        return objArrP;
    }

    private static final void x(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    private static final int y(int i) {
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int z(afec afecVar, Object[] objArr, int i, int i2, ntn ntnVar, List list, List list2) {
        if (o(objArr)) {
            list.add(objArr);
        }
        Object obj = ntnVar.a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrR = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) afecVar.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrR = !list.isEmpty() ? (Object[]) list.remove(list.size() - 1) : r();
                    i2 = 0;
                }
                objArrR[i2] = obj2;
                i2++;
            }
        }
        ntnVar.a = objArrR;
        if (objArr2 != ntnVar.a) {
            list2.add(objArr2);
        }
        return i2;
    }

    public final int a() {
        return this.modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        a.aH(i, this.d);
        if (i == this.d) {
            add(e);
            return;
        }
        this.modCount++;
        int iF = f();
        if (i >= iF) {
            k(this.b, i - iF, e);
            return;
        }
        ntn ntnVar = new ntn(null, null);
        Object[] objArr = this.b;
        objArr.getClass();
        k(C(objArr, this.a, i, e, ntnVar), 0, ntnVar.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        cbl<E> cblVar;
        Collection<? extends E> collection2;
        Object[] objArrR;
        Object[][] objArr;
        a.aH(i, this.d);
        if (i == this.d) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int i2 = (i >> 5) << 5;
        int size = (((this.d - i2) + collection.size()) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = (i + collection.size()) - 1;
            Object[] objArr2 = this.c;
            Object[] objArrP = p(objArr2);
            woy.dq(objArr2, objArrP, (size2 & 31) + 1, i3, g());
            x(objArrP, i3, collection.iterator());
            this.c = objArrP;
            this.d += collection.size();
            return true;
        }
        Object[][] objArr3 = new Object[size][];
        int iG = g();
        int size3 = this.d + collection.size();
        if (i >= f()) {
            objArrR = r();
            objArr = objArr3;
            cblVar = this;
            collection2 = collection;
            cblVar.n(collection2, i, this.c, iG, objArr, size, objArrR);
        } else {
            cblVar = this;
            collection2 = collection;
            int iY = y(size3);
            Object[] objArr4 = cblVar.c;
            if (iY > iG) {
                int i4 = iY - iG;
                Object[] objArrQ = cblVar.q(objArr4, i4);
                cblVar.j(collection2, i, i4, objArr3, size, objArrQ);
                objArr = objArr3;
                objArrR = objArrQ;
            } else {
                objArrR = cblVar.r();
                int i5 = iG - iY;
                woy.dq(objArr4, objArrR, 0, i5, iG);
                int i6 = 32 - i5;
                Object[] objArrQ2 = cblVar.q(cblVar.c, i6);
                int i7 = size - 1;
                objArr3[i7] = objArrQ2;
                cblVar.j(collection2, i, i6, objArr3, i7, objArrQ2);
                collection2 = collection2;
                objArr = objArr3;
                cblVar = cblVar;
            }
        }
        cblVar.b = cblVar.v(cblVar.b, i2, objArr);
        cblVar.c = objArrR;
        cblVar.d += collection2.size();
        return true;
    }

    @Override // defpackage.afau
    public final int b() {
        return this.d;
    }

    public final cbf c() {
        cbf cbkVar;
        Object[] objArr = this.b;
        if (objArr == this.f && this.c == this.g) {
            cbkVar = this.e;
        } else {
            this.h = new czz();
            this.f = objArr;
            Object[] objArr2 = this.c;
            this.g = objArr2;
            if (objArr != null) {
                cbkVar = new cbk(objArr, objArr2, this.d, this.a);
            } else if (objArr2.length == 0) {
                cbkVar = cbp.a;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(this.c, this.d);
                objArrCopyOf.getClass();
                cbkVar = new cbp(objArrCopyOf);
            }
        }
        this.e = cbkVar;
        return cbkVar;
    }

    @Override // defpackage.afau
    public final Object d(int i) {
        a.aG(i, this.d);
        this.modCount++;
        int iF = f();
        if (i >= iF) {
            return h(this.b, iF, this.a, i - iF);
        }
        ntn ntnVar = new ntn(this.c[0], null);
        Object[] objArr = this.b;
        objArr.getClass();
        h(E(objArr, this.a, i, ntnVar), iF, this.a, 0);
        return ntnVar.a;
    }

    public final boolean e(afec afecVar) {
        int i;
        afec afecVar2 = afecVar;
        int iG = g();
        Object[] objArrT = null;
        ntn ntnVar = new ntn(null, null);
        boolean z = false;
        if (this.b != null) {
            ListIterator listIteratorI = i(0);
            int iA = 32;
            while (true) {
                if (iA == 32) {
                    if (!listIteratorI.hasNext()) {
                        iA = 32;
                        break;
                    }
                    iA = A(afecVar2, (Object[]) listIteratorI.next(), 32, ntnVar);
                } else {
                    break;
                }
            }
            if (iA == 32) {
                listIteratorI.hasNext();
                int iB = B(afecVar2, iG, ntnVar);
                if (iB == 0) {
                    l(this.b, this.d, this.a);
                    iB = 0;
                }
                if (iB != iG) {
                }
            } else {
                int iPreviousIndex = listIteratorI.previousIndex() << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iZ = iA;
                while (listIteratorI.hasNext()) {
                    iZ = z(afecVar2, (Object[]) listIteratorI.next(), 32, iZ, ntnVar, arrayList2, arrayList);
                    afecVar2 = afecVar;
                }
                int iZ2 = z(afecVar, this.c, iG, iZ, ntnVar, arrayList2, arrayList);
                Object obj = ntnVar.a;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                woy.cE(objArr, null, iZ2, 32);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrU = this.b;
                if (zIsEmpty) {
                    objArrU.getClass();
                } else {
                    objArrU = u(objArrU, iPreviousIndex, this.a, arrayList.iterator());
                }
                int size = iPreviousIndex + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    bxc.a("invalid size");
                }
                if (size == 0) {
                    this.a = 0;
                } else {
                    int i2 = size - 1;
                    while (true) {
                        i = this.a;
                        if ((i2 >> i) != 0) {
                            break;
                        }
                        this.a = i - 5;
                        Object[] objArr2 = objArrU[0];
                        objArr2.getClass();
                        objArrU = objArr2;
                    }
                    objArrT = t(objArrU, i2, i);
                }
                this.b = objArrT;
                this.c = objArr;
                this.d = size + iZ2;
            }
            z = true;
        } else if (B(afecVar2, iG, ntnVar) != iG) {
            z = true;
        }
        if (z) {
            this.modCount++;
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        Object[] objArr;
        a.aG(i, this.d);
        if (f() <= i) {
            objArr = this.c;
        } else {
            Object[] objArr2 = this.b;
            objArr2.getClass();
            for (int i2 = this.a; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[(i >> i2) & 31];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return (E) objArr[i & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        a.aH(i, this.d);
        return new cbn(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return e(new bji(collection, 18));
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        a.aG(i, this.d);
        if (f() > i) {
            ntn ntnVar = new ntn(null, null);
            Object[] objArr = this.b;
            objArr.getClass();
            this.b = F(objArr, this.a, i, e, ntnVar);
            return (E) ntnVar.a;
        }
        Object[] objArrP = p(this.c);
        if (objArrP != this.c) {
            this.modCount++;
        }
        int i2 = i & 31;
        E e2 = (E) objArrP[i2];
        objArrP[i2] = e;
        this.c = objArrP;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        this.modCount++;
        int iG = g();
        if (iG < 32) {
            Object[] objArrP = p(this.c);
            objArrP[iG] = e;
            this.c = objArrP;
            this.d++;
        } else {
            m(this.b, this.c, s(e));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int iG = g();
        Iterator<? extends E> it = collection.iterator();
        if (32 - iG >= collection.size()) {
            Object[] objArrP = p(this.c);
            x(objArrP, iG, it);
            this.c = objArrP;
            this.d += collection.size();
        } else {
            int size = ((collection.size() + iG) - 1) / 32;
            Object[][] objArr = new Object[size][];
            Object[] objArrP2 = p(this.c);
            x(objArrP2, iG, it);
            objArr[0] = objArrP2;
            for (int i = 1; i < size; i++) {
                Object[] objArrR = r();
                x(objArrR, 0, it);
                objArr[i] = objArrR;
            }
            this.b = v(this.b, f(), objArr);
            Object[] objArrR2 = r();
            x(objArrR2, 0, it);
            this.c = objArrR2;
            this.d += collection.size();
        }
        return true;
    }
}
