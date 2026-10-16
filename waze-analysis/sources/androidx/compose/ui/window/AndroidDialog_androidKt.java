package androidx.compose.ui.window;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.y;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AndroidDialog_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Dialog(h.g.a.a<h.ab> r21, androidx.compose.ui.window.DialogProperties r22, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r23, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidDialog_androidKt.Dialog(h.g.a.a, androidx.compose.ui.window.DialogProperties, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p<Composer, Integer, ab> Dialog$lambda$0(State<? extends p<? super Composer, ? super Integer, ab>> state) {
        return (p) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DialogLayout(Modifier modifier, p<? super Composer, ? super Integer, ab> pVar, Composer composer, int i2, int i3) {
        int i4;
        int i5 = i3 & 1;
        Composer composerStartRestartGroup = composer.startRestartGroup(1090521195);
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
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1090521195, i4, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:752)");
            }
            AndroidDialog_androidKt$DialogLayout$1$1 androidDialog_androidKt$DialogLayout$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (androidDialog_androidKt$DialogLayout$1$1RememberedValue == Composer.Companion.getEmpty()) {
                androidDialog_androidKt$DialogLayout$1$1RememberedValue = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                        return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i6);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                        return MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i6);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo1704measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        int iM11108getMinHeightimpl = 0;
                        int iM11109getMinWidthimpl = 0;
                        for (int i6 = 0; i6 < size; i6++) {
                            Placeable placeableMo9741measureBRTryo0 = list.get(i6).mo9741measureBRTryo0(j2);
                            iM11109getMinWidthimpl = Math.max(iM11109getMinWidthimpl, placeableMo9741measureBRTryo0.getWidth());
                            iM11108getMinHeightimpl = Math.max(iM11108getMinHeightimpl, placeableMo9741measureBRTryo0.getHeight());
                            arrayList.add(placeableMo9741measureBRTryo0);
                        }
                        ArrayList arrayList2 = arrayList;
                        if (list.isEmpty()) {
                            iM11109getMinWidthimpl = Constraints.m11109getMinWidthimpl(j2);
                            iM11108getMinHeightimpl = Constraints.m11108getMinHeightimpl(j2);
                        }
                        return MeasureScope.CC.layout$default(measureScope, iM11109getMinWidthimpl, iM11108getMinHeightimpl, null, new AnonymousClass1(arrayList2), 4, null);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                        return MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i6);
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                        return MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i6);
                    }

                    /* compiled from: WazeSource */
                    /* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1$1$1, reason: invalid class name */
                    final class AnonymousClass1 extends y implements l<Placeable.PlacementScope, ab> {
                        final /* synthetic */ List<Placeable> $placeables;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(List<? extends Placeable> list) {
                            super(1);
                            this.$placeables = list;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Placeable.PlacementScope placementScope) {
                            List<Placeable> list = this.$placeables;
                            int size = list.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                Placeable.PlacementScope.placeRelative$default(placementScope, list.get(i2), 0, 0, 0.0f, 4, null);
                            }
                        }

                        @Override // h.g.a.l
                        public /* bridge */ /* synthetic */ ab invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return ab.f48028a;
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(androidDialog_androidKt$DialogLayout$1$1RememberedValue);
            }
            int i6 = i4 >> 3;
            int i7 = i4 << 3;
            MeasurePolicy measurePolicy = (MeasurePolicy) androidDialog_androidKt$DialogLayout$1$1RememberedValue;
            int iM = AndroidDialog_androidKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            int i8 = (((((i6 & 14) | 384) | (i7 & 112)) << 6) & DisplayStrings.DS_TAP_TO_VERIFY) | 6;
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
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            pVar.invoke(composerStartRestartGroup, Integer.valueOf((i8 >> 6) & 14));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new AnonymousClass2(modifier, pVar, i2, i3));
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$2, reason: invalid class name */
    final class AnonymousClass2 extends y implements p<Composer, Integer, ab> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ p<Composer, Integer, ab> $content;
        final /* synthetic */ Modifier $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Modifier modifier, p<? super Composer, ? super Integer, ab> pVar, int i2, int i3) {
            super(2);
            this.$modifier = modifier;
            this.$content = pVar;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(Composer composer, int i2) {
            AndroidDialog_androidKt.DialogLayout(this.$modifier, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$3, reason: invalid class name */
    final class AnonymousClass3 extends y implements p<Composer, Integer, ab> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ p<Composer, Integer, ab> $content;
        final /* synthetic */ a<ab> $onDismissRequest;
        final /* synthetic */ DialogProperties $properties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(a<ab> aVar, DialogProperties dialogProperties, p<? super Composer, ? super Integer, ab> pVar, int i2, int i3) {
            super(2);
            this.$onDismissRequest = aVar;
            this.$properties = dialogProperties;
            this.$content = pVar;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(Composer composer, int i2) {
            AndroidDialog_androidKt.Dialog(this.$onDismissRequest, this.$properties, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return ab.f48028a;
        }
    }
}
