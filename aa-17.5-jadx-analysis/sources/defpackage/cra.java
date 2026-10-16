package defpackage;

/* loaded from: classes.dex */
public final class cra implements cfw {
    public afec a;
    public boolean b;
    public final cqx c = new cqx(this);
    public mij d;

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

    public final afec d() {
        afec afecVar = this.a;
        if (afecVar != null) {
            return afecVar;
        }
        affa.d("onTouchEvent");
        return null;
    }
}
