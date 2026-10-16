package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zz implements java.lang.Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ long[] b;
    public /* synthetic */ java.lang.Object[] c;
    public /* synthetic */ int d;

    public zz(int i) {
        if (i == 0) {
            this.b = defpackage.abg.b;
            this.c = defpackage.abg.c;
        } else {
            int iC = defpackage.abg.c(i * 8) / 8;
            this.b = new long[iC];
            this.c = new java.lang.Object[iC];
        }
    }

    public final int a(long j) {
        if (this.a) {
            int i = this.d;
            long[] jArr = this.b;
            java.lang.Object[] objArr = this.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                java.lang.Object obj = objArr[i3];
                if (obj != defpackage.aaa.a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.a = false;
            this.d = i2;
        }
        return defpackage.abg.b(this.b, this.d, j);
    }

    public final int b() {
        if (this.a) {
            int i = this.d;
            long[] jArr = this.b;
            java.lang.Object[] objArr = this.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                java.lang.Object obj = objArr[i3];
                if (obj != defpackage.aaa.a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.a = false;
            this.d = i2;
        }
        return this.d;
    }

    public final long c(int i) {
        if (i < 0 || i >= this.d) {
            defpackage.ca.Y(defpackage.a.bo(i, "Expected index to be within 0..size()-1, but was "));
        }
        if (this.a) {
            int i2 = this.d;
            long[] jArr = this.b;
            java.lang.Object[] objArr = this.c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                java.lang.Object obj = objArr[i4];
                if (obj != defpackage.aaa.a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.a = false;
            this.d = i3;
        }
        return this.b[i];
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        java.lang.Object objClone = super.clone();
        objClone.getClass();
        defpackage.zz zzVar = (defpackage.zz) objClone;
        zzVar.b = (long[]) this.b.clone();
        zzVar.c = (java.lang.Object[]) this.c.clone();
        return zzVar;
    }

    public final java.lang.Object d(long j) {
        java.lang.Object obj;
        int iB = defpackage.abg.b(this.b, this.d, j);
        if (iB < 0 || (obj = this.c[iB]) == defpackage.aaa.a) {
            return null;
        }
        return obj;
    }

    public final java.lang.Object e(int i) {
        if (i < 0 || i >= this.d) {
            defpackage.ca.Y(defpackage.a.bo(i, "Expected index to be within 0..size()-1, but was "));
        }
        if (this.a) {
            int i2 = this.d;
            long[] jArr = this.b;
            java.lang.Object[] objArr = this.c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                java.lang.Object obj = objArr[i4];
                if (obj != defpackage.aaa.a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.a = false;
            this.d = i3;
        }
        return this.c[i];
    }

    public final void f() {
        int i = this.d;
        java.lang.Object[] objArr = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.d = 0;
        this.a = false;
    }

    public final void g(long j, java.lang.Object obj) {
        int iB = defpackage.abg.b(this.b, this.d, j);
        if (iB >= 0) {
            this.c[iB] = obj;
            return;
        }
        int i = ~iB;
        int i2 = this.d;
        if (i < i2) {
            java.lang.Object[] objArr = this.c;
            if (objArr[i] == defpackage.aaa.a) {
                this.b[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.a) {
            long[] jArr = this.b;
            if (i2 >= jArr.length) {
                java.lang.Object[] objArr2 = this.c;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    java.lang.Object obj2 = objArr2[i4];
                    if (obj2 != defpackage.aaa.a) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj2;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.a = false;
                this.d = i3;
                i = ~defpackage.abg.b(this.b, i3, j);
            }
        }
        int i5 = this.d;
        long[] jArr2 = this.b;
        if (i5 >= jArr2.length) {
            int iC = defpackage.abg.c((i5 + 1) * 8) / 8;
            long[] jArrCopyOf = java.util.Arrays.copyOf(jArr2, iC);
            jArrCopyOf.getClass();
            this.b = jArrCopyOf;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.c, iC);
            objArrCopyOf.getClass();
            this.c = objArrCopyOf;
        }
        int i6 = this.d;
        if (i6 - i != 0) {
            long[] jArr3 = this.b;
            int i7 = i + 1;
            defpackage.afga.cj(jArr3, jArr3, i7, i, i6);
            java.lang.Object[] objArr3 = this.c;
            int i8 = this.d;
            objArr3.getClass();
            objArr3.getClass();
            java.lang.System.arraycopy(objArr3, i, objArr3, i7, i8 - i);
        }
        this.b[i] = j;
        this.c[i] = obj;
        this.d++;
    }

    public final void h(long j) {
        int iB = defpackage.abg.b(this.b, this.d, j);
        if (iB >= 0) {
            java.lang.Object[] objArr = this.c;
            java.lang.Object obj = objArr[iB];
            java.lang.Object obj2 = defpackage.aaa.a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.a = true;
            }
        }
    }

    public final boolean i(long j) {
        return a(j) >= 0;
    }

    public final boolean j() {
        return b() == 0;
    }

    public final java.lang.String toString() {
        if (b() <= 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(c(i2));
            sb.append('=');
            java.lang.Object objE = e(i2);
            if (objE != sb) {
                sb.append(objE);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public zz() {
        throw null;
    }
}
