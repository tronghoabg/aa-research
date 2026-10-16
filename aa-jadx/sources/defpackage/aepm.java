package defpackage;

/* JADX INFO: loaded from: classes3.dex */
abstract class aepm {
    int b;
    final int c;
    int d;
    boolean e;
    boolean f;
    final /* synthetic */ defpackage.aepp g;

    public aepm(defpackage.aepp aeppVar) {
        this.g = aeppVar;
        this.b = 0;
        this.c = aeppVar.e;
        this.d = 0;
        this.e = aeppVar.d;
        this.f = false;
    }

    public abstract defpackage.aepm a(int i, int i2, boolean z);

    public abstract void c(java.lang.Object obj, int i);

    public final defpackage.aepm e() {
        int i;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 >= i2 - 1 || (i = (i2 - i3) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i3;
        defpackage.aepm aepmVarA = a(i3, i4, this.e);
        this.b = i4;
        this.e = false;
        this.f = true;
        return aepmVarA;
    }

    public final long estimateSize() {
        boolean z = this.f;
        defpackage.aepp aeppVar = this.g;
        if (!z) {
            return aeppVar.h - this.d;
        }
        return java.lang.Math.min(aeppVar.h - this.d, ((long) ((((double) aeppVar.j()) / ((double) aeppVar.e)) * ((double) (this.c - this.b)))) + (this.e ? 1L : 0L));
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

    public aepm(defpackage.aepp aeppVar, int i, int i2, boolean z) {
        this.g = aeppVar;
        this.d = 0;
        this.b = i;
        this.c = i2;
        this.e = z;
        this.f = true;
    }
}
