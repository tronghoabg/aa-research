package Lf;

/* loaded from: classes5.dex */
public final class e extends h {

    /* renamed from: c, reason: collision with root package name */
    public static final e f7122c;

    static {
        int i5 = k.f7130c;
        int i10 = k.f7131d;
        long j8 = k.f7132e;
        String str = k.f7128a;
        e eVar = new e();
        eVar.f7124b = new c(i5, j8, i10, str);
        f7122c = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // Ef.A
    public final String toString() {
        return "Dispatchers.Default";
    }
}
