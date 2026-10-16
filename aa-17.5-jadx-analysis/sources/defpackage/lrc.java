package defpackage;

import android.content.ComponentName;

/* loaded from: classes2.dex */
final class lrc implements eqn {
    public eqj a;
    final /* synthetic */ eql b;
    private eqj c;

    public lrc(eql eqlVar) {
        this.b = eqlVar;
    }

    @Override // defpackage.eqn
    public final /* synthetic */ void eS(Object obj) {
        ComponentName componentName = (ComponentName) obj;
        eqj eqjVar = this.c;
        if (eqjVar != null) {
            this.b.s(eqjVar);
            this.c = null;
        }
        eqj eqjVar2 = this.a;
        if (eqjVar2 != null) {
            this.b.s(eqjVar2);
            this.a = null;
        }
        if (componentName == null) {
            this.b.m(new lre(null, lok.c, null, false));
            return;
        }
        eqj eqjVarF = loy.j().f(componentName);
        this.c = eqjVarF;
        eql eqlVar = this.b;
        eqlVar.r(eqjVarF, new lrb(this, eqlVar, componentName, 2));
    }
}
