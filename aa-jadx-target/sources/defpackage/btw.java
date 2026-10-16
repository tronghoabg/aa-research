package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class btw extends defpackage.cge implements defpackage.cwm, defpackage.cwu, defpackage.cxc {
    private defpackage.ty B;
    public final defpackage.asj a;
    public final boolean b;
    public final defpackage.afer c;
    public float d;
    public boolean f;
    public defpackage.asi i;
    private final float l;
    private final defpackage.ckg m;
    private btp o;
    private btq p;
    public long e = 0;
    public final defpackage.aan k = new defpackage.aan(16);
    public final defpackage.aeb g = defpackage.aec.a(0.0f);
    public final java.util.List h = new java.util.ArrayList();
    public final defpackage.aeb j = defpackage.aec.a(0.0f);
    private final defpackage.bwx n = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);

    public btw(defpackage.asj asjVar, boolean z, float f, defpackage.ckg ckgVar, defpackage.afer aferVar) {
        this.a = asjVar;
        this.b = z;
        this.l = f;
        this.m = ckgVar;
        this.c = aferVar;
    }

    private final void l(btq btqVar) {
        this.p = btqVar;
        defpackage.dai.G(this);
    }

    @Override // defpackage.cwu
    public final void b(defpackage.cxn cxnVar) throws java.lang.Throwable {
        long j;
        cxnVar.q();
        defpackage.ckc ckcVarB = cxnVar.r().b();
        btq btqVar = this.p;
        if (btqVar != null) {
            bud budVar = ((bue) this.c.invoke()).c;
            btqVar.b(this.e, defpackage.afhi.k(this.d), d(), budVar instanceof bud ? budVar.b : 0.0f);
            android.graphics.Canvas canvas = defpackage.cjn.a;
            ckcVarB.getClass();
            btqVar.draw(((defpackage.cjm) ckcVarB).a);
        }
        float fFloatValue = ((java.lang.Number) this.g.d()).floatValue();
        if (fFloatValue > 0.0f) {
            long jA = this.m.a();
            float fD = defpackage.ckd.d(jA);
            float fC = defpackage.ckd.c(jA);
            float fB = defpackage.ckd.b(jA);
            float[] fArr = defpackage.clr.a;
            long jK = defpackage.cjv.k(fD, fC, fB, fFloatValue, defpackage.clr.y[(int) (jA & 63)]);
            if (this.b) {
                float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (cxnVar.o() >> 32));
                float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (cxnVar.o() & 4294967295L));
                defpackage.cmi cmiVarR = cxnVar.r();
                long jA2 = cmiVarR.a();
                cmiVarR.b().g();
                try {
                    cmiVarR.c.h(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                    j = jA2;
                    try {
                        defpackage.dai.aF(cxnVar, jK, this.d, 0L, null, 124);
                        cmiVarR.b().e();
                        cmiVarR.h(j);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        cmiVarR.b().e();
                        cmiVarR.h(j);
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    j = jA2;
                }
            } else {
                defpackage.dai.aF(cxnVar, jK, this.d, 0L, null, 124);
            }
        }
        if (((java.lang.Number) this.j.d()).floatValue() > 0.0f) {
            defpackage.ty tyVar = this.B;
            if (tyVar == null) {
                tyVar = new defpackage.ty(null);
            }
            this.B = tyVar;
            bty btyVar = ((bue) this.c.invoke()).d;
            if ((btyVar instanceof bty ? btyVar : null) == null) {
                return;
            }
            cxnVar.o();
            throw null;
        }
    }

    public final long d() {
        return this.m.a();
    }

    @Override // defpackage.cyb
    public final void dB(long j) {
        float fDI;
        this.f = true;
        defpackage.dlo dloVar = defpackage.cjv.r(this).r;
        this.e = defpackage.dlv.f(j);
        float f = this.l;
        if (java.lang.Float.isNaN(f)) {
            boolean z = this.b;
            long j2 = this.e;
            float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j2 >> 32));
            float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
            fDI = defpackage.cji.a((((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L)) / 2.0f;
            if (z) {
                fDI += dloVar.dI(10.0f);
            }
        } else {
            fDI = dloVar.dI(f);
        }
        this.d = fDI;
        defpackage.aan aanVar = this.k;
        java.lang.Object[] objArr = aanVar.a;
        int i = aanVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            h((defpackage.asp) objArr[i2]);
        }
        aanVar.k();
    }

    @Override // defpackage.cge
    public final void dz() {
        ahoc.d(N(), (defpackage.afdo) null, 0, new defpackage.btv(this, (defpackage.afdk) null, 0), 3);
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, java.util.Map] */
    public final void h(defpackage.asp aspVar) {
        if (!(aspVar instanceof defpackage.asn)) {
            if (aspVar instanceof defpackage.aso) {
                defpackage.asn asnVar = ((defpackage.aso) aspVar).a;
                k();
                return;
            } else {
                if (aspVar instanceof defpackage.asm) {
                    defpackage.asn asnVar2 = ((defpackage.asm) aspVar).a;
                    k();
                    return;
                }
                return;
            }
        }
        defpackage.asn asnVar3 = (defpackage.asn) aspVar;
        long j = this.e;
        float f = this.d;
        btp btpVar = this.o;
        if (btpVar == null) {
            java.lang.Object obj = (android.view.View) defpackage.cjv.y(this, defpackage.daj.f);
            while (!(obj instanceof android.view.ViewGroup)) {
                android.view.ViewParent parent = ((android.view.View) obj).getParent();
                if (!(parent instanceof android.view.View)) {
                    throw new java.lang.IllegalArgumentException(defpackage.a.bl(obj, "Couldn't find a valid parent for ", ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"));
                }
                obj = parent;
            }
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    btp btpVar2 = new btp(viewGroup.getContext());
                    viewGroup.addView(btpVar2);
                    btpVar = btpVar2;
                    break;
                } else {
                    android.view.View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof btp) {
                        btpVar = (btp) childAt;
                        break;
                    }
                    i++;
                }
            }
            this.o = btpVar;
            btpVar.getClass();
        }
        defpackage.tc tcVar = btpVar.e;
        btq btqVarC = tcVar.c(this);
        if (btqVarC == null) {
            java.util.List list = btpVar.c;
            list.getClass();
            btqVarC = (btq) (list.isEmpty() ? null : list.remove(0));
            if (btqVarC == null) {
                int i2 = btpVar.d;
                java.util.List list2 = btpVar.b;
                if (i2 > defpackage.afga.ab(list2)) {
                    btqVarC = new btq(btpVar.getContext());
                    btpVar.addView(btqVarC);
                    list2.add(btqVarC);
                } else {
                    btqVarC = (btq) list2.get(btpVar.d);
                    defpackage.btw btwVar = (defpackage.btw) tcVar.a.get(btqVarC);
                    if (btwVar != null) {
                        btwVar.l(null);
                        tcVar.d(btwVar);
                        btqVarC.a();
                    }
                }
                int i3 = btpVar.d;
                if (i3 < btpVar.a - 1) {
                    btpVar.d = i3 + 1;
                } else {
                    btpVar.d = 0;
                }
            }
            tcVar.b.put(this, btqVarC);
            tcVar.a.put(btqVarC, this);
        }
        bud budVar = ((bue) this.c.invoke()).c;
        float f2 = budVar instanceof bud ? budVar.b : 0.0f;
        boolean z = this.b;
        int iK = defpackage.afhi.k(f);
        long jD = d();
        defpackage.oe oeVar = new defpackage.oe(this, 15);
        if (btqVarC.b == null || !defpackage.afga.f(java.lang.Boolean.valueOf(z), btqVarC.c)) {
            buf bufVar = new buf(z);
            btqVarC.setBackground(bufVar);
            btqVarC.b = bufVar;
            btqVarC.c = java.lang.Boolean.valueOf(z);
        }
        buf bufVar2 = btqVarC.b;
        bufVar2.getClass();
        btqVarC.e = oeVar;
        btq btqVar = btqVarC;
        btqVar.b(j, iK, jD, f2);
        if (z) {
            long j2 = asnVar3.a;
            bufVar2.setHotspot(java.lang.Float.intBitsToFloat((int) (j2 >> 32)), java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)));
        } else {
            bufVar2.setHotspot(bufVar2.getBounds().centerX(), bufVar2.getBounds().centerY());
        }
        btqVar.c(true);
        l(btqVar);
    }

    public final void i(boolean z) {
        this.n.b(java.lang.Boolean.valueOf(z));
    }

    public final boolean j() {
        return ((java.lang.Boolean) this.n.a()).booleanValue();
    }

    public final void k() {
        btq btqVar = this.p;
        if (btqVar != null) {
            btqVar.c(false);
        }
    }

    @Override // defpackage.cge
    public final void q() {
        btp btpVar = this.o;
        if (btpVar != null) {
            l(null);
            defpackage.tc tcVar = btpVar.e;
            btq btqVarC = tcVar.c(this);
            if (btqVarC != null) {
                btqVarC.a();
                tcVar.d(this);
                btpVar.c.add(btqVarC);
            }
        }
    }

    @Override // defpackage.cge
    public final boolean x() {
        return false;
    }

    @Override // defpackage.cwu
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.cxc
    public final /* synthetic */ void f(defpackage.ctc ctcVar) {
    }
}
