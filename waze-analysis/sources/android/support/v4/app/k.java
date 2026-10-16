package android.support.v4.app;

import android.util.Log;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private final cz f346a;

    public k(cz czVar) {
        h.g.b.x.f(czVar, "operation");
        this.f346a = czVar;
    }

    static /* synthetic */ void d(cz czVar, v vVar) {
        if (bv.aM(2)) {
            Log.v("FragmentManager", e(czVar, "Transition for operation ", " has completed"));
        }
        czVar.j(vVar);
    }

    static /* synthetic */ String e(Object obj, String str, String str2) {
        return str + obj + str2;
    }

    static /* synthetic */ String f(Object obj, Object obj2, String str, String str2) {
        return str + obj2 + str2 + obj;
    }

    static /* synthetic */ String g(String str, String str2, String str3) {
        return str2 + str + str3;
    }

    public final cz b() {
        return this.f346a;
    }

    public final boolean c() {
        cy cyVarC;
        cz czVar = this.f346a;
        View view = czVar.c().mView;
        if (view != null) {
            cy cyVar = cy.f303a;
            cyVarC = android.support.v4.media.a.b.c(view);
        } else {
            cyVarC = null;
        }
        cy cyVarE = czVar.e();
        if (cyVarC == cyVarE) {
            return true;
        }
        cy cyVar2 = cy.f304b;
        return (cyVarC == cyVar2 || cyVarE == cyVar2) ? false : true;
    }
}
