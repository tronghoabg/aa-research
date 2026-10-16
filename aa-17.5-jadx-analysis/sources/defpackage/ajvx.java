package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ajvx implements ajqq {
    public static final List a = DesugarCollections.unmodifiableList(Arrays.asList("Negotiate", "NTLM", "Digest", "Basic"));
    private final Log b = LogFactory.getLog(getClass());

    protected static final Map e(ajoy[] ajoyVarArr) throws ajqm {
        akbh akbhVar;
        int i;
        HashMap map = new HashMap(ajoyVarArr.length);
        for (ajoy ajoyVar : ajoyVarArr) {
            if (ajoyVar instanceof akak) {
                akak akakVar = (akak) ajoyVar;
                akbhVar = akakVar.a;
                i = akakVar.b;
            } else {
                String strC = ajoyVar.c();
                if (strC == null) {
                    throw new ajqm("Header value is null");
                }
                akbhVar = new akbh(strC.length());
                akbhVar.f(strC);
                i = 0;
            }
            while (i < akbhVar.b && akaz.a(akbhVar.charAt(i))) {
                i++;
            }
            int i2 = i;
            while (i2 < akbhVar.b && !akaz.a(akbhVar.charAt(i2))) {
                i2++;
            }
            map.put(akbhVar.c(i, i2).toLowerCase(Locale.ROOT), ajoyVar);
        }
        return map;
    }

    @Override // defpackage.ajqq
    public final ajpy a(Map map, ajpj ajpjVar, akba akbaVar) throws ajqf {
        ajpy ajpyVarC;
        ajqc ajqcVar = (ajqc) akbaVar.v("http.authscheme-registry");
        ahkp.c(ajqcVar, "AuthScheme registry");
        List listD = d(ajpjVar);
        if (listD == null) {
            listD = a;
        }
        Log log = this.b;
        if (log.isDebugEnabled()) {
            log.debug("Authentication schemes in the order of preference: ".concat(String.valueOf(String.valueOf(listD))));
        }
        Iterator it = listD.iterator();
        while (true) {
            if (!it.hasNext()) {
                ajpyVarC = null;
                break;
            }
            String str = (String) it.next();
            if (((ajoy) map.get(str.toLowerCase(Locale.ENGLISH))) != null) {
                if (log.isDebugEnabled()) {
                    log.debug(String.valueOf(str).concat(" authentication scheme selected"));
                }
                try {
                    ajpjVar.hX();
                    ajpyVarC = ajqcVar.c(str);
                    break;
                } catch (IllegalStateException unused) {
                    Log log2 = this.b;
                    if (log2.isWarnEnabled()) {
                        log2.warn(a.bq(str, "Authentication scheme ", " not supported"));
                    }
                }
            } else {
                Log log3 = this.b;
                if (log3.isDebugEnabled()) {
                    log3.debug(a.bq(str, "Challenge for ", " authentication scheme not available"));
                }
            }
        }
        if (ajpyVarC != null) {
            return ajpyVarC;
        }
        throw new ajqf("Unable to respond to any of these challenges: ".concat(map.toString()));
    }

    protected List d(ajpj ajpjVar) {
        throw null;
    }
}
