package defpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalUrlRequest;

/* loaded from: classes2.dex */
public final class pxr implements pxb {
    public static final yob a = yob.c("com/google/android/apps/gmm/systems/paintfe/PaintProtocolRpc");
    public static final String b = puq.a.a;
    private static final Executor j = zfq.a;
    public final abow c;
    public final pvn d;
    public final tmb e;
    public final boolean f;
    public final Executor g;
    public final aabf h;
    public final erb i;
    private final ackk k;
    private final pxm l;
    private final pwh m;
    private final aezk n;
    private final String o;
    private final pwp p;

    public pxr(abow abowVar, ackk ackkVar, pxm pxmVar, pwh pwhVar, pvn pvnVar, tmb tmbVar, erb erbVar, Executor executor, aezk aezkVar, aezk aezkVar2, String str, aabf aabfVar, pwp pwpVar) {
        this.c = abowVar;
        this.k = ackkVar;
        this.l = pxmVar;
        this.m = pwhVar;
        this.e = tmbVar;
        this.i = erbVar;
        this.d = pvnVar;
        this.g = executor;
        this.n = aezkVar;
        pol polVar = (pol) aezkVar2;
        polVar.a();
        this.f = polVar.a().b;
        boolean z = true;
        if (str != null && str.isEmpty()) {
            z = false;
        }
        woy.N(z);
        this.o = str;
        this.h = aabfVar;
        this.p = pwpVar;
    }

    private final long c(String str) throws pwv {
        try {
            String file = new URL(str).getFile();
            long j2 = ((aacd) this.n).a().e;
            int length = file.length() + 1;
            long[] jArr = new long[length];
            jArr[0] = j2 & 4294967295L;
            int i = 0;
            while (i < file.length()) {
                int i2 = i + 1;
                jArr[i2] = file.codePointAt(i) & 4294967295L;
                i = i2;
            }
            long j3 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                j3 = ((j3 * 1729) + jArr[i3]) % 131071;
            }
            return j3;
        } catch (MalformedURLException e) {
            ((ynz) ((ynz) a.g()).ai((char) 6939)).y("Error while generating a signature on the input request Url string: %s", str);
            throw new pwv(pwu.g.d(e));
        }
    }

    @Override // defpackage.pxb
    public final zgp a(udp udpVar, pwz pwzVar) {
        pxq pxqVar;
        int iAp;
        zhc zhcVar = new zhc();
        pxq pxqVar2 = pxq.PAINT;
        abow abowVar = this.c;
        if (abowVar instanceof abgj) {
            pxqVar = (this.f && (iAp = wox.ap(((abgj) abowVar).f)) != 0 && iAp == 9) ? pxq.PAINT_REROUTILE : pxq.PAINT;
        } else {
            if (!(abowVar instanceof abgh)) {
                throw new IllegalArgumentException("No Paint protocol RequestType for ".concat(String.valueOf(String.valueOf(abowVar))));
            }
            pxqVar = pxq.GET_PARAMETERS;
        }
        try {
            String externalForm = this.l.b().toExternalForm();
            if (!externalForm.endsWith("/")) {
                externalForm = String.valueOf(externalForm).concat("/");
            }
            if (pxqVar.equals(pxq.GET_PARAMETERS) && externalForm.endsWith("/vt/")) {
                externalForm = externalForm.substring(0, externalForm.length() - 3);
            }
            String str = externalForm + pxqVar.d + "?";
            ytq ytqVar = ytq.e;
            String strConcat = str.concat("bpb=".concat(ytqVar.i(abowVar.h())));
            pxo pxoVar = new pxo(this, zhcVar, new pxp(this, pxqVar));
            pvn pvnVar = this.d;
            pvnVar.c(0L);
            pvnVar.a(strConcat.length(), false);
            ExperimentalUrlRequest.Builder builder = (ExperimentalUrlRequest.Builder) ((CronetEngine) this.k.a()).newUrlRequestBuilder(strConcat, pxoVar, j).allowDirectExecutor();
            builder.setHttpMethod("GET");
            long jC = c(strConcat);
            this.m.g(udpVar);
            pwn pwnVarB = udpVar.b("Authorization");
            if (pwnVarB != null) {
                builder.addHeader(pwnVarB.a, "Bearer ".concat((String) pwnVarB.b));
            }
            builder.addHeader("X-Client-Signature", Long.toString(jC));
            String str2 = this.o;
            if (!woy.am(str2)) {
                builder.addHeader("X-Google-Maps-Mobile-API", str2);
            }
            pxj pxjVar = this.p.m;
            if (pxjVar != null && pxjVar.a()) {
                builder.addHeader("x-geo-tile-fetching-context", ytqVar.i(((abad) pxjVar.a.q()).h()));
            }
            builder.addRequestAnnotation((Object) new pth(abowVar.getClass(), pwzVar));
            ExperimentalUrlRequest experimentalUrlRequestBuild = builder.build();
            wub.ah(zhcVar, new ikn(experimentalUrlRequestBuild, 15), zfq.a);
            zhcVar.c(new pru(pwzVar, 13), this.g);
            experimentalUrlRequestBuild.start();
            this.e.b();
            return zhcVar;
        } catch (Exception e) {
            ((ynz) ((ynz) a.g()).ai((char) 6940)).u("Could not encode Paint request.");
            zhcVar.p(e);
            return zhcVar;
        }
    }

    public final void b() {
        ((CronetEngine) this.k.a()).getGlobalMetricsDeltas();
    }
}
