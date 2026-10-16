package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ajxa implements ajsy, akba {
    public final ajso a;
    public volatile ajxg d;
    public volatile boolean b = false;
    public volatile boolean c = false;
    private volatile long e = Long.MAX_VALUE;

    protected ajxa(ajso ajsoVar, ajxg ajxgVar) {
        this.a = ajsoVar;
        this.d = ajxgVar;
    }

    @Override // defpackage.ajoz
    public final ajpj a() throws ajpd, ajxf, IOException {
        ajxg ajxgVar = this.d;
        y(ajxgVar);
        s();
        return ajxgVar.a();
    }

    @Override // defpackage.ajoz
    public final void b() throws ajxf, IOException {
        ajxg ajxgVar = this.d;
        y(ajxgVar);
        ajxgVar.b();
    }

    @Override // defpackage.ajoz
    public final void c(ajpj ajpjVar) throws ajpd, ajxf, NumberFormatException, IOException {
        ajxg ajxgVar = this.d;
        y(ajxgVar);
        s();
        ajxgVar.c(ajpjVar);
    }

    @Override // defpackage.ajoz
    public final void d(ajpc ajpcVar) throws ajpd, ajxf, IOException, NumberFormatException {
        ajxg ajxgVar = this.d;
        y(ajxgVar);
        s();
        ajxgVar.d(ajpcVar);
    }

    @Override // defpackage.ajoz
    public final void e(ajph ajphVar) throws ajpd, ajxf, IOException {
        ajxg ajxgVar = this.d;
        y(ajxgVar);
        s();
        ajxgVar.e(ajphVar);
    }

    @Override // defpackage.ajoz
    public final boolean f() throws ajxf, IOException {
        ajxg ajxgVar = this.d;
        y(ajxgVar);
        return ajxgVar.f();
    }

    @Override // defpackage.ajpa
    public final void g(int i) throws SocketException, ajxf {
        ajxg ajxgVar = this.d;
        y(ajxgVar);
        ajxgVar.g(i);
    }

    @Override // defpackage.ajsu
    public final synchronized void hY() {
        if (this.c) {
            return;
        }
        this.c = true;
        s();
        try {
            h();
        } catch (IOException unused) {
        }
        this.a.c(this, this.e, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.ajsu
    public final synchronized void hZ() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.c(this, this.e, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.ajpa
    public final boolean i() {
        ajxg ajxgVar = this.d;
        if (ajxgVar == null) {
            return false;
        }
        return ajxgVar.f;
    }

    @Override // defpackage.ajpa
    public final boolean j() {
        ajxg ajxgVar;
        if (this.c || (ajxgVar = this.d) == null) {
            return true;
        }
        return ajxgVar.j();
    }

    @Override // defpackage.ajpf
    public final int k() throws ajxf {
        ajxg ajxgVar = this.d;
        y(ajxgVar);
        return ajxgVar.k();
    }

    @Override // defpackage.ajpf
    public final InetAddress l() throws ajxf {
        ajxg ajxgVar = this.d;
        y(ajxgVar);
        return ajxgVar.l();
    }

    @Override // defpackage.ajsy
    public final void o() {
        this.b = true;
    }

    @Override // defpackage.ajsy
    public final void q(long j, TimeUnit timeUnit) {
        this.e = j > 0 ? timeUnit.toMillis(j) : -1L;
    }

    @Override // defpackage.ajsy
    public final void s() {
        this.b = false;
    }

    @Override // defpackage.ajsz
    public final SSLSession u() throws ajxf {
        ajxg ajxgVar = this.d;
        y(ajxgVar);
        if (!i()) {
            return null;
        }
        Socket socket = ajxgVar.i;
        if (socket instanceof SSLSocket) {
            return ((SSLSocket) socket).getSession();
        }
        return null;
    }

    @Override // defpackage.akba
    public final Object v(String str) throws ajxf {
        ajxg ajxgVar = this.d;
        y(ajxgVar);
        if (ajxgVar instanceof akba) {
            return ajxgVar.v(str);
        }
        return null;
    }

    protected synchronized void w() {
        this.d = null;
        this.e = Long.MAX_VALUE;
    }

    @Override // defpackage.akba
    public final void x(String str, Object obj) throws ajxf {
        ajxg ajxgVar = this.d;
        y(ajxgVar);
        if (ajxgVar instanceof akba) {
            ajxgVar.x(str, obj);
        }
    }

    protected final void y(ajxg ajxgVar) throws ajxf {
        if (this.c || ajxgVar == null) {
            throw new ajxf();
        }
    }
}
