package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class aas extends defpackage.afed implements defpackage.affg {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    int d;
    final /* synthetic */ defpackage.aat e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aas(defpackage.aat aatVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.e = aatVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.aas aasVar = new defpackage.aas(this.e, afdkVar);
        aasVar.f = obj;
        return aasVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        aisr aisrVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        int i;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        if (this.d != 0) {
            i = this.c;
            obj3 = this.b;
            obj2 = this.a;
            aisrVar = (aisr) this.f;
            defpackage.afga.cz(obj);
        } else {
            defpackage.afga.cz(obj);
            aisrVar = (aisr) this.f;
            defpackage.aaq aaqVar = this.e.b;
            obj2 = aaqVar.b;
            obj3 = aaqVar.c;
            i = aaqVar.e;
        }
        while (i != Integer.MAX_VALUE) {
            long j = ((long[]) obj3)[i] >> 31;
            java.lang.Object obj4 = ((java.lang.Object[]) obj2)[i];
            this.f = aisrVar;
            this.a = obj2;
            this.b = obj3;
            i = (int) (j & 2147483647L);
            this.c = i;
            this.d = 1;
            if (aisrVar.a(obj4, this) == afdrVar) {
                return afdrVar;
            }
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.aas) b((aisr) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
