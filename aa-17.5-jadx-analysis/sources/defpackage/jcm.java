package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class jcm implements Runnable {
    public volatile boolean a = true;
    private final jcl b;
    private final ByteBuffer c;

    public jcm(jcl jclVar, ByteBuffer byteBuffer) {
        this.b = jclVar;
        this.c = byteBuffer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            this.b.e();
        }
        this.b.g(this.c);
    }
}
