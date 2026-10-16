package defpackage;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* loaded from: classes2.dex */
public final class ajsa implements ajpi {
    private final Log a = LogFactory.getLog(getClass());

    @Override // defpackage.ajpi
    public final void a(ajph ajphVar, akba akbaVar) throws ajpd, IOException {
        if (ajphVar.p().b.equalsIgnoreCase("CONNECT")) {
            ajphVar.h("Proxy-Connection", "Keep-Alive");
            return;
        }
        ajtk ajtkVarH = ajrw.g(akbaVar).h();
        if (ajtkVarH == null) {
            this.a.debug("Connection route not set in the context");
            return;
        }
        if ((ajtkVarH.a() == 1 || ajtkVarH.g()) && !ajphVar.k("Connection")) {
            ajphVar.g("Connection", "Keep-Alive");
        }
        if (ajtkVarH.a() != 2 || ajtkVarH.g() || ajphVar.k("Proxy-Connection")) {
            return;
        }
        ajphVar.g("Proxy-Connection", "Keep-Alive");
    }
}
