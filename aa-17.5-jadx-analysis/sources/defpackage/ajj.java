package defpackage;

/* loaded from: classes.dex */
public final class ajj implements afeh {
    final /* synthetic */ akg a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ddo c;
    final /* synthetic */ afdr d;

    public ajj(akg akgVar, boolean z, ddo ddoVar, afdr afdrVar) {
        this.a = akgVar;
        this.b = z;
        this.c = ddoVar;
        this.d = afdrVar;
    }

    @Override // defpackage.afeh
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        bux buxVar = (bux) obj2;
        ((Number) obj3).intValue();
        buxVar.v(-1525724089);
        Object objG = buxVar.g();
        if (objG == buw.a) {
            objG = new asg();
            buxVar.x(objG);
        }
        asf asfVar = (asf) objG;
        cfy cfyVarA = aki.a(cfy.e, asfVar, this.a).a(new aji(asfVar, null, false, this.b, null, this.c, this.d));
        buxVar.o();
        return cfyVarA;
    }
}
