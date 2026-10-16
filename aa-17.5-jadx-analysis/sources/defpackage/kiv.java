package defpackage;

import android.os.Handler;

/* loaded from: classes.dex */
public final class kiv extends kio {
    public static final /* synthetic */ int p = 0;
    public boolean o;
    private final xyc q = wub.L(new imq(11));
    private final Runnable r = new jgw(this, 13);

    public kiv() {
        if (!jri.a()) {
            throw new IllegalStateException();
        }
    }

    @Override // defpackage.kio
    public final void g() {
        wer.c();
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 3157)).u("onCarConnectedViaLifecycle");
        this.f = true;
        if (q()) {
            ((ype) ((ype) yphVar.f()).ai((char) 3158)).u("CarClientToken is already connected, so running onCarConnected()");
            t();
        } else {
            ((ype) ((ype) yphVar.f()).ai((char) 3159)).u("Asking LifetimeManager to connect to the car service");
            lbh.d().c();
            ((ype) ((ype) yphVar.f()).ai((char) 3160)).u("CarClientToken is not yet connected, so requesting onCarConnected() be run when it is");
        }
    }

    @Override // defpackage.kio
    protected final void i() {
        d();
    }

    @Override // defpackage.kio
    protected final void j() {
        wer.c();
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 3161)).u("CarConnectionListener onDisconnected(). isProjected: true");
        ((Handler) this.q.gu()).removeCallbacks(this.r);
        this.o = true;
        ((ype) ((ype) yphVar.f()).ai((char) 3162)).u("Received onDisconnected callback, but ignoring since lifecycle will inform us of car disconnect");
    }

    @Override // defpackage.kio
    public final void k() {
        wer.c();
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 3163)).u("onCarDisconnectedViaLifecycle");
        this.f = false;
        ((ype) ((ype) yphVar.f()).ai((char) 3164)).y("CarClientToken is in state %s; running onCarDisconnected()", new zjd(zjc.a, a().name()));
        h();
        ((Handler) this.q.gu()).post(this.r);
    }

    @Override // defpackage.kio
    protected final void n(boolean z) {
        if (z) {
            return;
        }
        tss.q("GH.CarClientManager", "Can't call getToken() if not within car connection!", new Object[0]);
    }

    @Override // defpackage.kio
    protected final void u() {
        wer.c();
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 3155)).u("CarConnectionListener onConnected(). isProjected: true");
        ((ype) ((ype) yphVar.f()).ai((char) 3156)).u("Received onConnected callback, but ignoring since lifecycle will inform us of car connection");
    }
}
