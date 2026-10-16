package defpackage;

import defpackage.cfx;

/* loaded from: classes.dex */
public abstract class cxt<N extends cfx> implements cfw {
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

    public abstract cfx d();

    public abstract void e(cfx cfxVar);
}
