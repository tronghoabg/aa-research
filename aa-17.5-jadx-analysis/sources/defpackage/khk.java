package defpackage;

/* loaded from: classes2.dex */
public final class khk {
    public long a;
    public long b;
    public long c;
    public String d;
    public long e;
    public long f;
    public long g;
    public String h;
    public yfq i;
    public boolean j;
    public byte k;

    public final void a(long j) {
        this.e = j;
        this.k = (byte) (this.k | 8);
    }

    public final void b(long j) {
        this.c = j;
        this.k = (byte) (this.k | 4);
    }

    public final void c(long j) {
        this.g = j;
        this.k = (byte) (this.k | 32);
    }

    public final void d(long j) {
        this.b = j;
        this.k = (byte) (this.k | 2);
    }

    public final void e(long j) {
        this.f = j;
        this.k = (byte) (this.k | 16);
    }

    public final void f(long j) {
        this.a = j;
        this.k = (byte) (this.k | 1);
    }

    public final void g(boolean z) {
        this.j = z;
        this.k = (byte) (this.k | 64);
    }

    public final void h(yfq yfqVar) {
        if (yfqVar == null) {
            throw new NullPointerException("Null phoneNumbers");
        }
        this.i = yfqVar;
    }
}
