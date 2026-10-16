package D1;

import android.util.Log;
import androidx.fragment.app.F;
import androidx.fragment.app.e0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f2276a = c.f2275a;

    public static c a(F f10) {
        while (f10 != null) {
            if (f10.isAdded()) {
                AbstractC3340k.d(f10.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            f10 = f10.getParentFragment();
        }
        return f2276a;
    }

    public static void b(i iVar) {
        if (e0.J(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(iVar.f2278a.getClass().getName()), iVar);
        }
    }

    public static final void c(F fragment, String previousFragmentId) {
        AbstractC3340k.e(fragment, "fragment");
        AbstractC3340k.e(previousFragmentId, "previousFragmentId");
        b(new a(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId));
        a(fragment).getClass();
    }
}
