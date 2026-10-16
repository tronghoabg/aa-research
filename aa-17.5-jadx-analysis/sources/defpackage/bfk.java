package defpackage;

/* loaded from: classes.dex */
public final class bfk implements cul {
    public final cdt a;

    public bfk(cdt cdtVar) {
        this.a = cdtVar;
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

    @Override // defpackage.cul
    public final /* bridge */ /* synthetic */ Object d() {
        return this;
    }
}
