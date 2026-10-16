package defpackage;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Deprecated
/* loaded from: classes2.dex */
final class ajvz implements ajqr {
    public final ajqq a;
    private final Log b = LogFactory.getLog(getClass());

    public ajvz(ajqq ajqqVar) {
        this.a = ajqqVar;
    }

    @Override // defpackage.ajqr
    public final Queue a(Map map, ajpe ajpeVar, ajpj ajpjVar, akba akbaVar) throws ajqm {
        ahgm.e(ajpeVar, "Host");
        ahgm.e(akbaVar, "HTTP context");
        LinkedList linkedList = new LinkedList();
        ajqx ajqxVar = (ajqx) akbaVar.v("http.auth.credentials-provider");
        if (ajqxVar == null) {
            this.b.debug("Credentials provider not set in the context");
            return linkedList;
        }
        try {
            ajpy ajpyVarA = this.a.a(map, ajpjVar, akbaVar);
            ajpyVarA.d((ajoy) map.get(ajpyVarA.b().toLowerCase(Locale.ROOT)));
            ajqj ajqjVarA = ajqxVar.a(new ajqd(ajpeVar.a, ajpeVar.c, ajpyVarA.a(), ajpyVarA.b()));
            if (ajqjVarA != null) {
                linkedList.add(new ajpw(ajpyVarA, ajqjVarA));
                return linkedList;
            }
        } catch (ajqf e) {
            Log log = this.b;
            if (log.isWarnEnabled()) {
                log.warn(e.getMessage(), e);
            }
        }
        return linkedList;
    }

    @Override // defpackage.ajqr
    public final void b(ajpe ajpeVar, ajpy ajpyVar, akba akbaVar) {
        ajqp ajqpVar = (ajqp) akbaVar.v("http.auth.auth-cache");
        if (ajqpVar == null) {
            return;
        }
        Log log = this.b;
        if (log.isDebugEnabled()) {
            log.debug("Removing from cache '" + ajpyVar.b() + "' auth scheme for " + String.valueOf(ajpeVar));
        }
        ajqpVar.c(ajpeVar);
    }

    @Override // defpackage.ajqr
    public final void c(ajpe ajpeVar, ajpy ajpyVar, akba akbaVar) {
        ajqp ajwbVar = (ajqp) akbaVar.v("http.auth.auth-cache");
        if (ajpyVar != null && ajpyVar.e() && ajpyVar.b().equalsIgnoreCase("Basic")) {
            if (ajwbVar == null) {
                ajwbVar = new ajwb();
                akbaVar.x("http.auth.auth-cache", ajwbVar);
            }
            Log log = this.b;
            if (log.isDebugEnabled()) {
                log.debug("Caching '" + ajpyVar.b() + "' auth scheme for " + String.valueOf(ajpeVar));
            }
            ajwbVar.b(ajpeVar, ajpyVar);
        }
    }

    @Override // defpackage.ajqr
    public final Map d(ajpj ajpjVar) throws ajqm {
        return this.a.b(ajpjVar);
    }

    @Override // defpackage.ajqr
    public final boolean e(ajpj ajpjVar) {
        return this.a.c(ajpjVar);
    }
}
