package defpackage;

import android.util.Log;
import android.view.View;

/* loaded from: classes.dex */
final class am implements eqn {
    final /* synthetic */ ao a;

    public am(ao aoVar) {
        this.a = aoVar;
    }

    @Override // defpackage.eqn
    public final /* bridge */ /* synthetic */ void eS(Object obj) {
        if (((eqa) obj) != null) {
            ao aoVar = this.a;
            if (aoVar.d) {
                View viewRequireView = aoVar.requireView();
                if (viewRequireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (aoVar.e != null) {
                    if (bt.ac(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + aoVar.e);
                    }
                    aoVar.e.setContentView(viewRequireView);
                }
            }
        }
    }
}
