package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class axx implements defpackage.aqk {
    public static final defpackage.cdz q = defpackage.bxi.k(new defpackage.abw(3), new defpackage.awl(6));
    public boolean a;
    public defpackage.axo b;
    public boolean c;
    public final defpackage.axr d;
    public final defpackage.bwx e;
    public final defpackage.ask f;
    public float g;
    public boolean h;
    public final defpackage.cvb i;
    public final defpackage.ayl j;
    public final defpackage.azi k;
    public final defpackage.azy l;
    public final defpackage.azv m;
    public final defpackage.bwx n;
    public final defpackage.bwx o;
    public final defpackage.axe p;
    public defpackage.cxl r;
    public final defpackage.cok s;
    public final defpackage.kwv t;
    private final defpackage.aqk u;
    private int v;
    private boolean w;
    private final defpackage.bwx x;
    private final defpackage.bwx y;
    private final defpackage.izq z;

    public axx(final int i, int i2, defpackage.axe axeVar) {
        this.p = axeVar;
        this.d = new defpackage.axr(i, i2);
        defpackage.axo axoVar = defpackage.axy.a;
        defpackage.bxv bxvVar = defpackage.bxv.b;
        this.e = new androidx.compose.runtime.ParcelableSnapshotMutableState(axoVar, bxvVar);
        this.f = new defpackage.asl();
        this.u = new defpackage.ano(new defpackage.aun(this, 12));
        this.w = true;
        this.i = new defpackage.bbv(this, 1);
        this.j = new defpackage.ayl();
        this.k = new defpackage.azi();
        this.t = new defpackage.kwv((byte[]) null, (char[]) null);
        this.l = new defpackage.azy(new defpackage.affc() { // from class: axs
            @Override // defpackage.affc
            public final java.lang.Object invoke(java.lang.Object obj) {
                defpackage.azw azwVar = (defpackage.azw) obj;
                defpackage.cej cejVar = (defpackage.cej) defpackage.cer.i.j();
                defpackage.bzd.k(cejVar, defpackage.bzd.h(cejVar), cejVar != null ? cejVar.i() : null);
                int i3 = azwVar.a;
                if (i3 == -1) {
                    i3 = 2;
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    azwVar.a(i + i4);
                }
                return defpackage.afbk.a;
            }
        });
        this.z = new defpackage.izq(this);
        this.m = new defpackage.azv();
        defpackage.afbk afbkVar = defpackage.afbk.a;
        this.n = new androidx.compose.runtime.ParcelableSnapshotMutableState(afbkVar, bxvVar);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        defpackage.bxv bxvVar2 = defpackage.bxv.c;
        this.x = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar2);
        this.y = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar2);
        this.o = new androidx.compose.runtime.ParcelableSnapshotMutableState(afbkVar, bxvVar);
        this.s = new defpackage.cok((char[]) null);
    }

    @Override // defpackage.aqk
    public final float a(float f) {
        return this.u.a(f);
    }

    public final int b() {
        return this.d.a();
    }

    public final int c() {
        return this.d.b();
    }

    public final defpackage.dlo d() {
        return ((defpackage.axo) this.e.a()).g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if (r5.e(r6, r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [aqk] */
    /* JADX WARN: Type inference failed for: r7v1, types: [affg] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
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
    @Override // defpackage.aqk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.akv r6, defpackage.affg r7, defpackage.afdk r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.axv
            if (r0 == 0) goto L13
            r0 = r8
            axv r0 = (defpackage.axv) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            axv r0 = new axv
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            afdr r1 = defpackage.afdr.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.afga.cz(r8)
            goto L66
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.lang.Object r7 = r0.a
            akv r6 = r0.e
            defpackage.afga.cz(r8)
            goto L56
        L3a:
            defpackage.afga.cz(r8)
            bwx r8 = r5.e
            java.lang.Object r8 = r8.a()
            axo r2 = defpackage.axy.a
            if (r8 != r2) goto L56
            ayl r8 = r5.j
            r0.e = r6
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = r8.f(r0)
            if (r8 != r1) goto L56
            goto L65
        L56:
            aqk r5 = r5.u
            r8 = 0
            r0.e = r8
            r0.a = r8
            r0.d = r3
            java.lang.Object r5 = r5.e(r6, r7, r0)
            if (r5 != r1) goto L66
        L65:
            return r1
        L66:
            afbk r5 = defpackage.afbk.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axx.e(akv, affg, afdk):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [aiwg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [aiwg, java.lang.Object] */
    public final void f(defpackage.axo axoVar, boolean z, boolean z2) {
        defpackage.axp axpVar;
        this.l.c = axoVar.j.size();
        if (!z && this.a) {
            this.b = axoVar;
            defpackage.cej cejVar = (defpackage.cej) defpackage.cer.i.j();
            defpackage.affc affcVarI = cejVar != null ? cejVar.i() : null;
            defpackage.cej cejVarH = defpackage.bzd.h(cejVar);
            try {
                defpackage.cok cokVar = this.s;
                if (((java.lang.Number) ((defpackage.aek) cokVar.b).a()).floatValue() != 0.0f && (axpVar = axoVar.a) != null) {
                    int i = axpVar.a;
                    defpackage.axr axrVar = this.d;
                    if (i == axrVar.a() && axoVar.b == axrVar.b()) {
                        ?? r0 = cokVar.a;
                        if (r0 != 0) {
                            r0.s((java.util.concurrent.CancellationException) null);
                        }
                        cokVar.b = new defpackage.aek(defpackage.agt.a, java.lang.Float.valueOf(0.0f), null, Long.MIN_VALUE, Long.MIN_VALUE, false);
                    }
                }
                return;
            } finally {
                defpackage.bzd.k(cejVar, cejVarH, affcVarI);
            }
        }
        if (z) {
            this.a = true;
        }
        defpackage.axp axpVar2 = axoVar.a;
        this.y.b(java.lang.Boolean.valueOf(((axpVar2 == null || axpVar2.a == 0) && axoVar.b == 0) ? false : true));
        this.x.b(java.lang.Boolean.valueOf(axoVar.c));
        this.g -= axoVar.d;
        this.e.b(axoVar);
        if (z2) {
            defpackage.axr axrVar2 = this.d;
            int i2 = axoVar.b;
            if (i2 < 0.0f) {
                defpackage.asq.d("scrollOffset should be non-negative");
            }
            axrVar2.d(i2);
        } else {
            java.util.List list = axoVar.j;
            defpackage.axp axpVar3 = (defpackage.axp) defpackage.afga.aB(list);
            defpackage.axp axpVar4 = (defpackage.axp) defpackage.afga.aF(list);
            defpackage.vx.c("firstVisibleItem:index", axpVar3 != null ? axpVar3.a : -1L);
            defpackage.vx.c("lastVisibleItem:index", axpVar4 != null ? axpVar4.a : -1L);
            defpackage.axr axrVar3 = this.d;
            axrVar3.b = axpVar2 != null ? axpVar2.e : null;
            if (axrVar3.a || axoVar.m > 0) {
                axrVar3.a = true;
                int i3 = axoVar.b;
                if (i3 < 0.0f) {
                    defpackage.asq.d("scrollOffset should be non-negative");
                }
                axrVar3.e(axpVar2 != null ? axpVar2.a : 0, i3);
            }
            if (this.w) {
                defpackage.axe axeVar = this.p;
                defpackage.izq izqVar = this.z;
                int i4 = axeVar.a;
                boolean z3 = axeVar.c;
                if (i4 != -1 && !list.isEmpty() && i4 != defpackage.axe.b(axoVar, z3)) {
                    axeVar.a();
                }
                int i5 = axoVar.m;
                int i6 = axeVar.d;
                if (i6 != -1 && axeVar.e != 0.0f && i6 != i5 && !list.isEmpty()) {
                    int iB = defpackage.axe.b(axoVar, axeVar.e < 0.0f);
                    if (iB >= 0 && iB < i5) {
                        axeVar.a = iB;
                        axeVar.b = izqVar.n(iB);
                    }
                }
                axeVar.d = i5;
            }
        }
        if (z) {
            defpackage.cok cokVar2 = this.s;
            float f = axoVar.e;
            defpackage.dlo dloVar = axoVar.g;
            aiuw aiuwVar = axoVar.f;
            if (f > dloVar.dI(1.0f)) {
                defpackage.cej cejVar2 = (defpackage.cej) defpackage.cer.i.j();
                defpackage.affc affcVarI2 = cejVar2 != null ? cejVar2.i() : null;
                defpackage.cej cejVarH2 = defpackage.bzd.h(cejVar2);
                try {
                    float fFloatValue = ((java.lang.Number) ((defpackage.aek) cokVar2.b).a()).floatValue();
                    ?? r12 = cokVar2.a;
                    if (r12 != 0) {
                        r12.s((java.util.concurrent.CancellationException) null);
                    }
                    java.lang.Object obj = cokVar2.b;
                    if (((defpackage.aek) obj).d) {
                        cokVar2.b = defpackage.ca.C((defpackage.aek) obj, fFloatValue - f, 0.0f, 30);
                    } else {
                        cokVar2.b = new defpackage.aek(defpackage.agt.a, java.lang.Float.valueOf(-f), null, Long.MIN_VALUE, Long.MIN_VALUE, false);
                    }
                    cokVar2.a = ahoc.d(aiuwVar, (defpackage.afdo) null, 0, new defpackage.adh(cokVar2, (defpackage.afdk) null, 18), 3);
                    defpackage.bzd.k(cejVar2, cejVarH2, affcVarI2);
                } catch (java.lang.Throwable th) {
                    defpackage.bzd.k(cejVar2, cejVarH2, affcVarI2);
                    throw th;
                }
            }
        }
        this.v++;
    }

    @Override // defpackage.aqk
    public final boolean g() {
        return ((java.lang.Boolean) this.y.a()).booleanValue();
    }

    @Override // defpackage.aqk
    public final boolean h() {
        return ((java.lang.Boolean) this.x.a()).booleanValue();
    }

    @Override // defpackage.aqk
    public final boolean i() {
        return this.u.i();
    }

    public final void j(int i, int i2) {
        if (i()) {
            ahoc.d(((defpackage.axo) this.e.a()).f, (defpackage.afdo) null, 0, new defpackage.adh(this, (defpackage.afdk) null, 12), 3);
        }
        k(i, i2, false);
    }

    public final void k(int i, int i2, boolean z) {
        defpackage.axr axrVar = this.d;
        if (axrVar.a() != i || axrVar.b() != i2) {
            this.k.c();
        }
        axrVar.e(i, i2);
        axrVar.b = null;
        if (!z) {
            this.n.b(defpackage.afbk.a);
            return;
        }
        defpackage.cxl cxlVar = this.r;
        if (cxlVar != null) {
            cxlVar.D();
        }
    }

    public final defpackage.axo l() {
        return (defpackage.axo) this.e.a();
    }

    public final void m(float f, defpackage.axo axoVar) {
        defpackage.azx azxVar;
        defpackage.azx azxVar2;
        if (this.w) {
            defpackage.axe axeVar = this.p;
            defpackage.izq izqVar = this.z;
            java.util.List list = axoVar.j;
            if (!list.isEmpty()) {
                boolean z = f < 0.0f;
                int iB = defpackage.axe.b(axoVar, z);
                if (iB >= 0 && iB < axoVar.m) {
                    if (iB != axeVar.a) {
                        if (axeVar.c != z) {
                            axeVar.a();
                        }
                        axeVar.c = z;
                        axeVar.a = iB;
                        axeVar.b = izqVar.n(iB);
                    }
                    if (z) {
                        defpackage.axp axpVar = (defpackage.axp) defpackage.afga.aE(list);
                        if (((axpVar.h + axpVar.i) + axoVar.p) - axoVar.l < (-f) && (azxVar2 = axeVar.b) != null) {
                            azxVar2.b();
                        }
                    } else if (axoVar.k - ((defpackage.axp) defpackage.afga.az(list)).h < f && (azxVar = axeVar.b) != null) {
                        azxVar.b();
                    }
                }
            }
            axeVar.e = f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [afbk, java.lang.Object] */
    public final java.lang.Object n(int i, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.axt axtVar;
        if (afdkVar instanceof defpackage.axt) {
            axtVar = (defpackage.axt) afdkVar;
            int i2 = axtVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                axtVar.c = i2 - Integer.MIN_VALUE;
            } else {
                axtVar = new defpackage.axt(this, afdkVar);
            }
        } else {
            axtVar = new defpackage.axt(this, afdkVar);
        }
        java.lang.Object obj = axtVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i3 = axtVar.c;
        try {
            if (i3 == 0) {
                defpackage.afga.cz(obj);
                this.h = true;
                defpackage.ayc aycVar = new defpackage.ayc(this, i, (defpackage.afdk) null, 1);
                axtVar.c = 1;
                if (e(defpackage.akv.a, aycVar, axtVar) == afdrVar) {
                    return afdrVar;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.afga.cz(obj);
            }
            this.h = false;
            this = defpackage.afbk.a;
            return this;
        } catch (java.lang.Throwable th) {
            this.h = false;
            throw th;
        }
    }

    public final java.lang.Object o(int i, defpackage.afdk afdkVar) {
        java.lang.Object objE = e(defpackage.akv.a, new defpackage.axw(this, i, null), afdkVar);
        return objE == defpackage.afdr.a ? objE : defpackage.afbk.a;
    }

    public axx(int i, int i2) {
        this(i, i2, new defpackage.axe());
    }

    public axx() {
        this(0, 0, new defpackage.axe());
    }
}
