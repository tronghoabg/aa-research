package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ke {
    long a = 0;
    defpackage.ke b;

    private final void h() {
        if (this.b == null) {
            this.b = new defpackage.ke();
        }
    }

    final int a(int i) {
        defpackage.ke keVar = this.b;
        if (keVar == null) {
            long j = this.a;
            return i >= 64 ? java.lang.Long.bitCount(j) : java.lang.Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return java.lang.Long.bitCount(((1 << i) - 1) & this.a);
        }
        return keVar.a(i - 64) + java.lang.Long.bitCount(this.a);
    }

    final void b(int i) {
        if (i < 64) {
            this.a &= ~(1 << i);
            return;
        }
        defpackage.ke keVar = this.b;
        if (keVar != null) {
            keVar.b(i - 64);
        }
    }

    final void c(int i, boolean z) {
        if (i >= 64) {
            h();
            this.b.c(i - 64, z);
            return;
        }
        long j = this.a;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        long j3 = j & j2;
        long j4 = j & (~j2);
        this.a = (j4 + j4) | j3;
        if (z) {
            e(i);
        } else {
            b(i);
        }
        if (z2 || this.b != null) {
            h();
            this.b.c(0, z2);
        }
    }

    public final void d() {
        this.a = 0L;
        defpackage.ke keVar = this.b;
        if (keVar != null) {
            keVar.d();
        }
    }

    public final void e(int i) {
        if (i < 64) {
            this.a |= 1 << i;
        } else {
            h();
            this.b.e(i - 64);
        }
    }

    final boolean f(int i) {
        if (i < 64) {
            return ((1 << i) & this.a) != 0;
        }
        h();
        return this.b.f(i - 64);
    }

    final boolean g(int i) {
        if (i >= 64) {
            h();
            return this.b.g(i - 64);
        }
        long j = 1 << i;
        long j2 = this.a;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.a = j3;
        long j4 = j - 1;
        this.a = (j4 & j3) | java.lang.Long.rotateRight((~j4) & j3, 1);
        defpackage.ke keVar = this.b;
        if (keVar != null) {
            if (keVar.f(0)) {
                e(63);
            }
            this.b.g(0);
        }
        return z;
    }

    public final java.lang.String toString() {
        if (this.b == null) {
            return java.lang.Long.toBinaryString(this.a);
        }
        return this.b.toString() + "xx" + java.lang.Long.toBinaryString(this.a);
    }
}
