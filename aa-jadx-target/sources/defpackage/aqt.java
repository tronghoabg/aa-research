package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class aqt extends defpackage.afed implements defpackage.affg {
    java.lang.Object a;
    int b;
    final /* synthetic */ aiuw c;
    final /* synthetic */ defpackage.affh d;
    final /* synthetic */ defpackage.affc e;
    final /* synthetic */ defpackage.apq f;
    private /* synthetic */ java.lang.Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqt(aiuw aiuwVar, defpackage.affh affhVar, defpackage.affc affcVar, defpackage.apq apqVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.c = aiuwVar;
        this.d = affhVar;
        this.e = affcVar;
        this.f = apqVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.aqt aqtVar = new defpackage.aqt(this.c, this.d, this.e, this.f, afdkVar);
        aqtVar.g = obj;
        return aqtVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.cru cruVar;
        aiwg aiwgVarD;
        java.lang.Object objA;
        aiwg aiwgVar;
        java.lang.Object objD;
        aiwg aiwgVar2;
        defpackage.crd crdVar;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i = this.b;
        if (i == 0) {
            defpackage.afga.cz(obj);
            cruVar = (defpackage.cru) this.g;
            aiwgVarD = ahoc.d(this.c, (defpackage.afdo) null, 4, new defpackage.adh(this.f, (defpackage.afdk) null, 10), 1);
            this.g = cruVar;
            this.a = aiwgVarD;
            this.b = 1;
            defpackage.affh affhVar = defpackage.arc.a;
            objA = defpackage.arc.a(cruVar, true, defpackage.cqv.b, this);
            if (objA != afdrVar) {
            }
            aiwgVar = aiwgVarD;
            return afdrVar;
        }
        if (i != 1) {
            aiwg aiwgVar3 = (aiwg) this.g;
            defpackage.afga.cz(obj);
            objD = obj;
            aiwgVar2 = aiwgVar3;
        } else {
            java.lang.Object obj2 = this.a;
            cruVar = (defpackage.cru) this.g;
            defpackage.afga.cz(obj);
            objA = obj;
            aiwgVar = obj2;
        }
        crdVar = (defpackage.crd) objD;
        if (crdVar == null) {
            aiuw aiuwVar = this.c;
            defpackage.aiv aivVar = new defpackage.aiv(this.f, (defpackage.afdk) null, 2);
            defpackage.affh affhVar2 = defpackage.arc.a;
            ahoc.d(aiuwVar, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, aivVar, (defpackage.afdk) null, 0), 1);
        } else {
            crdVar.b();
            aiuw aiuwVar2 = this.c;
            defpackage.aiv aivVar2 = new defpackage.aiv(this.f, (defpackage.afdk) null, 3, (byte[]) null);
            defpackage.affh affhVar3 = defpackage.arc.a;
            ahoc.d(aiuwVar2, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, aivVar2, (defpackage.afdk) null, 0), 1);
            this.e.invoke(new defpackage.cji(crdVar.c));
        }
        return defpackage.afbk.a;
        aiwgVar = aiwgVarD;
        defpackage.crd crdVar2 = (defpackage.crd) objA;
        crdVar2.b();
        defpackage.affh affhVar4 = this.d;
        if (affhVar4 != defpackage.arc.a) {
            ahoc.d(this.c, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar, new defpackage.ait(affhVar4, this.f, crdVar2, (defpackage.afdk) null, 7), (defpackage.afdk) null, 0), 1);
        }
        this.g = aiwgVar;
        this.a = null;
        this.b = 2;
        objD = defpackage.arc.d(cruVar, defpackage.cqv.b, this);
        if (objD != afdrVar) {
            aiwgVar2 = aiwgVar;
            crdVar = (defpackage.crd) objD;
            if (crdVar == null) {
                aiuw aiuwVar3 = this.c;
                defpackage.aiv aivVar3 = new defpackage.aiv(this.f, (defpackage.afdk) null, 2);
                defpackage.affh affhVar5 = defpackage.arc.a;
                ahoc.d(aiuwVar3, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, aivVar3, (defpackage.afdk) null, 0), 1);
            } else {
                crdVar.b();
                aiuw aiuwVar4 = this.c;
                defpackage.aiv aivVar4 = new defpackage.aiv(this.f, (defpackage.afdk) null, 3, (byte[]) null);
                defpackage.affh affhVar6 = defpackage.arc.a;
                ahoc.d(aiuwVar4, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, aivVar4, (defpackage.afdk) null, 0), 1);
                this.e.invoke(new defpackage.cji(crdVar.c));
            }
            return defpackage.afbk.a;
        }
        aiwgVar = aiwgVarD;
        return afdrVar;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.aqt) b((defpackage.cru) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
