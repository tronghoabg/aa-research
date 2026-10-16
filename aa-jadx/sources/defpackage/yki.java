package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class yki<K, V, E extends defpackage.yke<K, V, E>, S extends defpackage.yki<K, V, E, S>> extends java.util.concurrent.locks.ReentrantLock {
    final defpackage.yli a;
    volatile int b;
    int c;
    int d;
    volatile java.util.concurrent.atomic.AtomicReferenceArray e;
    final java.util.concurrent.atomic.AtomicInteger f;

    public yki(defpackage.yli yliVar, int i) {
        this.f = new java.util.concurrent.atomic.AtomicInteger();
        this.a = yliVar;
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = new java.util.concurrent.atomic.AtomicReferenceArray(i);
        this.d = (atomicReferenceArray.length() * 3) / 4;
        this.e = atomicReferenceArray;
    }

    static boolean m(defpackage.yke ykeVar) {
        return ykeVar.d() == null;
    }

    static final void n(java.lang.ref.ReferenceQueue referenceQueue) {
        while (referenceQueue.poll() != null) {
        }
    }

    final defpackage.yke a(defpackage.yke ykeVar, defpackage.yke ykeVar2) {
        return this.a.g.a(this, ykeVar, ykeVar2);
    }

    public final defpackage.yke b(java.lang.Object obj, int i) {
        if (this.b == 0) {
            return null;
        }
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.e;
        for (defpackage.yke ykeVarB = (defpackage.yke) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); ykeVarB != null; ykeVarB = ykeVarB.b()) {
            if (ykeVarB.a() == i) {
                java.lang.Object objC = ykeVarB.c();
                if (objC == null) {
                    l();
                } else if (this.a.f.d(obj, objC)) {
                    return ykeVarB;
                }
            }
        }
        return null;
    }

    final defpackage.yke c(defpackage.yke ykeVar, defpackage.yke ykeVar2) {
        int i = this.b;
        defpackage.yke ykeVarB = ykeVar2.b();
        while (ykeVar != ykeVar2) {
            defpackage.yke ykeVarA = a(ykeVar, ykeVarB);
            if (ykeVarA != null) {
                ykeVarB = ykeVarA;
            } else {
                i--;
            }
            ykeVar = ykeVar.b();
        }
        this.b = i;
        return ykeVarB;
    }

    final java.lang.Object d(java.lang.Object obj, int i, java.lang.Object obj2, boolean z) {
        java.lang.Object obj3;
        lock();
        try {
            j();
            int i2 = this.b + 1;
            if (i2 > this.d) {
                java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.e;
                int length = atomicReferenceArray.length();
                if (length < 1073741824) {
                    int i3 = this.b;
                    java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray2 = new java.util.concurrent.atomic.AtomicReferenceArray(length + length);
                    this.d = (atomicReferenceArray2.length() * 3) / 4;
                    int length2 = atomicReferenceArray2.length() - 1;
                    for (int i4 = 0; i4 < length; i4++) {
                        defpackage.yke ykeVarB = (defpackage.yke) atomicReferenceArray.get(i4);
                        if (ykeVarB != null) {
                            defpackage.yke ykeVarB2 = ykeVarB.b();
                            int iA = ykeVarB.a() & length2;
                            if (ykeVarB2 == null) {
                                atomicReferenceArray2.set(iA, ykeVarB);
                            } else {
                                defpackage.yke ykeVar = ykeVarB;
                                while (ykeVarB2 != null) {
                                    int iA2 = ykeVarB2.a() & length2;
                                    int i5 = iA2 != iA ? iA2 : iA;
                                    if (iA2 != iA) {
                                        ykeVar = ykeVarB2;
                                    }
                                    ykeVarB2 = ykeVarB2.b();
                                    iA = i5;
                                }
                                atomicReferenceArray2.set(iA, ykeVar);
                                while (ykeVarB != ykeVar) {
                                    int iA3 = ykeVarB.a() & length2;
                                    defpackage.yke ykeVarA = a(ykeVarB, (defpackage.yke) atomicReferenceArray2.get(iA3));
                                    if (ykeVarA != null) {
                                        atomicReferenceArray2.set(iA3, ykeVarA);
                                    } else {
                                        i3--;
                                    }
                                    ykeVarB = ykeVarB.b();
                                }
                            }
                        }
                    }
                    this.e = atomicReferenceArray2;
                    this.b = i3;
                }
                i2 = this.b + 1;
            }
            java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray3 = this.e;
            int length3 = (atomicReferenceArray3.length() - 1) & i;
            defpackage.yke ykeVar2 = (defpackage.yke) atomicReferenceArray3.get(length3);
            defpackage.yke ykeVarB3 = ykeVar2;
            while (true) {
                obj3 = null;
                if (ykeVarB3 == null) {
                    this.c++;
                    defpackage.yke ykeVarB4 = this.a.g.b(this, obj, i, ykeVar2);
                    k(ykeVarB4, obj2);
                    atomicReferenceArray3.set(length3, ykeVarB4);
                    this.b = i2;
                    break;
                }
                java.lang.Object objC = ykeVarB3.c();
                if (ykeVarB3.a() == i && objC != null && this.a.f.d(obj, objC)) {
                    java.lang.Object objD = ykeVarB3.d();
                    if (objD != null) {
                        if (!z) {
                            this.c++;
                            k(ykeVarB3, obj2);
                        }
                        obj3 = objD;
                        break;
                    }
                    this.c++;
                    k(ykeVarB3, obj2);
                    this.b = this.b;
                    break;
                }
                ykeVarB3 = ykeVarB3.b();
            }
            return obj3;
        } finally {
            unlock();
        }
    }

    final void e(java.lang.ref.ReferenceQueue referenceQueue) {
        int i = 0;
        do {
            java.lang.Object objPoll = referenceQueue.poll();
            if (objPoll == null) {
                return;
            }
            defpackage.yli yliVar = this.a;
            defpackage.yke ykeVar = (defpackage.yke) objPoll;
            int iA = ykeVar.a();
            defpackage.yki ykiVarC = yliVar.c(iA);
            ykiVarC.lock();
            try {
                int i2 = ykiVarC.b;
                java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = ykiVarC.e;
                int length = iA & (atomicReferenceArray.length() - 1);
                defpackage.yke ykeVar2 = (defpackage.yke) atomicReferenceArray.get(length);
                for (defpackage.yke ykeVarB = ykeVar2; ykeVarB != null; ykeVarB = ykeVarB.b()) {
                    if (ykeVarB == ykeVar) {
                        ykiVarC.c++;
                        defpackage.yke ykeVarC = ykiVarC.c(ykeVar2, ykeVarB);
                        int i3 = ykiVarC.b - 1;
                        atomicReferenceArray.set(length, ykeVarC);
                        ykiVarC.b = i3;
                        break;
                    }
                }
                ykiVarC.unlock();
                i++;
            } catch (java.lang.Throwable th) {
                ykiVarC.unlock();
                throw th;
            }
        } while (i != 16);
    }

    final void f(java.lang.ref.ReferenceQueue referenceQueue) {
        int i = 0;
        do {
            java.lang.Object objPoll = referenceQueue.poll();
            if (objPoll == null) {
                return;
            }
            defpackage.yli yliVar = this.a;
            defpackage.ylf ylfVar = (defpackage.ylf) objPoll;
            defpackage.yke ykeVarA = ylfVar.a();
            int iA = ykeVarA.a();
            defpackage.yki ykiVarC = yliVar.c(iA);
            java.lang.Object objC = ykeVarA.c();
            ykiVarC.lock();
            try {
                int i2 = ykiVarC.b;
                java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = ykiVarC.e;
                int length = (atomicReferenceArray.length() - 1) & iA;
                defpackage.yke ykeVar = (defpackage.yke) atomicReferenceArray.get(length);
                for (defpackage.yke ykeVarB = ykeVar; ykeVarB != null; ykeVarB = ykeVarB.b()) {
                    java.lang.Object objC2 = ykeVarB.c();
                    if (ykeVarB.a() == iA && objC2 != null && ykiVarC.a.f.d(objC, objC2)) {
                        if (((defpackage.yle) ykeVarB).e() != ylfVar) {
                            break;
                        }
                        ykiVarC.c++;
                        defpackage.yke ykeVarC = ykiVarC.c(ykeVar, ykeVarB);
                        int i3 = ykiVarC.b - 1;
                        atomicReferenceArray.set(length, ykeVarC);
                        ykiVarC.b = i3;
                        break;
                    }
                }
                ykiVarC.unlock();
                i++;
            } catch (java.lang.Throwable th) {
                ykiVarC.unlock();
                throw th;
            }
        } while (i != 16);
    }

    final void i() {
        if ((this.f.incrementAndGet() & 63) == 0) {
            j();
        }
    }

    final void j() {
        if (tryLock()) {
            try {
                h();
                this.f.set(0);
            } finally {
                unlock();
            }
        }
    }

    final void k(defpackage.yke ykeVar, java.lang.Object obj) {
        this.a.g.f(this, ykeVar, obj);
    }

    final void l() {
        if (tryLock()) {
            try {
                h();
            } finally {
                unlock();
            }
        }
    }

    public void g() {
    }

    public void h() {
    }

    public yki(defpackage.yli yliVar, int i, byte[] bArr) {
        this(yliVar, i);
    }

    public yki(defpackage.yli yliVar, int i, char[] cArr) {
        this(yliVar, i);
    }
}
