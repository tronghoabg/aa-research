package e.a.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class d implements ho {
    protected final void a(int i2) {
        if (f() < i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // e.a.d.ho
    public void b() {
    }

    @Override // e.a.d.ho
    public void c() {
        throw new UnsupportedOperationException();
    }

    @Override // e.a.d.ho, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // e.a.d.ho
    public boolean d() {
        return false;
    }
}
