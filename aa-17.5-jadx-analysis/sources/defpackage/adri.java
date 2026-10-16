package defpackage;

/* loaded from: classes3.dex */
public abstract class adri implements adxi {
    protected final void a(int i) {
        if (f() < i) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // defpackage.adxi
    public void c() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.adxi
    public boolean d() {
        return false;
    }

    @Override // defpackage.adxi
    public void b() {
    }

    @Override // defpackage.adxi, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
