package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class adqa implements android.os.IBinder.DeathRecipient {
    public static final java.util.logging.Logger f = java.util.logging.Logger.getLogger(defpackage.adqa.class.getName());
    public static final defpackage.adjr g = new defpackage.adjr("internal:remote-uid");
    public static final defpackage.adjr h = new defpackage.adjr("internal:server-authority");
    public static final defpackage.adjr i = new defpackage.adjr("internal:inbound-parcelable-policy");
    private final adxu a;
    private final defpackage.adlo b;
    public final java.util.concurrent.ScheduledExecutorService j;
    protected defpackage.adjs n;
    public defpackage.ador o;
    public defpackage.adrb p;
    public long r;
    public long s;
    public final java.util.LinkedHashSet m = new java.util.LinkedHashSet();
    private final java.util.List c = new java.util.ArrayList();
    public int t = 1;
    public final defpackage.adqt k = new defpackage.adqt(new adqs() { // from class: adpz
        public final boolean a(int i2, android.os.Parcel parcel) {
            adre adreVar;
            aeay aeayVar;
            defpackage.adqa adqaVar = this.a;
            try {
                if (i2 < 1001) {
                    synchronized (adqaVar) {
                        if (i2 == 1) {
                            adqaVar.i(parcel);
                        } else if (i2 == 2) {
                            adqaVar.w(defpackage.ador.m.e("transport shutdown by peer"), true);
                        } else if (i2 != 3) {
                            if (i2 == 4) {
                                int i3 = parcel.readInt();
                                if (adqaVar.t == 3) {
                                    try {
                                        adrf adrfVarC = adrf.c();
                                        try {
                                            adrfVarC.a().writeInt(i3);
                                            adqaVar.p.a(5, adrfVarC);
                                            adrfVarC.close();
                                        } catch (java.lang.Throwable th) {
                                            try {
                                                adrfVarC.close();
                                                throw th;
                                            } catch (java.lang.Throwable th2) {
                                                th.addSuppressed(th2);
                                                throw th;
                                            }
                                        }
                                    } catch (android.os.RemoteException unused) {
                                    }
                                }
                            } else {
                                if (i2 != 5) {
                                    return false;
                                }
                                adqaVar.g(parcel);
                            }
                        } else if (adqaVar.q.a(parcel.readLong())) {
                            defpackage.adqa.f.logp(java.util.logging.Level.FINE, "io.grpc.binder.internal.BinderTransport", "handleAcknowledgedBytes", "handleAcknowledgedBytes: Transmit Window No-Longer Full. Unblock calls: ".concat(adqaVar.toString()));
                            java.util.LinkedHashSet linkedHashSet = adqaVar.m;
                            j$.util.concurrent.ConcurrentHashMap concurrentHashMap = adqaVar.l;
                            linkedHashSet.addAll(concurrentHashMap.keySet());
                            java.util.Iterator it = linkedHashSet.iterator();
                            while (adqaVar.y() && it.hasNext()) {
                                adqn adqnVar = (adqn) concurrentHashMap.get(it.next());
                                it.remove();
                                if (adqnVar != null) {
                                    synchronized (adqnVar) {
                                        adreVar = adqnVar.e;
                                        aeayVar = adqnVar.g;
                                    }
                                    if (aeayVar != null) {
                                        aeayVar.e();
                                    }
                                    if (adreVar != null) {
                                        try {
                                            synchronized (adreVar) {
                                                try {
                                                    adreVar.g();
                                                } catch (java.lang.Throwable th3) {
                                                    throw th3;
                                                }
                                            }
                                        } catch (ados e) {
                                            synchronized (adqnVar) {
                                                defpackage.ador adorVar = e.a;
                                                adqnVar.h(adorVar, adorVar, false);
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
                    j$.util.concurrent.ConcurrentHashMap concurrentHashMap2 = adqaVar.l;
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(i2);
                    adqn adqnVarGz = (adqn) concurrentHashMap2.get(numValueOf);
                    if (adqnVarGz == null) {
                        synchronized (adqaVar) {
                            if (!adqaVar.z() && (adqnVarGz = adqaVar.gz(i2)) != null) {
                                adqn adqnVar2 = (adqn) adqaVar.l.put(numValueOf, adqnVarGz);
                                defpackage.ysr.aN(adqnVar2 == null, "impossible appearance of %s", adqnVar2);
                            }
                        }
                    }
                    if (adqnVarGz != null) {
                        adqnVarGz.k(parcel);
                    }
                    long j = adqaVar.r + ((long) iDataSize);
                    adqaVar.r = j;
                    if (j - adqaVar.s <= 16384) {
                        return true;
                    }
                    synchronized (adqaVar) {
                        defpackage.adrb adrbVar = adqaVar.p;
                        adrbVar.getClass();
                        long j2 = adqaVar.r;
                        try {
                            adrf adrfVarC2 = adrf.c();
                            try {
                                adrfVarC2.a().writeLong(j2);
                                adrbVar.a(3, adrfVarC2);
                                adrfVarC2.close();
                            } catch (java.lang.Throwable th4) {
                                try {
                                    adrfVarC2.close();
                                    throw th4;
                                } catch (java.lang.Throwable th5) {
                                    th4.addSuppressed(th5);
                                    throw th4;
                                }
                            }
                        } catch (android.os.RemoteException e2) {
                            adqaVar.w(defpackage.adqa.t(e2), true);
                        }
                    }
                    adqaVar.s = adqaVar.r;
                }
                return true;
            } catch (java.lang.RuntimeException e3) {
                defpackage.adqa.f.logp(java.util.logging.Level.SEVERE, "io.grpc.binder.internal.BinderTransport", "handleTransaction", defpackage.a.bo(i2, "Terminating transport for uncaught Exception in transaction "), (java.lang.Throwable) e3);
                synchronized (adqaVar) {
                    adqaVar.w(defpackage.ador.l.d(e3), true);
                    return false;
                }
            }
        }
    });
    protected final j$.util.concurrent.ConcurrentHashMap l = new j$.util.concurrent.ConcurrentHashMap();
    public final adqi q = new adqi();

    protected adqa(adxu adxuVar, defpackage.adjs adjsVar, defpackage.adlo adloVar) {
        this.a = adxuVar;
        this.n = adjsVar;
        this.b = adloVar;
        this.j = (java.util.concurrent.ScheduledExecutorService) adxuVar.a();
    }

    private final void a() {
        defpackage.adrb adrbVar = this.p;
        if (adrbVar != null) {
            try {
                adrbVar.b.unlinkToDeath(this, 0);
            } catch (java.util.NoSuchElementException unused) {
            }
            try {
                adrf adrfVarC = adrf.c();
                try {
                    adrfVarC.a().writeInt(0);
                    this.p.a(2, adrfVarC);
                    adrfVarC.close();
                } catch (java.lang.Throwable th) {
                    try {
                        adrfVarC.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (android.os.RemoteException unused2) {
            }
        }
    }

    public static defpackage.ador t(android.os.RemoteException remoteException) {
        return ((remoteException instanceof android.os.DeadObjectException) || (remoteException instanceof android.os.TransactionTooLargeException)) ? defpackage.ador.m.d(remoteException) : defpackage.ador.l.d(remoteException);
    }

    protected final boolean A(defpackage.adrb adrbVar) {
        this.p = adrbVar;
        try {
            adrbVar.b.linkToDeath(this, 0);
            return true;
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    final void B(int i2) {
        int i3 = this.t;
        int i4 = i2 - 1;
        if (i4 == 1) {
            defpackage.ysr.bj(i3 == 1);
        } else if (i4 == 2) {
            defpackage.ysr.bj(i3 == 1 || i3 == 2);
        } else if (i4 != 3) {
            defpackage.ysr.bj(i3 == 4);
        } else {
            defpackage.ysr.bj(i3 == 1 || i3 == 2 || i3 == 3);
        }
        this.t = i2;
    }

    public final boolean C(int i2) {
        return this.t == i2;
    }

    protected final void D(java.util.concurrent.Future future) {
        this.c.add(future);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final synchronized void binderDied() {
        w(defpackage.ador.m.e("Peer process crashed, exited or was killed (binderDied)"), true);
    }

    public final defpackage.adlo e() {
        return this.b;
    }

    protected adqn gz(int i2) {
        return null;
    }

    public abstract void j(defpackage.ador adorVar);

    public abstract void k();

    public void p() {
        this.a.b(this.j);
    }

    protected void r(adqn adqnVar) {
        x(adqnVar.d);
    }

    public final synchronized defpackage.adjs s() {
        return this.n;
    }

    final void u(defpackage.adrb adrbVar) {
        try {
            adrf adrfVarC = adrf.c();
            try {
                adrfVarC.a().writeInt(1);
                adrfVarC.a().writeStrongBinder(this.k);
                adrbVar.a(1, adrfVarC);
                adrfVarC.close();
            } catch (java.lang.Throwable th) {
                try {
                    adrfVarC.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (android.os.RemoteException e) {
            w(t(e), true);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ados */
    final void v(int i2, adrf adrfVar) throws ados {
        int iDataSize = adrfVar.a().dataSize();
        try {
            this.p.a(i2, adrfVar);
            if (this.q.b(iDataSize)) {
                f.logp(java.util.logging.Level.FINE, "io.grpc.binder.internal.BinderTransport", "sendTransaction", "transmit window now full ".concat(toString()));
            }
        } catch (android.os.RemoteException e) {
            throw new ados(t(e));
        }
    }

    public final void w(defpackage.ador adorVar, boolean z) {
        if (!z()) {
            this.o = adorVar;
            B(4);
            j(adorVar);
        }
        if (C(5)) {
            return;
        }
        if (z || this.l.isEmpty()) {
            this.k.a = null;
            B(5);
            a();
            j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.l;
            java.util.ArrayList arrayList = new java.util.ArrayList(concurrentHashMap.values());
            concurrentHashMap.clear();
            java.util.List list = this.c;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(list);
            list.clear();
            this.j.execute(new defpackage.adsh(this, arrayList, adorVar, arrayList2, 1));
        }
    }

    final void x(int i2) {
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.l;
        if (concurrentHashMap.remove(java.lang.Integer.valueOf(i2)) == null || !concurrentHashMap.isEmpty()) {
            return;
        }
        this.j.execute(new defpackage.adkj(this, 5, null));
    }

    final boolean y() {
        return !this.q.a;
    }

    final boolean z() {
        return C(4) || C(5);
    }

    public void gA() {
    }

    protected void g(android.os.Parcel parcel) {
    }

    protected void i(android.os.Parcel parcel) {
    }
}
