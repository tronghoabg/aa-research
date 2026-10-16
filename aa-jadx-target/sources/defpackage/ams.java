package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ams extends defpackage.afee implements defpackage.affh {
    int a;
    final /* synthetic */ defpackage.affg b;
    final /* synthetic */ defpackage.amv c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ams(defpackage.affg affgVar, defpackage.amv amvVar, defpackage.afdk afdkVar) {
        super(3, afdkVar);
        this.b = affgVar;
        this.c = amvVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i = this.a;
        defpackage.afga.cz(obj);
        if (i == 0) {
            java.lang.Object obj2 = this.d;
            defpackage.affg affgVar = this.b;
            defpackage.ajy ajyVar = new defpackage.ajy(this.c, obj2, 2, null);
            this.a = 1;
            if (affgVar.invoke(ajyVar, this) == afdrVar) {
                return afdrVar;
            }
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affh
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.ams amsVar = new defpackage.ams(this.b, this.c, (defpackage.afdk) obj3);
        amsVar.d = (defpackage.amz) obj;
        return amsVar.hf(defpackage.afbk.a);
    }
}
