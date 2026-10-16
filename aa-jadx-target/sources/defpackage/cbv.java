package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cbv<E> extends defpackage.cbo<E> implements j$.util.List<E>, defpackage.cbk {
    public static final defpackage.cbv a = new defpackage.cbv(new java.lang.Object[0]);
    private final java.lang.Object[] b;

    public cbv(java.lang.Object[] objArr) {
        this.b = objArr;
        int length = objArr.length;
    }

    @Override // defpackage.afbm
    public final int a() {
        return this.b.length;
    }

    @Override // defpackage.cbl
    public final defpackage.cbl b(java.lang.Object obj) {
        if (a() >= 32) {
            return new defpackage.cbq(this.b, defpackage.dai.at(obj), a() + 1, 0);
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.b, a() + 1);
        objArrCopyOf.getClass();
        objArrCopyOf[a()] = obj;
        return new defpackage.cbv(objArrCopyOf);
    }

    @Override // defpackage.cbl
    public final defpackage.cbl c(int i, java.lang.Object obj) {
        defpackage.a.aG(i, a());
        if (i == a()) {
            return b(obj);
        }
        int i2 = i + 1;
        if (a() >= 32) {
            java.lang.Object[] objArr = this.b;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf.getClass();
            defpackage.afga.ck(objArr, objArrCopyOf, i2, i, a() - 1);
            objArrCopyOf[i] = obj;
            return new defpackage.cbq(objArrCopyOf, defpackage.dai.at(objArr[31]), a() + 1, 0);
        }
        int iA = a() + 1;
        java.lang.Object[] objArr2 = this.b;
        java.lang.Object[] objArr3 = new java.lang.Object[iA];
        defpackage.afga.cv(objArr2, objArr3, 0, i, 6);
        defpackage.afga.ck(objArr2, objArr3, i2, i, a());
        objArr3[i] = obj;
        return new defpackage.cbv(objArr3);
    }

    @Override // defpackage.cbo, defpackage.cbl
    public final defpackage.cbl d(java.util.Collection collection) {
        if (a() + collection.size() > 32) {
            defpackage.cbr cbrVarJ = j();
            cbrVarJ.addAll(collection);
            return cbrVarJ.c();
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.b, a() + collection.size());
        objArrCopyOf.getClass();
        int iA = a();
        java.util.Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[iA] = it.next();
            iA++;
        }
        return new defpackage.cbv(objArrCopyOf);
    }

    @Override // defpackage.cbl
    public final defpackage.cbl g(defpackage.affc affcVar) {
        java.lang.Object[] objArr = this.b;
        int iA = a();
        int iA2 = a();
        java.lang.Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < iA2; i++) {
            java.lang.Object obj = objArr[i];
            if (((java.lang.Boolean) affcVar.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
                    objArrCopyOf.getClass();
                    z = true;
                    iA = i;
                }
            } else if (z) {
                objArrCopyOf[iA] = obj;
                iA++;
            }
        }
        if (iA == a()) {
            return this;
        }
        return iA == 0 ? a : new defpackage.cbv(defpackage.afga.bC(objArrCopyOf, 0, iA));
    }

    @Override // defpackage.afbr, java.util.List
    public final E get(int i) {
        defpackage.a.aF(i, a());
        return (E) this.b[i];
    }

    @Override // defpackage.cbl
    public final defpackage.cbl h(int i) {
        defpackage.a.aF(i, a());
        if (a() == 1) {
            return a;
        }
        java.lang.Object[] objArr = this.b;
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, a() - 1);
        objArrCopyOf.getClass();
        defpackage.afga.ck(objArr, objArrCopyOf, i, i + 1, a());
        return new defpackage.cbv(objArrCopyOf);
    }

    @Override // defpackage.cbl
    public final defpackage.cbl i(int i, java.lang.Object obj) {
        defpackage.a.aF(i, a());
        java.lang.Object[] objArr = this.b;
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf.getClass();
        objArrCopyOf[i] = obj;
        return new defpackage.cbv(objArrCopyOf);
    }

    @Override // defpackage.afbr, java.util.List
    public final int indexOf(java.lang.Object obj) {
        return defpackage.afga.bJ(this.b, obj);
    }

    @Override // defpackage.cbl
    public final defpackage.cbr j() {
        return new defpackage.cbr(this, null, this.b, 0);
    }

    @Override // defpackage.afbr, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        java.lang.Object[] objArr = this.b;
        objArr.getClass();
        if (obj == null) {
            int length = objArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i = length - 1;
                if (objArr[length] == null) {
                    return length;
                }
                if (i < 0) {
                    return -1;
                }
                length = i;
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 < 0) {
                return -1;
            }
            while (true) {
                int i2 = length2 - 1;
                if (defpackage.afga.f(obj, objArr[length2])) {
                    return length2;
                }
                if (i2 < 0) {
                    return -1;
                }
                length2 = i2;
            }
        }
    }

    @Override // defpackage.afbr, java.util.List
    public final java.util.ListIterator<E> listIterator(int i) {
        defpackage.a.aG(i, a());
        return new defpackage.cbp(this.b, i, a());
    }
}
