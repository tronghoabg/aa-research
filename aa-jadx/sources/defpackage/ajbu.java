package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ajbu implements defpackage.aizk {
    final /* synthetic */ defpackage.aiyk a;
    final /* synthetic */ int b;

    public ajbu(defpackage.aiyk aiykVar, int i) {
        this.a = aiykVar;
        this.b = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.aizk
    public final java.lang.Object a(java.lang.Object obj, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.ajbt ajbtVar;
        if (afdkVar instanceof defpackage.ajbt) {
            ajbtVar = (defpackage.ajbt) afdkVar;
            int i = ajbtVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ajbtVar.c = i - Integer.MIN_VALUE;
            } else {
                ajbtVar = new defpackage.ajbt(this, afdkVar);
            }
        } else {
            ajbtVar = new defpackage.ajbt(this, afdkVar);
        }
        java.lang.Object obj2 = ajbtVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = ajbtVar.c;
        if (i2 == 0) {
            defpackage.afga.cz(obj2);
            defpackage.aiyk aiykVar = this.a;
            defpackage.afch afchVar = new defpackage.afch(this.b, obj);
            ajbtVar.c = 1;
            if (aiykVar.h(afchVar, ajbtVar) != afdrVar) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.afga.cz(obj2);
            return obj2;
        }
        defpackage.afga.cz(obj2);
        ajbtVar.c = 2;
        java.lang.Object objN = defpackage.afgz.n(ajbtVar);
        return objN == afdrVar ? afdrVar : objN;
    }
}
