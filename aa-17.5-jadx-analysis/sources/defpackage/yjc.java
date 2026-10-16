package defpackage;

import defpackage.yiy;
import defpackage.yjc;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public class yjc<K, V, E extends yiy<K, V, E>, S extends yjc<K, V, E, S>> extends ReentrantLock {
    final ykc a;
    volatile int b;
    int c;
    int d;
    volatile AtomicReferenceArray e;
    final AtomicInteger f;

    public yjc(ykc ykcVar, int i) {
        this.f = new AtomicInteger();
        this.a = ykcVar;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i);
        this.d = (atomicReferenceArray.length() * 3) / 4;
        this.e = atomicReferenceArray;
    }

    static boolean m(yiy yiyVar) {
        return yiyVar.d() == null;
    }

    static final void n(ReferenceQueue referenceQueue) {
        while (referenceQueue.poll() != null) {
        }
    }

    final yiy a(yiy yiyVar, yiy yiyVar2) {
        return this.a.g.a(this, yiyVar, yiyVar2);
    }

    public final yiy b(Object obj, int i) {
        if (this.b == 0) {
            return null;
        }
        for (yiy yiyVarB = (yiy) this.e.get((r0.length() - 1) & i); yiyVarB != null; yiyVarB = yiyVarB.b()) {
            if (yiyVarB.a() == i) {
                Object objC = yiyVarB.c();
                if (objC == null) {
                    l();
                } else if (this.a.f.d(obj, objC)) {
                    return yiyVarB;
                }
            }
        }
        return null;
    }

    final yiy c(yiy yiyVar, yiy yiyVar2) {
        int i = this.b;
        yiy yiyVarB = yiyVar2.b();
        while (yiyVar != yiyVar2) {
            yiy yiyVarA = a(yiyVar, yiyVarB);
            if (yiyVarA != null) {
                yiyVarB = yiyVarA;
            } else {
                i--;
            }
            yiyVar = yiyVar.b();
        }
        this.b = i;
        return yiyVarB;
    }

    final Object d(Object obj, int i, Object obj2, boolean z) {
        Object obj3;
        lock();
        try {
            j();
            int i2 = this.b + 1;
            if (i2 > this.d) {
                AtomicReferenceArray atomicReferenceArray = this.e;
                int length = atomicReferenceArray.length();
                if (length < 1073741824) {
                    int i3 = this.b;
                    AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length + length);
                    this.d = (atomicReferenceArray2.length() * 3) / 4;
                    int length2 = atomicReferenceArray2.length() - 1;
                    for (int i4 = 0; i4 < length; i4++) {
                        yiy yiyVarB = (yiy) atomicReferenceArray.get(i4);
                        if (yiyVarB != null) {
                            yiy yiyVarB2 = yiyVarB.b();
                            int iA = yiyVarB.a() & length2;
                            if (yiyVarB2 == null) {
                                atomicReferenceArray2.set(iA, yiyVarB);
                            } else {
                                yiy yiyVar = yiyVarB;
                                while (yiyVarB2 != null) {
                                    int iA2 = yiyVarB2.a() & length2;
                                    int i5 = iA2 != iA ? iA2 : iA;
                                    if (iA2 != iA) {
                                        yiyVar = yiyVarB2;
                                    }
                                    yiyVarB2 = yiyVarB2.b();
                                    iA = i5;
                                }
                                atomicReferenceArray2.set(iA, yiyVar);
                                while (yiyVarB != yiyVar) {
                                    int iA3 = yiyVarB.a() & length2;
                                    yiy yiyVarA = a(yiyVarB, (yiy) atomicReferenceArray2.get(iA3));
                                    if (yiyVarA != null) {
                                        atomicReferenceArray2.set(iA3, yiyVarA);
                                    } else {
                                        i3--;
                                    }
                                    yiyVarB = yiyVarB.b();
                                }
                            }
                        }
                    }
                    this.e = atomicReferenceArray2;
                    this.b = i3;
                }
                i2 = this.b + 1;
            }
            AtomicReferenceArray atomicReferenceArray3 = this.e;
            int length3 = (atomicReferenceArray3.length() - 1) & i;
            yiy yiyVar2 = (yiy) atomicReferenceArray3.get(length3);
            yiy yiyVarB3 = yiyVar2;
            while (true) {
                obj3 = null;
                if (yiyVarB3 == null) {
                    this.c++;
                    yiy yiyVarB4 = this.a.g.b(this, obj, i, yiyVar2);
                    k(yiyVarB4, obj2);
                    atomicReferenceArray3.set(length3, yiyVarB4);
                    this.b = i2;
                    break;
                }
                Object objC = yiyVarB3.c();
                if (yiyVarB3.a() == i && objC != null && this.a.f.d(obj, objC)) {
                    Object objD = yiyVarB3.d();
                    if (objD == null) {
                        this.c++;
                        k(yiyVarB3, obj2);
                        this.b = this.b;
                    } else {
                        if (!z) {
                            this.c++;
                            k(yiyVarB3, obj2);
                        }
                        obj3 = objD;
                    }
                } else {
                    yiyVarB3 = yiyVarB3.b();
                }
            }
            return obj3;
        } finally {
            unlock();
        }
    }

    final void e(ReferenceQueue referenceQueue) {
        int i = 0;
        do {
            Object objPoll = referenceQueue.poll();
            if (objPoll == null) {
                return;
            }
            ykc ykcVar = this.a;
            yiy yiyVar = (yiy) objPoll;
            int iA = yiyVar.a();
            yjc yjcVarC = ykcVar.c(iA);
            yjcVarC.lock();
            try {
                int i2 = yjcVarC.b;
                AtomicReferenceArray atomicReferenceArray = yjcVarC.e;
                int length = iA & (atomicReferenceArray.length() - 1);
                yiy yiyVar2 = (yiy) atomicReferenceArray.get(length);
                yiy yiyVarB = yiyVar2;
                while (true) {
                    if (yiyVarB == null) {
                        break;
                    }
                    if (yiyVarB == yiyVar) {
                        yjcVarC.c++;
                        yiy yiyVarC = yjcVarC.c(yiyVar2, yiyVarB);
                        int i3 = yjcVarC.b - 1;
                        atomicReferenceArray.set(length, yiyVarC);
                        yjcVarC.b = i3;
                        break;
                    }
                    yiyVarB = yiyVarB.b();
                }
                yjcVarC.unlock();
                i++;
            } catch (Throwable th) {
                yjcVarC.unlock();
                throw th;
            }
        } while (i != 16);
    }

    final void f(ReferenceQueue referenceQueue) {
        int i = 0;
        do {
            Object objPoll = referenceQueue.poll();
            if (objPoll == null) {
                return;
            }
            ykc ykcVar = this.a;
            yjz yjzVar = (yjz) objPoll;
            yiy yiyVarA = yjzVar.a();
            int iA = yiyVarA.a();
            yjc yjcVarC = ykcVar.c(iA);
            Object objC = yiyVarA.c();
            yjcVarC.lock();
            try {
                int i2 = yjcVarC.b;
                AtomicReferenceArray atomicReferenceArray = yjcVarC.e;
                int length = (atomicReferenceArray.length() - 1) & iA;
                yiy yiyVar = (yiy) atomicReferenceArray.get(length);
                yiy yiyVarB = yiyVar;
                while (true) {
                    if (yiyVarB == null) {
                        break;
                    }
                    Object objC2 = yiyVarB.c();
                    if (yiyVarB.a() != iA || objC2 == null || !yjcVarC.a.f.d(objC, objC2)) {
                        yiyVarB = yiyVarB.b();
                    } else if (((yjy) yiyVarB).e() == yjzVar) {
                        yjcVarC.c++;
                        yiy yiyVarC = yjcVarC.c(yiyVar, yiyVarB);
                        int i3 = yjcVarC.b - 1;
                        atomicReferenceArray.set(length, yiyVarC);
                        yjcVarC.b = i3;
                    }
                }
                yjcVarC.unlock();
                i++;
            } catch (Throwable th) {
                yjcVarC.unlock();
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

    final void k(yiy yiyVar, Object obj) {
        this.a.g.f(this, yiyVar, obj);
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

    public yjc(ykc ykcVar, int i, byte[] bArr) {
        this(ykcVar, i);
    }

    public yjc(ykc ykcVar, int i, char[] cArr) {
        this(ykcVar, i);
    }
}
