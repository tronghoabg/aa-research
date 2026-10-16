package defpackage;

import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
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

/* loaded from: classes.dex */
public abstract class adoz implements IBinder.DeathRecipient {
    public static final Logger f = Logger.getLogger(adoz.class.getName());
    public static final adir g = new adir("internal:remote-uid");
    public static final adir h = new adir("internal:server-authority");
    public static final adir i = new adir("internal:inbound-parcelable-policy");
    private final adwt a;
    private final adkn b;
    public final ScheduledExecutorService j;
    protected adis n;
    public adnq o;
    public adqb p;
    public long r;
    public long s;
    public final LinkedHashSet m = new LinkedHashSet();
    private final List c = new ArrayList();
    public int t = 1;
    public final adpt k = new adpt(new adps() { // from class: adoy
        @Override // defpackage.adps
        public final boolean a(int i2, Parcel parcel) {
            adqf adqfVarC;
            adqe adqeVar;
            adzy adzyVar;
            adoz adozVar = this.a;
            try {
                if (i2 < 1001) {
                    synchronized (adozVar) {
                        if (i2 == 1) {
                            adozVar.i(parcel);
                        } else if (i2 == 2) {
                            adozVar.w(adnq.m.e("transport shutdown by peer"), true);
                        } else if (i2 != 3) {
                            if (i2 == 4) {
                                int i3 = parcel.readInt();
                                if (adozVar.t == 3) {
                                    try {
                                        adqfVarC = adqf.c();
                                        try {
                                            adqfVarC.a().writeInt(i3);
                                            adozVar.p.a(5, adqfVarC);
                                            adqfVarC.close();
                                        } finally {
                                        }
                                    } catch (RemoteException unused) {
                                    }
                                }
                            } else {
                                if (i2 != 5) {
                                    return false;
                                }
                                adozVar.g(parcel);
                            }
                        } else if (adozVar.q.a(parcel.readLong())) {
                            adoz.f.logp(Level.FINE, "io.grpc.binder.internal.BinderTransport", "handleAcknowledgedBytes", "handleAcknowledgedBytes: Transmit Window No-Longer Full. Unblock calls: ".concat(adozVar.toString()));
                            LinkedHashSet linkedHashSet = adozVar.m;
                            ConcurrentHashMap concurrentHashMap = adozVar.l;
                            linkedHashSet.addAll(concurrentHashMap.keySet());
                            Iterator it = linkedHashSet.iterator();
                            while (adozVar.y() && it.hasNext()) {
                                adpl adplVar = (adpl) concurrentHashMap.get(it.next());
                                it.remove();
                                if (adplVar != null) {
                                    synchronized (adplVar) {
                                        adqeVar = adplVar.e;
                                        adzyVar = adplVar.g;
                                    }
                                    if (adzyVar != null) {
                                        adzyVar.e();
                                    }
                                    if (adqeVar != null) {
                                        try {
                                            synchronized (adqeVar) {
                                                adqeVar.g();
                                            }
                                        } catch (adnr e) {
                                            synchronized (adplVar) {
                                                adnq adnqVar = e.a;
                                                adplVar.h(adnqVar, adnqVar, false);
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int iDataSize = parcel.dataSize();
                    ConcurrentHashMap concurrentHashMap2 = adozVar.l;
                    Integer numValueOf = Integer.valueOf(i2);
                    adpl adplVarHo = (adpl) concurrentHashMap2.get(numValueOf);
                    if (adplVarHo == null) {
                        synchronized (adozVar) {
                            if (!adozVar.z() && (adplVarHo = adozVar.ho(i2)) != null) {
                                adpl adplVar2 = (adpl) adozVar.l.put(numValueOf, adplVarHo);
                                wub.I(adplVar2 == null, "impossible appearance of %s", adplVar2);
                            }
                        }
                    }
                    if (adplVarHo != null) {
                        adplVarHo.k(parcel);
                    }
                    long j = adozVar.r + iDataSize;
                    adozVar.r = j;
                    if (j - adozVar.s <= 16384) {
                        return true;
                    }
                    synchronized (adozVar) {
                        adqb adqbVar = adozVar.p;
                        adqbVar.getClass();
                        long j2 = adozVar.r;
                        try {
                            adqfVarC = adqf.c();
                        } catch (RemoteException e2) {
                            adozVar.w(adoz.t(e2), true);
                        }
                        try {
                            adqfVarC.a().writeLong(j2);
                            adqbVar.a(3, adqfVarC);
                            adqfVarC.close();
                        } finally {
                        }
                    }
                    adozVar.s = adozVar.r;
                }
                return true;
            } catch (RuntimeException e3) {
                adoz.f.logp(Level.SEVERE, "io.grpc.binder.internal.BinderTransport", "handleTransaction", a.bp(i2, "Terminating transport for uncaught Exception in transaction "), (Throwable) e3);
                synchronized (adozVar) {
                    adozVar.w(adnq.l.d(e3), true);
                    return false;
                }
            }
        }
    });
    protected final ConcurrentHashMap l = new ConcurrentHashMap();
    public final adpg q = new adpg();

    protected adoz(adwt adwtVar, adis adisVar, adkn adknVar) {
        this.a = adwtVar;
        this.n = adisVar;
        this.b = adknVar;
        this.j = (ScheduledExecutorService) adwtVar.a();
    }

    private final void a() {
        adqb adqbVar = this.p;
        if (adqbVar != null) {
            try {
                adqbVar.b.unlinkToDeath(this, 0);
            } catch (NoSuchElementException unused) {
            }
            try {
                adqf adqfVarC = adqf.c();
                try {
                    adqfVarC.a().writeInt(0);
                    this.p.a(2, adqfVarC);
                    adqfVarC.close();
                } finally {
                }
            } catch (RemoteException unused2) {
            }
        }
    }

    public static adnq t(RemoteException remoteException) {
        return ((remoteException instanceof DeadObjectException) || (remoteException instanceof TransactionTooLargeException)) ? adnq.m.d(remoteException) : adnq.l.d(remoteException);
    }

    protected final boolean A(adqb adqbVar) throws RemoteException {
        this.p = adqbVar;
        try {
            adqbVar.b.linkToDeath(this, 0);
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }

    final void B(int i2) {
        int i3 = this.t;
        int i4 = i2 - 1;
        if (i4 == 1) {
            woy.Z(i3 == 1);
        } else if (i4 == 2) {
            woy.Z(i3 == 1 || i3 == 2);
        } else if (i4 != 3) {
            woy.Z(i3 == 4);
        } else {
            woy.Z(i3 == 1 || i3 == 2 || i3 == 3);
        }
        this.t = i2;
    }

    public final boolean C(int i2) {
        return this.t == i2;
    }

    protected final void D(Future future) {
        this.c.add(future);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final synchronized void binderDied() {
        w(adnq.m.e("Peer process crashed, exited or was killed (binderDied)"), true);
    }

    public final adkn e() {
        return this.b;
    }

    protected adpl ho(int i2) {
        return null;
    }

    public abstract void j(adnq adnqVar);

    public abstract void k();

    public void p() {
        this.a.b(this.j);
    }

    protected void r(adpl adplVar) {
        x(adplVar.d);
    }

    public final synchronized adis s() {
        return this.n;
    }

    final void u(adqb adqbVar) {
        try {
            adqf adqfVarC = adqf.c();
            try {
                adqfVarC.a().writeInt(1);
                adqfVarC.a().writeStrongBinder(this.k);
                adqbVar.a(1, adqfVarC);
                adqfVarC.close();
            } finally {
            }
        } catch (RemoteException e) {
            w(t(e), true);
        }
    }

    final void v(int i2, adqf adqfVar) throws adnr {
        int iDataSize = adqfVar.a().dataSize();
        try {
            this.p.a(i2, adqfVar);
            if (this.q.b(iDataSize)) {
                f.logp(Level.FINE, "io.grpc.binder.internal.BinderTransport", "sendTransaction", "transmit window now full ".concat(toString()));
            }
        } catch (RemoteException e) {
            throw new adnr(t(e));
        }
    }

    public final void w(adnq adnqVar, boolean z) {
        if (!z()) {
            this.o = adnqVar;
            B(4);
            j(adnqVar);
        }
        if (C(5)) {
            return;
        }
        if (z || this.l.isEmpty()) {
            this.k.a = null;
            B(5);
            a();
            ConcurrentHashMap concurrentHashMap = this.l;
            ArrayList arrayList = new ArrayList(concurrentHashMap.values());
            concurrentHashMap.clear();
            List list = this.c;
            ArrayList arrayList2 = new ArrayList(list);
            list.clear();
            this.j.execute(new saq(this, arrayList, adnqVar, arrayList2, 14, (char[]) null));
        }
    }

    final void x(int i2) {
        ConcurrentHashMap concurrentHashMap = this.l;
        if (concurrentHashMap.remove(Integer.valueOf(i2)) == null || !concurrentHashMap.isEmpty()) {
            return;
        }
        this.j.execute(new aabr(this, 17));
    }

    final boolean y() {
        return !this.q.a;
    }

    final boolean z() {
        return C(4) || C(5);
    }

    protected void g(Parcel parcel) {
    }

    protected void i(Parcel parcel) {
    }
}
