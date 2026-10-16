package androidx.fragment.app.strictmode;

import android.support.v4.app.ar;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SetUserVisibleHintViolation extends Violation {
    private final boolean isVisibleToUser;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetUserVisibleHintViolation(ar arVar, boolean z) {
        super(arVar, "Attempting to set user visible hint to " + z + " for fragment " + arVar);
        x.f(arVar, "fragment");
        this.isVisibleToUser = z;
    }

    public final boolean isVisibleToUser() {
        return this.isVisibleToUser;
    }
}
