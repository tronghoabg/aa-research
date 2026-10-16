package defpackage;

/* JADX INFO: loaded from: classes3.dex */
abstract class aeya {
    int b;
    final int c;
    int d;
    boolean e;
    boolean f;
    final /* synthetic */ defpackage.aeyc g;

    public aeya(defpackage.aeyc aeycVar) {
        this.g = aeycVar;
        this.b = 0;
        this.c = aeycVar.e;
        this.d = 0;
        this.e = aeycVar.d;
        this.f = false;
    }

    public abstract defpackage.aeya a(int i, int i2, boolean z);

    public abstract void c(java.lang.Object obj, int i);

    public final defpackage.aeya d() {
        int i;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 >= i2 - 1 || (i = (i2 - i3) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i3;
        defpackage.aeya aeyaVarA = a(i3, i4, this.e);
        this.b = i4;
        this.e = false;
        this.f = true;
        return aeyaVarA;
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
        defpackage.aeyc aeycVar = this.g;
        if (!z) {
            return aeycVar.h - this.d;
        }
        return java.lang.Math.min(aeycVar.h - this.d, ((long) ((((double) aeycVar.e()) / ((double) aeycVar.e)) * ((double) (this.c - this.b)))) + (this.e ? 1L : 0L));
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

    public aeya(defpackage.aeyc aeycVar, int i, int i2, boolean z) {
        this.g = aeycVar;
        this.d = 0;
        this.b = i;
        this.c = i2;
        this.e = z;
        this.f = true;
    }
}
