package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.a.r;
import h.g.b.x;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AnimatedContentKt$AnimatedContentImpl$5$1 extends y implements p<Composer, Integer, ab> {
    final /* synthetic */ r $content;
    final /* synthetic */ SnapshotStateList $currentlyVisible;
    final /* synthetic */ MutableContentTransform $mutableContentTransformData;
    final /* synthetic */ PendingAnimatedContentTransitionScope $pendingScope;
    final /* synthetic */ AnimatedContentTransitionScopeImpl $rootScope;
    final /* synthetic */ Object $stateForContent;
    final /* synthetic */ Transition $this_AnimatedContentImpl;
    final /* synthetic */ l<AnimatedContentTransitionScope, ContentTransform> $transitionSpec;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AnimatedContentKt$AnimatedContentImpl$5$1(Object obj, Transition transition, MutableContentTransform mutableContentTransform, PendingAnimatedContentTransitionScope pendingAnimatedContentTransitionScope, l<? super AnimatedContentTransitionScope, ContentTransform> lVar, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl, SnapshotStateList snapshotStateList, r rVar) {
        super(2);
        this.$stateForContent = obj;
        this.$this_AnimatedContentImpl = transition;
        this.$mutableContentTransformData = mutableContentTransform;
        this.$pendingScope = pendingAnimatedContentTransitionScope;
        this.$transitionSpec = lVar;
        this.$rootScope = animatedContentTransitionScopeImpl;
        this.$currentlyVisible = snapshotStateList;
        this.$content = rVar;
    }

    public final void invoke(Composer composer, int i2) {
        boolean z = false;
        if (!composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(427839334, i2, -1, "androidx.compose.animation.AnimatedContentImpl.<anonymous>.<anonymous> (AnimatedContent.kt:1032)");
        }
        boolean zChanged = composer.changed(x.n(this.$stateForContent, this.$this_AnimatedContentImpl.getPendingTargetState()));
        Object obj = this.$stateForContent;
        Transition transition = this.$this_AnimatedContentImpl;
        PendingAnimatedContentTransitionScope pendingAnimatedContentTransitionScope = this.$pendingScope;
        l<AnimatedContentTransitionScope, ContentTransform> lVar = this.$transitionSpec;
        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = this.$rootScope;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (!x.n(obj, transition.getPendingTargetState()) || pendingAnimatedContentTransitionScope == null) ? (ContentTransform) lVar.invoke(animatedContentTransitionScopeImpl) : (ContentTransform) lVar.invoke(pendingAnimatedContentTransitionScope);
            composer.updateRememberedValue(objRememberedValue);
        }
        ContentTransform contentTransform = (ContentTransform) objRememberedValue;
        boolean zChanged2 = composer.changed(x.n(this.$this_AnimatedContentImpl.getSegment().getTargetState(), this.$stateForContent));
        Transition transition2 = this.$this_AnimatedContentImpl;
        Object obj2 = this.$stateForContent;
        l<AnimatedContentTransitionScope, ContentTransform> lVar2 = this.$transitionSpec;
        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2 = this.$rootScope;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = x.n(transition2.getSegment().getTargetState(), obj2) ? ExitTransition.Companion.getNone() : lVar2.invoke(animatedContentTransitionScopeImpl2).getInitialContentExit();
            composer.updateRememberedValue(objRememberedValue2);
        }
        Object obj3 = this.$stateForContent;
        Transition transition3 = this.$this_AnimatedContentImpl;
        ExitTransition exitTransition = (ExitTransition) objRememberedValue2;
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = new AnimatedContentTransitionScopeImpl.ChildData(x.n(obj3, transition3.getTargetState()));
            composer.updateRememberedValue(objRememberedValue3);
        }
        AnimatedContentTransitionScopeImpl.ChildData childData = (AnimatedContentTransitionScopeImpl.ChildData) objRememberedValue3;
        EnterTransition targetContentEnter = contentTransform.getTargetContentEnter();
        Modifier.Companion companion = Modifier.Companion;
        boolean zChangedInstance = composer.changedInstance(contentTransform);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue4 == Composer.Companion.getEmpty()) {
            objRememberedValue4 = (q) new AnimatedContentKt$AnimatedContentImpl$5$1$1$1(contentTransform);
            composer.updateRememberedValue(objRememberedValue4);
        }
        Modifier modifierLayout = LayoutModifierKt.layout(companion, (q) objRememberedValue4);
        Object obj4 = this.$stateForContent;
        Transition transition4 = this.$this_AnimatedContentImpl;
        childData.setTarget(x.n(obj4, transition4.getTargetState()));
        if (x.n(obj4, transition4.getPendingTargetState()) && !x.n(obj4, transition4.getTargetState()) && !x.n(obj4, transition4.getCurrentState())) {
            z = true;
        }
        childData.setPendingTarget(z);
        Modifier modifierThen = modifierLayout.then(childData);
        MutableContentTransform mutableContentTransform = this.$mutableContentTransformData;
        MutableTransform initialTransform$animation = null;
        if (mutableContentTransform != null) {
            Object obj5 = this.$stateForContent;
            Transition transition5 = this.$this_AnimatedContentImpl;
            if (x.n(obj5, transition5.getPendingTargetState())) {
                initialTransform$animation = mutableContentTransform.getTargetTransform$animation();
            } else if (x.n(obj5, transition5.getTargetState())) {
                initialTransform$animation = mutableContentTransform.getInitialTransform$animation();
            }
        }
        MutableTransform mutableTransform = initialTransform$animation;
        Transition transition6 = this.$this_AnimatedContentImpl;
        boolean zChangedInstance2 = composer.changedInstance(this.$stateForContent);
        Object obj6 = this.$stateForContent;
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue5 == Composer.Companion.getEmpty()) {
            objRememberedValue5 = (l) new AnimatedContentKt$AnimatedContentImpl$5$1$4$1(obj6);
            composer.updateRememberedValue(objRememberedValue5);
        }
        l lVar3 = (l) objRememberedValue5;
        boolean zChanged3 = composer.changed(exitTransition);
        Object objRememberedValue6 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue6 == Composer.Companion.getEmpty()) {
            objRememberedValue6 = (p) new AnimatedContentKt$AnimatedContentImpl$5$1$5$1(exitTransition);
            composer.updateRememberedValue(objRememberedValue6);
        }
        AnimatedVisibilityKt.AnimatedEnterExitImpl(transition6, lVar3, modifierThen, targetContentEnter, exitTransition, (p) objRememberedValue6, null, mutableTransform, ComposableLambdaKt.rememberComposableLambda(1831990167, true, new AnonymousClass6(this.$currentlyVisible, this.$stateForContent, this.$rootScope, this.$content), composer, 54), composer, 100663296, 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContentImpl$5$1$6, reason: invalid class name */
    final class AnonymousClass6 extends y implements q<AnimatedVisibilityScope, Composer, Integer, ab> {
        final /* synthetic */ r $content;
        final /* synthetic */ SnapshotStateList $currentlyVisible;
        final /* synthetic */ AnimatedContentTransitionScopeImpl $rootScope;
        final /* synthetic */ Object $stateForContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl, r rVar) {
            super(3);
            this.$currentlyVisible = snapshotStateList;
            this.$stateForContent = obj;
            this.$rootScope = animatedContentTransitionScopeImpl;
            this.$content = rVar;
        }

        public final void invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i2) {
            if ((i2 & 6) == 0) {
                i2 |= true != ((i2 & 8) == 0 ? composer.changed(animatedVisibilityScope) : composer.changedInstance(animatedVisibilityScope)) ? 2 : 4;
            }
            if (!composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1831990167, i2, -1, "androidx.compose.animation.AnimatedContentImpl.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:1091)");
            }
            boolean zChanged = composer.changed(this.$currentlyVisible) | composer.changedInstance(this.$stateForContent) | composer.changedInstance(this.$rootScope);
            SnapshotStateList snapshotStateList = this.$currentlyVisible;
            Object obj = this.$stateForContent;
            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = this.$rootScope;
            AnimatedContentKt$AnimatedContentImpl$5$1$6$1$1 animatedContentKt$AnimatedContentImpl$5$1$6$1$1RememberedValue = composer.rememberedValue();
            if (zChanged || animatedContentKt$AnimatedContentImpl$5$1$6$1$1RememberedValue == Composer.Companion.getEmpty()) {
                animatedContentKt$AnimatedContentImpl$5$1$6$1$1RememberedValue = new AnimatedContentKt$AnimatedContentImpl$5$1$6$1$1(snapshotStateList, obj, animatedContentTransitionScopeImpl);
                composer.updateRememberedValue(animatedContentKt$AnimatedContentImpl$5$1$6$1$1RememberedValue);
            }
            EffectsKt.DisposableEffect(animatedVisibilityScope, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) animatedContentKt$AnimatedContentImpl$5$1$6$1$1RememberedValue, composer, i2 & 14);
            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2 = this.$rootScope;
            Object obj2 = this.$stateForContent;
            MutableScatterMap targetSizeMap$animation = animatedContentTransitionScopeImpl2.getTargetSizeMap$animation();
            x.d(animatedVisibilityScope, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
            targetSizeMap$animation.set(obj2, ((AnimatedVisibilityScopeImpl) animatedVisibilityScope).getTargetSize$animation());
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new AnimatedContentScopeImpl(animatedVisibilityScope);
                composer.updateRememberedValue(objRememberedValue);
            }
            this.$content.invoke((AnimatedContentScopeImpl) objRememberedValue, this.$stateForContent, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // h.g.a.q
        public /* bridge */ /* synthetic */ ab invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return ab.f48028a;
        }
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return ab.f48028a;
    }
}
