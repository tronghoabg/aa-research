package defpackage;

import java.nio.ByteBuffer;
import java.util.Queue;

/* loaded from: classes.dex */
public final class jcd extends jbj {
    private final jcc a;
    private volatile boolean b;

    public jcd(jcc jccVar, jbn jbnVar) {
        super(16, jccVar, jbnVar, 0);
        this.a = jccVar;
    }

    @Override // defpackage.jbj, defpackage.iyz
    public final void P(int i) {
        this.b = false;
        synchronized (this) {
            notify();
        }
    }

    @Override // defpackage.jbj, defpackage.iyz
    public final void Q() {
        super.Q();
        this.b = true;
        synchronized (this) {
            notify();
        }
    }

    @Override // defpackage.jbj, defpackage.iyx
    public final void S(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr, 0, iRemaining);
        yph yphVar = ild.a;
        ((ype) yphVar.l().ai(261)).w("onData. data length=%d", iRemaining);
        jcc jccVar = this.a;
        synchronized (((ild) jccVar).h) {
            Queue queue = ((ild) jccVar).i;
            queue.offer(bArr);
            if (queue.size() == 1) {
                ((ype) yphVar.l().ai(263)).u("onData: No pending data. Notifying the client");
                if (!((ild) jccVar).p(iRemaining)) {
                    queue.clear();
                }
            } else {
                ((ype) yphVar.l().ai(262)).u("onData: There are pending data");
            }
        }
    }

    @Override // defpackage.jbj
    public final void a(int i, ByteBuffer byteBuffer) {
        throw new RuntimeException("Method should not be called.");
    }

    @Override // defpackage.iyx
    public final void b(int i) {
    }
}
