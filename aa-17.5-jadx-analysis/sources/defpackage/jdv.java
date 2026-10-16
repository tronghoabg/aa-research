package defpackage;

import android.os.Handler;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class jdv extends jax {
    public static final ypf d = ols.R("XFER.Proxy");
    public final izo e;

    public jdv(jcz jczVar, izo izoVar, Handler handler) {
        super(izoVar.a(), jczVar, handler);
        this.e = izoVar;
    }

    @Override // defpackage.jcw
    public final void b(qtk qtkVar, ByteBuffer byteBuffer) {
        this.c.post(new jda((Object) this, (Object) byteBuffer, (Object) qtkVar, 2, (byte[]) null));
    }

    @Override // defpackage.jcw
    public final void c() {
        throw new UnsupportedOperationException("Cannot receive channel open from transfer channel");
    }

    @Override // defpackage.izo
    public final void d(jcn jcnVar, izn iznVar) {
        throw null;
    }

    @Override // defpackage.jcw
    public final void e() {
        throw new UnsupportedOperationException("Cannot receive channel close from transfer channel");
    }

    @Override // defpackage.jcw
    public final void f() {
        throw new UnsupportedOperationException("Cannot receive message sent from transfer channel");
    }
}
