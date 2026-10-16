package defpackage;

import java.security.Principal;
import javax.net.ssl.SSLSession;

/* loaded from: classes2.dex */
public final class ajwq implements ajrh {
    private static Principal b(ajqe ajqeVar) {
        ajqj ajqjVar;
        ajpy ajpyVar = ajqeVar.b;
        if (ajpyVar == null || !ajpyVar.e() || !ajpyVar.f() || (ajqjVar = ajqeVar.c) == null) {
            return null;
        }
        return ajqjVar.b();
    }

    @Override // defpackage.ajrh
    public final Object a(akba akbaVar) {
        Principal principalB;
        SSLSession sSLSessionU;
        ajrw ajrwVarG = ajrw.g(akbaVar);
        ajqe ajqeVarB = ajrwVarG.b();
        if (ajqeVarB != null) {
            principalB = b(ajqeVarB);
            if (principalB == null) {
                principalB = b(ajrwVarG.a());
            }
        } else {
            principalB = null;
        }
        if (principalB == null) {
            ajpa ajpaVarK = ajrwVarG.k();
            if (ajpaVarK.i() && (ajpaVarK instanceof ajsz) && (sSLSessionU = ((ajsz) ajpaVarK).u()) != null) {
                return sSLSessionU.getLocalPrincipal();
            }
        }
        return principalB;
    }
}
