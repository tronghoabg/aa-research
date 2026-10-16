package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cbq<E> extends defpackage.cbo<E> implements j$.util.List<E>, defpackage.cbl {
    private final java.lang.Object[] a;
    private final java.lang.Object[] b;
    private final int c;
    private final int d;

    public cbq(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i, int i2) {
        this.a = objArr;
        this.b = objArr2;
        this.c = i;
        this.d = i2;
        if (i <= 32) {
            defpackage.bxi.a(defpackage.a.bo(i, "Trie-based persistent vector should have at least 33 elements, got "));
        }
        int length = objArr2.length;
    }

    private final int l() {
        return (this.c - 1) & (-32);
    }

    private final defpackage.cbl m(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = this.c - i;
        if (i4 != 1) {
            java.lang.Object[] objArr2 = this.b;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr2, 32);
            objArrCopyOf.getClass();
            int i5 = i4 - 1;
            if (i3 < i5) {
                defpackage.afga.ck(objArr2, objArrCopyOf, i3, i3 + 1, i4);
            }
            objArrCopyOf[i5] = null;
            return new defpackage.cbq(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = java.util.Arrays.copyOf(objArr, 32);
                objArr.getClass();
            }
            return new defpackage.cbv(objArr);
        }
        defpackage.nub nubVar = new defpackage.nub(null, null);
        java.lang.Object[] objArrS = s(objArr, i2, i - 1, nubVar);
        objArrS.getClass();
        java.lang.Object obj = nubVar.a;
        obj.getClass();
        java.lang.Object[] objArr3 = (java.lang.Object[]) obj;
        if (objArrS[1] != null) {
            return new defpackage.cbq(objArrS, objArr3, i, i2);
        }
        java.lang.Object obj2 = objArrS[0];
        obj2.getClass();
        return new defpackage.cbq((java.lang.Object[]) obj2, objArr3, i, i2 - 5);
    }

    private final defpackage.cbq n(java.lang.Object[] objArr, int i, java.lang.Object obj) {
        int i2 = this.c;
        int iL = i2 - l();
        java.lang.Object[] objArr2 = this.b;
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr2, 32);
        objArrCopyOf.getClass();
        int i3 = i + 1;
        if (iL < 32) {
            defpackage.afga.ck(objArr2, objArrCopyOf, i3, i, iL);
            objArrCopyOf[i] = obj;
            return new defpackage.cbq(objArr, objArrCopyOf, i2 + 1, this.d);
        }
        java.lang.Object obj2 = objArr2[31];
        defpackage.afga.ck(objArr2, objArrCopyOf, i3, i, iL - 1);
        objArrCopyOf[i] = obj;
        return o(objArr, objArrCopyOf, defpackage.dai.at(obj2));
    }

    private final defpackage.cbq o(java.lang.Object[] objArr, java.lang.Object[] objArr2, java.lang.Object[] objArr3) {
        int i = this.c;
        int i2 = i + 1;
        int i3 = this.d;
        if ((i >> 5) <= (1 << i3)) {
            return new defpackage.cbq(p(objArr, i3, objArr2), objArr3, i2, i3);
        }
        int i4 = i3 + 5;
        return new defpackage.cbq(p(defpackage.dai.at(objArr), i4, objArr2), objArr3, i2, i4);
    }

    private final java.lang.Object[] p(java.lang.Object[] objArr, int i, java.lang.Object[] objArr2) {
        java.lang.Object[] objArrCopyOf;
        if (objArr != null) {
            objArrCopyOf = java.util.Arrays.copyOf(objArr, 32);
            objArrCopyOf.getClass();
        } else {
            objArrCopyOf = new java.lang.Object[32];
        }
        int i2 = ((this.c - 1) >> i) & 31;
        if (i == 5) {
            objArrCopyOf[i2] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[i2] = p((java.lang.Object[]) objArrCopyOf[i2], i - 5, objArr2);
        return objArrCopyOf;
    }

    private final java.lang.Object[] q(java.lang.Object[] objArr, int i, int i2, java.lang.Object obj) {
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, 32);
        objArrCopyOf.getClass();
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            objArrCopyOf[i3] = obj;
            return objArrCopyOf;
        }
        java.lang.Object obj2 = objArrCopyOf[i3];
        obj2.getClass();
        objArrCopyOf[i3] = q((java.lang.Object[]) obj2, i - 5, i2, obj);
        return objArrCopyOf;
    }

    private final java.lang.Object[] r(java.lang.Object[] objArr, int i, int i2, java.lang.Object obj, defpackage.nub nubVar) {
        java.lang.Object[] objArrCopyOf;
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            if (i3 == 0) {
                objArrCopyOf = new java.lang.Object[32];
            } else {
                objArrCopyOf = java.util.Arrays.copyOf(objArr, 32);
                objArrCopyOf.getClass();
            }
            defpackage.afga.ck(objArr, objArrCopyOf, i3 + 1, i3, 31);
            nubVar.a = objArr[31];
            objArrCopyOf[i3] = obj;
            return objArrCopyOf;
        }
        java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArr, 32);
        objArrCopyOf2.getClass();
        int i4 = i - 5;
        java.lang.Object obj2 = objArr[i3];
        obj2.getClass();
        objArrCopyOf2[i3] = r((java.lang.Object[]) obj2, i4, i2, obj, nubVar);
        while (true) {
            i3++;
            if (i3 >= 32 || objArrCopyOf2[i3] == null) {
                break;
            }
            java.lang.Object obj3 = objArr[i3];
            obj3.getClass();
            objArrCopyOf2[i3] = r((java.lang.Object[]) obj3, i4, 0, nubVar.a, nubVar);
        }
        return objArrCopyOf2;
    }

    private final java.lang.Object[] s(java.lang.Object[] objArr, int i, int i2, defpackage.nub nubVar) {
        java.lang.Object[] objArrS;
        int i3 = (i2 >> i) & 31;
        if (i == 5) {
            nubVar.a = objArr[i3];
            objArrS = null;
        } else {
            java.lang.Object obj = objArr[i3];
            obj.getClass();
            objArrS = s((java.lang.Object[]) obj, i - 5, i2, nubVar);
        }
        if (objArrS == null && i3 == 0) {
            return null;
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, 32);
        objArrCopyOf.getClass();
        objArrCopyOf[i3] = objArrS;
        return objArrCopyOf;
    }

    private final java.lang.Object[] t(java.lang.Object[] objArr, int i, int i2, defpackage.nub nubVar) {
        java.lang.Object[] objArrCopyOf;
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            if (i3 == 0) {
                objArrCopyOf = new java.lang.Object[32];
            } else {
                objArrCopyOf = java.util.Arrays.copyOf(objArr, 32);
                objArrCopyOf.getClass();
            }
            defpackage.afga.ck(objArr, objArrCopyOf, i3, i3 + 1, 32);
            objArrCopyOf[31] = nubVar.a;
            nubVar.a = objArr[i3];
            return objArrCopyOf;
        }
        int iL = objArr[31] == null ? 31 & ((l() - 1) >> i) : 31;
        java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArr, 32);
        objArrCopyOf2.getClass();
        int i4 = i - 5;
        int i5 = i3 + 1;
        if (i5 <= iL) {
            while (true) {
                java.lang.Object obj = objArrCopyOf2[iL];
                obj.getClass();
                objArrCopyOf2[iL] = t((java.lang.Object[]) obj, i4, 0, nubVar);
                if (iL == i5) {
                    break;
                }
                iL--;
            }
        }
        java.lang.Object obj2 = objArrCopyOf2[i3];
        obj2.getClass();
        objArrCopyOf2[i3] = t((java.lang.Object[]) obj2, i4, i2, nubVar);
        return objArrCopyOf2;
    }

    @Override // defpackage.afbm
    public final int a() {
        return this.c;
    }

    @Override // defpackage.cbl
    public final defpackage.cbl b(java.lang.Object obj) {
        int i = this.c;
        int iL = i - l();
        if (iL >= 32) {
            return o(this.a, this.b, defpackage.dai.at(obj));
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.b, 32);
        objArrCopyOf.getClass();
        objArrCopyOf[iL] = obj;
        return new defpackage.cbq(this.a, objArrCopyOf, i + 1, this.d);
    }

    @Override // defpackage.cbl
    public final defpackage.cbl c(int i, java.lang.Object obj) {
        int i2 = this.c;
        defpackage.a.aG(i, i2);
        if (i == i2) {
            return b(obj);
        }
        int iL = l();
        if (i >= iL) {
            return n(this.a, i - iL, obj);
        }
        defpackage.nub nubVar = new defpackage.nub(null, null);
        return n(r(this.a, this.d, i, obj, nubVar), 0, nubVar.a);
    }

    @Override // defpackage.cbl
    public final defpackage.cbl g(defpackage.affc affcVar) {
        defpackage.cbr cbrVarJ = j();
        cbrVarJ.e(affcVar);
        return cbrVarJ.c();
    }

    @Override // defpackage.afbr, java.util.List
    public final E get(int i) {
        java.lang.Object[] objArr;
        defpackage.a.aF(i, this.c);
        if (l() <= i) {
            objArr = this.b;
        } else {
            java.lang.Object[] objArr2 = this.a;
            for (int i2 = this.d; i2 > 0; i2 -= 5) {
                java.lang.Object[] objArr3 = objArr2[(i >> i2) & 31];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return (E) objArr[i & 31];
    }

    @Override // defpackage.cbl
    public final defpackage.cbl h(int i) {
        defpackage.a.aF(i, this.c);
        int iL = l();
        java.lang.Object[] objArr = this.a;
        if (i >= iL) {
            return m(objArr, iL, this.d, i - iL);
        }
        int i2 = this.d;
        return m(t(objArr, i2, i, new defpackage.nub(this.b[0], null)), iL, i2, 0);
    }

    @Override // defpackage.cbl
    public final defpackage.cbl i(int i, java.lang.Object obj) {
        int i2 = this.c;
        defpackage.a.aF(i, i2);
        if (l() > i) {
            java.lang.Object[] objArr = this.a;
            int i3 = this.d;
            return new defpackage.cbq(q(objArr, i3, i, obj), this.b, i2, i3);
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.b, 32);
        objArrCopyOf.getClass();
        objArrCopyOf[i & 31] = obj;
        return new defpackage.cbq(this.a, objArrCopyOf, i2, this.d);
    }

    @Override // defpackage.cbl
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final defpackage.cbr j() {
        return new defpackage.cbr(this, this.a, this.b, this.d);
    }

    @Override // defpackage.afbr, java.util.List
    public final java.util.ListIterator<E> listIterator(int i) {
        int i2 = this.c;
        defpackage.a.aG(i, i2);
        return new defpackage.cbs(this.a, this.b, i, i2, (this.d / 5) + 1);
    }
}
