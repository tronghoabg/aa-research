package defpackage;

import android.content.Context;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class uzi implements ackr {
    private final acku a;
    private final acku b;
    private final acku c;
    private final acku d;
    private final acku e;
    private final acku f;

    public uzi(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6) {
        this.a = ackuVar;
        this.b = ackuVar2;
        this.c = ackuVar3;
        this.d = ackuVar4;
        this.e = ackuVar5;
        this.f = ackuVar6;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, xyc] */
    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() throws JSONException {
        Context context = (Context) this.a.a();
        xxh xxhVarB = ((uyq) this.b).b();
        uzj uzjVarA = ((uzk) this.c).a();
        htm htmVar = (htm) this.d.a();
        Map mapA = ((ackt) this.e).a();
        ((htm) this.f.a()).a.gu();
        zib zibVar = new zib();
        zibVar.c = true;
        zibVar.i = (short) (zibVar.i | 3);
        zibVar.b(false);
        zibVar.i = (short) (zibVar.i | 8);
        zibVar.c(false);
        zibVar.i = (short) (zibVar.i | 32);
        zibVar.a(1000);
        zibVar.i = (short) (zibVar.i | 128);
        zibVar.d(20);
        zibVar.a = (Context) xxhVarB.d(context);
        zibVar.j = uzjVarA;
        zibVar.c(true);
        zibVar.b(true);
        zibVar.b = "cronet-cache-" + context.getPackageName().hashCode();
        zibVar.a(1048576);
        uyi uyiVar = htmVar.B().c;
        if (uyiVar == null) {
            uyiVar = uyi.a;
        }
        if ((uyiVar.b & 2) != 0) {
            uyi uyiVar2 = htmVar.B().c;
            if (uyiVar2 == null) {
                uyiVar2 = uyi.a;
            }
            zibVar.d(uyiVar2.d);
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : mapA.entrySet()) {
            String str = (String) entry.getKey();
            try {
                jSONObject.put(str, entry.getValue());
            } catch (JSONException e) {
                ((ynz) ((ynz) ((ynz) uzh.a.g()).p(e)).ai((char) 9727)).y("Exception trying to set experimental Cronet option: %s", str);
            }
        }
        if (jSONObject.length() > 0) {
            zibVar.g = jSONObject.toString();
        }
        if (zibVar.i == 511) {
            zic zicVar = new zic(zibVar.a, zibVar.b, zibVar.c, zibVar.d, zibVar.e, zibVar.f, zibVar.g, zibVar.j, zibVar.h);
            if (zicVar.d) {
                woy.aa(zicVar.b != null, "Must specify cache storage path.");
            }
            return zicVar;
        }
        StringBuilder sb = new StringBuilder();
        if ((zibVar.i & 1) == 0) {
            sb.append(" enableQuic");
        }
        if ((zibVar.i & 2) == 0) {
            sb.append(" enableBrotli");
        }
        if ((zibVar.i & 4) == 0) {
            sb.append(" enableCertificateCache");
        }
        if ((zibVar.i & 8) == 0) {
            sb.append(" enableHttpCache");
        }
        if ((zibVar.i & 16) == 0) {
            sb.append(" enableNetworkQualityEstimator");
        }
        if ((zibVar.i & 32) == 0) {
            sb.append(" enablePrimesMonitoring");
        }
        if ((zibVar.i & 64) == 0) {
            sb.append(" diskCacheSizeBytes");
        }
        if ((zibVar.i & 128) == 0) {
            sb.append(" inMemoryFallbackCacheSizeBytes");
        }
        if ((zibVar.i & 256) == 0) {
            sb.append(" threadPriority");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
