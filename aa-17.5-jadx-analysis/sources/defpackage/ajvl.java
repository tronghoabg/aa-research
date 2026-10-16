package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.ietf.jgss.GSSContext;
import org.ietf.jgss.GSSCredential;
import org.ietf.jgss.GSSException;
import org.ietf.jgss.GSSManager;
import org.ietf.jgss.GSSName;
import org.ietf.jgss.Oid;

/* loaded from: classes2.dex */
public abstract class ajvl extends ajvh {
    private byte[] d;
    private final Log b = LogFactory.getLog(getClass());
    private final ajos c = new ajos();
    private int e = 1;

    protected static final byte[] k(byte[] bArr, Oid oid, String str, ajqj ajqjVar) throws GSSException {
        GSSManager gSSManager = GSSManager.getInstance();
        GSSName gSSNameCreateName = gSSManager.createName("HTTP@".concat(String.valueOf(str)), GSSName.NT_HOSTBASED_SERVICE);
        if (ajqjVar instanceof ajql) {
            throw null;
        }
        GSSContext gSSContextCreateContext = gSSManager.createContext(gSSNameCreateName.canonicalize(oid), oid, (GSSCredential) null, 0);
        gSSContextCreateContext.requestMutualAuth(true);
        return bArr != null ? gSSContextCreateContext.initSecContext(bArr, 0, bArr.length) : gSSContextCreateContext.initSecContext(new byte[0], 0, 0);
    }

    @Override // defpackage.ajpy
    @Deprecated
    public final ajoy c(ajqj ajqjVar, ajph ajphVar) throws ajqf {
        return g(ajqjVar, ajphVar, null);
    }

    @Override // defpackage.ajpy
    public final boolean e() {
        int i = this.e;
        return i == 3 || i == 4;
    }

    @Override // defpackage.ajvh, defpackage.ajqi
    public final ajoy g(ajqj ajqjVar, ajph ajphVar, akba akbaVar) throws ajqf, UnknownHostException {
        ajpe ajpeVarC;
        int i = this.e;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            throw new ajqf(b().concat(" authentication has not been initiated"));
        }
        if (i2 == 1) {
            try {
                ajtg ajtgVar = (ajtg) akbaVar.v("http.route");
                if (ajtgVar == null) {
                    throw new ajqf("Connection route is not available");
                }
                if (!i() || (ajpeVarC = ajtgVar.c()) == null) {
                    ajpeVarC = ajtgVar.a;
                }
                String str = ajpeVarC.a;
                try {
                    InetAddress byName = InetAddress.getByName(str);
                    String canonicalHostName = byName.getCanonicalHostName();
                    if (true != byName.getHostAddress().contentEquals(canonicalHostName)) {
                        str = canonicalHostName;
                    }
                } catch (UnknownHostException unused) {
                }
                Log log = this.b;
                if (log.isDebugEnabled()) {
                    log.debug(a.bz(str, "init "));
                }
                this.d = j(this.d, str, ajqjVar);
                this.e = 3;
            } catch (GSSException e) {
                this.e = 4;
                if (e.getMajor() == 9 || e.getMajor() == 8) {
                    throw new ajqk(e.getMessage(), e);
                }
                if (e.getMajor() == 13) {
                    throw new ajqk(e.getMessage(), e);
                }
                if (e.getMajor() == 10 || e.getMajor() == 19 || e.getMajor() == 20) {
                    throw new ajqf(e.getMessage(), e);
                }
                throw new ajqf(e.getMessage());
            }
        } else if (i2 != 2) {
            if (i2 != 3) {
                throw new IllegalStateException("Illegal state: ".concat(i != 1 ? i != 2 ? i != 3 ? "FAILED" : "TOKEN_GENERATED" : "CHALLENGE_RECEIVED" : "UNINITIATED"));
            }
            throw new ajqf(b().concat(" authentication has failed"));
        }
        String str2 = new String(this.c.c(this.d));
        Log log2 = this.b;
        if (log2.isDebugEnabled()) {
            log2.debug(a.bq(str2, "Sending response '", "' back to the auth server"));
        }
        akbh akbhVar = new akbh(32);
        if (i()) {
            akbhVar.f("Proxy-Authorization");
        } else {
            akbhVar.f("Authorization");
        }
        akbhVar.f(": Negotiate ");
        akbhVar.f(str2);
        return new akak(akbhVar);
    }

    @Override // defpackage.ajvh
    protected final void h(akbh akbhVar, int i, int i2) throws ajqm {
        Log log = this.b;
        String strD = akbhVar.d(i, i2);
        if (log.isDebugEnabled()) {
            log.debug(a.bq(strD, "Received challenge '", "' from the auth server"));
        }
        if (this.e != 1) {
            log.debug("Authentication already attempted");
            this.e = 4;
            return;
        }
        byte[] bytes = strD.getBytes();
        ajos ajosVar = new ajos();
        if (!ahfz.a(bytes)) {
            ajot ajotVar = new ajot();
            ajosVar.a(bytes, bytes.length, ajotVar);
            ajosVar.a(bytes, -1, ajotVar);
            int i3 = ajotVar.c;
            byte[] bArr = new byte[i3];
            ajou.f(bArr, i3, ajotVar);
            bytes = bArr;
        }
        this.d = bytes;
        this.e = 2;
    }

    protected byte[] j(byte[] bArr, String str, ajqj ajqjVar) throws GSSException {
        throw null;
    }
}
