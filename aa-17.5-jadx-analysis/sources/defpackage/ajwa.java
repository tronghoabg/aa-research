package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* loaded from: classes2.dex */
abstract class ajwa implements ajqr {
    private static final List a = DesugarCollections.unmodifiableList(Arrays.asList("Negotiate", "Kerberos", "NTLM", "CredSSP", "Digest", "Basic"));
    private final Log b = LogFactory.getLog(getClass());
    private final int c;
    private final String d;

    public ajwa(int i, String str) {
        this.c = i;
        this.d = str;
    }

    @Override // defpackage.ajqr
    public final Queue a(Map map, ajpe ajpeVar, ajpj ajpjVar, akba akbaVar) throws ajqm {
        ahgm.e(ajpeVar, "Host");
        ahgm.e(akbaVar, "HTTP context");
        ajrw ajrwVarG = ajrw.g(akbaVar);
        LinkedList linkedList = new LinkedList();
        ajsl ajslVarI = ajrwVarG.i("http.authscheme-registry");
        if (ajslVarI == null) {
            this.b.debug("Auth scheme registry not set in the context");
            return linkedList;
        }
        ajqx ajqxVarE = ajrwVarG.e();
        if (ajqxVarE == null) {
            this.b.debug("Credentials provider not set in the context");
            return linkedList;
        }
        Collection<String> collectionF = f(ajrwVarG.f());
        if (collectionF == null) {
            collectionF = a;
        }
        Log log = this.b;
        if (log.isDebugEnabled()) {
            log.debug("Authentication schemes in the order of preference: ".concat(String.valueOf(String.valueOf(collectionF))));
        }
        for (String str : collectionF) {
            ajoy ajoyVar = (ajoy) map.get(str.toLowerCase(Locale.ROOT));
            if (ajoyVar != null) {
                ajpy ajpyVarB = ((ajqa) ajslVarI.a(str)).b(akbaVar);
                ajpyVarB.d(ajoyVar);
                ajqj ajqjVarA = ajqxVarE.a(new ajqd(ajpeVar, ajpyVarB.a(), ajpyVarB.b()));
                if (ajqjVarA != null) {
                    linkedList.add(new ajpw(ajpyVarB, ajqjVarA));
                }
            } else if (log.isDebugEnabled()) {
                log.debug(a.bq(str, "Challenge for ", " authentication scheme not available"));
            }
        }
        return linkedList;
    }

    @Override // defpackage.ajqr
    public final void b(ajpe ajpeVar, ajpy ajpyVar, akba akbaVar) {
        ahgm.e(ajpeVar, "Host");
        ahgm.e(akbaVar, "HTTP context");
        ajqp ajqpVarC = ajrw.g(akbaVar).c();
        if (ajqpVarC != null) {
            Log log = this.b;
            if (log.isDebugEnabled()) {
                log.debug("Clearing cached auth scheme for ".concat(String.valueOf(String.valueOf(ajpeVar))));
            }
            ajqpVarC.c(ajpeVar);
        }
    }

    @Override // defpackage.ajqr
    public final void c(ajpe ajpeVar, ajpy ajpyVar, akba akbaVar) {
        ahgm.e(ajpeVar, "Host");
        ahgm.e(ajpyVar, "Auth scheme");
        ahgm.e(akbaVar, "HTTP context");
        ajrw ajrwVarG = ajrw.g(akbaVar);
        if (ajpyVar != null && ajpyVar.e() && ajpyVar.b().equalsIgnoreCase("Basic")) {
            ajqp ajqpVarC = ajrwVarG.c();
            if (ajqpVarC == null) {
                ajqpVarC = new ajwb();
                ajrwVarG.x("http.auth.auth-cache", ajqpVarC);
            }
            Log log = this.b;
            if (log.isDebugEnabled()) {
                log.debug("Caching '" + ajpyVar.b() + "' auth scheme for " + String.valueOf(ajpeVar));
            }
            ajqpVarC.b(ajpeVar, ajpyVar);
        }
    }

    @Override // defpackage.ajqr
    public final Map d(ajpj ajpjVar) throws ajqm {
        akbh akbhVar;
        int i;
        ajoy[] ajoyVarArrM = ajpjVar.m(this.d);
        HashMap map = new HashMap(ajoyVarArrM.length);
        for (ajoy ajoyVar : ajoyVarArrM) {
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

    @Override // defpackage.ajqr
    public final boolean e(ajpj ajpjVar) {
        return ajpjVar.p().b == this.c;
    }

    public abstract Collection f(ajri ajriVar);
}
