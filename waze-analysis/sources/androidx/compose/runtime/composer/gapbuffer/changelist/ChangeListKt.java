package androidx.compose.runtime.composer.gapbuffer.changelist;

import androidx.compose.runtime.Changes;
import androidx.compose.runtime.ComposerKt;
import h.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ChangeListKt {
    public static final ChangeList asGapBufferChangeList(Changes changes) {
        ChangeList changeList = changes instanceof ChangeList ? (ChangeList) changes : null;
        if (changeList != null) {
            return changeList;
        }
        ComposerKt.composeRuntimeError("Inconsistent composition");
        throw new e();
    }
}
