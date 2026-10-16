package defpackage;

/* loaded from: classes3.dex */
abstract class aesg {
    int b;
    final int c;
    int d;
    boolean e;
    boolean f;
    final /* synthetic */ aesj g;

    public aesg(aesj aesjVar) {
        this.g = aesjVar;
        this.b = 0;
        this.c = aesjVar.e;
        this.d = 0;
        this.e = aesjVar.d;
        this.f = false;
    }

    public abstract aesg a(int i, int i2, boolean z);

    public abstract void c(Object obj, int i);

    public final aesg e() {
        int i;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 >= i2 - 1 || (i = (i2 - i3) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i3;
        aesg aesgVarA = a(i3, i4, this.e);
        this.b = i4;
        this.e = false;
        this.f = true;
        return aesgVarA;
    }

    public final long estimateSize() {
        boolean z = this.f;
        aesj aesjVar = this.g;
        if (!z) {
            return aesjVar.h - this.d;
        }
        return Math.min(aesjVar.h - this.d, ((long) ((aesjVar.q() / aesjVar.e) * (this.c - this.b))) + (this.e ? 1L : 0L));
    }

    public final void forEachRemaining(Object obj) {
        if (this.e) {
            this.e = false;
            this.d++;
            c(obj, this.g.e);
        }
        Object[] objArr = this.g.a;
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

    public final boolean tryAdvance(Object obj) {
        if (this.e) {
            this.e = false;
            this.d++;
            c(obj, this.g.e);
            return true;
        }
        Object[] objArr = this.g.a;
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

    public aesg(aesj aesjVar, int i, int i2, boolean z) {
        this.g = aesjVar;
        this.d = 0;
        this.b = i;
        this.c = i2;
        this.e = z;
        this.f = true;
    }
}
