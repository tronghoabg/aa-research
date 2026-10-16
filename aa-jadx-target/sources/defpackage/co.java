package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class co extends defpackage.cp {
    private final defpackage.by j;

    /* JADX WARN: Illegal instructions before constructor call */
    public co(int i, int i2, defpackage.by byVar) {
        android.support.v4.app.Fragment fragment = byVar.a;
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
                android.support.v4.app.Fragment fragment = this.j.a;
                fragment.getClass();
                android.view.View viewRequireView = fragment.requireView();
                if (defpackage.bt.ac(2)) {
                    android.util.Log.v("FragmentManager", "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + fragment);
                }
                viewRequireView.clearFocus();
                return;
            }
            return;
        }
        defpackage.by byVar = this.j;
        android.support.v4.app.Fragment fragment2 = byVar.a;
        fragment2.getClass();
        android.view.View viewFindFocus = fragment2.mView.findFocus();
        if (viewFindFocus != null) {
            fragment2.setFocusedView(viewFindFocus);
            if (defpackage.bt.ac(2)) {
                android.util.Log.v("FragmentManager", defpackage.a.bs(fragment2, viewFindFocus, "requestFocus: Saved focused view ", " for Fragment "));
            }
        }
        android.view.View viewRequireView2 = this.a.requireView();
        if (viewRequireView2.getParent() == null) {
            if (defpackage.bt.ac(2)) {
                android.util.Log.v("FragmentManager", defpackage.a.bv(viewRequireView2, fragment2, "Adding fragment ", " view ", " to container in onStart"));
            }
            byVar.b();
            viewRequireView2.setAlpha(0.0f);
        }
        if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
            if (defpackage.bt.ac(2)) {
                android.util.Log.v("FragmentManager", defpackage.a.bl(viewRequireView2, "Making view ", " INVISIBLE in onStart"));
            }
            viewRequireView2.setVisibility(4);
        }
        viewRequireView2.setAlpha(fragment2.getPostOnViewCreatedAlpha());
        if (defpackage.bt.ac(2)) {
            android.util.Log.v("FragmentManager", "Setting view alpha to " + fragment2.getPostOnViewCreatedAlpha() + " in onStart");
        }
    }
}
