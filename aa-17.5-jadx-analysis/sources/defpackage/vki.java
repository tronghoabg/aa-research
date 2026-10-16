package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

/* loaded from: classes3.dex */
final class vki implements pxb {
    private static final Executor b = zfq.a;
    public final Executor a;
    private final tmb c;
    private final CronetEngine d;
    private final pwh e;
    private final String f = "https://mapsmobilesdks-pa.googleapis.com/maps/api/sdks:getProjectProperties";

    public vki(tmb tmbVar, CronetEngine cronetEngine, Executor executor, pwh pwhVar) {
        this.c = tmbVar;
        this.d = cronetEngine;
        this.a = executor;
        this.e = pwhVar;
    }

    @Override // defpackage.pxb
    public final zgp a(udp udpVar, pwz pwzVar) {
        this.e.g(udpVar);
        try {
            URL url = new URL(this.f);
            try {
                pwn pwnVarB = udpVar.b("apiToken");
                pwnVarB.getClass();
                abnp abnpVarN = absa.a.n();
                String str = (String) pwnVarB.b;
                abnpVarN.t();
                ((absa) abnpVarN.b).b = str;
                abnp abnpVarN2 = absc.a.n();
                abnpVarN2.t();
                absc abscVar = (absc) abnpVarN2.b;
                absa absaVar = (absa) abnpVarN.q();
                absaVar.getClass();
                abscVar.c = absaVar;
                abscVar.b = 1;
                abnp abnpVarN3 = absd.a.n();
                abnpVarN3.t();
                ((absd) abnpVarN3.b).c = aclh.f(7);
                abnpVarN3.t();
                absd absdVar = (absd) abnpVarN3.b;
                absc abscVar2 = (absc) abnpVarN2.q();
                abscVar2.getClass();
                absdVar.d = abscVar2;
                absdVar.b |= 1;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ((absd) abnpVarN3.q()).g(byteArrayOutputStream);
                zhc zhcVar = new zhc();
                pul pulVar = new pul(byteArrayOutputStream, pwzVar, this.c);
                vkh vkhVar = new vkh(this, zhcVar);
                CronetEngine cronetEngine = this.d;
                String string = url.toString();
                Executor executor = b;
                UrlRequest.Builder builderAllowDirectExecutor = cronetEngine.newUrlRequestBuilder(string, vkhVar, executor).allowDirectExecutor();
                builderAllowDirectExecutor.setUploadDataProvider(pulVar, executor);
                builderAllowDirectExecutor.setHttpMethod("POST").addHeader("Content-Type", "application/x-protobuf").addHeader("X-Goog-Api-Key", "AIzaSyCbgGF3G_6xKd0tM6d5xMe_x6HZWvPN51Q");
                builderAllowDirectExecutor.build().start();
                return zhcVar;
            } catch (IOException e) {
                return new zhc(e);
            }
        } catch (MalformedURLException e2) {
            return new zhc(e2);
        }
    }
}
