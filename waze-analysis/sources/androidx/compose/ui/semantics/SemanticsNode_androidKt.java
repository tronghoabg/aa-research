package androidx.compose.ui.semantics;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SemanticsNode_androidKt {
    public static final boolean isAccessibilityIgnoredLink(SemanticsNode semanticsNode) {
        return semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getLinkTestMarker());
    }
}
