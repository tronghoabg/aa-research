package defpackage;

/* loaded from: classes3.dex */
abstract class aetj {
    int b;
    final int c;
    int d;
    boolean e;
    boolean f;
    final /* synthetic */ aetl g;

    public aetj(aetl aetlVar) {
        this.g = aetlVar;
        this.b = 0;
        this.c = aetlVar.e;
        this.d = 0;
        this.e = aetlVar.d;
        this.f = false;
    }

    public abstract aetj a(int i, int i2, boolean z);

    public abstract void c(Object obj, int i);

    public final aetj d() {
        int i;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 >= i2 - 1 || (i = (i2 - i3) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i3;
        aetj aetjVarA = a(i3, i4, this.e);
        this.b = i4;
        this.e = false;
        this.f = true;
        return aetjVarA;
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
        aetl aetlVar = this.g;
        if (!z) {
            return aetlVar.h - this.d;
        }
        return Math.min(aetlVar.h - this.d, ((long) ((aetlVar.e() / aetlVar.e) * (this.c - this.b))) + (this.e ? 1L : 0L));
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

    public aetj(aetl aetlVar, int i, int i2, boolean z) {
        this.g = aetlVar;
        this.d = 0;
        this.b = i;
        this.c = i2;
        this.e = z;
        this.f = true;
    }
}
