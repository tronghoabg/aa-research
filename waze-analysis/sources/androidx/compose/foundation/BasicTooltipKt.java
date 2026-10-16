package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import com.waze.strings.DisplayStrings;
import e.b.c;
import h.ab;
import h.c.b.a.f;
import h.c.b.a.g;
import h.c.e;
import h.c.k;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BasicTooltipKt {
    public static /* synthetic */ boolean $r8$lambda$3iP3VMMtXU_A5c7wOnMj1GsfXsU(af afVar, BasicTooltipState basicTooltipState) {
        anchorSemantics$lambda$0$0(afVar, basicTooltipState);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTooltipBox(final androidx.compose.ui.window.PopupPositionProvider r20, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r21, androidx.compose.foundation.BasicTooltipState r22, androidx.compose.ui.Modifier r23, boolean r24, boolean r25, boolean r26, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltipKt.BasicTooltipBox(androidx.compose.ui.window.PopupPositionProvider, h.g.a.p, androidx.compose.foundation.BasicTooltipState, androidx.compose.ui.Modifier, boolean, boolean, boolean, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab BasicTooltipBox$lambda$0(BasicTooltipState basicTooltipState, PopupPositionProvider popupPositionProvider, af afVar, boolean z, p pVar, p pVar2, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(99800901, i2, -1, "androidx.compose.foundation.BasicTooltipBox.<anonymous> (BasicTooltip.kt:92)");
            }
            if (basicTooltipState.isVisible()) {
                composer.startReplaceGroup(1051311053);
                TooltipPopup(popupPositionProvider, basicTooltipState, afVar, z, pVar, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1051541693);
                composer.endReplaceGroup();
            }
            pVar2.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult BasicTooltipBox$lambda$1$0(final BasicTooltipState basicTooltipState, DisposableEffectScope disposableEffectScope) {
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.BasicTooltipKt$BasicTooltipBox$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                basicTooltipState.onDispose();
            }
        };
    }

    static final ab BasicTooltipBox$lambda$2(PopupPositionProvider popupPositionProvider, p pVar, BasicTooltipState basicTooltipState, Modifier modifier, boolean z, boolean z2, boolean z3, p pVar2, int i2, int i3, Composer composer, int i4) {
        BasicTooltipBox(popupPositionProvider, pVar, basicTooltipState, modifier, z, z2, z3, pVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab BasicTooltipBox$lambda$3(PopupPositionProvider popupPositionProvider, p pVar, BasicTooltipState basicTooltipState, Modifier modifier, boolean z, boolean z2, p pVar2, int i2, int i3, Composer composer, int i4) {
        BasicTooltipBox(popupPositionProvider, pVar, basicTooltipState, modifier, z, z2, pVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    public static final BasicTooltipState BasicTooltipState(boolean z, boolean z2, MutatorMutex mutatorMutex) {
        return new BasicTooltipStateImpl(z, z2, mutatorMutex);
    }

    public static /* synthetic */ BasicTooltipState BasicTooltipState$default(boolean z, boolean z2, MutatorMutex mutatorMutex, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            mutatorMutex = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        return BasicTooltipState(1 == ((z ? 1 : 0) & ((i2 & 1) ^ 1)), z2 | (!((i2 & 2) == 0)), mutatorMutex);
    }

    private static final void TooltipPopup(final PopupPositionProvider popupPositionProvider, final BasicTooltipState basicTooltipState, final af afVar, final boolean z, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        PopupPositionProvider popupPositionProvider2;
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1882542163);
        if (i4 == 0) {
            popupPositionProvider2 = popupPositionProvider;
            i3 = (true != composerStartRestartGroup.changed(popupPositionProvider2) ? 2 : 4) | i2;
        } else {
            popupPositionProvider2 = popupPositionProvider;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(basicTooltipState) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(afVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 8192 : 16384;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1882542163, i3, -1, "androidx.compose.foundation.TooltipPopup (BasicTooltip.kt:166)");
            }
            final String strDescription = BasicTooltipStrings.INSTANCE.description(composerStartRestartGroup, 6);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(afVar) | ((i3 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new a() { // from class: androidx.compose.foundation.BasicTooltipKt$$ExternalSyntheticLambda5
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return BasicTooltipKt.TooltipPopup$lambda$0$0(basicTooltipState, afVar);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            AndroidPopup_androidKt.Popup(popupPositionProvider2, (a) objRememberedValue, new PopupProperties(z, false, false, false, false, 30, (o) null), ComposableLambdaKt.rememberComposableLambda(916917707, true, new p() { // from class: androidx.compose.foundation.BasicTooltipKt$$ExternalSyntheticLambda6
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return BasicTooltipKt.TooltipPopup$lambda$1(strDescription, pVar, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.foundation.BasicTooltipKt$$ExternalSyntheticLambda7
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return BasicTooltipKt.TooltipPopup$lambda$2(popupPositionProvider, basicTooltipState, afVar, z, pVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab TooltipPopup$lambda$0$0(BasicTooltipState basicTooltipState, af afVar) {
        if (basicTooltipState.isVisible()) {
            aj.z(afVar, null, null, new BasicTooltipKt$TooltipPopup$1$1$1(basicTooltipState, null), 3);
        }
        return ab.f48028a;
    }

    static final ab TooltipPopup$lambda$1(final String str, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(916917707, i2, -1, "androidx.compose.foundation.TooltipPopup.<anonymous> (BasicTooltip.kt:177)");
            }
            Modifier.Companion companion = Modifier.Companion;
            boolean zChanged = composer.changed(str);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.foundation.BasicTooltipKt$$ExternalSyntheticLambda4
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return BasicTooltipKt.TooltipPopup$lambda$1$0$0(str, (SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierSemantics = SemanticsModifierKt.semantics(companion, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (l) objRememberedValue);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM = BasicTooltipKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
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
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composer, 0);
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
    public static final ab TooltipPopup$lambda$1$0$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m10334setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.Companion.m10307getAssertive0phEisY());
        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        return ab.f48028a;
    }

    static final ab TooltipPopup$lambda$2(PopupPositionProvider popupPositionProvider, BasicTooltipState basicTooltipState, af afVar, boolean z, p pVar, int i2, Composer composer, int i3) {
        TooltipPopup(popupPositionProvider, basicTooltipState, afVar, z, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    private static final void WrappedAnchor(final boolean z, final BasicTooltipState basicTooltipState, final boolean z2, Modifier modifier, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2, final int i3) {
        int i4;
        final Modifier modifier2;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(423692761);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changed(z) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(basicTooltipState) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changed(z2) ? 128 : 256;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 |= DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS;
        } else if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changed(modifier) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar) ? 8192 : 16384;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            Modifier modifier3 = i6 != 0 ? Modifier.Companion : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(423692761, i4, -1, "androidx.compose.foundation.WrappedAnchor (BasicTooltip.kt:144)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(k.f48060a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierAnchorSemantics = anchorSemantics(handleGestures(modifier3, z, basicTooltipState), BasicTooltipStrings.INSTANCE.label(composerStartRestartGroup, 6), z, basicTooltipState, (af) objRememberedValue);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), z2);
            int iM = BasicTooltipKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAnchorSemantics);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composerStartRestartGroup, Integer.valueOf((i4 >> 12) & 14));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.foundation.BasicTooltipKt$$ExternalSyntheticLambda11
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return BasicTooltipKt.WrappedAnchor$lambda$1(z, basicTooltipState, z2, modifier2, pVar, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab WrappedAnchor$lambda$1(boolean z, BasicTooltipState basicTooltipState, boolean z2, Modifier modifier, p pVar, int i2, int i3, Composer composer, int i4) {
        WrappedAnchor(z, basicTooltipState, z2, modifier, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    private static final Modifier anchorSemantics(Modifier modifier, final String str, boolean z, final BasicTooltipState basicTooltipState, final af afVar) {
        return z ? SemanticsModifierKt.semantics(modifier, true, new l() { // from class: androidx.compose.foundation.BasicTooltipKt$$ExternalSyntheticLambda10
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return BasicTooltipKt.anchorSemantics$lambda$0(str, afVar, basicTooltipState, (SemanticsPropertyReceiver) obj);
            }
        }) : modifier;
    }

    static final ab anchorSemantics$lambda$0(String str, final af afVar, final BasicTooltipState basicTooltipState, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver, str, new a() { // from class: androidx.compose.foundation.BasicTooltipKt$$ExternalSyntheticLambda8
            @Override // h.g.a.a
            public final Object invoke() {
                BasicTooltipKt.$r8$lambda$3iP3VMMtXU_A5c7wOnMj1GsfXsU(afVar, basicTooltipState);
                return true;
            }
        });
        return ab.f48028a;
    }

    private static final boolean anchorSemantics$lambda$0$0(af afVar, BasicTooltipState basicTooltipState) {
        aj.z(afVar, null, null, new BasicTooltipKt$anchorSemantics$1$1$1(basicTooltipState, null), 3);
        return true;
    }

    private static final Modifier handleGestures(Modifier modifier, boolean z, final BasicTooltipState basicTooltipState) {
        return z ? SuspendingPointerInputFilterKt.pointerInput(SuspendingPointerInputFilterKt.pointerInput(modifier, basicTooltipState, new PointerInputEventHandler() { // from class: androidx.compose.foundation.BasicTooltipKt.handleGestures.1

            /* compiled from: WazeSource */
            /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1, reason: invalid class name and collision with other inner class name */
            final class C00201 extends g implements p<af, e<? super ab>, Object> {
                final /* synthetic */ BasicTooltipState $state;
                final /* synthetic */ PointerInputScope $this_pointerInput;
                private /* synthetic */ Object L$0;
                int label;

                /* compiled from: WazeSource */
                /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1, reason: invalid class name and collision with other inner class name */
                final class C00211 extends f implements p<AwaitPointerEventScope, e<? super ab>, Object> {
                    final /* synthetic */ af $$this$coroutineScope;
                    final /* synthetic */ BasicTooltipState $state;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    int label;

                    /* compiled from: WazeSource */
                    /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1, reason: invalid class name and collision with other inner class name */
                    final class C00221 extends g implements p<af, e<? super ab>, Object> {
                        final /* synthetic */ BasicTooltipState $state;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00221(BasicTooltipState basicTooltipState, e<? super C00221> eVar) {
                            super(2, eVar);
                            this.$state = basicTooltipState;
                        }

                        @Override // h.c.b.a.a
                        public final e<ab> create(Object obj, e<?> eVar) {
                            return new C00221(this.$state, eVar);
                        }

                        @Override // h.g.a.p
                        public final Object invoke(af afVar, e<? super ab> eVar) {
                            return ((C00221) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                        }

                        @Override // h.c.b.a.a
                        public final Object invokeSuspend(Object obj) {
                            h.c.a.a aVar = h.c.a.a.f48038a;
                            int i2 = this.label;
                            if (i2 == 0) {
                                c.b(obj);
                                this.label = 1;
                                if (this.$state.show(MutatePriority.UserInput, this) == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c.b(obj);
                            }
                            return ab.f48028a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00211(af afVar, BasicTooltipState basicTooltipState, e<? super C00211> eVar) {
                        super(2, eVar);
                        this.$$this$coroutineScope = afVar;
                        this.$state = basicTooltipState;
                    }

                    @Override // h.c.b.a.a
                    public final e<ab> create(Object obj, e<?> eVar) {
                        C00211 c00211 = new C00211(this.$$this$coroutineScope, this.$state, eVar);
                        c00211.L$0 = obj;
                        return c00211;
                    }

                    @Override // h.g.a.p
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, e<? super ab> eVar) {
                        return ((C00211) create(awaitPointerEventScope, eVar)).invokeSuspend(ab.f48028a);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a2, code lost:
                    
                        if (r12 != r0) goto L26;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
                    @Override // h.c.b.a.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                        /*
                            r11 = this;
                            h.c.a.a r0 = h.c.a.a.f48038a
                            int r1 = r11.label
                            r2 = 2
                            r3 = 3
                            r4 = 1
                            if (r1 == 0) goto L34
                            if (r1 == r4) goto L28
                            if (r1 == r2) goto L1c
                            if (r1 != r3) goto L14
                            e.b.c.b(r12)
                            goto La4
                        L14:
                            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                            r11.<init>(r12)
                            throw r11
                        L1c:
                            java.lang.Object r1 = r11.L$1
                            androidx.compose.ui.input.pointer.PointerEventPass r1 = (androidx.compose.ui.input.pointer.PointerEventPass) r1
                            java.lang.Object r2 = r11.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r2
                            e.b.c.b(r12)
                            goto L80
                        L28:
                            java.lang.Object r1 = r11.L$1
                            androidx.compose.ui.input.pointer.PointerEventPass r1 = (androidx.compose.ui.input.pointer.PointerEventPass) r1
                            java.lang.Object r4 = r11.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r4
                            e.b.c.b(r12)
                            goto L52
                        L34:
                            e.b.c.b(r12)
                            java.lang.Object r12 = r11.L$0
                            r5 = r12
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                            androidx.compose.ui.input.pointer.PointerEventPass r7 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                            r8 = r11
                            h.c.e r8 = (h.c.e) r8
                            r11.L$0 = r5
                            r11.L$1 = r7
                            r11.label = r4
                            r9 = 1
                            r10 = 0
                            r6 = 0
                            java.lang.Object r12 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                            if (r12 == r0) goto Lc0
                            r4 = r5
                            r1 = r7
                        L52:
                            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
                            int r12 = r12.m9611getTypeT8wyACA()
                            androidx.compose.ui.input.pointer.PointerType$Companion r5 = androidx.compose.ui.input.pointer.PointerType.Companion
                            int r5 = r5.m9689getTouchT8wyACA()
                            boolean r5 = androidx.compose.ui.input.pointer.PointerType.m9682equalsimpl0(r12, r5)
                            if (r5 != 0) goto L70
                            androidx.compose.ui.input.pointer.PointerType$Companion r5 = androidx.compose.ui.input.pointer.PointerType.Companion
                            int r5 = r5.m9688getStylusT8wyACA()
                            boolean r12 = androidx.compose.ui.input.pointer.PointerType.m9682equalsimpl0(r12, r5)
                            if (r12 == 0) goto Lbd
                        L70:
                            r12 = r11
                            h.c.e r12 = (h.c.e) r12
                            r11.L$0 = r4
                            r11.L$1 = r1
                            r11.label = r2
                            java.lang.Object r12 = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForLongPress(r4, r1, r12)
                            if (r12 == r0) goto Lc0
                            r2 = r4
                        L80:
                            androidx.compose.foundation.gestures.LongPressResult r12 = (androidx.compose.foundation.gestures.LongPressResult) r12
                            boolean r12 = r12 instanceof androidx.compose.foundation.gestures.LongPressResult.Success
                            if (r12 == 0) goto Lbd
                            kotlinx.coroutines.af r12 = r11.$$this$coroutineScope
                            androidx.compose.foundation.BasicTooltipState r4 = r11.$state
                            androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1 r5 = new androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1
                            r6 = 0
                            r5.<init>(r4, r6)
                            h.g.a.p r5 = (h.g.a.p) r5
                            kotlinx.coroutines.aj.z(r12, r6, r6, r5, r3)
                            r12 = r11
                            h.c.e r12 = (h.c.e) r12
                            r11.L$0 = r6
                            r11.L$1 = r6
                            r11.label = r3
                            java.lang.Object r12 = r2.awaitPointerEvent(r1, r12)
                            if (r12 == r0) goto Lc0
                        La4:
                            androidx.compose.ui.input.pointer.PointerEvent r12 = (androidx.compose.ui.input.pointer.PointerEvent) r12
                            java.util.List r11 = r12.getChanges()
                            int r12 = r11.size()
                            r0 = 0
                        Laf:
                            if (r0 >= r12) goto Lbd
                            java.lang.Object r1 = r11.get(r0)
                            androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
                            r1.consume()
                            int r0 = r0 + 1
                            goto Laf
                        Lbd:
                            h.ab r11 = h.ab.f48028a
                            return r11
                        Lc0:
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltipKt.AnonymousClass1.C00201.C00211.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00201(PointerInputScope pointerInputScope, BasicTooltipState basicTooltipState, e<? super C00201> eVar) {
                    super(2, eVar);
                    this.$this_pointerInput = pointerInputScope;
                    this.$state = basicTooltipState;
                }

                @Override // h.c.b.a.a
                public final e<ab> create(Object obj, e<?> eVar) {
                    C00201 c00201 = new C00201(this.$this_pointerInput, this.$state, eVar);
                    c00201.L$0 = obj;
                    return c00201;
                }

                @Override // h.g.a.p
                public final Object invoke(af afVar, e<? super ab> eVar) {
                    return ((C00201) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                }

                @Override // h.c.b.a.a
                public final Object invokeSuspend(Object obj) {
                    h.c.a.a aVar = h.c.a.a.f48038a;
                    int i2 = this.label;
                    if (i2 == 0) {
                        c.b(obj);
                        af afVar = (af) this.L$0;
                        this.label = 1;
                        if (ForEachGestureKt.awaitEachGesture(this.$this_pointerInput, new C00211(afVar, this.$state, null), this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c.b(obj);
                    }
                    return ab.f48028a;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar) {
                Object objD = aj.d(new C00201(pointerInputScope, basicTooltipState, null), eVar);
                return objD == h.c.a.a.f48038a ? objD : ab.f48028a;
            }
        }), basicTooltipState, new PointerInputEventHandler() { // from class: androidx.compose.foundation.BasicTooltipKt.handleGestures.2

            /* compiled from: WazeSource */
            /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1, reason: invalid class name */
            final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
                final /* synthetic */ BasicTooltipState $state;
                final /* synthetic */ PointerInputScope $this_pointerInput;
                private /* synthetic */ Object L$0;
                int label;

                /* compiled from: WazeSource */
                /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1, reason: invalid class name and collision with other inner class name */
                final class C00231 extends f implements p<AwaitPointerEventScope, e<? super ab>, Object> {
                    final /* synthetic */ af $$this$coroutineScope;
                    final /* synthetic */ BasicTooltipState $state;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    int label;

                    /* compiled from: WazeSource */
                    /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1, reason: invalid class name and collision with other inner class name */
                    final class C00241 extends g implements p<af, e<? super ab>, Object> {
                        final /* synthetic */ BasicTooltipState $state;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00241(BasicTooltipState basicTooltipState, e<? super C00241> eVar) {
                            super(2, eVar);
                            this.$state = basicTooltipState;
                        }

                        @Override // h.c.b.a.a
                        public final e<ab> create(Object obj, e<?> eVar) {
                            return new C00241(this.$state, eVar);
                        }

                        @Override // h.g.a.p
                        public final Object invoke(af afVar, e<? super ab> eVar) {
                            return ((C00241) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                        }

                        @Override // h.c.b.a.a
                        public final Object invokeSuspend(Object obj) {
                            h.c.a.a aVar = h.c.a.a.f48038a;
                            int i2 = this.label;
                            if (i2 == 0) {
                                c.b(obj);
                                this.label = 1;
                                if (this.$state.show(MutatePriority.UserInput, this) == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c.b(obj);
                            }
                            return ab.f48028a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00231(af afVar, BasicTooltipState basicTooltipState, e<? super C00231> eVar) {
                        super(2, eVar);
                        this.$$this$coroutineScope = afVar;
                        this.$state = basicTooltipState;
                    }

                    @Override // h.c.b.a.a
                    public final e<ab> create(Object obj, e<?> eVar) {
                        C00231 c00231 = new C00231(this.$$this$coroutineScope, this.$state, eVar);
                        c00231.L$0 = obj;
                        return c00231;
                    }

                    @Override // h.g.a.p
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, e<? super ab> eVar) {
                        return ((C00231) create(awaitPointerEventScope, eVar)).invokeSuspend(ab.f48028a);
                    }

                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    /* JADX WARN: Removed duplicated region for block: B:11:0x0036 A[RETURN] */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0034 -> B:12:0x0037). Please report as a decompilation issue!!! */
                    @Override // h.c.b.a.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                        /*
                            r7 = this;
                            h.c.a.a r0 = h.c.a.a.f48038a
                            int r1 = r7.label
                            r2 = 1
                            if (r1 == 0) goto L1d
                            if (r1 != r2) goto L15
                            java.lang.Object r1 = r7.L$1
                            androidx.compose.ui.input.pointer.PointerEventPass r1 = (androidx.compose.ui.input.pointer.PointerEventPass) r1
                            java.lang.Object r3 = r7.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
                            e.b.c.b(r8)
                            goto L37
                        L15:
                            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                            r7.<init>(r8)
                            throw r7
                        L1d:
                            e.b.c.b(r8)
                            java.lang.Object r8 = r7.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
                            androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Main
                            r3 = r8
                        L27:
                            r8 = r7
                            h.c.e r8 = (h.c.e) r8
                            r7.L$0 = r3
                            r7.L$1 = r1
                            r7.label = r2
                            java.lang.Object r8 = r3.awaitPointerEvent(r1, r8)
                            if (r8 != r0) goto L37
                            return r0
                        L37:
                            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
                            java.util.List r4 = r8.getChanges()
                            r5 = 0
                            java.lang.Object r4 = r4.get(r5)
                            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
                            int r4 = r4.m9611getTypeT8wyACA()
                            androidx.compose.ui.input.pointer.PointerType$Companion r5 = androidx.compose.ui.input.pointer.PointerType.Companion
                            int r5 = r5.m9687getMouseT8wyACA()
                            boolean r4 = androidx.compose.ui.input.pointer.PointerType.m9682equalsimpl0(r4, r5)
                            if (r4 == 0) goto L27
                            int r8 = r8.m9541getType7fucELk()
                            androidx.compose.ui.input.pointer.PointerEventType$Companion r4 = androidx.compose.ui.input.pointer.PointerEventType.Companion
                            int r4 = r4.m9552getEnter7fucELk()
                            boolean r4 = androidx.compose.ui.input.pointer.PointerEventType.m9548equalsimpl0(r8, r4)
                            if (r4 == 0) goto L75
                            kotlinx.coroutines.af r8 = r7.$$this$coroutineScope
                            androidx.compose.foundation.BasicTooltipState r4 = r7.$state
                            androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1 r5 = new androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1
                            r6 = 0
                            r5.<init>(r4, r6)
                            h.g.a.p r5 = (h.g.a.p) r5
                            r4 = 3
                            kotlinx.coroutines.aj.z(r8, r6, r6, r5, r4)
                            goto L27
                        L75:
                            androidx.compose.ui.input.pointer.PointerEventType$Companion r4 = androidx.compose.ui.input.pointer.PointerEventType.Companion
                            int r4 = r4.m9553getExit7fucELk()
                            boolean r8 = androidx.compose.ui.input.pointer.PointerEventType.m9548equalsimpl0(r8, r4)
                            if (r8 == 0) goto L27
                            androidx.compose.foundation.BasicTooltipState r8 = r7.$state
                            r8.dismiss()
                            goto L27
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltipKt.AnonymousClass2.AnonymousClass1.C00231.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(PointerInputScope pointerInputScope, BasicTooltipState basicTooltipState, e<? super AnonymousClass1> eVar) {
                    super(2, eVar);
                    this.$this_pointerInput = pointerInputScope;
                    this.$state = basicTooltipState;
                }

                @Override // h.c.b.a.a
                public final e<ab> create(Object obj, e<?> eVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_pointerInput, this.$state, eVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // h.g.a.p
                public final Object invoke(af afVar, e<? super ab> eVar) {
                    return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                }

                @Override // h.c.b.a.a
                public final Object invokeSuspend(Object obj) {
                    h.c.a.a aVar = h.c.a.a.f48038a;
                    int i2 = this.label;
                    if (i2 == 0) {
                        c.b(obj);
                        af afVar = (af) this.L$0;
                        this.label = 1;
                        if (this.$this_pointerInput.awaitPointerEventScope(new C00231(afVar, this.$state, null), this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c.b(obj);
                    }
                    return ab.f48028a;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar) {
                Object objD = aj.d(new AnonymousClass1(pointerInputScope, basicTooltipState, null), eVar);
                return objD == h.c.a.a.f48038a ? objD : ab.f48028a;
            }
        }) : modifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final BasicTooltipState rememberBasicTooltipState(boolean z, boolean z2, MutatorMutex mutatorMutex, Composer composer, int i2, int i3) {
        if ((i3 & 4) != 0) {
            mutatorMutex = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1123859613, i2, -1, "androidx.compose.foundation.rememberBasicTooltipState (BasicTooltip.kt:278)");
        }
        boolean z3 = z2 | (!((i3 & 2) == 0));
        boolean z4 = ((((i2 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) > 256 && composer.changed(mutatorMutex)) || (i2 & 384) == 256) | ((((i2 & 112) ^ 48) > 32 && composer.changed(z3)) || (i2 & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z4 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new BasicTooltipStateImpl(1 == ((z ? 1 : 0) & ((i3 & 1) ^ 1)), z3, mutatorMutex);
            composer.updateRememberedValue(objRememberedValue);
        }
        BasicTooltipStateImpl basicTooltipStateImpl = (BasicTooltipStateImpl) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return basicTooltipStateImpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void BasicTooltipBox(final androidx.compose.ui.window.PopupPositionProvider r20, final h.g.a.p r21, final androidx.compose.foundation.BasicTooltipState r22, androidx.compose.ui.Modifier r23, boolean r24, boolean r25, final h.g.a.p r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltipKt.BasicTooltipBox(androidx.compose.ui.window.PopupPositionProvider, h.g.a.p, androidx.compose.foundation.BasicTooltipState, androidx.compose.ui.Modifier, boolean, boolean, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }
}
