package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class axl implements defpackage.afer {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ axl(defpackage.affc affcVar, defpackage.cyl cylVar, defpackage.afgq afgqVar, int i) {
        this.d = i;
        this.b = affcVar;
        this.c = cylVar;
        this.a = afgqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [android.view.View$OnAttachStateChangeListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [and, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v37, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [ctc, java.lang.Object] */
    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        defpackage.anj anjVar;
        java.lang.Object objInvoke;
        defpackage.ccu ccuVar;
        int i;
        switch (this.d) {
            case defpackage.abnt.b /* 0 */:
                defpackage.axj axjVar = (defpackage.axj) this.a.a();
                defpackage.axx axxVar = (defpackage.axx) this.b;
                return new defpackage.axk(axxVar, axjVar, (defpackage.bil) this.c, new defpackage.sns(axxVar.d.c.a(), axjVar));
            case 1:
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return new defpackage.bbi((defpackage.affi) this.c.a(), (defpackage.affc) this.b.a(), ((java.lang.Number) this.a.invoke()).intValue());
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ?? r0 = this.a;
                ?? r2 = this.b;
                defpackage.bcj bcjVar = (defpackage.bcj) this.c;
                defpackage.cjj cjjVarB = defpackage.bcj.b(bcjVar, r2, r0);
                if (cjjVarB == null) {
                    return null;
                }
                defpackage.anj anjVar2 = bcjVar.a;
                if (anjVar2.g == -1) {
                    defpackage.asq.d("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return cjjVarB.f(anjVar2.f(cjjVarB, anjVar2.d(), 0L) ^ (-9223372034707292160L));
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((defpackage.ccv) this.c).a();
                int i2 = ((defpackage.afgt) this.a).a;
                do {
                    ccuVar = (defpackage.ccu) ((defpackage.ccw) this.b).b;
                    i = ccuVar.get();
                } while (!ccuVar.compareAndSet(i, ((i >>> 27) & 15) == i2 ? i - 1 : i));
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ?? r1 = this.b;
                defpackage.cla claVar = defpackage.cyl.q;
                r1.invoke(claVar);
                defpackage.cyl cylVar = (defpackage.cyl) this.c;
                boolean zF = defpackage.afga.f(cylVar.A, claVar.o);
                boolean z = cylVar.D;
                boolean z2 = claVar.p;
                claVar.x = claVar.o.a(claVar.r, claVar.u, claVar.t);
                defpackage.cjj cjjVar = cylVar.C;
                defpackage.cku ckuVar = claVar.x;
                defpackage.cjj cjjVarA = ckuVar != null ? ckuVar.a() : null;
                java.lang.Object obj = this.a;
                boolean z3 = z != z2;
                boolean zF2 = defpackage.afga.f(cjjVar, cjjVarA);
                ((defpackage.afgq) obj).a = !zF2;
                if (!zF || z3 || !zF2) {
                    cylVar.A = claVar.o;
                    cylVar.D = claVar.p;
                    defpackage.cku ckuVar2 = claVar.x;
                    cylVar.C = ckuVar2 != null ? ckuVar2.a() : defpackage.cjj.a;
                    defpackage.cku ckuVar3 = claVar.x;
                    cylVar.B = ckuVar3 != null ? defpackage.dlv.g(defpackage.dlv.i(ckuVar3.a())) : defpackage.cjj.a;
                    if (cylVar.E && (z3 || (cylVar.D && !zF))) {
                        cylVar.t.J();
                    }
                }
                cylVar.E = true;
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ?? r3 = this.a;
                java.lang.Object obj2 = this.c;
                ((defpackage.czl) obj2).removeOnAttachStateChangeListener(r3);
                ((java.util.ArrayList) defpackage.ebl.x((android.view.View) obj2).a).remove(this.b);
                return defpackage.afbk.a;
            default:
                defpackage.nng nngVar = (defpackage.nng) this.c;
                if (nngVar.a) {
                    this.b.invoke();
                }
                ?? r13 = this.a;
                nngVar.a = false;
                if (r13 != 0) {
                    r13.invoke();
                }
                return defpackage.afbk.a;
        }
        while (true) {
            anjVar = (defpackage.anj) this.b;
            defpackage.bzc bzcVar = (defpackage.bzc) anjVar.i.a;
            int i3 = bzcVar.b;
            if (i3 != 0) {
                if (i3 == 0) {
                    throw new java.util.NoSuchElementException("MutableVector is empty.");
                }
                java.lang.Object objInvoke2 = ((defpackage.ang) bzcVar.a[i3 - 1]).a.invoke();
                if (objInvoke2 == null || defpackage.anj.i(anjVar, (defpackage.cjj) objInvoke2, 0L, 0L, 3)) {
                    ((defpackage.ang) bzcVar.c(bzcVar.b - 1)).b.w(defpackage.afbk.a);
                }
            }
        }
        if (anjVar.f && (objInvoke = anjVar.e.invoke()) != null && defpackage.anj.i(anjVar, (defpackage.cjj) objInvoke, 0L, 0L, 3)) {
            anjVar.f = false;
        }
        ((defpackage.ark) this.a).e = anjVar.b(this.c, 0L);
        return defpackage.afbk.a;
    }

    public /* synthetic */ axl(defpackage.anj anjVar, defpackage.ark arkVar, defpackage.and andVar, int i) {
        this.d = i;
        this.b = anjVar;
        this.a = arkVar;
        this.c = andVar;
    }

    public /* synthetic */ axl(defpackage.bys bysVar, defpackage.axx axxVar, defpackage.bil bilVar, int i) {
        this.d = i;
        this.a = bysVar;
        this.b = axxVar;
        this.c = bilVar;
    }

    public /* synthetic */ axl(defpackage.czl czlVar, defpackage.cjp cjpVar, defpackage.izq izqVar, int i) {
        this.d = i;
        this.c = czlVar;
        this.a = cjpVar;
        this.b = izqVar;
    }

    public /* synthetic */ axl(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }
}
