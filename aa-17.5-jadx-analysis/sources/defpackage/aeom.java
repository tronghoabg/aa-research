package defpackage;

/* loaded from: classes3.dex */
abstract class aeom {
    int b;
    final int c;
    int d;
    boolean e;
    boolean f;
    final /* synthetic */ aeop g;

    public aeom(aeop aeopVar) {
        this.g = aeopVar;
        this.b = 0;
        this.c = aeopVar.e;
        this.d = 0;
        this.e = aeopVar.d;
        this.f = false;
    }

    public abstract aeom a(int i, int i2, boolean z);

    public abstract void c(Object obj, int i);

    public final aeom e() {
        int i;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 >= i2 - 1 || (i = (i2 - i3) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i3;
        aeom aeomVarA = a(i3, i4, this.e);
        this.b = i4;
        this.e = false;
        this.f = true;
        return aeomVarA;
    }

    public final long estimateSize() {
        boolean z = this.f;
        aeop aeopVar = this.g;
        if (!z) {
            return aeopVar.h - this.d;
        }
        return Math.min(aeopVar.h - this.d, ((long) ((aeopVar.j() / aeopVar.e) * (this.c - this.b))) + (this.e ? 1L : 0L));
    }

    public final void forEachRemaining(Object obj) {
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

    public final boolean tryAdvance(Object obj) {
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

    public aeom(aeop aeopVar, int i, int i2, boolean z) {
        this.g = aeopVar;
        this.d = 0;
        this.b = i;
        this.c = i2;
        this.e = z;
        this.f = true;
    }
}
