package android.support.v4.app;

import android.util.Log;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class cw extends cz {

    /* renamed from: a, reason: collision with root package name */
    private final cd f298a;

    /* JADX WARN: Illegal instructions before constructor call */
    public cw(cy cyVar, cx cxVar, cd cdVar) {
        h.g.b.x.f(cyVar, "finalState");
        h.g.b.x.f(cxVar, "lifecycleImpact");
        h.g.b.x.f(cdVar, "fragmentStateManager");
        ar arVarC = cdVar.c();
        h.g.b.x.e(arVarC, "getFragment(...)");
        super(cyVar, cxVar, arVarC);
        this.f298a = cdVar;
    }

    @Override // android.support.v4.app.cz
    public final void a() {
        super.a();
        c().mTransitioning = false;
        this.f298a.g();
    }

    @Override // android.support.v4.app.cz
    public final void b() {
        if (q()) {
            return;
        }
        super.b();
        if (d() != cx.f300b) {
            if (d() == cx.f301c) {
                ar arVarC = this.f298a.c();
                h.g.b.x.e(arVarC, "getFragment(...)");
                View viewRequireView = arVarC.requireView();
                h.g.b.x.e(viewRequireView, "requireView(...)");
                if (bv.aM(2)) {
                    Log.v("FragmentManager", "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + arVarC);
                }
                viewRequireView.clearFocus();
                return;
            }
            return;
        }
        cd cdVar = this.f298a;
        ar arVarC2 = cdVar.c();
        h.g.b.x.e(arVarC2, "getFragment(...)");
        View viewFindFocus = arVarC2.mView.findFocus();
        if (viewFindFocus != null) {
            arVarC2.setFocusedView(viewFindFocus);
            if (bv.aM(2)) {
                Log.v("FragmentManager", k.f(arVarC2, viewFindFocus, "requestFocus: Saved focused view ", " for Fragment "));
            }
        }
        View viewRequireView2 = c().requireView();
        h.g.b.x.e(viewRequireView2, "requireView(...)");
        if (viewRequireView2.getParent() == null) {
            if (bv.aM(2)) {
                Log.v("FragmentManager", "Adding fragment " + arVarC2 + " view " + viewRequireView2 + " to container in onStart");
            }
            cdVar.d();
            viewRequireView2.setAlpha(0.0f);
        }
        if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
            if (bv.aM(2)) {
                Log.v("FragmentManager", k.e(viewRequireView2, "Making view ", " INVISIBLE in onStart"));
            }
            viewRequireView2.setVisibility(4);
        }
        viewRequireView2.setAlpha(arVarC2.getPostOnViewCreatedAlpha());
        if (bv.aM(2)) {
            Log.v("FragmentManager", "Setting view alpha to " + arVarC2.getPostOnViewCreatedAlpha() + " in onStart");
        }
    }
}
