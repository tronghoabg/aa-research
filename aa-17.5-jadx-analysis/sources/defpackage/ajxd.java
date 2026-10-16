package defpackage;

import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;

/* loaded from: classes2.dex */
final class ajxd implements ajsq {
    final /* synthetic */ ajtg a;
    final /* synthetic */ ajxe b;

    public ajxd(ajxe ajxeVar, ajtg ajtgVar) {
        this.a = ajtgVar;
        this.b = ajxeVar;
    }

    @Override // defpackage.ajsq
    public final ajsy a(long j, TimeUnit timeUnit) {
        ajxn ajxnVar;
        ajxe ajxeVar = this.b;
        synchronized (ajxeVar) {
            boolean z = true;
            ahkp.b(!ajxeVar.e, "Connection manager has been shut down");
            Log log = ajxeVar.b;
            boolean zIsDebugEnabled = log.isDebugEnabled();
            ajtg ajtgVar = this.a;
            if (zIsDebugEnabled) {
                log.debug(a.bX(ajtgVar, "Get connection for route "));
            }
            if (ajxeVar.d != null) {
                z = false;
            }
            ahkp.b(z, "Invalid use of BasicClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.");
            ajxk ajxkVar = ajxeVar.c;
            if (ajxkVar != null && !((ajtg) ajxkVar.b).equals(ajtgVar)) {
                ajxeVar.c.a();
                ajxeVar.c = null;
            }
            if (ajxeVar.c == null) {
                ajxeVar.c = new ajxk(log, Long.toString(ajxe.a.getAndIncrement()), ajtgVar, new ajxg(), TimeUnit.MILLISECONDS);
            }
            if (ajxeVar.c.c(System.currentTimeMillis())) {
                ajxeVar.c.a();
                ajxeVar.c.a.l();
            }
            ajxeVar.d = new ajxn(ajxeVar, ajxeVar.f, ajxeVar.c);
            ajxnVar = ajxeVar.d;
        }
        return ajxnVar;
    }

    @Override // defpackage.ajsq
    public final void b() {
    }
}
