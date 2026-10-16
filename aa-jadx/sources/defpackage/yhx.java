package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class yhx<E> extends defpackage.ygm<E> implements java.util.Set<E>, j$.util.Set<E> {
    private static final long serialVersionUID = 912559;
    private transient defpackage.ygw a;

    static int j(int i) {
        int iMax = java.lang.Math.max(i, 2);
        if (iMax >= 751619276) {
            defpackage.ysr.aY(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = java.lang.Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static defpackage.yhx l(int i, java.lang.Object... objArr) {
        if (i == 0) {
            return defpackage.ynd.a;
        }
        if (i == 1) {
            java.lang.Object obj = objArr[0];
            obj.getClass();
            return new defpackage.ynu(obj);
        }
        int iJ = j(i);
        java.lang.Object[] objArr2 = new java.lang.Object[iJ];
        int i2 = iJ - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            java.lang.Object obj2 = objArr[i5];
            defpackage.ysr.A(obj2, i5);
            int iHashCode = obj2.hashCode();
            int iAz = defpackage.ysr.az(iHashCode);
            while (true) {
                int i6 = iAz & i2;
                java.lang.Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iAz++;
            }
        }
        java.util.Arrays.fill(objArr, i4, i, (java.lang.Object) null);
        if (i4 == 1) {
            java.lang.Object obj4 = objArr[0];
            obj4.getClass();
            return new defpackage.ynu(obj4);
        }
        if (j(i4) < iJ / 2) {
            return l(i4, objArr);
        }
        if (u(i4, objArr.length)) {
            objArr = java.util.Arrays.copyOf(objArr, i4);
        }
        return new defpackage.ynd(objArr, i3, objArr2, i2, i4);
    }

    public static defpackage.yhx m(java.lang.Iterable iterable) {
        if (iterable instanceof java.util.Collection) {
            return n((java.util.Collection) iterable);
        }
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return defpackage.ynd.a;
        }
        java.lang.Object next = it.next();
        if (!it.hasNext()) {
            return new defpackage.ynu(next);
        }
        defpackage.yhv yhvVar = new defpackage.yhv();
        yhvVar.c(next);
        it.getClass();
        while (it.hasNext()) {
            yhvVar.c(it.next());
        }
        return yhvVar.g();
    }

    public static defpackage.yhx n(java.util.Collection collection) {
        if ((collection instanceof defpackage.yhx) && !(collection instanceof java.util.SortedSet)) {
            defpackage.yhx yhxVar = (defpackage.yhx) collection;
            if (!yhxVar.f()) {
                return yhxVar;
            }
        }
        java.lang.Object[] array = collection.toArray();
        return l(array.length, array);
    }

    public static defpackage.yhx o(java.lang.Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? l(length, (java.lang.Object[]) objArr.clone()) : new defpackage.ynu(objArr[0]);
        }
        return defpackage.ynd.a;
    }

    public static defpackage.yhx p(java.lang.Object obj, java.lang.Object obj2) {
        return l(2, obj, obj2);
    }

    public static defpackage.yhx q(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return l(3, obj, obj2, obj3);
    }

    public static defpackage.yhx r(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        return l(4, obj, obj2, obj3, obj4);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    public static defpackage.yhx s(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        return l(5, obj, obj2, obj3, obj4, obj5);
    }

    @java.lang.SafeVarargs
    public static defpackage.yhx t(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object... objArr) {
        int length = objArr.length;
        int i = length + 6;
        java.lang.Object[] objArr2 = new java.lang.Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        java.lang.System.arraycopy(objArr, 0, objArr2, 6, length);
        return l(i, objArr2);
    }

    public static boolean u(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public static void v() {
        defpackage.ynd yndVar = defpackage.ynd.a;
    }

    @Override // defpackage.ygm
    public defpackage.ygw d() {
        defpackage.ygw ygwVar = this.a;
        if (ygwVar != null) {
            return ygwVar;
        }
        defpackage.ygw ygwVarK = k();
        this.a = ygwVarK;
        return ygwVarK;
    }

    @Override // defpackage.ygm, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public abstract defpackage.yot iterator();

    @Override // java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof defpackage.yhx) && i() && ((defpackage.yhx) obj).i() && hashCode() != obj.hashCode()) {
            return false;
        }
        return defpackage.ysr.v(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return defpackage.ysr.m(this);
    }

    public boolean i() {
        return false;
    }

    public defpackage.ygw k() {
        return defpackage.ygw.k(toArray());
    }

    @Override // defpackage.ygm
    public java.lang.Object writeReplace() {
        return new defpackage.yhw(toArray());
    }
}
