package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Deprecated
/* loaded from: classes2.dex */
public final class ajwl implements ajrd {
    private final Log a = LogFactory.getLog(getClass());

    @Override // defpackage.ajrd
    public final URI a(ajpj ajpjVar, akba akbaVar) throws ajps {
        URI uriD;
        ajoy ajoyVarHW = ajpjVar.hW("location");
        if (ajoyVarHW == null) {
            throw new ajps("Received redirect response " + String.valueOf(ajpjVar.p()) + " but no location header");
        }
        Log log = this.a;
        String strC = ajoyVarHW.c();
        if (log.isDebugEnabled()) {
            log.debug(a.bq(strC, "Redirect requested to location '", "'"));
        }
        try {
            URI uri = new URI(strC);
            akas akasVarHX = ajpjVar.hX();
            if (!uri.isAbsolute()) {
                if (akasVarHX.g()) {
                    throw new ajps(a.bW(uri, "Relative redirect location '", "' not allowed"));
                }
                ajpe ajpeVar = (ajpe) akbaVar.v("http.target_host");
                ahkp.c(ajpeVar, "Target host");
                try {
                    uri = ajsi.b(ajsi.d(new URI(((ajph) akbaVar.v("http.request")).p().c), ajpeVar, ajsi.b), uri);
                } catch (URISyntaxException e) {
                    throw new ajps(e.getMessage(), e);
                }
            }
            if (!akasVarHX.f()) {
                return uri;
            }
            ajwv ajwvVar = (ajwv) akbaVar.v("http.protocol.redirect-locations");
            if (ajwvVar == null) {
                ajwvVar = new ajwv();
                akbaVar.x("http.protocol.redirect-locations", ajwvVar);
            }
            if (uri.getFragment() != null) {
                try {
                    uriD = ajsi.d(uri, new ajpe(uri.getHost(), uri.getPort(), uri.getScheme()), ajsi.b);
                } catch (URISyntaxException e2) {
                    throw new ajps(e2.getMessage(), e2);
                }
            } else {
                uriD = uri;
            }
            if (ajwvVar.b(uriD)) {
                throw new ajqt(a.bV(uriD, "Circular redirect to '", "'"));
            }
            ajwvVar.a(uriD);
            return uri;
        } catch (URISyntaxException e3) {
            throw new ajps("Invalid redirect URI: ".concat(String.valueOf(strC)), e3);
        }
    }

    @Override // defpackage.ajrd
    public final boolean b(ajpj ajpjVar, akba akbaVar) {
        int i = ajpjVar.p().b;
        if (i != 307) {
            switch (i) {
                case 301:
                case 302:
                    break;
                case 303:
                    return true;
                default:
                    return false;
            }
        }
        String str = ((ajph) akbaVar.v("http.request")).p().b;
        return str.equalsIgnoreCase("GET") || str.equalsIgnoreCase("HEAD");
    }
}
