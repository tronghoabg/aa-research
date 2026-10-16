package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bgj extends defpackage.afee implements defpackage.affc {
    int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgj(defpackage.ana anaVar, defpackage.affh affhVar, defpackage.afdk afdkVar, int i) {
        super(1, afdkVar);
        this.d = i;
        this.b = anaVar;
        this.c = affhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [dhy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [efh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16, types: [affh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v21, types: [affg, java.lang.Object] */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        int i = this.d;
        int i2 = 2;
        byte[] bArr = null;
        if (i != 0) {
            if (i == 1) {
                defpackage.afdr afdrVar = defpackage.afdr.a;
                if (this.a != 0) {
                    defpackage.afga.cz(obj);
                } else {
                    defpackage.afga.cz(obj);
                    java.lang.Object obj2 = this.b;
                    defpackage.aln alnVar = new defpackage.aln(obj2, 5);
                    defpackage.amx amxVar = new defpackage.amx((defpackage.affh) this.c, (defpackage.ana) obj2, (defpackage.afdk) null, 1);
                    this.a = 1;
                    if (defpackage.amr.a(alnVar, amxVar, this) == afdrVar) {
                        return afdrVar;
                    }
                }
                defpackage.ana anaVar = (defpackage.ana) this.b;
                java.lang.Object objB = anaVar.n().b(anaVar.b());
                if (objB != null) {
                    if (java.lang.Math.abs(anaVar.b() - anaVar.n().a(objB)) < 0.5f) {
                        java.lang.Boolean.TRUE.booleanValue();
                        anaVar.m(objB);
                        anaVar.k(objB);
                    }
                }
                return defpackage.afbk.a;
            }
            if (i == 2) {
                java.lang.Object obj3 = defpackage.afdr.a;
                try {
                    if (this.a != 0) {
                        defpackage.afga.cz(obj);
                    } else {
                        defpackage.afga.cz(obj);
                        java.lang.Object obj4 = this.c;
                        java.lang.Object obj5 = this.b;
                        ((defpackage.bhp) obj4).d((defpackage.bho) obj5);
                        this.a = 1;
                        java.lang.Object objD = ((defpackage.bho) obj5).b.d(this);
                        if (objD != obj3) {
                            objD = defpackage.afbk.a;
                        }
                        if (objD == obj3) {
                            return obj3;
                        }
                    }
                    ((defpackage.bhp) this.c).d(null);
                    return defpackage.afbk.a;
                } catch (java.lang.Throwable th) {
                    ((defpackage.bhp) this.c).d(null);
                    throw th;
                }
            }
            if (i == 3) {
                defpackage.afdr afdrVar2 = defpackage.afdr.a;
                if (this.a != 0) {
                    defpackage.afga.cz(obj);
                    return obj;
                }
                defpackage.afga.cz(obj);
                java.lang.Object obj6 = this.b;
                ?? r1 = this.c;
                this.a = 1;
                java.lang.Object objC = ((defpackage.dhr) obj6).c(r1, this);
                return objC == afdrVar2 ? afdrVar2 : objC;
            }
            defpackage.afdr afdrVar3 = defpackage.afdr.a;
            int i3 = this.a;
            defpackage.afga.cz(obj);
            if (i3 == 0) {
                this.a = 1;
                obj = null;
            } else if (i3 != 1) {
                return obj;
            }
            defpackage.fdm fdmVar = (defpackage.fdm) obj;
            defpackage.ehu ehuVar = (defpackage.ehu) gT().get(defpackage.bwp.c);
            if (ehuVar != 0) {
                ehuVar.a(this.b);
            }
            defpackage.egk egkVar = (defpackage.egk) this.b;
            defpackage.ehu ehuVar2 = new defpackage.ehu(ehuVar, egkVar);
            defpackage.egg eggVar = new defpackage.egg(egkVar, (defpackage.affg) this.c, fdmVar, (defpackage.afdk) null, 0);
            this.a = 2;
            java.lang.Object objA = ahoc.a(ehuVar2, eggVar, this);
            return objA == afdrVar3 ? afdrVar3 : objA;
        }
        java.lang.Object obj7 = defpackage.afdr.a;
        try {
            if (this.a != 0) {
                defpackage.afga.cz(obj);
            } else {
                defpackage.afga.cz(obj);
                defpackage.bgi bgiVar = new defpackage.bgi();
                java.lang.Object obj8 = this.b;
                java.lang.Object obj9 = this.c;
                defpackage.ajz ajzVar = new defpackage.ajz(obj8, obj9, 11, bArr);
                defpackage.ajz ajzVar2 = new defpackage.ajz(obj8, obj9, 12, bArr);
                defpackage.bgk bgkVar = (defpackage.bgk) obj8;
                android.view.View view = bgkVar.a;
                defpackage.bgh bghVar = new defpackage.bgh(bgiVar, ajzVar, ajzVar2, view);
                android.os.Looper looperMyLooper = android.os.Looper.myLooper();
                android.os.Handler handler = view.getHandler();
                if (looperMyLooper != (handler != null ? handler.getLooper() : null)) {
                    java.lang.Runnable imxVar = bgkVar.g;
                    if (imxVar == null) {
                        imxVar = new defpackage.imx(obj8, (java.lang.Object) bghVar, (java.lang.Object) bgiVar, 1, (byte[]) null);
                        bgkVar.g = imxVar;
                    }
                    view.post(imxVar);
                } else {
                    android.view.ActionMode actionModeU = defpackage.axd.U(view, bghVar);
                    if (actionModeU == null) {
                        return defpackage.afbk.a;
                    }
                    bgkVar.f = actionModeU;
                }
                this.a = 1;
                java.lang.Object objD2 = bgiVar.a.d(this);
                if (objD2 != obj7) {
                    objD2 = defpackage.afbk.a;
                }
                if (objD2 == obj7) {
                    return obj7;
                }
            }
            java.lang.Object obj10 = this.b;
            defpackage.bgk bgkVar2 = (defpackage.bgk) obj10;
            bgkVar2.c.a();
            android.view.View view2 = bgkVar2.a;
            android.os.Looper looperMyLooper2 = android.os.Looper.myLooper();
            android.os.Handler handler2 = view2.getHandler();
            if (looperMyLooper2 != (handler2 != null ? handler2.getLooper() : null)) {
                java.lang.Runnable bgfVar = bgkVar2.h;
                if (bgfVar == null) {
                    bgfVar = new defpackage.bgf(obj10, i2);
                    bgkVar2.h = bgfVar;
                }
                view2.post(bgfVar);
            } else {
                android.view.ActionMode actionMode = bgkVar2.f;
                if (actionMode != null) {
                    actionMode.finish();
                }
            }
            java.lang.Runnable runnable = bgkVar2.g;
            if (runnable != null) {
                view2.removeCallbacks(runnable);
            }
            bgkVar2.f = null;
            return defpackage.afbk.a;
        } catch (java.lang.Throwable th2) {
            java.lang.Object obj11 = this.b;
            defpackage.bgk bgkVar3 = (defpackage.bgk) obj11;
            bgkVar3.c.a();
            android.view.View view3 = bgkVar3.a;
            android.os.Looper looperMyLooper3 = android.os.Looper.myLooper();
            android.os.Handler handler3 = view3.getHandler();
            if (looperMyLooper3 != (handler3 != null ? handler3.getLooper() : null)) {
                java.lang.Runnable bgfVar2 = bgkVar3.h;
                if (bgfVar2 == null) {
                    bgfVar2 = new defpackage.bgf(obj11, i2);
                    bgkVar3.h = bgfVar2;
                }
                view3.post(bgfVar2);
            } else {
                android.view.ActionMode actionMode2 = bgkVar3.f;
                if (actionMode2 != null) {
                    actionMode2.finish();
                }
            }
            java.lang.Runnable runnable2 = bgkVar3.g;
            if (runnable2 != null) {
                view3.removeCallbacks(runnable2);
            }
            bgkVar3.f = null;
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [bhs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [dhy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [affh, java.lang.Object] */
    @Override // defpackage.affc
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        int i = this.d;
        if (i == 0) {
            java.lang.Object obj2 = this.b;
            return new defpackage.bgj((defpackage.bgk) obj2, (defpackage.bhs) this.c, (defpackage.afdk) obj, 0).hf(defpackage.afbk.a);
        }
        if (i == 1) {
            java.lang.Object obj3 = this.b;
            return new defpackage.bgj((defpackage.ana) obj3, (defpackage.affh) this.c, (defpackage.afdk) obj, 1).hf(defpackage.afbk.a);
        }
        if (i == 2) {
            java.lang.Object obj4 = this.c;
            return new defpackage.bgj((defpackage.bhp) obj4, (defpackage.bho) this.b, (defpackage.afdk) obj, 2).hf(defpackage.afbk.a);
        }
        if (i != 3) {
            java.lang.Object obj5 = this.b;
            return new defpackage.bgj((defpackage.egk) obj5, (defpackage.affg) this.c, (defpackage.afdk) obj, 4).hf(defpackage.afbk.a);
        }
        java.lang.Object obj6 = this.b;
        return new defpackage.bgj((defpackage.dhr) obj6, (defpackage.dhy) this.c, (defpackage.afdk) obj, 3).hf(defpackage.afbk.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgj(defpackage.bgk bgkVar, defpackage.bhs bhsVar, defpackage.afdk afdkVar, int i) {
        super(1, afdkVar);
        this.d = i;
        this.b = bgkVar;
        this.c = bhsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgj(defpackage.bhp bhpVar, defpackage.bho bhoVar, defpackage.afdk afdkVar, int i) {
        super(1, afdkVar);
        this.d = i;
        this.c = bhpVar;
        this.b = bhoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgj(defpackage.dhr dhrVar, defpackage.dhy dhyVar, defpackage.afdk afdkVar, int i) {
        super(1, afdkVar);
        this.d = i;
        this.b = dhrVar;
        this.c = dhyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgj(defpackage.egk egkVar, defpackage.affg affgVar, defpackage.afdk afdkVar, int i) {
        super(1, afdkVar);
        this.d = i;
        this.b = egkVar;
        this.c = affgVar;
    }
}
