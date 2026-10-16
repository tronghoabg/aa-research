package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bfb extends defpackage.afee implements defpackage.affh {
    int a;
    /* synthetic */ long b;
    final /* synthetic */ aiuw c;
    final /* synthetic */ defpackage.bwx d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfb(aiuw aiuwVar, defpackage.bwx bwxVar, defpackage.afdk afdkVar) {
        super(3, afdkVar);
        this.c = aiuwVar;
        this.d = bwxVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i = this.a;
        defpackage.afga.cz(obj);
        if (i == 0) {
            java.lang.Object obj2 = this.e;
            ahoc.d(this.c, (defpackage.afdo) null, 0, new defpackage.bfa(this.d, this.b, null), 3);
            this.a = 1;
            obj = ((defpackage.apq) obj2).o(this);
            if (obj == afdrVar) {
                return afdrVar;
            }
        }
        ahoc.d(this.c, (defpackage.afdo) null, 0, new defpackage.nic(this.d, ((java.lang.Boolean) obj).booleanValue(), (defpackage.afdk) null, 1), 3);
        return defpackage.afbk.a;
    }

    @Override // defpackage.affh
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        long j = ((defpackage.cji) obj2).a;
        defpackage.bfb bfbVar = new defpackage.bfb(this.c, this.d, (defpackage.afdk) obj3);
        bfbVar.e = (defpackage.apq) obj;
        bfbVar.b = j;
        return bfbVar.hf(defpackage.afbk.a);
    }
}
