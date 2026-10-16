package j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class p extends k {

    /* renamed from: h, reason: collision with root package name */
    public static final j$.sun.misc.a f50196h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f50197i;

    /* renamed from: e, reason: collision with root package name */
    public q f50198e;

    /* renamed from: f, reason: collision with root package name */
    public volatile q f50199f;

    /* renamed from: g, reason: collision with root package name */
    public volatile Thread f50200g;
    volatile int lockState;

    static {
        j$.sun.misc.a aVar = j$.sun.misc.a.f49787b;
        f50196h = aVar;
        f50197i = aVar.a(p.class, "lockState");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004b A[PHI: r7
  0x004b: PHI (r7v3 java.lang.Class<?>) = (r7v2 java.lang.Class<?>), (r7v4 java.lang.Class<?>) binds: [B:24:0x0049, B:16:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p(j$.util.concurrent.q r11) {
        /*
            r10 = this;
            r0 = -2
            r1 = 0
            r10.<init>(r0, r1, r1)
            r10.f50199f = r11
            r0 = r1
        L8:
            if (r11 == 0) goto L6c
            j$.util.concurrent.k r2 = r11.f50183d
            j$.util.concurrent.q r2 = (j$.util.concurrent.q) r2
            r11.f50203g = r1
            r11.f50202f = r1
            r3 = 0
            if (r0 != 0) goto L1b
            r11.f50201e = r1
            r11.f50205i = r3
        L19:
            r0 = r11
            goto L68
        L1b:
            java.lang.Object r4 = r11.f50181b
            int r5 = r11.f50180a
            r6 = r0
            r7 = r1
        L21:
            java.lang.Object r8 = r6.f50181b
            int r9 = r6.f50180a
            if (r9 <= r5) goto L29
            r8 = -1
            goto L51
        L29:
            if (r9 >= r5) goto L2d
            r8 = 1
            goto L51
        L2d:
            if (r7 != 0) goto L35
            java.lang.Class r7 = j$.util.concurrent.ConcurrentHashMap.c(r4)
            if (r7 == 0) goto L4b
        L35:
            int r9 = j$.util.concurrent.ConcurrentHashMap.f50144g
            if (r8 == 0) goto L48
            java.lang.Class r9 = r8.getClass()
            if (r9 == r7) goto L40
            goto L48
        L40:
            r9 = r4
            java.lang.Comparable r9 = (java.lang.Comparable) r9
            int r9 = r9.compareTo(r8)
            goto L49
        L48:
            r9 = r3
        L49:
            if (r9 != 0) goto L50
        L4b:
            int r8 = i(r4, r8)
            goto L51
        L50:
            r8 = r9
        L51:
            if (r8 > 0) goto L56
            j$.util.concurrent.q r9 = r6.f50202f
            goto L58
        L56:
            j$.util.concurrent.q r9 = r6.f50203g
        L58:
            if (r9 != 0) goto L6a
            r11.f50201e = r6
            if (r8 > 0) goto L61
            r6.f50202f = r11
            goto L63
        L61:
            r6.f50203g = r11
        L63:
            j$.util.concurrent.q r11 = c(r0, r11)
            goto L19
        L68:
            r11 = r2
            goto L8
        L6a:
            r6 = r9
            goto L21
        L6c:
            r10.f50198e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.p.<init>(j$.util.concurrent.q):void");
    }

    public static q b(q qVar, q qVar2) {
        while (qVar2 != null && qVar2 != qVar) {
            q qVar3 = qVar2.f50201e;
            if (qVar3 == null) {
                qVar2.f50205i = false;
                return qVar2;
            }
            if (qVar2.f50205i) {
                qVar2.f50205i = false;
                return qVar;
            }
            q qVar4 = qVar3.f50202f;
            if (qVar4 == qVar2) {
                q qVar5 = qVar3.f50203g;
                if (qVar5 != null && qVar5.f50205i) {
                    qVar5.f50205i = false;
                    qVar3.f50205i = true;
                    qVar = g(qVar, qVar3);
                    qVar3 = qVar2.f50201e;
                    qVar5 = qVar3 == null ? null : qVar3.f50203g;
                }
                if (qVar5 != null) {
                    q qVar6 = qVar5.f50202f;
                    q qVar7 = qVar5.f50203g;
                    if ((qVar7 == null || !qVar7.f50205i) && (qVar6 == null || !qVar6.f50205i)) {
                        qVar5.f50205i = true;
                    } else {
                        if (qVar7 == null || !qVar7.f50205i) {
                            if (qVar6 != null) {
                                qVar6.f50205i = false;
                            }
                            qVar5.f50205i = true;
                            qVar = h(qVar, qVar5);
                            qVar3 = qVar2.f50201e;
                            qVar5 = qVar3 != null ? qVar3.f50203g : null;
                        }
                        if (qVar5 != null) {
                            qVar5.f50205i = qVar3 == null ? false : qVar3.f50205i;
                            q qVar8 = qVar5.f50203g;
                            if (qVar8 != null) {
                                qVar8.f50205i = false;
                            }
                        }
                        if (qVar3 != null) {
                            qVar3.f50205i = false;
                            qVar = g(qVar, qVar3);
                        }
                        qVar2 = qVar;
                    }
                }
                qVar2 = qVar3;
            } else {
                if (qVar4 != null && qVar4.f50205i) {
                    qVar4.f50205i = false;
                    qVar3.f50205i = true;
                    qVar = h(qVar, qVar3);
                    qVar3 = qVar2.f50201e;
                    qVar4 = qVar3 == null ? null : qVar3.f50202f;
                }
                if (qVar4 != null) {
                    q qVar9 = qVar4.f50202f;
                    q qVar10 = qVar4.f50203g;
                    if ((qVar9 == null || !qVar9.f50205i) && (qVar10 == null || !qVar10.f50205i)) {
                        qVar4.f50205i = true;
                    } else {
                        if (qVar9 == null || !qVar9.f50205i) {
                            if (qVar10 != null) {
                                qVar10.f50205i = false;
                            }
                            qVar4.f50205i = true;
                            qVar = g(qVar, qVar4);
                            qVar3 = qVar2.f50201e;
                            qVar4 = qVar3 != null ? qVar3.f50202f : null;
                        }
                        if (qVar4 != null) {
                            qVar4.f50205i = qVar3 == null ? false : qVar3.f50205i;
                            q qVar11 = qVar4.f50202f;
                            if (qVar11 != null) {
                                qVar11.f50205i = false;
                            }
                        }
                        if (qVar3 != null) {
                            qVar3.f50205i = false;
                            qVar = h(qVar, qVar3);
                        }
                        qVar2 = qVar;
                    }
                }
                qVar2 = qVar3;
            }
        }
        return qVar;
    }

    public static q c(q qVar, q qVar2) {
        q qVar3;
        qVar2.f50205i = true;
        while (true) {
            q qVar4 = qVar2.f50201e;
            if (qVar4 == null) {
                qVar2.f50205i = false;
                return qVar2;
            }
            if (!qVar4.f50205i || (qVar3 = qVar4.f50201e) == null) {
                break;
            }
            q qVar5 = qVar3.f50202f;
            if (qVar4 == qVar5) {
                q qVar6 = qVar3.f50203g;
                if (qVar6 == null || !qVar6.f50205i) {
                    if (qVar2 == qVar4.f50203g) {
                        qVar = g(qVar, qVar4);
                        q qVar7 = qVar4.f50201e;
                        qVar3 = qVar7 == null ? null : qVar7.f50201e;
                        qVar4 = qVar7;
                        qVar2 = qVar4;
                    }
                    if (qVar4 != null) {
                        qVar4.f50205i = false;
                        if (qVar3 != null) {
                            qVar3.f50205i = true;
                            qVar = h(qVar, qVar3);
                        }
                    }
                } else {
                    qVar6.f50205i = false;
                    qVar4.f50205i = false;
                    qVar3.f50205i = true;
                    qVar2 = qVar3;
                }
            } else if (qVar5 == null || !qVar5.f50205i) {
                if (qVar2 == qVar4.f50202f) {
                    qVar = h(qVar, qVar4);
                    q qVar8 = qVar4.f50201e;
                    qVar3 = qVar8 == null ? null : qVar8.f50201e;
                    qVar4 = qVar8;
                    qVar2 = qVar4;
                }
                if (qVar4 != null) {
                    qVar4.f50205i = false;
                    if (qVar3 != null) {
                        qVar3.f50205i = true;
                        qVar = g(qVar, qVar3);
                    }
                }
            } else {
                qVar5.f50205i = false;
                qVar4.f50205i = false;
                qVar3.f50205i = true;
                qVar2 = qVar3;
            }
        }
        return qVar;
    }

    public static q g(q qVar, q qVar2) {
        q qVar3;
        if (qVar2 != null && (qVar3 = qVar2.f50203g) != null) {
            q qVar4 = qVar3.f50202f;
            qVar2.f50203g = qVar4;
            if (qVar4 != null) {
                qVar4.f50201e = qVar2;
            }
            q qVar5 = qVar2.f50201e;
            qVar3.f50201e = qVar5;
            if (qVar5 == null) {
                qVar3.f50205i = false;
                qVar = qVar3;
            } else if (qVar5.f50202f == qVar2) {
                qVar5.f50202f = qVar3;
            } else {
                qVar5.f50203g = qVar3;
            }
            qVar3.f50202f = qVar2;
            qVar2.f50201e = qVar3;
        }
        return qVar;
    }

    public static q h(q qVar, q qVar2) {
        q qVar3;
        if (qVar2 != null && (qVar3 = qVar2.f50202f) != null) {
            q qVar4 = qVar3.f50203g;
            qVar2.f50202f = qVar4;
            if (qVar4 != null) {
                qVar4.f50201e = qVar2;
            }
            q qVar5 = qVar2.f50201e;
            qVar3.f50201e = qVar5;
            if (qVar5 == null) {
                qVar3.f50205i = false;
                qVar = qVar3;
            } else if (qVar5.f50203g == qVar2) {
                qVar5.f50203g = qVar3;
            } else {
                qVar5.f50202f = qVar3;
            }
            qVar3.f50203g = qVar2;
            qVar2.f50201e = qVar3;
        }
        return qVar;
    }

    public static int i(Object obj, Object obj2) {
        int iCompareTo;
        return (obj == null || obj2 == null || (iCompareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) ? System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1 : iCompareTo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001c, code lost:
    
        return r6;
     */
    @Override // j$.util.concurrent.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.util.concurrent.k a(int r11, java.lang.Object r12) {
        /*
            r10 = this;
            j$.util.concurrent.q r0 = r10.f50199f
        L2:
            r6 = r0
        L3:
            r7 = 0
            if (r6 == 0) goto L75
            int r4 = r10.lockState
            r0 = r4 & 3
            if (r0 == 0) goto L20
            int r0 = r6.f50180a
            if (r0 != r11) goto L1d
            java.lang.Object r0 = r6.f50181b
            if (r0 == r12) goto L1c
            if (r0 == 0) goto L1d
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L1d
        L1c:
            return r6
        L1d:
            j$.util.concurrent.k r0 = r6.f50183d
            goto L2
        L20:
            j$.sun.misc.a r8 = j$.util.concurrent.p.f50196h
            long r2 = j$.util.concurrent.p.f50197i
            int r5 = r4 + 4
            sun.misc.Unsafe r0 = r8.f49788a
            r1 = r10
            boolean r0 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r0 == 0) goto L3
            r9 = 6
            j$.util.concurrent.q r0 = r10.f50198e     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L35
            goto L39
        L35:
            j$.util.concurrent.q r7 = r0.b(r11, r12, r7)     // Catch: java.lang.Throwable -> L54
        L39:
            sun.misc.Unsafe r0 = r8.f49788a
            int r4 = r0.getIntVolatile(r10, r2)
            sun.misc.Unsafe r0 = r8.f49788a
            int r5 = r4 + (-4)
            r1 = r10
            boolean r0 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r0 == 0) goto L39
            if (r4 != r9) goto L53
            java.lang.Thread r0 = r10.f50200g
            if (r0 == 0) goto L53
            java.util.concurrent.locks.LockSupport.unpark(r0)
        L53:
            return r7
        L54:
            r0 = move-exception
            r7 = r0
            j$.sun.misc.a r8 = j$.util.concurrent.p.f50196h
            long r2 = j$.util.concurrent.p.f50197i
        L5a:
            sun.misc.Unsafe r0 = r8.f49788a
            int r4 = r0.getIntVolatile(r10, r2)
            sun.misc.Unsafe r0 = r8.f49788a
            int r5 = r4 + (-4)
            r1 = r10
            boolean r0 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r0 == 0) goto L5a
            if (r4 != r9) goto L74
            java.lang.Thread r0 = r10.f50200g
            if (r0 == 0) goto L74
            java.util.concurrent.locks.LockSupport.unpark(r0)
        L74:
            throw r7
        L75:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.p.a(int, java.lang.Object):j$.util.concurrent.k");
    }

    public final void d() {
        j$.sun.misc.a aVar = f50196h;
        if (aVar.f49788a.compareAndSwapInt(this, f50197i, 0, 1)) {
            return;
        }
        boolean z = false;
        while (true) {
            int i2 = this.lockState;
            if ((i2 & (-3)) == 0) {
                j$.sun.misc.a aVar2 = f50196h;
                if (aVar2.f49788a.compareAndSwapInt(this, f50197i, i2, 1)) {
                    break;
                }
            } else if ((i2 & 2) == 0) {
                if (f50196h.f49788a.compareAndSwapInt(this, f50197i, i2, i2 | 2)) {
                    this.f50200g = Thread.currentThread();
                    z = true;
                }
            } else if (z) {
                LockSupport.park(this);
            }
        }
        if (z) {
            this.f50200g = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a9 A[LOOP:0: B:3:0x0007->B:65:0x00a9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0079 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.util.concurrent.q e(int r12, java.lang.Object r13, java.lang.Object r14) {
        /*
            r11 = this;
            j$.util.concurrent.q r0 = r11.f50198e
            r7 = 0
            r8 = 0
            r6 = r0
            r0 = r7
            r1 = r8
        L7:
            if (r6 != 0) goto L18
            j$.util.concurrent.q r1 = new j$.util.concurrent.q
            r5 = 0
            r6 = 0
            r2 = r12
            r3 = r13
            r4 = r14
            r1.<init>(r2, r3, r4, r5, r6)
            r11.f50198e = r1
            r11.f50199f = r1
            return r7
        L18:
            int r4 = r6.f50180a
            r9 = 1
            if (r4 <= r12) goto L20
            r4 = -1
        L1e:
            r10 = r4
            goto L70
        L20:
            if (r4 >= r12) goto L24
            r10 = r9
            goto L70
        L24:
            java.lang.Object r4 = r6.f50181b
            if (r4 == r13) goto Lac
            if (r4 == 0) goto L32
            boolean r5 = r13.equals(r4)
            if (r5 == 0) goto L32
            goto Lac
        L32:
            if (r0 != 0) goto L3a
            java.lang.Class r0 = j$.util.concurrent.ConcurrentHashMap.c(r13)
            if (r0 == 0) goto L50
        L3a:
            int r5 = j$.util.concurrent.ConcurrentHashMap.f50144g
            if (r4 == 0) goto L4d
            java.lang.Class r5 = r4.getClass()
            if (r5 == r0) goto L45
            goto L4d
        L45:
            r5 = r13
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            int r5 = r5.compareTo(r4)
            goto L4e
        L4d:
            r5 = r8
        L4e:
            if (r5 != 0) goto L6f
        L50:
            if (r1 != 0) goto L6a
            j$.util.concurrent.q r1 = r6.f50202f
            if (r1 == 0) goto L5e
            j$.util.concurrent.q r1 = r1.b(r12, r13, r0)
            if (r1 != 0) goto L5d
            goto L5e
        L5d:
            return r1
        L5e:
            j$.util.concurrent.q r1 = r6.f50203g
            if (r1 == 0) goto L69
            j$.util.concurrent.q r1 = r1.b(r12, r13, r0)
            if (r1 == 0) goto L69
            return r1
        L69:
            r1 = r9
        L6a:
            int r4 = i(r13, r4)
            goto L1e
        L6f:
            r10 = r5
        L70:
            if (r10 > 0) goto L75
            j$.util.concurrent.q r4 = r6.f50202f
            goto L77
        L75:
            j$.util.concurrent.q r4 = r6.f50203g
        L77:
            if (r4 != 0) goto La9
            j$.util.concurrent.q r5 = r11.f50199f
            j$.util.concurrent.q r1 = new j$.util.concurrent.q
            r2 = r12
            r3 = r13
            r4 = r14
            r1.<init>(r2, r3, r4, r5, r6)
            r11.f50199f = r1
            if (r5 == 0) goto L89
            r5.f50204h = r1
        L89:
            if (r10 > 0) goto L8e
            r6.f50202f = r1
            goto L90
        L8e:
            r6.f50203g = r1
        L90:
            boolean r0 = r6.f50205i
            if (r0 != 0) goto L97
            r1.f50205i = r9
            return r7
        L97:
            r11.d()
            j$.util.concurrent.q r0 = r11.f50198e     // Catch: java.lang.Throwable -> La5
            j$.util.concurrent.q r0 = c(r0, r1)     // Catch: java.lang.Throwable -> La5
            r11.f50198e = r0     // Catch: java.lang.Throwable -> La5
            r11.lockState = r8
            return r7
        La5:
            r0 = move-exception
            r11.lockState = r8
            throw r0
        La9:
            r6 = r4
            goto L7
        Lac:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.p.e(int, java.lang.Object, java.lang.Object):j$.util.concurrent.q");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x008e A[PHI: r0
  0x008e: PHI (r0v4 j$.util.concurrent.q) = (r0v3 j$.util.concurrent.q), (r0v12 j$.util.concurrent.q) binds: [B:55:0x008a, B:51:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(j$.util.concurrent.q r11) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.p.f(j$.util.concurrent.q):boolean");
    }
}
