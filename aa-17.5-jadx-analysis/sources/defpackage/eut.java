package defpackage;

/* loaded from: classes.dex */
public final class eut extends om {
    final /* synthetic */ euu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eut(euu euuVar) {
        super(false);
        this.a = euuVar;
    }

    @Override // defpackage.om
    public final void b() {
        ewp ewpVar = this.a.b;
        if (ewpVar.e.isEmpty()) {
            return;
        }
        euz euzVarE = ewpVar.e();
        euzVarE.getClass();
        ewpVar.t(euzVarE.c(), true);
    }
}
