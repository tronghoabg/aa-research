package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bzc implements java.util.RandomAccess {
    public java.lang.Object[] a;
    public int b = 0;
    private java.util.List c;

    public bzc(java.lang.Object[] objArr) {
        this.a = objArr;
    }

    public final int a(java.lang.Object obj) {
        java.lang.Object[] objArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (defpackage.afga.f(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final java.lang.Object b() {
        if (this.b != 0) {
            return this.a[0];
        }
        throw new java.util.NoSuchElementException("MutableVector is empty.");
    }

    public final java.lang.Object c(int i) {
        java.lang.Object[] objArr = this.a;
        java.lang.Object obj = objArr[i];
        int i2 = this.b;
        if (i != i2 - 1) {
            int i3 = i + 1;
            java.lang.System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.b - 1;
        this.b = i4;
        objArr[i4] = null;
        return obj;
    }

    public final java.lang.Object d(int i, java.lang.Object obj) {
        java.lang.Object[] objArr = this.a;
        java.lang.Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final java.util.List e() {
        java.util.List list = this.c;
        if (list != null) {
            return list;
        }
        defpackage.byz byzVar = new defpackage.byz(this, 0);
        this.c = byzVar;
        return byzVar;
    }

    public final void f(int i, java.lang.Object obj) {
        int i2 = this.b + 1;
        if (this.a.length < i2) {
            i(i2);
        }
        java.lang.Object[] objArr = this.a;
        int i3 = this.b;
        if (i != i3) {
            java.lang.System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.b++;
    }

    public final void g() {
        java.lang.Object[] objArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.b = 0;
    }

    public final void h(int i, int i2) {
        if (i2 > i) {
            int i3 = this.b;
            if (i2 < i3) {
                java.lang.Object[] objArr = this.a;
                java.lang.System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.b;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.a[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.b = i5;
        }
    }

    public final void i(int i) {
        java.lang.Object[] objArr = this.a;
        int length = objArr.length;
        java.lang.Object[] objArr2 = new java.lang.Object[java.lang.Math.max(i, length + length)];
        java.lang.System.arraycopy(objArr, 0, objArr2, 0, length);
        this.a = objArr2;
    }

    public final void j(java.util.Comparator comparator) {
        java.lang.Object[] objArr = this.a;
        int i = this.b;
        objArr.getClass();
        java.util.Arrays.sort(objArr, 0, i, comparator);
    }

    public final boolean k(int i, java.util.Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.b + size;
        if (this.a.length < i3) {
            i(i3);
        }
        java.lang.Object[] objArr = this.a;
        int i4 = this.b;
        if (i != i4) {
            java.lang.System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (java.lang.Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                defpackage.afga.ai();
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.b += size;
        return true;
    }

    public final boolean l(java.lang.Object obj) {
        int i = this.b - 1;
        if (i >= 0) {
            for (int i2 = 0; !defpackage.afga.f(this.a[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean m(java.lang.Object obj) {
        int iA = a(obj);
        if (iA < 0) {
            return false;
        }
        c(iA);
        return true;
    }

    public final void n(java.lang.Object obj) {
        int i = this.b + 1;
        if (this.a.length < i) {
            i(i);
        }
        java.lang.Object[] objArr = this.a;
        int i2 = this.b;
        objArr[i2] = obj;
        this.b = i2 + 1;
    }

    public final void o(int i, defpackage.bzc bzcVar) {
        int i2 = bzcVar.b;
        if (i2 == 0) {
            return;
        }
        int i3 = this.b + i2;
        if (this.a.length < i3) {
            i(i3);
        }
        java.lang.Object[] objArr = this.a;
        int i4 = this.b;
        if (i != i4) {
            java.lang.System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        java.lang.System.arraycopy(bzcVar.a, 0, objArr, i, i2);
        this.b += i2;
    }

    public final void p(int i, java.util.List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.b + size;
        if (this.a.length < i2) {
            i(i2);
        }
        java.lang.Object[] objArr = this.a;
        int i3 = this.b;
        if (i != i3) {
            java.lang.System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.b += size;
    }
}
