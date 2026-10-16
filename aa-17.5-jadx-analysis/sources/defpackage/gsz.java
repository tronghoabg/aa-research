package defpackage;

import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class gsz implements gsy {
    private static final yob a = yob.c("com/android/car/libraries/apphost/nav/manager/impl/AppNavigationManagerImpl");
    private final geu b;
    private final Supplier c;

    public gsz(geu geuVar, Supplier supplier) {
        this.b = geuVar;
        this.c = supplier;
    }

    @Override // defpackage.gsy
    public final void a() {
        if (((gmh) ((jwq) this.b).c).b) {
            ((ynz) a.e().ai(86)).u("stopNavigation called in AppNavigationManagerImpl on navigation app");
            gsr gsrVar = null;
            try {
                fuh fuhVarA = ((fug) this.c.get()).a("navigation");
                if (fuhVarA instanceof gsr) {
                    gsrVar = (gsr) fuhVarA;
                }
            } catch (IllegalStateException e) {
                ((ynz) ((ynz) a.h()).p(e).ai(87)).u("stopNavigation was called when navigation host was not available.");
            }
            if (gsrVar == null) {
                return;
            }
            gsrVar.c.b(this.b);
            gsrVar.d.a();
        }
    }
}
