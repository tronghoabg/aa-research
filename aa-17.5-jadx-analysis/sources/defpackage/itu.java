package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.io.PrintWriter;

/* loaded from: classes2.dex */
public final class itu implements itt, jcj {
    public static final yph a = yph.c("CAR.MEDIA.BUFFERED");

    @Override // defpackage.jbo
    public final iyw a(xnz xnzVar) {
        if ((xnzVar.b & 65536) == 0) {
            return null;
        }
        ((ype) a.l().ai((char) 1343)).u("onServiceDiscovery");
        itq.a(this);
        return this;
    }

    @Override // defpackage.iyw
    public final jbj b(jbn jbnVar) {
        return new jck(this, jbnVar);
    }

    @Override // defpackage.iyw
    public final jcv c() {
        return roc.aH();
    }

    @Override // defpackage.iyw
    public final jcv d() {
        return roc.aH();
    }

    @Override // defpackage.iyw
    public final void m(PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.iyw
    public final void q() {
        throw null;
    }

    @Override // defpackage.iyw
    public final void r(jbj jbjVar) {
        izq izqVar = ima.a;
        int i = its.a;
        HandlerThread handlerThread = new HandlerThread("BUFFERED_MEDIA_WORKER", 10);
        handlerThread.start();
        new Handler(handlerThread.getLooper());
    }
}
