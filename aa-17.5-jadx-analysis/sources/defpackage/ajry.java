package defpackage;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* loaded from: classes2.dex */
public final class ajry implements ajpi {
    private final Log a = LogFactory.getLog(getClass());

    private final void b(ajpe ajpeVar, ajpy ajpyVar, ajqe ajqeVar, ajqx ajqxVar) {
        String strB = ajpyVar.b();
        Log log = this.a;
        if (log.isDebugEnabled()) {
            log.debug("Re-using cached '" + strB + "' auth scheme for " + ajpeVar.b());
        }
        ajqj ajqjVarA = ajqxVar.a(new ajqd(ajpeVar, null, strB));
        if (ajqjVarA != null) {
            ajqeVar.b(ajpyVar, ajqjVarA);
        } else {
            log.debug("No credentials for preemptive authentication");
        }
    }

    @Override // defpackage.ajpi
    public final void a(ajph ajphVar, akba akbaVar) throws ajpd, IOException {
        ajpy ajpyVarA;
        ajpy ajpyVarA2;
        ahgm.e(akbaVar, "HTTP context");
        ajrw ajrwVarG = ajrw.g(akbaVar);
        ajqp ajqpVarC = ajrwVarG.c();
        if (ajqpVarC == null) {
            this.a.debug("Auth cache not set in the context");
            return;
        }
        ajqx ajqxVarE = ajrwVarG.e();
        if (ajqxVarE == null) {
            this.a.debug("Credentials provider not set in the context");
            return;
        }
        ajtk ajtkVarH = ajrwVarG.h();
        if (ajtkVarH == null) {
            this.a.debug("Route info not set in the context");
            return;
        }
        ajpe ajpeVarL = ajrwVarG.l();
        if (ajpeVarL == null) {
            this.a.debug("Target host not set in the context");
            return;
        }
        if (ajpeVarL.c < 0) {
            ajpeVarL = new ajpe(ajpeVarL.a, ajtkVarH.d().c, ajpeVarL.d);
        }
        ajqe ajqeVarB = ajrwVarG.b();
        if (ajqeVarB != null && ajqeVarB.a == ajpx.a && (ajpyVarA2 = ajqpVarC.a(ajpeVarL)) != null) {
            b(ajpeVarL, ajpyVarA2, ajqeVarB, ajqxVarE);
        }
        ajpe ajpeVarC = ajtkVarH.c();
        ajqe ajqeVarA = ajrwVarG.a();
        if (ajpeVarC == null || ajqeVarA == null || ajqeVarA.a != ajpx.a || (ajpyVarA = ajqpVarC.a(ajpeVarC)) == null) {
            return;
        }
        b(ajpeVarC, ajpyVarA, ajqeVarA, ajqxVarE);
    }
}
