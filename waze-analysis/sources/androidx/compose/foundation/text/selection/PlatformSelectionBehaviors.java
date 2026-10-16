package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.TextRange;
import h.ab;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface PlatformSelectionBehaviors {
    /* renamed from: onShowContextMenu-_2OEclM, reason: not valid java name */
    Object mo3851onShowContextMenu_2OEclM(CharSequence charSequence, long j2, Offset offset, e<? super ab> eVar);

    /* renamed from: onShowSelectionToolbar-Sb-Bc2M, reason: not valid java name */
    Object mo3852onShowSelectionToolbarSbBc2M(CharSequence charSequence, long j2, e<? super ab> eVar);

    /* renamed from: suggestSelectionForLongPressOrDoubleClick-pYaCw-w, reason: not valid java name */
    Object mo3853suggestSelectionForLongPressOrDoubleClickpYaCww(CharSequence charSequence, long j2, e<? super TextRange> eVar);
}
