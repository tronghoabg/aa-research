package defpackage;

/* loaded from: classes3.dex */
public final class tht extends afda {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ ncp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tht(ncp ncpVar, afck afckVar) {
        super(afckVar);
        this.c = ncpVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.v(this);
    }
}
