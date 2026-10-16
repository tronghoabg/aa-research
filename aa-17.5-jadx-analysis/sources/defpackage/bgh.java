package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class bgh implements afeg {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ bgh(affs affsVar, aqk aqkVar, izj izjVar, int i) {
        this.d = i;
        this.c = affsVar;
        this.a = aqkVar;
        this.b = izjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v23, types: [afeg, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            bux buxVar = (bux) obj;
            int iIntValue = ((Integer) obj2).intValue();
            if (buxVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                Object objG = buxVar.g();
                if (objG == buw.a) {
                    bgb bgbVar = new bgb(this.b, 4);
                    buxVar.x(bgbVar);
                    objG = bgbVar;
                }
                cfy cfyVarF = tt.f(this.a, (afec) objG);
                ctp ctpVarB = atk.b(cfl.a, true);
                int iG = a.g(buxVar.b());
                ccx ccxVarN = buxVar.N();
                cfy cfyVarJ = bzi.j(buxVar, cfyVarF);
                afdr afdrVar = cwb.a;
                buxVar.M();
                buxVar.w();
                if (buxVar.G()) {
                    buxVar.j(afdrVar);
                } else {
                    buxVar.y();
                }
                ?? r6 = this.c;
                byq.c(buxVar, ctpVarB, cwb.e);
                byq.c(buxVar, ccxVarN, cwb.d);
                byq.c(buxVar, Integer.valueOf(iG), cwb.f);
                byq.b(buxVar, cwb.g);
                byq.c(buxVar, cfyVarJ, cwb.c);
                r6.invoke(buxVar, 0);
                buxVar.n();
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        if (i == 1) {
            float fFloatValue = ((Float) obj).floatValue();
            ((Float) obj2).floatValue();
            affs affsVar = (affs) this.c;
            float f = fFloatValue - affsVar.a;
            aqk aqkVar = (aqk) this.a;
            affsVar.a += aqkVar.a(aqkVar.b(((izj) this.b).p(aqkVar.f(aqkVar.a(f)))));
            return afak.a;
        }
        bux buxVar2 = (bux) obj;
        int iIntValue2 = ((Integer) obj2).intValue();
        if (buxVar2.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
            Object obj3 = this.a;
            boolean zE = buxVar2.E(obj3);
            Object objG2 = buxVar2.g();
            if (zE || objG2 == buw.a) {
                objG2 = new beo((dcp) obj3, (afck) null, 6);
                buxVar2.x(objG2);
            }
            dcp dcpVar = (dcp) obj3;
            czq czqVar = dcpVar.a;
            bvq.g(czqVar, (afeg) objG2, buxVar2);
            boolean zE2 = buxVar2.E(obj3);
            Object objG3 = buxVar2.g();
            if (zE2 || objG3 == buw.a) {
                objG3 = new beo(dcpVar, (afck) null, 7, (byte[]) null);
                buxVar2.x(objG3);
            }
            ?? r8 = this.c;
            Object obj4 = this.b;
            bvq.g(czqVar, (afeg) objG3, buxVar2);
            ((day) obj4).e(czqVar, r8, buxVar2, 0);
        } else {
            buxVar2.s();
        }
        return afak.a;
    }

    public /* synthetic */ bgh(Object obj, Object obj2, afeg afegVar, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = afegVar;
    }
}
