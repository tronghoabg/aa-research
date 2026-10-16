package kotlinx.coroutines.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    public static final ak f51853a = new ak("REMOVE_FROZEN");

    /* renamed from: b, reason: collision with root package name */
    private final int f51854b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f51855c;

    /* renamed from: d, reason: collision with root package name */
    private final int f51856d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.a.d f51857e = h.e.b.h(null);

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.a.c f51858f = h.e.b.g(0);

    /* renamed from: g, reason: collision with root package name */
    private final e.a.f.a.e f51859g;

    public ab(int i2, boolean z) {
        this.f51854b = i2;
        this.f51855c = z;
        int i3 = i2 - 1;
        this.f51856d = i3;
        this.f51859g = new e.a.f.a.e(i2);
        if (i3 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i2 & i3) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
        L4:
            kotlinx.a.c r2 = r0.f51858f
            long r3 = r2.d()
            r5 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r5 = r5 & r3
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r6 = 1
            if (r5 == 0) goto L1e
            r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r0 = r0 & r3
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 == 0) goto L1d
            r0 = 2
            return r0
        L1d:
            return r6
        L1e:
            r9 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r9 = r9 & r3
            r11 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r13 = r3 & r11
            int r5 = r0.f51856d
            r15 = 30
            long r13 = r13 >> r15
            int r13 = (int) r13
            int r14 = r13 + 2
            int r9 = (int) r9
            r10 = r14 & r5
            r14 = r9 & r5
            if (r10 != r14) goto L39
            return r6
        L39:
            boolean r10 = r0.f51855c
            r14 = 1073741823(0x3fffffff, float:1.9999999)
            if (r10 != 0) goto L5e
            r10 = r13 & r5
            r16 = r6
            e.a.f.a.e r6 = r0.f51859g
            kotlinx.a.d r6 = r6.d(r10)
            java.lang.Object r6 = r6.b()
            if (r6 == 0) goto L5e
            int r2 = r0.f51854b
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L5d
            int r13 = r13 - r9
            r3 = r13 & r14
            int r2 = r2 >> 1
            if (r3 <= r2) goto L4
        L5d:
            return r16
        L5e:
            int r6 = r13 + 1
            r6 = r6 & r14
            long r9 = h.g.b.au.j(r3, r11)
            long r11 = (long) r6
            long r11 = r11 << r15
            long r9 = r9 | r11
            boolean r2 = r2.g(r3, r9)
            if (r2 == 0) goto L4
            r2 = r13 & r5
            e.a.f.a.e r3 = r0.f51859g
            kotlinx.a.d r2 = r3.d(r2)
            r2.d(r1)
        L79:
            kotlinx.a.c r2 = r0.f51858f
            long r2 = r2.d()
            r4 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r2 = r2 & r4
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 == 0) goto Lad
            kotlinx.coroutines.e.ab r0 = r0.d()
            e.a.f.a.e r2 = r0.f51859g
            int r3 = r0.f51856d
            r3 = r3 & r13
            kotlinx.a.d r4 = r2.d(r3)
            java.lang.Object r4 = r4.b()
            boolean r5 = r4 instanceof kotlinx.coroutines.e.aa
            r6 = 0
            if (r5 == 0) goto Laa
            kotlinx.coroutines.e.aa r4 = (kotlinx.coroutines.e.aa) r4
            int r4 = r4.f51852a
            if (r4 != r13) goto Laa
            kotlinx.a.d r2 = r2.d(r3)
            r2.d(r1)
            goto Lab
        Laa:
            r0 = r6
        Lab:
            if (r0 != 0) goto L79
        Lad:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.e.ab.a(java.lang.Object):int");
    }

    public final int b() {
        long jD = this.f51858f.d();
        return (((int) ((jD & 1152921503533105152L) >> 30)) - ((int) (1073741823 & jD))) & 1073741823;
    }

    public final Object c() {
        ab abVarD = this;
        while (true) {
            kotlinx.a.c cVar = abVarD.f51858f;
            long jD = cVar.d();
            if ((jD & 1152921504606846976L) != 0) {
                return f51853a;
            }
            int i2 = abVarD.f51856d;
            int i3 = (int) (jD & 1073741823);
            int i4 = i3 & i2;
            if ((((int) ((1152921503533105152L & jD) >> 30)) & i2) == i4) {
                return null;
            }
            e.a.f.a.e eVar = abVarD.f51859g;
            Object objB = eVar.d(i4).b();
            if (objB == null) {
                if (abVarD.f51855c) {
                    return null;
                }
            } else {
                if (objB instanceof aa) {
                    return null;
                }
                int i5 = (i3 + 1) & 1073741823;
                if (cVar.g(jD, h.g.b.au.k(jD, i5))) {
                    eVar.d(i4).d(null);
                    return objB;
                }
                if (abVarD.f51855c) {
                    while (true) {
                        kotlinx.a.c cVar2 = abVarD.f51858f;
                        long jD2 = cVar2.d();
                        long j2 = jD2 & 1073741823;
                        int i6 = kotlinx.coroutines.ai.f51347a;
                        if ((jD2 & 1152921504606846976L) != 0) {
                            abVarD = abVarD.d();
                        } else if (cVar2.g(jD2, h.g.b.au.k(jD2, i5))) {
                            abVarD.f51859g.d(abVarD.f51856d & ((int) j2)).d(null);
                            abVarD = null;
                        } else {
                            continue;
                        }
                        if (abVarD == null) {
                            return objB;
                        }
                    }
                }
            }
        }
    }

    public final ab d() {
        long jD;
        while (true) {
            kotlinx.a.c cVar = this.f51858f;
            jD = cVar.d();
            if ((jD & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = jD | 1152921504606846976L;
            if (cVar.g(jD, j2)) {
                jD = j2;
                break;
            }
        }
        kotlinx.a.d dVar = this.f51857e;
        while (true) {
            ab abVar = (ab) dVar.b();
            if (abVar != null) {
                return abVar;
            }
            int i2 = this.f51854b;
            ab abVar2 = new ab(i2 + i2, this.f51855c);
            long j3 = 1152921503533105152L & jD;
            int i3 = (int) (1073741823 & jD);
            while (true) {
                int i4 = this.f51856d;
                int i5 = i3 & i4;
                if (i5 != (i4 & ((int) (j3 >> 30)))) {
                    Object objB = this.f51859g.d(i5).b();
                    if (objB == null) {
                        objB = new aa(i3);
                    }
                    abVar2.f51859g.d(abVar2.f51856d & i3).d(objB);
                    i3++;
                }
            }
            abVar2.f51858f.f(h.g.b.au.j(jD, 1152921504606846976L));
            dVar.e(null, abVar2);
        }
    }

    public final boolean e() {
        kotlinx.a.c cVar;
        long jD;
        do {
            cVar = this.f51858f;
            jD = cVar.d();
            if ((jD & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & jD) != 0) {
                return false;
            }
        } while (!cVar.g(jD, 2305843009213693952L | jD));
        return true;
    }

    public final boolean f() {
        long jD = this.f51858f.d();
        return ((int) (1073741823 & jD)) == ((int) ((jD & 1152921503533105152L) >> 30));
    }
}
