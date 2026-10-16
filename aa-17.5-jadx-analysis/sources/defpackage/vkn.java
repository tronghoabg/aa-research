package defpackage;

import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

/* loaded from: classes3.dex */
public final class vkn implements pxb {
    public static final yob a = yob.c("com/google/android/libraries/navigation/internal/service/NavSdkUsageServerProtocolRpc");
    private static final Executor c = zfq.a;
    public final Executor b;
    private final abow d;
    private final String e;
    private final CronetEngine f;
    private final pwh g;
    private final tmb h;
    private final zre i;

    public vkn(abow abowVar, String str, CronetEngine cronetEngine, pwh pwhVar, zre zreVar, tmb tmbVar, Executor executor) {
        this.d = abowVar;
        this.e = str;
        this.f = cronetEngine;
        this.g = pwhVar;
        this.i = zreVar;
        this.h = tmbVar;
        this.b = executor;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, xyc] */
    @Override // defpackage.pxb
    public final zgp a(udp udpVar, pwz pwzVar) {
        zhc zhcVar = new zhc();
        this.g.g(udpVar);
        try {
            URL url = new URL(this.e);
            abow abowVarQ = this.d;
            if (abowVarQ instanceof aazz) {
                abnp abnpVarO = aazz.a.o((aazz) abowVarQ);
                abnpVarO.t();
                ((aazz) abnpVarO.b).e = aclh.d(3);
                String strI = this.i.i();
                abnpVarO.t();
                aazz aazzVar = (aazz) abnpVarO.b;
                strI.getClass();
                aazzVar.d = strI;
                pwn pwnVarB = udpVar.b("apiToken");
                if (pwnVarB != null) {
                    String str = (String) pwnVarB.b;
                    abnpVarO.t();
                    ((aazz) abnpVarO.b).c = str;
                }
                pwn pwnVarB2 = udpVar.b("ZwiebackCookie");
                if (pwnVarB2 != null) {
                    String str2 = (String) pwnVarB2.b;
                    abnpVarO.t();
                    ((aazz) abnpVarO.b).b = str2;
                } else {
                    ((ynz) ((ynz) a.g()).ai((char) 9739)).u("Tried to send a request to the usage server, but no Zwieback cookie was found!");
                }
                abowVarQ = abnpVarO.q();
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            abowVarQ.g(byteArrayOutputStream);
            pul pulVar = new pul(byteArrayOutputStream, pwzVar, this.h);
            vkm vkmVar = new vkm(this, zhcVar);
            CronetEngine cronetEngine = this.f;
            String string = url.toString();
            Executor executor = c;
            UrlRequest.Builder builderAllowDirectExecutor = cronetEngine.newUrlRequestBuilder(string, vkmVar, executor).allowDirectExecutor();
            builderAllowDirectExecutor.setUploadDataProvider(pulVar, executor);
            UrlRequest.Builder builderAddHeader = builderAllowDirectExecutor.setHttpMethod("POST").addHeader("Content-Type", "application/x-protobuf");
            zre zreVar = this.i;
            builderAddHeader.addHeader("X-Goog-Api-Key", (String) zreVar.b.gu()).addHeader("X-Android-Package", zreVar.i()).addHeader("X-Android-Cert", (String) zreVar.c.gu());
            builderAllowDirectExecutor.build().start();
            return zhcVar;
        } catch (Exception e) {
            zhcVar.p(e);
            return zhcVar;
        }
    }
}
