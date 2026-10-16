package defpackage;

/* JADX INFO: loaded from: classes3.dex */
abstract class aetg {
    int b;
    final int c;
    int d;
    boolean e;
    boolean f;
    final /* synthetic */ defpackage.aetj g;

    public aetg(defpackage.aetj aetjVar) {
        this.g = aetjVar;
        this.b = 0;
        this.c = aetjVar.e;
        this.d = 0;
        this.e = aetjVar.d;
        this.f = false;
    }

    public abstract defpackage.aetg a(int i, int i2, boolean z);

    public abstract void c(java.lang.Object obj, int i);

    public final defpackage.aetg e() {
        int i;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 >= i2 - 1 || (i = (i2 - i3) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i3;
        defpackage.aetg aetgVarA = a(i3, i4, this.e);
        this.b = i4;
        this.e = false;
        this.f = true;
        return aetgVarA;
    }

    public final long estimateSize() {
        boolean z = this.f;
        defpackage.aetj aetjVar = this.g;
        if (!z) {
            return aetjVar.h - this.d;
        }
        return java.lang.Math.min(aetjVar.h - this.d, ((long) ((((double) aetjVar.q()) / ((double) aetjVar.e)) * ((double) (this.c - this.b)))) + (this.e ? 1L : 0L));
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

    public aetg(defpackage.aetj aetjVar, int i, int i2, boolean z) {
        this.g = aetjVar;
        this.d = 0;
        this.b = i;
        this.c = i2;
        this.e = z;
        this.f = true;
    }
}
