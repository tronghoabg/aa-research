package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class yhv extends defpackage.ygk {
    java.lang.Object[] d;
    private int e;

    public yhv(int i) {
        super(i);
        this.d = new java.lang.Object[defpackage.yhx.j(i)];
    }

    @Override // defpackage.ygl
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public defpackage.yhx g() {
        defpackage.yhx yhxVarL;
        int i = this.b;
        if (i == 0) {
            return defpackage.ynd.a;
        }
        if (i == 1) {
            java.lang.Object obj = this.a[0];
            obj.getClass();
            return new defpackage.ynu(obj);
        }
        if (this.d == null || defpackage.yhx.j(i) != this.d.length) {
            yhxVarL = defpackage.yhx.l(this.b, this.a);
            this.b = yhxVarL.size();
        } else {
            int i2 = this.b;
            java.lang.Object[] objArrCopyOf = this.a;
            if (defpackage.yhx.u(i2, objArrCopyOf.length)) {
                objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, i2);
            }
            int i3 = this.e;
            java.lang.Object[] objArr = this.d;
            yhxVarL = new defpackage.ynd(objArrCopyOf, i3, objArr, objArr.length - 1, this.b);
        }
        this.c = true;
        this.d = null;
        return yhxVarL;
    }

    @Override // defpackage.ygk, defpackage.ygl
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void c(java.lang.Object obj) {
        obj.getClass();
        if (this.d != null) {
            int iJ = defpackage.yhx.j(this.b);
            java.lang.Object[] objArr = this.d;
            int length = objArr.length;
            if (iJ <= length) {
                objArr.getClass();
                int iHashCode = obj.hashCode();
                int iAz = defpackage.ysr.az(iHashCode);
                while (true) {
                    java.lang.Object[] objArr2 = this.d;
                    int i = iAz & (length - 1);
                    java.lang.Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.e += iHashCode;
                        super.b(obj);
                        return;
                    } else if (obj2.equals(obj)) {
                        return;
                    } else {
                        iAz = i + 1;
                    }
                }
            }
        }
        this.d = null;
        super.b(obj);
    }

    public final void j(java.lang.Object... objArr) {
        if (this.d == null) {
            super.d(objArr);
            return;
        }
        for (java.lang.Object obj : objArr) {
            c(obj);
        }
    }

    public final void k(java.lang.Iterable iterable) {
        iterable.getClass();
        if (this.d == null) {
            super.e(iterable);
            return;
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public final void l(defpackage.yhv yhvVar) {
        if (this.d == null) {
            a(yhvVar.a, yhvVar.b);
            return;
        }
        for (int i = 0; i < yhvVar.b; i++) {
            java.lang.Object obj = yhvVar.a[i];
            obj.getClass();
            c(obj);
        }
    }

    public yhv() {
        super(4);
    }
}
