package androidx.compose.runtime.composer.gapbuffer;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.ComposerKt;
import h.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class GapAnchorKt {
    public static final GapAnchor asGapAnchor(Anchor anchor) {
        GapAnchor gapAnchor = anchor instanceof GapAnchor ? (GapAnchor) anchor : null;
        if (gapAnchor != null) {
            return gapAnchor;
        }
        ComposerKt.composeRuntimeError("Inconsistent composition");
        throw new e();
    }
}
