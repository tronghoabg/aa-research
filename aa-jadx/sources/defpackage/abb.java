package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class abb implements java.lang.Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ int[] b;
    public /* synthetic */ java.lang.Object[] c;
    public /* synthetic */ int d;

    public abb(byte[] bArr) {
        int iC = defpackage.abg.c(40) / 4;
        this.b = new int[iC];
        this.c = new java.lang.Object[iC];
    }

    public final int a(int i) {
        if (this.a) {
            defpackage.abc.b(this);
        }
        return defpackage.abg.a(this.b, this.d, i);
    }

    public final int b(int i) {
        if (this.a) {
            defpackage.abc.b(this);
        }
        if (i >= this.d || i < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        return this.b[i];
    }

    public final int c() {
        if (this.a) {
            defpackage.abc.b(this);
        }
        return this.d;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final defpackage.abb clone() throws java.lang.CloneNotSupportedException {
        java.lang.Object objClone = super.clone();
        objClone.getClass();
        defpackage.abb abbVar = (defpackage.abb) objClone;
        abbVar.b = (int[]) this.b.clone();
        abbVar.c = (java.lang.Object[]) this.c.clone();
        return abbVar;
    }

    public final java.lang.Object e(int i) {
        if (this.a) {
            defpackage.abc.b(this);
        }
        if (i >= this.d || i < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        return this.c[i];
    }

    public final void f(int i, java.lang.Object obj) {
        int iA = defpackage.abg.a(this.b, this.d, i);
        if (iA >= 0) {
            this.c[iA] = obj;
            return;
        }
        int i2 = ~iA;
        int i3 = this.d;
        if (i2 < i3) {
            java.lang.Object[] objArr = this.c;
            if (objArr[i2] == defpackage.abc.a) {
                this.b[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.a && i3 >= this.b.length) {
            defpackage.abc.b(this);
            i2 = ~defpackage.abg.a(this.b, this.d, i);
        }
        int i4 = this.d;
        int[] iArr = this.b;
        if (i4 >= iArr.length) {
            int iC = defpackage.abg.c((i4 + 1) * 4) / 4;
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, iC);
            iArrCopyOf.getClass();
            this.b = iArrCopyOf;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.c, iC);
            objArrCopyOf.getClass();
            this.c = objArrCopyOf;
        }
        int i5 = this.d - i2;
        if (i5 != 0) {
            int[] iArr2 = this.b;
            int i6 = i2 + 1;
            iArr2.getClass();
            iArr2.getClass();
            java.lang.System.arraycopy(iArr2, i2, iArr2, i6, i5);
            java.lang.Object[] objArr2 = this.c;
            int i7 = this.d;
            objArr2.getClass();
            objArr2.getClass();
            java.lang.System.arraycopy(objArr2, i2, objArr2, i6, i7 - i2);
        }
        this.b[i2] = i;
        this.c[i2] = obj;
        this.d++;
    }

    public final boolean g(int i) {
        return a(i) >= 0;
    }

    public final java.lang.String toString() {
        if (c() <= 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(b(i2));
            sb.append('=');
            java.lang.Object objE = e(i2);
            if (objE != this) {
                sb.append(objE);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public abb() {
        throw null;
    }
}
