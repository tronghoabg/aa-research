package e.a;

import j$.time.Duration;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class dt<ReqT> {
    public dt(SSLSession sSLSession) throws SSLPeerUnverifiedException {
        sSLSession.getCipherSuite();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            Certificate certificate = localCertificates[0];
        }
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            if (peerCertificates != null) {
                Certificate certificate2 = peerCertificates[0];
            }
        } catch (SSLPeerUnverifiedException e2) {
            au.f46289a.logp(Level.FINE, "io.grpc.InternalChannelz$Tls", "<init>", String.format("Peer cert not available for peerHost=%s", sSLSession.getPeerHost()), (Throwable) e2);
        }
    }

    public static void a(cq cqVar, dv dvVar, String str, Map map) {
        com.waze.sharedui.d.a.b bVarO = com.waze.sharedui.d.a.b.o(cqVar);
        cq cqVarN = bVarO.n();
        com.google.d.b.an.s(str.equals(cqVarN.g()), "Method name should be prefixed with service name and separated with '/'. Expected service name: '%s'. Actual fully qualifed method name: '%s'.", str, cqVarN.f());
        String strF = cqVarN.f();
        com.google.d.b.an.y(!map.containsKey(strF), "Method by same name already registered: %s", strF);
        map.put(strF, bVarO);
    }

    public static dw b(dy dyVar, Map map) {
        HashMap map2 = new HashMap(map);
        for (cq cqVar : dyVar.b()) {
            com.waze.sharedui.d.a.b bVar = (com.waze.sharedui.d.a.b) map2.remove(cqVar.f());
            if (bVar == null) {
                throw new IllegalStateException("No method bound for descriptor entry ".concat(cqVar.f()));
            }
            if (bVar.n() != cqVar) {
                throw new IllegalStateException("Bound method for " + cqVar.f() + " not same instance as method in service descriptor");
            }
        }
        if (map2.size() <= 0) {
            return new dw(dyVar, map);
        }
        throw new IllegalStateException("No entry in descriptor matching bound method ".concat(((com.waze.sharedui.d.a.b) map2.values().iterator().next()).n().f()));
    }

    public static void d(dm dmVar, List list, List list2) {
        s(dmVar, list, list2);
    }

    public static void e(dm dmVar, List list, List list2) {
        s(dmVar, list, list2);
    }

    public static long f(Duration duration) {
        return dw.c(duration);
    }

    public static boolean g(ClassLoader classLoader) {
        return dw.b(classLoader);
    }

    public static bz h(ca caVar, String str) {
        return caVar.a(str);
    }

    public static void i(ca caVar) {
        caVar.b();
    }

    public static boolean j(String str, boolean z) {
        return aj.a(str, z);
    }

    public static boolean k() {
        return aj.b();
    }

    public static byte[] l(ag agVar) {
        return agVar.c();
    }

    public static void m() {
        v.a().c();
    }

    public static void n() {
        Iterator it = v.a().b().iterator();
        while (it.hasNext()) {
            ((u) it.next()).a();
        }
    }

    public static dt o(ac acVar, du duVar, dv dvVar) {
        ac acVarA = acVar.a();
        try {
            return new dl(dvVar.a(duVar));
        } finally {
            acVar.b(acVarA);
        }
    }

    public static i q(i iVar, List list) {
        com.google.d.b.an.C(iVar, "channel");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            iVar = new m(iVar, (l) it.next());
        }
        return iVar;
    }

    public static i r(i iVar, l... lVarArr) {
        return q(iVar, Arrays.asList(lVarArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void s(e.a.dm r4, java.util.List r5, java.util.List r6) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L12
            java.util.List r2 = r4.f47337c
            int r5 = r5.size()
            int r2 = r2.size()
            if (r5 != r2) goto L12
            r5 = r0
            goto L13
        L12:
            r5 = r1
        L13:
            java.util.List r2 = r4.f47337c
            int r2 = r2.size()
            java.lang.String r3 = "Incorrect number of required labels provided. Expected: %s"
            com.google.d.b.an.o(r5, r3, r2)
            if (r6 == 0) goto L2d
            java.util.List r5 = r4.f47338d
            int r6 = r6.size()
            int r5 = r5.size()
            if (r6 != r5) goto L2d
            goto L2e
        L2d:
            r0 = r1
        L2e:
            java.util.List r4 = r4.f47338d
            int r4 = r4.size()
            java.lang.String r5 = "Incorrect number of optional labels provided. Expected: %s"
            com.google.d.b.an.o(r0, r5, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.dt.s(e.a.dm, java.util.List, java.util.List):void");
    }

    public ee c(db dbVar) {
        throw null;
    }

    public p p() {
        throw null;
    }

    public dt(char[] cArr) {
    }

    public dt() {
    }
}
