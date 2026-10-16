package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ame extends defpackage.afee implements defpackage.affg {
    int a;
    /* synthetic */ long b;
    final /* synthetic */ defpackage.amf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ame(defpackage.amf amfVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.c = amfVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.ame ameVar = new defpackage.ame(this.c, afdkVar);
        ameVar.b = ((defpackage.cji) obj).a;
        return ameVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i = this.a;
        defpackage.afga.cz(obj);
        if (i != 0) {
            return obj;
        }
        long j = this.b;
        defpackage.amf amfVar = this.c;
        this.a = 1;
        java.lang.Object objI = amfVar.i(j, this);
        return objI == afdrVar ? afdrVar : objI;
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.ame) b(new defpackage.cji(((defpackage.cji) obj).a), (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
