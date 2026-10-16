package defpackage;

import com.google.android.projection.gearhead.companion.AndroidAutoActivity;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class wyt implements rbt {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public wyt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.rbt
    public final void a() {
        if (this.b == 0) {
            Object obj = this.a;
            AndroidAutoActivity androidAutoActivity = (AndroidAutoActivity) obj;
            wze wzeVar = androidAutoActivity.o;
            boolean z = false;
            try {
                mki.a.g();
                rdm rdmVarD = ((AndroidAutoActivity) obj).n.d();
                rox roxVar = rdmVarD.f;
                rct rctVar = new rct(rdmVarD, 1);
                int i = yfq.d;
                List list = (List) roxVar.d(rctVar, yls.a);
                if ((list == null || list.isEmpty()) && ((kmu) mki.a.i(kmu.class)).d("device_supported")) {
                    if (!acvh.v()) {
                        z = true;
                    }
                }
            } catch (IllegalStateException e) {
                ((ype) ((ype) ((ype) AndroidAutoActivity.m.h()).p(e)).ai((char) 9940)).u("Unexpected exception while checking allowed-cars!");
            }
            wzeVar.f = z;
            wzeVar.g();
            androidAutoActivity.n.g();
            return;
        }
        yph yphVar = kio.a;
        ((ype) yphVar.l().ai((char) 3116)).u("Token onConnected()");
        wer.c();
        wer.c();
        ((ype) ((ype) yphVar.f()).ai((char) 3138)).u("CarClientToken connected.");
        Object obj2 = this.a;
        kio kioVar = (kio) obj2;
        if (!kio.b.contains(kioVar.a())) {
            kioVar.m(kin.c);
        }
        kik kikVarA = kioVar.g.a();
        try {
            ((kio) obj2).i.add(kim.a);
            qsz qszVar = ((kio) obj2).h;
            wer.c();
            ((ype) yphVar.l().ai(3126)).u("notifyListenersOnConnected entered");
            CopyOnWriteArraySet copyOnWriteArraySet = ((kio) obj2).k;
            synchronized (copyOnWriteArraySet) {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    kfn kfnVar = (kfn) it.next();
                    ((ype) yphVar.l().ai(3127)).y("calling onConnected on %s", new zjd(zjc.a, kfnVar));
                    kfnVar.c(qszVar);
                }
            }
            ((kio) obj2).l();
            ((kio) obj2).i.remove(kim.a);
            kikVarA.close();
            if (kioVar.j.remove(kim.a) && kioVar.o()) {
                kioVar.f();
            } else if (kioVar.f) {
                EnumSet enumSet = kioVar.i;
                woy.ad(enumSet.isEmpty(), "activeCallbacks is not empty: %s", enumSet);
                kioVar.t();
            }
        } catch (Throwable th) {
            try {
                kikVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rbt
    public final void b(rbs rbsVar) {
        if (this.b != 0) {
            yph yphVar = kio.a;
            ((ype) yphVar.l().ai((char) 3117)).u("Token onConnectionSuspended()");
            wer.c();
            wer.c();
            kio kioVar = (kio) this.a;
            kioVar.d = rbsVar;
            kioVar.m(kin.f);
            yop yopVarF = yphVar.f();
            zjc zjcVar = zjc.a;
            ((ype) ((ype) yopVarF).ai((char) 3140)).y("connection suspended: %s", new zjd(zjcVar, rbsVar));
            wer.c();
            ((ype) yphVar.l().ai((char) 3130)).y("notifyListenersOnConnectionSuspended entered %s", new zjd(zjcVar, rbsVar));
            CopyOnWriteArraySet copyOnWriteArraySet = kioVar.k;
            synchronized (copyOnWriteArraySet) {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    kfn kfnVar = (kfn) it.next();
                    ((ype) yphVar.l().ai(3131)).M("calling onConnectionSuspended(%s) on %s", new zjd(zjcVar, rbsVar), new zjd(zjcVar, kfnVar));
                    kfnVar.fz();
                }
            }
        }
    }
}
