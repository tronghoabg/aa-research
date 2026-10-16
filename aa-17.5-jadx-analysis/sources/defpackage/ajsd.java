package defpackage;

import java.io.IOException;
import java.util.NoSuchElementException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* loaded from: classes2.dex */
public final class ajsd implements ajpl {
    private final Log a = LogFactory.getLog(getClass());

    private static String a(ajui ajuiVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(ajuiVar.c());
        sb.append("=\"");
        String strE = ajuiVar.e();
        if (strE != null) {
            if (strE.length() > 100) {
                strE = String.valueOf(strE.substring(0, 100)).concat("...");
            }
            sb.append(strE);
        }
        sb.append("\", version:");
        sb.append(Integer.toString(ajuiVar.a()));
        sb.append(", domain:");
        sb.append(ajuiVar.b());
        sb.append(", path:");
        sb.append(ajuiVar.d());
        sb.append(", expiry:");
        sb.append(ajuiVar.f());
        return sb.toString();
    }

    private final void c(akaf akafVar, ajuo ajuoVar, ajul ajulVar, ajqw ajqwVar) throws NoSuchElementException {
        while (akafVar.hasNext()) {
            ajoy ajoyVarB = akafVar.b();
            try {
                for (ajui ajuiVar : ajuoVar.c(ajoyVarB, ajulVar)) {
                    try {
                        ajuoVar.e(ajuiVar, ajulVar);
                        ajqwVar.b(ajuiVar);
                        Log log = this.a;
                        if (log.isDebugEnabled()) {
                            log.debug("Cookie accepted [" + a(ajuiVar) + "]");
                        }
                    } catch (ajut e) {
                        Log log2 = this.a;
                        if (log2.isWarnEnabled()) {
                            log2.warn("Cookie rejected [" + a(ajuiVar) + "] " + e.getMessage());
                        }
                    }
                }
            } catch (ajut e2) {
                Log log3 = this.a;
                if (log3.isWarnEnabled()) {
                    log3.warn("Invalid cookie header: \"" + String.valueOf(ajoyVarB) + "\". " + e2.getMessage());
                }
            }
        }
    }

    @Override // defpackage.ajpl
    public final void b(ajpj ajpjVar, akba akbaVar) throws ajpd, IOException, NoSuchElementException {
        ahgm.e(akbaVar, "HTTP context");
        ajrw ajrwVarG = ajrw.g(akbaVar);
        ajuo ajuoVar = (ajuo) ajrwVarG.j("http.cookie-spec", ajuo.class);
        if (ajuoVar == null) {
            this.a.debug("Cookie spec not specified in HTTP context");
            return;
        }
        ajqw ajqwVarD = ajrwVarG.d();
        if (ajqwVarD == null) {
            this.a.debug("Cookie store not specified in HTTP context");
            return;
        }
        ajul ajulVar = (ajul) ajrwVarG.j("http.cookie-origin", ajul.class);
        if (ajulVar == null) {
            this.a.debug("Cookie origin not specified in HTTP context");
            return;
        }
        c(ajpjVar.o("Set-Cookie"), ajuoVar, ajulVar, ajqwVarD);
        if (ajuoVar.a() > 0) {
            c(ajpjVar.o("Set-Cookie2"), ajuoVar, ajulVar, ajqwVarD);
        }
    }
}
