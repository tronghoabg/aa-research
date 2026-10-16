package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import com.waze.strings.DisplayStrings;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AnimatedContentKt$DeferredAnimatedContent$1$1 extends y implements l<AnimatedContentTransitionScope, ContentTransform> {
    public static final AnimatedContentKt$DeferredAnimatedContent$1$1 INSTANCE = new AnimatedContentKt$DeferredAnimatedContent$1$1();

    AnimatedContentKt$DeferredAnimatedContent$1$1() {
        super(1);
    }

    @Override // h.g.a.l
    public final ContentTransform invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_11, 90, null, 4, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m1752scaleInL8ZKhE$default(AnimationSpecKt.tween$default(DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_11, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(90, 0, null, 6, null), 0.0f, 2, null));
    }
}
