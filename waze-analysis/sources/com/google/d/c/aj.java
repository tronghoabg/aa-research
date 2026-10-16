package com.google.d.c;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.lang.ref.ReferenceQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class aj extends ReentrantLock {

    /* renamed from: a, reason: collision with root package name */
    final bd f7286a;

    /* renamed from: b, reason: collision with root package name */
    volatile int f7287b;

    /* renamed from: c, reason: collision with root package name */
    long f7288c;

    /* renamed from: d, reason: collision with root package name */
    int f7289d;

    /* renamed from: e, reason: collision with root package name */
    int f7290e;

    /* renamed from: f, reason: collision with root package name */
    volatile AtomicReferenceArray f7291f;

    /* renamed from: g, reason: collision with root package name */
    final long f7292g;

    /* renamed from: h, reason: collision with root package name */
    final ReferenceQueue f7293h;

    /* renamed from: i, reason: collision with root package name */
    final ReferenceQueue f7294i;

    /* renamed from: j, reason: collision with root package name */
    final Queue f7295j;

    /* renamed from: k, reason: collision with root package name */
    final AtomicInteger f7296k = new AtomicInteger();

    /* renamed from: l, reason: collision with root package name */
    final Queue f7297l;
    final Queue m;
    final a n;

    aj(bd bdVar, int i2, long j2, a aVar) {
        this.f7286a = bdVar;
        this.f7292g = j2;
        this.n = aVar;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i2);
        this.f7290e = (atomicReferenceArray.length() * 3) / 4;
        if (!bdVar.g()) {
            int i3 = this.f7290e;
            if (i3 == j2) {
                this.f7290e = i3 + 1;
            }
        }
        this.f7291f = atomicReferenceArray;
        this.f7293h = bdVar.n() ? new ReferenceQueue() : null;
        this.f7294i = bdVar.o() ? new ReferenceQueue() : null;
        this.f7295j = bdVar.m() ? new ConcurrentLinkedQueue() : bd.f7346c;
        this.f7297l = bdVar.j() ? new bb() : bd.f7346c;
        this.m = bdVar.m() ? new s() : bd.f7346c;
    }

    final be a(be beVar, be beVar2) {
        Object objJ = beVar.j();
        if (objJ == null) {
            return null;
        }
        as asVarD = beVar.d();
        Object obj = asVarD.get();
        if (obj == null && asVarD.f()) {
            return null;
        }
        be beVarA = this.f7286a.s.a(this, beVar, beVar2, objJ);
        beVarA.p(asVarD.b(this.f7294i, obj, beVarA));
        return beVarA;
    }

    final be b(Object obj, int i2) {
        for (be beVarE = (be) this.f7291f.get((r0.length() - 1) & i2); beVarE != null; beVarE = beVarE.e()) {
            if (beVarE.a() == i2) {
                Object objJ = beVarE.j();
                if (objJ == null) {
                    t();
                } else if (this.f7286a.f7351h.f(obj, objJ)) {
                    return beVarE;
                }
            }
        }
        return null;
    }

    final be c(Object obj, int i2, long j2) {
        be beVarB = b(obj, i2);
        if (beVarB == null) {
            return null;
        }
        if (!this.f7286a.k(beVarB, j2)) {
            return beVarB;
        }
        u(j2);
        return null;
    }

    final be d(Object obj, int i2, be beVar) {
        z zVar = this.f7286a.s;
        com.google.d.b.an.B(obj);
        return zVar.b(this, obj, i2, beVar);
    }

    final be e(be beVar, be beVar2) {
        int i2 = this.f7287b;
        be beVarE = beVar2.e();
        while (beVar != beVar2) {
            be beVarA = a(beVar, beVarE);
            if (beVarA != null) {
                beVarE = beVarA;
            } else {
                q(beVar);
                i2--;
            }
            beVar = beVar.e();
        }
        this.f7287b = i2;
        return beVarE;
    }

    final Object f(be beVar, long j2) {
        if (beVar.j() == null) {
            t();
            return null;
        }
        Object obj = beVar.d().get();
        if (obj == null) {
            t();
            return null;
        }
        if (!this.f7286a.k(beVar, j2)) {
            return obj;
        }
        u(j2);
        return null;
    }

    final Object g(Object obj, int i2, Object obj2, boolean z) {
        Object obj3;
        int i3;
        lock();
        try {
            bd bdVar = this.f7286a;
            long j2 = bdVar.r.read();
            r(j2);
            if (this.f7287b + 1 > this.f7290e) {
                l();
            }
            AtomicReferenceArray atomicReferenceArray = this.f7291f;
            int length = (atomicReferenceArray.length() - 1) & i2;
            be beVar = (be) atomicReferenceArray.get(length);
            be beVarE = beVar;
            while (true) {
                obj3 = null;
                if (beVarE == null) {
                    this.f7289d++;
                    be beVarD = d(obj, i2, beVar);
                    y(beVarD, obj2, j2);
                    atomicReferenceArray.set(length, beVarD);
                    this.f7287b++;
                    k(beVarD);
                    break;
                }
                Object objJ = beVarE.j();
                if (beVarE.a() == i2 && objJ != null && bdVar.f7351h.f(obj, objJ)) {
                    as asVarD = beVarE.d();
                    Object obj4 = asVarD.get();
                    if (obj4 == null) {
                        this.f7289d++;
                        if (asVarD.f()) {
                            w(obj, null, asVarD.a(), bf.f7358c);
                            y(beVarE, obj2, j2);
                            i3 = this.f7287b;
                        } else {
                            y(beVarE, obj2, j2);
                            i3 = this.f7287b + 1;
                        }
                        this.f7287b = i3;
                        k(beVarE);
                    } else {
                        if (z) {
                            o(beVarE, j2);
                        } else {
                            this.f7289d++;
                            w(obj, obj4, asVarD.a(), bf.f7357b);
                            y(beVarE, obj2, j2);
                            k(beVarE);
                        }
                        obj3 = obj4;
                    }
                } else {
                    beVarE = beVarE.e();
                }
            }
            return obj3;
        } finally {
            unlock();
            s();
        }
    }

    final Object h(be beVar, Object obj, as asVar) {
        if (!asVar.g()) {
            throw new AssertionError();
        }
        com.google.d.b.an.y(!Thread.holdsLock(beVar), "Recursive load of: %s", obj);
        try {
            Object objD = asVar.d();
            if (objD != null) {
                p(beVar, this.f7286a.r.read());
                return objD;
            }
            throw new i("CacheLoader returned null for key " + ((String) obj) + ".");
        } finally {
            this.n.e();
        }
    }

    final void i() {
        while (true) {
            be beVar = (be) this.f7295j.poll();
            if (beVar == null) {
                return;
            }
            Queue queue = this.m;
            if (queue.contains(beVar)) {
                queue.add(beVar);
            }
        }
    }

    final void j() {
        bd bdVar = this.f7286a;
        int i2 = 0;
        if (bdVar.n()) {
            int i3 = 0;
            do {
                Object objPoll = this.f7293h.poll();
                if (objPoll == null) {
                    break;
                }
                be beVar = (be) objPoll;
                int iA = beVar.a();
                aj ajVarB = bdVar.b(iA);
                ajVarB.lock();
                try {
                    int i4 = ajVarB.f7287b;
                    AtomicReferenceArray atomicReferenceArray = ajVarB.f7291f;
                    int length = iA & (atomicReferenceArray.length() - 1);
                    be beVar2 = (be) atomicReferenceArray.get(length);
                    be beVarE = beVar2;
                    while (true) {
                        if (beVarE == null) {
                            break;
                        }
                        if (beVarE == beVar) {
                            ajVarB.f7289d++;
                            be beVarX = ajVarB.x(beVar2, beVarE, beVarE.j(), beVarE.d().get(), beVarE.d(), bf.f7358c);
                            int i5 = ajVarB.f7287b - 1;
                            atomicReferenceArray.set(length, beVarX);
                            ajVarB.f7287b = i5;
                            break;
                        }
                        beVarE = beVarE.e();
                    }
                    ajVarB.unlock();
                    ajVarB.s();
                    i3++;
                } catch (Throwable th) {
                    ajVarB.unlock();
                    ajVarB.s();
                    throw th;
                }
            } while (i3 != 16);
        }
        bd bdVar2 = this.f7286a;
        if (bdVar2.o()) {
            do {
                Object objPoll2 = this.f7294i.poll();
                if (objPoll2 == null) {
                    return;
                }
                as asVar = (as) objPoll2;
                be beVarC = asVar.c();
                int iA2 = beVarC.a();
                aj ajVarB2 = bdVar2.b(iA2);
                Object objJ = beVarC.j();
                ajVarB2.lock();
                try {
                    int i6 = ajVarB2.f7287b;
                    AtomicReferenceArray atomicReferenceArray2 = ajVarB2.f7291f;
                    int length2 = iA2 & (atomicReferenceArray2.length() - 1);
                    be beVarE2 = (be) atomicReferenceArray2.get(length2);
                    int i7 = iA2;
                    while (true) {
                        if (beVarE2 != null) {
                            int i8 = i7;
                            Object objJ2 = beVarE2.j();
                            if (beVarE2.a() != i8 || objJ2 == null || !ajVarB2.f7286a.f7351h.f(objJ, objJ2)) {
                                beVarE2 = beVarE2.e();
                                i7 = i8;
                            } else if (beVarE2.d() == asVar) {
                                ajVarB2.f7289d++;
                                be beVarX2 = ajVarB2.x(beVarE2, beVarE2, objJ2, asVar.get(), asVar, bf.f7358c);
                                int i9 = ajVarB2.f7287b - 1;
                                atomicReferenceArray2.set(length2, beVarX2);
                                ajVarB2.f7287b = i9;
                                ajVarB2.unlock();
                                if (!ajVarB2.isHeldByCurrentThread()) {
                                }
                            } else {
                                ajVarB2.unlock();
                                if (!ajVarB2.isHeldByCurrentThread()) {
                                }
                            }
                        } else {
                            ajVarB2.unlock();
                            if (!ajVarB2.isHeldByCurrentThread()) {
                            }
                        }
                    }
                    ajVarB2.s();
                    i2++;
                } finally {
                }
            } while (i2 != 16);
        }
    }

    final void k(be beVar) {
        if (this.f7286a.h()) {
            i();
            long jA = beVar.d().a();
            long j2 = this.f7292g;
            if (jA > j2 && !v(beVar, beVar.a(), bf.f7360e)) {
                throw new AssertionError();
            }
            while (this.f7288c > j2) {
                for (be beVar2 : this.m) {
                    if (beVar2.d().a() > 0) {
                        if (!v(beVar2, beVar2.a(), bf.f7360e)) {
                            throw new AssertionError();
                        }
                    }
                }
                throw new AssertionError();
            }
        }
    }

    final void l() {
        AtomicReferenceArray atomicReferenceArray = this.f7291f;
        int length = atomicReferenceArray.length();
        if (length >= 1073741824) {
            return;
        }
        int i2 = this.f7287b;
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length + length);
        this.f7290e = (atomicReferenceArray2.length() * 3) / 4;
        int length2 = atomicReferenceArray2.length() - 1;
        for (int i3 = 0; i3 < length; i3++) {
            be beVarE = (be) atomicReferenceArray.get(i3);
            if (beVarE != null) {
                be beVarE2 = beVarE.e();
                int iA = beVarE.a() & length2;
                if (beVarE2 == null) {
                    atomicReferenceArray2.set(iA, beVarE);
                } else {
                    be beVar = beVarE;
                    while (beVarE2 != null) {
                        int iA2 = beVarE2.a() & length2;
                        int i4 = iA2 != iA ? iA2 : iA;
                        if (iA2 != iA) {
                            beVar = beVarE2;
                        }
                        beVarE2 = beVarE2.e();
                        iA = i4;
                    }
                    atomicReferenceArray2.set(iA, beVar);
                    while (beVarE != beVar) {
                        int iA3 = beVarE.a() & length2;
                        be beVarA = a(beVarE, (be) atomicReferenceArray2.get(iA3));
                        if (beVarA != null) {
                            atomicReferenceArray2.set(iA3, beVarA);
                        } else {
                            q(beVarE);
                            i2--;
                        }
                        beVarE = beVarE.e();
                    }
                }
            }
        }
        this.f7291f = atomicReferenceArray2;
        this.f7287b = i2;
    }

    final void m(long j2) {
        be beVar;
        be beVar2;
        i();
        do {
            beVar = (be) this.f7297l.peek();
            if (beVar == null || !this.f7286a.k(beVar, j2)) {
                do {
                    beVar2 = (be) this.m.peek();
                    if (beVar2 == null || !this.f7286a.k(beVar2, j2)) {
                        return;
                    }
                } while (v(beVar2, beVar2.a(), bf.f7359d));
                throw new AssertionError();
            }
        } while (v(beVar, beVar.a(), bf.f7359d));
        throw new AssertionError();
    }

    final void n() {
        if ((this.f7296k.incrementAndGet() & 63) == 0) {
            r(this.f7286a.r.read());
            s();
        }
    }

    final void o(be beVar, long j2) {
        if (this.f7286a.i()) {
            beVar.k(j2);
        }
        this.m.add(beVar);
    }

    final void p(be beVar, long j2) {
        if (this.f7286a.i()) {
            beVar.k(j2);
        }
        this.f7295j.add(beVar);
    }

    final void q(be beVar) {
        Object objJ = beVar.j();
        beVar.a();
        w(objJ, beVar.d().get(), beVar.d().a(), bf.f7358c);
        this.f7297l.remove(beVar);
        this.m.remove(beVar);
    }

    final void r(long j2) {
        if (tryLock()) {
            try {
                j();
                m(j2);
                this.f7296k.set(0);
            } finally {
                unlock();
            }
        }
    }

    final void s() {
        if (isHeldByCurrentThread()) {
            return;
        }
        bd bdVar = this.f7286a;
        while (((bh) bdVar.p.poll()) != null) {
            try {
                bdVar.q.a();
            } catch (Throwable th) {
                bd.f7344a.logp(Level.WARNING, "com.google.common.cache.LocalCache", "processPendingNotifications", "Exception thrown by removal listener", th);
            }
        }
    }

    final void t() {
        if (tryLock()) {
            try {
                j();
            } finally {
                unlock();
            }
        }
    }

    final void u(long j2) {
        if (tryLock()) {
            try {
                m(j2);
            } finally {
                unlock();
            }
        }
    }

    final boolean v(be beVar, int i2, bf bfVar) {
        AtomicReferenceArray atomicReferenceArray = this.f7291f;
        int length = i2 & (atomicReferenceArray.length() - 1);
        be beVar2 = (be) atomicReferenceArray.get(length);
        for (be beVarE = beVar2; beVarE != null; beVarE = beVarE.e()) {
            if (beVarE == beVar) {
                this.f7289d++;
                be beVarX = x(beVar2, beVarE, beVarE.j(), beVarE.d().get(), beVarE.d(), bfVar);
                int i3 = this.f7287b - 1;
                atomicReferenceArray.set(length, beVarX);
                this.f7287b = i3;
                return true;
            }
        }
        return false;
    }

    final void w(Object obj, Object obj2, int i2, bf bfVar) {
        this.f7288c -= i2;
        int iOrdinal = bfVar.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
                throw null;
            }
            this.n.a();
        }
        Queue queue = this.f7286a.p;
        if (queue != bd.f7346c) {
            queue.offer(bh.a(obj, obj2, bfVar));
        }
    }

    final be x(be beVar, be beVar2, Object obj, Object obj2, as asVar, bf bfVar) {
        w(obj, obj2, asVar.a(), bfVar);
        this.f7297l.remove(beVar2);
        this.m.remove(beVar2);
        if (!asVar.g()) {
            return e(beVar, beVar2);
        }
        asVar.e(null);
        return beVar;
    }

    final void y(be beVar, Object obj, long j2) {
        as apVar;
        bd bdVar = this.f7286a;
        as asVarD = beVar.d();
        bdVar.m.a();
        com.google.d.b.an.v(true, "Weights must be non-negative");
        int iOrdinal = bdVar.f7354k.ordinal();
        if (iOrdinal == 0) {
            apVar = new ap(obj);
        } else if (iOrdinal == 1) {
            apVar = new ak(this.f7294i, obj, beVar);
        } else {
            if (iOrdinal != 2) {
                throw null;
            }
            apVar = new ax(this.f7294i, obj, beVar);
        }
        beVar.p(apVar);
        i();
        this.f7288c++;
        if (bdVar.i()) {
            beVar.k(j2);
        }
        if (bdVar.l()) {
            beVar.q(j2);
        }
        this.m.add(beVar);
        this.f7297l.add(beVar);
        asVarD.e(obj);
    }
}
