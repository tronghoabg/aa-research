package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class bby implements defpackage.aqk {
    public final defpackage.bwx A;
    public final defpackage.bwx B;
    public final defpackage.byj C;
    public final defpackage.kwv D;
    private final boolean E;
    private final defpackage.bwx F;
    private final defpackage.bwx G;
    private final defpackage.byj H;
    private final defpackage.izq I;
    private final defpackage.bwx a;
    private final defpackage.aqk b;
    public boolean c;
    public defpackage.bbo d;
    public final defpackage.bbq e;
    public int f;
    public int g;
    public long h;
    public long i;
    public float j;
    public float k;
    public int l;
    public int m;
    public final defpackage.bwx n;
    public defpackage.dlo o;
    public int p;
    public final defpackage.ask q;
    public final defpackage.bys r;
    public final defpackage.azy s;
    public final defpackage.bbd t;
    public final defpackage.ayl u;
    public final defpackage.bwx v;
    public final defpackage.cvb w;
    public final defpackage.azv x;
    public final defpackage.bwx y;
    public final defpackage.bwx z;

    public bby(int i, float f) {
        double d = f;
        if (d < -0.5d || d > 0.5d) {
            defpackage.asq.c("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        defpackage.cji cjiVar = new defpackage.cji(0L);
        defpackage.bxv bxvVar = defpackage.bxv.c;
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableState(cjiVar, bxvVar);
        defpackage.bbq bbqVar = new defpackage.bbq(i, f, this);
        this.e = bbqVar;
        this.f = i;
        this.h = Long.MAX_VALUE;
        this.b = new defpackage.ano(new defpackage.bbs(this, 0));
        this.E = true;
        defpackage.bbo bboVar = defpackage.bca.b;
        defpackage.bxv bxvVar2 = defpackage.bxv.b;
        this.n = new androidx.compose.runtime.ParcelableSnapshotMutableState(bboVar, bxvVar2);
        this.o = defpackage.bca.a;
        this.q = new defpackage.asl();
        this.H = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(-1);
        this.C = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(i);
        defpackage.bav bavVar = new defpackage.bav(this, 3);
        defpackage.lam lamVar = defpackage.byp.a;
        this.r = new defpackage.bvr(bavVar, bxvVar);
        new defpackage.bvr(new defpackage.bav(this, 4), bxvVar);
        defpackage.azy azyVar = new defpackage.azy(new defpackage.bbs(this, 2));
        this.s = azyVar;
        defpackage.izq izqVar = new defpackage.izq(this);
        this.I = izqVar;
        this.t = new defpackage.bbd(izqVar, azyVar, new defpackage.bav(this, 5));
        this.D = new defpackage.kwv((byte[]) null, (char[]) null);
        this.u = new defpackage.ayl();
        this.v = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, bxvVar);
        this.w = new defpackage.bbv(this, 0);
        defpackage.dln.d(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
        this.x = new defpackage.azv();
        defpackage.azt aztVar = bbqVar.d;
        defpackage.afbk afbkVar = defpackage.afbk.a;
        this.y = new androidx.compose.runtime.ParcelableSnapshotMutableState(afbkVar, bxvVar2);
        this.z = new androidx.compose.runtime.ParcelableSnapshotMutableState(afbkVar, bxvVar2);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.F = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar);
        this.G = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar);
        this.A = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar);
        this.B = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar);
    }

    private final void C(int i) {
        this.H.h(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        if (r8.e(r6, r7, r0) == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [bby, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v1, types: [affg] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [aqk] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object q(defpackage.bby r5, defpackage.akv r6, defpackage.affg r7, defpackage.afdk r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.bbw
            if (r0 == 0) goto L13
            r0 = r8
            bbw r0 = (defpackage.bbw) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            bbw r0 = new bbw
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.c
            afdr r1 = defpackage.afdr.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r5 = r0.a
            defpackage.afga.cz(r8)
            goto L73
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r7 = r0.b
            akv r6 = r0.f
            java.lang.Object r5 = r0.a
            defpackage.afga.cz(r8)
            goto L4f
        L3e:
            defpackage.afga.cz(r8)
            r0.a = r5
            r0.f = r6
            r0.b = r7
            r0.e = r4
            java.lang.Object r8 = r5.p(r0)
            if (r8 == r1) goto L7c
        L4f:
            r8 = r5
            bby r8 = (defpackage.bby) r8
            boolean r2 = r8.i()
            if (r2 != 0) goto L61
            int r2 = r8.j()
            byj r4 = r8.C
            r4.h(r2)
        L61:
            aqk r8 = r8.b
            r0.a = r5
            r2 = 0
            r0.f = r2
            r0.b = r2
            r0.e = r3
            java.lang.Object r6 = r8.e(r6, r7, r0)
            if (r6 != r1) goto L73
            goto L7c
        L73:
            bby r5 = (defpackage.bby) r5
            r6 = -1
            r5.C(r6)
            afbk r5 = defpackage.afbk.a
            return r5
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bby.q(bby, akv, affg, afdk):java.lang.Object");
    }

    public final void A(int i) {
        C(f(i));
    }

    public final defpackage.cxl B() {
        return (defpackage.cxl) this.v.a();
    }

    @Override // defpackage.aqk
    public final float a(float f) {
        return this.b.a(f);
    }

    public abstract int b();

    public final float c() {
        return this.e.a();
    }

    public final float d() {
        defpackage.dlo dloVar = this.o;
        defpackage.bbz bbzVar = defpackage.bca.a;
        return java.lang.Math.min(dloVar.dI(56.0f), k() / 2.0f) / k();
    }

    @Override // defpackage.aqk
    public final java.lang.Object e(defpackage.akv akvVar, defpackage.affg affgVar, defpackage.afdk afdkVar) {
        return q(this, akvVar, affgVar, afdkVar);
    }

    public final int f(int i) {
        if (b() > 0) {
            return defpackage.afqt.g(i, 0, b() - 1);
        }
        return 0;
    }

    @Override // defpackage.aqk
    public final boolean g() {
        return ((java.lang.Boolean) this.G.a()).booleanValue();
    }

    @Override // defpackage.aqk
    public final boolean h() {
        return ((java.lang.Boolean) this.F.a()).booleanValue();
    }

    @Override // defpackage.aqk
    public final boolean i() {
        return this.b.i();
    }

    public final int j() {
        return this.e.b();
    }

    public final int k() {
        return ((defpackage.bbo) this.n.a()).b;
    }

    public final int l() {
        return k() + m();
    }

    public final int m() {
        return ((defpackage.bbo) this.n.a()).c;
    }

    public final int n() {
        return this.H.e();
    }

    public final long o() {
        return ((defpackage.cji) this.a.a()).a;
    }

    public final java.lang.Object p(defpackage.afdk afdkVar) {
        java.lang.Object objF;
        return (this.n.a() == defpackage.bca.b && (objF = this.u.f(afdkVar)) == defpackage.afdr.a) ? objF : defpackage.afbk.a;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x02da A[Catch: all -> 0x0502, TryCatch #0 {all -> 0x0502, blocks: (B:123:0x0274, B:127:0x0288, B:130:0x0291, B:133:0x029e, B:135:0x02aa, B:144:0x02e1, B:146:0x02fc, B:148:0x0315, B:150:0x032f, B:152:0x033a, B:154:0x0343, B:156:0x034f, B:157:0x0354, B:159:0x035f, B:160:0x0373, B:162:0x0381, B:164:0x0390, B:167:0x039c, B:171:0x03a3, B:172:0x03a6, B:207:0x04a6, B:209:0x04ac, B:213:0x04c5, B:214:0x04cb, B:173:0x03af, B:174:0x03b4, B:175:0x03b5, B:176:0x03e2, B:178:0x0402, B:180:0x040d, B:182:0x0416, B:184:0x0421, B:187:0x0426, B:189:0x0431, B:190:0x0443, B:191:0x044b, B:192:0x044e, B:194:0x0459, B:197:0x0464, B:201:0x046b, B:202:0x046e, B:203:0x0477, B:204:0x047c, B:205:0x047d, B:141:0x02da, B:138:0x02c2), top: B:228:0x0274 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x02e0  */
    public final void r(defpackage.bbo bboVar, boolean z, boolean z2) {
        int i;
        java.lang.Object obj;
        boolean z3;
        float f;
        char c;
        long j;
        java.util.List list = bboVar.a;
        this.s.c = list.size();
        this.p = bboVar.b + bboVar.c;
        if (z) {
            this.c = true;
        } else if (this.c) {
            this.d = bboVar;
            return;
        }
        defpackage.bbq bbqVar = this.e;
        float f2 = 0.0f;
        if (z2) {
            bbqVar.d(bboVar.k);
        } else {
            defpackage.bba bbaVar = bboVar.j;
            bbqVar.c = bbaVar != null ? bbaVar.d : null;
            if (bbqVar.b || !list.isEmpty()) {
                bbqVar.b = true;
                bbqVar.e(bbaVar != null ? bbaVar.a : 0, bboVar.k);
            }
            if (this.E) {
                defpackage.bbd bbdVar = this.t;
                defpackage.epq epqVar = bbdVar.c;
                epqVar.a = bboVar;
                epqVar.b = bbdVar.b;
                defpackage.bah bahVar = (defpackage.bah) bbdVar.a;
                bahVar.d();
                if (!bahVar.c) {
                    bahVar.l = true;
                    bahVar.c = true;
                }
                int i2 = bahVar.b;
                if (i2 != -1 && i2 != epqVar.h()) {
                    bahVar.l = true;
                    if (epqVar.n()) {
                        int iH = epqVar.i().a.isEmpty() ? -1 : epqVar.h() - 1;
                        int iB = bahVar.b();
                        for (int i3 = 0; i3 < iB; i3++) {
                            int[] iArr = bahVar.d;
                            int i4 = iArr[i3];
                            if (i4 < 0) {
                                i4 = 0;
                            }
                            iArr[i3] = i4;
                            if (iH != -1) {
                                int[] iArr2 = bahVar.e;
                                int i5 = iArr2[i3];
                                if (i5 > iH) {
                                    i5 = iH;
                                }
                                iArr2[i3] = i5;
                            }
                        }
                        if (bahVar.a <= 0.0f) {
                            bahVar.e(epqVar.g() + 1, bahVar.m - 1);
                        } else {
                            bahVar.e(0, epqVar.f() - 1);
                        }
                    }
                }
                bahVar.m = epqVar.h();
                if (epqVar.n()) {
                    int size = epqVar.i().o.size() + epqVar.i().a.size() + epqVar.i().p.size();
                    int i6 = 0;
                    while (i6 < size) {
                        int size2 = epqVar.i().o.size();
                        int size3 = epqVar.i().a.size();
                        if (i6 < size2) {
                            i = ((defpackage.bba) epqVar.i().o.get(i6)).a;
                        } else if (i6 < size2 || i6 >= size2 + size3) {
                            i = i6 >= size2 + size3 ? ((defpackage.bba) epqVar.i().p.get((i6 - size2) - size3)).a : -1;
                        } else {
                            i = ((defpackage.bba) epqVar.i().a.get(i6 - size2)).a;
                        }
                        int size4 = epqVar.i().o.size();
                        int size5 = epqVar.i().a.size();
                        if (i6 < size4) {
                            obj = ((defpackage.bba) epqVar.i().o.get(i6)).d;
                        } else if (i6 < size4 || i6 >= size4 + size5) {
                            obj = i6 >= size4 + size5 ? ((defpackage.bba) epqVar.i().p.get((i6 - size4) - size5)).d : defpackage.ayn.c;
                        } else {
                            obj = ((defpackage.bba) epqVar.i().a.get(i6 - size4)).d;
                        }
                        int i7 = epqVar.i().b;
                        if (i != -1) {
                            defpackage.zo zoVar = bahVar.o;
                            if (zoVar.b(i)) {
                                java.lang.Object objA = zoVar.a(i);
                                objA.getClass();
                                int i8 = ((defpackage.ayn) objA).b;
                                java.lang.Object objA2 = zoVar.a(i);
                                objA2.getClass();
                                java.lang.Object obj2 = ((defpackage.ayn) objA2).a;
                                if (i8 != i7 || !defpackage.afga.f(obj2, obj)) {
                                    bahVar.l = true;
                                }
                            }
                            zoVar.g(i, bahVar.c(i, i7, obj));
                            int[] iArr3 = bahVar.d;
                            iArr3[0] = java.lang.Math.min(iArr3[0], i);
                            int[] iArr4 = bahVar.e;
                            iArr4[0] = java.lang.Math.max(iArr4[0], i);
                            java.util.List list2 = (java.util.List) bahVar.n.d(i);
                            if (list2 != null) {
                                int size6 = list2.size();
                                for (int i9 = 0; i9 < size6; i9++) {
                                    ((defpackage.azx) list2.get(i9)).a();
                                }
                            }
                        }
                        i6++;
                    }
                    if (bahVar.l) {
                        epqVar.q();
                        bahVar.i(epqVar, 0, 0.0f, bahVar.a <= 0.0f);
                        bahVar.l = false;
                    }
                } else {
                    bahVar.a();
                }
                bahVar.b = epqVar.h();
            }
        }
        this.n.b(bboVar);
        this.F.b(java.lang.Boolean.valueOf(bboVar.m));
        defpackage.bba bbaVar2 = bboVar.i;
        this.G.b(java.lang.Boolean.valueOf(((bbaVar2 == null || bbaVar2.a == 0) && bboVar.l == 0) ? false : true));
        if (bbaVar2 != null) {
            this.f = bbaVar2.a;
        }
        this.g = bboVar.l;
        defpackage.cej cejVar = (defpackage.cej) defpackage.cer.i.j();
        defpackage.affc affcVarI = cejVar != null ? cejVar.i() : null;
        defpackage.cej cejVarH = defpackage.bzd.h(cejVar);
        try {
            char c2 = ' ';
            long j2 = 4294967295L;
            if (this.E && bboVar.h < b() && java.lang.Math.abs(this.k) > 0.5f) {
                float f3 = this.k;
                if (w().e == defpackage.apn.a) {
                    if (java.lang.Math.signum(f3) != java.lang.Math.signum(-java.lang.Float.intBitsToFloat((int) (o() & 4294967295L)))) {
                        if (!v()) {
                            defpackage.bzd.k(cejVar, cejVarH, affcVarI);
                            c = ' ';
                            j = 4294967295L;
                        }
                    }
                } else if (java.lang.Math.signum(f3) != java.lang.Math.signum(-java.lang.Float.intBitsToFloat((int) (o() >> 32)))) {
                    if (!v()) {
                        defpackage.bzd.k(cejVar, cejVarH, affcVarI);
                        c = ' ';
                        j = 4294967295L;
                    }
                }
                defpackage.bbd bbdVar2 = this.t;
                float f4 = this.k;
                defpackage.epq epqVar2 = bbdVar2.c;
                epqVar2.a = bboVar;
                epqVar2.b = bbdVar2.b;
                float f5 = -f4;
                defpackage.aym aymVar = bbdVar2.a;
                ((defpackage.bah) aymVar).d();
                if (epqVar2.n()) {
                    epqVar2.q();
                    epqVar2.p();
                    z3 = true;
                    ((defpackage.bah) aymVar).m = epqVar2.h();
                    int iH2 = epqVar2.h();
                    if (f5 <= 0.0f) {
                        epqVar2.j(((defpackage.bah) aymVar).h);
                        epqVar2.m(((defpackage.bah) aymVar).j);
                        int iB2 = ((defpackage.bah) aymVar).b();
                        int i10 = 0;
                        while (i10 < iB2) {
                            ((defpackage.bah) aymVar).f[i10] = -((defpackage.bah) aymVar).j[i10];
                            ((defpackage.bah) aymVar).d[i10] = ((defpackage.bah) aymVar).h[i10];
                            i10++;
                            f2 = f2;
                            c2 = c2;
                            j2 = j2;
                        }
                        while (true) {
                            int iG = defpackage.axd.g(((defpackage.bah) aymVar).f);
                            if (iG == -1) {
                                break;
                            }
                            int[] iArr5 = ((defpackage.bah) aymVar).f;
                            if (iArr5[iG] <= 0) {
                                break;
                            }
                            f2 = f2;
                            int i11 = ((defpackage.bah) aymVar).d[iG] - 1;
                            if (i11 == -1) {
                                iArr5[iG] = 0;
                            } else {
                                defpackage.zo zoVar2 = ((defpackage.bah) aymVar).o;
                                if (zoVar2.b(i11)) {
                                    java.lang.Object objA3 = zoVar2.a(i11);
                                    objA3.getClass();
                                    ((defpackage.bah) aymVar).g(iG, i11, ((defpackage.ayn) objA3).b);
                                } else {
                                    ((defpackage.bah) aymVar).f[iG] = 0;
                                }
                                c2 = c2;
                            }
                        }
                        f = f2;
                        c = c2;
                        int[] iArr6 = ((defpackage.bah) aymVar).d;
                        iArr6.getClass();
                        if (iArr6.length == 0) {
                            throw new java.util.NoSuchElementException();
                        }
                        int i12 = iArr6[0];
                        int iBF = defpackage.afga.bF(iArr6);
                        j = j2;
                        if (iBF > 0) {
                            int i13 = 1;
                            while (true) {
                                int i14 = iArr6[i13];
                                if (i12 > i14) {
                                    i12 = i14;
                                }
                                if (i13 == iBF) {
                                    break;
                                } else {
                                    i13++;
                                }
                            }
                        }
                        ((defpackage.bah) aymVar).e(0, i12 - 1);
                    } else {
                        f = 0.0f;
                        c = ' ';
                        j = 4294967295L;
                        epqVar2.k(((defpackage.bah) aymVar).i);
                        epqVar2.l(((defpackage.bah) aymVar).k);
                        int iB3 = ((defpackage.bah) aymVar).b();
                        for (int i15 = 0; i15 < iB3; i15++) {
                            ((defpackage.bah) aymVar).g[i15] = -((defpackage.bah) aymVar).k[i15];
                            ((defpackage.bah) aymVar).e[i15] = ((defpackage.bah) aymVar).i[i15];
                        }
                        while (true) {
                            int iG2 = defpackage.axd.g(((defpackage.bah) aymVar).g);
                            if (iG2 == -1) {
                                break;
                            }
                            int[] iArr7 = ((defpackage.bah) aymVar).g;
                            if (iArr7[iG2] <= 0) {
                                break;
                            }
                            int i16 = ((defpackage.bah) aymVar).e[iG2];
                            int i17 = i16 + 1;
                            if (i17 == -1 || i16 >= iH2 - 1) {
                                iArr7[iG2] = 0;
                            } else {
                                defpackage.zo zoVar3 = ((defpackage.bah) aymVar).o;
                                if (zoVar3.b(i17)) {
                                    java.lang.Object objA4 = zoVar3.a(i17);
                                    objA4.getClass();
                                    ((defpackage.bah) aymVar).f(iG2, i17, ((defpackage.ayn) objA4).b);
                                } else {
                                    ((defpackage.bah) aymVar).g[iG2] = 0;
                                }
                            }
                        }
                        int[] iArr8 = ((defpackage.bah) aymVar).e;
                        iArr8.getClass();
                        if (iArr8.length == 0) {
                            throw new java.util.NoSuchElementException();
                        }
                        int i18 = iH2 - 1;
                        int i19 = iArr8[0];
                        int iBF2 = defpackage.afga.bF(iArr8);
                        if (iBF2 > 0) {
                            int i20 = 1;
                            while (true) {
                                int i21 = iArr8[i20];
                                if (i19 < i21) {
                                    i19 = i21;
                                }
                                if (i20 == iBF2) {
                                    break;
                                } else {
                                    i20++;
                                }
                            }
                        }
                        ((defpackage.bah) aymVar).e(i19 + 1, i18);
                    }
                } else {
                    z3 = true;
                    f = 0.0f;
                    c = ' ';
                    j = 4294967295L;
                }
                if (epqVar2.n()) {
                    epqVar2.q();
                    defpackage.izq izqVar = ((defpackage.bah) aymVar).p;
                    epqVar2.p();
                    ((defpackage.bah) aymVar).i(epqVar2, ((defpackage.bby) izqVar.a).p, f5, f5 <= f ? z3 : false);
                }
                ((defpackage.bah) aymVar).a = f5;
                defpackage.bzd.k(cejVar, cejVarH, affcVarI);
            } else {
                defpackage.bzd.k(cejVar, cejVarH, affcVarI);
                c = ' ';
                j = 4294967295L;
            }
            this.h = defpackage.bca.a(bboVar, b());
            b();
            long jG = defpackage.afqt.g(0, 0, (int) (bboVar.e == defpackage.apn.b ? bboVar.d() >> c : bboVar.d() & j));
            long j3 = this.h;
            if (jG > j3) {
                jG = j3;
            }
            this.i = jG;
        } catch (java.lang.Throwable th) {
            defpackage.bzd.k(cejVar, cejVarH, affcVarI);
            throw th;
        }
    }

    public final void s(long j) {
        this.a.b(new defpackage.cji(j));
    }

    public final void t(int i, float f, boolean z) {
        defpackage.bbq bbqVar = this.e;
        if (bbqVar.b() != i || bbqVar.a() != f) {
            this.t.a.a();
        }
        bbqVar.e(i, f);
        bbqVar.c = null;
        if (!z) {
            this.z.b(defpackage.afbk.a);
            return;
        }
        defpackage.cxl cxlVarB = B();
        if (cxlVarB != null) {
            cxlVarB.D();
        }
    }

    public final boolean u() {
        return ((java.lang.Boolean) this.A.a()).booleanValue();
    }

    public final boolean v() {
        return ((int) java.lang.Float.intBitsToFloat((int) (o() >> 32))) == 0 && ((int) java.lang.Float.intBitsToFloat((int) (o() & 4294967295L))) == 0;
    }

    public final defpackage.bbo w() {
        return (defpackage.bbo) this.n.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (e(defpackage.akv.a, r5, r0) == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(int r12, defpackage.aej r13, defpackage.afdk r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.bbt
            if (r0 == 0) goto L13
            r0 = r14
            bbt r0 = (defpackage.bbt) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bbt r0 = new bbt
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.b
            afdr r1 = defpackage.afdr.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.afga.cz(r14)
            goto L83
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            int r12 = r0.a
            aga r13 = r0.e
            defpackage.afga.cz(r14)
        L3a:
            r9 = r13
            goto L63
        L3c:
            defpackage.afga.cz(r14)
            int r14 = r11.j()
            if (r12 != r14) goto L4d
            float r14 = r11.c()
            int r14 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r14 == 0) goto L83
        L4d:
            int r14 = r11.b()
            if (r14 == 0) goto L83
            r14 = r13
            aga r14 = (defpackage.aga) r14
            r0.e = r14
            r0.a = r12
            r0.d = r5
            java.lang.Object r14 = r11.p(r0)
            if (r14 != r1) goto L3a
            goto L82
        L63:
            int r7 = r11.f(r12)
            int r12 = r11.l()
            float r12 = (float) r12
            float r8 = r12 * r3
            bbu r5 = new bbu
            r10 = 0
            r6 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r11 = 0
            r0.e = r11
            r0.d = r4
            akv r11 = defpackage.akv.a
            java.lang.Object r11 = r6.e(r11, r5, r0)
            if (r11 != r1) goto L83
        L82:
            return r1
        L83:
            afbk r11 = defpackage.afbk.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bby.x(int, aej, afdk):java.lang.Object");
    }

    public final java.lang.Object z(int i, defpackage.afdk afdkVar) {
        java.lang.Object objE = e(defpackage.akv.a, new defpackage.bbx(this, i, (defpackage.afdk) null, 0), afdkVar);
        return objE == defpackage.afdr.a ? objE : defpackage.afbk.a;
    }
}
