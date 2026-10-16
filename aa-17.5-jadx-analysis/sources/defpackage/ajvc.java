package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;

@Deprecated
/* loaded from: classes2.dex */
public class ajvc implements ajoz, ajpf {
    public volatile boolean f;
    public volatile Socket g;
    public ajzu a = null;
    public ajzv b = null;
    public ajzs c = null;
    public ajzt d = null;
    public ajzd h = null;
    public ajvg e = null;

    private static void u(StringBuilder sb, SocketAddress socketAddress) {
        if (!(socketAddress instanceof InetSocketAddress)) {
            sb.append(socketAddress);
            return;
        }
        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
        sb.append(inetSocketAddress.getAddress() != null ? inetSocketAddress.getAddress().getHostAddress() : inetSocketAddress.getAddress());
        sb.append(':');
        sb.append(inetSocketAddress.getPort());
    }

    @Override // defpackage.ajoz
    public ajpj a() throws ajpd, IOException {
        throw null;
    }

    @Override // defpackage.ajoz
    public final void b() throws IOException {
        s();
        n();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    @Override // defpackage.ajoz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.ajpj r11) throws defpackage.ajpd, java.lang.NumberFormatException, java.io.IOException {
        /*
            r10 = this;
            java.lang.String r0 = "HTTP response"
            defpackage.ahgm.e(r11, r0)
            r10.s()
            ajzu r10 = r10.a
            java.lang.String r0 = "Session input buffer"
            defpackage.ahgm.e(r10, r0)
            java.lang.String r0 = "HTTP message"
            defpackage.ahgm.e(r11, r0)
            ajuw r1 = new ajuw
            r1.<init>()
            defpackage.ahgm.e(r11, r0)
            java.lang.String r0 = "Transfer-Encoding"
            ajoy r0 = r11.hW(r0)
            r2 = -2
            r4 = -1
            if (r0 == 0) goto L5d
            ajzy[] r6 = r0.a()     // Catch: defpackage.ajpr -> L4c
            int r7 = r6.length
            java.lang.String r0 = r0.c()
            java.lang.String r8 = "identity"
            boolean r0 = r8.equalsIgnoreCase(r0)
            if (r0 == 0) goto L3a
            goto L82
        L3a:
            if (r7 <= 0) goto L82
            int r7 = r7 + (-1)
            r0 = r6[r7]
            java.lang.String r0 = r0.a
            java.lang.String r6 = "chunked"
            boolean r0 = r6.equalsIgnoreCase(r0)
            if (r0 == 0) goto L82
            r6 = r2
            goto L83
        L4c:
            r10 = move-exception
            ajps r11 = new ajps
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Invalid Transfer-Encoding header value: "
            java.lang.String r0 = r1.concat(r0)
            r11.<init>(r0, r10)
            throw r11
        L5d:
            java.lang.String r0 = "Content-Length"
            ajoy r6 = r11.hW(r0)
            if (r6 == 0) goto L82
            ajoy[] r0 = r11.m(r0)
            int r6 = r0.length
        L6a:
            int r6 = r6 + (-1)
            if (r6 < 0) goto L7a
            r7 = r0[r6]
            java.lang.String r7 = r7.c()     // Catch: java.lang.NumberFormatException -> L79
            long r6 = java.lang.Long.parseLong(r7)     // Catch: java.lang.NumberFormatException -> L79
            goto L7b
        L79:
            goto L6a
        L7a:
            r6 = r4
        L7b:
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 < 0) goto L82
            goto L83
        L82:
            r6 = r4
        L83:
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L94
            r0 = 1
            r1.c = r0
            r1.e = r4
            ajzg r0 = new ajzg
            r0.<init>(r10)
            r1.d = r0
            goto Lb0
        L94:
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r2 = 0
            if (r0 != 0) goto La5
            r1.c = r2
            r1.e = r4
            ajzo r0 = new ajzo
            r0.<init>(r10)
            r1.d = r0
            goto Lb0
        La5:
            r1.c = r2
            r1.e = r6
            ajzi r0 = new ajzi
            r0.<init>(r10, r6)
            r1.d = r0
        Lb0:
            java.lang.String r10 = "Content-Type"
            ajoy r10 = r11.hW(r10)
            if (r10 == 0) goto Lba
            r1.a = r10
        Lba:
            java.lang.String r10 = "Content-Encoding"
            ajoy r10 = r11.hW(r10)
            if (r10 == 0) goto Lc4
            r1.b = r10
        Lc4:
            akac r11 = (defpackage.akac) r11
            r11.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajvc.c(ajpj):void");
    }

    @Override // defpackage.ajpa, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f) {
            this.f = false;
            Socket socket = this.g;
            try {
                n();
                try {
                    try {
                        socket.shutdownOutput();
                    } catch (IOException unused) {
                    }
                    socket.shutdownInput();
                } catch (IOException | UnsupportedOperationException unused2) {
                }
            } finally {
                socket.close();
            }
        }
    }

    @Override // defpackage.ajoz
    public final void d(ajpc ajpcVar) throws ajpd, IOException, NumberFormatException {
        long j;
        s();
        if (ajpcVar.a() == null) {
            return;
        }
        ajzv ajzvVar = this.b;
        ajpb ajpbVarA = ajpcVar.a();
        ahgm.e(ajzvVar, "Session output buffer");
        ahgm.e(ajpbVarA, "HTTP entity");
        ajoy ajoyVarHW = ajpcVar.hW("Transfer-Encoding");
        if (ajoyVarHW != null) {
            String strC = ajoyVarHW.c();
            if (!"chunked".equalsIgnoreCase(strC)) {
                if (!"identity".equalsIgnoreCase(strC)) {
                    throw new ajps("Unsupported transfer encoding: ".concat(String.valueOf(strC)));
                }
                j = -1;
            } else {
                if (ajpcVar.d().a(ajpm.b)) {
                    throw new ajps("Chunked transfer encoding not allowed for ".concat(String.valueOf(String.valueOf(ajpcVar.d()))));
                }
                j = -2;
            }
        } else {
            ajoy ajoyVarHW2 = ajpcVar.hW("Content-Length");
            if (ajoyVarHW2 != null) {
                String strC2 = ajoyVarHW2.c();
                try {
                    j = Long.parseLong(strC2);
                    if (j < 0) {
                        throw new ajps(a.bz(strC2, "Negative content length: "));
                    }
                } catch (NumberFormatException unused) {
                    throw new ajps("Invalid content length: ".concat(String.valueOf(strC2)));
                }
            } else {
                j = -1;
            }
        }
        OutputStream ajzhVar = j == -2 ? new ajzh(ajzvVar) : j == -1 ? new ajzp(ajzvVar) : new ajzj(ajzvVar, j);
        ajpbVarA.f(ajzhVar);
        ajzhVar.close();
    }

    @Override // defpackage.ajoz
    public void e(ajph ajphVar) throws ajpd, IOException {
        throw null;
    }

    @Override // defpackage.ajoz
    public final boolean f() throws IOException {
        s();
        try {
            return this.a.d(3000);
        } catch (SocketTimeoutException unused) {
            return false;
        }
    }

    @Override // defpackage.ajpa
    public final void g(int i) throws SocketException {
        s();
        if (this.g != null) {
            try {
                this.g.setSoTimeout(i);
            } catch (SocketException unused) {
            }
        }
    }

    @Override // defpackage.ajpa
    public void h() throws IOException {
        throw null;
    }

    @Override // defpackage.ajpa
    public final boolean i() {
        return this.f;
    }

    @Override // defpackage.ajpa
    public final boolean j() {
        if (!this.f || o()) {
            return true;
        }
        try {
            this.a.d(1);
            return o();
        } catch (SocketTimeoutException unused) {
            return false;
        } catch (IOException unused2) {
            return true;
        }
    }

    @Override // defpackage.ajpf
    public final int k() {
        if (this.g != null) {
            return this.g.getPort();
        }
        return -1;
    }

    @Override // defpackage.ajpf
    public final InetAddress l() {
        if (this.g != null) {
            return this.g.getInetAddress();
        }
        return null;
    }

    protected ajzt m(ajzu ajzuVar, ajpk ajpkVar, akas akasVar) {
        return new ajzk(ajzuVar, ajpkVar, akasVar);
    }

    protected final void n() throws IOException {
        this.b.a();
    }

    protected final boolean o() {
        ajzs ajzsVar = this.c;
        return ajzsVar != null && ajzsVar.e();
    }

    protected ajzu p(Socket socket, int i, akas akasVar) throws IOException {
        return new ajzq(socket, i, akasVar);
    }

    protected ajzv q(Socket socket, int i, akas akasVar) throws IOException {
        return new ajzf(socket, i, akasVar);
    }

    public final void r() {
        ahkp.b(!this.f, "Connection is already open");
    }

    protected final void s() {
        ahkp.b(this.f, "Connection is not open");
    }

    public final void t(Socket socket, akas akasVar) throws IOException {
        ahgm.e(socket, "Socket");
        ahgm.e(akasVar, "HTTP parameters");
        this.g = socket;
        int iC = akasVar.c("http.socket.buffer-size", -1);
        ajzu ajzuVarP = p(socket, iC, akasVar);
        ajzv ajzvVarQ = q(socket, iC, akasVar);
        this.a = ajzuVarP;
        this.b = ajzvVarQ;
        if (ajzuVarP instanceof ajzs) {
            this.c = (ajzs) ajzuVarP;
        }
        this.d = m(ajzuVarP, ajve.a, akasVar);
        this.h = new ajzm(ajzvVarQ);
        this.e = new ajvg();
        this.f = true;
    }

    public final String toString() {
        if (this.g == null) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        SocketAddress remoteSocketAddress = this.g.getRemoteSocketAddress();
        SocketAddress localSocketAddress = this.g.getLocalSocketAddress();
        if (remoteSocketAddress != null && localSocketAddress != null) {
            u(sb, localSocketAddress);
            sb.append("<->");
            u(sb, remoteSocketAddress);
        }
        return sb.toString();
    }
}
