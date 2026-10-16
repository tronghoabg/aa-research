package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajxq implements defpackage.ajsh {
    private static java.security.Principal b(defpackage.ajre ajreVar) {
        defpackage.ajrj ajrjVar;
        defpackage.ajqy ajqyVar = ajreVar.b;
        if (ajqyVar == null || !ajqyVar.e() || !ajqyVar.f() || (ajrjVar = ajreVar.c) == null) {
            return null;
        }
        return ajrjVar.b();
    }

    @Override // defpackage.ajsh
    public final java.lang.Object a(defpackage.akca akcaVar) {
        java.security.Principal principalB;
        javax.net.ssl.SSLSession sSLSessionU;
        defpackage.ajsw ajswVarG = defpackage.ajsw.g(akcaVar);
        defpackage.ajre ajreVarB = ajswVarG.b();
        if (ajreVarB != null) {
            principalB = b(ajreVarB);
            if (principalB == null) {
                principalB = b(ajswVarG.a());
            }
        } else {
            principalB = null;
        }
        if (principalB == null) {
            defpackage.ajqa ajqaVarK = ajswVarG.k();
            if (ajqaVarK.i() && (ajqaVarK instanceof defpackage.ajtz) && (sSLSessionU = ((defpackage.ajtz) ajqaVarK).u()) != null) {
                return sSLSessionU.getLocalPrincipal();
            }
        }
        return principalB;
    }
}
