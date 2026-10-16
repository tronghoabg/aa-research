package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class giz implements aizk {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public giz(defpackage.afgv afgvVar, aiuw aiuwVar, defpackage.gja gjaVar, int i) {
        this.d = i;
        this.a = afgvVar;
        this.b = aiuwVar;
        this.c = gjaVar;
    }

    /* JADX WARN: Type inference failed for: r5v12, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [aiuw, java.lang.Object] */
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, defpackage.afdk afdkVar) {
        boolean zBooleanValue = false;
        if (this.d != 0) {
            if (((java.lang.Boolean) obj).booleanValue()) {
                defpackage.affg affgVar = (defpackage.affg) this.b.a();
                defpackage.agn agnVar = (defpackage.agn) this.c;
                zBooleanValue = ((java.lang.Boolean) affgVar.invoke(agnVar.e(), agnVar.g())).booleanValue();
            }
            ((defpackage.bxj) this.a).b(java.lang.Boolean.valueOf(zBooleanValue));
            return defpackage.afbk.a;
        }
        defpackage.asi asiVar = (defpackage.asi) obj;
        if (asiVar instanceof defpackage.asn) {
            java.lang.Object obj2 = this.a;
            ?? r6 = this.b;
            defpackage.gja gjaVar = (defpackage.gja) this.c;
            ((defpackage.afgv) obj2).a = ahoc.d((aiuw) r6, (defpackage.afdo) null, 0, new defpackage.dnf(gjaVar, (defpackage.afdk) null, 8), 3);
            defpackage.afer aferVar = gjaVar.b;
            if (aferVar != null) {
                aferVar.invoke();
            }
        } else if (asiVar instanceof defpackage.aso) {
            defpackage.afgv afgvVar = (defpackage.afgv) this.a;
            aiwg aiwgVar = (aiwg) afgvVar.a;
            if (aiwgVar != null) {
                aiwgVar.s((java.util.concurrent.CancellationException) null);
            }
            afgvVar.a = null;
            defpackage.afer aferVar2 = ((defpackage.gja) this.c).c;
            if (aferVar2 != null) {
                aferVar2.invoke();
            }
        } else if (asiVar instanceof defpackage.asm) {
            defpackage.afgv afgvVar2 = (defpackage.afgv) this.a;
            aiwg aiwgVar2 = (aiwg) afgvVar2.a;
            if (aiwgVar2 != null) {
                aiwgVar2.s((java.util.concurrent.CancellationException) null);
            }
            afgvVar2.a = null;
            defpackage.afer aferVar3 = ((defpackage.gja) this.c).d;
            if (aferVar3 != null) {
                aferVar3.invoke();
            }
        }
        return defpackage.afbk.a;
    }

    public giz(defpackage.bxj bxjVar, defpackage.agn agnVar, defpackage.bys bysVar, int i) {
        this.d = i;
        this.a = bxjVar;
        this.c = agnVar;
        this.b = bysVar;
    }
}
