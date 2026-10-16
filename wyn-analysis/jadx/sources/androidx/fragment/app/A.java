package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import androidx.lifecycle.InterfaceC1457v;
import t.InterfaceC4035a;

/* loaded from: classes.dex */
public final class A implements InterfaceC4035a, androidx.lifecycle.F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18276a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18277b;

    public /* synthetic */ A(Object obj, int i5) {
        this.f18276a = i5;
        this.f18277b = obj;
    }

    @Override // t.InterfaceC4035a
    public Object apply(Object obj) {
        switch (this.f18276a) {
            case 0:
                F f10 = (F) this.f18277b;
                Object obj2 = f10.mHost;
                return obj2 instanceof g.i ? ((g.i) obj2).getActivityResultRegistry() : f10.requireActivity().getActivityResultRegistry();
            default:
                return (g.h) this.f18277b;
        }
    }

    @Override // androidx.lifecycle.F
    public void b(Object obj) {
        if (((InterfaceC1457v) obj) != null) {
            DialogInterfaceOnCancelListenerC1430t dialogInterfaceOnCancelListenerC1430t = (DialogInterfaceOnCancelListenerC1430t) this.f18277b;
            if (dialogInterfaceOnCancelListenerC1430t.f18540f) {
                View viewRequireView = dialogInterfaceOnCancelListenerC1430t.requireView();
                if (viewRequireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (dialogInterfaceOnCancelListenerC1430t.f18544j != null) {
                    if (e0.J(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + dialogInterfaceOnCancelListenerC1430t.f18544j);
                    }
                    dialogInterfaceOnCancelListenerC1430t.f18544j.setContentView(viewRequireView);
                }
            }
        }
    }
}
