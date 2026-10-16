package androidx.fragment.app.strictmode;

import android.support.v4.app.ar;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class TargetFragmentUsageViolation extends Violation {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TargetFragmentUsageViolation(ar arVar, String str) {
        super(arVar, str);
        x.f(arVar, "fragment");
    }

    public /* synthetic */ TargetFragmentUsageViolation(ar arVar, String str, int i2, o oVar) {
        this(arVar, (i2 & 2) != 0 ? null : str);
    }
}
