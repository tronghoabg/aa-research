package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.geometry.Rect;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SharedTransitionDefaults {
    public static final SharedTransitionDefaults INSTANCE = new SharedTransitionDefaults();
    private static final BoundsTransform BoundsTransform = new BoundsTransform() { // from class: androidx.compose.animation.SharedTransitionDefaults$$ExternalSyntheticLambda0
        @Override // androidx.compose.animation.BoundsTransform
        public final FiniteAnimationSpec createAnimationSpec(Rect rect, Rect rect2) {
            return SharedTransitionScopeKt.DefaultSpring;
        }
    };
    public static final int $stable = 8;

    /* compiled from: WazeSource */
    public final class SharedContentConfig implements SharedTransitionScope.SharedContentConfig {
        public static final int $stable = 0;
        public static final SharedContentConfig INSTANCE = new SharedContentConfig();

        private SharedContentConfig() {
        }

        @Override // androidx.compose.animation.SharedTransitionScope.SharedContentConfig
        /* renamed from: alternativeTargetBoundsInTransitionScopeAfterRemoval-cSwnlzA */
        public /* synthetic */ Rect mo1746alternativeTargetBoundsInTransitionScopeAfterRemovalcSwnlzA(SharedTransitionScope.SharedContentState sharedContentState, Rect rect, long j2) {
            return null;
        }

        @Override // androidx.compose.animation.SharedTransitionScope.SharedContentConfig
        public /* synthetic */ boolean getShouldKeepEnabledForOngoingAnimation() {
            return true;
        }

        @Override // androidx.compose.animation.SharedTransitionScope.SharedContentConfig
        public /* synthetic */ boolean isEnabled(SharedTransitionScope.SharedContentState sharedContentState) {
            return true;
        }
    }

    private SharedTransitionDefaults() {
    }

    public final BoundsTransform getBoundsTransform() {
        return BoundsTransform;
    }
}
