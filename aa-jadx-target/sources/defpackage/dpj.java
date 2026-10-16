package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dpj implements java.lang.Comparable {
    public static int a = 1;
    public boolean b;
    public float f;
    int n;
    public int c = -1;
    int d = -1;
    public int e = 0;
    public boolean g = false;
    final float[] h = new float[9];
    final float[] i = new float[9];
    defpackage.dpf[] j = new defpackage.dpf[16];
    int k = 0;
    public int l = 0;
    boolean m = false;

    public dpj(int i) {
        this.n = i;
    }

    public final void a(defpackage.dpf dpfVar) {
        int i = 0;
        while (true) {
            int i2 = this.k;
            defpackage.dpf[] dpfVarArr = this.j;
            if (i >= i2) {
                int length = dpfVarArr.length;
                if (i2 >= length) {
                    dpfVarArr = (defpackage.dpf[]) java.util.Arrays.copyOf(dpfVarArr, length + length);
                    this.j = dpfVarArr;
                }
                int i3 = this.k;
                dpfVarArr[i3] = dpfVar;
                this.k = i3 + 1;
                return;
            }
            if (dpfVarArr[i] == dpfVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(defpackage.dpf dpfVar) {
        int i = this.k;
        int i2 = 0;
        while (i2 < i) {
            if (this.j[i2] == dpfVar) {
                while (i2 < i - 1) {
                    defpackage.dpf[] dpfVarArr = this.j;
                    int i3 = i2 + 1;
                    dpfVarArr[i2] = dpfVarArr[i3];
                    i2 = i3;
                }
                this.k--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.n = 5;
        this.e = 0;
        this.c = -1;
        this.d = -1;
        this.f = 0.0f;
        this.g = false;
        this.m = false;
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2] = null;
        }
        this.k = 0;
        this.l = 0;
        this.b = false;
        java.util.Arrays.fill(this.i, 0.0f);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return this.c - ((defpackage.dpj) obj).c;
    }

    public final void d(defpackage.dpg dpgVar, float f) {
        this.f = f;
        this.g = true;
        this.m = false;
        int i = this.k;
        this.d = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].c(dpgVar, this, false);
        }
        this.k = 0;
    }

    public final void e(defpackage.dpg dpgVar, defpackage.dpf dpfVar) {
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].d(dpgVar, dpfVar, false);
        }
        this.k = 0;
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(this.c);
    }
}
