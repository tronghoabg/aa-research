package android.support.v7.widget;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class bq {

    /* renamed from: a, reason: collision with root package name */
    long f1172a = 0;

    /* renamed from: b, reason: collision with root package name */
    bq f1173b;

    bq() {
    }

    private final void h() {
        if (this.f1173b == null) {
            this.f1173b = new bq();
        }
    }

    final int a(int i2) {
        bq bqVar = this.f1173b;
        if (bqVar == null) {
            long j2 = this.f1172a;
            return i2 >= 64 ? Long.bitCount(j2) : Long.bitCount(((1 << i2) - 1) & j2);
        }
        if (i2 < 64) {
            return Long.bitCount(((1 << i2) - 1) & this.f1172a);
        }
        return bqVar.a(i2 - 64) + Long.bitCount(this.f1172a);
    }

    final void b(int i2) {
        if (i2 < 64) {
            this.f1172a &= ~(1 << i2);
            return;
        }
        bq bqVar = this.f1173b;
        if (bqVar != null) {
            bqVar.b(i2 - 64);
        }
    }

    final void c(int i2, boolean z) {
        if (i2 >= 64) {
            h();
            this.f1173b.c(i2 - 64, z);
            return;
        }
        long j2 = this.f1172a;
        boolean z2 = (Long.MIN_VALUE & j2) != 0;
        long j3 = (1 << i2) - 1;
        long j4 = j2 & j3;
        long j5 = j2 & (~j3);
        this.f1172a = (j5 + j5) | j4;
        if (z) {
            e(i2);
        } else {
            b(i2);
        }
        if (z2 || this.f1173b != null) {
            h();
            this.f1173b.c(0, z2);
        }
    }

    final void d() {
        this.f1172a = 0L;
        bq bqVar = this.f1173b;
        if (bqVar != null) {
            bqVar.d();
        }
    }

    final void e(int i2) {
        if (i2 < 64) {
            this.f1172a |= 1 << i2;
        } else {
            h();
            this.f1173b.e(i2 - 64);
        }
    }

    final boolean f(int i2) {
        if (i2 < 64) {
            return ((1 << i2) & this.f1172a) != 0;
        }
        h();
        return this.f1173b.f(i2 - 64);
    }

    final boolean g(int i2) {
        if (i2 >= 64) {
            h();
            return this.f1173b.g(i2 - 64);
        }
        long j2 = 1 << i2;
        long j3 = this.f1172a;
        boolean z = (j3 & j2) != 0;
        long j4 = j3 & (~j2);
        this.f1172a = j4;
        long j5 = j2 - 1;
        this.f1172a = (j5 & j4) | Long.rotateRight((~j5) & j4, 1);
        bq bqVar = this.f1173b;
        if (bqVar != null) {
            if (bqVar.f(0)) {
                e(63);
            }
            this.f1173b.g(0);
        }
        return z;
    }

    public final String toString() {
        if (this.f1173b == null) {
            return Long.toBinaryString(this.f1172a);
        }
        return this.f1173b.toString() + "xx" + Long.toBinaryString(this.f1172a);
    }
}
