package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* loaded from: classes2.dex */
public final class ajwm implements ajre {
    private final Log a = LogFactory.getLog(getClass());
    private final String[] b;

    static {
        new ajwm();
    }

    public ajwm() {
        String[] strArr = (String[]) new String[]{"GET", "HEAD"}.clone();
        Arrays.sort(strArr);
        this.b = strArr;
    }

    protected static final URI e(String str) throws ajps {
        try {
            return new URI(str);
        } catch (URISyntaxException e) {
            throw new ajps("Invalid redirect URI: ".concat(String.valueOf(str)), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x010c A[PHI: r12
  0x010c: PHI (r12v7 java.nio.charset.Charset) = (r12v6 java.nio.charset.Charset), (r12v10 java.nio.charset.Charset), (r12v11 java.nio.charset.Charset) binds: [B:18:0x005b, B:66:0x010c, B:57:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.ajre
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ajrt a(defpackage.ajph r13, defpackage.ajpj r14, defpackage.akba r15) throws defpackage.ajps, java.lang.UnsupportedOperationException, defpackage.ajpr, java.io.IOException, java.nio.charset.UnsupportedCharsetException {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajwm.a(ajph, ajpj, akba):ajrt");
    }

    @Override // defpackage.ajre
    public final boolean b(ajph ajphVar, ajpj ajpjVar, akba akbaVar) throws ajps {
        int i = ajpjVar.p().b;
        String str = ajphVar.p().b;
        ajoy ajoyVarHW = ajpjVar.hW("location");
        if (i != 307 && i != 308) {
            switch (i) {
                case 301:
                    break;
                case 302:
                    return d(str) && ajoyVarHW != null;
                case 303:
                    return true;
                default:
                    return false;
            }
        }
        return d(str);
    }

    public final URI c(ajph ajphVar, ajpj ajpjVar, akba akbaVar) throws ajps {
        ahgm.e(akbaVar, "HTTP context");
        ajrw ajrwVarG = ajrw.g(akbaVar);
        ajoy ajoyVarHW = ajpjVar.hW("location");
        if (ajoyVarHW == null) {
            throw new ajps("Received redirect response " + String.valueOf(ajpjVar.p()) + " but no location header");
        }
        Log log = this.a;
        String strC = ajoyVarHW.c();
        if (log.isDebugEnabled()) {
            log.debug(a.bq(strC, "Redirect requested to location '", "'"));
        }
        ajri ajriVarF = ajrwVarG.f();
        try {
            URI uriA = ajsi.a(e(strC));
            if (!uriA.isAbsolute()) {
                if (!ajriVarF.h) {
                    throw new ajps(a.bV(uriA, "Relative redirect location '", "' not allowed"));
                }
                ajpe ajpeVarL = ajrwVarG.l();
                ahkp.c(ajpeVarL, "Target host");
                uriA = ajsi.b(ajsi.d(new URI(ajphVar.p().c), ajpeVarL, ajsi.a), uriA);
            }
            ajwv ajwvVar = (ajwv) ajrwVarG.v("http.protocol.redirect-locations");
            if (ajwvVar == null) {
                ajwvVar = new ajwv();
                akbaVar.x("http.protocol.redirect-locations", ajwvVar);
            }
            if (!ajriVarF.i && ajwvVar.b(uriA)) {
                throw new ajqt(a.bV(uriA, "Circular redirect to '", "'"));
            }
            ajwvVar.a(uriA);
            return uriA;
        } catch (URISyntaxException e) {
            throw new ajps(e.getMessage(), e);
        }
    }

    protected final boolean d(String str) {
        return Arrays.binarySearch(this.b, str) >= 0;
    }
}
