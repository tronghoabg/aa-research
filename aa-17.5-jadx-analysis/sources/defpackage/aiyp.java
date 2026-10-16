package defpackage;

/* loaded from: classes3.dex */
final class aiyp extends afde implements afeg {
    /* synthetic */ Object a;
    final /* synthetic */ affv b;
    final /* synthetic */ aixx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiyp(affv affvVar, aixx aixxVar, afck afckVar) {
        super(2, afckVar);
        this.b = affvVar;
        this.c = aixxVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        aiyp aiypVar = new aiyp(this.b, this.c, afckVar);
        aiypVar.a = ((aixp) obj).b;
        return aiypVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        Object obj2 = this.a;
        boolean z = obj2 instanceof aixo;
        affv affvVar = this.b;
        if (!z) {
            affvVar.a = obj2;
        }
        aixx aixxVar = this.c;
        if (z) {
            Throwable thB = aixp.b(obj2);
            if (thB != null) {
                throw thB;
            }
            aixxVar.s(new ajas());
            affvVar.a = ajbb.c;
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aiyp) b(new aixp(((aixp) obj).b), (afck) obj2)).hT(afak.a);
    }
}
