package defpackage;

/* JADX INFO: loaded from: classes3.dex */
abstract class aeiv {
    int b;
    final int c;
    int d;
    boolean e;
    boolean f;
    final /* synthetic */ defpackage.aeiy g;

    public aeiv(defpackage.aeiy aeiyVar) {
        this.g = aeiyVar;
        this.b = 0;
        this.c = aeiyVar.e;
        this.d = 0;
        this.e = aeiyVar.d;
        this.f = false;
    }

    public abstract defpackage.aeiv a(int i, int i2, boolean z);

    public abstract void c(java.lang.Object obj, int i);

    public final defpackage.aeiv e() {
        int i;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 >= i2 - 1 || (i = (i2 - i3) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i3;
        defpackage.aeiv aeivVarA = a(i3, i4, this.e);
        this.b = i4;
        this.e = false;
        this.f = true;
        return aeivVarA;
    }

    public final long estimateSize() {
        boolean z = this.f;
        defpackage.aeiy aeiyVar = this.g;
        if (!z) {
            return aeiyVar.h - this.d;
        }
        return java.lang.Math.min(aeiyVar.h - this.d, ((long) ((((double) aeiyVar.h()) / ((double) aeiyVar.e)) * ((double) (this.c - this.b)))) + (this.e ? 1L : 0L));
    }

    public final void forEachRemaining(java.lang.Object obj) {
        if (this.e) {
            this.e = false;
            this.d++;
            c(obj, this.g.e);
        }
        int[] iArr = this.g.a;
        while (true) {
            int i = this.b;
            if (i >= this.c) {
                return;
            }
            if (iArr[i] != 0) {
                c(obj, i);
                this.d++;
            }
            this.b++;
        }
    }

    public final boolean tryAdvance(java.lang.Object obj) {
        if (this.e) {
            this.e = false;
            this.d++;
            c(obj, this.g.e);
            return true;
        }
        int[] iArr = this.g.a;
        while (true) {
            int i = this.b;
            if (i >= this.c) {
                return false;
            }
            int i2 = i + 1;
            if (iArr[i] != 0) {
                this.d++;
                this.b = i2;
                c(obj, i);
                return true;
            }
            this.b = i2;
        }
    }

    public aeiv(defpackage.aeiy aeiyVar, int i, int i2, boolean z) {
        this.g = aeiyVar;
        this.d = 0;
        this.b = i;
        this.c = i2;
        this.e = z;
        this.f = true;
    }
}
