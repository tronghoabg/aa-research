package defpackage;

/* loaded from: classes.dex */
public final class bbq implements cus {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bbq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.cfy
    public final /* synthetic */ cfy a(cfy cfyVar) {
        return this.b != 0 ? cfyVar == cfy.e ? this : new cft(this, cfyVar) : czz.ac(this, cfyVar);
    }

    @Override // defpackage.cfy
    public final /* synthetic */ Object b(Object obj, afeg afegVar) {
        return this.b != 0 ? afegVar.invoke(obj, this) : afegVar.invoke(obj, this);
    }

    @Override // defpackage.cfy
    public final /* synthetic */ boolean c(afec afecVar) {
        return this.b != 0 ? ((Boolean) afecVar.invoke(this)).booleanValue() : czz.ab(this, afecVar);
    }

    @Override // defpackage.cus
    public final void d(cxb cxbVar) {
        int i = this.b;
        Object obj = this.a;
        if (i != 0) {
            ((axr) obj).r = cxbVar;
        } else {
            ((bbt) obj).u.b(cxbVar);
        }
    }
}
