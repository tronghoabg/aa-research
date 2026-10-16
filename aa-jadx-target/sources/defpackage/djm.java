package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class djm implements defpackage.afer {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ djm(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v42, types: [fbm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v72, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v81, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v86, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v90, types: [bys, java.lang.Object] */
    @Override // defpackage.afer
    public final java.lang.Object invoke() throws java.io.IOException {
        defpackage.yhe yheVarI;
        defpackage.yhe yheVarI2;
        java.lang.Object obj = null;
        int i = 1;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                java.lang.Object systemService = ((android.view.View) ((defpackage.ngb) this.a).c).getContext().getSystemService("input_method");
                systemService.getClass();
                return (android.view.inputmethod.InputMethodManager) systemService;
            case 1:
                java.util.List list = ((defpackage.dfj) this.a).c;
                if (!list.isEmpty()) {
                    obj = list.get(0);
                    float fA = ((defpackage.dfl) obj).a.a();
                    list.getClass();
                    int size = list.size() - 1;
                    if (size > 0) {
                        while (true) {
                            java.lang.Object obj2 = list.get(i);
                            float fA2 = ((defpackage.dfl) obj2).a.a();
                            int iCompare = java.lang.Float.compare(fA, fA2);
                            if (iCompare < 0) {
                                fA = fA2;
                            }
                            if (iCompare < 0) {
                                obj = obj2;
                            }
                            if (i != size) {
                                i++;
                            }
                        }
                    }
                }
                defpackage.dfl dflVar = (defpackage.dfl) obj;
                return java.lang.Float.valueOf(dflVar != null ? dflVar.a.a() : 0.0f);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return new android.view.inputmethod.BaseInputConnection(((defpackage.dkf) this.a).a, false);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return this.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.egp egpVar = (defpackage.egp) ((defpackage.egk) this.a).a;
                java.io.File canonicalFile = ((java.io.File) egpVar.e.invoke()).getCanonicalFile();
                synchronized (defpackage.egp.b) {
                    java.lang.String absolutePath = canonicalFile.getAbsolutePath();
                    java.util.Set set = defpackage.egp.a;
                    if (set.contains(absolutePath)) {
                        throw new java.lang.IllegalStateException(defpackage.a.bp(absolutePath, "There are multiple DataStores active for the same file: ", ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled)."));
                    }
                    absolutePath.getClass();
                    set.add(absolutePath);
                }
                canonicalFile.getClass();
                return new defpackage.egs(canonicalFile, egpVar.c, (defpackage.egw) egpVar.d.invoke(canonicalFile), new defpackage.djm(canonicalFile, 6));
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return ((defpackage.egk) this.a).k().a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.Object obj3 = this.a;
                synchronized (defpackage.egp.b) {
                    defpackage.egp.a.remove(((java.io.File) obj3).getAbsolutePath());
                }
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.epy epyVar = (defpackage.epy) this.a;
                ajba ajbaVarA = ajbb.a(epyVar.a());
                epyVar.c(new erk(ajbaVarA, 1));
                return new ajak(ajbaVarA, (aiwg) null);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ?? r9 = this.a;
                r9.getLifecycle().c(new defpackage.fbg(r9));
                return defpackage.afbk.a;
            case 9:
                if (((defpackage.jmj) this.a).b > 0) {
                    return defpackage.afbk.a;
                }
                throw new java.lang.IllegalStateException("Set association ID before exiting ASSOCIATING state.");
            case 10:
                java.lang.Object obj4 = this.a;
                android.view.View.OnClickListener onClickListener = ((com.google.android.apps.auto.components.coolwalk.compose.viewcompat.CarButton) obj4).a;
                if (onClickListener != null) {
                    onClickListener.onClick((android.view.View) obj4);
                }
                return defpackage.afbk.a;
            case 11:
                defpackage.lei leiVar = (defpackage.lei) this.a;
                return new defpackage.nrt(java.lang.Boolean.valueOf(leiVar.d()), java.lang.Boolean.valueOf(leiVar.d() && defpackage.acpp.a.fF().j()), java.lang.Boolean.valueOf(leiVar.d() && defpackage.acpp.a.fF().j()), defpackage.acpp.a.fF().j());
            case 12:
                defpackage.ntb ntbVarB = defpackage.nte.c().b();
                defpackage.mmi.c();
                java.lang.Object obj5 = this.a;
                if (defpackage.mmi.h()) {
                    yheVarI = defpackage.yhe.k(ntbVarB.r((defpackage.nta) ((defpackage.ngb) obj5).c), new com.google.android.gms.car.animation.ProjectionWindowAnimationParams(2130772046, false, null, 0));
                } else {
                    yheVarI = defpackage.acyc.Z() ? ((defpackage.ngb) obj5).i(ntbVarB) : defpackage.yhe.l(com.google.android.gms.car.display.CarRegionId.a, new com.google.android.gms.car.animation.ProjectionWindowAnimationParams(2130772026, false, null, 200), ntbVarB.r(defpackage.nta.s), new com.google.android.gms.car.animation.ProjectionWindowAnimationParams(2130772030, false, null, 0));
                }
                defpackage.rcx rcxVar = new defpackage.rcx();
                rcxVar.b(com.google.android.gms.car.display.CarRegionId.a, 0);
                rcxVar.b(ntbVarB.r((defpackage.nta) ((defpackage.ngb) obj5).c), 1);
                rcxVar.f(yheVarI);
                rcxVar.a = false;
                return rcxVar.a();
            case 13:
                defpackage.ntb ntbVarB2 = defpackage.nte.c().b();
                defpackage.mmi.c();
                java.lang.Object obj6 = this.a;
                if (defpackage.mmi.h()) {
                    yheVarI2 = defpackage.yhe.k(ntbVarB2.r((defpackage.nta) ((defpackage.ngb) obj6).c), new com.google.android.gms.car.animation.ProjectionWindowAnimationParams(2130772046, false, null, 0));
                } else {
                    yheVarI2 = defpackage.acyc.Z() ? ((defpackage.ngb) obj6).i(ntbVarB2) : defpackage.ync.a;
                }
                defpackage.rcx rcxVar2 = new defpackage.rcx();
                rcxVar2.b(com.google.android.gms.car.display.CarRegionId.a, 0);
                rcxVar2.b(ntbVarB2.r((defpackage.nta) ((defpackage.ngb) obj6).c), 1);
                rcxVar2.f(yheVarI2);
                rcxVar2.a = true;
                return rcxVar2.a();
            case 14:
                return new defpackage.oyq(this.a, i);
            case 15:
                defpackage.yqm yqmVar = defpackage.nif.a;
                return java.lang.Boolean.valueOf(!defpackage.afga.f((defpackage.nod) this.a.a(), defpackage.nod.a));
            case 16:
                java.lang.Object obj7 = this.a;
                defpackage.yqm yqmVar2 = defpackage.nif.a;
                return defpackage.lvs.R((defpackage.byj) obj7);
            case 17:
                defpackage.yqm yqmVar3 = defpackage.nif.a;
                return java.lang.Boolean.valueOf(((java.lang.Number) this.a.a()).intValue() == 2);
            case 18:
                defpackage.yqm yqmVar4 = defpackage.nif.a;
                defpackage.nyi nyiVar = (defpackage.nyi) this.a.a();
                return java.lang.Integer.valueOf(nyiVar != null ? nyiVar.b : 0);
            case 19:
                defpackage.yqm yqmVar5 = defpackage.nif.a;
                defpackage.nyi nyiVar2 = (defpackage.nyi) this.a.a();
                return java.lang.Boolean.valueOf(nyiVar2 != null ? nyiVar2.a : false);
            default:
                defpackage.afdo afdoVar = defpackage.tcu.a;
                defpackage.nkj nkjVar = (defpackage.nkj) this.a;
                defpackage.eqp eqpVar = nkjVar.g;
                eqpVar.getClass();
                return defpackage.tcu.v(nkjVar.a(eqpVar, defpackage.nkf.d, null, false), new defpackage.njy(15));
        }
    }
}
