package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class khm {
    public long a;
    public long b;
    public java.lang.String c;
    public long d;
    public long e;
    public boolean f;
    public java.lang.String g;
    public int h;
    public defpackage.ygw i;
    public boolean j;
    public byte k;

    public final void a(long j) {
        this.b = j;
        this.k = (byte) (this.k | 2);
    }

    public final void b(int i) {
        this.h = i;
        this.k = (byte) (this.k | 32);
    }

    public final void c(long j) {
        this.e = j;
        this.k = (byte) (this.k | 8);
    }

    public final void d(long j) {
        this.a = j;
        this.k = (byte) (this.k | 1);
    }

    public final void e(boolean z) {
        this.f = z;
        this.k = (byte) (this.k | 16);
    }

    public final void f(boolean z) {
        this.j = z;
        this.k = (byte) (this.k | 64);
    }

    public final void g(defpackage.ygw ygwVar) {
        if (ygwVar == null) {
            throw new java.lang.NullPointerException("Null phoneNumbers");
        }
        this.i = ygwVar;
    }

    public final void h(long j) {
        this.d = j;
        this.k = (byte) (this.k | 4);
    }
}
