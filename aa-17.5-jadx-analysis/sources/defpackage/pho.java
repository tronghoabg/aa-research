package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class pho implements ozz {
    public static final /* synthetic */ int c = 0;
    private static final yph d = yph.c("GH.WPP.CONN");
    public pae a;
    public final gjt b;
    private final paa e;
    private final AtomicBoolean f = new AtomicBoolean(false);
    private final AtomicBoolean g = new AtomicBoolean(false);
    private final AtomicReference h = new AtomicReference(null);
    private final Handler i;
    private final long j;
    private HandlerThread k;
    private Handler l;
    private HandlerThread m;

    public pho(Looper looper, long j, paa paaVar) {
        this.j = j;
        this.b = new gjt(phn.a, new ooq(looper, 14));
        this.i = new Handler(looper);
        this.e = new phm(this, paaVar);
    }

    @Override // defpackage.ozz
    public final void a() {
        if (!this.g.compareAndSet(false, true)) {
            throw new IllegalStateException("disconnect called multiple times");
        }
        this.i.post(new pfp(this, 6));
        this.h.set(null);
        g();
    }

    @Override // defpackage.ozz
    public final void b(xpr xprVar, abow abowVar) {
        gjt gjtVar = this.b;
        woy.ad(((phn) gjtVar.e()).equals(phn.b), "sendMessage called when in state %s", ((phn) gjtVar.e()).name());
        this.l.post(new oey(this, xprVar, abowVar, 15, (short[]) null));
    }

    @Override // defpackage.ozz
    public final void c() {
        gjt gjtVar = this.b;
        woy.ad(((phn) gjtVar.e()).equals(phn.a), "start called when in state %s", ((phn) gjtVar.e()).name());
        gjtVar.f(phn.b);
        yph yphVar = d;
        ((ype) ((ype) yphVar.f()).ai((char) 6703)).u("Creating the transport in order to start listening");
        tgu tguVar = (tgu) this.h.get();
        woy.aa(tguVar != null, "start called before connect or after disconnect, or connect did not succeed");
        ((ype) ((ype) yphVar.f()).ai((char) 6701)).u("Creating the IO stream");
        pia piaVar = new pia(tguVar, this.j);
        ((ype) ((ype) yphVar.f()).ai((char) 6702)).u("Creating the transport");
        this.a = new phu(piaVar, this.e);
        HandlerThread handlerThread = new HandlerThread("wpp-write-thread");
        this.k = handlerThread;
        handlerThread.start();
        this.l = new Handler(this.k.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("wpp-read-thread");
        this.m = handlerThread2;
        handlerThread2.start();
        Handler handler = new Handler(this.m.getLooper());
        pae paeVar = this.a;
        paeVar.getClass();
        handler.post(new pfp(paeVar, 7));
    }

    @Override // defpackage.ozz
    public final void d() {
        gjt gjtVar = this.b;
        phn phnVar = (phn) gjtVar.e();
        phn phnVar2 = phn.c;
        if (phnVar.equals(phnVar2)) {
            return;
        }
        woy.ad(((phn) gjtVar.e()).equals(phn.b), "stop called when in state %s", ((phn) gjtVar.e()).name());
        gjtVar.f(phnVar2);
        ((ype) ((ype) d.f()).ai((char) 6704)).u("Stopping Wifi Projection Protocol read and write threads");
        this.m.quitSafely();
        this.k.quitSafely();
    }

    protected abstract tgu e() throws IOException;

    public final void f() throws IOException {
        if (!this.f.compareAndSet(false, true)) {
            throw new IllegalStateException("connect called multiple times");
        }
        tgu tguVarE = e();
        AtomicReference atomicReference = this.h;
        tguVarE.getClass();
        atomicReference.set(tguVarE);
    }

    protected abstract void g();

    public final void h(boolean z, Runnable runnable) {
        this.i.post(new lvn(this, z, runnable, 2));
    }

    public final String toString() {
        return "WifiProjectionProtocolBaseConnection";
    }
}
