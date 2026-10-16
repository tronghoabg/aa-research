package defpackage;

import java.util.Queue;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Deprecated
/* loaded from: classes2.dex */
abstract class ajrz implements ajpi {
    final Log a = LogFactory.getLog(getClass());

    private static final ajoy c(ajpy ajpyVar, ajqj ajqjVar, ajph ajphVar, akba akbaVar) throws ajqf {
        return ajpyVar instanceof ajqi ? ((ajqi) ajpyVar).g(ajqjVar, ajphVar, akbaVar) : ajpyVar.c(ajqjVar, ajphVar);
    }

    final void b(ajqe ajqeVar, ajph ajphVar, akba akbaVar) {
        ajpy ajpyVar = ajqeVar.b;
        ajqj ajqjVar = ajqeVar.c;
        int iOrdinal = ajqeVar.a.ordinal();
        if (iOrdinal == 1) {
            Queue queue = ajqeVar.d;
            if (queue != null) {
                while (!queue.isEmpty()) {
                    ajpw ajpwVar = (ajpw) queue.remove();
                    ajpy ajpyVar2 = ajpwVar.a;
                    ajqj ajqjVar2 = ajpwVar.b;
                    ajqeVar.b(ajpyVar2, ajqjVar2);
                    Log log = this.a;
                    if (log.isDebugEnabled()) {
                        log.debug("Generating response to an authentication challenge using " + ajpyVar2.b() + " scheme");
                    }
                    try {
                        ajphVar.f(c(ajpyVar2, ajqjVar2, ajphVar, akbaVar));
                        return;
                    } catch (ajqf e) {
                        Log log2 = this.a;
                        if (log2.isWarnEnabled()) {
                            log2.warn(ajpyVar2.toString() + " authentication error: " + e.getMessage());
                        }
                    }
                }
                return;
            }
            ahkp.c(ajpyVar, "Auth scheme");
        } else {
            if (iOrdinal == 3) {
                return;
            }
            if (iOrdinal == 4) {
                ahkp.c(ajpyVar, "Auth scheme");
                if (ajpyVar.f()) {
                    return;
                }
            }
        }
        if (ajpyVar != null) {
            try {
                ajphVar.f(c(ajpyVar, ajqjVar, ajphVar, akbaVar));
            } catch (ajqf e2) {
                Log log3 = this.a;
                if (log3.isErrorEnabled()) {
                    log3.error(ajpyVar.toString() + " authentication error: " + e2.getMessage());
                }
            }
        }
    }
}
