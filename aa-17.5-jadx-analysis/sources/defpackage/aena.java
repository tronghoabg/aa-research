package defpackage;

/* loaded from: classes3.dex */
abstract class aena {
    int b;
    final int c;
    int d;
    boolean e;
    boolean f;
    final /* synthetic */ aend g;

    public aena(aend aendVar) {
        this.g = aendVar;
        this.b = 0;
        this.c = aendVar.f;
        this.d = 0;
        this.e = aendVar.e;
        this.f = false;
    }

    public abstract aena a(int i, int i2, boolean z);

    public abstract void c(Object obj, int i);

    public final aena e() {
        int i;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 >= i2 - 1 || (i = (i2 - i3) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i3;
        aena aenaVarA = a(i3, i4, this.e);
        this.b = i4;
        this.e = false;
        this.f = true;
        return aenaVarA;
    }

    public final long estimateSize() {
        boolean z = this.f;
        aend aendVar = this.g;
        if (!z) {
            return aendVar.i - this.d;
        }
        return Math.min(aendVar.i - this.d, ((long) ((aendVar.v() / aendVar.f) * (this.c - this.b))) + (this.e ? 1L : 0L));
    }

    public final void forEachRemaining(Object obj) {
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

    public final boolean tryAdvance(Object obj) {
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

    public aena(aend aendVar, int i, int i2, boolean z) {
        this.g = aendVar;
        this.d = 0;
        this.b = i;
        this.c = i2;
        this.e = z;
        this.f = true;
    }
}
