package defpackage;

import java.io.IOException;
import java.net.Socket;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Deprecated
/* loaded from: classes2.dex */
public final class ajxh {
    protected final ajtt a;
    private final Log b = LogFactory.getLog(getClass());

    public ajxh(ajtt ajttVar) {
        this.a = ajttVar;
    }

    protected static final void c(Socket socket, akas akasVar) throws IOException {
        ahgm.e(akasVar, "HTTP parameters");
        socket.setTcpNoDelay(akasVar.d("http.tcp.nodelay", true));
        socket.setSoTimeout(akat.d(akasVar));
        ahgm.e(akasVar, "HTTP parameters");
        int iC = akasVar.c("http.socket.linger", -1);
        if (iC >= 0) {
            socket.setSoLinger(iC > 0, iC);
        }
    }

    private final ajtt d(akba akbaVar) {
        ajtt ajttVar = (ajtt) akbaVar.v("http.scheme-registry");
        return ajttVar == null ? this.a : ajttVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.ajxg r17, defpackage.ajpe r18, java.net.InetAddress r19, defpackage.akba r20, defpackage.akas r21) throws java.io.IOException, java.lang.IllegalArgumentException {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r21
            java.lang.String r0 = "Target host"
            defpackage.ahgm.e(r3, r0)
            java.lang.String r0 = "HTTP parameters"
            defpackage.ahgm.e(r5, r0)
            boolean r0 = r2.f
            r0 = r0 ^ 1
            java.lang.String r6 = "Connection must not be open"
            defpackage.ahkp.b(r0, r6)
            java.lang.String r0 = r3.d
            r6 = r20
            ajtt r6 = r1.d(r6)
            ajtp r0 = r6.a(r0)
            ajtu r6 = r0.b
            java.lang.String r7 = r3.a
            java.net.InetAddress[] r7 = java.net.InetAddress.getAllByName(r7)
            int r8 = r3.c
            int r8 = r0.a(r8)
            r9 = 0
            r10 = r9
        L39:
            int r0 = r7.length
            if (r10 >= r0) goto Lab
            r11 = r7[r10]
            int r12 = r0 + (-1)
            java.net.Socket r0 = r6.d(r5)
            r2.y(r0)
            ajsw r13 = new ajsw
            r13.<init>(r3, r11, r8)
            if (r4 == 0) goto L54
            java.net.InetSocketAddress r11 = new java.net.InetSocketAddress
            r11.<init>(r4, r9)
            goto L55
        L54:
            r11 = 0
        L55:
            org.apache.commons.logging.Log r14 = r1.b
            boolean r15 = r14.isDebugEnabled()
            if (r15 == 0) goto L6a
            java.lang.String r15 = r13.toString()
            java.lang.String r9 = "Connecting to "
            java.lang.String r9 = r9.concat(r15)
            r14.debug(r9)
        L6a:
            java.net.Socket r9 = r6.l(r0, r13, r11, r5)     // Catch: defpackage.ajsr -> L8b java.net.ConnectException -> L90
            if (r0 == r9) goto L74
            r2.y(r9)     // Catch: defpackage.ajsr -> L8b java.net.ConnectException -> L90
            r0 = r9
        L74:
            c(r0, r5)     // Catch: defpackage.ajsr -> L8b java.net.ConnectException -> L90
            boolean r0 = r6.e(r0)     // Catch: defpackage.ajsr -> L8b java.net.ConnectException -> L90
            java.lang.String r9 = "Parameters"
            defpackage.ahgm.e(r5, r9)     // Catch: defpackage.ajsr -> L8b java.net.ConnectException -> L90
            r2.r()     // Catch: defpackage.ajsr -> L8b java.net.ConnectException -> L90
            r2.j = r0     // Catch: defpackage.ajsr -> L8b java.net.ConnectException -> L90
            java.net.Socket r0 = r2.i     // Catch: defpackage.ajsr -> L8b java.net.ConnectException -> L90
            r2.t(r0, r5)     // Catch: defpackage.ajsr -> L8b java.net.ConnectException -> L90
            goto Lab
        L8b:
            r0 = move-exception
            if (r10 == r12) goto L8f
            goto L93
        L8f:
            throw r0
        L90:
            r0 = move-exception
            if (r10 == r12) goto Laa
        L93:
            org.apache.commons.logging.Log r0 = r1.b
            boolean r9 = r0.isDebugEnabled()
            if (r9 == 0) goto La6
            java.lang.String r9 = "Connect to "
            java.lang.String r11 = " timed out. Connection will be retried using another IP address"
            java.lang.String r9 = defpackage.a.bW(r13, r9, r11)
            r0.debug(r9)
        La6:
            int r10 = r10 + 1
            r9 = 0
            goto L39
        Laa:
            throw r0
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajxh.a(ajxg, ajpe, java.net.InetAddress, akba, akas):void");
    }

    public final void b(ajxg ajxgVar, ajpe ajpeVar, akba akbaVar, akas akasVar) throws IOException {
        ahgm.e(ajpeVar, "Target host");
        ahgm.e(akasVar, "Parameters");
        ahkp.b(ajxgVar.f, "Connection must be open");
        ajtp ajtpVarA = d(akbaVar).a(ajpeVar.d);
        ajtu ajtuVar = ajtpVarA.b;
        ahkp.b(ajtuVar instanceof ajtq, "Socket factory must implement SchemeLayeredSocketFactory");
        int i = ajpeVar.c;
        ajtq ajtqVar = (ajtq) ajtuVar;
        Socket socketF = ajtqVar.f(ajxgVar.i, ajpeVar.a, ajtpVarA.a(i));
        c(socketF, akasVar);
        ajxgVar.w(socketF, ajpeVar, ajtqVar.e(socketF), akasVar);
    }
}
