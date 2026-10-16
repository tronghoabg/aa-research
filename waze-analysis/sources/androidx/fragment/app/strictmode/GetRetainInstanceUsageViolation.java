package androidx.fragment.app.strictmode;

import android.support.v4.app.ar;
import h.g.b.x;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class GetRetainInstanceUsageViolation extends RetainInstanceUsageViolation {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRetainInstanceUsageViolation(ar arVar) {
        super(arVar, "Attempting to get retain instance for fragment ".concat(String.valueOf(arVar)));
        x.f(arVar, "fragment");
        Objects.toString(arVar);
    }
}
