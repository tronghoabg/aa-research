package defpackage;

/* loaded from: classes.dex */
public final class bcg implements afeh {
    final /* synthetic */ akg a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ddo d;
    final /* synthetic */ afdr e;

    public bcg(akg akgVar, boolean z, boolean z2, ddo ddoVar, afdr afdrVar) {
        this.a = akgVar;
        this.b = z;
        this.c = z2;
        this.d = ddoVar;
        this.e = afdrVar;
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
        cfy cfyVarA = aki.a(cfy.e, asfVar, this.a).a(new bcf(this.b, asfVar, null, this.c, this.d, this.e));
        buxVar.o();
        return cfyVarA;
    }
}
