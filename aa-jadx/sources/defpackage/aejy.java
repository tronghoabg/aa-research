package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aejy extends defpackage.aehq implements java.util.RandomAccess, java.lang.Cloneable, java.io.Serializable {
    private static final long serialVersionUID = -7046029254386353130L;
    public transient int[] a;
    public int b;

    public aejy() {
        this.a = defpackage.aekc.b;
    }

    private final void M(int i) {
        int[] iArr = this.a;
        int length = iArr.length;
        if (i <= length) {
            return;
        }
        if (iArr != defpackage.aekc.b) {
            i = (int) java.lang.Math.max(java.lang.Math.min(((long) length) + ((long) (length >> 1)), 2147483639L), i);
        } else if (i < 10) {
            i = 10;
        }
        int[] iArr2 = new int[i];
        java.lang.System.arraycopy(this.a, 0, iArr2, 0, this.b);
        this.a = iArr2;
    }

    private static final int[] N(int[] iArr, int i) {
        return i == 0 ? defpackage.aekc.a : java.util.Arrays.copyOf(iArr, i);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        int[] iArr = new int[this.b];
        this.a = iArr;
        for (int i = 0; i < this.b; i++) {
            iArr[i] = objectInputStream.readInt();
        }
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        int[] iArr = this.a;
        for (int i = 0; i < this.b; i++) {
            objectOutputStream.writeInt(iArr[i]);
        }
    }

    @Override // defpackage.aehq, defpackage.aela
    public final void H(defpackage.aekj aekjVar) {
        int[] iArr = this.a;
        int i = this.b;
        if (aekjVar == null) {
            defpackage.aekc.f(iArr, i);
        } else {
            defpackage.aekc.b(iArr, 0, i, aekjVar, null);
        }
    }

    @Override // defpackage.aehq, defpackage.aela
    public final void J() {
        defpackage.aekc.f(this.a, this.b);
    }

    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final defpackage.aejy clone() {
        if (getClass() == defpackage.aejy.class) {
            defpackage.aejy aejyVar = new defpackage.aejy(N(this.a, this.b));
            aejyVar.b = this.b;
            return aejyVar;
        }
        try {
            defpackage.aejy aejyVar2 = (defpackage.aejy) super.clone();
            aejyVar2.a = N(this.a, this.b);
            return aejyVar2;
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.InternalError(e);
        }
    }

    public final int[] L(int[] iArr) {
        int length = iArr.length;
        int i = this.b;
        if (length < i) {
            iArr = java.util.Arrays.copyOf(iArr, i);
        }
        java.lang.System.arraycopy(this.a, 0, iArr, 0, this.b);
        return iArr;
    }

    @Override // defpackage.aehq, defpackage.aehj, defpackage.aekf
    public final defpackage.aelm b() {
        return new defpackage.aeka(this, 1);
    }

    @Override // defpackage.aehq, defpackage.aehj, defpackage.aekf
    public final boolean c(int i) {
        M(this.b + 1);
        int[] iArr = this.a;
        int i2 = this.b;
        this.b = i2 + 1;
        iArr[i2] = i;
        return true;
    }

    @Override // defpackage.aehq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.b = 0;
    }

    @Override // defpackage.aehq, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return compareTo((java.util.List) obj);
    }

    @Override // defpackage.aehq, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof java.util.List)) {
            return false;
        }
        if (!(obj instanceof defpackage.aejy)) {
            return obj instanceof defpackage.aejx ? ((defpackage.aejx) obj).equals(this) : super.equals(obj);
        }
        defpackage.aejy aejyVar = (defpackage.aejy) obj;
        if (aejyVar == this) {
            return true;
        }
        int i = this.b;
        int i2 = aejyVar.b;
        if (i != i2) {
            return false;
        }
        int[] iArr = this.a;
        int[] iArr2 = aejyVar.a;
        if (iArr == iArr2 && i == i2) {
            return true;
        }
        while (i != 0) {
            i--;
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.aehq, defpackage.aehj, defpackage.aekf
    public final boolean g(int i) {
        int iW = w(i);
        if (iW == -1) {
            return false;
        }
        n(iW);
        return true;
    }

    @Override // defpackage.aehj
    public final boolean h(defpackage.aekf aekfVar) {
        int i;
        int[] iArr = this.a;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.b;
            if (i2 >= i) {
                break;
            }
            if (!aekfVar.e(iArr[i2])) {
                iArr[i3] = iArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.b = i3;
        return z;
    }

    @Override // defpackage.aehj, defpackage.aekf
    public final boolean i(java.util.function.IntPredicate intPredicate) {
        int i;
        int[] iArr = this.a;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.b;
            if (i2 >= i) {
                break;
            }
            if (!intPredicate.test(iArr[i2])) {
                iArr[i3] = iArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.b = i3;
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // defpackage.aehq
    /* JADX INFO: renamed from: l */
    public final defpackage.aela subList(int i, int i2) {
        if (i == 0) {
            if (i2 == this.b) {
                return this;
            }
            i = 0;
        }
        E(i);
        E(i2);
        if (i <= i2) {
            return new defpackage.aejx(this, i, i2);
        }
        throw new java.lang.IndexOutOfBoundsException(defpackage.a.bz(i2, i, "Start index (", ") is greater than end index (", ")"));
    }

    @Override // defpackage.aehq, java.util.List
    public final /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int i) {
        return listIterator(i);
    }

    @Override // defpackage.aela
    public final int m(int i) {
        int i2 = this.b;
        if (i < i2) {
            return this.a[i];
        }
        throw new java.lang.IndexOutOfBoundsException(defpackage.a.bz(i2, i, "Index (", ") is greater than or equal to list size (", ")"));
    }

    @Override // defpackage.aehq, defpackage.aela
    public final int n(int i) {
        int i2 = this.b;
        if (i >= i2) {
            throw new java.lang.IndexOutOfBoundsException(defpackage.a.bz(i2, i, "Index (", ") is greater than or equal to list size (", ")"));
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        int i4 = i2 - 1;
        this.b = i4;
        if (i != i4) {
            java.lang.System.arraycopy(iArr, i + 1, iArr, i, i4 - i);
        }
        return i3;
    }

    @Override // defpackage.aehq, defpackage.aela
    public final int o(int i, int i2) {
        int i3 = this.b;
        if (i >= i3) {
            throw new java.lang.IndexOutOfBoundsException(defpackage.a.bz(i3, i, "Index (", ") is greater than or equal to list size (", ")"));
        }
        int[] iArr = this.a;
        int i4 = iArr[i];
        iArr[i] = i2;
        return i4;
    }

    @Override // defpackage.aehq, defpackage.aela
    /* JADX INFO: renamed from: p */
    public final defpackage.aelb listIterator(int i) {
        E(i);
        return new defpackage.aeju(this, i);
    }

    @Override // defpackage.aehq, defpackage.aela
    public final void q(int i, int i2) {
        E(i);
        M(this.b + 1);
        int i3 = this.b;
        if (i != i3) {
            int[] iArr = this.a;
            java.lang.System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        }
        this.a[i] = i2;
        this.b++;
    }

    @Override // defpackage.aehq, defpackage.aela
    public final void r(int i, int[] iArr, int i2, int i3) {
        defpackage.aekc.a(iArr, i2, i3);
        java.lang.System.arraycopy(this.a, i, iArr, i2, i3);
    }

    @Override // defpackage.aehq, defpackage.aela
    public final void s(int i, int i2) {
        defpackage.aefc.a(this.b, i, i2);
        int[] iArr = this.a;
        java.lang.System.arraycopy(iArr, i2, iArr, i, this.b - i2);
        this.b -= i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // defpackage.aehq, defpackage.aehj, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ j$.util.Spliterator spliterator() {
        return new defpackage.aeka(this, 1);
    }

    @Override // defpackage.aehq, java.util.List
    public final /* bridge */ /* synthetic */ java.util.List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.aehq
    public final boolean t(int i, defpackage.aekf aekfVar) {
        if (aekfVar instanceof defpackage.aela) {
            defpackage.aela aelaVar = (defpackage.aela) aekfVar;
            E(i);
            int size = aelaVar.size();
            if (size == 0) {
                return false;
            }
            M(this.b + size);
            int[] iArr = this.a;
            java.lang.System.arraycopy(iArr, i, iArr, i + size, this.b - i);
            aelaVar.r(0, this.a, i, size);
            this.b += size;
            return true;
        }
        E(i);
        int size2 = aekfVar.size();
        if (size2 == 0) {
            return false;
        }
        M(this.b + size2);
        int[] iArr2 = this.a;
        java.lang.System.arraycopy(iArr2, i, iArr2, i + size2, this.b - i);
        defpackage.aekr aekrVarM = aekfVar.m();
        this.b += size2;
        while (size2 != 0) {
            size2--;
            this.a[i] = aekrVarM.nextInt();
            i++;
        }
        return true;
    }

    @Override // defpackage.aehq, defpackage.aela
    public final void u(int i, int[] iArr, int i2) {
        E(i);
        defpackage.aekc.a(iArr, 0, i2);
        int i3 = i + i2;
        int i4 = this.b;
        if (i3 > i4) {
            throw new java.lang.IndexOutOfBoundsException(defpackage.a.bz(i4, i3, "End index (", ") is greater than list size (", ")"));
        }
        java.lang.System.arraycopy(iArr, 0, this.a, i, i2);
    }

    @Override // defpackage.aehq
    /* JADX INFO: renamed from: v */
    public final int compareTo(java.util.List list) {
        if (!(list instanceof defpackage.aejy)) {
            return list instanceof defpackage.aejx ? -((defpackage.aejx) list).compareTo(this) : super.compareTo(list);
        }
        defpackage.aejy aejyVar = (defpackage.aejy) list;
        int i = this.b;
        int i2 = aejyVar.b;
        int[] iArr = this.a;
        int[] iArr2 = aejyVar.a;
        if (iArr == iArr2 && i == i2) {
            return 0;
        }
        int i3 = 0;
        while (i3 < i && i3 < i2) {
            int iCompare = java.lang.Integer.compare(iArr[i3], iArr2[i3]);
            if (iCompare != 0) {
                return iCompare;
            }
            i3++;
        }
        if (i3 < i2) {
            return -1;
        }
        return i3 < i ? 1 : 0;
    }

    @Override // defpackage.aehq, defpackage.aela
    public final int w(int i) {
        int[] iArr = this.a;
        for (int i2 = 0; i2 < this.b; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.aehq, defpackage.aela
    public final int x(int i) {
        int[] iArr = this.a;
        int i2 = this.b;
        while (i2 != 0) {
            i2--;
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public aejy(int i) {
        this.a = new int[i];
    }

    protected aejy(int[] iArr) {
        this.a = iArr;
    }
}
