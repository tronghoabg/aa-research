package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adzh {
    final int a;
    final int b;
    final int c;
    final java.util.concurrent.atomic.AtomicInteger d;

    public adzh(float f, float f2) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger();
        this.d = atomicInteger;
        this.c = (int) (f2 * 1000.0f);
        int i = (int) (f * 1000.0f);
        this.a = i;
        this.b = i / 2;
        atomicInteger.set(i);
    }

    final boolean a() {
        return this.d.get() > this.b;
    }

    final boolean b() {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = this.d;
            i = atomicInteger.get();
            if (i == 0) {
                return false;
            }
            i2 = i - 1000;
        } while (!atomicInteger.compareAndSet(i, java.lang.Math.max(i2, 0)));
        return i2 > this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.adzh)) {
            return false;
        }
        defpackage.adzh adzhVar = (defpackage.adzh) obj;
        return this.a == adzhVar.a && this.c == adzhVar.c;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.c));
    }
}
