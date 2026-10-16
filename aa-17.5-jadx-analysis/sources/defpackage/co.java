package defpackage;

import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
final class co extends cp {
    private final by j;

    /* JADX WARN: Illegal instructions before constructor call */
    public co(int i, int i2, by byVar) {
        Fragment fragment = byVar.a;
        fragment.getClass();
        super(i, i2, fragment);
        this.j = byVar;
    }

    @Override // defpackage.cp
    public final void a() {
        super.a();
        this.a.mTransitioning = false;
        this.j.e();
    }

    @Override // defpackage.cp
    public final void b() {
        if (this.e) {
            return;
        }
        super.b();
        int i = this.i;
        if (i != 2) {
            if (i == 3) {
                Fragment fragment = this.j.a;
                fragment.getClass();
                View viewRequireView = fragment.requireView();
                if (bt.ac(2)) {
                    Log.v("FragmentManager", "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + fragment);
                }
                viewRequireView.clearFocus();
                return;
            }
            return;
        }
        by byVar = this.j;
        Fragment fragment2 = byVar.a;
        fragment2.getClass();
        View viewFindFocus = fragment2.mView.findFocus();
        if (viewFindFocus != null) {
            fragment2.setFocusedView(viewFindFocus);
            if (bt.ac(2)) {
                Log.v("FragmentManager", a.bt(fragment2, viewFindFocus, "requestFocus: Saved focused view ", " for Fragment "));
            }
        }
        View viewRequireView2 = this.a.requireView();
        if (viewRequireView2.getParent() == null) {
            if (bt.ac(2)) {
                Log.v("FragmentManager", a.bw(viewRequireView2, fragment2, "Adding fragment ", " view ", " to container in onStart"));
            }
            byVar.b();
            viewRequireView2.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
        if (viewRequireView2.getAlpha() == BitmapDescriptorFactory.HUE_RED && viewRequireView2.getVisibility() == 0) {
            if (bt.ac(2)) {
                Log.v("FragmentManager", a.bm(viewRequireView2, "Making view ", " INVISIBLE in onStart"));
            }
            viewRequireView2.setVisibility(4);
        }
        viewRequireView2.setAlpha(fragment2.getPostOnViewCreatedAlpha());
        if (bt.ac(2)) {
            Log.v("FragmentManager", "Setting view alpha to " + fragment2.getPostOnViewCreatedAlpha() + " in onStart");
        }
    }
}
