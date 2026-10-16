package defpackage;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* loaded from: classes.dex */
public final class jpz extends qwf {
    public final jqa a;
    private final Handler b;

    public jpz(jqa jqaVar, Handler handler) {
        this.a = jqaVar;
        this.b = handler;
    }

    @Override // defpackage.qwg
    public final void a(int i) {
        ((ype) ((ype) jqa.a.f()).ai((char) 2577)).y("onCarConnectionFailure(...) received with carConnectionError: %s", new zjd(zjc.a, Integer.valueOf(i)));
        this.b.post(new hhx(this, i, 7));
    }

    @Override // defpackage.qwg
    public final void b(int i) {
        yph yphVar = jqa.a;
        yop yopVarF = yphVar.f();
        Integer numValueOf = Integer.valueOf(i);
        zjc zjcVar = zjc.a;
        ((ype) ((ype) yopVarF).ai((char) 2578)).y("onConnected(...) received with connectionType: %s", new zjd(zjcVar, numValueOf));
        AtomicMarkableReference atomicMarkableReference = this.a.i;
        if (atomicMarkableReference.compareAndSet(numValueOf, numValueOf, false, true)) {
            this.b.post(new ira(this, i, 4));
        } else {
            ((ype) ((ype) yphVar.h()).ai(2581)).M("onCarConnectionReadyForClients connection type mismatch. expected %s but was %s.", new zjd(zjcVar, numValueOf), new zjd(zjcVar, atomicMarkableReference.getReference()));
        }
    }

    @Override // defpackage.qwg
    public final void c() {
        ((ype) ((ype) jqa.a.f()).ai((char) 2579)).u("onDisconnected() received");
    }
}
