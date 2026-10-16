package defpackage;

/* JADX INFO: loaded from: classes3.dex */
abstract class aenf {
    int b;
    final int c;
    int d;
    boolean e;
    boolean f;
    final /* synthetic */ defpackage.aeni g;

    public aenf(defpackage.aeni aeniVar) {
        this.g = aeniVar;
        this.b = 0;
        this.c = aeniVar.e;
        this.d = 0;
        this.e = aeniVar.d;
        this.f = false;
    }

    public abstract defpackage.aenf a(int i, int i2, boolean z);

    public abstract void c(java.lang.Object obj, int i);

    public final defpackage.aenf e() {
        int i;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 >= i2 - 1 || (i = (i2 - i3) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i3;
        defpackage.aenf aenfVarA = a(i3, i4, this.e);
        this.b = i4;
        this.e = false;
        this.f = true;
        return aenfVarA;
    }

    public final long estimateSize() {
        boolean z = this.f;
        defpackage.aeni aeniVar = this.g;
        if (!z) {
            return aeniVar.h - this.d;
        }
        return java.lang.Math.min(aeniVar.h - this.d, ((long) ((((double) aeniVar.u()) / ((double) aeniVar.e)) * ((double) (this.c - this.b)))) + (this.e ? 1L : 0L));
    }

    public final void forEachRemaining(java.lang.Object obj) {
        if (this.e) {
            this.e = false;
            this.d++;
            c(obj, this.g.e);
        }
        long[] jArr = this.g.a;
        while (true) {
            int i = this.b;
            if (i >= this.c) {
                return;
            }
            if (jArr[i] != 0) {
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
        long[] jArr = this.g.a;
        while (true) {
            int i = this.b;
            if (i >= this.c) {
                return false;
            }
            int i2 = i + 1;
            if (jArr[i] != 0) {
                this.d++;
                this.b = i2;
                c(obj, i);
                return true;
            }
            this.b = i2;
        }
    }

    public aenf(defpackage.aeni aeniVar, int i, int i2, boolean z) {
        this.g = aeniVar;
        this.d = 0;
        this.b = i;
        this.c = i2;
        this.e = z;
        this.f = true;
    }
}
