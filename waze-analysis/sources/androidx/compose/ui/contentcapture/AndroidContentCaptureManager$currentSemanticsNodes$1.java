package androidx.compose.ui.contentcapture;

import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNode_androidKt;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class AndroidContentCaptureManager$currentSemanticsNodes$1 extends y implements l<SemanticsNode, Boolean> {
    public static final AndroidContentCaptureManager$currentSemanticsNodes$1 INSTANCE = new AndroidContentCaptureManager$currentSemanticsNodes$1();

    AndroidContentCaptureManager$currentSemanticsNodes$1() {
        super(1);
    }

    @Override // h.g.a.l
    public final Boolean invoke(SemanticsNode semanticsNode) {
        return Boolean.valueOf(SemanticsNode_androidKt.isAccessibilityIgnoredLink(semanticsNode));
    }
}
