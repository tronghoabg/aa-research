package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class j {
    public final defpackage.lam h;
    private final defpackage.k i;
    public int a = 0;
    private int j = 8;
    public int[] b = new int[8];
    public int[] c = new int[8];
    public float[] d = new float[8];
    public int e = -1;
    public int f = -1;
    public boolean g = false;

    public j(defpackage.k kVar, defpackage.lam lamVar) {
        this.i = kVar;
        this.h = lamVar;
    }

    public final float a(defpackage.n nVar) {
        int i = this.e;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.b[i] == nVar.a) {
                return this.d[i];
            }
            i = this.c[i];
        }
        return 0.0f;
    }

    final float b(int i) {
        int i2 = this.e;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.d[i2];
            }
            i2 = this.c[i2];
        }
        return 0.0f;
    }

    public final float c(defpackage.n nVar) {
        int i = this.e;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.a) {
            int i4 = this.b[i];
            if (i4 == nVar.a) {
                int i5 = this.e;
                int[] iArr = this.c;
                if (i == i5) {
                    this.e = iArr[i];
                } else {
                    iArr[i3] = iArr[i];
                }
                ((defpackage.n[]) this.h.b)[i4].a(this.i);
                this.a--;
                this.b[i] = -1;
                if (this.g) {
                    this.f = i;
                }
                return this.d[i];
            }
            i2++;
            i3 = i;
            i = this.c[i];
        }
        return 0.0f;
    }

    final defpackage.n d(int i) {
        int i2 = this.e;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return ((defpackage.n[]) this.h.b)[this.b[i2]];
            }
            i2 = this.c[i2];
        }
        return null;
    }

    public final void e(defpackage.n nVar, float f) {
        int[] iArr;
        if (f == 0.0f) {
            return;
        }
        int i = this.e;
        if (i == -1) {
            this.e = 0;
            this.d[0] = f;
            this.b[0] = nVar.a;
            this.c[0] = -1;
            this.a++;
            if (this.g) {
                return;
            }
            this.f++;
            return;
        }
        int i2 = -1;
        for (int i3 = 0; i != -1 && i3 < this.a; i3++) {
            int i4 = this.b[i];
            int i5 = nVar.a;
            if (i4 == i5) {
                float[] fArr = this.d;
                float f2 = fArr[i] + f;
                fArr[i] = f2;
                if (f2 == 0.0f) {
                    int i6 = this.e;
                    int[] iArr2 = this.c;
                    if (i == i6) {
                        this.e = iArr2[i];
                    } else {
                        iArr2[i2] = iArr2[i];
                    }
                    ((defpackage.n[]) this.h.b)[i4].a(this.i);
                    if (this.g) {
                        this.f = i;
                    }
                    this.a--;
                    return;
                }
                return;
            }
            if (i4 < i5) {
                i2 = i;
            }
            i = this.c[i];
        }
        int length = this.f;
        int i7 = length + 1;
        if (this.g) {
            int[] iArr3 = this.b;
            if (iArr3[length] != -1) {
                length = iArr3.length;
            }
        } else {
            length = i7;
        }
        int[] iArr4 = this.b;
        int length2 = iArr4.length;
        if (length < length2 || this.a >= length2) {
            iArr = iArr4;
            break;
        }
        int i8 = 0;
        while (true) {
            iArr = this.b;
            if (i8 >= iArr.length) {
                iArr4 = iArr;
                iArr = iArr4;
                break;
            } else {
                if (iArr[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int length3 = iArr.length;
        if (length >= length3) {
            int i9 = this.j;
            int i10 = i9 + i9;
            this.j = i10;
            this.g = false;
            this.f = length3 - 1;
            this.d = java.util.Arrays.copyOf(this.d, i10);
            this.b = java.util.Arrays.copyOf(this.b, this.j);
            this.c = java.util.Arrays.copyOf(this.c, this.j);
            length = length3;
        }
        int[] iArr5 = this.b;
        iArr5[length] = nVar.a;
        this.d[length] = f;
        int[] iArr6 = this.c;
        if (i2 != -1) {
            iArr6[length] = iArr6[i2];
            iArr6[i2] = length;
        } else {
            iArr6[length] = this.e;
            this.e = length;
        }
        this.a++;
        if (!this.g) {
            this.f++;
        }
        int i11 = this.f;
        int length4 = iArr5.length;
        if (i11 >= length4) {
            this.g = true;
            this.f = length4 - 1;
        }
    }

    public final void f(defpackage.n nVar, float f) {
        int[] iArr;
        if (f == 0.0f) {
            c(nVar);
            return;
        }
        int i = this.e;
        if (i == -1) {
            this.e = 0;
            this.d[0] = f;
            this.b[0] = nVar.a;
            this.c[0] = -1;
            this.a++;
            if (this.g) {
                return;
            }
            this.f++;
            return;
        }
        int i2 = -1;
        for (int i3 = 0; i != -1 && i3 < this.a; i3++) {
            int i4 = this.b[i];
            int i5 = nVar.a;
            if (i4 == i5) {
                this.d[i] = f;
                return;
            }
            if (i4 < i5) {
                i2 = i;
            }
            i = this.c[i];
        }
        int length = this.f;
        int i6 = length + 1;
        if (this.g) {
            int[] iArr2 = this.b;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i6;
        }
        int[] iArr3 = this.b;
        int length2 = iArr3.length;
        if (length < length2 || this.a >= length2) {
            iArr = iArr3;
            break;
        }
        int i7 = 0;
        while (true) {
            iArr = this.b;
            if (i7 >= iArr.length) {
                iArr3 = iArr;
                iArr = iArr3;
                break;
            } else {
                if (iArr[i7] == -1) {
                    length = i7;
                    break;
                }
                i7++;
            }
        }
        int length3 = iArr.length;
        if (length >= length3) {
            int i8 = this.j;
            int i9 = i8 + i8;
            this.j = i9;
            this.g = false;
            this.f = length3 - 1;
            this.d = java.util.Arrays.copyOf(this.d, i9);
            this.b = java.util.Arrays.copyOf(this.b, this.j);
            this.c = java.util.Arrays.copyOf(this.c, this.j);
            length = length3;
        }
        int[] iArr4 = this.b;
        iArr4[length] = nVar.a;
        this.d[length] = f;
        int[] iArr5 = this.c;
        if (i2 != -1) {
            iArr5[length] = iArr5[i2];
            iArr5[i2] = length;
        } else {
            iArr5[length] = this.e;
            this.e = length;
        }
        int i10 = this.a + 1;
        this.a = i10;
        if (!this.g) {
            this.f++;
        }
        if (i10 >= iArr4.length) {
            this.g = true;
        }
    }

    final void g(defpackage.k kVar, defpackage.k kVar2) {
        int i = this.e;
        while (true) {
            for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
                int i3 = this.b[i];
                defpackage.n nVar = kVar2.a;
                if (i3 == nVar.a) {
                    float f = this.d[i];
                    c(nVar);
                    defpackage.j jVar = kVar2.d;
                    int i4 = jVar.e;
                    for (int i5 = 0; i4 != -1 && i5 < jVar.a; i5++) {
                        e(((defpackage.n[]) this.h.b)[jVar.b[i4]], jVar.d[i4] * f);
                        i4 = jVar.c[i4];
                    }
                    kVar.b += kVar2.b * f;
                    kVar2.a.a(kVar);
                    i = this.e;
                } else {
                    i = this.c[i];
                }
            }
            return;
        }
    }

    public final java.lang.String toString() {
        int i = this.e;
        java.lang.String strConcat = "";
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            java.lang.String str = strConcat.concat(" -> ") + this.d[i] + " : ";
            defpackage.n nVar = ((defpackage.n[]) this.h.b)[this.b[i]];
            java.util.Objects.toString(nVar);
            strConcat = str.concat(java.lang.String.valueOf(nVar));
            i = this.c[i];
        }
        return strConcat;
    }
}
