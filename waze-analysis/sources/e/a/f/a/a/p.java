package e.a.f.a.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private int f47540a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f47541b = new int[10];

    public final int a(int i2) {
        return this.f47541b[i2];
    }

    final int b() {
        if ((this.f47540a & 2) != 0) {
            return this.f47541b[1];
        }
        return -1;
    }

    final int c(int i2) {
        return (this.f47540a & 32) != 0 ? this.f47541b[5] : i2;
    }

    final int d() {
        return Integer.bitCount(this.f47540a);
    }

    public final boolean e(int i2) {
        return (this.f47540a & (1 << i2)) != 0;
    }

    public final void f(int i2, int i3) {
        if (i2 >= 10) {
            return;
        }
        this.f47540a = (1 << i2) | this.f47540a;
        this.f47541b[i2] = i3;
    }
}
