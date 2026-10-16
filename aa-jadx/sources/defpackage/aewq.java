package defpackage;

/* JADX INFO: loaded from: classes3.dex */
abstract class aewq {
    int b;
    final int c;
    int d;
    boolean e;
    boolean f;
    final /* synthetic */ defpackage.aewt g;

    public aewq(defpackage.aewt aewtVar) {
        this.g = aewtVar;
        this.b = 0;
        this.c = aewtVar.e;
        this.d = 0;
        this.e = aewtVar.d;
        this.f = false;
    }

    public abstract defpackage.aewq a(int i, int i2, boolean z);

    public abstract void c(java.lang.Object obj, int i);

    public final defpackage.aewq e() {
        int i;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 >= i2 - 1 || (i = (i2 - i3) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i3;
        defpackage.aewq aewqVarA = a(i3, i4, this.e);
        this.b = i4;
        this.e = false;
        this.f = true;
        return aewqVarA;
    }

    public final long estimateSize() {
        boolean z = this.f;
        defpackage.aewt aewtVar = this.g;
        if (!z) {
            return aewtVar.h - this.d;
        }
        return java.lang.Math.min(aewtVar.h - this.d, ((long) ((((double) aewtVar.q()) / ((double) aewtVar.e)) * ((double) (this.c - this.b)))) + (this.e ? 1L : 0L));
    }

    public final void forEachRemaining(java.lang.Object obj) {
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

    public final boolean tryAdvance(java.lang.Object obj) {
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

    public aewq(defpackage.aewt aewtVar, int i, int i2, boolean z) {
        this.g = aewtVar;
        this.d = 0;
        this.b = i;
        this.c = i2;
        this.e = z;
        this.f = true;
    }
}
