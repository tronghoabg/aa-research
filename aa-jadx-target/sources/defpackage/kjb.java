package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kjb extends defpackage.kit {
    public static final /* synthetic */ int p = 0;
    public boolean o;
    private final defpackage.xzi q = defpackage.ysr.aQ(new defpackage.imy(10));
    private final java.lang.Runnable r = new defpackage.jpa(this, 7, null);

    public kjb() {
        if (!defpackage.jrj.a()) {
            throw new java.lang.IllegalStateException();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.kit
    public final void g() throws wfo {
        defpackage.wfp.c();
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3160)).u("onCarConnectedViaLifecycle");
        this.f = true;
        if (q()) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3161)).u("CarClientToken is already connected, so running onCarConnected()");
            t();
        } else {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3162)).u("Asking LifetimeManager to connect to the car service");
            defpackage.ler.c().c();
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3163)).u("CarClientToken is not yet connected, so requesting onCarConnected() be run when it is");
        }
    }

    @Override // defpackage.kit
    protected final void i() {
        d();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.kit
    protected final void j() throws wfo {
        defpackage.wfp.c();
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 3164)).u("CarConnectionListener onDisconnected(). isProjected: true");
        ((android.os.Handler) this.q.fF()).removeCallbacks(this.r);
        this.o = true;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3165)).u("Received onDisconnected callback, but ignoring since lifecycle will inform us of car disconnect");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.kit
    public final void k() throws wfo {
        defpackage.wfp.c();
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3166)).u("onCarDisconnectedViaLifecycle");
        this.f = false;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3167)).y("CarClientToken is in state %s; running onCarDisconnected()", new defpackage.zkf(defpackage.zke.a, a().name()));
        h();
        ((android.os.Handler) this.q.fF()).post(this.r);
    }

    @Override // defpackage.kit
    protected final void n(boolean z) {
        if (z) {
            return;
        }
        defpackage.rox.o("GH.CarClientManager", "Can't call getToken() if not within car connection!", new java.lang.Object[0]);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.kit
    protected final void u() throws wfo {
        defpackage.wfp.c();
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 3158)).u("CarConnectionListener onConnected(). isProjected: true");
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3159)).u("Received onConnected callback, but ignoring since lifecycle will inform us of car connection");
    }
}
