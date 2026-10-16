package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes3.dex */
public final class vzg implements vyv {
    public final Context a;
    public final ClearcutMetricSnapshotTransmitter b;
    private final xyc c;
    private final boolean d;
    private final vzc e;

    public vzg(Context context, xxh xxhVar, vzc vzcVar, ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter) {
        this.a = context;
        this.c = wub.L(new vdv(context, 11));
        this.d = ((Boolean) xxhVar.d(false)).booleanValue();
        this.e = vzcVar;
        this.b = clearcutMetricSnapshotTransmitter;
    }

    @Override // defpackage.vyv
    public final vyu a() {
        return new vyu(9);
    }

    @Override // defpackage.vyv
    @ResultIgnorabilityUnspecified
    public final zgp b(ajgu ajguVar) {
        int i;
        if (this.d) {
            ajgh ajghVar = ajguVar.i;
            if (ajghVar == null) {
                ajghVar = ajgh.a;
            }
            if ((ajghVar.b & 1) != 0) {
                return zfb.f(this.e.a(), new pgv(this, ajguVar, 5), zfq.a);
            }
        }
        int i2 = 0;
        if ((ajguVar.b & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0 && ((Boolean) this.c.gu()).booleanValue()) {
            abnp abnpVarK = ajguVar.K();
            ajgl ajglVar = ajguVar.l;
            if (ajglVar == null) {
                ajglVar = ajgl.a;
            }
            aboh<ajgk> abohVar = ajglVar.k;
            if (!abohVar.isEmpty()) {
                abnp abnpVarN = ajgp.a.n();
                ajgk ajgkVar = null;
                for (ajgk ajgkVar2 : abohVar) {
                    if (ajgkVar != null && (i = ajgkVar.e + 1) != ajgkVar2.d) {
                        abnpVarN.aP(0);
                        abnpVarN.aO(i);
                    }
                    abnpVarN.aP(ajgkVar2.c);
                    abnpVarN.aO(ajgkVar2.d);
                    ajgkVar = ajgkVar2;
                }
                if (ajgkVar != null && (ajgkVar.b & 4) != 0) {
                    int i3 = ajgkVar.e + 1;
                    abnpVarN.aP(0);
                    abnpVarN.aO(i3);
                }
                abnr abnrVar = (abnr) ajglVar.K();
                abnrVar.t();
                ((ajgl) abnrVar.b).k = abpf.b;
                abnrVar.t();
                ajgl ajglVar2 = (ajgl) abnrVar.b;
                ajgp ajgpVar = (ajgp) abnpVarN.q();
                ajgpVar.getClass();
                ajglVar2.j = ajgpVar;
                ajglVar2.b |= 128;
                ajglVar = (ajgl) abnrVar.q();
            }
            abnpVarK.t();
            ajgu ajguVar2 = (ajgu) abnpVarK.b;
            ajglVar.getClass();
            ajguVar2.l = ajglVar;
            ajguVar2.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
            ajguVar = (ajgu) abnpVarK.q();
        }
        zgp zgpVarA = this.e.a();
        vzf vzfVar = new vzf(this, ajguVar, i2);
        zfq zfqVar = zfq.a;
        zgp zgpVarG = zfb.g(zgpVarA, vzfVar, zfqVar);
        if (Log.isLoggable("ClearcutMetricXmitter", 4)) {
            wub.ah(zgpVarG, new khs(7), zfqVar);
        }
        return zgpVarG;
    }
}
