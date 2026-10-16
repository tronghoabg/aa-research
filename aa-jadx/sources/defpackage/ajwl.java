package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ajwl extends defpackage.ajwh {
    private byte[] d;
    private final org.apache.commons.logging.Log b = org.apache.commons.logging.LogFactory.getLog(getClass());
    private final defpackage.ajps c = new defpackage.ajps();
    private int e = 1;

    protected static final byte[] k(byte[] bArr, org.ietf.jgss.Oid oid, java.lang.String str, defpackage.ajrj ajrjVar) throws org.ietf.jgss.GSSException {
        org.ietf.jgss.GSSManager gSSManager = org.ietf.jgss.GSSManager.getInstance();
        org.ietf.jgss.GSSName gSSNameCreateName = gSSManager.createName("HTTP@".concat(java.lang.String.valueOf(str)), org.ietf.jgss.GSSName.NT_HOSTBASED_SERVICE);
        if (ajrjVar instanceof defpackage.ajrl) {
            throw null;
        }
        org.ietf.jgss.GSSContext gSSContextCreateContext = gSSManager.createContext(gSSNameCreateName.canonicalize(oid), oid, (org.ietf.jgss.GSSCredential) null, 0);
        gSSContextCreateContext.requestMutualAuth(true);
        return bArr != null ? gSSContextCreateContext.initSecContext(bArr, 0, bArr.length) : gSSContextCreateContext.initSecContext(new byte[0], 0, 0);
    }

    @Override // defpackage.ajqy
    @java.lang.Deprecated
    public final defpackage.ajpy c(defpackage.ajrj ajrjVar, defpackage.ajqh ajqhVar) throws defpackage.ajrf {
        return g(ajrjVar, ajqhVar, null);
    }

    @Override // defpackage.ajqy
    public final boolean e() {
        int i = this.e;
        return i == 3 || i == 4;
    }

    @Override // defpackage.ajwh, defpackage.ajri
    public final defpackage.ajpy g(defpackage.ajrj ajrjVar, defpackage.ajqh ajqhVar, defpackage.akca akcaVar) throws defpackage.ajrf {
        defpackage.ajqe ajqeVarC;
        java.lang.String str;
        int i = this.e;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            throw new defpackage.ajrf(b().concat(" authentication has not been initiated"));
        }
        if (i2 == 1) {
            try {
                defpackage.ajug ajugVar = (defpackage.ajug) akcaVar.v("http.route");
                if (ajugVar == null) {
                    throw new defpackage.ajrf("Connection route is not available");
                }
                if (!i() || (ajqeVarC = ajugVar.c()) == null) {
                    ajqeVarC = ajugVar.a;
                }
                java.lang.String str2 = ajqeVarC.a;
                try {
                    java.net.InetAddress byName = java.net.InetAddress.getByName(str2);
                    java.lang.String canonicalHostName = byName.getCanonicalHostName();
                    if (true != byName.getHostAddress().contentEquals(canonicalHostName)) {
                        str2 = canonicalHostName;
                    }
                } catch (java.net.UnknownHostException unused) {
                }
                org.apache.commons.logging.Log log = this.b;
                if (log.isDebugEnabled()) {
                    log.debug(defpackage.a.bA(str2, "init "));
                }
                this.d = j(this.d, str2, ajrjVar);
                this.e = 3;
            } catch (org.ietf.jgss.GSSException e) {
                this.e = 4;
                if (e.getMajor() == 9 || e.getMajor() == 8) {
                    throw new defpackage.ajrk(e.getMessage(), e);
                }
                if (e.getMajor() == 13) {
                    throw new defpackage.ajrk(e.getMessage(), e);
                }
                if (e.getMajor() == 10 || e.getMajor() == 19 || e.getMajor() == 20) {
                    throw new defpackage.ajrf(e.getMessage(), e);
                }
                throw new defpackage.ajrf(e.getMessage());
            }
        } else if (i2 != 2) {
            if (i2 == 3) {
                throw new defpackage.ajrf(b().concat(" authentication has failed"));
            }
            if (i == 1) {
                str = "UNINITIATED";
            } else if (i != 2) {
                str = i != 3 ? "FAILED" : "TOKEN_GENERATED";
            } else {
                str = "CHALLENGE_RECEIVED";
            }
            throw new java.lang.IllegalStateException("Illegal state: ".concat(str));
        }
        java.lang.String str3 = new java.lang.String(this.c.c(this.d));
        org.apache.commons.logging.Log log2 = this.b;
        if (log2.isDebugEnabled()) {
            log2.debug(defpackage.a.bp(str3, "Sending response '", "' back to the auth server"));
        }
        defpackage.akch akchVar = new defpackage.akch(32);
        if (i()) {
            akchVar.f("Proxy-Authorization");
        } else {
            akchVar.f("Authorization");
        }
        akchVar.f(": Negotiate ");
        akchVar.f(str3);
        return new defpackage.akbk(akchVar);
    }

    @Override // defpackage.ajwh
    protected final void h(defpackage.akch akchVar, int i, int i2) throws defpackage.ajrm {
        org.apache.commons.logging.Log log = this.b;
        java.lang.String strD = akchVar.d(i, i2);
        if (log.isDebugEnabled()) {
            log.debug(defpackage.a.bp(strD, "Received challenge '", "' from the auth server"));
        }
        if (this.e != 1) {
            log.debug("Authentication already attempted");
            this.e = 4;
            return;
        }
        byte[] bytes = strD.getBytes();
        defpackage.ajps ajpsVar = new defpackage.ajps();
        if (!defpackage.aguo.a(bytes)) {
            defpackage.ajpt ajptVar = new defpackage.ajpt();
            ajpsVar.a(bytes, bytes.length, ajptVar);
            ajpsVar.a(bytes, -1, ajptVar);
            int i3 = ajptVar.c;
            byte[] bArr = new byte[i3];
            defpackage.ajpu.f(bArr, i3, ajptVar);
            bytes = bArr;
        }
        this.d = bytes;
        this.e = 2;
    }

    protected byte[] j(byte[] bArr, java.lang.String str, defpackage.ajrj ajrjVar) throws org.ietf.jgss.GSSException {
        throw null;
    }
}
