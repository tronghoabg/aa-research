package R;

import N.C0718d;
import ff.m;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC3340k;
import tf.l;
import uf.InterfaceC4292b;

/* loaded from: classes.dex */
public final class g extends ff.h implements Collection, InterfaceC4292b {

    /* renamed from: a, reason: collision with root package name */
    public c f10019a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f10020b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f10021c;

    /* renamed from: d, reason: collision with root package name */
    public int f10022d;

    /* renamed from: e, reason: collision with root package name */
    public U.b f10023e = new U.b();

    /* renamed from: f, reason: collision with root package name */
    public Object[] f10024f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f10025g;

    /* renamed from: h, reason: collision with root package name */
    public int f10026h;

    public g(c cVar, Object[] objArr, Object[] objArr2, int i5) {
        this.f10019a = cVar;
        this.f10020b = objArr;
        this.f10021c = objArr2;
        this.f10022d = i5;
        this.f10024f = objArr;
        this.f10025g = objArr2;
        this.f10026h = cVar.size();
    }

    public static void e(Object[] objArr, int i5, Iterator it) {
        while (i5 < 32 && it.hasNext()) {
            objArr[i5] = it.next();
            i5++;
        }
    }

    public final boolean A(l lVar) {
        Object[] objArrS;
        int i5;
        l lVar2 = lVar;
        int iH = H();
        Object[] objArrP = null;
        e eVar = new e(null);
        boolean z2 = false;
        if (this.f10024f != null) {
            a aVarK = k(0);
            int iX = 32;
            while (iX == 32 && aVarK.hasNext()) {
                iX = x(lVar2, (Object[]) aVarK.next(), 32, eVar);
            }
            if (iX == 32) {
                int iZ = z(lVar2, iH, eVar);
                if (iZ == 0) {
                    r(this.f10024f, this.f10026h, this.f10022d);
                }
                if (iZ != iH) {
                }
            } else {
                int i10 = (aVarK.f10007a - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iW = iX;
                while (aVarK.hasNext()) {
                    iW = w(lVar2, (Object[]) aVarK.next(), 32, iW, eVar, arrayList2, arrayList);
                    lVar2 = lVar;
                }
                int iW2 = w(lVar, this.f10025g, iH, iW, eVar, arrayList2, arrayList);
                Object obj = eVar.f10014a;
                AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iW2, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrS = this.f10024f;
                    AbstractC3340k.b(objArrS);
                } else {
                    objArrS = s(this.f10024f, i10, this.f10022d, arrayList.iterator());
                }
                int size = i10 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    C0718d.O("invalid size");
                    throw null;
                }
                if (size == 0) {
                    this.f10022d = 0;
                } else {
                    int i11 = size - 1;
                    while (true) {
                        i5 = this.f10022d;
                        if ((i11 >> i5) != 0) {
                            break;
                        }
                        this.f10022d = i5 - 5;
                        Object[] objArr2 = objArrS[0];
                        AbstractC3340k.c(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrS = objArr2;
                    }
                    objArrP = p(objArrS, i11, i5);
                }
                this.f10024f = objArrP;
                this.f10025g = objArr;
                this.f10026h = size + iW2;
            }
            z2 = true;
        } else if (z(lVar2, iH, eVar) != iH) {
            z2 = true;
        }
        if (z2) {
            ((AbstractList) this).modCount++;
        }
        return z2;
    }

    public final Object[] B(Object[] objArr, int i5, int i10, e eVar) {
        int iD = ic.d.D(i10, i5);
        if (i5 == 0) {
            Object obj = objArr[iD];
            Object[] objArrL = l(objArr);
            m.h0(objArr, iD, objArrL, iD + 1, 32);
            objArrL[31] = eVar.f10014a;
            eVar.f10014a = obj;
            return objArrL;
        }
        int iD2 = objArr[31] == null ? ic.d.D(E() - 1, i5) : 31;
        Object[] objArrL2 = l(objArr);
        int i11 = i5 - 5;
        int i12 = iD + 1;
        if (i12 <= iD2) {
            while (true) {
                Object obj2 = objArrL2[iD2];
                AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrL2[iD2] = B((Object[]) obj2, i11, 0, eVar);
                if (iD2 == i12) {
                    break;
                }
                iD2--;
            }
        }
        Object obj3 = objArrL2[iD];
        AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrL2[iD] = B((Object[]) obj3, i11, i10, eVar);
        return objArrL2;
    }

    public final Object C(Object[] objArr, int i5, int i10, int i11) {
        int i12 = this.f10026h - i5;
        if (i12 == 1) {
            Object obj = this.f10025g[0];
            r(objArr, i5, i10);
            return obj;
        }
        Object[] objArr2 = this.f10025g;
        Object obj2 = objArr2[i11];
        Object[] objArrL = l(objArr2);
        m.h0(objArr2, i11, objArrL, i11 + 1, i12);
        objArrL[i12 - 1] = null;
        this.f10024f = objArr;
        this.f10025g = objArrL;
        this.f10026h = (i5 + i12) - 1;
        this.f10022d = i10;
        return obj2;
    }

    public final int E() {
        int i5 = this.f10026h;
        if (i5 <= 32) {
            return 0;
        }
        return (i5 - 1) & (-32);
    }

    public final Object[] F(Object[] objArr, int i5, int i10, Object obj, e eVar) {
        int iD = ic.d.D(i10, i5);
        Object[] objArrL = l(objArr);
        if (i5 != 0) {
            Object obj2 = objArrL[iD];
            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrL[iD] = F((Object[]) obj2, i5 - 5, i10, obj, eVar);
            return objArrL;
        }
        if (objArrL != objArr) {
            ((AbstractList) this).modCount++;
        }
        eVar.f10014a = objArrL[iD];
        objArrL[iD] = obj;
        return objArrL;
    }

    public final void G(Collection collection, int i5, Object[] objArr, int i10, Object[][] objArr2, int i11, Object[] objArr3) {
        Object[] objArrN;
        if (i11 < 1) {
            C0718d.O("requires at least one nullBuffer");
            throw null;
        }
        Object[] objArrL = l(objArr);
        objArr2[0] = objArrL;
        int i12 = i5 & 31;
        int size = ((collection.size() + i5) - 1) & 31;
        int i13 = (i10 - i12) + size;
        if (i13 < 32) {
            m.h0(objArrL, size + 1, objArr3, i12, i10);
        } else {
            int i14 = i13 - 31;
            if (i11 == 1) {
                objArrN = objArrL;
            } else {
                objArrN = n();
                i11--;
                objArr2[i11] = objArrN;
            }
            int i15 = i10 - i14;
            m.h0(objArrL, 0, objArr3, i15, i10);
            m.h0(objArrL, size + 1, objArrN, i12, i15);
            objArr3 = objArrN;
        }
        Iterator it = collection.iterator();
        e(objArrL, i12, it);
        for (int i16 = 1; i16 < i11; i16++) {
            Object[] objArrN2 = n();
            e(objArrN2, 0, it);
            objArr2[i16] = objArrN2;
        }
        e(objArr3, 0, it);
    }

    public final int H() {
        int i5 = this.f10026h;
        return i5 <= 32 ? i5 : i5 - ((i5 - 1) & (-32));
    }

    @Override // ff.h
    public final int a() {
        return this.f10026h;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        tg.b.s(i5, a());
        if (i5 == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iE = E();
        if (i5 >= iE) {
            i(obj, this.f10024f, i5 - iE);
            return;
        }
        e eVar = new e(null);
        Object[] objArr = this.f10024f;
        AbstractC3340k.b(objArr);
        i(eVar.f10014a, h(objArr, this.f10022d, i5, obj, eVar), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i5, Collection collection) {
        Collection collection2;
        g gVar;
        Object[] objArrN;
        tg.b.s(i5, this.f10026h);
        if (i5 == this.f10026h) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i10 = (i5 >> 5) << 5;
        int size = ((collection.size() + (this.f10026h - i10)) - 1) / 32;
        if (size == 0) {
            int i11 = i5 & 31;
            int size2 = ((collection.size() + i5) - 1) & 31;
            Object[] objArr = this.f10025g;
            Object[] objArrL = l(objArr);
            m.h0(objArr, size2 + 1, objArrL, i11, H());
            e(objArrL, i11, collection.iterator());
            this.f10025g = objArrL;
            this.f10026h = collection.size() + this.f10026h;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iH = H();
        int size3 = collection.size() + this.f10026h;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i5 >= E()) {
            objArrN = n();
            collection2 = collection;
            G(collection2, i5, this.f10025g, iH, objArr2, size, objArrN);
            gVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            gVar = this;
            if (size3 > iH) {
                int i12 = size3 - iH;
                Object[] objArrM = m(i12, gVar.f10025g);
                gVar.g(collection2, i5, i12, objArr2, size, objArrM);
                objArr2 = objArr2;
                objArrN = objArrM;
            } else {
                Object[] objArr3 = gVar.f10025g;
                objArrN = n();
                int i13 = iH - size3;
                m.h0(objArr3, 0, objArrN, i13, iH);
                int i14 = 32 - i13;
                Object[] objArrM2 = m(i14, gVar.f10025g);
                int i15 = size - 1;
                objArr2[i15] = objArrM2;
                gVar.g(collection2, i5, i14, objArr2, i15, objArrM2);
                collection2 = collection2;
            }
        }
        gVar.f10024f = t(gVar.f10024f, i10, objArr2);
        gVar.f10025g = objArrN;
        gVar.f10026h = collection2.size() + gVar.f10026h;
        return true;
    }

    @Override // ff.h
    public final Object c(int i5) {
        tg.b.q(i5, a());
        ((AbstractList) this).modCount++;
        int iE = E();
        if (i5 >= iE) {
            return C(this.f10024f, iE, this.f10022d, i5 - iE);
        }
        e eVar = new e(this.f10025g[0]);
        Object[] objArr = this.f10024f;
        AbstractC3340k.b(objArr);
        C(B(objArr, this.f10022d, i5, eVar), iE, this.f10022d, 0);
        return eVar.f10014a;
    }

    public final c d() {
        c fVar;
        Object[] objArr = this.f10024f;
        if (objArr == this.f10020b && this.f10025g == this.f10021c) {
            fVar = this.f10019a;
        } else {
            this.f10023e = new U.b();
            this.f10020b = objArr;
            Object[] objArr2 = this.f10025g;
            this.f10021c = objArr2;
            if (objArr != null) {
                fVar = new f(objArr, objArr2, this.f10026h, this.f10022d);
            } else if (objArr2.length == 0) {
                fVar = j.f10033b;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, this.f10026h);
                AbstractC3340k.d(objArrCopyOf, "copyOf(this, newSize)");
                fVar = new j(objArrCopyOf);
            }
        }
        this.f10019a = fVar;
        return fVar;
    }

    public final int f() {
        return ((AbstractList) this).modCount;
    }

    public final void g(Collection collection, int i5, int i10, Object[][] objArr, int i11, Object[] objArr2) {
        if (this.f10024f == null) {
            throw new IllegalStateException("root is null");
        }
        int i12 = i5 >> 5;
        a aVarK = k(E() >> 5);
        int i13 = i11;
        Object[] objArrM = objArr2;
        while (aVarK.f10007a - 1 != i12) {
            Object[] objArr3 = (Object[]) aVarK.previous();
            m.h0(objArr3, 0, objArrM, 32 - i10, 32);
            objArrM = m(i10, objArr3);
            i13--;
            objArr[i13] = objArrM;
        }
        Object[] objArr4 = (Object[]) aVarK.previous();
        int iE = i11 - (((E() >> 5) - 1) - i12);
        if (iE < i11) {
            objArr2 = objArr[iE];
            AbstractC3340k.b(objArr2);
        }
        G(collection, i5, objArr4, 32, objArr, iE, objArr2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        Object[] objArr;
        tg.b.q(i5, a());
        if (E() <= i5) {
            objArr = this.f10025g;
        } else {
            objArr = this.f10024f;
            AbstractC3340k.b(objArr);
            for (int i10 = this.f10022d; i10 > 0; i10 -= 5) {
                Object obj = objArr[ic.d.D(i5, i10)];
                AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i5 & 31];
    }

    public final Object[] h(Object[] objArr, int i5, int i10, Object obj, e eVar) {
        Object obj2;
        int iD = ic.d.D(i10, i5);
        if (i5 == 0) {
            eVar.f10014a = objArr[31];
            Object[] objArrL = l(objArr);
            m.h0(objArr, iD + 1, objArrL, iD, 31);
            objArrL[iD] = obj;
            return objArrL;
        }
        Object[] objArrL2 = l(objArr);
        int i11 = i5 - 5;
        Object obj3 = objArrL2[iD];
        AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrL2[iD] = h((Object[]) obj3, i11, i10, obj, eVar);
        while (true) {
            iD++;
            if (iD >= 32 || (obj2 = objArrL2[iD]) == null) {
                break;
            }
            objArrL2[iD] = h((Object[]) obj2, i11, 0, eVar.f10014a, eVar);
        }
        return objArrL2;
    }

    public final void i(Object obj, Object[] objArr, int i5) {
        int iH = H();
        Object[] objArrL = l(this.f10025g);
        if (iH < 32) {
            m.h0(this.f10025g, i5 + 1, objArrL, i5, iH);
            objArrL[i5] = obj;
            this.f10024f = objArr;
            this.f10025g = objArrL;
            this.f10026h++;
            return;
        }
        Object[] objArr2 = this.f10025g;
        Object obj2 = objArr2[31];
        m.h0(objArr2, i5 + 1, objArrL, i5, 31);
        objArrL[i5] = obj;
        u(objArr, objArrL, o(obj2));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final boolean j(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f10023e;
    }

    public final a k(int i5) {
        Object[] objArr = this.f10024f;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iE = E() >> 5;
        tg.b.s(i5, iE);
        int i10 = this.f10022d;
        return i10 == 0 ? new d(objArr, i5) : new k(objArr, i5, iE, i10 / 5);
    }

    public final Object[] l(Object[] objArr) {
        if (objArr == null) {
            return n();
        }
        if (j(objArr)) {
            return objArr;
        }
        Object[] objArrN = n();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        m.j0(objArr, 0, objArrN, length, 6);
        return objArrN;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i5) {
        tg.b.s(i5, this.f10026h);
        return new i(this, i5);
    }

    public final Object[] m(int i5, Object[] objArr) {
        if (j(objArr)) {
            m.h0(objArr, i5, objArr, 0, 32 - i5);
            return objArr;
        }
        Object[] objArrN = n();
        m.h0(objArr, i5, objArrN, 0, 32 - i5);
        return objArrN;
    }

    public final Object[] n() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f10023e;
        return objArr;
    }

    public final Object[] o(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f10023e;
        return objArr;
    }

    public final Object[] p(Object[] objArr, int i5, int i10) {
        if (!(i10 >= 0)) {
            C0718d.O("shift should be positive");
            throw null;
        }
        if (i10 == 0) {
            return objArr;
        }
        int iD = ic.d.D(i5, i10);
        Object obj = objArr[iD];
        AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objP = p((Object[]) obj, i5, i10 - 5);
        if (iD < 31) {
            int i11 = iD + 1;
            if (objArr[i11] != null) {
                if (j(objArr)) {
                    Arrays.fill(objArr, i11, 32, (Object) null);
                }
                Object[] objArrN = n();
                m.h0(objArr, 0, objArrN, 0, i11);
                objArr = objArrN;
            }
        }
        if (objP == objArr[iD]) {
            return objArr;
        }
        Object[] objArrL = l(objArr);
        objArrL[iD] = objP;
        return objArrL;
    }

    public final Object[] q(Object[] objArr, int i5, int i10, e eVar) {
        Object[] objArrQ;
        int iD = ic.d.D(i10 - 1, i5);
        if (i5 == 5) {
            eVar.f10014a = objArr[iD];
            objArrQ = null;
        } else {
            Object obj = objArr[iD];
            AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrQ = q((Object[]) obj, i5 - 5, i10, eVar);
        }
        if (objArrQ == null && iD == 0) {
            return null;
        }
        Object[] objArrL = l(objArr);
        objArrL[iD] = objArrQ;
        return objArrL;
    }

    public final void r(Object[] objArr, int i5, int i10) {
        if (i10 == 0) {
            this.f10024f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f10025g = objArr;
            this.f10026h = i5;
            this.f10022d = i10;
            return;
        }
        e eVar = new e(null);
        AbstractC3340k.b(objArr);
        Object[] objArrQ = q(objArr, i10, i5, eVar);
        AbstractC3340k.b(objArrQ);
        Object obj = eVar.f10014a;
        AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f10025g = (Object[]) obj;
        this.f10026h = i5;
        if (objArrQ[1] == null) {
            this.f10024f = (Object[]) objArrQ[0];
            this.f10022d = i10 - 5;
        } else {
            this.f10024f = objArrQ;
            this.f10022d = i10;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return A(new b(1, collection));
    }

    public final Object[] s(Object[] objArr, int i5, int i10, Iterator it) {
        if (!it.hasNext()) {
            C0718d.O("invalid buffersIterator");
            throw null;
        }
        if (!(i10 >= 0)) {
            C0718d.O("negative shift");
            throw null;
        }
        if (i10 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrL = l(objArr);
        int iD = ic.d.D(i5, i10);
        int i11 = i10 - 5;
        objArrL[iD] = s((Object[]) objArrL[iD], i5, i11, it);
        while (true) {
            iD++;
            if (iD >= 32 || !it.hasNext()) {
                break;
            }
            objArrL[iD] = s((Object[]) objArrL[iD], 0, i11, it);
        }
        return objArrL;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        tg.b.q(i5, a());
        if (E() > i5) {
            e eVar = new e(null);
            Object[] objArr = this.f10024f;
            AbstractC3340k.b(objArr);
            this.f10024f = F(objArr, this.f10022d, i5, obj, eVar);
            return eVar.f10014a;
        }
        Object[] objArrL = l(this.f10025g);
        if (objArrL != this.f10025g) {
            ((AbstractList) this).modCount++;
        }
        int i10 = i5 & 31;
        Object obj2 = objArrL[i10];
        objArrL[i10] = obj;
        this.f10025g = objArrL;
        return obj2;
    }

    public final Object[] t(Object[] objArr, int i5, Object[][] objArr2) {
        Uf.h hVarI = AbstractC3340k.i(objArr2);
        int i10 = i5 >> 5;
        int i11 = this.f10022d;
        Object[] objArrS = i10 < (1 << i11) ? s(objArr, i5, i11, hVarI) : l(objArr);
        while (hVarI.hasNext()) {
            this.f10022d += 5;
            objArrS = o(objArrS);
            int i12 = this.f10022d;
            s(objArrS, 1 << i12, i12, hVarI);
        }
        return objArrS;
    }

    public final void u(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i5 = this.f10026h;
        int i10 = i5 >> 5;
        int i11 = this.f10022d;
        if (i10 > (1 << i11)) {
            this.f10024f = v(o(objArr), objArr2, this.f10022d + 5);
            this.f10025g = objArr3;
            this.f10022d += 5;
            this.f10026h++;
            return;
        }
        if (objArr == null) {
            this.f10024f = objArr2;
            this.f10025g = objArr3;
            this.f10026h = i5 + 1;
        } else {
            this.f10024f = v(objArr, objArr2, i11);
            this.f10025g = objArr3;
            this.f10026h++;
        }
    }

    public final Object[] v(Object[] objArr, Object[] objArr2, int i5) {
        int iD = ic.d.D(a() - 1, i5);
        Object[] objArrL = l(objArr);
        if (i5 == 5) {
            objArrL[iD] = objArr2;
            return objArrL;
        }
        objArrL[iD] = v((Object[]) objArrL[iD], objArr2, i5 - 5);
        return objArrL;
    }

    public final int w(l lVar, Object[] objArr, int i5, int i10, e eVar, ArrayList arrayList, ArrayList arrayList2) {
        if (j(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = eVar.f10014a;
        AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrN = objArr2;
        for (int i11 = 0; i11 < i5; i11++) {
            Object obj2 = objArr[i11];
            if (!((Boolean) lVar.invoke(obj2)).booleanValue()) {
                if (i10 == 32) {
                    objArrN = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : n();
                    i10 = 0;
                }
                objArrN[i10] = obj2;
                i10++;
            }
        }
        eVar.f10014a = objArrN;
        if (objArr2 != objArrN) {
            arrayList2.add(objArr2);
        }
        return i10;
    }

    public final int x(l lVar, Object[] objArr, int i5, e eVar) {
        Object[] objArrL = objArr;
        int i10 = i5;
        boolean z2 = false;
        for (int i11 = 0; i11 < i5; i11++) {
            Object obj = objArr[i11];
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                if (!z2) {
                    objArrL = l(objArr);
                    z2 = true;
                    i10 = i11;
                }
            } else if (z2) {
                objArrL[i10] = obj;
                i10++;
            }
        }
        eVar.f10014a = objArrL;
        return i10;
    }

    public final int z(l lVar, int i5, e eVar) {
        int iX = x(lVar, this.f10025g, i5, eVar);
        if (iX == i5) {
            return i5;
        }
        Object obj = eVar.f10014a;
        AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iX, i5, (Object) null);
        this.f10025g = objArr;
        this.f10026h -= i5 - iX;
        return iX;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iH = H();
        if (iH < 32) {
            Object[] objArrL = l(this.f10025g);
            objArrL[iH] = obj;
            this.f10025g = objArrL;
            this.f10026h = a() + 1;
        } else {
            u(this.f10024f, this.f10025g, o(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iH = H();
        Iterator it = collection.iterator();
        if (32 - iH >= collection.size()) {
            Object[] objArrL = l(this.f10025g);
            e(objArrL, iH, it);
            this.f10025g = objArrL;
            this.f10026h = collection.size() + this.f10026h;
            return true;
        }
        int size = ((collection.size() + iH) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrL2 = l(this.f10025g);
        e(objArrL2, iH, it);
        objArr[0] = objArrL2;
        for (int i5 = 1; i5 < size; i5++) {
            Object[] objArrN = n();
            e(objArrN, 0, it);
            objArr[i5] = objArrN;
        }
        this.f10024f = t(this.f10024f, E(), objArr);
        Object[] objArrN2 = n();
        e(objArrN2, 0, it);
        this.f10025g = objArrN2;
        this.f10026h = collection.size() + this.f10026h;
        return true;
    }
}
