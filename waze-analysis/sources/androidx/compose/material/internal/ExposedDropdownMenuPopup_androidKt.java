package androidx.compose.material.internal;

import android.view.View;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ExposedDropdownMenuPopup_androidKt {
    private static final ProvidableCompositionLocal<String> LocalPopupTestTag = CompositionLocalKt.compositionLocalOf$default(null, new a() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$$ExternalSyntheticLambda9
        @Override // h.g.a.a
        public final Object invoke() {
            return ExposedDropdownMenuPopup_androidKt.LocalPopupTestTag$lambda$0();
        }
    }, 1, null);

    public static final void ExposedDropdownMenuPopup(a<ab> aVar, PopupPositionProvider popupPositionProvider, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2, final int i3) {
        final a<ab> aVar2;
        int i4;
        final PopupPositionProvider popupPositionProvider2 = popupPositionProvider;
        int i5 = i3 & 1;
        Composer composerStartRestartGroup = composer.startRestartGroup(1705178815);
        if (i5 != 0) {
            i4 = i2 | 6;
            aVar2 = aVar;
        } else if ((i2 & 6) == 0) {
            aVar2 = aVar;
            i4 = (true != composerStartRestartGroup.changedInstance(aVar2) ? 2 : 4) | i2;
        } else {
            aVar2 = aVar;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(popupPositionProvider2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar) ? 128 : 256;
        }
        int i6 = i4;
        if (composerStartRestartGroup.shouldExecute((i6 & 147) != 146, i6 & 1)) {
            a<ab> aVar3 = 1 == i5 ? null : aVar2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1705178815, i6, -1, "androidx.compose.material.internal.ExposedDropdownMenuPopup (ExposedDropdownMenuPopup.android.kt:80)");
            }
            View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            final String str = (String) composerStartRestartGroup.consume(LocalPopupTestTag);
            final LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            CompositionContext compositionContextRememberCompositionContext = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(pVar, composerStartRestartGroup, (i6 >> 6) & 14);
            Object[] objArr = new Object[0];
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new a() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$$ExternalSyntheticLambda0
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return UUID.randomUUID();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            UUID uuid = (UUID) RememberSaveableKt.rememberSaveable(objArr, (a) objRememberedValue, composerStartRestartGroup, 48);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                a<ab> aVar4 = aVar3;
                final PopupLayout popupLayout = new PopupLayout(aVar4, str, view, density, popupPositionProvider, uuid);
                aVar2 = aVar4;
                str = str;
                popupPositionProvider2 = popupPositionProvider;
                popupLayout.setContent(compositionContextRememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(1879981140, true, new p() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$$ExternalSyntheticLambda1
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup$lambda$2$0$0(popupLayout, stateRememberUpdatedState, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }));
                composerStartRestartGroup.updateRememberedValue(popupLayout);
                objRememberedValue2 = popupLayout;
            } else {
                aVar2 = aVar3;
            }
            final PopupLayout popupLayout2 = (PopupLayout) objRememberedValue2;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(popupLayout2);
            boolean z = (i6 & 14) == 4;
            LayoutDirection layoutDirection2 = layoutDirection;
            boolean zChanged = zChangedInstance | z | composerStartRestartGroup.changed(str) | composerStartRestartGroup.changed(layoutDirection2.ordinal());
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new l() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$$ExternalSyntheticLambda2
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup$lambda$3$0(popupLayout2, aVar2, str, layoutDirection, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.DisposableEffect(popupLayout2, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 0);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(popupLayout2) | z | composerStartRestartGroup.changed(str) | composerStartRestartGroup.changed(layoutDirection2.ordinal());
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new a() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$$ExternalSyntheticLambda3
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup$lambda$4$0(popupLayout2, aVar2, str, layoutDirection);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.SideEffect((a) objRememberedValue4, composerStartRestartGroup, 0);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(popupLayout2) | ((i6 & 112) == 32);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = new l() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$$ExternalSyntheticLambda4
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup$lambda$5$0(popupLayout2, popupPositionProvider2, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            EffectsKt.DisposableEffect(popupPositionProvider2, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composerStartRestartGroup, (i6 >> 3) & 14);
            Modifier.Companion companion = Modifier.Companion;
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(popupLayout2);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = new l() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$$ExternalSyntheticLambda5
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup$lambda$7$0(popupLayout2, (LayoutCoordinates) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion, (l) objRememberedValue6);
            boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(popupLayout2) | composerStartRestartGroup.changed(layoutDirection2.ordinal());
            ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6$1 exposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance5 || exposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6$1RememberedValue == Composer.Companion.getEmpty()) {
                exposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6$1RememberedValue = new ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6$1(popupLayout2, layoutDirection);
                composerStartRestartGroup.updateRememberedValue(exposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6$1RememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) exposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6$1RememberedValue;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, ab> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerStartRestartGroup.getInserting() || !x.n(composerStartRestartGroup.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Integer numValueOf = Integer.valueOf(currentCompositeKeyHash);
                composerStartRestartGroup.updateRememberedValue(numValueOf);
                composerStartRestartGroup.apply(numValueOf, setCompositeKeyHash);
            }
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final a<ab> aVar5 = aVar2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$$ExternalSyntheticLambda6
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup$lambda$9(aVar5, popupPositionProvider2, pVar, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final p<Composer, Integer, ab> ExposedDropdownMenuPopup$lambda$0(State<? extends p<? super Composer, ? super Integer, ab>> state) {
        return (p) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ExposedDropdownMenuPopup$lambda$2$0$0(final PopupLayout popupLayout, State state, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1879981140, i2, -1, "androidx.compose.material.internal.ExposedDropdownMenuPopup.<anonymous>.<anonymous>.<anonymous> (ExposedDropdownMenuPopup.android.kt:99)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$$ExternalSyntheticLambda7
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup$lambda$2$0$0$0$0((SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierSemantics = SemanticsModifierKt.semantics(companion, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (l) objRememberedValue);
            boolean zChangedInstance = composer.changedInstance(popupLayout);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new l() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$$ExternalSyntheticLambda8
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup$lambda$2$0$0$1$0(popupLayout, (IntSize) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierAlpha = AlphaKt.alpha(OnRemeasuredModifierKt.onSizeChanged(modifierSemantics, (l) objRememberedValue2), true != popupLayout.getCanCalculatePosition() ? 0.0f : 1.0f);
            p<Composer, Integer, ab> pVarExposedDropdownMenuPopup$lambda$0 = ExposedDropdownMenuPopup$lambda$0(state);
            ExposedDropdownMenuPopup_androidKt$SimpleStack$1$1 exposedDropdownMenuPopup_androidKt$SimpleStack$1$1RememberedValue = composer.rememberedValue();
            if (exposedDropdownMenuPopup_androidKt$SimpleStack$1$1RememberedValue == Composer.Companion.getEmpty()) {
                exposedDropdownMenuPopup_androidKt$SimpleStack$1$1RememberedValue = ExposedDropdownMenuPopup_androidKt$SimpleStack$1$1.INSTANCE;
                composer.updateRememberedValue(exposedDropdownMenuPopup_androidKt$SimpleStack$1$1RememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) exposedDropdownMenuPopup_androidKt$SimpleStack$1$1RememberedValue;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierAlpha);
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
            Updater.m7351setimpl(composer, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, ab> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer.getInserting() || !x.n(composer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Integer numValueOf = Integer.valueOf(currentCompositeKeyHash);
                composer.updateRememberedValue(numValueOf);
                composer.apply(numValueOf, setCompositeKeyHash);
            }
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            pVarExposedDropdownMenuPopup$lambda$0.invoke(composer, 0);
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
    public static final ab ExposedDropdownMenuPopup$lambda$2$0$0$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.popup(semanticsPropertyReceiver);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ExposedDropdownMenuPopup$lambda$2$0$0$1$0(PopupLayout popupLayout, IntSize intSize) {
        popupLayout.m4290setPopupContentSizefhxjrPA(intSize);
        popupLayout.updatePosition();
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult ExposedDropdownMenuPopup$lambda$3$0(final PopupLayout popupLayout, a aVar, String str, LayoutDirection layoutDirection, DisposableEffectScope disposableEffectScope) {
        popupLayout.show();
        popupLayout.updateParameters(aVar, str, layoutDirection);
        return new DisposableEffectResult() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$lambda$3$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                popupLayout.disposeComposition();
                popupLayout.dismiss();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ExposedDropdownMenuPopup$lambda$4$0(PopupLayout popupLayout, a aVar, String str, LayoutDirection layoutDirection) {
        popupLayout.updateParameters(aVar, str, layoutDirection);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult ExposedDropdownMenuPopup$lambda$5$0(PopupLayout popupLayout, PopupPositionProvider popupPositionProvider, DisposableEffectScope disposableEffectScope) {
        popupLayout.setPositionProvider(popupPositionProvider);
        popupLayout.updatePosition();
        return new DisposableEffectResult() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$lambda$5$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ExposedDropdownMenuPopup$lambda$7$0(PopupLayout popupLayout, LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        x.c(parentLayoutCoordinates);
        long jMo9743getSizeYbymL2g = parentLayoutCoordinates.mo9743getSizeYbymL2g();
        long jPositionInWindow = LayoutCoordinatesKt.positionInWindow(parentLayoutCoordinates);
        popupLayout.setParentBounds(IntRectKt.m11329IntRectVbeCjmY((h.h.a.b(Float.intBitsToFloat((int) (jPositionInWindow >> 32))) << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & h.h.a.b(Float.intBitsToFloat((int) (jPositionInWindow & MuxerUtil.UNSIGNED_INT_MAX_VALUE)))), jMo9743getSizeYbymL2g));
        popupLayout.updatePosition();
        return ab.f48028a;
    }

    static final ab ExposedDropdownMenuPopup$lambda$9(a aVar, PopupPositionProvider popupPositionProvider, p pVar, int i2, int i3, Composer composer, int i4) {
        ExposedDropdownMenuPopup(aVar, popupPositionProvider, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final String LocalPopupTestTag$lambda$0() {
        return "DEFAULT_TEST_TAG";
    }

    private static final void SimpleStack(Modifier modifier, p<? super Composer, ? super Integer, ab> pVar, Composer composer, int i2) {
        ExposedDropdownMenuPopup_androidKt$SimpleStack$1$1 exposedDropdownMenuPopup_androidKt$SimpleStack$1$1RememberedValue = composer.rememberedValue();
        if (exposedDropdownMenuPopup_androidKt$SimpleStack$1$1RememberedValue == Composer.Companion.getEmpty()) {
            exposedDropdownMenuPopup_androidKt$SimpleStack$1$1RememberedValue = ExposedDropdownMenuPopup_androidKt$SimpleStack$1$1.INSTANCE;
            composer.updateRememberedValue(exposedDropdownMenuPopup_androidKt$SimpleStack$1$1RememberedValue);
        }
        int i3 = i2 >> 3;
        int i4 = i2 << 3;
        MeasurePolicy measurePolicy = (MeasurePolicy) exposedDropdownMenuPopup_androidKt$SimpleStack$1$1RememberedValue;
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
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
        Updater.m7351setimpl(composer, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, ab> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (composer.getInserting() || !x.n(composer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            Integer numValueOf = Integer.valueOf(currentCompositeKeyHash);
            composer.updateRememberedValue(numValueOf);
            composer.apply(numValueOf, setCompositeKeyHash);
        }
        Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
        pVar.invoke(composer, Integer.valueOf((((((((i3 & 14) | 384) | (i4 & 112)) << 6) & DisplayStrings.DS_TAP_TO_VERIFY) | 6) >> 6) & 14));
        composer.endNode();
    }

    public static final ProvidableCompositionLocal<String> getLocalPopupTestTag() {
        return LocalPopupTestTag;
    }
}
