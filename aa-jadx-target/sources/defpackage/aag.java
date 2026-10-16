package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class aag extends defpackage.afed implements defpackage.affg {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    int e;
    final /* synthetic */ defpackage.aah f;
    final /* synthetic */ defpackage.aaj g;
    private /* synthetic */ java.lang.Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aag(defpackage.aah aahVar, defpackage.aaj aajVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.f = aahVar;
        this.g = aajVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.aag aagVar = new defpackage.aag(this.f, this.g, afdkVar);
        aagVar.h = obj;
        return aagVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        aisr aisrVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        int i;
        java.lang.Object obj4;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        if (this.e != 0) {
            i = this.d;
            obj3 = this.c;
            java.lang.Object obj5 = this.b;
            obj2 = this.a;
            aisrVar = (aisr) this.h;
            defpackage.afga.cz(obj);
            obj4 = obj5;
        } else {
            defpackage.afga.cz(obj);
            aisrVar = (aisr) this.h;
            defpackage.aah aahVar = this.f;
            obj2 = this.g;
            defpackage.aaq aaqVar = aahVar.a;
            obj3 = aaqVar.c;
            i = aaqVar.e;
            obj4 = aahVar;
        }
        while (i != Integer.MAX_VALUE) {
            long j = ((long[]) obj3)[i] >> 31;
            ((defpackage.aaj) obj2).a = i;
            java.lang.Object obj6 = ((defpackage.aah) obj4).a.b[i];
            this.h = aisrVar;
            this.a = obj2;
            this.b = obj4;
            this.c = obj3;
            i = (int) (j & 2147483647L);
            this.d = i;
            this.e = 1;
            if (aisrVar.a(obj6, this) == afdrVar) {
                return afdrVar;
            }
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.aag) b((aisr) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
