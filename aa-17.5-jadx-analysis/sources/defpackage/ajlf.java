package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class ajlf implements Closeable {
    public static final Logger a;
    public final ajna b;
    private final ajle c;
    private final ajkr d;

    static {
        Logger logger = Logger.getLogger(ajku.class.getName());
        logger.getClass();
        a = logger;
    }

    public ajlf(ajna ajnaVar) {
        this.b = ajnaVar;
        ajle ajleVar = new ajle(ajnaVar);
        this.c = ajleVar;
        this.d = new ajkr(ajleVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        throw new java.io.IOException("Header index too large " + r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List b(int r2, int r3, int r4, int r5) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajlf.b(int, int, int, int):java.util.List");
    }

    private final void c() throws IOException {
        ajna ajnaVar = this.b;
        ajnaVar.f();
        ajnaVar.d();
        int i = ajiq.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0271, code lost:
    
        throw new java.io.IOException(defpackage.a.bp(r8, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(boolean r22, defpackage.ajlb r23) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajlf.a(boolean, ajlb):boolean");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.close();
    }
}
