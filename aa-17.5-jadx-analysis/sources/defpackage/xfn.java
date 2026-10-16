package defpackage;

import android.content.ComponentName;
import android.content.Intent;

/* loaded from: classes3.dex */
final class xfn {
    public boolean a;
    public lhl b;
    private final boolean c;
    private final yzz d;

    public xfn(boolean z) {
        this.c = z;
        this.d = z ? yzz.TRAMPOLINE_INITIAL : yzz.TRAMPOLINE_FALLBACK;
    }

    private static final void b(yzz yzzVar, yzy yzyVar) {
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzzVar, yzyVar).l());
    }

    public final void a() {
        if (!this.a) {
            ((ype) ((ype) xfo.a.g()).ai((char) 10241)).u("Not started. Cannot bounce.");
            return;
        }
        if (!lbh.d().gN()) {
            ((ype) ((ype) xfo.a.g()).ai((char) 10240)).u("Lifetime not started. Cannot bounce.");
            return;
        }
        yzz yzzVar = this.d;
        mpe mpeVarA = mpe.a();
        b(yzzVar, yzy.le);
        if (this.c) {
            nyl nylVarA = nyl.a();
            ComponentName componentNameA = map.a(kio.b().e(), true);
            nylVarA.a = componentNameA;
            yph yphVar = xfo.a;
            ((ype) yphVar.l().ai((char) 10245)).y("Starting startup activity %s", componentNameA.toShortString());
            try {
                mpeVarA.i(new Intent().setComponent(componentNameA));
                ((ype) yphVar.l().ai(10246)).y("Started startup activity %s", componentNameA.toShortString());
                return;
            } catch (Exception e) {
                ((ype) ((ype) ((ype) xfo.a.h()).p(e)).ai((char) 10247)).y("Failed to start startup activity %s", componentNameA.toShortString());
                b(this.d, yzy.lf);
            }
        }
        nyl.a();
        ComponentName componentName = mkn.s;
        yph yphVar2 = xfo.a;
        ((ype) yphVar2.l().ai((char) 10243)).y("Starting fallback activity %s", componentName.toShortString());
        mpeVarA.i(new Intent().setComponent(componentName));
        ((ype) yphVar2.l().ai((char) 10244)).y("Started fallback activity %s", componentName.toShortString());
    }
}
