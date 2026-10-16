package defpackage;

/* JADX INFO: loaded from: classes2.dex */
abstract class ajxa implements defpackage.ajrr {
    private static final java.util.List a = j$.util.DesugarCollections.unmodifiableList(java.util.Arrays.asList("Negotiate", "Kerberos", "NTLM", "CredSSP", "Digest", "Basic"));
    private final org.apache.commons.logging.Log b = org.apache.commons.logging.LogFactory.getLog(getClass());
    private final int c;
    private final java.lang.String d;

    public ajxa(int i, java.lang.String str) {
        this.c = i;
        this.d = str;
    }

    @Override // defpackage.ajrr
    public final java.util.Queue a(java.util.Map map, defpackage.ajqe ajqeVar, defpackage.ajqj ajqjVar, defpackage.akca akcaVar) throws defpackage.ajrm {
        defpackage.aguw.e(ajqeVar, "Host");
        defpackage.aguw.e(akcaVar, "HTTP context");
        defpackage.ajsw ajswVarG = defpackage.ajsw.g(akcaVar);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        defpackage.ajtl ajtlVarI = ajswVarG.i("http.authscheme-registry");
        if (ajtlVarI == null) {
            this.b.debug("Auth scheme registry not set in the context");
            return linkedList;
        }
        defpackage.ajrx ajrxVarE = ajswVarG.e();
        if (ajrxVarE == null) {
            this.b.debug("Credentials provider not set in the context");
            return linkedList;
        }
        java.util.Collection<java.lang.String> collectionF = f(ajswVarG.f());
        if (collectionF == null) {
            collectionF = a;
        }
        org.apache.commons.logging.Log log = this.b;
        if (log.isDebugEnabled()) {
            log.debug("Authentication schemes in the order of preference: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(collectionF))));
        }
        for (java.lang.String str : collectionF) {
            defpackage.ajpy ajpyVar = (defpackage.ajpy) map.get(str.toLowerCase(java.util.Locale.ROOT));
            if (ajpyVar != null) {
                defpackage.ajqy ajqyVarB = ((defpackage.ajra) ajtlVarI.a(str)).b(akcaVar);
                ajqyVarB.d(ajpyVar);
                defpackage.ajrj ajrjVarA = ajrxVarE.a(new defpackage.ajrd(ajqeVar, ajqyVarB.a(), ajqyVarB.b()));
                if (ajrjVarA != null) {
                    linkedList.add(new defpackage.ajqw(ajqyVarB, ajrjVarA));
                }
            } else if (log.isDebugEnabled()) {
                log.debug(defpackage.a.bp(str, "Challenge for ", " authentication scheme not available"));
            }
        }
        return linkedList;
    }

    @Override // defpackage.ajrr
    public final void b(defpackage.ajqe ajqeVar, defpackage.ajqy ajqyVar, defpackage.akca akcaVar) {
        defpackage.aguw.e(ajqeVar, "Host");
        defpackage.aguw.e(akcaVar, "HTTP context");
        defpackage.ajrp ajrpVarC = defpackage.ajsw.g(akcaVar).c();
        if (ajrpVarC != null) {
            org.apache.commons.logging.Log log = this.b;
            if (log.isDebugEnabled()) {
                log.debug("Clearing cached auth scheme for ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajqeVar))));
            }
            ajrpVarC.c(ajqeVar);
        }
    }

    @Override // defpackage.ajrr
    public final void c(defpackage.ajqe ajqeVar, defpackage.ajqy ajqyVar, defpackage.akca akcaVar) {
        defpackage.aguw.e(ajqeVar, "Host");
        defpackage.aguw.e(ajqyVar, "Auth scheme");
        defpackage.aguw.e(akcaVar, "HTTP context");
        defpackage.ajsw ajswVarG = defpackage.ajsw.g(akcaVar);
        if (ajqyVar != null && ajqyVar.e() && ajqyVar.b().equalsIgnoreCase("Basic")) {
            defpackage.ajrp ajrpVarC = ajswVarG.c();
            if (ajrpVarC == null) {
                ajrpVarC = new defpackage.ajxb();
                ajswVarG.x("http.auth.auth-cache", ajrpVarC);
            }
            org.apache.commons.logging.Log log = this.b;
            if (log.isDebugEnabled()) {
                log.debug("Caching '" + ajqyVar.b() + "' auth scheme for " + java.lang.String.valueOf(ajqeVar));
            }
            ajrpVarC.b(ajqeVar, ajqyVar);
        }
    }

    @Override // defpackage.ajrr
    public final java.util.Map d(defpackage.ajqj ajqjVar) throws defpackage.ajrm {
        defpackage.akch akchVar;
        int i;
        defpackage.ajpy[] ajpyVarArrM = ajqjVar.m(this.d);
        java.util.HashMap map = new java.util.HashMap(ajpyVarArrM.length);
        for (defpackage.ajpy ajpyVar : ajpyVarArrM) {
            if (ajpyVar instanceof defpackage.akbk) {
                defpackage.akbk akbkVar = (defpackage.akbk) ajpyVar;
                akchVar = akbkVar.a;
                i = akbkVar.b;
            } else {
                java.lang.String strC = ajpyVar.c();
                if (strC == null) {
                    throw new defpackage.ajrm("Header value is null");
                }
                akchVar = new defpackage.akch(strC.length());
                akchVar.f(strC);
                i = 0;
            }
            while (i < akchVar.b && defpackage.akbz.a(akchVar.charAt(i))) {
                i++;
            }
            int i2 = i;
            while (i2 < akchVar.b && !defpackage.akbz.a(akchVar.charAt(i2))) {
                i2++;
            }
            map.put(akchVar.c(i, i2).toLowerCase(java.util.Locale.ROOT), ajpyVar);
        }
        return map;
    }

    @Override // defpackage.ajrr
    public final boolean e(defpackage.ajqj ajqjVar) {
        return ajqjVar.p().b == this.c;
    }

    public abstract java.util.Collection f(defpackage.ajsi ajsiVar);
}
