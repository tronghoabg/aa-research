package android.support.v4.app;

import android.util.Log;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class z implements Observer {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ab f390a;

    z(ab abVar) {
        this.f390a = abVar;
    }

    @Override // androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        if (((LifecycleOwner) obj) != null) {
            ab abVar = this.f390a;
            if (abVar.mShowsDialog) {
                View viewRequireView = abVar.requireView();
                if (viewRequireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (abVar.mDialog != null) {
                    if (bv.aM(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + abVar.mDialog);
                    }
                    abVar.mDialog.setContentView(viewRequireView);
                }
            }
        }
    }
}
