package androidx.compose.ui.layout;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import h.ab;
import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SubcomposeLayoutKt {
    private static final boolean ExtraLoggingEnabled = false;
    private static final SubcomposeLayoutKt$ReusedSlotId$1 ReusedSlotId = new Object() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$ReusedSlotId$1
        public String toString() {
            return "ReusedSlotId";
        }
    };
    private static final Object UnspecifiedSlotId = new Object();

    public static final void SubcomposeLayout(SubcomposeLayoutState subcomposeLayoutState, Modifier modifier, p<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> pVar, Composer composer, int i2, int i3) {
        int i4;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-511989831);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changedInstance(subcomposeLayoutState) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            if (i6 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-511989831, i4, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:128)");
            }
            int iM = SubcomposeLayoutKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionContext compositionContextRememberCompositionContext = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            h.g.a.a<LayoutNode> constructor$ui = LayoutNode.Companion.getConstructor$ui();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor$ui);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, subcomposeLayoutState, subcomposeLayoutState.getSetRoot$ui());
            Updater.m7351setimpl(composerStartRestartGroup, compositionContextRememberCompositionContext, subcomposeLayoutState.getSetCompositionContext$ui());
            Updater.m7351setimpl(composerStartRestartGroup, pVar, subcomposeLayoutState.getSetMeasurePolicy$ui());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            composerStartRestartGroup.endNode();
            if (composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startReplaceGroup(-1259187287);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1259245908);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(subcomposeLayoutState);
                SubcomposeLayoutKt$SubcomposeLayout$4$1 subcomposeLayoutKt$SubcomposeLayout$4$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || subcomposeLayoutKt$SubcomposeLayout$4$1RememberedValue == Composer.Companion.getEmpty()) {
                    subcomposeLayoutKt$SubcomposeLayout$4$1RememberedValue = new SubcomposeLayoutKt$SubcomposeLayout$4$1(subcomposeLayoutState);
                    composerStartRestartGroup.updateRememberedValue(subcomposeLayoutKt$SubcomposeLayout$4$1RememberedValue);
                }
                EffectsKt.SideEffect((h.g.a.a) subcomposeLayoutKt$SubcomposeLayout$4$1RememberedValue, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new AnonymousClass5(subcomposeLayoutState, modifier2, pVar, i2, i3));
        }
    }

    public static final SubcomposeSlotReusePolicy SubcomposeSlotReusePolicy(int i2) {
        return new FixedCountSubcomposeSlotReusePolicy(i2);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$2, reason: invalid class name */
    final class AnonymousClass2 extends y implements p<Composer, Integer, ab> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ p<SubcomposeMeasureScope, Constraints, MeasureResult> $measurePolicy;
        final /* synthetic */ Modifier $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Modifier modifier, p<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> pVar, int i2, int i3) {
            super(2);
            this.$modifier = modifier;
            this.$measurePolicy = pVar;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(Composer composer, int i2) {
            SubcomposeLayoutKt.SubcomposeLayout(this.$modifier, this.$measurePolicy, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$5, reason: invalid class name */
    final class AnonymousClass5 extends y implements p<Composer, Integer, ab> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ p<SubcomposeMeasureScope, Constraints, MeasureResult> $measurePolicy;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ SubcomposeLayoutState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass5(SubcomposeLayoutState subcomposeLayoutState, Modifier modifier, p<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> pVar, int i2, int i3) {
            super(2);
            this.$state = subcomposeLayoutState;
            this.$modifier = modifier;
            this.$measurePolicy = pVar;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(Composer composer, int i2) {
            SubcomposeLayoutKt.SubcomposeLayout(this.$state, this.$modifier, this.$measurePolicy, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return ab.f48028a;
        }
    }

    public static final void SubcomposeLayout(Modifier modifier, p<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> pVar, Composer composer, int i2, int i3) {
        int i4;
        p<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> pVar2;
        int i5 = i3 & 1;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1298353104);
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            if (i5 != 0) {
                modifier = Modifier.Companion;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1298353104, i4, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:95)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new SubcomposeLayoutState();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            pVar2 = pVar;
            SubcomposeLayout((SubcomposeLayoutState) objRememberedValue, modifier2, pVar2, composerStartRestartGroup, (i4 << 3) & 1008, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            pVar2 = pVar;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new AnonymousClass2(modifier, pVar2, i2, i3));
        }
    }
}
