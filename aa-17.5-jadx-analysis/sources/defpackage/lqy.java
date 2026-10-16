package defpackage;

import android.content.ComponentName;
import j$.util.Objects;

/* loaded from: classes.dex */
final class lqy implements eqn, epf {
    private ComponentName a;
    private boolean b;

    @Override // defpackage.eqn
    public final /* synthetic */ void eS(Object obj) {
        lqx lqxVar = (lqx) obj;
        ComponentName componentName = lqxVar.a;
        ComponentName componentName2 = lqxVar.b;
        yph yphVar = lqz.a;
        boolean z = this.b;
        this.b = true;
        ComponentName componentName3 = this.a;
        this.a = componentName2;
        if ((!Objects.equals(componentName3, componentName2) && z) || componentName == null || Objects.equals(componentName, this.a)) {
            return;
        }
        yph yphVar2 = lqz.a;
        ype ypeVar = (ype) yphVar2.l().ai(4207);
        ComponentName componentName4 = this.a;
        zjc zjcVar = zjc.a;
        ypeVar.M("Writing default app from %s to newly playing %s", new zjd(zjcVar, componentName4), new zjd(zjcVar, componentName));
        lgv.a().f(mpz.d, componentName);
        if (!lmi.a().e() || lqz.a(componentName)) {
            return;
        }
        ((ype) yphVar2.l().ai((char) 4208)).y("Writing default phone app to newly playing %s", new zjd(zjcVar, componentName));
        lgv.a().f(mpz.e, componentName);
    }

    @Override // defpackage.epf
    public final void fL(eqa eqaVar) {
        this.b = false;
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fM() {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fv(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fw(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fx(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fy(eqa eqaVar) {
    }
}
