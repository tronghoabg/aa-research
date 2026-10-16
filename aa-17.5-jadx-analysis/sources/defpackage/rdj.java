package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.display.CarDisplayId;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* loaded from: classes.dex */
public abstract class rdj implements rce, rpa, rpb {
    public final rdy a;
    final rcf b;
    public final Looper c;
    public final UUID d;
    public final AtomicMarkableReference e;
    public rox f;
    public final rju g;
    public final lah h;
    public final lah i;
    public final lah j;
    public final lah k;

    protected rdj(Looper looper) {
        rju rjuVar = new rju();
        final int i = 1;
        this.h = new lah(new rco(this, i), new ref() { // from class: rcp
            @Override // defpackage.ref
            public final void a(Object obj) {
                int i2 = i;
                if (i2 == 0) {
                    ((qux) obj).a();
                    return;
                }
                if (i2 == 1) {
                    ((quu) obj).a();
                } else if (i2 != 2) {
                    ((rpf) obj).a();
                } else {
                    ((qur) obj).a();
                }
            }
        });
        final int i2 = 0;
        this.i = new lah(new rco(this, i2), new ref() { // from class: rcp
            @Override // defpackage.ref
            public final void a(Object obj) {
                int i22 = i2;
                if (i22 == 0) {
                    ((qux) obj).a();
                    return;
                }
                if (i22 == 1) {
                    ((quu) obj).a();
                } else if (i22 != 2) {
                    ((rpf) obj).a();
                } else {
                    ((qur) obj).a();
                }
            }
        });
        final int i3 = 2;
        this.j = new lah(new rco(this, i3), new ref() { // from class: rcp
            @Override // defpackage.ref
            public final void a(Object obj) {
                int i22 = i3;
                if (i22 == 0) {
                    ((qux) obj).a();
                    return;
                }
                if (i22 == 1) {
                    ((quu) obj).a();
                } else if (i22 != 2) {
                    ((rpf) obj).a();
                } else {
                    ((qur) obj).a();
                }
            }
        });
        final int i4 = 3;
        this.k = new lah(new rco(this, i4), new ref() { // from class: rcp
            @Override // defpackage.ref
            public final void a(Object obj) {
                int i22 = i4;
                if (i22 == 0) {
                    ((qux) obj).a();
                    return;
                }
                if (i22 == 1) {
                    ((quu) obj).a();
                } else if (i22 != 2) {
                    ((rpf) obj).a();
                } else {
                    ((qur) obj).a();
                }
            }
        });
        this.a = new rdy();
        this.d = UUID.randomUUID();
        this.e = new AtomicMarkableReference(null, false);
        this.f = new rox(new nxt(i3));
        this.c = looper;
        this.g = rjuVar;
        this.b = new rdg(this);
    }

    private final zjd O() {
        return new zjd(zjc.a, getClass().getName() + "@" + Integer.toHexString(hashCode()));
    }

    @Override // defpackage.rpb
    public final int A(final String str, final int i) throws qrz {
        return ((Integer) this.f.e(new rzd() { // from class: rde
            @Override // defpackage.rzd, java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(this.a.C().gf(str, i));
            }
        })).intValue();
    }

    public final int B(String str, int i) {
        try {
            return A(str, i);
        } catch (qrz e) {
            rrd.d(5, "CAR.CLIENT", e, "Unable to connect to car service to get %s. Using default value %s", str, Integer.valueOf(i));
            return i;
        }
    }

    public abstract qup C() throws RemoteException;

    @Override // defpackage.rpb
    public final String D(final String str, final String str2) throws qrz {
        return (String) this.f.e(new rzd() { // from class: rcm
            @Override // defpackage.rzd, java.util.concurrent.Callable
            public final Object call() {
                return this.a.C().Y(str, str2);
            }
        });
    }

    public final void E() {
        if (omc.c("CAR.CLIENT", 3)) {
            zjd zjdVarO = O();
            rcf rcfVar = this.b;
            zjc zjcVar = zjc.a;
            rrd.d(3, "CAR.CLIENT", null, "onClientConnected() %s, registering localCarConnectionListener %s with multiplex listener %s", zjdVarO, new zjd(zjcVar, rcfVar), new zjd(zjcVar, this.a));
        }
        rdy rdyVar = this.a;
        rdyVar.f(this.b);
        if (omc.c("CAR.CLIENT", 3)) {
            rrd.d(3, "CAR.CLIENT", null, "Registering multiplex listener %s with car service", new zjd(zjc.a, rdyVar));
        }
        rox roxVar = this.f;
        try {
            new rze() { // from class: rcw
                @Override // defpackage.rze
                public final void a() throws RemoteException {
                    rdj rdjVar = this.a;
                    rdjVar.C().aM(rdjVar.a);
                }
            }.a();
        } catch (RemoteException e) {
            roxVar.i(e);
        }
    }

    public final void F(rcf rcfVar) {
        if (omc.c("CAR.CLIENT", 3)) {
            zjc zjcVar = zjc.a;
            rrd.d(3, "CAR.CLIENT", null, "Registering CarConnectionListener %s with multiplex listener %s", new zjd(zjcVar, rcfVar), new zjd(zjcVar, this.a));
        }
        this.a.f(rcfVar);
    }

    public void G() {
        int i = 3;
        if (omc.c("CAR.CLIENT", 3)) {
            rrd.d(3, "CAR.CLIENT", null, "tearDown() %s", O());
        }
        rdy rdyVar = this.a;
        rdyVar.g(this.b);
        rdyVar.c();
        rdyVar.d();
        I();
        try {
            C().bg(rdyVar);
        } catch (RemoteException | IllegalStateException unused) {
        }
        this.e.set(null, false);
        rju rjuVar = this.g;
        rjuVar.f(qrv.class, new rcn(i));
        rjuVar.e(rjg.class);
    }

    protected final void H() {
        int i = 1;
        int i2 = 0;
        if (omc.c("CAR.CLIENT", 3)) {
            rrd.d(3, "CAR.CLIENT", null, "tearDownCarManagers() %s", O());
        }
        rju rjuVar = this.g;
        rjuVar.f(rnx.class, new qhc(8));
        rjuVar.f(rfe.class, new qhc(15));
        rjuVar.f(roa.class, new qhc(16));
        rjuVar.f(qrh.class, new qhc(17));
        rjuVar.f(qrx.class, new qhc(18));
        rjuVar.f(roe.class, new qhc(19));
        rjuVar.f(rog.class, new qhc(20));
        rjuVar.f(qsb.class, new rcn(i));
        rjuVar.f(roj.class, new rcn(i2));
        rjuVar.f(rjt.class, new rcn(2));
        rjuVar.h(sab.class, new qhc(9));
        rjuVar.g(rol.class);
        rjuVar.h(rdx.class, new qhc(10));
        rjuVar.h(rjs.class, new qhc(11));
        rjuVar.f(rij.class, new qhc(12));
        rjuVar.f(rhj.class, new qhc(13));
        rjuVar.h(rjr.class, new qhc(14));
        try {
            rjuVar.g(rob.class);
        } catch (NoClassDefFoundError e) {
            rrd.d(5, "CAR.CLIENT", e, "Couldn't clear CarDisplayInfoManagerImpl cache as class not loaded from SDK.", new Object[0]);
        }
    }

    public final void I() {
        if (omc.c("CAR.CLIENT", 3)) {
            rrd.d(3, "CAR.CLIENT", null, "tearDownProjectionSessionState() %s", O());
        }
        H();
        this.i.D();
        this.h.D();
        this.j.D();
        this.k.D();
        this.e.compareAndSet(null, null, true, false);
    }

    @Deprecated
    public final void J(rck rckVar) {
        try {
            L(CarDisplayId.a).c(rckVar);
        } catch (IllegalStateException | qrz e) {
            rrd.d(5, "CAR.CLIENT", e, "Couldn't unregister listener: %s", rckVar);
        }
    }

    @Override // defpackage.rpa
    public final boolean K(roy royVar) {
        rox roxVar = this.f;
        rda rdaVar = new rda(this, royVar, 1);
        boolean z = royVar.g;
        return ((Boolean) roxVar.d(rdaVar, false)).booleanValue();
    }

    public final rdx L(CarDisplayId carDisplayId) throws qrz {
        return (rdx) this.f.b(new rda(this, carDisplayId, 3));
    }

    public final rdx M(CarDisplayId carDisplayId) throws RemoteException {
        return (rdx) this.g.c(rdx.class, carDisplayId.a(), new rcx(this, carDisplayId, 0));
    }

    @Override // defpackage.rpb
    public final boolean N(String str) throws qrz {
        return ((Boolean) this.f.e(new rda(this, str, 0))).booleanValue();
    }

    @Override // defpackage.rce
    public final int a() throws qrz {
        return ((Integer) this.f.b(new rcl(this, 4))).intValue();
    }

    @Override // defpackage.rce
    public final qrh b() throws qrz, qsa {
        return (qrh) this.f.a(new rcl(this, 17));
    }

    @Override // defpackage.rce
    public final CarInfo c() throws qrz {
        return (CarInfo) this.f.b(new rct(this, 5));
    }

    @Override // defpackage.rce
    public final qsb d() throws qrz, qsa {
        return (qsb) this.f.a(new rcl(this, 2));
    }

    @Override // defpackage.rce
    public final rij e() throws qrz, qsa {
        return (rij) this.f.a(new rct(this, 6));
    }

    @Override // defpackage.rce
    public final rjt f() throws qrz, qsa {
        return (rjt) this.f.a(new rct(this, 2));
    }

    @Override // defpackage.rce
    public final rju g() throws qrz, qsa {
        return (rju) this.f.a(new rct(this, 3));
    }

    @Override // defpackage.rce
    public final sab h(CarDisplayId carDisplayId) throws qrz, qsa {
        return (sab) this.f.a(new rda(this, carDisplayId, 2));
    }

    @Override // defpackage.rce
    public final List i(Intent intent, int i) throws qrz {
        return (List) this.f.b(new rcq(this, intent, i, 2));
    }

    @Override // defpackage.rce
    public final List j(Intent intent, int i) throws qrz {
        return (List) this.f.b(new rcq(this, intent, i, 3));
    }

    @Override // defpackage.rce
    public final List k(Intent intent, int i) throws qrz {
        return (List) this.f.b(new rcq(this, intent, i, 1));
    }

    @Override // defpackage.rce
    public final List l(Intent intent, int i) throws qrz {
        return (List) this.f.b(new rcq(this, intent, i, 4));
    }

    @Override // defpackage.rce
    public final void m(byte[] bArr, yxc yxcVar) throws qrz {
        this.f.k(new rdb(this, bArr, yxcVar, 2));
    }

    @Override // defpackage.rce
    public final void n(final String str, final boolean z) throws qrz {
        this.f.k(new rze() { // from class: rdd
            @Override // defpackage.rze
            public final void a() throws RemoteException {
                this.a.C().aR(str, z);
            }
        });
    }

    @Override // defpackage.rce
    public final void o(String str, String str2) throws qrz {
        this.f.k(new rdf(this, str, str2, 1));
    }

    @Override // defpackage.rce
    public final boolean p(raj rajVar) {
        AtomicMarkableReference atomicMarkableReference = this.e;
        ygr ygrVar = (ygr) atomicMarkableReference.getReference();
        if (ygrVar == null) {
            boolean z = rrd.a;
            rrd.d(4, "CAR.CLIENT", null, "carModuleFeaturesCache empty, retrieving from car service.", new Object[0]);
            ygrVar = (ygr) this.f.c(new rct(this, 0));
            if (ygrVar == null) {
                rrd.d(5, "CAR.CLIENT", null, "Failed to get module features from car service. Returning false for hasCarModuleFeature(%s).", new zjd(zjc.a, rajVar.name()));
                return false;
            }
            if (ygrVar.isEmpty()) {
                rrd.d(5, "CAR.CLIENT", null, "Module features are empty!", new Object[0]);
            }
            if (atomicMarkableReference.compareAndSet(null, ygrVar, true, true)) {
                rrd.d(4, "CAR.CLIENT", null, "Set carModuleFeaturesCache: %s", new zjd(zjc.a, ygrVar));
            }
        }
        return ygrVar.contains(rajVar.name());
    }

    @Override // defpackage.rce
    public final boolean q(String str, int i) throws qrz {
        return ((Boolean) this.f.b(new rcq(this, str, i, 0))).booleanValue();
    }

    @Override // defpackage.rce
    public final rnx r() throws qrz, qsa {
        return (rnx) this.f.a(new rcl(this, 20));
    }

    @Override // defpackage.rce
    public final roa s() throws qrz, qsa {
        return (roa) this.f.a(new rcl(this, 16));
    }

    @Override // defpackage.rce
    public final rob t(CarDisplayId carDisplayId) throws qrz, qsa {
        return (rob) this.f.a(new rda(this, carDisplayId, 4));
    }

    @Override // defpackage.rce
    public final roc u() {
        return (roc) this.g.d(roc.class, new tnp(1));
    }

    @Override // defpackage.rce
    public final rod v() {
        return (rod) this.g.d(rod.class, new koy(this, 3));
    }

    @Override // defpackage.rce
    public final roe w() throws qrz {
        return (roe) this.f.b(new rcl(this, 8));
    }

    @Override // defpackage.rce
    public final rog x() throws qrz, qsa {
        return (rog) this.f.a(new rcl(this, 7));
    }

    @Override // defpackage.rce
    public final roj y() throws qrz, qsa {
        return (roj) this.f.a(new rct(this, 4));
    }

    @Override // defpackage.rce
    public final void z(Intent intent, Bundle bundle) throws qrz {
        int i = 0;
        if (p(raj.i)) {
            for (ols olsVar : qqj.a.values()) {
            }
            this.f.g(new rdf(this, intent, bundle, i));
            return;
        }
        if (omc.c("CAR.CLIENT", 5)) {
            rrd.d(5, "CAR.CLIENT", null, "startCarActivity(Intent, Bundle, boolean) not supported by module. Falling back to startCarActivity(Intent, boolean).", new Object[0]);
        }
        for (ols olsVar2 : qqj.a.values()) {
        }
        this.f.g(new rcu(this, intent, 3));
    }
}
