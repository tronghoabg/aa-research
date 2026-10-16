package androidx.fragment.app.strictmode;

import android.support.v4.app.ar;
import android.view.ViewGroup;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FragmentTagUsageViolation extends Violation {
    private final ViewGroup parentContainer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentTagUsageViolation(ar arVar, ViewGroup viewGroup) {
        super(arVar, "Attempting to use <fragment> tag to add fragment " + arVar + " to container " + viewGroup);
        x.f(arVar, "fragment");
        this.parentContainer = viewGroup;
    }

    public final ViewGroup getParentContainer() {
        return this.parentContainer;
    }
}
