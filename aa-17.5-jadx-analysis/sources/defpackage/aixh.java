package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public class aixh implements aixl {
    public final aisw a;
    public final aisw b;
    public final aisx c;
    public final aisx d;
    private final int f;
    private final aisw g;
    private final aisw h;
    private final aisx i;
    private final aisx j;
    private final aisx k;

    public aixh(int i) {
        this.f = i;
        if (i < 0) {
            throw new IllegalArgumentException(a.bn(i, "Invalid channel capacity: ", ", should be >=0"));
        }
        aisy aisyVar = aisy.a;
        this.a = new aisw(0L, aisyVar);
        this.b = new aisw(0L, aisyVar);
        aixq aixqVar = aixj.a;
        this.g = new aisw(i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L, aisyVar);
        this.h = new aisw(F(), aisyVar);
        aixq aixqVar2 = new aixq(0L, null, this, 3);
        this.c = new aisx(aixqVar2, aisyVar);
        this.d = new aisx(aixqVar2, aisyVar);
        if (M()) {
            aixqVar2 = aixj.a;
            aixqVar2.getClass();
        }
        this.i = new aisx(aixqVar2, aisyVar);
        this.j = new aisx(aixj.s, aisyVar);
        this.k = new aisx(null, aisyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0000 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int E(defpackage.aixq r7, int r8, java.lang.Object r9, long r10, java.lang.Object r12, boolean r13) {
        /*
            r6 = this;
        L0:
            java.lang.Object r0 = r7.d(r8)
            r1 = 4
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L35
            boolean r0 = r6.L(r10)
            if (r0 == 0) goto L1b
            if (r13 != 0) goto L29
            ajcz r0 = defpackage.aixj.d
            boolean r0 = r7.j(r8, r4, r0)
            if (r0 == 0) goto L0
            return r3
        L1b:
            if (r13 != 0) goto L29
            if (r12 != 0) goto L21
            r6 = 3
            return r6
        L21:
            boolean r0 = r7.j(r8, r4, r12)
            if (r0 == 0) goto L0
            r6 = 2
            return r6
        L29:
            ajcz r0 = defpackage.aixj.j
            boolean r0 = r7.j(r8, r4, r0)
            if (r0 == 0) goto L0
            r7.g(r8, r2)
            return r1
        L35:
            ajcz r5 = defpackage.aixj.e
            if (r0 != r5) goto L42
            ajcz r1 = defpackage.aixj.d
            boolean r0 = r7.j(r8, r0, r1)
            if (r0 == 0) goto L0
            return r3
        L42:
            ajcz r10 = defpackage.aixj.k
            r11 = 5
            if (r0 == r10) goto L7e
            ajcz r12 = defpackage.aixj.h
            if (r0 == r12) goto L7a
            ajcz r12 = defpackage.aixj.l
            if (r0 != r12) goto L56
            r7.h(r8, r4)
            r6.y()
            return r1
        L56:
            boolean r12 = defpackage.aitz.a
            r7.h(r8, r4)
            boolean r12 = r0 instanceof defpackage.aixz
            if (r12 == 0) goto L63
            aixz r0 = (defpackage.aixz) r0
            aiwr r0 = r0.a
        L63:
            boolean r6 = r6.N(r0, r9)
            if (r6 == 0) goto L6f
            ajcz r6 = defpackage.aixj.i
            r7.i(r8, r6)
            return r2
        L6f:
            java.lang.Object r6 = r7.b(r8, r10)
            if (r6 != r10) goto L76
            return r11
        L76:
            r7.g(r8, r3)
            return r11
        L7a:
            r7.h(r8, r4)
            return r11
        L7e:
            r7.h(r8, r4)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixh.E(aixq, int, java.lang.Object, long, java.lang.Object, boolean):int");
    }

    private final long F() {
        return this.g.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x007d, code lost:
    
        r1 = (defpackage.aixq) r1.n();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.aixq G(long r14) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixh.G(long):aixq");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017b, code lost:
    
        I(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x017e, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x000f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void H() {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixh.H():void");
    }

    private final void I(long j) {
        aisw aiswVar = this.h;
        if ((aiswVar.a(j) & 4611686018427387904L) != 0) {
            while ((aiswVar.b & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void J(long r5, defpackage.aixq r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.b
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            ajbv r0 = r7.m()
            aixq r0 = (defpackage.aixq) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.t()
            if (r5 == 0) goto L22
            ajbv r5 = r7.m()
            aixq r5 = (defpackage.aixq) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            aisx r5 = r4.i
        L24:
            java.lang.Object r6 = r5.a
            ajbv r6 = (defpackage.ajbv) r6
            long r0 = r6.b
            long r2 = r7.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L31
            return
        L31:
            boolean r0 = r7.u()
            if (r0 != 0) goto L38
            goto L11
        L38:
            boolean r0 = r5.d(r6, r7)
            if (r0 == 0) goto L48
            boolean r4 = r6.s()
            if (r4 == 0) goto L47
            r6.p()
        L47:
            return
        L48:
            boolean r6 = r7.s()
            if (r6 == 0) goto L24
            r7.p()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixh.J(long, aixq):void");
    }

    private final void K(aiwr aiwrVar, boolean z) {
        if (aiwrVar instanceof aixa) {
            throw null;
        }
        if (aiwrVar instanceof aitf) {
            ((afck) aiwrVar).w(woy.dE(z ? m() : n()));
            return;
        }
        if (aiwrVar instanceof aixw) {
            ((aixw) aiwrVar).a.w(new aixp(new aixn(l())));
            return;
        }
        if (!(aiwrVar instanceof aiwz)) {
            if (aiwrVar instanceof ajdw) {
                ((ajdw) aiwrVar).g(this, aixj.l);
                return;
            } else {
                Objects.toString(aiwrVar);
                throw new IllegalStateException("Unexpected waiter: ".concat(String.valueOf(aiwrVar)));
            }
        }
        aiwz aiwzVar = (aiwz) aiwrVar;
        aitg aitgVar = aiwzVar.b;
        aitgVar.getClass();
        aiwzVar.b = null;
        aiwzVar.a = aixj.l;
        Throwable thL = aiwzVar.c.l();
        if (thL == null) {
            aitgVar.w(false);
            return;
        }
        if (aitz.b) {
            thL = ajcy.a(thL, aitgVar);
        }
        aitgVar.w(woy.dE(thL));
    }

    private final boolean L(long j) {
        return j < F() || j < b() + ((long) this.f);
    }

    private final boolean M() {
        long jF = F();
        return jF == 0 || jF == Long.MAX_VALUE;
    }

    private final boolean N(Object obj, Object obj2) {
        if (obj instanceof ajdw) {
            return ((ajdw) obj).g(this, obj2);
        }
        if (obj instanceof aixw) {
            obj.getClass();
            return aixj.b(((aixw) obj).a, new aixp(obj2));
        }
        if (!(obj instanceof aiwz)) {
            if (obj instanceof aitf) {
                obj.getClass();
                return aixj.b((aitf) obj, obj2);
            }
            Objects.toString(obj);
            throw new IllegalStateException("Unexpected receiver type: ".concat(String.valueOf(obj)));
        }
        obj.getClass();
        aiwz aiwzVar = (aiwz) obj;
        aitg aitgVar = aiwzVar.b;
        aitgVar.getClass();
        aiwzVar.b = null;
        aiwzVar.a = obj2;
        return aixj.b(aitgVar, true);
    }

    private final boolean O(Object obj, aixq aixqVar, int i) {
        if (obj instanceof aitf) {
            obj.getClass();
            return aixj.b((aitf) obj, afak.a);
        }
        if (!(obj instanceof ajdw)) {
            if (obj instanceof aixa) {
                throw null;
            }
            Objects.toString(obj);
            throw new IllegalStateException("Unexpected waiter: ".concat(String.valueOf(obj)));
        }
        obj.getClass();
        int iB = ((ajdw) obj).b(this, afak.a);
        char c = iB != 0 ? iB != 1 ? iB != 2 ? (char) 4 : (char) 3 : (char) 2 : (char) 1;
        if (c != 2) {
            return c == 1;
        }
        aixqVar.h(i, null);
        return false;
    }

    private final Object P(afck afckVar) {
        aitg aitgVar = new aitg(affa.s(afckVar), 1);
        aitgVar.z();
        Throwable thN = n();
        if (aitz.b) {
            thN = ajcy.a(thN, aitgVar);
        }
        aitgVar.w(woy.dE(thN));
        Object objK = aitgVar.k();
        afcr afcrVar = afcr.a;
        if (objK == afcrVar) {
            afckVar.getClass();
        }
        return objK == afcrVar ? objK : afak.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void Q(aitf aitfVar) {
        Throwable thN = n();
        if (aitz.b) {
            thN = ajcy.a(thN, aitfVar);
        }
        aitfVar.w(woy.dE(thN));
    }

    private static final void R(aiwr aiwrVar, aixq aixqVar, int i) {
        aiwrVar.E(aixqVar, i + aixj.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object f(defpackage.aixh r13, defpackage.afck r14) throws java.lang.Throwable {
        /*
            boolean r0 = r14 instanceof defpackage.aixf
            if (r0 == 0) goto L13
            r0 = r14
            aixf r0 = (defpackage.aixf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aixf r0 = new aixf
            r0.<init>(r13, r14)
        L18:
            r6 = r0
            java.lang.Object r14 = r6.a
            afcr r0 = defpackage.afcr.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            defpackage.woy.dF(r14)
            aixp r14 = (defpackage.aixp) r14
            java.lang.Object r13 = r14.b
            return r13
        L2c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L34:
            defpackage.woy.dF(r14)
            aisx r14 = r13.d
            java.lang.Object r14 = r14.a
            aixq r14 = (defpackage.aixq) r14
        L3d:
            boolean r1 = r13.x()
            if (r1 == 0) goto L4d
            java.lang.Throwable r13 = r13.l()
            aixn r14 = new aixn
            r14.<init>(r13)
            return r14
        L4d:
            aisw r1 = r13.b
            long r4 = r1.b()
            int r1 = defpackage.aixj.b
            long r7 = (long) r1
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.b
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 == 0) goto L69
            aixq r1 = r13.o(r9, r14)
            if (r1 == 0) goto L3d
            r8 = r1
            goto L6a
        L69:
            r8 = r14
        L6a:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.k(r8, r9, r10, r12)
            r1 = r7
            ajcz r14 = defpackage.aixj.m
            if (r13 == r14) goto L9c
            ajcz r14 = defpackage.aixj.o
            if (r13 != r14) goto L89
            long r13 = r1.c()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L86
            r8.o()
        L86:
            r13 = r1
            r14 = r8
            goto L3d
        L89:
            ajcz r14 = defpackage.aixj.n
            if (r13 != r14) goto L98
            r6.c = r2
            r2 = r8
            java.lang.Object r13 = r1.g(r2, r3, r4, r6)
            if (r13 != r0) goto L97
            return r0
        L97:
            return r13
        L98:
            r8.o()
            return r13
        L9c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixh.f(aixh, afck):java.lang.Object");
    }

    @Override // defpackage.aixx
    public final aiwz A() {
        return new aiwz(this);
    }

    @Override // defpackage.aixx
    public final ajds B() {
        aixb aixbVar = aixb.a;
        affz.g(aixbVar, 3);
        aixc aixcVar = aixc.a;
        affz.g(aixcVar, 3);
        return new ajds(this, aixbVar, aixcVar);
    }

    @Override // defpackage.aixx
    public final ajds C() {
        aixd aixdVar = aixd.a;
        affz.g(aixdVar, 3);
        aixe aixeVar = aixe.a;
        affz.g(aixeVar, 3);
        return new ajds(this, aixdVar, aixeVar);
    }

    public final void D(ajdw ajdwVar) {
        aixq aixqVar;
        aixh aixhVar;
        ajdw ajdwVar2;
        int i;
        aixq aixqVar2 = (aixq) this.d.a;
        while (!this.x()) {
            long jB = this.b.b();
            long j = aixj.b;
            long j2 = jB / j;
            int i2 = (int) (jB % j);
            if (aixqVar2.b != j2) {
                aixq aixqVarO = this.o(j2, aixqVar2);
                if (aixqVarO != null) {
                    aixqVar = aixqVarO;
                    ajdwVar2 = ajdwVar;
                    i = i2;
                    aixhVar = this;
                } else {
                    continue;
                }
            } else {
                aixqVar = aixqVar2;
                aixhVar = this;
                ajdwVar2 = ajdwVar;
                i = i2;
            }
            Object objK = aixhVar.k(aixqVar, i, jB, ajdwVar2);
            aixqVar2 = aixqVar;
            if (objK == aixj.m) {
                ajdw ajdwVar3 = true != (ajdwVar2 instanceof aiwr) ? null : ajdwVar2;
                if (ajdwVar3 != null) {
                    ajdwVar3.E(aixqVar2, i);
                    return;
                }
                return;
            }
            if (objK != aixj.o) {
                if (objK == aixj.n) {
                    throw new IllegalStateException("unexpected");
                }
                aixqVar2.o();
                ajdwVar2.b = objK;
                return;
            }
            if (jB < aixhVar.c()) {
                aixqVar2.o();
            }
            this = aixhVar;
            ajdwVar = ajdwVar2;
        }
        ajdwVar.b = aixj.l;
    }

    public final int a(aixq aixqVar, int i, Object obj, long j, Object obj2, boolean z) {
        aixqVar.h(i, obj);
        if (z) {
            return E(aixqVar, i, obj, j, obj2, true);
        }
        Object objD = aixqVar.d(i);
        if (objD == null) {
            if (L(j)) {
                if (aixqVar.j(i, null, aixj.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (aixqVar.j(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objD instanceof aiwr) {
            aixqVar.h(i, null);
            if (N(objD, obj)) {
                aixqVar.i(i, aixj.i);
                return 0;
            }
            ajcz ajczVar = aixj.k;
            if (aixqVar.b(i, ajczVar) == ajczVar) {
                return 5;
            }
            aixqVar.g(i, true);
            return 5;
        }
        return E(aixqVar, i, obj, j, obj2, false);
    }

    public final long b() {
        return this.b.b;
    }

    public final long c() {
        return this.a.b & 1152921504606846975L;
    }

    @Override // defpackage.aixx
    public final Object d(afck afckVar) throws Throwable {
        aixh aixhVar = this;
        aisx aisxVar = aixhVar.d;
        aixq aixqVar = (aixq) aisxVar.a;
        while (!aixhVar.x()) {
            aisw aiswVar = aixhVar.b;
            long jB = aiswVar.b();
            long j = aixj.b;
            long j2 = jB / j;
            int i = (int) (jB % j);
            if (aixqVar.b != j2) {
                aixq aixqVarO = aixhVar.o(j2, aixqVar);
                if (aixqVarO != null) {
                    aixqVar = aixqVarO;
                } else {
                    continue;
                }
            }
            Object objK = aixhVar.k(aixqVar, i, jB, null);
            ajcz ajczVar = aixj.m;
            if (objK == ajczVar) {
                throw new IllegalStateException("unexpected");
            }
            ajcz ajczVar2 = aixj.o;
            if (objK == ajczVar2) {
                if (jB < c()) {
                    aixqVar.o();
                }
                aixhVar = this;
            } else {
                ajcz ajczVar3 = aixj.n;
                if (objK != ajczVar3) {
                    aixqVar.o();
                    return objK;
                }
                aitg aitgVarA = ahne.a(affa.s(afckVar));
                aixh aixhVar2 = this;
                try {
                    Object objK2 = aixhVar2.k(aixqVar, i, jB, aitgVarA);
                    if (objK2 == ajczVar) {
                        aitgVarA.E(aixqVar, i);
                    } else if (objK2 == ajczVar2) {
                        if (jB < aixhVar2.c()) {
                            aixqVar.o();
                        }
                        aixq aixqVar2 = (aixq) aisxVar.a;
                        while (true) {
                            if (aixhVar2.x()) {
                                aitgVarA.w(woy.dE(aixhVar2.m()));
                                break;
                            }
                            long jB2 = aiswVar.b();
                            long j3 = jB2 / j;
                            aitg aitgVar = aitgVarA;
                            try {
                                int i2 = (int) (jB2 % j);
                                if (aixqVar2.b != j3) {
                                    aixq aixqVarO2 = aixhVar2.o(j3, aixqVar2);
                                    if (aixqVarO2 != null) {
                                        aixqVar2 = aixqVarO2;
                                    } else {
                                        aitgVarA = aitgVar;
                                    }
                                }
                                aitgVarA = aitgVar;
                                Object objK3 = aixhVar2.k(aixqVar2, i2, jB2, aitgVarA);
                                if (objK3 == ajczVar) {
                                    aitgVarA.E(aixqVar2, i2);
                                    break;
                                }
                                if (objK3 == ajczVar2) {
                                    if (jB2 < c()) {
                                        aixqVar2.o();
                                    }
                                    aixhVar2 = this;
                                } else {
                                    if (objK3 == ajczVar3) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    aixqVar2.o();
                                    aitgVarA.e(objK3, null);
                                }
                            } catch (Throwable th) {
                                th = th;
                                aitgVarA = aitgVar;
                                aitgVarA.B();
                                throw th;
                            }
                        }
                    } else {
                        aixqVar.o();
                        aitgVarA.e(objK2, null);
                    }
                    Object objK4 = aitgVarA.k();
                    afcr afcrVar = afcr.a;
                    return objK4;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        throw ajcy.b(m());
    }

    @Override // defpackage.aixx
    public final Object e(afck afckVar) {
        return f(this, afckVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.aixq r17, int r18, long r19, defpackage.afck r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixh.g(aixq, int, long, afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012e A[RETURN] */
    @Override // defpackage.aixy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(java.lang.Object r22, defpackage.afck r23) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixh.h(java.lang.Object, afck):java.lang.Object");
    }

    @Override // defpackage.aixx
    public final Object i() {
        aixq aixqVar;
        aisw aiswVar = this.b;
        long j = aiswVar.b;
        long j2 = this.a.b;
        if (w(j2, true)) {
            return new aixn(l());
        }
        if (j >= (j2 & 1152921504606846975L)) {
            return aixp.a;
        }
        aisx aisxVar = this.d;
        ajcz ajczVar = aixj.k;
        aixq aixqVar2 = (aixq) aisxVar.a;
        while (!this.x()) {
            long jB = aiswVar.b();
            long j3 = aixj.b;
            long j4 = jB / j3;
            int i = (int) (jB % j3);
            if (aixqVar2.b != j4) {
                aixq aixqVarO = this.o(j4, aixqVar2);
                if (aixqVarO != null) {
                    aixqVar = aixqVarO;
                } else {
                    continue;
                }
            } else {
                aixqVar = aixqVar2;
            }
            aixh aixhVar = this;
            Object objK = aixhVar.k(aixqVar, i, jB, ajczVar);
            aixqVar2 = aixqVar;
            if (objK == aixj.m) {
                aixhVar.t(jB);
                aixqVar2.r();
                return aixp.a;
            }
            if (objK != aixj.o) {
                if (objK == aixj.n) {
                    throw new IllegalStateException("unexpected");
                }
                aixqVar2.o();
                return objK;
            }
            if (jB < aixhVar.c()) {
                aixqVar2.o();
            }
            this = aixhVar;
        }
        return new aixn(this.l());
    }

    @Override // defpackage.aixy
    public Object j(Object obj) {
        aixh aixhVar = this;
        aisw aiswVar = aixhVar.a;
        long j = aiswVar.b;
        if (!aixhVar.w(j, false) && !aixhVar.L(j & 1152921504606846975L)) {
            return aixp.a;
        }
        aisx aisxVar = aixhVar.c;
        ajcz ajczVar = aixj.j;
        aixq aixqVar = (aixq) aisxVar.a;
        while (true) {
            long jB = aiswVar.b();
            long j2 = jB & 1152921504606846975L;
            boolean zW = aixhVar.w(jB, false);
            long j3 = aixj.b;
            long j4 = j2 / j3;
            int i = (int) (j2 % j3);
            if (aixqVar.b != j4) {
                aixq aixqVarP = aixhVar.p(j4, aixqVar);
                if (aixqVarP != null) {
                    aixqVar = aixqVarP;
                } else if (zW) {
                    return new aixn(aixhVar.n());
                }
            }
            int iA = aixhVar.a(aixqVar, i, obj, j2, ajczVar, zW);
            if (iA == 0) {
                aixqVar.o();
                return afak.a;
            }
            if (iA == 1) {
                return afak.a;
            }
            if (iA == 2) {
                if (zW) {
                    aixqVar.r();
                    return new aixn(n());
                }
                aixqVar.r();
                return aixp.a;
            }
            if (iA == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iA == 4) {
                if (j2 < b()) {
                    aixqVar.o();
                }
                return new aixn(n());
            }
            aixqVar.o();
            aixhVar = this;
        }
    }

    public final Object k(aixq aixqVar, int i, long j, Object obj) {
        Object objD = aixqVar.d(i);
        if (objD == null) {
            if (j >= (this.a.b & 1152921504606846975L)) {
                if (obj == null) {
                    return aixj.n;
                }
                if (aixqVar.j(i, null, obj)) {
                    H();
                    return aixj.m;
                }
            }
        } else if (objD == aixj.d && aixqVar.j(i, objD, aixj.i)) {
            H();
            return aixqVar.e(i);
        }
        while (true) {
            Object objD2 = aixqVar.d(i);
            if (objD2 == null || objD2 == aixj.e) {
                if (j < (this.a.b & 1152921504606846975L)) {
                    if (aixqVar.j(i, objD2, aixj.h)) {
                        H();
                        return aixj.o;
                    }
                } else {
                    if (obj == null) {
                        return aixj.n;
                    }
                    if (aixqVar.j(i, objD2, obj)) {
                        H();
                        return aixj.m;
                    }
                }
            } else if (objD2 != aixj.d) {
                ajcz ajczVar = aixj.j;
                if (objD2 == ajczVar) {
                    return aixj.o;
                }
                if (objD2 == aixj.h) {
                    return aixj.o;
                }
                if (objD2 == aixj.l) {
                    H();
                    return aixj.o;
                }
                if (objD2 != aixj.g && aixqVar.j(i, objD2, aixj.f)) {
                    boolean z = objD2 instanceof aixz;
                    if (z) {
                        objD2 = ((aixz) objD2).a;
                    }
                    if (O(objD2, aixqVar, i)) {
                        aixqVar.i(i, aixj.i);
                        H();
                        return aixqVar.e(i);
                    }
                    aixqVar.i(i, ajczVar);
                    aixqVar.g(i, false);
                    if (z) {
                        H();
                    }
                    return aixj.o;
                }
            } else if (aixqVar.j(i, objD2, aixj.i)) {
                H();
                return aixqVar.e(i);
            }
        }
    }

    protected final Throwable l() {
        return (Throwable) this.j.a;
    }

    public final Throwable m() {
        Throwable thL = l();
        return thL == null ? new aixr() : thL;
    }

    protected final Throwable n() {
        Throwable thL = l();
        return thL == null ? new aixs("Channel was closed") : thL;
    }

    public final aixq o(long j, aixq aixqVar) {
        Object objA;
        long j2;
        long j3;
        aixq aixqVar2 = aixj.a;
        aixi aixiVar = aixi.a;
        loop0: while (true) {
            objA = ajbu.a(aixqVar, j, aixiVar);
            if (!ajcx.a(objA)) {
                ajbv ajbvVarB = ajcx.b(objA);
                while (true) {
                    aisx aisxVar = this.d;
                    ajbv ajbvVar = (ajbv) aisxVar.a;
                    if (ajbvVar.b >= ajbvVarB.b) {
                        break loop0;
                    }
                    if (!ajbvVarB.u()) {
                        break;
                    }
                    if (aisxVar.d(ajbvVar, ajbvVarB)) {
                        if (ajbvVar.s()) {
                            ajbvVar.p();
                        }
                    } else if (ajbvVarB.s()) {
                        ajbvVarB.p();
                    }
                }
            } else {
                break;
            }
        }
        if (ajcx.a(objA)) {
            y();
            if (aixqVar.b * aixj.b >= c()) {
                return null;
            }
            aixqVar.o();
            return null;
        }
        aixq aixqVar3 = (aixq) ajcx.b(objA);
        if (!M() && j <= F() / aixj.b) {
            aisx aisxVar2 = this.i;
            while (true) {
                ajbv ajbvVar2 = (ajbv) aisxVar2.a;
                if (ajbvVar2.b >= aixqVar3.b || !aixqVar3.u()) {
                    break;
                }
                if (aisxVar2.d(ajbvVar2, aixqVar3)) {
                    if (ajbvVar2.s()) {
                        ajbvVar2.p();
                    }
                } else if (aixqVar3.s()) {
                    aixqVar3.p();
                }
            }
        }
        long j4 = aixqVar3.b;
        if (j4 <= j) {
            boolean z = aitz.a;
            return aixqVar3;
        }
        long j5 = aixj.b;
        aisw aiswVar = this.b;
        do {
            j2 = j4 * j5;
            j3 = aiswVar.b;
            if (j3 >= j2) {
                break;
            }
        } while (!aiswVar.c(j3, j2));
        if (j2 >= c()) {
            return null;
        }
        aixqVar3.o();
        return null;
    }

    public final aixq p(long j, aixq aixqVar) {
        Object objA;
        long j2;
        long j3;
        long j4;
        aixq aixqVar2 = aixj.a;
        aixi aixiVar = aixi.a;
        loop0: while (true) {
            objA = ajbu.a(aixqVar, j, aixiVar);
            if (!ajcx.a(objA)) {
                ajbv ajbvVarB = ajcx.b(objA);
                while (true) {
                    aisx aisxVar = this.c;
                    ajbv ajbvVar = (ajbv) aisxVar.a;
                    if (ajbvVar.b >= ajbvVarB.b) {
                        break loop0;
                    }
                    if (!ajbvVarB.u()) {
                        break;
                    }
                    if (aisxVar.d(ajbvVar, ajbvVarB)) {
                        if (ajbvVar.s()) {
                            ajbvVar.p();
                        }
                    } else if (ajbvVarB.s()) {
                        ajbvVarB.p();
                    }
                }
            } else {
                break;
            }
        }
        if (ajcx.a(objA)) {
            y();
            if (aixqVar.b * aixj.b >= b()) {
                return null;
            }
            aixqVar.o();
            return null;
        }
        aixq aixqVar3 = (aixq) ajcx.b(objA);
        long j5 = aixqVar3.b;
        if (j5 <= j) {
            boolean z = aitz.a;
            return aixqVar3;
        }
        long j6 = aixj.b;
        aisw aiswVar = this.a;
        do {
            j2 = j5 * j6;
            j3 = aiswVar.b;
            j4 = 1152921504606846975L & j3;
            if (j4 >= j2) {
                break;
            }
        } while (!aiswVar.c(j3, aixj.a(j4, (int) (j3 >> 60))));
        if (j2 >= b()) {
            return null;
        }
        aixqVar3.o();
        return null;
    }

    protected final void q(long j) {
        aixq aixqVar;
        boolean z = aitz.a;
        aixq aixqVar2 = (aixq) this.d.a;
        while (true) {
            aisw aiswVar = this.b;
            int i = this.f;
            long j2 = aiswVar.b;
            if (j < Math.max(i + j2, this.F())) {
                return;
            }
            if (aiswVar.c(j2, 1 + j2)) {
                long j3 = aixj.b;
                long j4 = j2 / j3;
                int i2 = (int) (j2 % j3);
                if (aixqVar2.b != j4) {
                    aixq aixqVarO = this.o(j4, aixqVar2);
                    if (aixqVarO != null) {
                        aixqVar = aixqVarO;
                    }
                } else {
                    aixqVar = aixqVar2;
                }
                aixh aixhVar = this;
                if (aixhVar.k(aixqVar, i2, j2, null) != aixj.o || j2 < aixhVar.c()) {
                    aixqVar.o();
                }
                this = aixhVar;
                aixqVar2 = aixqVar;
            }
            this = this;
        }
    }

    @Override // defpackage.aixy
    public final void r(afec afecVar) {
        ajcz ajczVar;
        aisx aisxVar = this.k;
        if (aisxVar.d(null, afecVar)) {
            return;
        }
        do {
            Object obj = aisxVar.a;
            ajczVar = aixj.q;
            if (obj != ajczVar) {
                if (obj == aixj.r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                Objects.toString(obj);
                throw new IllegalStateException("Another handler is already registered: ".concat(String.valueOf(obj)));
            }
        } while (!aisxVar.d(ajczVar, aixj.r));
        afecVar.invoke(l());
    }

    @Override // defpackage.aixx
    public final void s(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        v(cancellationException, true);
    }

    public final void t(long j) {
        long j2;
        long j3;
        if (M()) {
            return;
        }
        while (F() <= j) {
        }
        int i = aixj.c;
        for (int i2 = 0; i2 < i; i2++) {
            long jF = F();
            if (jF == (4611686018427387903L & this.h.b) && jF == F()) {
                return;
            }
        }
        aisw aiswVar = this.h;
        do {
            j2 = aiswVar.b;
        } while (!aiswVar.c(j2, (j2 & 4611686018427387903L) + 4611686018427387904L));
        while (true) {
            long jF2 = F();
            long j4 = aiswVar.b;
            long j5 = j4 & 4611686018427387903L;
            long j6 = j4 & 4611686018427387904L;
            if (jF2 == j5 && jF2 == F()) {
                break;
            } else if (j6 == 0) {
                aiswVar.c(j4, j5 + 4611686018427387904L);
            }
        }
        do {
            j3 = aiswVar.b;
        } while (!aiswVar.c(j3, j3 & 4611686018427387903L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x019d, code lost:
    
        r3 = (defpackage.aixq) r3.m();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixh.toString():java.lang.String");
    }

    @Override // defpackage.aixy
    public final boolean u(Throwable th) {
        return v(th, false);
    }

    protected final boolean v(Throwable th, boolean z) {
        long j;
        long jA;
        Object obj;
        long j2;
        long j3;
        if (z) {
            aisw aiswVar = this.a;
            do {
                j3 = aiswVar.b;
                if (((int) (j3 >> 60)) != 0) {
                    break;
                }
            } while (!aiswVar.c(j3, aixj.a(j3 & 1152921504606846975L, 1)));
        }
        boolean zD = this.j.d(aixj.s, th);
        aisw aiswVar2 = this.a;
        if (z) {
            do {
                j2 = aiswVar2.b;
            } while (!aiswVar2.c(j2, aixj.a(j2 & 1152921504606846975L, 3)));
        } else {
            do {
                j = aiswVar2.b;
                int i = (int) (j >> 60);
                if (i == 0) {
                    jA = aixj.a(j & 1152921504606846975L, 2);
                } else {
                    if (i != 1) {
                        break;
                    }
                    jA = aixj.a(j & 1152921504606846975L, 3);
                }
            } while (!aiswVar2.c(j, jA));
        }
        y();
        if (zD) {
            aisx aisxVar = this.k;
            do {
                obj = aisxVar.a;
            } while (!aisxVar.d(obj, obj == null ? aixj.q : aixj.r));
            if (obj != null) {
                affz.g(obj, 1);
                ((afec) obj).invoke(l());
                return true;
            }
        }
        return zD;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x009e, code lost:
    
        r12 = (defpackage.aixq) r12.n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0107, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w(long r12, boolean r14) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixh.w(long, boolean):boolean");
    }

    public final boolean x() {
        return w(this.a.b, true);
    }

    @Override // defpackage.aixy
    public final boolean y() {
        return w(this.a.b, false);
    }

    protected boolean z() {
        return false;
    }
}
