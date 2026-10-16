package androidx.compose.ui.platform;

import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNode_androidKt;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AndroidComposeViewAccessibilityDelegateCompat$currentSemanticsNodes$1 extends y implements l<SemanticsNode, Boolean> {
    public static final AndroidComposeViewAccessibilityDelegateCompat$currentSemanticsNodes$1 INSTANCE = new AndroidComposeViewAccessibilityDelegateCompat$currentSemanticsNodes$1();

    AndroidComposeViewAccessibilityDelegateCompat$currentSemanticsNodes$1() {
        super(1);
    }

    @Override // h.g.a.l
    public final Boolean invoke(SemanticsNode semanticsNode) {
        return Boolean.valueOf(SemanticsNode_androidKt.isAccessibilityIgnoredLink(semanticsNode));
    }
}
