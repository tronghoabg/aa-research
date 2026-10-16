package defpackage;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes3.dex */
public final class ajdi extends Thread {
    public final ajdr a;
    public final aisv b;
    public boolean c;
    final /* synthetic */ ajdj d;
    public int e;
    private final affv f;
    private long g;
    private long h;
    private int i;
    public volatile int indexInArray;
    public volatile Object nextParkedWorker;

    public ajdi(ajdj ajdjVar, int i) {
        this.d = ajdjVar;
        setDaemon(true);
        setContextClassLoader(ajdjVar.getClass().getClassLoader());
        this.a = new ajdr();
        this.f = new affv();
        this.e = 4;
        this.b = new aisv(0, aisy.a);
        this.nextParkedWorker = ajdj.a;
        int iNanoTime = (int) System.nanoTime();
        this.i = iNanoTime == 0 ? 42 : iNanoTime;
        c(i);
    }

    private final ajdn e() {
        int iA = a(2);
        ajdj ajdjVar = this.d;
        if (iA == 0) {
            ajdn ajdnVar = (ajdn) ajdjVar.i.j();
            return ajdnVar != null ? ajdnVar : (ajdn) ajdjVar.j.j();
        }
        ajdn ajdnVar2 = (ajdn) ajdjVar.j.j();
        return ajdnVar2 != null ? ajdnVar2 : (ajdn) ajdjVar.i.j();
    }

    private final ajdn f(int i) {
        long j;
        ajdn ajdnVarC;
        long j2;
        long j3;
        long j4;
        ajdj ajdjVar = this.d;
        int i2 = (int) (ajdjVar.h.b & 2097151);
        ajdn ajdnVar = null;
        if (i2 < 2) {
            return null;
        }
        int iA = a(i2);
        int i3 = 0;
        long jMin = Long.MAX_VALUE;
        while (i3 < i2) {
            iA++;
            if (iA > i2) {
                iA = 1;
            }
            ajdi ajdiVar = (ajdi) ajdjVar.g.a(iA);
            if (ajdiVar != null && ajdiVar != this) {
                ajdr ajdrVar = ajdiVar.a;
                affv affvVar = this.f;
                if (i == 3) {
                    ajdnVarC = ajdrVar.c();
                    j = 0;
                } else {
                    boolean z = i == 1;
                    int i4 = ((aisv) ajdrVar.d).b;
                    j = 0;
                    int i5 = ((aisv) ajdrVar.c).b;
                    while (i4 != i5 && (!z || ((aisv) ajdrVar.e).b != 0)) {
                        int i6 = i4 + 1;
                        ajdn ajdnVarD = ajdrVar.d(i4, z);
                        if (ajdnVarD != null) {
                            ajdnVarC = ajdnVarD;
                            break;
                        }
                        i4 = i6;
                    }
                    ajdnVarC = ajdnVar;
                }
                if (ajdnVarC != null) {
                    affvVar.a = ajdnVarC;
                    j4 = -1;
                    j3 = -1;
                } else {
                    while (true) {
                        aisx aisxVar = (aisx) ajdrVar.b;
                        ajdn ajdnVar2 = (ajdn) aisxVar.a;
                        j2 = -2;
                        j3 = -1;
                        if (ajdnVar2 == null) {
                            break;
                        }
                        if (((true != ajdnVar2.h ? 2 : 1) & i) == 0) {
                            break;
                        }
                        String str = ajdp.a;
                        ajdr ajdrVar2 = ajdrVar;
                        long jNanoTime = System.nanoTime() - ajdnVar2.g;
                        long j5 = ajdp.b;
                        if (jNanoTime < j5) {
                            j2 = j5 - jNanoTime;
                            ajdnVar = null;
                            break;
                        }
                        ajdnVar = null;
                        if (aisxVar.d(ajdnVar2, null)) {
                            affvVar.a = ajdnVar2;
                            j2 = -1;
                            break;
                        }
                        ajdrVar = ajdrVar2;
                    }
                    j4 = j2;
                }
                if (j4 == j3) {
                    ajdn ajdnVar3 = (ajdn) affvVar.a;
                    affvVar.a = ajdnVar;
                    return ajdnVar3;
                }
                if (j4 > j) {
                    jMin = Math.min(jMin, j4);
                }
            }
            i3++;
            ajdnVar = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.h = jMin;
        return null;
    }

    private final boolean g() {
        return this.nextParkedWorker != ajdj.a;
    }

    public final int a(int i) {
        int i2 = this.i;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.i = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ajdn b(boolean r10) {
        /*
            r9 = this;
            int r0 = r9.e
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L8
            goto L74
        L8:
            ajdj r0 = r9.d
        La:
            aisw r3 = r0.h
            long r4 = r3.b
            r6 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r6 = r6 & r4
            r8 = 42
            long r6 = r6 >> r8
            int r6 = (int) r6
            if (r6 != 0) goto L66
            ajdr r10 = r9.a
        L1c:
            java.lang.Object r3 = r10.b
            aisx r3 = (defpackage.aisx) r3
            java.lang.Object r4 = r3.a
            ajdn r4 = (defpackage.ajdn) r4
            if (r4 != 0) goto L27
            goto L33
        L27:
            boolean r5 = r4.h
            if (r5 != r2) goto L33
            boolean r3 = r3.d(r4, r1)
            if (r3 == 0) goto L1c
            r1 = r4
            goto L53
        L33:
            java.lang.Object r3 = r10.d
            aisv r3 = (defpackage.aisv) r3
            int r3 = r3.b
            java.lang.Object r4 = r10.c
            aisv r4 = (defpackage.aisv) r4
            int r4 = r4.b
        L3f:
            if (r3 == r4) goto L53
            java.lang.Object r5 = r10.e
            aisv r5 = (defpackage.aisv) r5
            int r5 = r5.b
            if (r5 != 0) goto L4a
            goto L53
        L4a:
            int r4 = r4 + (-1)
            ajdn r5 = r10.d(r4, r2)
            if (r5 == 0) goto L3f
            r1 = r5
        L53:
            if (r1 != 0) goto L65
            lds r10 = r0.j
            java.lang.Object r10 = r10.j()
            ajdn r10 = (defpackage.ajdn) r10
            if (r10 != 0) goto L64
            ajdn r9 = r9.f(r2)
            return r9
        L64:
            return r10
        L65:
            return r1
        L66:
            r6 = -4398046511104(0xfffffc0000000000, double:NaN)
            long r6 = r6 + r4
            boolean r3 = r3.c(r4, r6)
            if (r3 == 0) goto La
            r9.e = r2
        L74:
            if (r10 == 0) goto Laa
            ajdj r10 = r9.d
            int r10 = r10.b
            int r10 = r10 + r10
            int r10 = r9.a(r10)
            if (r10 != 0) goto L82
            goto L83
        L82:
            r2 = 0
        L83:
            if (r2 == 0) goto L8c
            ajdn r10 = r9.e()
            if (r10 == 0) goto L8c
            return r10
        L8c:
            ajdr r10 = r9.a
            java.lang.Object r0 = r10.b
            aisx r0 = (defpackage.aisx) r0
            java.lang.Object r0 = r0.a(r1)
            ajdn r0 = (defpackage.ajdn) r0
            if (r0 != 0) goto L9e
            ajdn r0 = r10.c()
        L9e:
            if (r0 == 0) goto La1
            return r0
        La1:
            if (r2 != 0) goto Lb1
            ajdn r10 = r9.e()
            if (r10 == 0) goto Lb1
            return r10
        Laa:
            ajdn r10 = r9.e()
            if (r10 == 0) goto Lb1
            return r10
        Lb1:
            r10 = 3
            ajdn r9 = r9.f(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajdi.b(boolean):ajdn");
    }

    public final void c(int i) {
        String strValueOf = i == 0 ? "TERMINATED" : String.valueOf(i);
        setName(this.d.e + "-worker-" + strValueOf);
        this.indexInArray = i;
    }

    public final boolean d(int i) {
        int i2 = this.e;
        boolean z = i2 == 1;
        if (z) {
            this.d.h.a(4398046511104L);
        }
        if (i2 != i) {
            this.e = i;
        }
        return z;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        loop0: while (true) {
            boolean z = false;
            while (true) {
                ajdj ajdjVar = this.d;
                if (ajdjVar.d() || this.e == 5) {
                    break loop0;
                }
                ajdn ajdnVarB = b(this.c);
                long j = -2097152;
                if (ajdnVarB != null) {
                    this.h = 0L;
                    this.g = 0L;
                    if (this.e == 3) {
                        boolean z2 = aitz.a;
                        this.e = 2;
                    }
                    if (ajdnVarB.h) {
                        if (d(2)) {
                            ajdjVar.c();
                        }
                        ajdj.e(ajdnVarB);
                        ajdjVar.h.a(-2097152L);
                        if (this.e != 5) {
                            boolean z3 = aitz.a;
                            this.e = 4;
                        }
                    } else {
                        ajdj.e(ajdnVarB);
                    }
                } else {
                    this.c = false;
                    if (this.h == 0) {
                        long j2 = 2097151;
                        if (g()) {
                            aisv aisvVar = this.b;
                            aisvVar.b = -1;
                            while (g() && aisvVar.b == -1 && !ajdjVar.d() && this.e != 5) {
                                d(3);
                                Thread.interrupted();
                                if (this.g == 0) {
                                    this.g = System.nanoTime() + ajdjVar.d;
                                }
                                LockSupport.parkNanos(ajdjVar.d);
                                long j3 = j2;
                                if (System.nanoTime() - this.g >= 0) {
                                    this.g = 0L;
                                    ajcv ajcvVar = ajdjVar.g;
                                    synchronized (ajcvVar) {
                                        if (!ajdjVar.d()) {
                                            aisw aiswVar = ajdjVar.h;
                                            if (((int) (aiswVar.b & j3)) > ajdjVar.b && aisvVar.b(-1, 1)) {
                                                int i = this.indexInArray;
                                                c(0);
                                                ajdjVar.b(this, i, 0);
                                                int andDecrement = (int) (aisw.a.getAndDecrement(aiswVar) & j3);
                                                if (andDecrement != i) {
                                                    Object objA = ajcvVar.a(andDecrement);
                                                    objA.getClass();
                                                    ajdi ajdiVar = (ajdi) objA;
                                                    ajcvVar.b(i, ajdiVar);
                                                    ajdiVar.c(i);
                                                    ajdjVar.b(ajdiVar, andDecrement, i);
                                                }
                                                ajcvVar.b(andDecrement, null);
                                                this.e = 5;
                                            }
                                        }
                                    }
                                }
                                j2 = j3;
                            }
                        } else if (this.nextParkedWorker == ajdj.a) {
                            aisw aiswVar2 = ajdjVar.f;
                            while (true) {
                                long j4 = aiswVar2.b;
                                int i2 = this.indexInArray;
                                boolean z4 = aitz.a;
                                long j5 = j;
                                this.nextParkedWorker = ajdjVar.g.a((int) (j4 & 2097151));
                                if (aiswVar2.c(j4, ((2097152 + j4) & j5) | i2)) {
                                    break;
                                } else {
                                    j = j5;
                                }
                            }
                        }
                    } else {
                        if (z) {
                            d(3);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.h);
                            this.h = 0L;
                            break;
                        }
                        z = true;
                    }
                }
            }
        }
        d(5);
    }
}
