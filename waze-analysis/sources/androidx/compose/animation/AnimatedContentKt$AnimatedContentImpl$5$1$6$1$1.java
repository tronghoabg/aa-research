package androidx.compose.animation;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AnimatedContentKt$AnimatedContentImpl$5$1$6$1$1 extends y implements l<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ SnapshotStateList $currentlyVisible;
    final /* synthetic */ AnimatedContentTransitionScopeImpl $rootScope;
    final /* synthetic */ Object $stateForContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnimatedContentKt$AnimatedContentImpl$5$1$6$1$1(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
        super(1);
        this.$currentlyVisible = snapshotStateList;
        this.$stateForContent = obj;
        this.$rootScope = animatedContentTransitionScopeImpl;
    }

    @Override // h.g.a.l
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        final SnapshotStateList snapshotStateList = this.$currentlyVisible;
        final Object obj = this.$stateForContent;
        final AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = this.$rootScope;
        return new DisposableEffectResult() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContentImpl$5$1$6$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                snapshotStateList.remove(obj);
                animatedContentTransitionScopeImpl.getTargetSizeMap$animation().remove(obj);
            }
        };
    }
}
