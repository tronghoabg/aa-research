package defpackage;

import android.content.ComponentName;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class lml implements eqn {
    public final /* synthetic */ lmm a;
    private final eqn b = new lkn(2);
    private final eqn c = new kqc(this, 14);
    private eqj d;
    private eqj e;

    public lml(lmm lmmVar) {
        this.a = lmmVar;
    }

    public final void b() {
        eqj eqjVar = this.d;
        if (eqjVar != null) {
            eqjVar.k(this.b);
            this.d = null;
        }
        eqj eqjVar2 = this.e;
        if (eqjVar2 != null) {
            eqjVar2.k(this.c);
            this.e = null;
        }
    }

    @Override // defpackage.eqn
    public final /* bridge */ /* synthetic */ void eS(Object obj) {
        ComponentName componentName = (ComponentName) obj;
        b();
        lmm lmmVar = this.a;
        ComponentName componentName2 = lmmVar.a;
        if (componentName2 != null) {
            lmmVar.f.remove(componentName2);
        }
        lmmVar.a = componentName;
        lmmVar.b = false;
        if (componentName != null) {
            eqj eqjVarF = loy.j().f(componentName);
            this.d = eqjVarF;
            eqjVarF.fE(lmmVar, this.b);
        }
        Iterator it = lmmVar.e.iterator();
        while (it.hasNext()) {
            ((ljr) it.next()).a(componentName);
        }
        if (componentName != null) {
            eqj eqjVarA = lom.a(componentName);
            this.e = eqjVarA;
            eqjVarA.fE(lmmVar, this.c);
        }
    }
}
