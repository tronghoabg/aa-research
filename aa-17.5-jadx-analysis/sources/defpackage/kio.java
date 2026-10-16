package defpackage;

import android.content.Context;
import android.util.Pair;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;

/* loaded from: classes.dex */
public abstract class kio implements lhg {
    public static final yph a;
    public static final ygr b;
    private static final tei o;
    public final tel c;
    public rbs d;
    public rbu e;
    public boolean f;
    public final kil g;
    public final qsz h;
    public final EnumSet i;
    public final EnumSet j;
    public final CopyOnWriteArraySet k;
    public final ydx l;
    public final rbt m;
    public final qqf n;
    private boolean p;

    static {
        yph yphVarC = yph.c("GH.CarClientManager");
        a = yphVarC;
        b = ygr.q(kin.c, kin.d, kin.e);
        zfq zfqVar = zfq.a;
        Level.FINEST.getClass();
        tel.a.getClass();
        Level level = Level.INFO;
        level.getClass();
        yphVarC.getClass();
        o = new tei(1, zfqVar, level, yphVarC);
    }

    protected kio(Context context) {
        kin kinVar = kin.a;
        teh tehVar = new teh(kinVar, o);
        tehVar.c = new tej(0);
        kin kinVar2 = kin.c;
        tehVar.b(kinVar, kinVar2);
        kin kinVar3 = kin.b;
        tehVar.b(kinVar, kinVar3);
        kin kinVar4 = kin.d;
        tehVar.b(kinVar2, kinVar4);
        tehVar.b(kinVar2, kinVar3);
        kin kinVar5 = kin.f;
        tehVar.b(kinVar2, kinVar5);
        tehVar.b(kinVar4, kinVar2);
        tehVar.b(kinVar5, kinVar2);
        tehVar.b(kinVar5, kinVar3);
        this.c = tehVar.a();
        this.g = new kil();
        this.i = EnumSet.noneOf(kim.class);
        this.j = EnumSet.noneOf(kim.class);
        this.k = new CopyOnWriteArraySet();
        this.l = new ydx(100);
        this.m = new wyt(this, 1);
        this.n = new kij(this);
        wer.c();
        this.h = (qsz) new ntn((Object) null).h(new jbk(this, context, 6));
    }

    public static kio b() {
        return (kio) mki.a.i(kio.class);
    }

    public final kin a() {
        return (kin) this.c.b();
    }

    @Override // defpackage.lhg
    public final void c() {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 3147)).u("start");
        wer.c();
        kik kikVarB = this.g.b();
        try {
            if (s()) {
                ((ype) yphVar.l().ai(3148)).u("client already started");
            } else {
                this.h.e();
            }
            kikVarB.close();
        } catch (Throwable th) {
            try {
                kikVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.lhg
    public final void d() {
        ((ype) a.l().ai((char) 3149)).u("stop");
        wer.c();
        EnumSet enumSet = this.i;
        if (enumSet.isEmpty()) {
            f();
        } else {
            this.j.addAll(enumSet);
        }
    }

    @ResultIgnorabilityUnspecified
    public final qrn e() {
        kik kikVarA = this.g.a();
        try {
            if (!q()) {
                ((ype) ((ype) ((ype) a.h()).p(new RuntimeException("Current stack"))).ai(3120)).u("getToken() called while client was disconnected!");
            }
            n(this.p);
            qsz qszVar = this.h;
            kikVarA.close();
            return qszVar;
        } catch (Throwable th) {
            try {
                kikVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void f() {
        ((ype) ((ype) a.f()).ai((char) 3118)).u("Disconnecting CarClientToken and resetting state");
        wer.c();
        kik kikVarB = this.g.b();
        try {
            if (s()) {
                this.h.g();
            }
            m(kin.a);
            kikVarB.close();
        } catch (Throwable th) {
            try {
                kikVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public abstract void g();

    protected final void h() {
        wer.c();
        if (a() != kin.d) {
            ((ype) ((ype) a.f()).ai((char) 3137)).y("Received car onDisconnected in state %s. Car is not currently expected to be connected.", new zjd(zjc.a, a().name()));
        }
        yph yphVar = a;
        yop yopVarF = yphVar.f();
        Boolean boolValueOf = Boolean.valueOf(jri.a());
        zjc zjcVar = zjc.a;
        ((ype) ((ype) yopVarF).ai((char) 3136)).y("car disconnected. isProjected: %s", new zjd(zjcVar, boolValueOf));
        m(kin.e);
        wer.c();
        ((ype) yphVar.l().ai((char) 3124)).u("notifyListenersOnCarDisconnected entered");
        CopyOnWriteArraySet copyOnWriteArraySet = this.k;
        synchronized (copyOnWriteArraySet) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                kfn kfnVar = (kfn) it.next();
                ((ype) yphVar.l().ai(3125)).y("calling onCarDisconnected on %s", new zjd(zjcVar, kfnVar));
                kfnVar.b();
            }
        }
        kik kikVarA = this.g.a();
        try {
            this.p = false;
            kikVarA.close();
            i();
        } catch (Throwable th) {
            try {
                kikVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    protected abstract void j();

    public abstract void k();

    public final void m(kin kinVar) {
        wer.c();
        this.c.c(kinVar);
        this.l.add(Pair.create(Long.valueOf(System.currentTimeMillis()), a().name()));
    }

    public final boolean o() {
        wer.c();
        return this.i.isEmpty();
    }

    public final boolean p() {
        return a() == kin.d;
    }

    public final boolean q() {
        kik kikVarA = this.g.a();
        try {
            boolean zB = this.h.b();
            kikVarA.close();
            return zB;
        } catch (Throwable th) {
            try {
                kikVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r() {
        /*
            r4 = this;
            r0 = 0
            kil r1 = r4.g     // Catch: java.lang.IllegalStateException -> L26
            kik r1 = r1.a()     // Catch: java.lang.IllegalStateException -> L26
            boolean r2 = r4.q()     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L17
            qsz r4 = r4.h     // Catch: java.lang.Throwable -> L1c
            boolean r4 = defpackage.oni.h(r4)     // Catch: java.lang.Throwable -> L1c
            if (r4 == 0) goto L17
            r4 = 1
            goto L18
        L17:
            r4 = r0
        L18:
            r1.close()     // Catch: java.lang.IllegalStateException -> L26
            return r4
        L1c:
            r4 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L21
            goto L25
        L21:
            r1 = move-exception
            r4.addSuppressed(r1)     // Catch: java.lang.IllegalStateException -> L26
        L25:
            throw r4     // Catch: java.lang.IllegalStateException -> L26
        L26:
            r4 = move-exception
            yph r1 = defpackage.kio.a
            yop r1 = r1.h()
            java.lang.String r2 = "Car service not connected"
            r3 = 3121(0xc31, float:4.373E-42)
            defpackage.a.bv(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kio.r():boolean");
    }

    public final boolean s() {
        kik kikVarA = this.g.a();
        try {
            boolean z = true;
            if (!q()) {
                if (!this.h.c()) {
                    z = false;
                }
            }
            kikVarA.close();
            return z;
        } catch (Throwable th) {
            try {
                kikVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void t() {
        kim kimVar;
        wer.c();
        if (!b.contains(a())) {
            ((ype) ((ype) a.f()).ai((char) 3135)).y("Received car onConnected in state %s. Skipping callbacks as client is not connected.", new zjd(zjc.a, a().name()));
            return;
        }
        kin kinVarA = a();
        kin kinVar = kin.d;
        if (kinVarA == kinVar) {
            ((ype) a.l().ai((char) 3134)).u("Car already connected. Skipping redundant onCarConnected callbacks.");
            return;
        }
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 3132)).u("car connected");
        m(kinVar);
        kik kikVarA = this.g.a();
        try {
            ((ype) yphVar.l().ai(3133)).u("notifyListenersOnCarConnected entered");
            this.p = true;
            wer.c();
            ((ype) yphVar.l().ai(3122)).u("notifyListenersOnCarConnected entered");
            CopyOnWriteArraySet copyOnWriteArraySet = this.k;
            synchronized (copyOnWriteArraySet) {
                EnumSet enumSet = this.i;
                kimVar = kim.b;
                enumSet.add(kimVar);
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    kfn kfnVar = (kfn) it.next();
                    ((ype) yphVar.l().ai(3123)).y("calling onCarConnected on %s", new zjd(zjc.a, kfnVar));
                    kfnVar.a(this.h);
                }
                enumSet.remove(kimVar);
            }
            kikVarA.close();
            if (this.j.remove(kimVar) && o()) {
                f();
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

    protected abstract void u();

    public final void v(kfn kfnVar) {
        kik kikVarA;
        wer.c();
        int iOrdinal = a().ordinal();
        if (iOrdinal == 1) {
            ((ype) a.l().ai((char) 3142)).y("notifying listener that connection had previously failed with result: %s", new zjd(zjc.a, this.e));
            kfnVar.d(this.e);
        } else if (iOrdinal == 2) {
            ((ype) a.l().ai((char) 3143)).u("notifying listener that the client was already connected");
            kikVarA = this.g.a();
            try {
                kfnVar.c(this.h);
                kikVarA.close();
            } finally {
                try {
                    kikVarA.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        } else if (iOrdinal == 3) {
            ((ype) a.l().ai((char) 3144)).u("notifying listener that the car was already connected");
            kik kikVarA2 = this.g.a();
            try {
                qsz qszVar = this.h;
                kfnVar.c(qszVar);
                kfnVar.a(qszVar);
                kikVarA2.close();
            } finally {
            }
        } else if (iOrdinal == 4) {
            ((ype) a.l().ai((char) 3145)).u("notifying listener that the car was already disconnected");
            kikVarA = this.g.a();
            try {
                if (q()) {
                    kfnVar.c(this.h);
                }
                kfnVar.b();
                kikVarA.close();
            } finally {
            }
        } else if (iOrdinal == 5) {
            ((ype) a.l().ai((char) 3146)).y("notifying listener that connection had previously been suspended for reason: %s", new zjd(zjc.a, this.d));
            kfnVar.fz();
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.k;
        synchronized (copyOnWriteArraySet) {
            copyOnWriteArraySet.add(kfnVar);
            ((ype) a.l().ai(3141)).y("registered listener %s", new zjd(zjc.a, kfnVar));
        }
    }

    public final void w(kfn kfnVar) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.k;
        synchronized (copyOnWriteArraySet) {
            copyOnWriteArraySet.remove(kfnVar);
            ((ype) a.l().ai(3150)).y("unregistered listener %s", new zjd(zjc.a, kfnVar));
        }
    }

    protected void i() {
    }

    public void l() {
    }

    protected void n(boolean z) {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    protected kio() {
        mki mkiVar = mki.a;
        Context context = mkiVar.c;
        mkiVar.f();
        this(context);
    }
}
