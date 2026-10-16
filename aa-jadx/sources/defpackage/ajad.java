package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajad implements defpackage.aizk {
    final /* synthetic */ defpackage.affg a;
    final /* synthetic */ defpackage.afgv b;

    public ajad(defpackage.affg affgVar, defpackage.afgv afgvVar) {
        this.a = affgVar;
        this.b = afgvVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.aizk
    public final java.lang.Object a(java.lang.Object obj, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.ajac ajacVar;
        if (afdkVar instanceof defpackage.ajac) {
            ajacVar = (defpackage.ajac) afdkVar;
            int i = ajacVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ajacVar.b = i - Integer.MIN_VALUE;
            } else {
                ajacVar = new defpackage.ajac(this, afdkVar);
            }
        } else {
            ajacVar = new defpackage.ajac(this, afdkVar);
        }
        java.lang.Object objInvoke = ajacVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = ajacVar.b;
        if (i2 == 0) {
            defpackage.afga.cz(objInvoke);
            defpackage.affg affgVar = this.a;
            ajacVar.d = obj;
            ajacVar.b = 1;
            objInvoke = affgVar.invoke(obj, ajacVar);
            if (objInvoke == afdrVar) {
                return afdrVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = ajacVar.d;
            defpackage.afga.cz(objInvoke);
        }
        if (!((java.lang.Boolean) objInvoke).booleanValue()) {
            return defpackage.afbk.a;
        }
        this.b.a = obj;
        throw new defpackage.ajbf(this);
    }
}
