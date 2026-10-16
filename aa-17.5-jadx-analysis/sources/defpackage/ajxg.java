package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Deprecated
/* loaded from: classes2.dex */
public final class ajxg extends ajvc implements ajsz, akba, ajoz, ajpf {
    public volatile Socket i;
    public boolean j;
    private final Log k;
    private final Log l;
    private final Log m;
    private volatile boolean n;
    private final Map o;

    public ajxg() {
        this.g = null;
        this.k = LogFactory.getLog(getClass());
        this.l = LogFactory.getLog("org.apache.http.headers");
        this.m = LogFactory.getLog("org.apache.http.wire");
        this.o = new HashMap();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ajpg, ajpj] */
    @Override // defpackage.ajvc, defpackage.ajoz
    public final ajpj a() throws ajpd, IOException {
        s();
        ?? B = this.d.b();
        if (B.p().b >= 200) {
            this.e.b++;
        }
        Log log = this.k;
        if (log.isDebugEnabled()) {
            log.debug("Receiving response: ".concat(String.valueOf(String.valueOf(B.p()))));
        }
        Log log2 = this.l;
        if (log2.isDebugEnabled()) {
            log2.debug("<< ".concat(B.p().toString()));
            for (ajoy ajoyVar : B.l()) {
                log2.debug("<< ".concat(String.valueOf(ajoyVar.toString())));
            }
        }
        return B;
    }

    @Override // defpackage.ajvc, defpackage.ajpa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            super.close();
            Log log = this.k;
            if (log.isDebugEnabled()) {
                log.debug(a.bW(this, "Connection ", " closed"));
            }
        } catch (IOException e) {
            this.k.debug("I/O error closing connection", e);
        }
    }

    @Override // defpackage.ajvc, defpackage.ajoz
    public final void e(ajph ajphVar) throws ajpd, IOException, NoSuchElementException {
        Log log = this.k;
        if (log.isDebugEnabled()) {
            log.debug("Sending request: ".concat(String.valueOf(String.valueOf(ajphVar.p()))));
        }
        s();
        ajzd ajzdVar = this.h;
        akah akahVarP = ajphVar.p();
        ajzm ajzmVar = (ajzm) ajzdVar;
        akbh akbhVar = ajzmVar.b;
        akad akadVar = ajzmVar.c;
        akad.e(akbhVar, akahVarP);
        ajzmVar.a.e(akbhVar);
        akaf akafVarN = ajphVar.n();
        while (akafVarN.hasNext()) {
            ajoy ajoyVarB = akafVarN.b();
            ajzv ajzvVar = ajzdVar.a;
            akad akadVar2 = ajzdVar.c;
            ajzvVar.e(akad.d(ajzdVar.b, ajoyVarB));
        }
        akbh akbhVar2 = ajzdVar.b;
        akbhVar2.i();
        ajzdVar.a.e(akbhVar2);
        this.e.a++;
        Log log2 = this.l;
        if (log2.isDebugEnabled()) {
            log2.debug(">> ".concat(ajphVar.p().toString()));
            for (ajoy ajoyVar : ajphVar.l()) {
                log2.debug(">> ".concat(String.valueOf(ajoyVar.toString())));
            }
        }
    }

    @Override // defpackage.ajvc, defpackage.ajpa
    public final void h() throws IOException {
        this.n = true;
        try {
            this.f = false;
            Socket socket = this.g;
            if (socket != null) {
                socket.close();
            }
            Log log = this.k;
            if (log.isDebugEnabled()) {
                log.debug(a.bW(this, "Connection ", " shut down"));
            }
            Socket socket2 = this.i;
            if (socket2 != null) {
                socket2.close();
            }
        } catch (IOException e) {
            this.k.debug("I/O error shutting down connection", e);
        }
    }

    @Override // defpackage.ajvc
    protected final ajzt m(ajzu ajzuVar, ajpk ajpkVar, akas akasVar) {
        return new ajxi(ajzuVar, ajpkVar, akasVar);
    }

    @Override // defpackage.ajvc
    protected final ajzu p(Socket socket, int i, akas akasVar) throws IOException {
        if (i <= 0) {
            i = 8192;
        }
        ajzq ajzqVar = new ajzq(socket, i, akasVar);
        Log log = this.m;
        return log.isDebugEnabled() ? new ajxl(ajzqVar, new ajxo(log), akat.a(akasVar)) : ajzqVar;
    }

    @Override // defpackage.ajvc
    protected final ajzv q(Socket socket, int i, akas akasVar) throws IOException {
        if (i <= 0) {
            i = 8192;
        }
        ajzf ajzfVar = new ajzf(socket, i, akasVar);
        Log log = this.m;
        return log.isDebugEnabled() ? new ajxm(ajzfVar, new ajxo(log), akat.a(akasVar)) : ajzfVar;
    }

    @Override // defpackage.ajsz
    public final SSLSession u() {
        if (this.i instanceof SSLSocket) {
            return ((SSLSocket) this.i).getSession();
        }
        return null;
    }

    @Override // defpackage.akba
    public final Object v(String str) {
        return this.o.get(str);
    }

    public final void w(Socket socket, ajpe ajpeVar, boolean z, akas akasVar) throws IOException {
        s();
        ahgm.e(ajpeVar, "Target host");
        ahgm.e(akasVar, "Parameters");
        if (socket != null) {
            this.i = socket;
            t(socket, akasVar);
        }
        this.j = z;
    }

    @Override // defpackage.akba
    public final void x(String str, Object obj) {
        this.o.put(str, obj);
    }

    public final void y(Socket socket) throws IOException {
        r();
        this.i = socket;
        if (this.n) {
            socket.close();
            throw new InterruptedIOException("Connection already shutdown");
        }
    }
}
