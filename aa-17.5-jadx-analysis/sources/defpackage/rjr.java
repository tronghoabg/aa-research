package defpackage;

import android.os.RemoteException;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class rjr {
    public final Object a;
    public final Object b;
    public final Object c;

    public rjr(rjm rjmVar) {
        int i = 7;
        this.b = new rox(new rcn(i));
        this.c = rjmVar;
        this.a = new lah(new ree() { // from class: rjq
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, rjm] */
            @Override // defpackage.ree
            public final Object a() throws RemoteException {
                rjo rjoVar = new rjo(null);
                this.a.c.a(rjoVar);
                return rjoVar;
            }
        }, new rcv(this, i));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ucf] */
    public final synchronized void a() {
        ((ncp) this.c).a.s((trt) this.b);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ucf] */
    public final synchronized void b() {
        ((ncp) this.c).a.i((abcw) this.a, (trt) this.b);
    }

    public rjr(aezk aezkVar, tsn tsnVar, ukr ukrVar) {
        this.a = aezkVar;
        this.c = tsnVar;
        this.b = ukrVar;
    }

    public rjr(smw smwVar, ykd ykdVar, Runnable runnable) {
        this.b = smwVar;
        this.c = ykdVar;
        this.a = runnable;
    }

    public rjr(smw smwVar, ykd ykdVar, Runnable runnable, byte[] bArr) {
        this.b = smwVar;
        this.c = ykdVar;
        this.a = runnable;
    }

    public rjr(tnr tnrVar, xxh xxhVar, gms gmsVar) {
        this.b = tnrVar;
        this.a = xxhVar;
        this.c = gmsVar;
    }

    public rjr(ppo ppoVar, tmb tmbVar) {
        this.a = new HashMap();
        this.c = ppoVar;
        this.b = tmbVar;
    }

    public rjr(abcw abcwVar, trt trtVar, ncp ncpVar) {
        this.a = abcwVar;
        this.c = ncpVar;
        this.b = trtVar;
    }

    public rjr(rxk rxkVar) {
        this.c = ols.R("GH.BR.PROC");
        this.b = new Object();
        this.a = rxkVar;
    }
}
