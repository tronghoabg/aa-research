package defpackage;

/* loaded from: classes3.dex */
public final class uej {
    private int a;
    private int b;
    private int c;
    private long d;
    private long e;
    private byte f;

    public final uek a() {
        if (this.f == 31) {
            return new uek(this.a, this.b, this.c, this.d, this.e);
        }
        throw new IllegalStateException();
    }

    public final void b(int i) {
        this.a = i;
        this.f = (byte) (this.f | 1);
    }

    public final void c(int i) {
        this.b = i;
        this.f = (byte) (this.f | 2);
    }

    public final void d(int i) {
        this.c = i;
        this.f = (byte) (this.f | 4);
    }

    public final void e(long j) {
        this.e = j;
        this.f = (byte) (this.f | 16);
    }

    public final void f(long j) {
        this.d = j;
        this.f = (byte) (this.f | 8);
    }
}
