package defpackage;

/* loaded from: classes3.dex */
abstract class aexa {
    int b;
    final int c;
    int d;
    boolean e;
    boolean f;
    final /* synthetic */ aexc g;

    public aexa(aexc aexcVar) {
        this.g = aexcVar;
        this.b = 0;
        this.c = aexcVar.e;
        this.d = 0;
        this.e = aexcVar.d;
        this.f = false;
    }

    public abstract aexa a(int i, int i2, boolean z);

    public abstract void c(Object obj, int i);

    public final aexa d() {
        int i;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 >= i2 - 1 || (i = (i2 - i3) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i3;
        aexa aexaVarA = a(i3, i4, this.e);
        this.b = i4;
        this.e = false;
        this.f = true;
        return aexaVarA;
    }

    public final void e(Object obj) {
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

    public final long estimateSize() {
        boolean z = this.f;
        aexc aexcVar = this.g;
        if (!z) {
            return aexcVar.h - this.d;
        }
        return Math.min(aexcVar.h - this.d, ((long) ((aexcVar.e() / aexcVar.e) * (this.c - this.b))) + (this.e ? 1L : 0L));
    }

    public final boolean f(Object obj) {
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

    public aexa(aexc aexcVar, int i, int i2, boolean z) {
        this.g = aexcVar;
        this.d = 0;
        this.b = i;
        this.c = i2;
        this.e = z;
        this.f = true;
    }
}
