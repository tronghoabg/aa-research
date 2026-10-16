package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gjl implements defpackage.aizk {
    final /* synthetic */ defpackage.aqk a;

    public gjl(defpackage.aqk aqkVar) {
        this.a = aqkVar;
    }

    @Override // defpackage.aizk
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, defpackage.afdk afdkVar) {
        return b(((java.lang.Number) obj).floatValue(), afdkVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(float f, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.gjk gjkVar;
        if (afdkVar instanceof defpackage.gjk) {
            gjkVar = (defpackage.gjk) afdkVar;
            int i = gjkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gjkVar.c = i - Integer.MIN_VALUE;
            } else {
                gjkVar = new defpackage.gjk(this, afdkVar);
            }
        } else {
            gjkVar = new defpackage.gjk(this, afdkVar);
        }
        java.lang.Object obj = gjkVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = gjkVar.c;
        if (i2 == 0) {
            defpackage.afga.cz(obj);
            defpackage.aqk aqkVar = this.a;
            gjkVar.c = 1;
            if (defpackage.ca.aD(aqkVar, f, gjkVar) == afdrVar) {
                return afdrVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.afga.cz(obj);
        }
        return defpackage.afbk.a;
    }
}
