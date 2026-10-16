package defpackage;

/* JADX INFO: loaded from: classes3.dex */
abstract class aexi {
    int b;
    final int c;
    int d;
    boolean e;
    boolean f;
    final /* synthetic */ defpackage.aexk g;

    public aexi(defpackage.aexk aexkVar) {
        this.g = aexkVar;
        this.b = 0;
        this.c = aexkVar.e;
        this.d = 0;
        this.e = aexkVar.d;
        this.f = false;
    }

    public abstract defpackage.aexi a(int i, int i2, boolean z);

    public abstract void c(java.lang.Object obj, int i);

    public final defpackage.aexi d() {
        int i;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 >= i2 - 1 || (i = (i2 - i3) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i3;
        defpackage.aexi aexiVarA = a(i3, i4, this.e);
        this.b = i4;
        this.e = false;
        this.f = true;
        return aexiVarA;
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
        defpackage.aexk aexkVar = this.g;
        if (!z) {
            return aexkVar.h - this.d;
        }
        return java.lang.Math.min(aexkVar.h - this.d, ((long) ((((double) aexkVar.e()) / ((double) aexkVar.e)) * ((double) (this.c - this.b)))) + (this.e ? 1L : 0L));
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

    public aexi(defpackage.aexk aexkVar, int i, int i2, boolean z) {
        this.g = aexkVar;
        this.d = 0;
        this.b = i;
        this.c = i2;
        this.e = z;
        this.f = true;
    }
}
