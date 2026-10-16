package defpackage;

/* loaded from: classes2.dex */
public final class ajdl extends ajdm {
    public static final ajdl a = new ajdl();

    private ajdl() {
        super(ajdp.c, ajdp.d, ajdp.e, ajdp.a);
    }

    @Override // defpackage.ajdm, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.aitu
    public final aitu g(int i) {
        afrg.v(i);
        return i >= ajdp.c ? this : super.g(i);
    }

    @Override // defpackage.aitu
    public final String toString() {
        return "Dispatchers.Default";
    }
}
