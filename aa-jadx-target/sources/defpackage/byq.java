package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class byq implements aizk {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public byq(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Type inference failed for: r5v23, types: [aizk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [aizk, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.efo efoVar;
        java.lang.Object objA;
        int i = this.b;
        if (i == 0) {
            ((defpackage.bxj) this.a).b(obj);
            return defpackage.afbk.a;
        }
        if (i == 1) {
            ((defpackage.bxj) this.a).b(obj);
            return defpackage.afbk.a;
        }
        if (i != 2) {
            return ((((defpackage.asi) obj) instanceof defpackage.asn) && (objA = this.a.a(obj, afdkVar)) == defpackage.afdr.a) ? objA : defpackage.afbk.a;
        }
        if (afdkVar instanceof defpackage.efo) {
            efoVar = (defpackage.efo) afdkVar;
            int i2 = efoVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                efoVar.b = i2 - Integer.MIN_VALUE;
            } else {
                efoVar = new defpackage.efo(this, afdkVar);
            }
        } else {
            efoVar = new defpackage.efo(this, afdkVar);
        }
        java.lang.Object obj2 = efoVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i3 = efoVar.b;
        if (i3 == 0) {
            defpackage.afga.cz(obj2);
            ?? r5 = this.a;
            defpackage.ehp ehpVar = (defpackage.ehp) obj;
            if (ehpVar instanceof defpackage.ehe) {
                throw ((defpackage.ehe) ehpVar).a;
            }
            if (!(ehpVar instanceof defpackage.eez)) {
                if ((ehpVar instanceof defpackage.egv) || (ehpVar instanceof defpackage.ehs) || (ehpVar instanceof defpackage.ehc)) {
                    throw new java.lang.IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                }
                throw new defpackage.afas();
            }
            java.lang.Object obj3 = ((defpackage.eez) ehpVar).a;
            efoVar.c = null;
            efoVar.d = null;
            efoVar.e = null;
            efoVar.f = null;
            efoVar.g = 0;
            efoVar.b = 1;
            if (r5.a(obj3, efoVar) == afdrVar) {
                return afdrVar;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = efoVar.g;
            java.lang.Object obj4 = efoVar.f;
            java.lang.Object obj5 = efoVar.e;
            java.lang.Object obj6 = efoVar.d;
            java.lang.Object obj7 = efoVar.c;
            defpackage.afga.cz(obj2);
        }
        return defpackage.afbk.a;
    }
}
