package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ahoe {
    private ahoe() {
    }

    public static final defpackage.aiug a(defpackage.afdk afdkVar) {
        defpackage.aiug aiugVar;
        if (!(afdkVar instanceof defpackage.ajda)) {
            return new defpackage.aiug(afdkVar, 1);
        }
        defpackage.aitx aitxVar = ((defpackage.ajda) afdkVar).f;
        while (true) {
            java.lang.Object obj = aitxVar.a;
            if (obj == null) {
                aitxVar.c(defpackage.ajdb.b);
                aiugVar = null;
                break;
            }
            if (obj instanceof defpackage.aiug) {
                if (aitxVar.d(obj, defpackage.ajdb.b)) {
                    aiugVar = (defpackage.aiug) obj;
                    break;
                }
            } else if (obj != defpackage.ajdb.b && !(obj instanceof java.lang.Throwable)) {
                java.util.Objects.toString(obj);
                throw new java.lang.IllegalStateException("Inconsistent state ".concat(obj.toString()));
            }
        }
        if (aiugVar == null) {
            return new defpackage.aiug(afdkVar, 2);
        }
        boolean z = defpackage.aiuy.a;
        defpackage.aitx aitxVar2 = aiugVar.d;
        java.lang.Object obj2 = aitxVar2.a;
        if (obj2 instanceof defpackage.aiun) {
            java.lang.Object obj3 = ((defpackage.aiun) obj2).d;
        }
        aiugVar.c.b = 536870911;
        aitxVar2.c(defpackage.aiua.a);
        return aiugVar;
    }

    public static final void b(defpackage.aiuf aiufVar, defpackage.aivn aivnVar) {
        ((defpackage.aiug) aiufVar).A(new defpackage.aivo(aivnVar, 0));
    }

    public final defpackage.ahof topLevel(defpackage.ahoj ahojVar) {
        ahojVar.getClass();
        return new defpackage.ahof(defpackage.ahoh.Companion.topLevel(ahojVar));
    }

    public /* synthetic */ ahoe(defpackage.affu affuVar) {
        this();
    }
}
