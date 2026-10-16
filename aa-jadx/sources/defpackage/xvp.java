package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xvp implements defpackage.xvr {
    private final defpackage.xvg a;

    public xvp(defpackage.xvg xvgVar) {
        this.a = xvgVar;
    }

    @Override // defpackage.xvr, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
