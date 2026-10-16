package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kho {
    public long a;
    public long b;
    public long c;
    public java.lang.String d;
    public long e;
    public long f;
    public long g;
    public java.lang.String h;
    public defpackage.ygw i;
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

    public final void h(defpackage.ygw ygwVar) {
        if (ygwVar == null) {
            throw new java.lang.NullPointerException("Null phoneNumbers");
        }
        this.i = ygwVar;
    }
}
