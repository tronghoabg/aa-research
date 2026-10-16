package androidx.fragment.app.strictmode;

import android.support.v4.app.ar;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FragmentReuseViolation extends Violation {
    private final String previousFragmentId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentReuseViolation(ar arVar, String str) {
        super(arVar, "Attempting to reuse fragment " + arVar + " with previous ID " + str);
        x.f(arVar, "fragment");
        x.f(str, "previousFragmentId");
        this.previousFragmentId = str;
    }

    public final String getPreviousFragmentId() {
        return this.previousFragmentId;
    }
}
