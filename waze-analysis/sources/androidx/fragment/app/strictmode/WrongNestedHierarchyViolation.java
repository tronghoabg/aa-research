package androidx.fragment.app.strictmode;

import android.support.v4.app.ar;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class WrongNestedHierarchyViolation extends Violation {
    private final int containerId;
    private final ar expectedParentFragment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrongNestedHierarchyViolation(ar arVar, ar arVar2, int i2) {
        super(arVar, "Attempting to nest fragment " + arVar + " within the view of parent fragment " + arVar2 + " via container with ID " + i2 + " without using parent's childFragmentManager");
        x.f(arVar, "fragment");
        x.f(arVar2, "expectedParentFragment");
        this.expectedParentFragment = arVar2;
        this.containerId = i2;
    }

    public final int getContainerId() {
        return this.containerId;
    }

    public final ar getExpectedParentFragment() {
        return this.expectedParentFragment;
    }
}
