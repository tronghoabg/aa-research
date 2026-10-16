package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cbr<E> extends defpackage.afbu<E> implements java.util.List, java.util.Collection, defpackage.afhd {
    public int a;
    public java.lang.Object[] b;
    public java.lang.Object[] c;
    public int d;
    private defpackage.cbl e;
    private java.lang.Object[] f;
    private java.lang.Object[] g;
    private defpackage.bzo h = new defpackage.bzo();

    public cbr(defpackage.cbl cblVar, java.lang.Object[] objArr, java.lang.Object[] objArr2, int i) {
        this.e = cblVar;
        this.f = objArr;
        this.g = objArr2;
        this.a = i;
        this.b = this.f;
        this.c = this.g;
        this.d = this.e.size();
    }

    private final int A(defpackage.affc affcVar, java.lang.Object[] objArr, int i, defpackage.nub nubVar) {
        java.lang.Object[] objArrP = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            java.lang.Object obj = objArr[i3];
            if (((java.lang.Boolean) affcVar.invoke(obj)).booleanValue()) {
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
        nubVar.a = objArrP;
        return i2;
    }

    private final int B(defpackage.affc affcVar, int i, defpackage.nub nubVar) {
        int iA = A(affcVar, this.c, i, nubVar);
        if (iA == i) {
            return i;
        }
        java.lang.Object obj = nubVar.a;
        obj.getClass();
        java.lang.Object[] objArr = (java.lang.Object[]) obj;
        defpackage.afga.by(objArr, null, iA, i);
        this.c = objArr;
        this.d -= i - iA;
        return iA;
    }

    private final java.lang.Object[] C(java.lang.Object[] objArr, int i, int i2, java.lang.Object obj, defpackage.nub nubVar) {
        java.lang.Object obj2;
        int i3 = (i2 >> i) & 31;
        int i4 = i3 + 1;
        if (i == 0) {
            nubVar.a = objArr[31];
            java.lang.Object[] objArrP = p(objArr);
            defpackage.afga.ck(objArr, objArrP, i4, i3, 31);
            objArrP[i3] = obj;
            return objArrP;
        }
        java.lang.Object[] objArrP2 = p(objArr);
        int i5 = i - 5;
        java.lang.Object obj3 = objArrP2[i3];
        obj3.getClass();
        objArrP2[i3] = C((java.lang.Object[]) obj3, i5, i2, obj, nubVar);
        while (i4 < 32 && (obj2 = objArrP2[i4]) != null) {
            objArrP2[i4] = C((java.lang.Object[]) obj2, i5, 0, nubVar.a, nubVar);
            i4++;
        }
        return objArrP2;
    }

    private final java.lang.Object[] D(java.lang.Object[] objArr, int i, int i2, defpackage.nub nubVar) {
        java.lang.Object[] objArrD;
        int i3 = ((i2 - 1) >> i) & 31;
        if (i == 5) {
            nubVar.a = objArr[i3];
            objArrD = null;
        } else {
            java.lang.Object obj = objArr[i3];
            obj.getClass();
            objArrD = D((java.lang.Object[]) obj, i - 5, i2, nubVar);
        }
        if (objArrD == null && i3 == 0) {
            return null;
        }
        java.lang.Object[] objArrP = p(objArr);
        objArrP[i3] = objArrD;
        return objArrP;
    }

    private final java.lang.Object[] E(java.lang.Object[] objArr, int i, int i2, defpackage.nub nubVar) {
        int i3 = (i2 >> i) & 31;
        int i4 = i3 + 1;
        if (i == 0) {
            java.lang.Object obj = objArr[i3];
            java.lang.Object[] objArrP = p(objArr);
            defpackage.afga.ck(objArr, objArrP, i3, i4, 32);
            objArrP[31] = nubVar.a;
            nubVar.a = obj;
            return objArrP;
        }
        int iF = objArr[31] == null ? 31 & ((f() - 1) >> i) : 31;
        java.lang.Object[] objArrP2 = p(objArr);
        int i5 = i - 5;
        if (i4 <= iF) {
            while (true) {
                java.lang.Object obj2 = objArrP2[iF];
                obj2.getClass();
                objArrP2[iF] = E((java.lang.Object[]) obj2, i5, 0, nubVar);
                if (iF == i4) {
                    break;
                }
                iF--;
            }
        }
        java.lang.Object obj3 = objArrP2[i3];
        obj3.getClass();
        objArrP2[i3] = E((java.lang.Object[]) obj3, i5, i2, nubVar);
        return objArrP2;
    }

    private final java.lang.Object[] F(java.lang.Object[] objArr, int i, int i2, java.lang.Object obj, defpackage.nub nubVar) {
        java.lang.Object[] objArrP = p(objArr);
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            if (objArrP != objArr) {
                this.modCount++;
            }
            nubVar.a = objArrP[i3];
            objArrP[i3] = obj;
            return objArrP;
        }
        java.lang.Object obj2 = objArrP[i3];
        obj2.getClass();
        objArrP[i3] = F((java.lang.Object[]) obj2, i - 5, i2, obj, nubVar);
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

    private final java.lang.Object h(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = this.d - i;
        java.lang.Object[] objArr2 = this.c;
        if (i4 == 1) {
            java.lang.Object obj = objArr2[0];
            l(objArr, i, i2);
            return obj;
        }
        java.lang.Object obj2 = objArr2[i3];
        java.lang.Object[] objArrP = p(objArr2);
        defpackage.afga.ck(objArr2, objArrP, i3, i3 + 1, i4);
        objArrP[i4 - 1] = null;
        this.b = objArr;
        this.c = objArrP;
        this.d = (i + i4) - 1;
        this.a = i2;
        return obj2;
    }

    private final java.util.ListIterator i(int i) {
        java.lang.Object[] objArr = this.b;
        if (objArr == null) {
            throw new java.lang.IllegalStateException("Invalid root");
        }
        int iF = f() >> 5;
        defpackage.a.aG(i, iF);
        int i2 = this.a;
        return i2 == 0 ? new defpackage.cbu(objArr, i) : new defpackage.cbw(objArr, i, iF, i2 / 5);
    }

    private final void j(java.util.Collection collection, int i, int i2, java.lang.Object[][] objArr, int i3, java.lang.Object[] objArr2) {
        java.lang.Object[] objArr3;
        java.lang.Object[] objArr4 = this.b;
        if (objArr4 == null) {
            throw new java.lang.IllegalStateException("root is null");
        }
        int i4 = i >> 5;
        if (objArr4 == null) {
            throw new java.lang.IllegalStateException("root is null");
        }
        java.util.ListIterator listIteratorI = i(f() >> 5);
        java.lang.Object[] objArrQ = objArr2;
        int i5 = i3;
        while (listIteratorI.previousIndex() != i4) {
            java.lang.Object[] objArr5 = (java.lang.Object[]) listIteratorI.previous();
            defpackage.afga.ck(objArr5, objArrQ, 0, 32 - i2, 32);
            objArrQ = q(objArr5, i2);
            i5--;
            objArr[i5] = objArrQ;
        }
        java.lang.Object[] objArr6 = (java.lang.Object[]) listIteratorI.previous();
        int iF = i3 - (((f() >> 5) - 1) - i4);
        if (iF < i3) {
            java.lang.Object[] objArr7 = objArr[iF];
            objArr7.getClass();
            objArr3 = objArr7;
        } else {
            objArr3 = objArr2;
        }
        n(collection, i, objArr6, 32, objArr, iF, objArr3);
    }

    private final void k(java.lang.Object[] objArr, int i, java.lang.Object obj) {
        int iG = g();
        java.lang.Object[] objArrP = p(this.c);
        int i2 = i + 1;
        java.lang.Object[] objArr2 = this.c;
        if (iG >= 32) {
            java.lang.Object obj2 = objArr2[31];
            defpackage.afga.ck(objArr2, objArrP, i2, i, 31);
            objArrP[i] = obj;
            m(objArr, objArrP, s(obj2));
            return;
        }
        defpackage.afga.ck(objArr2, objArrP, i2, i, iG);
        objArrP[i] = obj;
        this.b = objArr;
        this.c = objArrP;
        this.d++;
    }

    private final void l(java.lang.Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.b = null;
            if (objArr == null) {
                objArr = new java.lang.Object[0];
            }
            this.c = objArr;
            this.d = i;
            this.a = 0;
            return;
        }
        defpackage.nub nubVar = new defpackage.nub(null, null);
        objArr.getClass();
        java.lang.Object[] objArrD = D(objArr, i2, i, nubVar);
        objArrD.getClass();
        java.lang.Object obj = nubVar.a;
        obj.getClass();
        this.c = (java.lang.Object[]) obj;
        this.d = i;
        if (objArrD[1] == null) {
            this.b = (java.lang.Object[]) objArrD[0];
            this.a = i2 - 5;
        } else {
            this.b = objArrD;
            this.a = i2;
        }
    }

    private final void m(java.lang.Object[] objArr, java.lang.Object[] objArr2, java.lang.Object[] objArr3) {
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

    private final void n(java.util.Collection collection, int i, java.lang.Object[] objArr, int i2, java.lang.Object[][] objArr2, int i3, java.lang.Object[] objArr3) {
        java.lang.Object[] objArrR;
        if (i3 <= 0) {
            defpackage.bxi.a("requires at least one nullBuffer");
        }
        java.lang.Object[] objArrP = p(objArr);
        objArr2[0] = objArrP;
        int i4 = i & 31;
        int size = ((i + collection.size()) - 1) & 31;
        int i5 = (i2 - i4) + size;
        int i6 = size + 1;
        if (i5 < 32) {
            defpackage.afga.ck(objArrP, objArr3, i6, i4, i2);
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
            defpackage.afga.ck(objArrP, objArr3, 0, i8, i2);
            defpackage.afga.ck(objArrP, objArrR, i6, i4, i8);
            objArr3 = objArrR;
        }
        java.util.Iterator<E> it = collection.iterator();
        x(objArrP, i4, it);
        for (int i9 = 1; i9 < i3; i9++) {
            java.lang.Object[] objArrR2 = r();
            x(objArrR2, 0, it);
            objArr2[i9] = objArrR2;
        }
        x(objArr3, 0, it);
    }

    private final boolean o(java.lang.Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.h;
    }

    private final java.lang.Object[] p(java.lang.Object[] objArr) {
        if (objArr == null) {
            return r();
        }
        if (o(objArr)) {
            return objArr;
        }
        java.lang.Object[] objArrR = r();
        defpackage.afga.cv(objArr, objArrR, 0, defpackage.afqt.f(objArr.length, 32), 6);
        return objArrR;
    }

    private final java.lang.Object[] q(java.lang.Object[] objArr, int i) {
        int i2 = 32 - i;
        if (o(objArr)) {
            defpackage.afga.ck(objArr, objArr, i, 0, i2);
            return objArr;
        }
        java.lang.Object[] objArrR = r();
        defpackage.afga.ck(objArr, objArrR, i, 0, i2);
        return objArrR;
    }

    private final java.lang.Object[] r() {
        java.lang.Object[] objArr = new java.lang.Object[33];
        objArr[32] = this.h;
        return objArr;
    }

    private final java.lang.Object[] s(java.lang.Object obj) {
        java.lang.Object[] objArr = new java.lang.Object[33];
        objArr[0] = obj;
        objArr[32] = this.h;
        return objArr;
    }

    private final java.lang.Object[] t(java.lang.Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            defpackage.bxi.a("shift should be positive");
        }
        if (i2 != 0) {
            int i3 = (i >> i2) & 31;
            java.lang.Object obj = objArr[i3];
            obj.getClass();
            java.lang.Object objT = t((java.lang.Object[]) obj, i, i2 - 5);
            if (i3 < 31) {
                int i4 = i3 + 1;
                if (objArr[i4] != null) {
                    if (o(objArr)) {
                        defpackage.afga.by(objArr, null, i4, 32);
                    }
                    java.lang.Object[] objArrR = r();
                    defpackage.afga.ck(objArr, objArrR, 0, 0, i4);
                    objArr = objArrR;
                }
            }
            if (objT != objArr[i3]) {
                java.lang.Object[] objArrP = p(objArr);
                objArrP[i3] = objT;
                return objArrP;
            }
        }
        return objArr;
    }

    private final java.lang.Object[] u(java.lang.Object[] objArr, int i, int i2, java.util.Iterator it) {
        if (!it.hasNext()) {
            defpackage.bxi.a("invalid buffersIterator");
        }
        if (i2 < 0) {
            defpackage.bxi.a("negative shift");
        }
        if (i2 == 0) {
            return (java.lang.Object[]) it.next();
        }
        java.lang.Object[] objArrP = p(objArr);
        int i3 = (i >> i2) & 31;
        int i4 = i2 - 5;
        objArrP[i3] = u((java.lang.Object[]) objArrP[i3], i, i4, it);
        while (true) {
            i3++;
            if (i3 >= 32 || !it.hasNext()) {
                break;
            }
            objArrP[i3] = u((java.lang.Object[]) objArrP[i3], 0, i4, it);
        }
        return objArrP;
    }

    private final java.lang.Object[] v(java.lang.Object[] objArr, int i, java.lang.Object[][] objArr2) {
        java.util.Iterator itC = defpackage.affz.c(objArr2);
        int i2 = this.a;
        java.lang.Object[] objArrU = (i >> 5) < (1 << i2) ? u(objArr, i, i2, itC) : p(objArr);
        while (itC.hasNext()) {
            this.a += 5;
            objArrU = s(objArrU);
            int i3 = this.a;
            u(objArrU, 1 << i3, i3, itC);
        }
        return objArrU;
    }

    private final java.lang.Object[] w(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i) {
        int i2 = (this.d - 1) >> i;
        java.lang.Object[] objArrP = p(objArr);
        int i3 = i2 & 31;
        if (i == 5) {
            objArrP[i3] = objArr2;
            return objArrP;
        }
        objArrP[i3] = w((java.lang.Object[]) objArrP[i3], objArr2, i - 5);
        return objArrP;
    }

    private static final void x(java.lang.Object[] objArr, int i, java.util.Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    private static final int y(int i) {
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int z(defpackage.affc affcVar, java.lang.Object[] objArr, int i, int i2, defpackage.nub nubVar, java.util.List list, java.util.List list2) {
        if (o(objArr)) {
            list.add(objArr);
        }
        java.lang.Object obj = nubVar.a;
        obj.getClass();
        java.lang.Object[] objArr2 = (java.lang.Object[]) obj;
        java.lang.Object[] objArrR = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            java.lang.Object obj2 = objArr[i3];
            if (!((java.lang.Boolean) affcVar.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrR = !list.isEmpty() ? (java.lang.Object[]) list.remove(list.size() - 1) : r();
                    i2 = 0;
                }
                objArrR[i2] = obj2;
                i2++;
            }
        }
        nubVar.a = objArrR;
        if (objArr2 != nubVar.a) {
            list2.add(objArr2);
        }
        return i2;
    }

    public final int a() {
        return this.modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        defpackage.a.aG(i, this.d);
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
        defpackage.nub nubVar = new defpackage.nub(null, null);
        java.lang.Object[] objArr = this.b;
        objArr.getClass();
        k(C(objArr, this.a, i, e, nubVar), 0, nubVar.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, java.util.Collection<? extends E> collection) {
        defpackage.cbr<E> cbrVar;
        java.util.Collection<? extends E> collection2;
        java.lang.Object[] objArrR;
        java.lang.Object[][] objArr;
        defpackage.a.aG(i, this.d);
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
            java.lang.Object[] objArr2 = this.c;
            java.lang.Object[] objArrP = p(objArr2);
            defpackage.afga.ck(objArr2, objArrP, (size2 & 31) + 1, i3, g());
            x(objArrP, i3, collection.iterator());
            this.c = objArrP;
            this.d += collection.size();
            return true;
        }
        java.lang.Object[][] objArr3 = new java.lang.Object[size][];
        int iG = g();
        int size3 = this.d + collection.size();
        if (i >= f()) {
            objArrR = r();
            objArr = objArr3;
            cbrVar = this;
            collection2 = collection;
            cbrVar.n(collection2, i, this.c, iG, objArr, size, objArrR);
        } else {
            cbrVar = this;
            collection2 = collection;
            int iY = y(size3);
            java.lang.Object[] objArr4 = cbrVar.c;
            if (iY > iG) {
                int i4 = iY - iG;
                java.lang.Object[] objArrQ = cbrVar.q(objArr4, i4);
                cbrVar.j(collection2, i, i4, objArr3, size, objArrQ);
                objArr = objArr3;
                objArrR = objArrQ;
            } else {
                objArrR = cbrVar.r();
                int i5 = iG - iY;
                defpackage.afga.ck(objArr4, objArrR, 0, i5, iG);
                int i6 = 32 - i5;
                java.lang.Object[] objArrQ2 = cbrVar.q(cbrVar.c, i6);
                int i7 = size - 1;
                objArr3[i7] = objArrQ2;
                cbrVar.j(collection2, i, i6, objArr3, i7, objArrQ2);
                collection2 = collection2;
                objArr = objArr3;
                cbrVar = cbrVar;
            }
        }
        cbrVar.b = cbrVar.v(cbrVar.b, i2, objArr);
        cbrVar.c = objArrR;
        cbrVar.d += collection2.size();
        return true;
    }

    @Override // defpackage.afbu
    public final int b() {
        return this.d;
    }

    public final defpackage.cbl c() {
        defpackage.cbl cbqVar;
        java.lang.Object[] objArr = this.b;
        if (objArr == this.f && this.c == this.g) {
            cbqVar = this.e;
        } else {
            this.h = new defpackage.bzo();
            this.f = objArr;
            java.lang.Object[] objArr2 = this.c;
            this.g = objArr2;
            if (objArr != null) {
                cbqVar = new defpackage.cbq(objArr, objArr2, this.d, this.a);
            } else if (objArr2.length == 0) {
                cbqVar = defpackage.cbv.a;
            } else {
                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.c, this.d);
                objArrCopyOf.getClass();
                cbqVar = new defpackage.cbv(objArrCopyOf);
            }
        }
        this.e = cbqVar;
        return cbqVar;
    }

    @Override // defpackage.afbu
    public final java.lang.Object d(int i) {
        defpackage.a.aF(i, this.d);
        this.modCount++;
        int iF = f();
        if (i >= iF) {
            return h(this.b, iF, this.a, i - iF);
        }
        defpackage.nub nubVar = new defpackage.nub(this.c[0], null);
        java.lang.Object[] objArr = this.b;
        objArr.getClass();
        h(E(objArr, this.a, i, nubVar), iF, this.a, 0);
        return nubVar.a;
    }

    public final boolean e(defpackage.affc affcVar) {
        int i;
        defpackage.affc affcVar2 = affcVar;
        int iG = g();
        java.lang.Object[] objArrT = null;
        defpackage.nub nubVar = new defpackage.nub(null, null);
        boolean z = false;
        if (this.b != null) {
            java.util.ListIterator listIteratorI = i(0);
            int iA = 32;
            while (iA == 32) {
                if (!listIteratorI.hasNext()) {
                    iA = 32;
                    break;
                }
                iA = A(affcVar2, (java.lang.Object[]) listIteratorI.next(), 32, nubVar);
            }
            if (iA == 32) {
                listIteratorI.hasNext();
                int iB = B(affcVar2, iG, nubVar);
                if (iB == 0) {
                    l(this.b, this.d, this.a);
                    iB = 0;
                }
                if (iB != iG) {
                }
            } else {
                int iPreviousIndex = listIteratorI.previousIndex() << 5;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                int iZ = iA;
                while (listIteratorI.hasNext()) {
                    iZ = z(affcVar2, (java.lang.Object[]) listIteratorI.next(), 32, iZ, nubVar, arrayList2, arrayList);
                    affcVar2 = affcVar;
                }
                int iZ2 = z(affcVar, this.c, iG, iZ, nubVar, arrayList2, arrayList);
                java.lang.Object obj = nubVar.a;
                obj.getClass();
                java.lang.Object[] objArr = (java.lang.Object[]) obj;
                defpackage.afga.by(objArr, null, iZ2, 32);
                boolean zIsEmpty = arrayList.isEmpty();
                java.lang.Object[] objArrU = this.b;
                if (zIsEmpty) {
                    objArrU.getClass();
                } else {
                    objArrU = u(objArrU, iPreviousIndex, this.a, arrayList.iterator());
                }
                int size = iPreviousIndex + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    defpackage.bxi.a("invalid size");
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
                        java.lang.Object[] objArr2 = objArrU[0];
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
        } else if (B(affcVar2, iG, nubVar) != iG) {
            z = true;
        }
        if (z) {
            this.modCount++;
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        java.lang.Object[] objArr;
        defpackage.a.aF(i, this.d);
        if (f() <= i) {
            objArr = this.c;
        } else {
            java.lang.Object[] objArr2 = this.b;
            objArr2.getClass();
            for (int i2 = this.a; i2 > 0; i2 -= 5) {
                java.lang.Object[] objArr3 = objArr2[(i >> i2) & 31];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return (E) objArr[i & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator<E> listIterator(int i) {
        defpackage.a.aG(i, this.d);
        return new defpackage.cbt(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection collection) {
        return e(new defpackage.bjm(collection, 17));
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        defpackage.a.aF(i, this.d);
        if (f() > i) {
            defpackage.nub nubVar = new defpackage.nub(null, null);
            java.lang.Object[] objArr = this.b;
            objArr.getClass();
            this.b = F(objArr, this.a, i, e, nubVar);
            return (E) nubVar.a;
        }
        java.lang.Object[] objArrP = p(this.c);
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
    public final java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        this.modCount++;
        int iG = g();
        if (iG < 32) {
            java.lang.Object[] objArrP = p(this.c);
            objArrP[iG] = e;
            this.c = objArrP;
            this.d++;
        } else {
            m(this.b, this.c, s(e));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int iG = g();
        java.util.Iterator<? extends E> it = collection.iterator();
        if (32 - iG >= collection.size()) {
            java.lang.Object[] objArrP = p(this.c);
            x(objArrP, iG, it);
            this.c = objArrP;
            this.d += collection.size();
        } else {
            int size = ((collection.size() + iG) - 1) / 32;
            java.lang.Object[][] objArr = new java.lang.Object[size][];
            java.lang.Object[] objArrP2 = p(this.c);
            x(objArrP2, iG, it);
            objArr[0] = objArrP2;
            for (int i = 1; i < size; i++) {
                java.lang.Object[] objArrR = r();
                x(objArrR, 0, it);
                objArr[i] = objArrR;
            }
            this.b = v(this.b, f(), objArr);
            java.lang.Object[] objArrR2 = r();
            x(objArrR2, 0, it);
            this.c = objArrR2;
            this.d += collection.size();
        }
        return true;
    }
}
