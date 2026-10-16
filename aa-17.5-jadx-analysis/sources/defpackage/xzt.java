package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.lang.ref.ReferenceQueue;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;

/* loaded from: classes3.dex */
final class xzt extends ReentrantLock {
    final yan a;
    volatile int b;
    long c;
    int d;
    int e;
    volatile AtomicReferenceArray f;
    final long g;
    final ReferenceQueue h;
    final ReferenceQueue i;
    final Queue j;
    final AtomicInteger k = new AtomicInteger();
    final Queue l;
    final Queue m;
    final ysi n;

    public xzt(yan yanVar, int i, long j, ysi ysiVar) {
        this.a = yanVar;
        this.g = j;
        ysiVar.getClass();
        this.n = ysiVar;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i);
        this.e = (atomicReferenceArray.length() * 3) / 4;
        if (!yanVar.h()) {
            int i2 = this.e;
            if (i2 == j) {
                this.e = i2 + 1;
            }
        }
        this.f = atomicReferenceArray;
        this.h = yanVar.o() ? new ReferenceQueue() : null;
        this.i = yanVar.p() ? new ReferenceQueue() : null;
        this.j = yanVar.n() ? new ConcurrentLinkedQueue() : yan.c;
        this.l = yanVar.k() ? new yal() : yan.c;
        this.m = yanVar.n() ? new xyz() : yan.c;
    }

    final yao a(yao yaoVar, yao yaoVar2) {
        Object objJ = yaoVar.j();
        if (objJ == null) {
            return null;
        }
        yac yacVarD = yaoVar.d();
        Object obj = yacVarD.get();
        if (obj == null && yacVarD.f()) {
            return null;
        }
        yao yaoVarA = this.a.q.a(this, yaoVar, yaoVar2, objJ);
        yaoVarA.p(yacVarD.b(this.i, obj, yaoVarA));
        return yaoVarA;
    }

    final yao b(Object obj, int i) {
        for (yao yaoVarE = (yao) this.f.get((r0.length() - 1) & i); yaoVarE != null; yaoVarE = yaoVarE.e()) {
            if (yaoVarE.a() == i) {
                Object objJ = yaoVarE.j();
                if (objJ == null) {
                    t();
                } else if (this.a.h.d(obj, objJ)) {
                    return yaoVarE;
                }
            }
        }
        return null;
    }

    final yao c(Object obj, int i, long j) {
        yao yaoVarB = b(obj, i);
        if (yaoVarB == null) {
            return null;
        }
        if (!this.a.l(yaoVarB, j)) {
            return yaoVarB;
        }
        u(j);
        return null;
    }

    final yao d(Object obj, int i, yao yaoVar) {
        return this.a.q.b(this, obj, i, yaoVar);
    }

    final yao e(yao yaoVar, yao yaoVar2) {
        int i = this.b;
        yao yaoVarE = yaoVar2.e();
        while (yaoVar != yaoVar2) {
            yao yaoVarA = a(yaoVar, yaoVarE);
            if (yaoVarA != null) {
                yaoVarE = yaoVarA;
            } else {
                q(yaoVar);
                i--;
            }
            yaoVar = yaoVar.e();
        }
        this.b = i;
        return yaoVarE;
    }

    final Object f(yao yaoVar, long j) {
        if (yaoVar.j() == null) {
            t();
            return null;
        }
        Object obj = yaoVar.d().get();
        if (obj == null) {
            t();
            return null;
        }
        if (!this.a.l(yaoVar, j)) {
            return obj;
        }
        u(j);
        return null;
    }

    final Object g(Object obj, int i, Object obj2, boolean z) {
        Object obj3;
        int i2;
        lock();
        try {
            yan yanVar = this.a;
            long jB = yanVar.p.b();
            r(jB);
            if (this.b + 1 > this.e) {
                l();
            }
            AtomicReferenceArray atomicReferenceArray = this.f;
            int length = (atomicReferenceArray.length() - 1) & i;
            yao yaoVar = (yao) atomicReferenceArray.get(length);
            yao yaoVarE = yaoVar;
            while (true) {
                obj3 = null;
                if (yaoVarE == null) {
                    this.d++;
                    yao yaoVarD = d(obj, i, yaoVar);
                    x(yaoVarD, obj2, jB);
                    atomicReferenceArray.set(length, yaoVarD);
                    this.b++;
                    k(yaoVarD);
                    break;
                }
                Object objJ = yaoVarE.j();
                if (yaoVarE.a() == i && objJ != null && yanVar.h.d(obj, objJ)) {
                    yac yacVarD = yaoVarE.d();
                    Object obj4 = yacVarD.get();
                    if (obj4 == null) {
                        this.d++;
                        if (yacVarD.f()) {
                            y(obj, null, yacVarD.a());
                            x(yaoVarE, obj2, jB);
                            i2 = this.b;
                        } else {
                            x(yaoVarE, obj2, jB);
                            i2 = this.b + 1;
                        }
                        this.b = i2;
                        k(yaoVarE);
                    } else {
                        if (z) {
                            o(yaoVarE, jB);
                        } else {
                            this.d++;
                            y(obj, obj4, yacVarD.a());
                            x(yaoVarE, obj2, jB);
                            k(yaoVarE);
                        }
                        obj3 = obj4;
                    }
                } else {
                    yaoVarE = yaoVarE.e();
                }
            }
            return obj3;
        } finally {
            unlock();
            s();
        }
    }

    final Object h(yao yaoVar, Object obj, yac yacVar) throws ExecutionException {
        if (!yacVar.g()) {
            throw new AssertionError();
        }
        woy.ad(!Thread.holdsLock(yaoVar), "Recursive load of: %s", obj);
        Object objD = yacVar.d();
        if (objD == null) {
            throw new xyq(a.bW(obj, "CacheLoader returned null for key ", "."));
        }
        p(yaoVar, this.a.p.b());
        return objD;
    }

    final void i() {
        while (true) {
            yao yaoVar = (yao) this.j.poll();
            if (yaoVar == null) {
                return;
            }
            Queue queue = this.m;
            if (queue.contains(yaoVar)) {
                queue.add(yaoVar);
            }
        }
    }

    final void j() {
        yan yanVar = this.a;
        int i = 0;
        if (yanVar.o()) {
            int i2 = 0;
            do {
                Object objPoll = this.h.poll();
                if (objPoll == null) {
                    break;
                }
                yao yaoVar = (yao) objPoll;
                int iA = yaoVar.a();
                xzt xztVarB = yanVar.b(iA);
                xztVarB.lock();
                try {
                    int i3 = xztVarB.b;
                    AtomicReferenceArray atomicReferenceArray = xztVarB.f;
                    int length = iA & (atomicReferenceArray.length() - 1);
                    yao yaoVar2 = (yao) atomicReferenceArray.get(length);
                    yao yaoVarE = yaoVar2;
                    while (true) {
                        if (yaoVarE == null) {
                            break;
                        }
                        if (yaoVarE == yaoVar) {
                            xztVarB.d++;
                            yao yaoVarW = xztVarB.w(yaoVar2, yaoVarE, yaoVarE.j(), yaoVarE.d().get(), yaoVarE.d(), 3);
                            int i4 = xztVarB.b - 1;
                            atomicReferenceArray.set(length, yaoVarW);
                            xztVarB.b = i4;
                            break;
                        }
                        yaoVarE = yaoVarE.e();
                    }
                    xztVarB.unlock();
                    xztVarB.s();
                    i2++;
                } catch (Throwable th) {
                    xztVarB.unlock();
                    xztVarB.s();
                    throw th;
                }
            } while (i2 != 16);
        }
        yan yanVar2 = this.a;
        if (yanVar2.p()) {
            do {
                Object objPoll2 = this.i.poll();
                if (objPoll2 == null) {
                    return;
                }
                yac yacVar = (yac) objPoll2;
                yao yaoVarC = yacVar.c();
                int iA2 = yaoVarC.a();
                xzt xztVarB2 = yanVar2.b(iA2);
                Object objJ = yaoVarC.j();
                xztVarB2.lock();
                try {
                    int i5 = xztVarB2.b;
                    AtomicReferenceArray atomicReferenceArray2 = xztVarB2.f;
                    int length2 = iA2 & (atomicReferenceArray2.length() - 1);
                    yao yaoVarE2 = (yao) atomicReferenceArray2.get(length2);
                    int i6 = iA2;
                    while (true) {
                        if (yaoVarE2 != null) {
                            int i7 = i6;
                            Object objJ2 = yaoVarE2.j();
                            if (yaoVarE2.a() != i7 || objJ2 == null || !xztVarB2.a.h.d(objJ, objJ2)) {
                                yaoVarE2 = yaoVarE2.e();
                                i6 = i7;
                            } else if (yaoVarE2.d() == yacVar) {
                                xztVarB2.d++;
                                yao yaoVarW2 = xztVarB2.w(yaoVarE2, yaoVarE2, objJ2, yacVar.get(), yacVar, 3);
                                int i8 = xztVarB2.b - 1;
                                atomicReferenceArray2.set(length2, yaoVarW2);
                                xztVarB2.b = i8;
                                xztVarB2.unlock();
                                if (!xztVarB2.isHeldByCurrentThread()) {
                                }
                            } else {
                                xztVarB2.unlock();
                                if (!xztVarB2.isHeldByCurrentThread()) {
                                }
                            }
                        } else {
                            xztVarB2.unlock();
                            if (!xztVarB2.isHeldByCurrentThread()) {
                            }
                        }
                    }
                    xztVarB2.s();
                    i++;
                } finally {
                }
            } while (i != 16);
        }
    }

    final void k(yao yaoVar) {
        if (this.a.i()) {
            i();
            long jA = yaoVar.d().a();
            long j = this.g;
            if (jA > j && !v(yaoVar, yaoVar.a(), 5)) {
                throw new AssertionError();
            }
            while (this.c > j) {
                for (yao yaoVar2 : this.m) {
                    if (yaoVar2.d().a() > 0) {
                        if (!v(yaoVar2, yaoVar2.a(), 5)) {
                            throw new AssertionError();
                        }
                    }
                }
                throw new AssertionError();
            }
        }
    }

    final void l() {
        AtomicReferenceArray atomicReferenceArray = this.f;
        int length = atomicReferenceArray.length();
        if (length >= 1073741824) {
            return;
        }
        int i = this.b;
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length + length);
        this.e = (atomicReferenceArray2.length() * 3) / 4;
        int length2 = atomicReferenceArray2.length() - 1;
        for (int i2 = 0; i2 < length; i2++) {
            yao yaoVarE = (yao) atomicReferenceArray.get(i2);
            if (yaoVarE != null) {
                yao yaoVarE2 = yaoVarE.e();
                int iA = yaoVarE.a() & length2;
                if (yaoVarE2 == null) {
                    atomicReferenceArray2.set(iA, yaoVarE);
                } else {
                    yao yaoVar = yaoVarE;
                    while (yaoVarE2 != null) {
                        int iA2 = yaoVarE2.a() & length2;
                        int i3 = iA2 != iA ? iA2 : iA;
                        if (iA2 != iA) {
                            yaoVar = yaoVarE2;
                        }
                        yaoVarE2 = yaoVarE2.e();
                        iA = i3;
                    }
                    atomicReferenceArray2.set(iA, yaoVar);
                    while (yaoVarE != yaoVar) {
                        int iA3 = yaoVarE.a() & length2;
                        yao yaoVarA = a(yaoVarE, (yao) atomicReferenceArray2.get(iA3));
                        if (yaoVarA != null) {
                            atomicReferenceArray2.set(iA3, yaoVarA);
                        } else {
                            q(yaoVarE);
                            i--;
                        }
                        yaoVarE = yaoVarE.e();
                    }
                }
            }
        }
        this.f = atomicReferenceArray2;
        this.b = i;
    }

    final void m(long j) {
        yao yaoVar;
        yao yaoVar2;
        i();
        do {
            yaoVar = (yao) this.l.peek();
            if (yaoVar == null || !this.a.l(yaoVar, j)) {
                do {
                    yaoVar2 = (yao) this.m.peek();
                    if (yaoVar2 == null || !this.a.l(yaoVar2, j)) {
                        return;
                    }
                } while (v(yaoVar2, yaoVar2.a(), 4));
                throw new AssertionError();
            }
        } while (v(yaoVar, yaoVar.a(), 4));
        throw new AssertionError();
    }

    final void n() {
        if ((this.k.incrementAndGet() & 63) == 0) {
            r(this.a.p.b());
            s();
        }
    }

    final void o(yao yaoVar, long j) {
        if (this.a.j()) {
            yaoVar.k(j);
        }
        this.m.add(yaoVar);
    }

    final void p(yao yaoVar, long j) {
        if (this.a.j()) {
            yaoVar.k(j);
        }
        this.j.add(yaoVar);
    }

    final void q(yao yaoVar) {
        Object objJ = yaoVar.j();
        yaoVar.a();
        y(objJ, yaoVar.d().get(), yaoVar.d().a());
        this.l.remove(yaoVar);
        this.m.remove(yaoVar);
    }

    final void r(long j) {
        if (tryLock()) {
            try {
                j();
                m(j);
                this.k.set(0);
            } finally {
                unlock();
            }
        }
    }

    final void s() {
        if (isHeldByCurrentThread()) {
            return;
        }
        yan yanVar = this.a;
        while (((yap) yanVar.o.poll()) != null) {
            try {
                xyn xynVar = yanVar.w;
            } catch (Throwable th) {
                yan.a.logp(Level.WARNING, "com.google.common.cache.LocalCache", "processPendingNotifications", "Exception thrown by removal listener", th);
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

    final void u(long j) {
        if (tryLock()) {
            try {
                m(j);
            } finally {
                unlock();
            }
        }
    }

    final boolean v(yao yaoVar, int i, int i2) {
        AtomicReferenceArray atomicReferenceArray = this.f;
        int length = i & (atomicReferenceArray.length() - 1);
        yao yaoVar2 = (yao) atomicReferenceArray.get(length);
        for (yao yaoVarE = yaoVar2; yaoVarE != null; yaoVarE = yaoVarE.e()) {
            if (yaoVarE == yaoVar) {
                this.d++;
                yao yaoVarW = w(yaoVar2, yaoVarE, yaoVarE.j(), yaoVarE.d().get(), yaoVarE.d(), i2);
                int i3 = this.b - 1;
                atomicReferenceArray.set(length, yaoVarW);
                this.b = i3;
                return true;
            }
        }
        return false;
    }

    final yao w(yao yaoVar, yao yaoVar2, Object obj, Object obj2, yac yacVar, int i) {
        y(obj, obj2, yacVar.a());
        this.l.remove(yaoVar2);
        this.m.remove(yaoVar2);
        if (!yacVar.g()) {
            return e(yaoVar, yaoVar2);
        }
        yacVar.e(null);
        return yaoVar;
    }

    final void x(yao yaoVar, Object obj, long j) {
        yac xzzVar;
        yac yacVarD = yaoVar.d();
        yan yanVar = this.a;
        xyo xyoVar = yanVar.v;
        int iOrdinal = yanVar.k.ordinal();
        if (iOrdinal == 0) {
            xzzVar = new xzz(obj);
        } else if (iOrdinal == 1) {
            xzzVar = new xzu(this.i, obj, yaoVar);
        } else {
            if (iOrdinal != 2) {
                throw null;
            }
            xzzVar = new yah(this.i, obj, yaoVar);
        }
        yaoVar.p(xzzVar);
        i();
        this.c++;
        if (yanVar.j()) {
            yaoVar.k(j);
        }
        if (yanVar.m()) {
            yaoVar.q(j);
        }
        this.m.add(yaoVar);
        this.l.add(yaoVar);
        yacVarD.e(obj);
    }

    final void y(Object obj, Object obj2, int i) {
        this.c -= i;
        Queue queue = this.a.o;
        if (queue != yan.c) {
            queue.offer(new yap(obj, obj2));
        }
    }
}
