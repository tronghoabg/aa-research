package defpackage;

/* JADX INFO: loaded from: classes3.dex */
abstract class aeuj {
    int b;
    final int c;
    int d;
    boolean e;
    boolean f;
    final /* synthetic */ defpackage.aeul g;

    public aeuj(defpackage.aeul aeulVar) {
        this.g = aeulVar;
        this.b = 0;
        this.c = aeulVar.e;
        this.d = 0;
        this.e = aeulVar.d;
        this.f = false;
    }

    public abstract defpackage.aeuj a(int i, int i2, boolean z);

    public abstract void c(java.lang.Object obj, int i);

    public final defpackage.aeuj d() {
        int i;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 >= i2 - 1 || (i = (i2 - i3) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i3;
        defpackage.aeuj aeujVarA = a(i3, i4, this.e);
        this.b = i4;
        this.e = false;
        this.f = true;
        return aeujVarA;
    }

    public final void e(java.lang.Object obj) {
        if (this.e) {
            this.e = false;
            this.d++;
            c(obj, this.g.e);
        }
        java.lang.Object[] objArr = this.g.a;
        while (true) {
            int i = this.b;
            if (i >= this.c) {
                return;
            }
            if (objArr[i] != null) {
                c(obj, i);
                this.d++;
            }
            this.b++;
        }
    }

    public final long estimateSize() {
        boolean z = this.f;
        defpackage.aeul aeulVar = this.g;
        if (!z) {
            return aeulVar.h - this.d;
        }
        return java.lang.Math.min(aeulVar.h - this.d, ((long) ((((double) aeulVar.e()) / ((double) aeulVar.e)) * ((double) (this.c - this.b)))) + (this.e ? 1L : 0L));
    }

    public final boolean f(java.lang.Object obj) {
        if (this.e) {
            this.e = false;
            this.d++;
            c(obj, this.g.e);
            return true;
        }
        java.lang.Object[] objArr = this.g.a;
        while (true) {
            int i = this.b;
            if (i >= this.c) {
                return false;
            }
            int i2 = i + 1;
            if (objArr[i] != null) {
                this.d++;
                this.b = i2;
                c(obj, i);
                return true;
            }
            this.b = i2;
        }
    }

    public aeuj(defpackage.aeul aeulVar, int i, int i2, boolean z) {
        this.g = aeulVar;
        this.d = 0;
        this.b = i;
        this.c = i2;
        this.e = z;
        this.f = true;
    }
}
