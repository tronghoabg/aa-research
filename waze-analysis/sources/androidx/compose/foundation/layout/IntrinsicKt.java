package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class IntrinsicKt {
    public static final Modifier height(Modifier modifier, IntrinsicSize intrinsicSize) {
        return modifier.then(new IntrinsicHeightElement(intrinsicSize, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new IntrinsicKt$height$$inlined$debugInspectorInfo$1(intrinsicSize) : InspectableValueKt.getNoInspectorInfo()));
    }

    public static final Modifier requiredHeight(Modifier modifier, IntrinsicSize intrinsicSize) {
        return modifier.then(new IntrinsicHeightElement(intrinsicSize, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new IntrinsicKt$requiredHeight$$inlined$debugInspectorInfo$1(intrinsicSize) : InspectableValueKt.getNoInspectorInfo()));
    }

    public static final Modifier requiredWidth(Modifier modifier, IntrinsicSize intrinsicSize) {
        return modifier.then(new IntrinsicWidthElement(intrinsicSize, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new IntrinsicKt$requiredWidth$$inlined$debugInspectorInfo$1(intrinsicSize) : InspectableValueKt.getNoInspectorInfo()));
    }

    public static final Modifier width(Modifier modifier, IntrinsicSize intrinsicSize) {
        return modifier.then(new IntrinsicWidthElement(intrinsicSize, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new IntrinsicKt$width$$inlined$debugInspectorInfo$1(intrinsicSize) : InspectableValueKt.getNoInspectorInfo()));
    }
}
