package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

@Deprecated
/* loaded from: classes2.dex */
final class ajxn implements ajsy {
    public final ajso a;
    public volatile ajxk b;
    public volatile boolean c;
    private volatile long d;
    private final ajxh e;

    public ajxn(ajso ajsoVar, ajxh ajxhVar, ajxk ajxkVar) {
        ahgm.e(ajxhVar, "Connection operator");
        ahgm.e(ajxkVar, "HTTP pool entry");
        this.a = ajsoVar;
        this.e = ajxhVar;
        this.b = ajxkVar;
        this.c = false;
        this.d = Long.MAX_VALUE;
    }

    private final ajxk w() {
        ajxk ajxkVar = this.b;
        if (ajxkVar != null) {
            return ajxkVar;
        }
        throw new ajxf();
    }

    private final ajxg x() {
        ajxk ajxkVar = this.b;
        if (ajxkVar != null) {
            return (ajxg) ajxkVar.c;
        }
        throw new ajxf();
    }

    private final ajxg y() {
        ajxk ajxkVar = this.b;
        if (ajxkVar == null) {
            return null;
        }
        return (ajxg) ajxkVar.c;
    }

    @Override // defpackage.ajoz
    public final ajpj a() throws ajpd, IOException {
        return x().a();
    }

    @Override // defpackage.ajoz
    public final void b() throws IOException {
        x().b();
    }

    @Override // defpackage.ajoz
    public final void c(ajpj ajpjVar) throws ajpd, NumberFormatException, IOException {
        x().c(ajpjVar);
    }

    @Override // defpackage.ajpa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ajxk ajxkVar = this.b;
        if (ajxkVar != null) {
            ajxkVar.a.l();
            ((ajvc) ajxkVar.c).close();
        }
    }

    @Override // defpackage.ajoz
    public final void d(ajpc ajpcVar) throws ajpd, IOException, NumberFormatException {
        x().d(ajpcVar);
    }

    @Override // defpackage.ajoz
    public final void e(ajph ajphVar) throws ajpd, IOException {
        x().e(ajphVar);
    }

    @Override // defpackage.ajoz
    public final boolean f() throws IOException {
        return x().f();
    }

    @Override // defpackage.ajpa
    public final void g(int i) throws SocketException {
        x().g(i);
    }

    @Override // defpackage.ajpa
    public final void h() throws IOException {
        throw null;
    }

    @Override // defpackage.ajsu
    public final void hY() {
        synchronized (this) {
            if (this.b == null) {
                return;
            }
            this.c = false;
            try {
                ((ajvc) this.b.c).h();
            } catch (IOException unused) {
            }
            this.a.c(this, this.d, TimeUnit.MILLISECONDS);
            this.b = null;
        }
    }

    @Override // defpackage.ajsu
    public final void hZ() {
        synchronized (this) {
            if (this.b == null) {
                return;
            }
            this.a.c(this, this.d, TimeUnit.MILLISECONDS);
            this.b = null;
        }
    }

    @Override // defpackage.ajpa
    public final boolean i() {
        ajxg ajxgVarY = y();
        if (ajxgVarY != null) {
            return ajxgVarY.f;
        }
        return false;
    }

    @Override // defpackage.ajpa
    public final boolean j() {
        ajxg ajxgVarY = y();
        if (ajxgVarY != null) {
            return ajxgVarY.j();
        }
        return true;
    }

    @Override // defpackage.ajpf
    public final int k() {
        return x().k();
    }

    @Override // defpackage.ajpf
    public final InetAddress l() {
        return x().l();
    }

    @Override // defpackage.ajsy, defpackage.ajsx
    public final ajtg m() {
        return w().a.h();
    }

    @Override // defpackage.ajsy
    public final void n(akba akbaVar, akas akasVar) throws IOException {
        ajpe ajpeVar;
        Object obj;
        ahgm.e(akasVar, "HTTP parameters");
        synchronized (this) {
            if (this.b == null) {
                throw new ajxf();
            }
            ajtl ajtlVar = this.b.a;
            ahkp.b(ajtlVar.b, "Connection not open");
            ahkp.b(ajtlVar.g(), "Protocol layering without a tunnel not supported");
            ahkp.b(!ajtlVar.e(), "Multiple protocol layering not supported");
            ajpeVar = ajtlVar.a;
            obj = this.b.c;
        }
        this.e.b((ajxg) obj, ajpeVar, akbaVar, akasVar);
        synchronized (this) {
            if (this.b == null) {
                throw new InterruptedIOException();
            }
            this.b.a.k(((ajxg) obj).j);
        }
    }

    @Override // defpackage.ajsy
    public final void o() {
        this.c = true;
    }

    @Override // defpackage.ajsy
    public final void p(ajtg ajtgVar, akba akbaVar, akas akasVar) throws IOException, IllegalArgumentException {
        Object obj;
        ahgm.e(akasVar, "HTTP parameters");
        synchronized (this) {
            if (this.b == null) {
                throw new ajxf();
            }
            ahkp.b(!this.b.a.b, "Connection already open");
            obj = this.b.c;
        }
        ajpe ajpeVarC = ajtgVar.c();
        this.e.a((ajxg) obj, ajpeVarC != null ? ajpeVarC : ajtgVar.a, ajtgVar.b, akbaVar, akasVar);
        synchronized (this) {
            if (this.b == null) {
                throw new InterruptedIOException();
            }
            ajtl ajtlVar = this.b.a;
            if (ajpeVarC == null) {
                ajtlVar.j(((ajxg) obj).j);
            } else {
                ajtlVar.i(ajpeVarC, ((ajxg) obj).j);
            }
        }
    }

    @Override // defpackage.ajsy
    public final void q(long j, TimeUnit timeUnit) {
        this.d = j > 0 ? timeUnit.toMillis(j) : -1L;
    }

    @Override // defpackage.ajsy
    public final void r(Object obj) {
        w().d = obj;
    }

    @Override // defpackage.ajsy
    public final void s() {
        this.c = false;
    }

    @Override // defpackage.ajsy
    public final void t(akas akasVar) throws IOException {
        ajpe ajpeVar;
        Object obj;
        ahgm.e(akasVar, "HTTP parameters");
        synchronized (this) {
            if (this.b == null) {
                throw new ajxf();
            }
            ajtl ajtlVar = this.b.a;
            ahkp.b(ajtlVar.b, "Connection not open");
            ahkp.b(!ajtlVar.g(), "Connection is already tunnelled");
            ajpeVar = ajtlVar.a;
            obj = this.b.c;
        }
        ((ajxg) obj).w(null, ajpeVar, false, akasVar);
        synchronized (this) {
            if (this.b == null) {
                throw new InterruptedIOException();
            }
            this.b.a.m();
        }
    }

    @Override // defpackage.ajsz
    public final SSLSession u() {
        Socket socket = x().i;
        if (socket instanceof SSLSocket) {
            return ((SSLSocket) socket).getSession();
        }
        return null;
    }

    final void v() {
        this.b = null;
    }
}
