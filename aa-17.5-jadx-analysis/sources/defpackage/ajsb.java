package defpackage;

import java.io.IOException;
import org.apache.commons.logging.Log;

@Deprecated
/* loaded from: classes2.dex */
public final class ajsb extends ajrz {
    @Override // defpackage.ajpi
    public final void a(ajph ajphVar, akba akbaVar) throws ajpd, IOException {
        ahgm.e(akbaVar, "HTTP context");
        if (ajphVar.k("Proxy-Authorization")) {
            return;
        }
        ajsx ajsxVar = (ajsx) akbaVar.v("http.connection");
        if (ajsxVar == null) {
            this.a.debug("HTTP connection not set in the context");
            return;
        }
        if (ajsxVar.m().g()) {
            return;
        }
        ajqe ajqeVar = (ajqe) akbaVar.v("http.auth.proxy-scope");
        if (ajqeVar == null) {
            this.a.debug("Proxy auth state not set in the context");
            return;
        }
        Log log = this.a;
        if (log.isDebugEnabled()) {
            log.debug("Proxy auth state: ".concat(String.valueOf(String.valueOf(ajqeVar.a))));
        }
        b(ajqeVar, ajphVar, akbaVar);
    }
}
