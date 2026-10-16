package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tvm {
    public float[] a;
    public int b;
    private float[] c;
    private boolean d;

    public tvm(byte[] bArr) {
        this.c = new float[0];
        this.a = new float[32];
        this.d = false;
        this.b = 0;
    }

    private final int l(float f, defpackage.tqd tqdVar) {
        int i;
        m();
        int i2 = this.b;
        int i3 = 0;
        while (true) {
            i = i3 + 1;
            if (i3 >= i2 - 2 || this.c[i] >= f) {
                break;
            }
            i3 = i;
        }
        float[] fArr = this.c;
        float f2 = fArr[i];
        float f3 = fArr[i3];
        float f4 = f2 - f3;
        float f5 = f - f3;
        float[] fArr2 = this.a;
        int i4 = i3 + i3;
        float f6 = fArr2[i4];
        float f7 = fArr2[i4 + 1];
        float f8 = f5 / f4;
        tqdVar.n(((fArr2[i4 + 2] - f6) * f8) + f6, (f8 * (fArr2[i4 + 3] - f7)) + f7);
        return i3;
    }

    private final void m() {
        if (this.d) {
            return;
        }
        float[] fArr = this.c;
        int length = fArr.length;
        int i = this.b;
        if (length < i) {
            fArr = new float[i];
            this.c = fArr;
        }
        fArr[0] = 0.0f;
        for (int i2 = 1; i2 < this.b; i2++) {
            int i3 = i2 - 1;
            float[] fArr2 = this.a;
            int i4 = i3 + i3;
            float f = fArr2[i4];
            float f2 = fArr2[i4 + 1];
            float f3 = fArr2[i4 + 2];
            float f4 = fArr2[i4 + 3] - f2;
            float[] fArr3 = this.c;
            fArr3[i2] = fArr3[i3] + ((float) java.lang.Math.hypot(f3 - f, f4));
        }
        this.d = true;
    }

    public final float a() {
        int i = this.b;
        if (i < 2) {
            return com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        }
        float[] fArr = this.a;
        int i2 = i + i;
        return (float) java.lang.Math.atan2(fArr[i2 - 1] - fArr[1], fArr[i2 - 2] - fArr[0]);
    }

    public final float b() {
        if (this.b < 2) {
            return com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        }
        m();
        return this.c[this.b - 1];
    }

    public final float c(int i) {
        defpackage.ysr.bs(i, this.b - 1);
        m();
        float[] fArr = this.c;
        return fArr[i + 1] - fArr[i];
    }

    public final void d(float f, float f2) {
        g(this.b + 1);
        float[] fArr = this.a;
        int i = this.b;
        int i2 = i + i;
        fArr[i2] = f;
        fArr[i2 + 1] = f2;
        this.b = i + 1;
        f();
    }

    public final void e() {
        this.b = 0;
        f();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.tvm)) {
            return false;
        }
        defpackage.tvm tvmVar = (defpackage.tvm) obj;
        if (this.b != tvmVar.b) {
            return false;
        }
        int i = 0;
        while (true) {
            int i2 = this.b;
            if (i >= i2 + i2) {
                return true;
            }
            if (this.a[i] != tvmVar.a[i]) {
                return false;
            }
            i++;
        }
    }

    public final void f() {
        this.d = false;
    }

    public final void g(int i) {
        float[] fArr = this.a;
        int length = fArr.length;
        int i2 = length >> 1;
        if (i2 < i) {
            int iMax = java.lang.Math.max(i2 + i2, i);
            float[] fArr2 = new float[iMax + iMax];
            if (length != 0) {
                java.lang.System.arraycopy(fArr, 0, fArr2, 0, length);
            }
            fArr = fArr2;
        }
        this.a = fArr;
    }

    public final void h(defpackage.tqd tqdVar, defpackage.tqd tqdVar2, defpackage.tqd tqdVar3, float f, float f2) {
        if (this.b < 2 || f2 <= f) {
            return;
        }
        int iL = l(f, tqdVar);
        int iL2 = l(f2, tqdVar2);
        j(iL2, tqdVar3);
        if (!tqdVar3.equals(tqdVar2)) {
            iL2++;
        }
        float[] fArr = this.a;
        fArr[0] = tqdVar.b;
        fArr[1] = tqdVar.c;
        int i = iL + 1;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            int i4 = i2 + i2;
            int i5 = i4 + 1;
            float[] fArr2 = this.a;
            if (i >= iL2) {
                fArr2[i4] = tqdVar2.b;
                fArr2[i5] = tqdVar2.c;
                this.b = i3;
                f();
                return;
            }
            int i6 = i + i;
            fArr2[i4] = fArr2[i6];
            fArr2[i5] = fArr2[i6 + 1];
            i++;
            i2 = i3;
        }
    }

    public final int hashCode() {
        int i = 0;
        int i2 = 1;
        while (true) {
            int i3 = this.b;
            if (i >= i3 + i3) {
                return i2;
            }
            int iFloatToIntBits = java.lang.Float.floatToIntBits(this.a[i]);
            i2 = (i2 * 31) + (iFloatToIntBits ^ (iFloatToIntBits >>> 16));
            i++;
        }
    }

    public final void i(int i, defpackage.tqd tqdVar) {
        defpackage.ysr.bs(i, this.b - 1);
        float[] fArr = this.a;
        int i2 = i + i;
        tqdVar.n(fArr[i2 + 2] - fArr[i2], fArr[i2 + 3] - fArr[i2 + 1]);
    }

    public final void j(int i, defpackage.tqd tqdVar) {
        float[] fArr = this.a;
        int i2 = i + i;
        tqdVar.n(fArr[i2], fArr[i2 + 1]);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final void k(float f, defpackage.tqd tqdVar) {
        int i = this.b;
        if (i < 2) {
            return;
        }
        if (f <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            j(0, tqdVar);
        } else if (f >= 1.0f) {
            j(i - 1, tqdVar);
        } else {
            l(f * b(), tqdVar);
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        for (int i = 0; i < this.b; i++) {
            float[] fArr = this.a;
            int i2 = i + i;
            float f = fArr[i2];
            float f2 = fArr[i2 + 1];
            sb.append("(");
            sb.append(f);
            sb.append(",");
            sb.append(f2);
            sb.append(")");
            if (i < this.b - 1) {
                sb.append(" ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public tvm() {
        throw null;
    }
}
