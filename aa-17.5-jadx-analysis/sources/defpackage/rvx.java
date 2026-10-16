package defpackage;

import android.os.Handler;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class rvx extends rum {
    private static final ypf e = ols.R("XFER.Lite");
    public final rsp d;

    public rvx(int i, rvo rvoVar, rsp rspVar, Handler handler) {
        super(i, rvoVar, handler);
        this.d = rspVar;
    }

    @Override // defpackage.rvm
    public final void b(qtk qtkVar, ByteBuffer byteBuffer) {
        byteBuffer.flip();
        int i = qtkVar.d;
        int i2 = qtkVar.c;
        this.c.post(new rpo(this, byteBuffer, 3, null));
    }

    @Override // defpackage.rvm
    public final void c(int i) {
        this.c.post(new rgm(this, i, 5, null));
    }

    @Override // defpackage.rvm
    public final void d() {
        this.c.post(new rsv(this, 3));
    }

    @Override // defpackage.rtc
    public final void e(ByteBuffer byteBuffer, rtb rtbVar) {
        byteBuffer.flip();
        char c = (char) byteBuffer.getShort();
        byteBuffer.remaining();
        if (this.b.e(this.a, rtbVar, c, byteBuffer)) {
            return;
        }
        e.h().ai(8429).u("Forward throttled, dropping packet");
    }

    @Override // defpackage.rvm
    public final void f(int i) {
        this.c.post(new rgm(this, i, 4, null));
    }
}
