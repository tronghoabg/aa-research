package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.ui.geometry.Rect;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class CachedSharedContentConfig implements SharedTransitionScope.SharedContentConfig {
    public static final CachedSharedContentConfig INSTANCE = new CachedSharedContentConfig();

    private CachedSharedContentConfig() {
    }

    @Override // androidx.compose.animation.SharedTransitionScope.SharedContentConfig
    /* renamed from: alternativeTargetBoundsInTransitionScopeAfterRemoval-cSwnlzA, reason: not valid java name */
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
