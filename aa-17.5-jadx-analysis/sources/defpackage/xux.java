package defpackage;

/* loaded from: classes3.dex */
public final class xux implements xuv {
    private static final xux a = new xux(0);
    private final /* synthetic */ int b;

    public xux(int i) {
        this.b = i;
    }

    public static final xux a(String str) {
        if (str.length() > 127) {
            str.substring(0, 127);
        }
        return a;
    }

    public final String toString() {
        return this.b != 0 ? "NO_OP" : "NonTikTokGmmSpan";
    }

    @Override // defpackage.xul, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
