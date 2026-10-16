package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class noa extends defpackage.afee implements defpackage.affg {
    final /* synthetic */ defpackage.nod a;
    final /* synthetic */ defpackage.bwx b;
    final /* synthetic */ defpackage.bwx c;
    final /* synthetic */ defpackage.cit d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public noa(defpackage.nod nodVar, defpackage.bwx bwxVar, defpackage.bwx bwxVar2, defpackage.cit citVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.a = nodVar;
        this.b = bwxVar;
        this.c = bwxVar2;
        this.d = citVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        return new defpackage.noa(this.a, this.b, this.c, this.d, afdkVar);
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afga.cz(obj);
        defpackage.bwx bwxVar = this.b;
        defpackage.nod nodVar = this.a;
        if (!defpackage.afga.f(nodVar, bwxVar.a())) {
            defpackage.bwx bwxVar2 = this.c;
            if ((bwxVar2.a() == defpackage.nnk.c && nodVar.o == null) || ((bwxVar2.a() == defpackage.nnk.d && nodVar.p == null) || (bwxVar2.a() == defpackage.nnk.e && nodVar.q == null))) {
                this.d.a(7);
                bwxVar.b(nodVar);
            }
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.noa) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
