package defpackage;

/* JADX INFO: loaded from: classes3.dex */
abstract class aeoa {
    int b;
    final int c;
    int d;
    boolean e;
    boolean f;
    final /* synthetic */ defpackage.aeod g;

    public aeoa(defpackage.aeod aeodVar) {
        this.g = aeodVar;
        this.b = 0;
        this.c = aeodVar.f;
        this.d = 0;
        this.e = aeodVar.e;
        this.f = false;
    }

    public abstract defpackage.aeoa a(int i, int i2, boolean z);

    public abstract void c(java.lang.Object obj, int i);

    public final defpackage.aeoa e() {
        int i;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 >= i2 - 1 || (i = (i2 - i3) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i3;
        defpackage.aeoa aeoaVarA = a(i3, i4, this.e);
        this.b = i4;
        this.e = false;
        this.f = true;
        return aeoaVarA;
    }

    public final long estimateSize() {
        boolean z = this.f;
        defpackage.aeod aeodVar = this.g;
        if (!z) {
            return aeodVar.i - this.d;
        }
        return java.lang.Math.min(aeodVar.i - this.d, ((long) ((((double) aeodVar.v()) / ((double) aeodVar.f)) * ((double) (this.c - this.b)))) + (this.e ? 1L : 0L));
    }

    public final void forEachRemaining(java.lang.Object obj) {
        if (this.e) {
            this.e = false;
            this.d++;
            c(obj, this.g.f);
        }
        long[] jArr = this.g.b;
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
            c(obj, this.g.f);
            return true;
        }
        long[] jArr = this.g.b;
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

    public aeoa(defpackage.aeod aeodVar, int i, int i2, boolean z) {
        this.g = aeodVar;
        this.d = 0;
        this.b = i;
        this.c = i2;
        this.e = z;
        this.f = true;
    }
}
