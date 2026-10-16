package defpackage;

/* loaded from: classes3.dex */
abstract class aeiq {
    int b;
    final int c;
    int d;
    boolean e;
    boolean f;
    final /* synthetic */ aeit g;

    public aeiq(aeit aeitVar) {
        this.g = aeitVar;
        this.b = 0;
        this.c = aeitVar.e;
        this.d = 0;
        this.e = aeitVar.d;
        this.f = false;
    }

    public abstract aeiq a(int i, int i2, boolean z);

    public abstract void c(Object obj, int i);

    public final aeiq e() {
        int i;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 >= i2 - 1 || (i = (i2 - i3) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i3;
        aeiq aeiqVarA = a(i3, i4, this.e);
        this.b = i4;
        this.e = false;
        this.f = true;
        return aeiqVarA;
    }

    public final long estimateSize() {
        boolean z = this.f;
        aeit aeitVar = this.g;
        if (!z) {
            return aeitVar.h - this.d;
        }
        return Math.min(aeitVar.h - this.d, ((long) ((aeitVar.j() / aeitVar.e) * (this.c - this.b))) + (this.e ? 1L : 0L));
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

    public aeiq(aeit aeitVar, int i, int i2, boolean z) {
        this.g = aeitVar;
        this.d = 0;
        this.b = i;
        this.c = i2;
        this.e = z;
        this.f = true;
    }
}
