package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jck extends defpackage.jbq {
    private final defpackage.jcj a;
    private volatile boolean b;

    public jck(defpackage.jcj jcjVar, defpackage.jbu jbuVar) {
        super(16, jcjVar, jbuVar, 0);
        this.a = jcjVar;
    }

    @Override // defpackage.jbq, defpackage.izg
    public final void P(int i) {
        this.b = false;
        synchronized (this) {
            notify();
        }
    }

    @Override // defpackage.jbq, defpackage.izg
    public final void Q() {
        super.Q();
        this.b = true;
        synchronized (this) {
            notify();
        }
    }

    @Override // defpackage.jbq, defpackage.ize
    public final void S(java.nio.ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr, 0, iRemaining);
        defpackage.yqm yqmVar = defpackage.iln.a;
        ((defpackage.yqj) yqmVar.l().ai(261)).w("onData. data length=%d", iRemaining);
        defpackage.jcj jcjVar = this.a;
        synchronized (((defpackage.iln) jcjVar).h) {
            java.util.Queue queue = ((defpackage.iln) jcjVar).i;
            queue.offer(bArr);
            if (queue.size() == 1) {
                ((defpackage.yqj) yqmVar.l().ai(263)).u("onData: No pending data. Notifying the client");
                if (!((defpackage.iln) jcjVar).p(iRemaining)) {
                    queue.clear();
                }
            } else {
                ((defpackage.yqj) yqmVar.l().ai(262)).u("onData: There are pending data");
            }
        }
    }

    @Override // defpackage.jbq
    public final void a(int i, java.nio.ByteBuffer byteBuffer) {
        throw new java.lang.RuntimeException("Method should not be called.");
    }

    @Override // defpackage.ize
    public final void b(int i) {
    }
}
