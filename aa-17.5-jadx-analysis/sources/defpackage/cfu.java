package defpackage;

/* loaded from: classes.dex */
public final class cfu extends czz implements cfw {
    public final afeh a;

    public cfu(afeh afehVar) {
        super(null);
        this.a = afehVar;
    }

    @Override // defpackage.cfy
    public final /* synthetic */ cfy a(cfy cfyVar) {
        return cfyVar == cfy.e ? this : new cft(this, cfyVar);
    }

    @Override // defpackage.cfy
    public final /* synthetic */ Object b(Object obj, afeg afegVar) {
        return afegVar.invoke(obj, this);
    }

    @Override // defpackage.cfy
    public final /* synthetic */ boolean c(afec afecVar) {
        return ((Boolean) afecVar.invoke(this)).booleanValue();
    }
}
