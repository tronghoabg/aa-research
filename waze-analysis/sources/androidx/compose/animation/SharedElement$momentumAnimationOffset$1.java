package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import h.g.a.a;
import h.g.b.y;
import java.util.List;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SharedElement$momentumAnimationOffset$1 extends y implements a<Offset> {
    final /* synthetic */ SharedElement this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedElement$momentumAnimationOffset$1(SharedElement sharedElement) {
        super(0);
        this.this$0 = sharedElement;
    }

    @Override // h.g.a.a
    public /* bridge */ /* synthetic */ Offset invoke() {
        return Offset.m7969boximpl(m1808invokeF1C5BW0());
    }

    /* renamed from: invoke-F1C5BW0, reason: not valid java name */
    public final long m1808invokeF1C5BW0() {
        SharedElementEntry sharedElementEntry;
        if (!this.this$0.animationSpecFinalized && this.this$0.getScope().isTransitionActive() && this.this$0.momentumAnimation.isRunning()) {
            List<SharedElementEntry> enabledEntries = this.this$0.getEnabledEntries();
            int size = enabledEntries.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    sharedElementEntry = null;
                    break;
                }
                sharedElementEntry = enabledEntries.get(i2);
                if (sharedElementEntry.getTarget()) {
                    break;
                }
                i2++;
            }
            SharedElementEntry sharedElementEntry2 = sharedElementEntry;
            if (sharedElementEntry2 != null) {
                SharedElement sharedElement = this.this$0;
                FiniteAnimationSpec<Rect> animationSpec = sharedElementEntry2.getBoundsAnimation().getAnimationSpec();
                if (animationSpec instanceof SpringSpec) {
                    SpringSpec springSpec = (SpringSpec) animationSpec;
                    aj.z(sharedElement.getScope().getCoroutineScope(), null, null, new SharedElement$momentumAnimationOffset$1$2$1(sharedElement, AnimationSpecKt.spring(springSpec.getDampingRatio(), springSpec.getStiffness(), Offset.m7969boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.Companion))), null), 3);
                }
                sharedElement.animationSpecFinalized = true;
            }
        }
        return ((Offset) this.this$0.momentumAnimation.getValue()).m7990unboximpl();
    }
}
