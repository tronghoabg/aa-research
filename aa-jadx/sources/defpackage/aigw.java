package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aigw {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public static final java.lang.Object a(defpackage.aizk aizkVar, defpackage.affh affhVar, java.lang.Throwable th, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.aizr aizrVar;
        if (afdkVar instanceof defpackage.aizr) {
            aizrVar = (defpackage.aizr) afdkVar;
            int i = aizrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aizrVar.c = i - Integer.MIN_VALUE;
            } else {
                aizrVar = new defpackage.aizr(afdkVar);
            }
        } else {
            aizrVar = new defpackage.aizr(afdkVar);
        }
        java.lang.Object obj = aizrVar.b;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = aizrVar.c;
        try {
            if (i2 == 0) {
                defpackage.afga.cz(obj);
                aizrVar.a = th;
                aizrVar.c = 1;
                java.lang.Object objInvoke = affhVar.invoke(aizkVar, th, aizrVar);
                th = th;
                if (objInvoke == afdrVar) {
                    return afdrVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Object obj2 = aizrVar.a;
                defpackage.afga.cz(obj);
                th = obj2;
            }
            return defpackage.afbk.a;
        } catch (java.lang.Throwable th2) {
            if (th != 0 && th != th2) {
                defpackage.adrs.E(th2, (java.lang.Throwable) th);
            }
            throw th2;
        }
    }

    public static final void b(defpackage.aizk aizkVar) {
        if (aizkVar instanceof defpackage.ajbe) {
            throw ((defpackage.ajbe) aizkVar).a;
        }
    }

    public static final boolean isDynamic(defpackage.aihl aihlVar) {
        aihlVar.getClass();
        return aihlVar.unwrap() instanceof defpackage.aigv;
    }
}
