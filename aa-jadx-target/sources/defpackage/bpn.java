package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bpn implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bpn(java.lang.String str, int i) {
        this.c = i;
        this.b = "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?";
        this.a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [aiwg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v45, types: [aiyx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v26, types: [dob, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [awu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [bys, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        android.view.WindowInsets windowInsetsE;
        defpackage.evf evfVar;
        defpackage.evf evfVarB;
        lValueOf = null;
        java.lang.Long lValueOf = null;
        boolean z = false;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                ((btj) this.a).a.b(new defpackage.auf(this.b, (defpackage.awu) obj));
                return defpackage.afbk.a;
            case 1:
                defpackage.cml cmlVar = (defpackage.cml) obj;
                float fDI = cmlVar.dI(2.0f);
                ?? r8 = this.b;
                float f = fDI / 2.0f;
                defpackage.dai.aF(cmlVar, ((defpackage.ckd) r8.a()).a, cmlVar.dI(10.0f) - f, 0L, new defpackage.cmo(fDI, 0.0f, 0, 0, 30), 108);
                ?? r11 = this.a;
                if (defpackage.dlr.a(((defpackage.dlr) r11.a()).a, 0.0f) > 0) {
                    defpackage.dai.aF(cmlVar, ((defpackage.ckd) r8.a()).a, cmlVar.dI(((defpackage.dlr) r11.a()).a) - f, 0L, defpackage.cmn.a, 108);
                }
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.cuw) obj).r((defpackage.cux) this.a, 0, 0, ((defpackage.cgk) this.b).a);
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                android.view.MotionEvent motionEvent = (android.view.MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                java.lang.Object obj2 = this.a;
                if (actionMasked == 0) {
                    ((defpackage.crg) this.b).d = true != ((java.lang.Boolean) ((defpackage.crj) obj2).d().invoke(motionEvent)).booleanValue() ? 3 : 2;
                } else {
                    ((defpackage.crj) obj2).d().invoke(motionEvent);
                }
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.dec decVar = (defpackage.dec) obj;
                defpackage.hio hioVar = (defpackage.hio) ((defpackage.zo) this.a).a(decVar.c);
                if (hioVar != null && hioVar.a) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(defpackage.daw.h(decVar, (android.content.res.Resources) this.b, z));
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return new rie((defpackage.bis) this.b, new defpackage.cwg(this.a, 6));
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.Object obj3 = this.b;
                java.lang.Object obj4 = this.a;
                dmo.b((android.view.View) obj4, (defpackage.cxl) obj3);
                defpackage.dmm dmmVar = (defpackage.dmm) obj4;
                dmmVar.c.H();
                android.view.View view = dmmVar.b;
                int[] iArr = dmmVar.m;
                int i = iArr[0];
                int i2 = iArr[1];
                view.getLocationOnScreen(iArr);
                long j = dmmVar.n;
                long jH = ((defpackage.ctc) obj).h();
                dmmVar.n = jH;
                defpackage.edf edfVar = dmmVar.o;
                if (edfVar != null && ((i != iArr[0] || i2 != iArr[1] || !defpackage.a.i(j, jH)) && (windowInsetsE = dmmVar.k(edfVar).e()) != null)) {
                    view.dispatchApplyWindowInsets(windowInsetsE);
                }
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((defpackage.cxl) this.a).ae(((defpackage.cgf) obj).a(this.b));
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.cyu cyuVar = (defpackage.cyu) obj;
                defpackage.czz czzVar = cyuVar instanceof defpackage.czz ? (defpackage.czz) cyuVar : null;
                java.lang.Object obj5 = this.a;
                if (czzVar != null) {
                    java.lang.Object obj6 = this.b;
                    defpackage.dau dauVarO = czzVar.O();
                    dauVarO.getClass();
                    dauVarO.a.put(obj5, obj6);
                    android.view.View view2 = (android.view.View) obj5;
                    dauVarO.addView(view2);
                    dauVarO.b.put(obj6, obj5);
                    ((defpackage.dmm) obj5).setImportantForAccessibility(1);
                    defpackage.czx czxVar = new defpackage.czx(czzVar, (defpackage.cxl) obj6, czzVar, dauVarO);
                    defpackage.ebt.q(view2);
                    view2.setAccessibilityDelegate(czxVar.C);
                }
                defpackage.dmm dmmVar2 = (defpackage.dmm) obj5;
                android.view.View view3 = dmmVar2.b;
                if (view3.getParent() != obj5) {
                    dmmVar2.addView(view3);
                }
                return defpackage.afbk.a;
            case 9:
                dmo.b((android.view.View) this.a, (defpackage.cxl) this.b);
                return defpackage.afbk.a;
            case 10:
                defpackage.bvm bvmVar = dnj.a;
                ?? r12 = this.a;
                dny dnyVar = (dny) this.b;
                dnyVar.d = r12;
                dnyVar.n();
                return new eoe(1);
            case 11:
                if (defpackage.afga.f((java.lang.String) obj, ((java.io.File) this.b).getName())) {
                    aiea.a((aiyx) this.a, defpackage.afbk.a);
                }
                return defpackage.afbk.a;
            case 12:
                defpackage.esk eskVar = (defpackage.esk) obj;
                eskVar.getClass();
                defpackage.ern ernVar = (defpackage.ern) this.b;
                eskVar.b(defpackage.erm.a, ernVar.a);
                eskVar.b(defpackage.erm.b, ernVar.b);
                eskVar.b(defpackage.ery.a, this.a);
                android.os.Bundle bundle = ernVar.c;
                if (bundle != null) {
                    eskVar.b(defpackage.erm.c, bundle);
                }
                return defpackage.afbk.a;
            case 13:
                evl evlVar = (evl) obj;
                evlVar.getClass();
                dne dneVar = new dne(12);
                defpackage.euf eufVar = new defpackage.euf();
                dneVar.invoke(eufVar);
                int i3 = eufVar.a;
                defpackage.evj evjVar = evlVar.a;
                evjVar.c = i3;
                evjVar.d = eufVar.b;
                evjVar.e = -1;
                evjVar.f = -1;
                java.lang.Object obj7 = this.a;
                if (obj7 instanceof defpackage.evg) {
                    java.util.Iterator itA = defpackage.ebm.f((defpackage.evf) obj7).a();
                    do {
                        java.lang.Object obj8 = this.b;
                        if (itA.hasNext()) {
                            evfVar = (defpackage.evf) itA.next();
                            evfVarB = ((defpackage.eva) obj8).b();
                        } else {
                            ewv ewvVar = ((defpackage.eva) obj8).b;
                            int i4 = defpackage.evg.b;
                            int iC = ((defpackage.evf) afsg.i(defpackage.ebm.e(ewvVar.f()))).c();
                            dne dneVar2 = new dne(13);
                            evlVar.d = iC;
                            usc uscVar = new usc();
                            dneVar2.invoke(uscVar);
                            evlVar.e = uscVar.a;
                        }
                    } while (!defpackage.afga.f(evfVar, evfVarB != null ? evfVarB.e : null));
                }
                return defpackage.afbk.a;
            case 14:
                defpackage.euw euwVar = (defpackage.euw) obj;
                euwVar.getClass();
                defpackage.evf evfVar2 = euwVar.a;
                if (true != (evfVar2 instanceof defpackage.evf)) {
                    evfVar2 = null;
                }
                if (evfVar2 == null) {
                    return null;
                }
                java.lang.Object obj9 = this.b;
                defpackage.evv evvVar = (defpackage.evv) this.a;
                defpackage.evf evfVarC = evvVar.c(evfVar2, euwVar.a(), (defpackage.evk) obj9);
                if (evfVarC == null) {
                    return null;
                }
                return defpackage.afga.f(evfVarC, evfVar2) ? euwVar : evvVar.f().a(evfVarC, evfVarC.d(euwVar.a()));
            case 15:
                this.b.s((java.util.concurrent.CancellationException) null);
                ((aiyl) this.a).j((flx) obj);
                return defpackage.afbk.a;
            case 16:
                return defpackage.kqe.A((java.lang.String) this.b, (java.lang.String) this.a, (fch) obj);
            case 17:
                fch fchVar = (fch) obj;
                fchVar.getClass();
                ((fnt) this.a).a.c(fchVar, this.b);
                return defpackage.afbk.a;
            case 18:
                return java.lang.Boolean.valueOf(defpackage.kqe.E((java.lang.String) this.b, (java.lang.String) this.a, (fch) obj));
            case 19:
                fch fchVar2 = (fch) obj;
                fchVar2.getClass();
                ((fnx) this.a).a.c(fchVar2, this.b);
                return defpackage.afbk.a;
            default:
                fch fchVar3 = (fch) obj;
                fchVar3.getClass();
                fbr fbrVarA = fchVar3.a((java.lang.String) this.b);
                try {
                    fbrVarA.h(1, (java.lang.String) this.a);
                    if (fbrVarA.k() && !fbrVarA.j(0)) {
                        lValueOf = java.lang.Long.valueOf(fbrVarA.b(0));
                        break;
                    }
                    return lValueOf;
                } finally {
                    fbrVarA.close();
                }
        }
    }

    public /* synthetic */ bpn(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ bpn(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ bpn(java.lang.String str, int i, byte[] bArr) {
        this.c = i;
        this.b = "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)";
        this.a = str;
    }

    public /* synthetic */ bpn(java.lang.String str, int i, char[] cArr) {
        this.c = i;
        this.b = "SELECT long_value FROM Preference where `key`=?";
        this.a = str;
    }
}
