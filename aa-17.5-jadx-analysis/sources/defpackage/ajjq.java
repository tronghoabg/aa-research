package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.UnknownServiceException;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class ajjq {
    public final ajhc a;
    public final ajjm b;
    public final boolean c;
    public ajju d;
    public ajjv e;
    public ajii f;
    public final afaz g;
    public final erb h;
    private final ajix i;
    private final ajjp j;

    public ajjq(ajix ajixVar, ajjp ajjpVar, ajhc ajhcVar, erb erbVar, ajjm ajjmVar, ajid ajidVar) {
        ajixVar.getClass();
        this.i = ajixVar;
        this.j = ajjpVar;
        this.a = ajhcVar;
        this.h = erbVar;
        this.b = ajjmVar;
        this.c = !affa.f(ajidVar.b, "GET");
        this.g = new afaz();
    }

    public final ajjb a(ajii ajiiVar, List list) throws IOException {
        ajiiVar.getClass();
        ajhc ajhcVar = ajiiVar.a;
        SSLSocketFactory sSLSocketFactory = ajhcVar.c;
        if (sSLSocketFactory == null) {
            if (!ajhcVar.j.contains(ajhm.b)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            ajhx ajhxVar = ajhcVar.h;
            ajly ajlyVar = ajly.c;
            String str = ajhxVar.b;
            if (!ajlyVar.f(str)) {
                throw new UnknownServiceException(a.bq(str, "CLEARTEXT communication to ", " not permitted by network security policy"));
            }
        } else if (ajhcVar.i.contains(ajib.e)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        ajid ajidVar = null;
        if (ajiiVar.b.type() == Proxy.Type.HTTP && (sSLSocketFactory != null || ajhcVar.i.contains(ajib.e))) {
            ajic ajicVar = new ajic();
            ajhx ajhxVar2 = ajhcVar.h;
            ajicVar.a = ajhxVar2;
            ajicVar.c("CONNECT");
            ajicVar.b("Host", ajis.c(ajhxVar2, true));
            ajicVar.b("Proxy-Connection", "Keep-Alive");
            ajicVar.b("User-Agent", "okhttp/5.3.2");
            ajidVar = new ajid(ajicVar);
            ajie ajieVar = new ajie();
            ajieVar.c(ajidVar);
            ajieVar.a = ajib.b;
            ajieVar.b = 407;
            ajieVar.c = "Preemptive Authenticate";
            ajieVar.i = -1L;
            ajieVar.j = -1L;
            ahdw.n(ajieVar.m, "Proxy-Authenticate", "OkHttp-Preemptive");
            ajieVar.a();
        }
        return new ajjb(this.i, this.j, this.b, this, ajiiVar, list, ajidVar, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038 A[Catch: all -> 0x0062, TryCatch #0 {, blocks: (B:14:0x0031, B:17:0x0038, B:20:0x0040), top: B:47:0x0031 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ajjr b(defpackage.ajjb r10, java.util.List r11) throws java.io.IOException {
        /*
            r9 = this;
            ajhc r0 = r9.a
            r1 = 1
            r2 = 0
            if (r10 == 0) goto Le
            boolean r3 = r10.j()
            if (r3 == 0) goto Le
            r3 = r1
            goto Lf
        Le:
            r3 = r2
        Lf:
            ajjp r4 = r9.j
            java.lang.Object r4 = r4.d
            j$.util.concurrent.ConcurrentLinkedQueue r4 = (j$.util.concurrent.ConcurrentLinkedQueue) r4
            java.util.Iterator r4 = r4.iterator()
            r4.getClass()
        L1c:
            boolean r5 = r4.hasNext()
            r6 = 0
            if (r5 == 0) goto L65
            ajjm r5 = r9.b
            java.lang.Object r7 = r4.next()
            ajjn r7 = (defpackage.ajjn) r7
            r7.getClass()
            monitor-enter(r7)
            if (r3 == 0) goto L38
            boolean r8 = r7.e()     // Catch: java.lang.Throwable -> L62
            if (r8 != 0) goto L38
            goto L3e
        L38:
            boolean r8 = r7.c(r0, r11)     // Catch: java.lang.Throwable -> L62
            if (r8 != 0) goto L40
        L3e:
            r8 = r2
            goto L44
        L40:
            r5.e(r7)     // Catch: java.lang.Throwable -> L62
            r8 = r1
        L44:
            monitor-exit(r7)
            if (r8 == 0) goto L1c
            boolean r8 = r9.c
            boolean r8 = r7.d(r8)
            if (r8 == 0) goto L50
            goto L66
        L50:
            monitor-enter(r7)
            r7.f()     // Catch: java.lang.Throwable -> L5f
            java.net.Socket r5 = r5.c()     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r7)
            if (r5 == 0) goto L1c
            defpackage.ajis.g(r5)
            goto L1c
        L5f:
            r9 = move-exception
            monitor-exit(r7)
            throw r9
        L62:
            r9 = move-exception
            monitor-exit(r7)
            throw r9
        L65:
            r7 = r6
        L66:
            if (r7 != 0) goto L69
            return r6
        L69:
            if (r10 == 0) goto L76
            ajii r11 = r10.a
            r9.f = r11
            java.net.Socket r9 = r10.c
            if (r9 == 0) goto L76
            defpackage.ajis.g(r9)
        L76:
            ajjr r9 = new ajjr
            r9.<init>(r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajjq.b(ajjb, java.util.List):ajjr");
    }

    public final boolean c(ajjn ajjnVar) {
        ajjv ajjvVar;
        ajii ajiiVar;
        if (this.g.isEmpty() && this.f == null) {
            if (ajjnVar != null) {
                synchronized (ajjnVar) {
                    ajiiVar = null;
                    if (ajjnVar.i == 0 && ajjnVar.g) {
                        ajii ajiiVar2 = ajjnVar.b;
                        if (ajis.h(ajiiVar2.a.h, this.a.h)) {
                            ajiiVar = ajiiVar2;
                        }
                    }
                }
                if (ajiiVar != null) {
                    this.f = ajiiVar;
                    return true;
                }
            }
            ajju ajjuVar = this.d;
            if ((ajjuVar == null || !ajjuVar.b()) && (ajjvVar = this.e) != null) {
                return ajjvVar.a();
            }
        }
        return true;
    }

    public final boolean d() {
        return this.b.m;
    }

    public final boolean e(ajhx ajhxVar) {
        ajhx ajhxVar2 = this.a.h;
        return ajhxVar.c == ajhxVar2.c && affa.f(ajhxVar.b, ajhxVar2.b);
    }
}
