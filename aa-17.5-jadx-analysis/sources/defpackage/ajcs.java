package defpackage;

/* loaded from: classes2.dex */
public final class ajcs {
    public static final ajcz a = new ajcz("REMOVE_FROZEN");
    public final aisw b;
    private final int c;
    private final boolean d;
    private final int e;
    private final aisx f;
    private final lds g;

    public ajcs(int i, boolean z) {
        this.c = i;
        this.d = z;
        int i2 = i - 1;
        this.e = i2;
        aisy aisyVar = aisy.a;
        this.f = new aisx(null, aisyVar);
        this.b = new aisw(0L, aisyVar);
        this.g = new lds(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Object r15) {
        /*
            r14 = this;
        L0:
            aisw r0 = r14.b
            long r1 = r0.b
            r3 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r3 = r3 & r1
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r4 = 1
            if (r3 == 0) goto L18
            r14 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r14 = r14 & r1
            int r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r14 == 0) goto L17
            r14 = 2
            return r14
        L17:
            return r4
        L18:
            r7 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r7 = r7 & r1
            r9 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r9 = r9 & r1
            int r3 = r14.e
            r11 = 30
            long r9 = r9 >> r11
            int r9 = (int) r9
            int r10 = r9 + 2
            r10 = r10 & r3
            int r7 = (int) r7
            r8 = r7 & r3
            if (r10 != r8) goto L31
            return r4
        L31:
            boolean r8 = r14.d
            r10 = 1073741823(0x3fffffff, float:1.9999999)
            if (r8 != 0) goto L52
            r8 = r9 & r3
            lds r12 = r14.g
            aisx r8 = r12.m(r8)
            java.lang.Object r8 = r8.a
            if (r8 == 0) goto L52
            int r0 = r14.c
            r1 = 1024(0x400, float:1.435E-42)
            if (r0 < r1) goto L51
            int r9 = r9 - r7
            r1 = r9 & r10
            int r0 = r0 >> 1
            if (r1 <= r0) goto L0
        L51:
            return r4
        L52:
            int r4 = r9 + 1
            r4 = r4 & r10
            r7 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r7 = r7 & r1
            long r12 = (long) r4
            long r10 = r12 << r11
            long r7 = r7 | r10
            boolean r0 = r0.c(r1, r7)
            if (r0 == 0) goto L0
            r0 = r9 & r3
            lds r1 = r14.g
            aisx r0 = r1.m(r0)
            r0.c(r15)
        L70:
            aisw r0 = r14.b
            long r0 = r0.b
            r2 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r0 = r0 & r2
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto La0
            ajcs r14 = r14.c()
            lds r0 = r14.g
            int r1 = r14.e
            r1 = r1 & r9
            aisx r2 = r0.m(r1)
            java.lang.Object r2 = r2.a
            boolean r3 = r2 instanceof defpackage.ajcr
            r4 = 0
            if (r3 == 0) goto L9d
            ajcr r2 = (defpackage.ajcr) r2
            int r2 = r2.a
            if (r2 != r9) goto L9d
            aisx r0 = r0.m(r1)
            r0.c(r15)
            goto L9e
        L9d:
            r14 = r4
        L9e:
            if (r14 != 0) goto L70
        La0:
            r14 = 0
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajcs.a(java.lang.Object):int");
    }

    public final Object b() {
        while (true) {
            aisw aiswVar = this.b;
            long j = aiswVar.b;
            if ((j & 1152921504606846976L) != 0) {
                return a;
            }
            long j2 = 1073741823;
            int i = this.e;
            int i2 = (int) (j & 1073741823);
            int i3 = i2 & i;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i) == i3) {
                return null;
            }
            lds ldsVar = this.g;
            Object obj = ldsVar.m(i3).a;
            if (obj == null) {
                if (this.d) {
                    return null;
                }
            } else {
                if (obj instanceof ajcr) {
                    return null;
                }
                int i4 = (i2 + 1) & 1073741823;
                if (aiswVar.c(j, afuq.f(j, i4))) {
                    ldsVar.m(i3).c(null);
                    return obj;
                }
                if (this.d) {
                    ajcs ajcsVarC = this;
                    while (true) {
                        aisw aiswVar2 = ajcsVarC.b;
                        while (true) {
                            long j3 = aiswVar2.b;
                            long j4 = j3 & j2;
                            boolean z = aitz.a;
                            if ((j3 & 1152921504606846976L) != 0) {
                                ajcsVarC = ajcsVarC.c();
                                break;
                            }
                            if (aiswVar2.c(j3, afuq.f(j3, i4))) {
                                ajcsVarC.g.m(((int) j4) & ajcsVarC.e).c(null);
                                ajcsVarC = null;
                                break;
                            }
                            j2 = 1073741823;
                        }
                        if (ajcsVarC == null) {
                            return obj;
                        }
                        j2 = 1073741823;
                    }
                }
            }
        }
    }

    public final ajcs c() {
        long j;
        while (true) {
            aisw aiswVar = this.b;
            j = aiswVar.b;
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = 1152921504606846976L | j;
            if (aiswVar.c(j, j2)) {
                j = j2;
                break;
            }
        }
        aisx aisxVar = this.f;
        while (true) {
            ajcs ajcsVar = (ajcs) aisxVar.a;
            if (ajcsVar != null) {
                return ajcsVar;
            }
            int i = this.c;
            ajcs ajcsVar2 = new ajcs(i + i, this.d);
            long j3 = 1152921503533105152L & j;
            int i2 = (int) (1073741823 & j);
            while (true) {
                int i3 = this.e;
                int i4 = i2 & i3;
                if (i4 != (i3 & ((int) (j3 >> 30)))) {
                    Object ajcrVar = this.g.m(i4).a;
                    if (ajcrVar == null) {
                        ajcrVar = new ajcr(i2);
                    }
                    ajcsVar2.g.m(ajcsVar2.e & i2).c(ajcrVar);
                    i2++;
                }
            }
            ajcsVar2.b.b = (-1152921504606846977L) & j;
            aisxVar.d(null, ajcsVar2);
        }
    }

    public final boolean d() {
        aisw aiswVar;
        long j;
        do {
            aiswVar = this.b;
            j = aiswVar.b;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!aiswVar.c(j, 2305843009213693952L | j));
        return true;
    }

    public final boolean e() {
        long j = this.b.b;
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }
}
