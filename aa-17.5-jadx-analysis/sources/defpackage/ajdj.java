package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public final class ajdj implements Executor, Closeable {
    public static final ajcz a = new ajcz("NOT_IN_STACK");
    public final int b;
    public final int c;
    public final long d;
    public final String e;
    public final aisw f;
    public final ajcv g;
    public final aisw h;
    public final lds i;
    public final lds j;
    private final aisu k;

    public ajdj(int i, int i2, long j, String str) {
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = str;
        if (i <= 0) {
            throw new IllegalArgumentException(a.bn(i, "Core pool size ", " should be at least 1"));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(a.bo(i, i2, "Max pool size ", " should be greater than or equals to core pool size "));
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(a.bn(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
        }
        if (j <= 0) {
            throw new IllegalArgumentException(a.bI(j, "Idle worker keep alive time ", " must be positive"));
        }
        this.i = new lds((char[]) null);
        this.j = new lds((char[]) null);
        aisy aisyVar = aisy.a;
        this.f = new aisw(0L, aisyVar);
        int i3 = i + 1;
        this.g = new ajcv(i3 + i3);
        this.h = new aisw(i << 42, aisyVar);
        this.k = new aisu(false, aisyVar);
    }

    public static final void e(ajdn ajdnVar) {
        try {
            ajdnVar.run();
        } catch (Throwable th) {
            Thread threadCurrentThread = Thread.currentThread();
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
        }
    }

    private final int g() {
        ajcv ajcvVar = this.g;
        synchronized (ajcvVar) {
            if (d()) {
                return -1;
            }
            aisw aiswVar = this.h;
            long j = aiswVar.b;
            int i = (int) (j & 2097151);
            int iE = afpt.e(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (iE >= this.b) {
                return 0;
            }
            if (i >= this.c) {
                return 0;
            }
            int i2 = ((int) (aiswVar.b & 2097151)) + 1;
            if (ajcvVar.a(i2) != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            ajdi ajdiVar = new ajdi(this, i2);
            ajcvVar.b(i2, ajdiVar);
            if (i2 != ((int) (2097151 & aisw.a.incrementAndGet(aiswVar)))) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            int i3 = iE + 1;
            ajdiVar.start();
            return i3;
        }
    }

    private final ajdi h() {
        Thread threadCurrentThread = Thread.currentThread();
        ajdi ajdiVar = threadCurrentThread instanceof ajdi ? (ajdi) threadCurrentThread : null;
        if (ajdiVar == null || !affa.f(ajdiVar.d, this)) {
            return null;
        }
        return ajdiVar;
    }

    private final boolean i(long j) {
        int iE = afpt.e(((int) (j & 2097151)) - ((int) ((4398044413952L & j) >> 21)), 0);
        int i = this.b;
        if (iE < i) {
            int iG = g();
            if (iG == 1) {
                if (i > 1) {
                    g();
                }
            } else if (iG <= 0) {
            }
            return true;
        }
        return false;
    }

    private final boolean j() {
        ajdi ajdiVar;
        do {
            aisw aiswVar = this.f;
            while (true) {
                long j = aiswVar.b;
                ajdiVar = (ajdi) this.g.a((int) (2097151 & j));
                if (ajdiVar != null) {
                    long j2 = 2097152 + j;
                    int iK = k(ajdiVar);
                    if (iK >= 0 && aiswVar.c(j, (j2 & (-2097152)) | iK)) {
                        ajdiVar.nextParkedWorker = a;
                        break;
                    }
                } else {
                    ajdiVar = null;
                    break;
                }
            }
            if (ajdiVar == null) {
                return false;
            }
        } while (!ajdiVar.b.b(-1, 0));
        LockSupport.unpark(ajdiVar);
        return true;
    }

    private static final int k(ajdi ajdiVar) {
        int i;
        do {
            Object obj = ajdiVar.nextParkedWorker;
            if (obj == a) {
                return -1;
            }
            if (obj == null) {
                return 0;
            }
            ajdiVar = (ajdi) obj;
            i = ajdiVar.indexInArray;
        } while (i == 0);
        return i;
    }

    public final void a(Runnable runnable, boolean z, boolean z2) {
        ajdn ajdoVar;
        int i;
        String str = ajdp.a;
        long jNanoTime = System.nanoTime();
        if (runnable instanceof ajdn) {
            ajdoVar = (ajdn) runnable;
            ajdoVar.g = jNanoTime;
            ajdoVar.h = z;
        } else {
            ajdoVar = new ajdo(runnable, jNanoTime, z);
        }
        boolean z3 = ajdoVar.h;
        long jA = z3 ? this.h.a(2097152L) : 0L;
        ajdi ajdiVarH = h();
        if (ajdiVarH != null && (i = ajdiVarH.e) != 5 && (ajdoVar.h || i != 2)) {
            ajdiVarH.c = true;
            ajdr ajdrVar = ajdiVarH.a;
            if (z2) {
                ajdoVar = ajdrVar.b(ajdoVar);
            } else {
                ajdn ajdnVar = (ajdn) ((aisx) ajdrVar.b).a(ajdoVar);
                ajdoVar = ajdnVar == null ? null : ajdrVar.b(ajdnVar);
            }
        }
        if (ajdoVar != null) {
            if (!(ajdoVar.h ? this.j.l(ajdoVar) : this.i.l(ajdoVar))) {
                throw new RejectedExecutionException(String.valueOf(this.e).concat(" was terminated"));
            }
        }
        if (!z3) {
            c();
        } else {
            if (j() || i(jA)) {
                return;
            }
            j();
        }
    }

    public final void b(ajdi ajdiVar, int i, int i2) {
        while (true) {
            aisw aiswVar = this.f;
            long j = aiswVar.b;
            long j2 = 2097152 + j;
            int iK = (int) (2097151 & j);
            if (iK == i) {
                iK = i2 == 0 ? k(ajdiVar) : i2;
            }
            if (iK >= 0) {
                if (aiswVar.c(j, iK | (j2 & (-2097152)))) {
                    return;
                }
            }
        }
    }

    public final void c() {
        if (j() || i(this.h.b)) {
            return;
        }
        j();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f();
    }

    public final boolean d() {
        return this.k.a();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a(runnable, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r8 = this;
            aisu r0 = r8.k
            boolean r0 = r0.b()
            if (r0 != 0) goto L9
            return
        L9:
            ajdi r0 = r8.h()
            ajcv r1 = r8.g
            monitor-enter(r1)
            aisw r2 = r8.h     // Catch: java.lang.Throwable -> L9c
            long r2 = r2.b     // Catch: java.lang.Throwable -> L9c
            r4 = 2097151(0x1fffff, double:1.0361303E-317)
            long r2 = r2 & r4
            monitor-exit(r1)
            int r1 = (int) r2
            r2 = 1
            if (r1 <= 0) goto L63
            r3 = r2
        L1e:
            ajcv r4 = r8.g
            java.lang.Object r4 = r4.a(r3)
            r4.getClass()
            ajdi r4 = (defpackage.ajdi) r4
            if (r4 == r0) goto L5e
        L2b:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L3c
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r5 = 10000(0x2710, double:4.9407E-320)
            r4.join(r5)
            goto L2b
        L3c:
            boolean r5 = defpackage.aitz.a
            ajdr r4 = r4.a
            lds r5 = r8.j
            java.lang.Object r6 = r4.b
            aisx r6 = (defpackage.aisx) r6
            r7 = 0
            java.lang.Object r6 = r6.a(r7)
            ajdn r6 = (defpackage.ajdn) r6
            if (r6 != 0) goto L50
            goto L53
        L50:
            r5.l(r6)
        L53:
            ajdn r6 = r4.c()
            if (r6 != 0) goto L5a
            goto L5e
        L5a:
            r5.l(r6)
            goto L53
        L5e:
            if (r3 == r1) goto L63
            int r3 = r3 + 1
            goto L1e
        L63:
            lds r3 = r8.j
            r3.k()
            lds r4 = r8.i
            r4.k()
        L6d:
            if (r0 == 0) goto L75
            ajdn r1 = r0.b(r2)
            if (r1 != 0) goto L98
        L75:
            java.lang.Object r1 = r4.j()
            ajdn r1 = (defpackage.ajdn) r1
            if (r1 != 0) goto L98
            java.lang.Object r1 = r3.j()
            ajdn r1 = (defpackage.ajdn) r1
            if (r1 != 0) goto L98
            if (r0 == 0) goto L8b
            r1 = 5
            r0.d(r1)
        L8b:
            boolean r0 = defpackage.aitz.a
            aisw r0 = r8.f
            r1 = 0
            r0.b = r1
            aisw r8 = r8.h
            r8.b = r1
            return
        L98:
            e(r1)
            goto L6d
        L9c:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajdj.f():void");
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ajcv ajcvVar = this.g;
        int length = ajcvVar.array.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            ajdi ajdiVar = (ajdi) ajcvVar.a(i6);
            if (ajdiVar != null) {
                ajdr ajdrVar = ajdiVar.a;
                int iA = ((aisx) ajdrVar.b).a != null ? ajdrVar.a() + 1 : ajdrVar.a();
                int i7 = ajdiVar.e;
                int i8 = i7 - 1;
                if (i7 == 0) {
                    throw null;
                }
                if (i8 == 0) {
                    arrayList.add(iA + "c");
                    i++;
                } else if (i8 == 1) {
                    arrayList.add(iA + "b");
                    i2++;
                } else if (i8 == 2) {
                    i3++;
                } else if (i8 == 3) {
                    i4++;
                    if (iA > 0) {
                        arrayList.add(iA + "d");
                    }
                } else {
                    if (i8 != 4) {
                        throw new aezs();
                    }
                    i5++;
                }
            }
        }
        aisw aiswVar = this.h;
        String str = this.e;
        long j = aiswVar.b;
        String strB = aiua.b(this);
        int i9 = this.b;
        int i10 = this.c;
        lds ldsVar = this.i;
        lds ldsVar2 = this.j;
        long j2 = 2097151 & j;
        long j3 = j & 4398044413952L;
        long j4 = j & 9223367638808264704L;
        return str + "@" + strB + "[Pool Size {core = " + i9 + ", max = " + i10 + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + ldsVar.i() + ", global blocking queue size = " + ldsVar2.i() + ", Control State {created workers= " + ((int) j2) + ", blocking tasks = " + ((int) (j3 >> 21)) + ", CPUs acquired = " + (i9 - ((int) (j4 >> 42))) + "}]";
    }
}
