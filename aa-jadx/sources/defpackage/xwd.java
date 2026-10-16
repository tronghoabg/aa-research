package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xwd implements defpackage.xwb {
    private static final defpackage.xwd a = new defpackage.xwd(0);
    private final /* synthetic */ int b;

    public xwd(int i) {
        this.b = i;
    }

    public static final defpackage.xwd a(java.lang.String str) {
        if (str.length() > 127) {
            str.substring(0, 127);
        }
        return a;
    }

    public final java.lang.String toString() {
        return this.b != 0 ? "NO_OP" : "NonTikTokGmmSpan";
    }

    @Override // defpackage.xvr, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
