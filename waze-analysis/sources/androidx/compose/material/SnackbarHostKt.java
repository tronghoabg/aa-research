package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.util.ListUtilsKt;
import com.waze.strings.DisplayStrings;
import h.a.i;
import h.ab;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.x;
import java.util.List;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SnackbarHostKt {
    private static final int SnackbarFadeInMillis = 150;
    private static final int SnackbarFadeOutMillis = 75;
    private static final int SnackbarInBetweenDelayMillis = 0;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SnackbarDuration.values().length];
            try {
                iArr[SnackbarDuration.Indefinite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SnackbarDuration.Long.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SnackbarDuration.Short.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: $r8$lambda$YXy52QBSTZOzJrOG4zZlECPls-4, reason: not valid java name */
    public static /* synthetic */ boolean m4194$r8$lambda$YXy52QBSTZOzJrOG4zZlECPls4(SnackbarData snackbarData) {
        FadeInFadeOutWithScale$lambda$2$0$1$0$0(snackbarData);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void FadeInFadeOutWithScale(final androidx.compose.material.SnackbarData r18, androidx.compose.ui.Modifier r19, final h.g.a.q<? super androidx.compose.material.SnackbarData, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostKt.FadeInFadeOutWithScale(androidx.compose.material.SnackbarData, androidx.compose.ui.Modifier, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab FadeInFadeOutWithScale$lambda$2$0(final SnackbarData snackbarData, SnackbarData snackbarData2, List list, final FadeInFadeOutState fadeInFadeOutState, final String str, p pVar, Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = i2 | (true != composer.changedInstance(pVar) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1032415134, i3, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:257)");
            }
            final boolean zN = x.n(snackbarData, snackbarData2);
            int i4 = true != zN ? 75 : 150;
            int i5 = (!zN || ListUtilsKt.fastFilterNotNull(list).size() == 1) ? 0 : 75;
            TweenSpec tweenSpecTween = AnimationSpecKt.tween(i4, i5, EasingKt.getLinearEasing());
            boolean zChangedInstance = composer.changedInstance(snackbarData) | composer.changedInstance(fadeInFadeOutState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new a() { // from class: androidx.compose.material.SnackbarHostKt$$ExternalSyntheticLambda1
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return SnackbarHostKt.FadeInFadeOutWithScale$lambda$2$0$0$0(snackbarData, fadeInFadeOutState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            State<Float> stateAnimatedOpacity = animatedOpacity(tweenSpecTween, zN, (a) objRememberedValue, composer, 0, 0);
            State<Float> stateAnimatedScale = animatedScale(AnimationSpecKt.tween(i4, i5, EasingKt.getFastOutSlowInEasing()), zN, composer, 0);
            Modifier modifierM8396graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m8396graphicsLayerAp8cVGQ$default(Modifier.Companion, stateAnimatedScale.getValue().floatValue(), stateAnimatedScale.getValue().floatValue(), stateAnimatedOpacity.getValue().floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131064, null);
            boolean zChanged = composer.changed(zN) | composer.changed(str) | composer.changedInstance(snackbarData);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new l() { // from class: androidx.compose.material.SnackbarHostKt$$ExternalSyntheticLambda2
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return SnackbarHostKt.FadeInFadeOutWithScale$lambda$2$0$1$0(zN, str, snackbarData, (SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierSemantics = SemanticsModifierKt.semantics(modifierM8396graphicsLayerAp8cVGQ$default, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (l) objRememberedValue2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierSemantics);
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
            p<ComposeUiNode, Integer, ab> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer.getInserting() || !x.n(composer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Integer numValueOf = Integer.valueOf(currentCompositeKeyHash);
                composer.updateRememberedValue(numValueOf);
                composer.apply(numValueOf, setCompositeKeyHash);
            }
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composer, Integer.valueOf(i3 & 14));
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab FadeInFadeOutWithScale$lambda$2$0$0$0(final SnackbarData snackbarData, FadeInFadeOutState fadeInFadeOutState) {
        if (!x.n(snackbarData, fadeInFadeOutState.getCurrent())) {
            i.aQ(fadeInFadeOutState.getItems(), new l() { // from class: androidx.compose.material.SnackbarHostKt$$ExternalSyntheticLambda4
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(SnackbarHostKt.FadeInFadeOutWithScale$lambda$2$0$0$0$0(snackbarData, (FadeInFadeOutAnimationItem) obj));
                }
            });
            RecomposeScope scope = fadeInFadeOutState.getScope();
            if (scope != null) {
                scope.invalidate();
            }
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FadeInFadeOutWithScale$lambda$2$0$0$0$0(SnackbarData snackbarData, FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem) {
        return x.n(fadeInFadeOutAnimationItem.getKey(), snackbarData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab FadeInFadeOutWithScale$lambda$2$0$1$0(boolean z, String str, final SnackbarData snackbarData, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (z) {
            SemanticsPropertiesKt.m10334setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.Companion.m10308getPolite0phEisY());
        }
        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new a() { // from class: androidx.compose.material.SnackbarHostKt$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                SnackbarHostKt.m4194$r8$lambda$YXy52QBSTZOzJrOG4zZlECPls4(snackbarData);
                return true;
            }
        }, 1, null);
        return ab.f48028a;
    }

    private static final boolean FadeInFadeOutWithScale$lambda$2$0$1$0$0(SnackbarData snackbarData) {
        snackbarData.dismiss();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab FadeInFadeOutWithScale$lambda$3$0$0(q qVar, SnackbarData snackbarData, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2017516783, i2, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:317)");
            }
            if (snackbarData == null) {
                x.g();
            }
            qVar.invoke(snackbarData, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab FadeInFadeOutWithScale$lambda$4(SnackbarData snackbarData, Modifier modifier, q qVar, int i2, int i3, Composer composer, int i4) {
        FadeInFadeOutWithScale(snackbarData, modifier, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    public static final void SnackbarHost(final SnackbarHostState snackbarHostState, Modifier modifier, q<? super SnackbarData, ? super Composer, ? super Integer, ab> qVar, Composer composer, final int i2, final int i3) {
        int i4;
        final Modifier modifier2;
        final q<? super SnackbarData, ? super Composer, ? super Integer, ab> qVar2;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1351125615);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changed(snackbarHostState) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(qVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            if (i6 != 0) {
                modifier = Modifier.Companion;
            }
            Modifier modifier3 = modifier;
            if (i7 != 0) {
                qVar = ComposableSingletons$SnackbarHostKt.INSTANCE.getLambda$1890101041$material();
            }
            q<? super SnackbarData, ? super Composer, ? super Integer, ab> qVar3 = qVar;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1351125615, i4, -1, "androidx.compose.material.SnackbarHost (SnackbarHost.kt:155)");
            }
            SnackbarData currentSnackbarData = snackbarHostState.getCurrentSnackbarData();
            AccessibilityManager accessibilityManager = (AccessibilityManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalAccessibilityManager());
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(currentSnackbarData) | composerStartRestartGroup.changedInstance(accessibilityManager);
            SnackbarHostKt$SnackbarHost$1$1 snackbarHostKt$SnackbarHost$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || snackbarHostKt$SnackbarHost$1$1RememberedValue == Composer.Companion.getEmpty()) {
                snackbarHostKt$SnackbarHost$1$1RememberedValue = new SnackbarHostKt$SnackbarHost$1$1(currentSnackbarData, accessibilityManager, null);
                composerStartRestartGroup.updateRememberedValue(snackbarHostKt$SnackbarHost$1$1RememberedValue);
            }
            EffectsKt.LaunchedEffect(currentSnackbarData, (p<? super af, ? super e<? super ab>, ? extends Object>) snackbarHostKt$SnackbarHost$1$1RememberedValue, composerStartRestartGroup, 0);
            FadeInFadeOutWithScale(snackbarHostState.getCurrentSnackbarData(), modifier3, qVar3, composerStartRestartGroup, i4 & 1008, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            qVar2 = qVar3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            qVar2 = qVar;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.SnackbarHostKt$$ExternalSyntheticLambda8
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SnackbarHostKt.SnackbarHost$lambda$1(snackbarHostState, modifier2, qVar2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab SnackbarHost$lambda$1(SnackbarHostState snackbarHostState, Modifier modifier, q qVar, int i2, int i3, Composer composer, int i4) {
        SnackbarHost(snackbarHostState, modifier, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    private static final State<Float> animatedOpacity(AnimationSpec<Float> animationSpec, boolean z, a<ab> aVar, Composer composer, int i2, int i3) {
        if ((i3 & 4) != 0) {
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new a() { // from class: androidx.compose.material.SnackbarHostKt$$ExternalSyntheticLambda3
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return ab.f48028a;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            aVar = (a) objRememberedValue;
        }
        a<ab> aVar2 = aVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1016418159, i2, -1, "androidx.compose.material.animatedOpacity (SnackbarHost.kt:340)");
        }
        Object objRememberedValue2 = composer.rememberedValue();
        boolean z2 = true;
        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = AnimatableKt.Animatable$default(true != z ? 1.0f : 0.0f, 0.0f, 2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        Animatable animatable = (Animatable) objRememberedValue2;
        Boolean boolValueOf = Boolean.valueOf(z);
        boolean zChangedInstance = composer.changedInstance(animatable) | ((((i2 & 112) ^ 48) > 32 && composer.changed(z)) || (i2 & 48) == 32) | composer.changedInstance(animationSpec);
        if ((((i2 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) <= 256 || !composer.changed(aVar2)) && (i2 & 384) != 256) {
            z2 = false;
        }
        boolean z3 = zChangedInstance | z2;
        Object objRememberedValue3 = composer.rememberedValue();
        if (z3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = (p) new SnackbarHostKt$animatedOpacity$2$1(animatable, z, animationSpec, aVar2, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        EffectsKt.LaunchedEffect(boolValueOf, (p<? super af, ? super e<? super ab>, ? extends Object>) objRememberedValue3, composer, (i2 >> 3) & 14);
        State<Float> stateAsState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAsState;
    }

    private static final State<Float> animatedScale(AnimationSpec<Float> animationSpec, boolean z, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2003504988, i2, -1, "androidx.compose.material.animatedScale (SnackbarHost.kt:350)");
        }
        Object objRememberedValue = composer.rememberedValue();
        boolean z2 = true;
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = AnimatableKt.Animatable$default(true != z ? 1.0f : 0.8f, 0.0f, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        Animatable animatable = (Animatable) objRememberedValue;
        Boolean boolValueOf = Boolean.valueOf(z);
        boolean zChangedInstance = composer.changedInstance(animatable);
        if ((((i2 & 112) ^ 48) <= 32 || !composer.changed(z)) && (i2 & 48) != 32) {
            z2 = false;
        }
        boolean zChangedInstance2 = z2 | zChangedInstance | composer.changedInstance(animationSpec);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = (p) new SnackbarHostKt$animatedScale$1$1(animatable, z, animationSpec, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.LaunchedEffect(boolValueOf, (p<? super af, ? super e<? super ab>, ? extends Object>) objRememberedValue2, composer, (i2 >> 3) & 14);
        State<Float> stateAsState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAsState;
    }

    public static final long toMillis(SnackbarDuration snackbarDuration, boolean z, AccessibilityManager accessibilityManager) {
        long j2;
        SnackbarDuration snackbarDuration2 = SnackbarDuration.Short;
        int iOrdinal = snackbarDuration.ordinal();
        if (iOrdinal == 0) {
            j2 = 4000;
        } else if (iOrdinal == 1) {
            j2 = 10000;
        } else {
            if (iOrdinal != 2) {
                throw new h.i();
            }
            j2 = Long.MAX_VALUE;
        }
        long j3 = j2;
        return accessibilityManager == null ? j3 : accessibilityManager.calculateRecommendedTimeoutMillis(j3, true, true, z);
    }
}
