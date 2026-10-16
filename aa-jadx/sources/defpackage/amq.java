package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class amq implements defpackage.aizk {
    final /* synthetic */ defpackage.afgv a;
    final /* synthetic */ defpackage.aiuw b;
    final /* synthetic */ defpackage.affg c;

    public amq(defpackage.afgv afgvVar, defpackage.aiuw aiuwVar, defpackage.affg affgVar) {
        this.a = afgvVar;
        this.b = aiuwVar;
        this.c = affgVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.aizk
    public final java.lang.Object a(java.lang.Object obj, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.amp ampVar;
        if (afdkVar instanceof defpackage.amp) {
            ampVar = (defpackage.amp) afdkVar;
            int i = ampVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ampVar.e = i - Integer.MIN_VALUE;
            } else {
                ampVar = new defpackage.amp(this, afdkVar);
            }
        } else {
            ampVar = new defpackage.amp(this, afdkVar);
        }
        java.lang.Object obj2 = ampVar.c;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = ampVar.e;
        if (i2 == 0) {
            defpackage.afga.cz(obj2);
            defpackage.aiwg aiwgVar = (defpackage.aiwg) this.a.a;
            if (aiwgVar != null) {
                aiwgVar.s(new defpackage.ami());
                ampVar.a = obj;
                ampVar.b = aiwgVar;
                ampVar.e = 1;
                if (aiwgVar.n(ampVar) == afdrVar) {
                    return afdrVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj3 = ampVar.b;
            obj = ampVar.a;
            defpackage.afga.cz(obj2);
        }
        java.lang.Object obj4 = obj;
        defpackage.afgv afgvVar = this.a;
        defpackage.aiuw aiuwVar = this.b;
        afgvVar.a = defpackage.ahoc.d(aiuwVar, null, 4, new defpackage.ait(this.c, obj4, aiuwVar, (defpackage.afdk) null, 5), 1);
        return defpackage.afbk.a;
    }
}
