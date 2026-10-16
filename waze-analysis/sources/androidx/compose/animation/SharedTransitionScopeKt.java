package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.LookaheadScopeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import h.ab;
import h.c.k;
import h.g.a.a;
import h.g.a.p;
import h.g.a.q;
import h.g.a.r;
import h.g.b.y;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SharedTransitionScopeKt {
    public static final boolean VisualDebugging = false;
    private static final SpringSpec<Rect> DefaultSpring = AnimationSpecKt.spring$default(0.0f, 400.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 1, null);
    private static final SharedTransitionScope.OverlayClip ParentClip = new SharedTransitionScope.OverlayClip() { // from class: androidx.compose.animation.SharedTransitionScopeKt$ParentClip$1
        @Override // androidx.compose.animation.SharedTransitionScope.OverlayClip
        public Path getClipPath(SharedTransitionScope.SharedContentState sharedContentState, Rect rect, LayoutDirection layoutDirection, Density density) {
            SharedTransitionScope.SharedContentState parentSharedContentState = sharedContentState.getParentSharedContentState();
            if (parentSharedContentState != null) {
                return parentSharedContentState.getClipPathInOverlay();
            }
            return null;
        }
    };
    private static final MutableScatterMap<ContentScale, MutableScatterMap<Alignment, ScaleToBoundsImpl>> cachedScaleToBoundsImplMap = new MutableScatterMap<>(0, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScaleToBoundsImpl ScaleToBoundsCached(ContentScale contentScale, Alignment alignment) {
        if (!getShouldCache(contentScale) || !getShouldCache(alignment)) {
            return new ScaleToBoundsImpl(contentScale, alignment);
        }
        MutableScatterMap<ContentScale, MutableScatterMap<Alignment, ScaleToBoundsImpl>> mutableScatterMap = cachedScaleToBoundsImplMap;
        MutableScatterMap<Alignment, ScaleToBoundsImpl> mutableScatterMap2 = mutableScatterMap.get(contentScale);
        if (mutableScatterMap2 == null) {
            mutableScatterMap2 = new MutableScatterMap<>(0, 1, null);
            mutableScatterMap.set(contentScale, mutableScatterMap2);
        }
        MutableScatterMap<Alignment, ScaleToBoundsImpl> mutableScatterMap3 = mutableScatterMap2;
        ScaleToBoundsImpl scaleToBoundsImpl = mutableScatterMap3.get(alignment);
        if (scaleToBoundsImpl == null) {
            scaleToBoundsImpl = new ScaleToBoundsImpl(contentScale, alignment);
            mutableScatterMap3.set(alignment, scaleToBoundsImpl);
        }
        return scaleToBoundsImpl;
    }

    public static final void SharedTransitionLayout(Modifier modifier, q<? super SharedTransitionScope, ? super Composer, ? super Integer, ab> qVar, Composer composer, int i2, int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(646379026);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(qVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            if (i5 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(646379026, i4, -1, "androidx.compose.animation.SharedTransitionLayout (SharedTransitionScope.kt:123)");
            }
            SharedTransitionScope(ComposableLambdaKt.rememberComposableLambda(1948801580, true, new AnonymousClass1(modifier, qVar), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new AnonymousClass2(modifier, qVar, i2, i3));
        }
    }

    public static final void SharedTransitionScope(r<? super SharedTransitionScope, ? super Modifier, ? super Composer, ? super Integer, ab> rVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1908320054);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(rVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1908320054, i3, -1, "androidx.compose.animation.SharedTransitionScope (SharedTransitionScope.kt:145)");
            }
            LookaheadScopeKt.LookaheadScope(ComposableLambdaKt.rememberComposableLambda(2062852661, true, new C02031(rVar), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C02042(rVar, i2));
        }
    }

    private static final boolean getShouldCache(Alignment alignment) {
        return alignment == Alignment.Companion.getTopStart() || alignment == Alignment.Companion.getTopCenter() || alignment == Alignment.Companion.getTopEnd() || alignment == Alignment.Companion.getCenterStart() || alignment == Alignment.Companion.getCenter() || alignment == Alignment.Companion.getCenterEnd() || alignment == Alignment.Companion.getBottomStart() || alignment == Alignment.Companion.getBottomCenter() || alignment == Alignment.Companion.getBottomEnd();
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$2, reason: invalid class name and case insensitive filesystem */
    final class C02042 extends y implements p<Composer, Integer, ab> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ r<SharedTransitionScope, Modifier, Composer, Integer, ab> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02042(r<? super SharedTransitionScope, ? super Modifier, ? super Composer, ? super Integer, ab> rVar, int i2) {
            super(2);
            this.$content = rVar;
            this.$$changed = i2;
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return ab.f48028a;
        }

        public final void invoke(Composer composer, int i2) {
            SharedTransitionScopeKt.SharedTransitionScope(this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionLayout$2, reason: invalid class name */
    final class AnonymousClass2 extends y implements p<Composer, Integer, ab> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ q<SharedTransitionScope, Composer, Integer, ab> $content;
        final /* synthetic */ Modifier $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Modifier modifier, q<? super SharedTransitionScope, ? super Composer, ? super Integer, ab> qVar, int i2, int i3) {
            super(2);
            this.$modifier = modifier;
            this.$content = qVar;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(Composer composer, int i2) {
            SharedTransitionScopeKt.SharedTransitionLayout(this.$modifier, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return ab.f48028a;
        }
    }

    private static final boolean getShouldCache(ContentScale contentScale) {
        return contentScale == ContentScale.Companion.getFillWidth() || contentScale == ContentScale.Companion.getFillHeight() || contentScale == ContentScale.Companion.getFillBounds() || contentScale == ContentScale.Companion.getFit() || contentScale == ContentScale.Companion.getCrop() || contentScale == ContentScale.Companion.getNone() || contentScale == ContentScale.Companion.getInside();
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1, reason: invalid class name and case insensitive filesystem */
    final class C02031 extends y implements q<LookaheadScope, Composer, Integer, ab> {
        final /* synthetic */ r<SharedTransitionScope, Modifier, Composer, Integer, ab> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02031(r<? super SharedTransitionScope, ? super Modifier, ? super Composer, ? super Integer, ab> rVar) {
            super(3);
            this.$content = rVar;
        }

        public final void invoke(LookaheadScope lookaheadScope, Composer composer, int i2) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2062852661, i2, -1, "androidx.compose.animation.SharedTransitionScope.<anonymous> (SharedTransitionScope.kt:147)");
            }
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(k.f48060a, composer);
                composer.updateRememberedValue(objRememberedValue);
            }
            af afVar = (af) objRememberedValue;
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new SharedTransitionScopeImpl(lookaheadScope, afVar);
                composer.updateRememberedValue(objRememberedValue2);
            }
            SharedTransitionScopeImpl sharedTransitionScopeImpl = (SharedTransitionScopeImpl) objRememberedValue2;
            this.$content.invoke(sharedTransitionScopeImpl, new SharedTransitionScopeRootModifierElement(sharedTransitionScopeImpl), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // h.g.a.q
        public /* bridge */ /* synthetic */ ab invoke(LookaheadScope lookaheadScope, Composer composer, Integer num) {
            invoke(lookaheadScope, composer, num.intValue());
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionLayout$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements r<SharedTransitionScope, Modifier, Composer, Integer, ab> {
        final /* synthetic */ q<SharedTransitionScope, Composer, Integer, ab> $content;
        final /* synthetic */ Modifier $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Modifier modifier, q<? super SharedTransitionScope, ? super Composer, ? super Integer, ab> qVar) {
            super(4);
            this.$modifier = modifier;
            this.$content = qVar;
        }

        public final void invoke(SharedTransitionScope sharedTransitionScope, Modifier modifier, Composer composer, int i2) {
            int i3;
            if ((i2 & 6) == 0) {
                i3 = (true != composer.changed(sharedTransitionScope) ? 2 : 4) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= true != composer.changed(modifier) ? 16 : 32;
            }
            if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1948801580, i3, -1, "androidx.compose.animation.SharedTransitionLayout.<anonymous> (SharedTransitionScope.kt:127)");
            }
            Modifier modifierThen = this.$modifier.then(modifier);
            q<SharedTransitionScope, Composer, Integer, ab> qVar = this.$content;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM = SharedTransitionScopeKt$SharedTransitionLayout$1$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierThen);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7348initimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            qVar.invoke(sharedTransitionScope, composer, Integer.valueOf(i3 & 14));
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // h.g.a.r
        public /* bridge */ /* synthetic */ ab invoke(SharedTransitionScope sharedTransitionScope, Modifier modifier, Composer composer, Integer num) {
            invoke(sharedTransitionScope, modifier, composer, num.intValue());
            return ab.f48028a;
        }
    }
}
