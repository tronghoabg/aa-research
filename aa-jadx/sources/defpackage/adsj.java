package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class adsj implements defpackage.adyk {
    protected final void a(int i) {
        if (f() < i) {
            throw new java.lang.IndexOutOfBoundsException();
        }
    }

    @Override // defpackage.adyk
    public void c() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.adyk
    public boolean d() {
        return false;
    }

    @Override // defpackage.adyk
    public void b() {
    }

    @Override // defpackage.adyk, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
