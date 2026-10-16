package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bii extends defpackage.afee implements defpackage.affg {
    final /* synthetic */ java.lang.Object a;
    private /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bii(defpackage.adi adiVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.a = adiVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        int i = this.c;
        if (i == 0) {
            defpackage.bii biiVar = new defpackage.bii((defpackage.jlj) this.a, afdkVar, 0);
            biiVar.b = obj;
            return biiVar;
        }
        java.lang.Object obj2 = this.a;
        if (i != 1) {
            defpackage.bii biiVar2 = new defpackage.bii((defpackage.ehp) obj2, afdkVar, 2);
            biiVar2.b = obj;
            return biiVar2;
        }
        defpackage.bii biiVar3 = new defpackage.bii((defpackage.adi) obj2, afdkVar, 1);
        biiVar3.b = obj;
        return biiVar3;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        int i = this.c;
        boolean z = false;
        if (i == 0) {
            defpackage.afga.cz(obj);
            aiuw aiuwVar = (aiuw) this.b;
            defpackage.jlj jljVar = (defpackage.jlj) this.a;
            java.util.concurrent.atomic.AtomicReference atomicReference = (java.util.concurrent.atomic.AtomicReference) jljVar.c;
            return java.lang.Boolean.valueOf(defpackage.a.o(atomicReference, ahoc.d(aiuwVar, (defpackage.afdo) null, 0, new defpackage.bej((aiwg) atomicReference.getAndSet(null), jljVar, (defpackage.afdk) null, 3), 3)));
        }
        if (i != 1) {
            defpackage.ehp ehpVar = (defpackage.ehp) this.b;
            defpackage.afga.cz(obj);
            if ((ehpVar instanceof defpackage.eez) && ((defpackage.eez) ehpVar).c <= ((defpackage.eez) this.a).c) {
                z = true;
            }
            return java.lang.Boolean.valueOf(z);
        }
        defpackage.afga.cz(obj);
        aiuw aiuwVar2 = (aiuw) this.b;
        defpackage.adi adiVar = (defpackage.adi) this.a;
        defpackage.cyx cyxVar = adiVar.r;
        if (cyxVar.f()) {
            ahoc.d(aiuwVar2, (defpackage.afdo) null, 0, new defpackage.adh(adiVar, (defpackage.afdk) null, 1, (byte[]) null), 3);
        }
        if (cyxVar.g()) {
            ahoc.d(aiuwVar2, (defpackage.afdo) null, 0, new defpackage.adh(adiVar, (defpackage.afdk) null, 0), 3);
        }
        if (cyxVar.i()) {
            ahoc.d(aiuwVar2, (defpackage.afdo) null, 0, new defpackage.adh(adiVar, (defpackage.afdk) null, 2, (char[]) null), 3);
        }
        if (cyxVar.h()) {
            ahoc.d(aiuwVar2, (defpackage.afdo) null, 0, new defpackage.adh(adiVar, (defpackage.afdk) null, 3, (short[]) null), 3);
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.c;
        if (i == 0) {
            return ((defpackage.bii) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        if (i != 1) {
            return ((defpackage.bii) b((defpackage.ehp) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        return ((defpackage.bii) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bii(defpackage.ehp ehpVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.a = ehpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bii(defpackage.jlj jljVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.c = i;
        this.a = jljVar;
    }
}
