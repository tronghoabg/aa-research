package defpackage;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* loaded from: classes2.dex */
public final class ajrx implements ajpi {
    private final Log a = LogFactory.getLog(getClass());

    @Override // defpackage.ajpi
    public final void a(ajph ajphVar, akba akbaVar) throws ajpd, IOException {
        URI uri;
        ajoy ajoyVarD;
        ahgm.e(akbaVar, "HTTP context");
        if (ajphVar.p().b.equalsIgnoreCase("CONNECT")) {
            return;
        }
        ajrw ajrwVarG = ajrw.g(akbaVar);
        ajqw ajqwVarD = ajrwVarG.d();
        if (ajqwVarD == null) {
            this.a.debug("Cookie store not specified in HTTP context");
            return;
        }
        ajsl ajslVarI = ajrwVarG.i("http.cookiespec-registry");
        if (ajslVarI == null) {
            this.a.debug("CookieSpec registry not specified in HTTP context");
            return;
        }
        ajpe ajpeVarL = ajrwVarG.l();
        if (ajpeVarL == null) {
            this.a.debug("Target host not set in the context");
            return;
        }
        ajtk ajtkVarH = ajrwVarG.h();
        if (ajtkVarH == null) {
            this.a.debug("Connection route not set in the context");
            return;
        }
        String str = ajrwVarG.f().f;
        Log log = this.a;
        boolean zIsDebugEnabled = log.isDebugEnabled();
        if (str == null) {
            str = "default";
        }
        if (zIsDebugEnabled) {
            log.debug("CookieSpec selected: ".concat(str));
        }
        if (ajphVar instanceof ajrt) {
            uri = ((ajrt) ajphVar).t();
        } else {
            try {
                uri = new URI(ajphVar.p().c);
            } catch (URISyntaxException unused) {
                uri = null;
            }
        }
        String path = uri != null ? uri.getPath() : null;
        String str2 = ajpeVarL.a;
        int i = ajpeVarL.c;
        if (i < 0) {
            i = ajtkVarH.d().c;
        }
        boolean z = false;
        if (i < 0) {
            i = 0;
        }
        if (true == ahku.b(path)) {
            path = "/";
        }
        ajul ajulVar = new ajul(str2, i, path, ajtkVarH.f());
        ajuo ajuoVarB = ((ajuq) ajslVarI.a(str)).b(ajrwVarG);
        List<ajui> listA = ajqwVarD.a();
        ArrayList arrayList = new ArrayList();
        Date date = new Date();
        for (ajui ajuiVar : listA) {
            if (ajuiVar.g(date)) {
                Log log2 = this.a;
                if (log2.isDebugEnabled()) {
                    log2.debug(a.bV(ajuiVar, "Cookie ", " expired"));
                }
                z = true;
            } else if (ajuoVarB.f(ajuiVar, ajulVar)) {
                Log log3 = this.a;
                if (log3.isDebugEnabled()) {
                    log3.debug("Cookie " + String.valueOf(ajuiVar) + " match " + ajulVar.toString());
                }
                arrayList.add(ajuiVar);
            }
        }
        if (z) {
            ajqwVarD.c(date);
        }
        if (!arrayList.isEmpty()) {
            Iterator it = ajuoVarB.b(arrayList).iterator();
            while (it.hasNext()) {
                ajphVar.f((ajoy) it.next());
            }
        }
        if (ajuoVarB.a() > 0 && (ajoyVarD = ajuoVarB.d()) != null) {
            ajphVar.f(ajoyVarD);
        }
        akbaVar.x("http.cookie-spec", ajuoVarB);
        akbaVar.x("http.cookie-origin", ajulVar);
    }
}
