package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wgr implements defpackage.wft {
    private boolean a = false;

    static {
        new java.util.concurrent.atomic.AtomicInteger();
    }

    public final void b() {
        this.a = true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wgi */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, wgu] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.wft
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final java.io.File a(defpackage.ret retVar) throws wgi, java.io.IOException {
        if (this.a) {
            if (retVar.e.isEmpty()) {
                return retVar.d.c((android.net.Uri) retVar.a);
            }
            throw new wgi("Short circuit would skip transforms.");
        }
        defpackage.wgh wghVar = new defpackage.wgh(defpackage.wgs.b(retVar));
        try {
            java.io.Closeable closeable = wghVar.a;
            if (!(closeable instanceof defpackage.wgb)) {
                throw new java.io.IOException("Not convertible and fallback to pipe is disabled.");
            }
            java.io.File fileB = ((defpackage.wgb) closeable).b();
            wghVar.close();
            return fileB;
        } catch (java.lang.Throwable th) {
            try {
                wghVar.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
