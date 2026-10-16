package defpackage;

import android.content.ComponentName;

/* loaded from: classes2.dex */
public final class lrd implements eqn {
    final /* synthetic */ eql a;
    private eqj b;
    private final /* synthetic */ int c;

    public lrd(eql eqlVar, int i) {
        this.c = i;
        this.a = eqlVar;
    }

    @Override // defpackage.eqn
    public final /* synthetic */ void eS(Object obj) {
        if (this.c == 0) {
            ComponentName componentName = (ComponentName) obj;
            eqj eqjVar = this.b;
            if (eqjVar != null) {
                this.a.s(eqjVar);
                this.b = null;
            }
            if (componentName == null) {
                this.a.m(new lra(null, null));
                return;
            }
            eqj eqjVarC = tby.C(tby.v(loy.j().f(componentName), new lqc(7)), new lqc(8));
            this.b = eqjVarC;
            eql eqlVar = this.a;
            eqlVar.r(eqjVarC, new jue(eqlVar, componentName, 5));
            return;
        }
        lol lolVar = (lol) obj;
        eqj eqjVar2 = this.b;
        if (eqjVar2 != null) {
            this.a.s(eqjVar2);
            this.b = null;
        }
        if (!(lolVar instanceof lod)) {
            this.a.m(new lqi(lolVar.e(), null, null, null));
            return;
        }
        lod lodVar = (lod) lolVar;
        eqj eqjVarD = tby.d(lodVar.e, lodVar.f, new kus(lodVar, 13));
        this.b = eqjVarD;
        eql eqlVar2 = this.a;
        eqlVar2.r(eqjVarD, new lnc(eqlVar2, 6));
    }
}
