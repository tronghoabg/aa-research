package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ypl extends defpackage.yqy {
    public java.lang.Object[] a = new java.lang.Object[8];
    public int b = 0;

    public final int a(defpackage.ypx ypxVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i + i].equals(ypxVar)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.yqy
    public final int b() {
        return this.b;
    }

    @Override // defpackage.yqy
    public final defpackage.ypx c(int i) {
        if (i < this.b) {
            return (defpackage.ypx) this.a[i + i];
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // defpackage.yqy
    public final java.lang.Object d(defpackage.ypx ypxVar) {
        int iA = a(ypxVar);
        if (iA != -1) {
            return ypxVar.c(this.a[iA + iA + 1]);
        }
        return null;
    }

    @Override // defpackage.yqy
    public final java.lang.Object e(int i) {
        if (i < this.b) {
            return this.a[i + i + 1];
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    final void f(defpackage.ypx ypxVar, java.lang.Object obj) {
        int iA;
        if (!ypxVar.b && (iA = a(ypxVar)) != -1) {
            obj.getClass();
            this.a[iA + iA + 1] = obj;
            return;
        }
        int i = this.b + 1;
        java.lang.Object[] objArrCopyOf = this.a;
        int length = objArrCopyOf.length;
        if (i + i > length) {
            objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, length + length);
            this.a = objArrCopyOf;
        }
        int i2 = this.b;
        int i3 = i2 + i2;
        ypxVar.getClass();
        objArrCopyOf[i3] = ypxVar;
        obj.getClass();
        objArrCopyOf[i3 + 1] = obj;
        this.b = i2 + 1;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Metadata{");
        for (int i = 0; i < this.b; i++) {
            sb.append(" '");
            sb.append(c(i));
            sb.append("': ");
            sb.append(e(i));
        }
        sb.append(" }");
        return sb.toString();
    }
}
