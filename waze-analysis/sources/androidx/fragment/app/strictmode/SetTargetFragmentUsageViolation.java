package androidx.fragment.app.strictmode;

import android.support.v4.app.ar;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SetTargetFragmentUsageViolation extends TargetFragmentUsageViolation {
    private final int requestCode;
    private final ar targetFragment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetTargetFragmentUsageViolation(ar arVar, ar arVar2, int i2) {
        super(arVar, "Attempting to set target fragment " + arVar2 + " with request code " + i2 + " for fragment " + arVar);
        x.f(arVar, "fragment");
        x.f(arVar2, "targetFragment");
        this.targetFragment = arVar2;
        this.requestCode = i2;
    }

    public final int getRequestCode() {
        return this.requestCode;
    }

    public final ar getTargetFragment() {
        return this.targetFragment;
    }
}
