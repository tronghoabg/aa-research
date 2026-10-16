package e.a.b.a;

import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import e.a.az;
import e.a.d.gr;
import e.a.d.jw;
import e.a.ee;
import e.a.ef;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class k implements IBinder.DeathRecipient {

    /* renamed from: d, reason: collision with root package name */
    protected e.a.c f46403d;

    /* renamed from: e, reason: collision with root package name */
    protected ee f46404e;

    /* renamed from: g, reason: collision with root package name */
    private final gr f46405g;

    /* renamed from: h, reason: collision with root package name */
    private final ScheduledExecutorService f46406h;

    /* renamed from: i, reason: collision with root package name */
    private final az f46407i;
    private ah m;
    private long o;
    private long p;

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f46401f = Logger.getLogger(k.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public static final e.a.b f46399a = e.a.b.a("internal:remote-uid");

    /* renamed from: b, reason: collision with root package name */
    public static final e.a.b f46400b = e.a.b.a("internal:inbound-parcelable-policy");

    /* renamed from: k, reason: collision with root package name */
    private final LinkedHashSet f46409k = new LinkedHashSet();

    /* renamed from: l, reason: collision with root package name */
    private final List f46410l = new ArrayList();
    private int q = 1;

    /* renamed from: j, reason: collision with root package name */
    private final ab f46408j = new ab(new aa() { // from class: e.a.b.a.i
        @Override // e.a.b.a.aa
        public final boolean a(int i2, Parcel parcel) {
            return this.f46394a.D(i2, parcel);
        }
    });

    /* renamed from: c, reason: collision with root package name */
    protected final ConcurrentHashMap f46402c = new ConcurrentHashMap();
    private final n n = new n();

    protected k(gr grVar, e.a.c cVar, az azVar) {
        this.f46405g = grVar;
        this.f46403d = cVar;
        this.f46407i = azVar;
        this.f46406h = (ScheduledExecutorService) grVar.a();
    }

    private static ee a(RemoteException remoteException) {
        return ((remoteException instanceof DeadObjectException) || (remoteException instanceof TransactionTooLargeException)) ? ee.f47411k.f(remoteException) : ee.f47410j.f(remoteException);
    }

    private final void b() {
        ah ahVar = this.m;
        if (ahVar != null) {
            try {
                ahVar.f46316a.unlinkToDeath(this, 0);
            } catch (NoSuchElementException unused) {
            }
            try {
                ak akVarC = ak.c();
                try {
                    akVarC.a().writeInt(0);
                    this.m.a(2, akVarC);
                    akVarC.close();
                } finally {
                }
            } catch (RemoteException unused2) {
            }
        }
    }

    final void A(int i2, ak akVar) throws ef {
        int iDataSize = akVar.a().dataSize();
        try {
            this.m.a(i2, akVar);
            if (this.n.c(iDataSize)) {
                f46401f.logp(Level.FINE, "io.grpc.binder.internal.BinderTransport", "sendTransaction", "transmit window now full ".concat(toString()));
            }
        } catch (RemoteException e2) {
            throw new ef(a(e2));
        }
    }

    final void B(final ee eeVar, boolean z) {
        if (!F()) {
            this.f46404e = eeVar;
            H(4);
            n(eeVar);
        }
        if (I(5)) {
            return;
        }
        if (z || this.f46402c.isEmpty()) {
            this.f46408j.b();
            H(5);
            b();
            ConcurrentHashMap concurrentHashMap = this.f46402c;
            final ArrayList arrayList = new ArrayList(concurrentHashMap.values());
            concurrentHashMap.clear();
            List list = this.f46410l;
            final ArrayList arrayList2 = new ArrayList(list);
            list.clear();
            this.f46406h.execute(new Runnable() { // from class: e.a.b.a.j
                @Override // java.lang.Runnable
                public final void run() {
                    ee eeVar2 = eeVar;
                    ArrayList arrayList3 = arrayList;
                    int size = arrayList3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        r rVar = (r) arrayList3.get(i2);
                        synchronized (rVar) {
                            rVar.g(eeVar2);
                        }
                    }
                    ArrayList arrayList4 = arrayList2;
                    int size2 = arrayList4.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((Future) arrayList4.get(i3)).cancel(false);
                    }
                    k kVar = this.f46395a;
                    synchronized (kVar) {
                        kVar.o();
                    }
                    kVar.s();
                }
            });
        }
    }

    final void C(int i2) {
        ConcurrentHashMap concurrentHashMap = this.f46402c;
        if (concurrentHashMap.remove(Integer.valueOf(i2)) == null || !concurrentHashMap.isEmpty()) {
            return;
        }
        this.f46406h.execute(new Runnable() { // from class: e.a.b.a.h
            @Override // java.lang.Runnable
            public final void run() {
                k kVar = this.f46393a;
                synchronized (kVar) {
                    if (kVar.I(4)) {
                        kVar.B(kVar.f46404e, true);
                    }
                }
            }
        });
    }

    final boolean D(int i2, Parcel parcel) {
        ak akVarC;
        aj ajVar;
        jw jwVar;
        try {
            if (i2 < 1001) {
                synchronized (this) {
                    if (i2 == 1) {
                        m(parcel);
                    } else if (i2 == 2) {
                        B(ee.f47411k.g("transport shutdown by peer"), true);
                    } else if (i2 == 3) {
                        if (this.n.a(parcel.readLong())) {
                            f46401f.logp(Level.FINE, "io.grpc.binder.internal.BinderTransport", "handleAcknowledgedBytes", "handleAcknowledgedBytes: Transmit Window No-Longer Full. Unblock calls: ".concat(toString()));
                            LinkedHashSet linkedHashSet = this.f46409k;
                            ConcurrentHashMap concurrentHashMap = this.f46402c;
                            linkedHashSet.addAll(concurrentHashMap.keySet());
                            Iterator it = linkedHashSet.iterator();
                            while (E() && it.hasNext()) {
                                r rVar = (r) concurrentHashMap.get(it.next());
                                it.remove();
                                if (rVar != null) {
                                    synchronized (rVar) {
                                        ajVar = rVar.f46439d;
                                        jwVar = rVar.f46441f;
                                    }
                                    if (jwVar != null) {
                                        jwVar.f();
                                    }
                                    if (ajVar != null) {
                                        try {
                                            synchronized (ajVar) {
                                                ajVar.g();
                                            }
                                        } catch (ef e2) {
                                            synchronized (rVar) {
                                                rVar.g(e2.b());
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                    } else if (i2 == 4) {
                        int i3 = parcel.readInt();
                        if (this.q == 3) {
                            try {
                                akVarC = ak.c();
                                try {
                                    akVarC.a().writeInt(i3);
                                    this.m.a(5, akVarC);
                                    akVarC.close();
                                } finally {
                                }
                            } catch (RemoteException unused) {
                            }
                        }
                    } else {
                        if (i2 != 5) {
                            return false;
                        }
                        l(parcel);
                    }
                }
            } else {
                int iDataSize = parcel.dataSize();
                r rVar2 = (r) this.f46402c.get(Integer.valueOf(i2));
                if (rVar2 == null) {
                    synchronized (this) {
                    }
                    rVar2 = null;
                }
                if (rVar2 != null) {
                    rVar2.j(parcel);
                }
                long j2 = this.o + iDataSize;
                this.o = j2;
                if (j2 - this.p <= 16384) {
                    return true;
                }
                synchronized (this) {
                    ah ahVar = this.m;
                    com.google.d.b.an.B(ahVar);
                    long j3 = this.o;
                    try {
                        akVarC = ak.c();
                    } catch (RemoteException e3) {
                        B(a(e3), true);
                    }
                    try {
                        akVarC.a().writeLong(j3);
                        ahVar.a(3, akVarC);
                        akVarC.close();
                    } finally {
                    }
                }
                this.p = this.o;
            }
            return true;
        } catch (RuntimeException e4) {
            f46401f.logp(Level.SEVERE, "io.grpc.binder.internal.BinderTransport", "handleTransaction", "Terminating transport for uncaught Exception in transaction " + i2, (Throwable) e4);
            synchronized (this) {
                B(ee.f47410j.f(e4), true);
                return false;
            }
        }
    }

    final boolean E() {
        return !this.n.b();
    }

    final boolean F() {
        return I(4) || I(5);
    }

    protected final boolean G(ah ahVar) throws RemoteException {
        this.m = ahVar;
        try {
            ahVar.f46316a.linkToDeath(this, 0);
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }

    final void H(int i2) {
        int i3 = this.q;
        int i4 = i2 - 1;
        if (i4 == 1) {
            com.google.d.b.an.u(i3 == 1);
        } else if (i4 == 2) {
            com.google.d.b.an.u(i3 == 1 || i3 == 2);
        } else if (i4 != 3) {
            com.google.d.b.an.u(i3 == 4);
        } else {
            com.google.d.b.an.u(i3 == 1 || i3 == 2 || i3 == 3);
        }
        this.q = i2;
    }

    final boolean I(int i2) {
        return this.q == i2;
    }

    protected final void J(Future future) {
        this.f46410l.add(future);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final synchronized void binderDied() {
        B(ee.f47411k.g("Peer process crashed, exited or was killed (binderDied)"), true);
    }

    public final az c() {
        return this.f46407i;
    }

    protected void l(Parcel parcel) {
    }

    protected void m(Parcel parcel) {
    }

    abstract void n(ee eeVar);

    abstract void o();

    void s() {
        this.f46405g.b(this.f46406h);
    }

    protected void u(r rVar) {
        throw null;
    }

    public final synchronized e.a.c v() {
        return this.f46403d;
    }

    public final ScheduledExecutorService w() {
        return this.f46406h;
    }

    protected final void x(int i2) {
        ab abVar = this.f46408j;
        aa aaVarA = abVar.a();
        if (aaVarA != null) {
            abVar.c(new as(i2, Logger.getLogger(at.class.getName()), aaVarA));
        }
    }

    final void y(int i2, ee eeVar) {
        try {
            ak akVarC = ak.c();
            try {
                akVarC.a().writeInt(0);
                Parcel parcelA = akVarC.a();
                int iA = eeVar.a().a() << 16;
                String strI = eeVar.i();
                if (strI != null && strI.length() > 1000) {
                    strI = strI.substring(0, 1000);
                }
                if (strI != null) {
                    iA |= 32;
                    parcelA.writeString(strI);
                }
                at.b(akVarC.a(), iA | 8);
                A(i2, akVarC);
                akVarC.close();
            } finally {
            }
        } catch (ef e2) {
            f46401f.logp(Level.FINER, "io.grpc.binder.internal.BinderTransport", "sendOutOfBandClose", "Failed sending oob close transaction", (Throwable) e2);
        }
    }

    final void z(ah ahVar) {
        try {
            ak akVarC = ak.c();
            try {
                akVarC.a().writeInt(1);
                akVarC.a().writeStrongBinder(this.f46408j);
                ahVar.a(1, akVarC);
                akVarC.close();
            } finally {
            }
        } catch (RemoteException e2) {
            B(a(e2), true);
        }
    }
}
