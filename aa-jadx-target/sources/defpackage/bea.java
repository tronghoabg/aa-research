package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bea implements defpackage.affc {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ bea(defpackage.bvr bvrVar, defpackage.cda cdaVar, defpackage.aal aalVar, int i, int i2) {
        this.e = i2;
        this.c = bvrVar;
        this.d = cdaVar;
        this.b = aalVar;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [cub, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        int i = this.e;
        if (i != 0) {
            if (i == 1) {
                ((defpackage.bah) this.b).h((defpackage.epq) this.c, ((defpackage.afgt) this.d).a, this.a, ((java.lang.Integer) obj).intValue());
                return defpackage.afbk.a;
            }
            if (obj == this.c) {
                throw new java.lang.IllegalStateException("A derived state calculation cannot read itself");
            }
            if (obj instanceof defpackage.cfc) {
                int i2 = this.a;
                defpackage.aal aalVar = (defpackage.aal) this.b;
                aalVar.g(obj, java.lang.Math.min(((defpackage.cda) this.d).a - i2, aalVar.b(obj, Integer.MAX_VALUE)));
            }
            return defpackage.afbk.a;
        }
        defpackage.beb bebVar = (defpackage.beb) this.b;
        defpackage.cuw cuwVar = (defpackage.cuw) obj;
        defpackage.bfi bfiVar = (defpackage.bfi) bebVar.d.invoke();
        defpackage.dga dgaVar = bfiVar != null ? bfiVar.a : null;
        defpackage.dkg dkgVar = bebVar.c;
        int i3 = bebVar.b;
        int i4 = this.a;
        defpackage.cux cuxVar = (defpackage.cux) this.d;
        defpackage.cjj cjjVarP = defpackage.asq.P(cuwVar, i3, dkgVar, dgaVar, this.c.p() == defpackage.dlz.b, cuxVar.a);
        defpackage.bff bffVar = bebVar.a;
        bffVar.e(defpackage.apn.b, cjjVarP, i4, cuxVar.a);
        cuwVar.x(cuxVar, java.lang.Math.round(-bffVar.b()), 0);
        return defpackage.afbk.a;
    }

    public /* synthetic */ bea(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, int i2) {
        this.e = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.a = i;
    }
}
