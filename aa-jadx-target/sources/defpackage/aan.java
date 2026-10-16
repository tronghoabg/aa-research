package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aan {
    public java.lang.Object[] a;
    public int b;
    private defpackage.byz c;

    public aan(int i) {
        this.a = i == 0 ? defpackage.aao.a : new java.lang.Object[i];
    }

    public final int a(java.lang.Object obj) {
        java.lang.Object[] objArr = this.a;
        int i = 0;
        int i2 = this.b;
        if (obj == null) {
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < i2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final java.lang.Object b() {
        if (f()) {
            defpackage.ca.ab("ObjectList is empty.");
        }
        return this.a[0];
    }

    public final java.lang.Object c(int i) {
        if (i < 0 || i >= this.b) {
            d(i);
        }
        return this.a[i];
    }

    public final void d(int i) {
        defpackage.ca.aa("Index " + i + " must be in 0.." + (this.b - 1));
    }

    public final boolean e(java.lang.Object obj) {
        return a(obj) >= 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.aan) {
            defpackage.aan aanVar = (defpackage.aan) obj;
            int i = aanVar.b;
            int i2 = this.b;
            if (i == i2) {
                java.lang.Object[] objArr = this.a;
                java.lang.Object[] objArr2 = aanVar.a;
                defpackage.afia afiaVarM = defpackage.afqt.m(0, i2);
                int i3 = afiaVarM.a;
                int i4 = afiaVarM.b;
                if (i3 > i4) {
                    return true;
                }
                while (defpackage.afga.f(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.b == 0;
    }

    public final boolean g() {
        return this.b != 0;
    }

    public final java.lang.Object h(int i) {
        if (i < 0 || i >= this.b) {
            d(i);
        }
        java.lang.Object[] objArr = this.a;
        java.lang.Object obj = objArr[i];
        int i2 = this.b;
        if (i != i2 - 1) {
            int i3 = i + 1;
            objArr.getClass();
            objArr.getClass();
            java.lang.System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.b - 1;
        this.b = i4;
        objArr[i4] = null;
        return obj;
    }

    public final int hashCode() {
        java.lang.Object[] objArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            java.lang.Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final java.lang.Object i(int i, java.lang.Object obj) {
        if (i < 0 || i >= this.b) {
            d(i);
        }
        java.lang.Object[] objArr = this.a;
        java.lang.Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final java.util.List j() {
        defpackage.byz byzVar = this.c;
        if (byzVar != null) {
            return byzVar;
        }
        defpackage.byz byzVar2 = new defpackage.byz(this, 1);
        this.c = byzVar2;
        return byzVar2;
    }

    public final void k() {
        java.lang.Object[] objArr = this.a;
        int i = this.b;
        objArr.getClass();
        java.util.Arrays.fill(objArr, 0, i, (java.lang.Object) null);
        this.b = 0;
    }

    public final void l(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.b) || i2 < 0 || i2 > i3) {
            defpackage.ca.aa("Start (" + i + ") and end (" + i2 + ") must be in 0.." + this.b);
        }
        if (i2 < i) {
            defpackage.ca.Y(defpackage.a.bz(i2, i, "Start (", ") is more than end (", ")"));
        }
        if (i2 != i) {
            int i4 = this.b;
            if (i2 < i4) {
                java.lang.Object[] objArr = this.a;
                objArr.getClass();
                objArr.getClass();
                java.lang.System.arraycopy(objArr, i2, objArr, i, i4 - i2);
            }
            int i5 = this.b;
            int i6 = i5 - (i2 - i);
            java.lang.Object[] objArr2 = this.a;
            objArr2.getClass();
            java.util.Arrays.fill(objArr2, i6, i5, (java.lang.Object) null);
            this.b = i6;
        }
    }

    public final void m(int i, java.lang.Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        java.lang.Object[] objArr2 = new java.lang.Object[java.lang.Math.max(i, (length * 3) / 2)];
        java.lang.System.arraycopy(objArr, 0, objArr2, 0, length);
        this.a = objArr2;
    }

    public final void n(int i) {
        defpackage.ca.aa("Index " + i + " must be in 0.." + this.b);
    }

    public final boolean o(java.lang.Object obj) {
        int iA = a(obj);
        if (iA < 0) {
            return false;
        }
        h(iA);
        return true;
    }

    public final void p(java.lang.Object obj) {
        int i = this.b + 1;
        java.lang.Object[] objArr = this.a;
        if (objArr.length < i) {
            m(i, objArr);
        }
        java.lang.Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final void q(defpackage.aan aanVar) {
        int i = this.b;
        if (aanVar.f()) {
            return;
        }
        int i2 = i + aanVar.b;
        java.lang.Object[] objArr = this.a;
        if (objArr.length < i2) {
            m(i2, objArr);
        }
        defpackage.afga.ck(aanVar.a, this.a, this.b, 0, aanVar.b);
        this.b += aanVar.b;
    }

    public final void r(java.util.List list) {
        int i = this.b;
        if (list.isEmpty()) {
            return;
        }
        int size = list.size() + i;
        java.lang.Object[] objArr = this.a;
        if (objArr.length < size) {
            m(size, objArr);
        }
        java.lang.Object[] objArr2 = this.a;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.b += list.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.CharSequence, java.lang.Object] */
    public final java.lang.String toString() {
        defpackage.aap aapVar = new defpackage.aap(this, 1);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        java.lang.Object[] objArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            java.lang.Object obj = objArr[i2];
            if (i2 != 0) {
                sb.append((java.lang.CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((java.lang.CharSequence) "...");
                break;
            }
            sb.append((java.lang.CharSequence) aapVar.invoke(obj));
        }
        sb.append((java.lang.CharSequence) "]");
        return sb.toString();
    }

    public aan() {
        this(16);
    }
}
