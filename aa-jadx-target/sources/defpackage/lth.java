package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class lth implements defpackage.affg {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ lth(defpackage.cgf cgfVar, defpackage.bwx bwxVar, defpackage.affg affgVar, defpackage.bhp bhpVar, defpackage.afer aferVar, int i) {
        this.f = i;
        this.d = cgfVar;
        this.c = bwxVar;
        this.a = affgVar;
        this.b = bhpVar;
        this.e = aferVar;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0159  */
    /* JADX WARN: Code duplicated, block: B:42:0x019d A[LOOP:0: B:40:0x0197->B:42:0x019d, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [afer, java.lang.Object] */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i;
        java.util.ArrayList arrayList;
        defpackage.ltm ltmVar;
        defpackage.ltm ltmVar2;
        if (this.f != 0) {
            defpackage.bve bveVar = (defpackage.bve) obj;
            int iIntValue = ((java.lang.Integer) obj2).intValue();
            int i2 = iIntValue & 3;
            if (bveVar.I(i2 != 2, iIntValue & 1)) {
                java.lang.Object objG = bveVar.g();
                if (objG == defpackage.bvd.a) {
                    defpackage.bge bgeVar = new defpackage.bge(this.c, 5);
                    bveVar.x(bgeVar);
                    objG = bgeVar;
                }
                defpackage.cgf cgfVarE = defpackage.ty.e(this.d, (defpackage.affc) objG);
                defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, true);
                int iF = defpackage.a.f(bveVar.b());
                defpackage.cdd cddVarN = bveVar.N();
                defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar, cgfVarE);
                defpackage.afer aferVar = defpackage.cwl.a;
                bveVar.M();
                bveVar.w();
                if (bveVar.G()) {
                    bveVar.j(aferVar);
                } else {
                    bveVar.y();
                }
                ?? r4 = this.e;
                java.lang.Object obj3 = this.b;
                ?? r11 = this.a;
                defpackage.byw.c(bveVar, ctyVarB, defpackage.cwl.e);
                defpackage.byw.c(bveVar, cddVarN, defpackage.cwl.d);
                defpackage.byw.c(bveVar, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
                defpackage.byw.b(bveVar, defpackage.cwl.g);
                defpackage.byw.c(bveVar, cgfVarN, defpackage.cwl.c);
                r11.invoke(bveVar, 0);
                ((defpackage.bhp) obj3).c(r4, bveVar, 6);
                bveVar.n();
            } else {
                bveVar.s();
            }
            return defpackage.afbk.a;
        }
        defpackage.afau afauVar = (defpackage.afau) obj;
        defpackage.qsh qshVar = (defpackage.qsh) obj2;
        afauVar.getClass();
        lok lokVar = (lok) afauVar.a;
        com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState = (com.google.android.apps.auto.components.media.compat.AaPlaybackState) afauVar.b;
        if (lokVar == null || aaPlaybackState == null || qshVar == null) {
            return null;
        }
        java.lang.Object obj4 = this.e;
        java.lang.Object obj5 = this.d;
        java.lang.Object obj6 = this.a;
        defpackage.ygw ygwVarV = aaPlaybackState.V();
        ygwVarV.getClass();
        java.util.List<com.google.android.apps.auto.components.media.compat.AaPlaybackState.AaCustomAction> listBb = defpackage.afga.bb(ygwVarV);
        defpackage.oln olnVar = (defpackage.oln) obj6;
        lkj lkjVarB = olnVar.b(lokVar);
        boolean zIsEmpty = aaPlaybackState.V().isEmpty();
        if (defpackage.actz.z() && zIsEmpty && defpackage.lhc.b(aaPlaybackState, 256L)) {
            defpackage.lke lkeVar = lokVar.c;
            j$.util.stream.Stream streamD = defpackage.loo.d(qshVar);
            android.content.ComponentName componentName = lkeVar.a;
            componentName.getClass();
            if (streamD.anyMatch(new defpackage.koo(componentName, 19))) {
                defpackage.ltm ltmVarC = olnVar.c(lti.a, new defpackage.ltm((com.google.android.apps.auto.components.graphics.icon.GhIcon) obj5, true, new defpackage.lgy(lkjVarB, 15)), lokVar, aaPlaybackState, listBb);
                i = 12;
                defpackage.ltm ltmVarC2 = olnVar.c(lti.b, new defpackage.ltm((com.google.android.apps.auto.components.graphics.icon.GhIcon) obj4, true, new defpackage.lgy(lkjVarB, 12)), lokVar, aaPlaybackState, listBb);
                lokVar = lokVar;
                arrayList = new java.util.ArrayList(defpackage.afga.aj(listBb, 10));
                for (com.google.android.apps.auto.components.media.compat.AaPlaybackState.AaCustomAction aaCustomAction : listBb) {
                    int iO = aaCustomAction.O();
                    java.lang.String str = lokVar.c.b;
                    str.getClass();
                    arrayList.add(new defpackage.ltm(com.google.android.apps.auto.components.graphics.icon.GhIcon.r(str, iO), true, new defpackage.kla(obj6, aaCustomAction, i)));
                }
                ltmVar = ltmVarC;
                ltmVar2 = ltmVarC2;
            } else {
                java.lang.Object obj7 = this.c;
                byte[] bArr = null;
                ltmVar = new defpackage.ltm((com.google.android.apps.auto.components.graphics.icon.GhIcon) this.b, true, new defpackage.ah((java.lang.Object) lokVar, (java.lang.Object) aaPlaybackState, (java.lang.Object) lkjVarB, 20, (short[]) bArr));
                ltmVar2 = new defpackage.ltm((com.google.android.apps.auto.components.graphics.icon.GhIcon) obj7, true, new defpackage.lyb((java.lang.Object) lokVar, (java.lang.Object) aaPlaybackState, (java.lang.Object) lkjVarB, 1, bArr));
                arrayList = new java.util.ArrayList();
                if (defpackage.lhc.b(aaPlaybackState, 16L)) {
                    arrayList.add(new defpackage.ltm((com.google.android.apps.auto.components.graphics.icon.GhIcon) obj5, true, new defpackage.lgy(lkjVarB, 13)));
                }
                if (defpackage.lhc.b(aaPlaybackState, 32L)) {
                    arrayList.add(new defpackage.ltm((com.google.android.apps.auto.components.graphics.icon.GhIcon) obj4, true, new defpackage.lgy(lkjVarB, 14)));
                }
            }
        } else {
            defpackage.ltm ltmVarC3 = olnVar.c(lti.a, new defpackage.ltm((com.google.android.apps.auto.components.graphics.icon.GhIcon) obj5, true, new defpackage.lgy(lkjVarB, 15)), lokVar, aaPlaybackState, listBb);
            i = 12;
            defpackage.ltm ltmVarC4 = olnVar.c(lti.b, new defpackage.ltm((com.google.android.apps.auto.components.graphics.icon.GhIcon) obj4, true, new defpackage.lgy(lkjVarB, 12)), lokVar, aaPlaybackState, listBb);
            lokVar = lokVar;
            arrayList = new java.util.ArrayList(defpackage.afga.aj(listBb, 10));
            while (r0.hasNext()) {
                int iO2 = aaCustomAction.O();
                java.lang.String str2 = lokVar.c.b;
                str2.getClass();
                arrayList.add(new defpackage.ltm(com.google.android.apps.auto.components.graphics.icon.GhIcon.r(str2, iO2), true, new defpackage.kla(obj6, aaCustomAction, i)));
            }
            ltmVar = ltmVarC3;
            ltmVar2 = ltmVarC4;
        }
        java.lang.String str3 = lokVar.c.b;
        str3.getClass();
        return new ltj(str3, ltmVar, ltmVar2, arrayList);
    }

    public /* synthetic */ lth(defpackage.oln olnVar, com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon, com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon2, com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon3, com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon4, int i) {
        this.f = i;
        this.a = olnVar;
        this.b = ghIcon;
        this.c = ghIcon2;
        this.d = ghIcon3;
        this.e = ghIcon4;
    }
}
