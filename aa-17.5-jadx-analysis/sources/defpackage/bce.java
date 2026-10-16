package defpackage;

/* loaded from: classes.dex */
public final class bce extends cfx implements dcs, cws {
    public final ane a;
    private boolean b;

    public bce(ane aneVar) {
        this.a = aneVar;
    }

    public static final cjb b(bce bceVar, cst cstVar, afdr afdrVar) {
        Object objInvoke;
        if (bceVar.A && bceVar.b) {
            cst cstVarO = bzi.o(bceVar);
            if (true != cstVar.t()) {
                cstVar = null;
            }
            if (cstVar != null && (objInvoke = afdrVar.invoke()) != null) {
                return ((cjb) objInvoke).f(cstVarO.o(cstVar, false).c());
            }
        }
        return null;
    }

    @Override // defpackage.dcs
    public final Object d(cst cstVar, afdr afdrVar, afck afckVar) {
        Object objA = ahni.a(new bcd(this, cstVar, afdrVar, new axf(this, cstVar, afdrVar, 3), null), afckVar);
        return objA == afcr.a ? objA : afak.a;
    }

    @Override // defpackage.cws
    public final void f(cst cstVar) {
        this.b = true;
    }

    @Override // defpackage.cfx
    public final boolean x() {
        return false;
    }

    @Override // defpackage.cxs
    public final /* synthetic */ void et(long j) {
    }
}
