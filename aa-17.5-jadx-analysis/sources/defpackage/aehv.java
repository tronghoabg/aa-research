package defpackage;

/* loaded from: classes3.dex */
abstract class aehv {
    int b;
    final int c;
    int d;
    boolean e;
    boolean f;
    final /* synthetic */ aehy g;

    public aehv(aehy aehyVar) {
        this.g = aehyVar;
        this.b = 0;
        this.c = aehyVar.e;
        this.d = 0;
        this.e = aehyVar.d;
        this.f = false;
    }

    public abstract aehv a(int i, int i2, boolean z);

    public abstract void c(Object obj, int i);

    public final aehv e() {
        int i;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 >= i2 - 1 || (i = (i2 - i3) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i3;
        aehv aehvVarA = a(i3, i4, this.e);
        this.b = i4;
        this.e = false;
        this.f = true;
        return aehvVarA;
    }

    public final long estimateSize() {
        boolean z = this.f;
        aehy aehyVar = this.g;
        if (!z) {
            return aehyVar.h - this.d;
        }
        return Math.min(aehyVar.h - this.d, ((long) ((aehyVar.h() / aehyVar.e) * (this.c - this.b))) + (this.e ? 1L : 0L));
    }

    public final void forEachRemaining(Object obj) {
        if (this.e) {
            this.e = false;
            this.d++;
            c(obj, this.g.e);
        }
        int[] iArr = this.g.a;
        while (true) {
            int i = this.b;
            if (i >= this.c) {
                return;
            }
            if (iArr[i] != 0) {
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
        int[] iArr = this.g.a;
        while (true) {
            int i = this.b;
            if (i >= this.c) {
                return false;
            }
            int i2 = i + 1;
            if (iArr[i] != 0) {
                this.d++;
                this.b = i2;
                c(obj, i);
                return true;
            }
            this.b = i2;
        }
    }

    public aehv(aehy aehyVar, int i, int i2, boolean z) {
        this.g = aehyVar;
        this.d = 0;
        this.b = i;
        this.c = i2;
        this.e = z;
        this.f = true;
    }
}
