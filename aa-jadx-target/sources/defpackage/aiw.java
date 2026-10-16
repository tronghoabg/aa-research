package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class aiw extends defpackage.cwo implements defpackage.cza, defpackage.cpz, defpackage.czc, defpackage.cwm, defpackage.cyp, defpackage.cpv, defpackage.akc {
    private long D;
    private defpackage.ask E;
    private boolean F;
    private aiwg G;
    public defpackage.ask a;
    public boolean b;
    public defpackage.akr c;
    public java.lang.String d = "idle";
    public defpackage.asn e;
    public defpackage.asf f;
    public defpackage.asn g;
    public final defpackage.zv h;
    private defpackage.akr i;
    private boolean j;
    private java.lang.String k;
    private defpackage.ddw l;
    private defpackage.afer m;
    private final defpackage.akb n;
    private defpackage.cwn o;
    private defpackage.cwn p;

    public aiw(defpackage.ask askVar, defpackage.akr akrVar, boolean z, boolean z2, java.lang.String str, defpackage.ddw ddwVar, defpackage.afer aferVar) {
        this.a = askVar;
        this.i = akrVar;
        this.j = z;
        this.k = str;
        this.l = ddwVar;
        this.b = z2;
        this.m = aferVar;
        this.n = new defpackage.akb(this.a, 0, new defpackage.bhh(this, 1, (byte[]) null));
        int i = defpackage.zw.a;
        this.h = new defpackage.zv(6);
        this.D = 0L;
        this.E = this.a;
        this.F = L();
    }

    private final void J() {
        if (this.o == null) {
            defpackage.akd akdVar = new defpackage.akd(this);
            W(akdVar);
            this.o = akdVar;
        }
    }

    private final boolean K() {
        defpackage.afgv afgvVar = new defpackage.afgv();
        defpackage.ca.bd(this, new defpackage.act(afgvVar, 8));
        if (afgvVar.a != null) {
            return true;
        }
        long j = defpackage.ajp.a;
        android.view.ViewParent parent = defpackage.ua.g(this).getParent();
        while (parent != null && (parent instanceof android.view.ViewGroup)) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    private final boolean L() {
        return this.E == null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.cpz
    public final boolean A(android.view.KeyEvent keyEvent) {
        boolean z;
        m();
        long jI = defpackage.tn.i(keyEvent);
        if (this.b && defpackage.tn.h(keyEvent) == 2 && defpackage.afw.v(keyEvent)) {
            defpackage.zv zvVar = this.h;
            if (zvVar.b(jI)) {
                z = false;
            } else {
                defpackage.asn asnVar = new defpackage.asn(this.D);
                zvVar.e(jI, asnVar);
                if (this.a != null) {
                    ahoc.d(N(), (defpackage.afdo) null, 0, new defpackage.ais(this, asnVar, (defpackage.afdk) null, 7, (char[]) null), 3);
                }
                z = true;
            }
            G(keyEvent);
            return z;
        }
        if (!this.b || defpackage.tn.h(keyEvent) != 1 || !defpackage.afw.v(keyEvent)) {
            return false;
        }
        defpackage.asn asnVar2 = (defpackage.asn) this.h.c(jI);
        if (asnVar2 != null) {
            if (this.a != null) {
                ahoc.d(N(), (defpackage.afdo) null, 0, new defpackage.ais(this, asnVar2, (defpackage.afdk) null, 8, (short[]) null), 3);
            }
            F(keyEvent);
        }
        return asnVar2 != null;
    }

    @Override // defpackage.cpz
    public final boolean B(android.view.KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.cza
    public final /* synthetic */ boolean C() {
        return false;
    }

    protected abstract void F(android.view.KeyEvent keyEvent);

    protected abstract void G(android.view.KeyEvent keyEvent);

    @Override // defpackage.cpv
    public void H(defpackage.aahg aahgVar, defpackage.cqv cqvVar) {
        m();
        if (this.b) {
            J();
        }
    }

    protected final long a(long j) {
        long jDP = defpackage.cjv.r(this).r.dP(((defpackage.dck) defpackage.cjv.y(this, defpackage.dbl.n)).g());
        float fMax = java.lang.Math.max(0.0f, java.lang.Float.intBitsToFloat((int) (jDP >> 32)) - ((int) (j >> 32))) / 2.0f;
        return (((long) java.lang.Float.floatToRawIntBits(java.lang.Math.max(0.0f, java.lang.Float.intBitsToFloat((int) (jDP & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(fMax) << 32);
    }

    @Override // defpackage.akc
    public final java.lang.String d() {
        return this.d;
    }

    @Override // defpackage.cza
    public final /* synthetic */ long dy() {
        return defpackage.ud.b(0, 0, 0, 0);
    }

    @Override // defpackage.cge
    public final void dz() {
        r();
        if (!this.F) {
            m();
        }
        if (this.b) {
            W(this.n);
        }
    }

    @Override // defpackage.czc
    public final void g(defpackage.dek dekVar) {
        defpackage.ddw ddwVar = this.l;
        if (ddwVar != null) {
            dekVar.a(defpackage.def.A, new defpackage.ddw(ddwVar.a));
        }
        dekVar.a(defpackage.ddy.b, new defpackage.ddn(this.k, new defpackage.nz(this, 14)));
        if (this.b) {
            this.n.g(dekVar);
        } else {
            dekVar.a(defpackage.def.j, defpackage.afbk.a);
        }
        f(dekVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0073 A[LOOP:0: B:16:0x0037->B:27:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0076 A[EDGE_INSN: B:31:0x0076->B:28:0x0076 BREAK  A[LOOP:0: B:16:0x0037->B:27:0x0073], SYNTHETIC] */
    protected final void h() {
        int i;
        defpackage.ask askVar = this.a;
        if (askVar != null) {
            defpackage.asn asnVar = this.e;
            if (asnVar != null) {
                askVar.c(new defpackage.asm(asnVar));
            }
            defpackage.asn asnVar2 = this.g;
            if (asnVar2 != null) {
                askVar.c(new defpackage.asm(asnVar2));
            }
            defpackage.asf asfVar = this.f;
            if (asfVar != null) {
                askVar.c(new defpackage.asg(asfVar));
            }
            defpackage.zv zvVar = this.h;
            java.lang.Object[] objArr = zvVar.c;
            long[] jArr = zvVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = i2 - length;
                        int i4 = 0;
                        while (true) {
                            i = 8 - ((~i3) >>> 31);
                            if (i4 >= i) {
                                break;
                            }
                            if ((255 & j) < 128) {
                                askVar.c(new defpackage.asm((defpackage.asn) objArr[(i2 << 3) + i4]));
                            }
                            j >>= 8;
                            i4++;
                        }
                        if (i != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        this.e = null;
        this.g = null;
        this.f = null;
        this.h.d();
    }

    protected final void i(boolean z) {
        defpackage.ask askVar = this.a;
        if (askVar != null) {
            aiwg aiwgVar = this.G;
            byte[] bArr = null;
            if (aiwgVar == null || !aiwgVar.t()) {
                defpackage.asn asnVar = z ? this.g : this.e;
                if (asnVar != null) {
                    defpackage.asm asmVar = new defpackage.asm(asnVar);
                    aiwg aiwgVar2 = N().a.get(aiwg.d);
                    ahoc.d(N(), (defpackage.afdo) null, 0, new defpackage.ait(askVar, asmVar, aiwgVar2 != null ? aiwgVar2.p(new defpackage.abp(askVar, asmVar, 19, bArr)) : null, (defpackage.afdk) null, 0), 3);
                }
            } else {
                aiwg aiwgVar3 = this.G;
                if (aiwgVar3 != null) {
                    aiwgVar3.s((java.util.concurrent.CancellationException) null);
                }
            }
            if (z) {
                this.g = null;
            } else {
                this.e = null;
            }
        }
    }

    protected final void j(long j, boolean z) {
        defpackage.ask askVar = this.a;
        if (askVar != null) {
            aiwg aiwgVar = this.G;
            if (aiwgVar == null || !aiwgVar.t()) {
                defpackage.asn asnVar = z ? this.g : this.e;
                if (asnVar != null) {
                    ahoc.d(N(), (defpackage.afdo) null, 0, new defpackage.ais(asnVar, askVar, (defpackage.afdk) null, 2), 3);
                }
            } else {
                aiwgVar.s((java.util.concurrent.CancellationException) null);
                ahoc.d(N(), (defpackage.afdo) null, 0, new defpackage.aiu(aiwgVar, j, askVar, null), 3);
            }
            if (z) {
                this.g = null;
            } else {
                this.e = null;
            }
        }
    }

    protected final void k(cpu cpuVar) {
        defpackage.ask askVar = this.a;
        if (askVar != null) {
            defpackage.asn asnVar = new defpackage.asn(cpuVar.c);
            if (K()) {
                this.G = ahoc.d(N(), (defpackage.afdo) null, 0, new defpackage.ait(askVar, asnVar, this, (defpackage.afdk) null, 2), 3);
            } else {
                this.g = asnVar;
                ahoc.d(N(), (defpackage.afdo) null, 0, new defpackage.ais(askVar, asnVar, (defpackage.afdk) null, 3), 3);
            }
        }
    }

    protected final void l(defpackage.crd crdVar) {
        defpackage.ask askVar = this.a;
        if (askVar != null) {
            defpackage.asn asnVar = new defpackage.asn(crdVar.c);
            if (K()) {
                this.G = ahoc.d(N(), (defpackage.afdo) null, 0, new defpackage.ait(askVar, asnVar, this, (defpackage.afdk) null, 3, (byte[]) null), 3);
            } else {
                this.e = asnVar;
                ahoc.d(N(), (defpackage.afdo) null, 0, new defpackage.ais(askVar, asnVar, (defpackage.afdk) null, 4, (byte[]) null), 3);
            }
        }
    }

    public final void m() {
        if (this.p != null) {
            return;
        }
        defpackage.akr akrVar = this.j ? this.c : this.i;
        if (akrVar != null) {
            if (this.a == null) {
                this.a = new defpackage.asl();
            }
            this.n.b(this.a);
            defpackage.ask askVar = this.a;
            askVar.getClass();
            defpackage.cwn cwnVarA = akrVar.a(askVar);
            W(cwnVarA);
            this.p = cwnVarA;
        }
    }

    @Override // defpackage.cza
    public void o() {
        defpackage.asf asfVar;
        defpackage.ask askVar = this.a;
        if (askVar != null && (asfVar = this.f) != null) {
            askVar.c(new defpackage.asg(asfVar));
        }
        this.f = null;
    }

    @Override // defpackage.cge
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void t() {
        o();
    }

    @Override // defpackage.cge
    public final void q() {
        h();
        if (this.E == null) {
            this.a = null;
        }
        defpackage.cwn cwnVar = this.p;
        if (cwnVar != null) {
            V(cwnVar);
        }
        this.p = null;
        defpackage.cwn cwnVar2 = this.o;
        if (cwnVar2 != null) {
            V(cwnVar2);
        }
        this.o = null;
    }

    @Override // defpackage.cyp
    public final void r() {
        if (this.j) {
            defpackage.dai.z(this, new defpackage.nz(this, 13));
        }
    }

    @Override // defpackage.cza
    public void s(defpackage.cqu cquVar, defpackage.cqv cqvVar, long j) {
        long j2 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.D = (((long) java.lang.Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (java.lang.Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
        m();
        if (this.b) {
            J();
            if (cqvVar == defpackage.cqv.b) {
                int i = cquVar.e;
                if (i == 4) {
                    ahoc.d(N(), (defpackage.afdo) null, 0, new defpackage.aiv(this, (defpackage.afdk) null, 1, (byte[]) null), 3);
                } else if (i == 5) {
                    ahoc.d(N(), (defpackage.afdo) null, 0, new defpackage.aiv(this, (defpackage.afdk) null, 0), 3);
                }
            }
        }
    }

    @Override // defpackage.cza
    public final /* synthetic */ void t() {
        o();
    }

    public final void u() {
        dch dchVar = (dch) defpackage.cjv.y(this, defpackage.dbl.p);
        if (dchVar != null) {
            dchVar.a();
        }
        this.m.invoke();
    }

    public final void v() {
        defpackage.cwn cwnVar = this.p;
        if (cwnVar == null && this.F) {
            return;
        }
        if (cwnVar != null) {
            V(cwnVar);
        }
        this.p = null;
        m();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    public final void w(defpackage.ask askVar, defpackage.akr akrVar, boolean z, boolean z2, java.lang.String str, defpackage.ddw ddwVar, defpackage.afer aferVar) {
        boolean z3;
        boolean z4 = true;
        if (defpackage.afga.f(this.E, askVar)) {
            z3 = false;
        } else {
            h();
            this.E = askVar;
            this.a = askVar;
            z3 = true;
        }
        if (!defpackage.afga.f(this.i, akrVar)) {
            this.i = akrVar;
            z3 = true;
        }
        if (this.j != z) {
            this.j = z;
            if (z) {
                r();
            }
        } else {
            z4 = z3;
        }
        if (this.b != z2) {
            defpackage.akb akbVar = this.n;
            if (z2) {
                W(akbVar);
            } else {
                V(akbVar);
                h();
            }
            defpackage.cjv.r(this).J();
            if (!z2) {
                defpackage.cwn cwnVar = this.o;
                if (cwnVar != null) {
                    V(cwnVar);
                }
                this.o = null;
                this.d = "idle";
            }
            this.b = z2;
        }
        if (!defpackage.afga.f(this.k, str)) {
            this.k = str;
            defpackage.cjv.r(this).J();
        }
        if (!defpackage.afga.f(this.l, ddwVar)) {
            this.l = ddwVar;
            defpackage.cjv.r(this).J();
        }
        this.m = aferVar;
        if (this.F != L()) {
            boolean zL = L();
            this.F = zL;
            if (!zL && this.p == null) {
                v();
            } else if (z4) {
                v();
            }
        } else if (z4) {
            v();
        }
        this.n.b(this.a);
    }

    @Override // defpackage.cge
    public final boolean x() {
        return false;
    }

    @Override // defpackage.czc
    public final boolean y() {
        return true;
    }

    @Override // defpackage.czc
    public final /* synthetic */ boolean z() {
        return true;
    }

    @Override // defpackage.czc
    public final /* synthetic */ void D() {
    }

    @Override // defpackage.cza
    public final /* synthetic */ void E() {
    }

    public void n() {
    }

    public void f(defpackage.dek dekVar) {
    }
}
