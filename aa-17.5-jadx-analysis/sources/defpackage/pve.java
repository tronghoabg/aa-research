package defpackage;

import java.nio.charset.Charset;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

/* loaded from: classes2.dex */
public final class pve implements pxb {
    public static final ygr a = ygr.q(200, 202, 204);
    public final pwp b;
    private final abow c;
    private final ackk d;
    private final pwh e;
    private final Executor f;

    public pve(abow abowVar, pwp pwpVar, ackk ackkVar, pwh pwhVar, Executor executor) {
        this.c = abowVar;
        this.b = pwpVar;
        this.d = ackkVar;
        this.e = pwhVar;
        this.f = executor;
    }

    public static boolean b(String str) {
        zcz zczVarN = zeb.n(str);
        String strSubstring = zczVarN.b;
        if (woy.am(strSubstring)) {
            throw new IllegalStateException("Uri has no authority: ".concat(zczVarN.toString()));
        }
        int iIndexOf = strSubstring.indexOf("@");
        if (iIndexOf >= 0) {
            strSubstring = strSubstring.substring(iIndexOf + 1);
        }
        try {
            zcu zcuVarA = zcu.a(strSubstring);
            woy.S(!zcuVarA.b, "Possible bracketless IPv6 literal: %s", zcuVarA.a);
            String str2 = zcuVarA.a;
            return str2.equals("www.google.com") || str2.endsWith(".google.com") || str2.equals("www.googleadservices.com");
        } catch (IllegalArgumentException e) {
            throw new IllegalStateException("Invalid authority '" + zczVarN.b + "' found in URI '" + zczVarN.toString() + "'", e);
        }
    }

    @Override // defpackage.pxb
    public final zgp a(udp udpVar, pwz pwzVar) {
        int iAC;
        zhc zhcVar = new zhc();
        abow abowVar = this.c;
        if (!(abowVar instanceof pvh)) {
            zhcVar.p(new IllegalArgumentException("Expected request type HttpRequest"));
            return zhcVar;
        }
        xuv xuvVarB = xuw.b("HttpProtocolRpc.send");
        try {
            pvh pvhVar = (pvh) abowVar;
            pwp pwpVar = this.b;
            uzu uzuVar = pwpVar.e;
            zcz zczVarN = zeb.n(uzuVar.c);
            zda zdaVar = new zda(zczVarN.e);
            Charset charset = zdaVar.a;
            woy.W(charset.equals(zczVarN.e), "encoding mismatch; expected %s but was %s", charset, zczVarN.e);
            String str = zczVarN.a;
            if (str != null) {
                zdaVar.b = str;
            }
            String str2 = zczVarN.b;
            if (str2 != null) {
                zdaVar.c = str2;
            }
            String str3 = zczVarN.c;
            if (str3 != null) {
                zdaVar.d = str3;
            }
            if (!zczVarN.b().A()) {
                zdaVar.a().B(zczVarN.b());
            }
            String str4 = zczVarN.d;
            if (str4 != null) {
                zdaVar.e = str4;
            }
            for (pvg pvgVar : pvhVar.b) {
                zdaVar.a().t(pvgVar.b, pvgVar.c);
            }
            String string = zdaVar.toString();
            UrlRequest.Builder builderAllowDirectExecutor = ((CronetEngine) this.d.a()).newUrlRequestBuilder(string, new pvd(this, zhcVar), this.f).allowDirectExecutor();
            String str5 = "GET";
            if ((uzuVar.b & 2) != 0 && ((iAC = a.aC(uzuVar.d)) == 0 || iAC == 1)) {
                str5 = "DEFAULT";
            }
            UrlRequest.Builder httpMethod = builderAllowDirectExecutor.setHttpMethod(str5);
            this.e.g(udpVar);
            uzv uzvVar = pwpVar.b;
            boolean z = uzvVar.c;
            pwn pwnVarB = udpVar.b("Authorization");
            if (z && b(string) && pwnVarB != null) {
                httpMethod.addHeader(pwnVarB.a, "Bearer ".concat((String) pwnVarB.b));
            }
            pwn pwnVarB2 = udpVar.b("ZwiebackCookie");
            if (z && b(string) && pwnVarB2 != null) {
                String str6 = uzvVar.h;
                if (str6.isEmpty()) {
                    str6 = pwnVarB2.a;
                }
                String strConcat = (String) pwnVarB2.b;
                if (!strConcat.startsWith("NID=")) {
                    strConcat = "NID=".concat(strConcat);
                }
                httpMethod.addHeader(str6, strConcat);
            }
            httpMethod.build().start();
            xuvVarB.close();
            return zhcVar;
        } catch (Throwable th) {
            try {
                xuvVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
