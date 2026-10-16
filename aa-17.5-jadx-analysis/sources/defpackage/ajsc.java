package defpackage;

import java.io.IOException;
import org.apache.commons.logging.Log;

@Deprecated
/* loaded from: classes2.dex */
public final class ajsc extends ajrz {
    @Override // defpackage.ajpi
    public final void a(ajph ajphVar, akba akbaVar) throws ajpd, IOException {
        ahgm.e(akbaVar, "HTTP context");
        if (ajphVar.p().b.equalsIgnoreCase("CONNECT") || ajphVar.k("Authorization")) {
            return;
        }
        ajqe ajqeVar = (ajqe) akbaVar.v("http.auth.target-scope");
        if (ajqeVar == null) {
            this.a.debug("Target auth state not set in the context");
            return;
        }
        Log log = this.a;
        if (log.isDebugEnabled()) {
            log.debug("Target auth state: ".concat(String.valueOf(String.valueOf(ajqeVar.a))));
        }
        b(ajqeVar, ajphVar, akbaVar);
    }
}
