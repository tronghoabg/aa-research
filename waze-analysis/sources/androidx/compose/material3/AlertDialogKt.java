package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.DialogProperties;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.p;
import h.g.a.q;
import h.i;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AlertDialogKt {
    private static final float ButtonsCrossAxisSpacing = 8.0f;
    private static final float ButtonsMainAxisSpacing = 8.0f;
    private static final float DialogMaxWidth = 560.0f;
    private static final float DialogMinWidth = 280.0f;
    private static final PaddingValues IconPadding = PaddingKt.m2752PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, 16.0f, 7, null);
    private static final PaddingValues TitlePadding = PaddingKt.m2752PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, 16.0f, 7, null);
    private static final ProvidableCompositionLocal<BasicAlertDialogOverride> LocalBasicAlertDialogOverride = CompositionLocalKt.compositionLocalOf$default(null, new a() { // from class: androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda15
        @Override // h.g.a.a
        public final Object invoke() {
            return DefaultBasicAlertDialogOverride.INSTANCE;
        }
    }, 1, null);

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AlertDialog(final h.g.a.a<h.ab> r18, androidx.compose.ui.Modifier r19, androidx.compose.ui.window.DialogProperties r20, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AlertDialogKt.AlertDialog(h.g.a.a, androidx.compose.ui.Modifier, androidx.compose.ui.window.DialogProperties, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab AlertDialog$lambda$0(a aVar, Modifier modifier, DialogProperties dialogProperties, p pVar, int i2, int i3, Composer composer, int i4) {
        AlertDialog(aVar, modifier, dialogProperties, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fb  */
    /* renamed from: AlertDialogContent-4hvqGtA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4327AlertDialogContent4hvqGtA(final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r29, androidx.compose.ui.Modifier r30, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r31, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r32, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r33, final androidx.compose.ui.graphics.Shape r34, final long r35, final float r37, final long r38, final long r40, final long r42, final long r44, androidx.compose.runtime.Composer r46, final int r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AlertDialogKt.m4327AlertDialogContent4hvqGtA(h.g.a.p, androidx.compose.ui.Modifier, h.g.a.p, h.g.a.p, h.g.a.p, androidx.compose.ui.graphics.Shape, long, float, long, long, long, long, androidx.compose.runtime.Composer, int, int, int):void");
    }

    static final ab AlertDialogContent_4hvqGtA$lambda$0(final p pVar, final p pVar2, final p pVar3, long j2, long j3, long j4, long j5, p pVar4, Composer composer, int i2) {
        TextStyle value;
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-652798794, i2, -1, "androidx.compose.material3.AlertDialogContent.<anonymous> (AlertDialog.kt:338)");
            }
            Modifier modifierPadding = PaddingKt.padding(Modifier.Companion, AlertDialogDefaults.INSTANCE.getDialogPadding$material3());
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int iM = AlertDialogKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierPadding);
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
            Updater.m7351setimpl(composer, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            final ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (pVar == null) {
                composer.startReplaceGroup(346092326);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(346092327);
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(j2)), ComposableLambdaKt.rememberComposableLambda(-1128150638, true, new p() { // from class: androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda9
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return AlertDialogKt.AlertDialogContent_4hvqGtA$lambda$0$0$0$0(columnScopeInstance, pVar, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer, 54), composer, ProvidedValue.$stable | 48);
                composer.endReplaceGroup();
            }
            if (pVar2 == null) {
                composer.startReplaceGroup(346408309);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(346408310);
                if (PrecisionPointer.getShouldUsePrecisionPointerComponentSizing().getValue().booleanValue()) {
                    composer.startReplaceGroup(1812109189);
                    value = TextStyle.m10559copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer, 6).getHeadlineSmall(), 0L, TextUnitKt.getSp(20), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(26), null, null, null, 0, 0, null, 16646141, null);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(1812321322);
                    value = TypographyKt.getValue(DialogTokens.INSTANCE.getHeadlineFont(), composer, 6);
                    composer.endReplaceGroup();
                }
                ProvideContentColorTextStyleKt.m6286ProvideContentColorTextStyle3JVO9M(j3, value, ComposableLambdaKt.rememberComposableLambda(71284337, true, new p() { // from class: androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda10
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return AlertDialogKt.AlertDialogContent_4hvqGtA$lambda$0$0$1$0(columnScopeInstance, pVar, pVar2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer, 54), composer, 384);
                composer.endReplaceGroup();
            }
            if (pVar3 == null) {
                composer.startReplaceGroup(347551589);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(347551590);
                ProvideContentColorTextStyleKt.m6286ProvideContentColorTextStyle3JVO9M(j4, TypographyKt.getValue(DialogTokens.INSTANCE.getSupportingTextFont(), composer, 6), ComposableLambdaKt.rememberComposableLambda(705583346, true, new p() { // from class: androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda11
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return AlertDialogKt.AlertDialogContent_4hvqGtA$lambda$0$0$2$0(columnScopeInstance, pVar3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer, 54), composer, 384);
                composer.endReplaceGroup();
            }
            Modifier modifierAlign = columnScopeInstance.align(Modifier.Companion, Alignment.Companion.getEnd());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM2 = AlertDialogKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierAlign);
            a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ProvideContentColorTextStyleKt.m6286ProvideContentColorTextStyle3JVO9M(j5, TypographyKt.getValue(DialogTokens.INSTANCE.getActionLabelTextFont(), composer, 6), pVar4, composer, 0);
            composer.endNode();
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
    public static final ab AlertDialogContent_4hvqGtA$lambda$0$0$0$0(ColumnScope columnScope, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1128150638, i2, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:341)");
            }
            Modifier modifierAlign = columnScope.align(PaddingKt.padding(Modifier.Companion, IconPadding), Alignment.Companion.getCenterHorizontally());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM = AlertDialogKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierAlign);
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
    public static final ab AlertDialogContent_4hvqGtA$lambda$0$0$1$0(ColumnScope columnScope, p pVar, p pVar2, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(71284337, i2, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:360)");
            }
            Modifier modifierAlign = columnScope.align(PaddingKt.padding(Modifier.Companion, TitlePadding), pVar == null ? Alignment.Companion.getStart() : Alignment.Companion.getCenterHorizontally());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM = AlertDialogKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierAlign);
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
            pVar2.invoke(composer, 0);
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
    public static final ab AlertDialogContent_4hvqGtA$lambda$0$0$2$0(ColumnScope columnScope, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(705583346, i2, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:381)");
            }
            Modifier modifierAlign = columnScope.align(PaddingKt.padding(columnScope.weight(Modifier.Companion, 1.0f, false), AlertDialogDefaults.INSTANCE.getTextPadding$material3()), Alignment.Companion.getStart());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM = AlertDialogKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierAlign);
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

    static final ab AlertDialogContent_4hvqGtA$lambda$1(p pVar, Modifier modifier, p pVar2, p pVar3, p pVar4, Shape shape, long j2, float f2, long j3, long j4, long j5, long j6, int i2, int i3, int i4, Composer composer, int i5) {
        m4327AlertDialogContent4hvqGtA(pVar, modifier, pVar2, pVar3, pVar4, shape, j2, f2, j3, j4, j5, j6, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* renamed from: AlertDialogFlowRow-ixp7dh8, reason: not valid java name */
    public static final void m4328AlertDialogFlowRowixp7dh8(final float f2, final float f3, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-917637668);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(f2) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(f3) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-917637668, i3, -1, "androidx.compose.material3.AlertDialogFlowRow (AlertDialog.kt:410)");
            }
            final LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalLayoutDirection().provides(flip(layoutDirection)), ComposableLambdaKt.rememberComposableLambda(-1986402020, true, new p() { // from class: androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda13
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return AlertDialogKt.AlertDialogFlowRow_ixp7dh8$lambda$0(f2, f3, layoutDirection, pVar, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda14
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return AlertDialogKt.AlertDialogFlowRow_ixp7dh8$lambda$1(f2, f3, pVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab AlertDialogFlowRow_ixp7dh8$lambda$0(float f2, float f3, final LayoutDirection layoutDirection, final p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1986402020, i2, -1, "androidx.compose.material3.AlertDialogFlowRow.<anonymous> (AlertDialog.kt:415)");
            }
            FlowLayoutKt.FlowRow(null, Arrangement.INSTANCE.m2440spacedBy0680j_4(f2), Arrangement.INSTANCE.m2440spacedBy0680j_4(f3), null, 0, 0, ComposableLambdaKt.rememberComposableLambda(879927511, true, new q() { // from class: androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda5
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AlertDialogKt.AlertDialogFlowRow_ixp7dh8$lambda$0$0(layoutDirection, pVar, (FlowRowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 1572864, 57);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab AlertDialogFlowRow_ixp7dh8$lambda$0$0(LayoutDirection layoutDirection, p pVar, FlowRowScope flowRowScope, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(879927511, i2, -1, "androidx.compose.material3.AlertDialogFlowRow.<anonymous>.<anonymous> (AlertDialog.kt:419)");
            }
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalLayoutDirection().provides(layoutDirection), (p<? super Composer, ? super Integer, ab>) pVar, composer, ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab AlertDialogFlowRow_ixp7dh8$lambda$1(float f2, float f3, p pVar, int i2, Composer composer, int i3) {
        m4328AlertDialogFlowRowixp7dh8(f2, f3, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* renamed from: AlertDialogImpl-wrnwzgE, reason: not valid java name */
    public static final void m4329AlertDialogImplwrnwzgE(final a<ab> aVar, final p<? super Composer, ? super Integer, ab> pVar, final Modifier modifier, final p<? super Composer, ? super Integer, ab> pVar2, final p<? super Composer, ? super Integer, ab> pVar3, final p<? super Composer, ? super Integer, ab> pVar4, final p<? super Composer, ? super Integer, ab> pVar5, final Shape shape, final long j2, final long j3, final long j4, final long j5, final float f2, final DialogProperties dialogProperties, Composer composer, final int i2, final int i3) {
        int i4;
        p<? super Composer, ? super Integer, ab> pVar6;
        p<? super Composer, ? super Integer, ab> pVar7;
        p<? super Composer, ? super Integer, ab> pVar8;
        Shape shape2;
        int i5;
        float f3;
        DialogProperties dialogProperties2;
        int i6 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-867616355);
        if (i6 == 0) {
            i4 = (true != composerStartRestartGroup.changedInstance(aVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            pVar6 = pVar;
            i4 |= true != composerStartRestartGroup.changedInstance(pVar6) ? 16 : 32;
        } else {
            pVar6 = pVar;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changed(modifier) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar3) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            pVar7 = pVar4;
            i4 |= true != composerStartRestartGroup.changedInstance(pVar7) ? 65536 : 131072;
        } else {
            pVar7 = pVar4;
        }
        if ((1572864 & i2) == 0) {
            pVar8 = pVar5;
            i4 |= true != composerStartRestartGroup.changedInstance(pVar8) ? 524288 : 1048576;
        } else {
            pVar8 = pVar5;
        }
        if ((12582912 & i2) == 0) {
            shape2 = shape;
            i4 |= true != composerStartRestartGroup.changed(shape2) ? 4194304 : 8388608;
        } else {
            shape2 = shape;
        }
        if ((100663296 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changed(j2) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if ((805306368 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changed(j3) ? 268435456 : 536870912;
        }
        if ((i3 & 6) == 0) {
            i5 = (true != composerStartRestartGroup.changed(j4) ? 2 : 4) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true != composerStartRestartGroup.changed(j5) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            f3 = f2;
            i5 |= true != composerStartRestartGroup.changed(f3) ? 128 : 256;
        } else {
            f3 = f2;
        }
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            dialogProperties2 = dialogProperties;
            i5 |= true == composerStartRestartGroup.changed(dialogProperties2) ? 2048 : 1024;
        } else {
            dialogProperties2 = dialogProperties;
        }
        if (composerStartRestartGroup.shouldExecute(((306783379 & i4) == 306783378 && (i5 & DisplayStrings.DS_DONT_SHOW_AGAIN) == 1170) ? false : true, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-867616355, i4, i5, "androidx.compose.material3.AlertDialogImpl (AlertDialog.kt:276)");
            }
            final p<? super Composer, ? super Integer, ab> pVar9 = pVar6;
            final Shape shape3 = shape2;
            final float f4 = f3;
            final p<? super Composer, ? super Integer, ab> pVar10 = pVar7;
            final p<? super Composer, ? super Integer, ab> pVar11 = pVar8;
            BasicAlertDialog(aVar, modifier, dialogProperties2, ComposableLambdaKt.rememberComposableLambda(527420759, true, new p() { // from class: androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda7
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return AlertDialogKt.AlertDialogImpl_wrnwzgE$lambda$0(pVar3, pVar10, pVar11, shape3, j2, f4, j3, j4, j5, pVar9, pVar2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i4 & 14) | DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS | ((i4 >> 3) & 112) | ((i5 >> 3) & DisplayStrings.DS_TAP_TO_VERIFY), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda8
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return AlertDialogKt.AlertDialogImpl_wrnwzgE$lambda$1(aVar, pVar, modifier, pVar2, pVar3, pVar4, pVar5, shape, j2, j3, j4, j5, f2, dialogProperties, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab AlertDialogImpl_wrnwzgE$lambda$0(p pVar, p pVar2, p pVar3, Shape shape, long j2, float f2, long j3, long j4, long j5, final p pVar4, final p pVar5, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(527420759, i2, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous> (AlertDialog.kt:282)");
            }
            m4327AlertDialogContent4hvqGtA(ComposableLambdaKt.rememberComposableLambda(1367541877, true, new p() { // from class: androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda4
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return AlertDialogKt.AlertDialogImpl_wrnwzgE$lambda$0$0(pVar4, pVar5, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), null, pVar, pVar2, pVar3, shape, j2, f2, ColorSchemeKt.getValue(DialogTokens.INSTANCE.getActionLabelTextColor(), composer, 6), j3, j4, j5, composer, 6, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab AlertDialogImpl_wrnwzgE$lambda$0$0(final p pVar, final p pVar2, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1367541877, i2, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous>.<anonymous> (AlertDialog.kt:284)");
            }
            float fM11178unboximpl = ((Dp) composer.consume(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize())).m11178unboximpl();
            if (true == Float.isNaN(fM11178unboximpl)) {
                fM11178unboximpl = 0.0f;
            }
            float fM4445getMinHeightD9Ej5fM = fM11178unboximpl - ButtonDefaults.INSTANCE.m4445getMinHeightD9Ej5fM();
            float f2 = ButtonsMainAxisSpacing;
            float f3 = ButtonsCrossAxisSpacing;
            m4328AlertDialogFlowRowixp7dh8(f2, ((Dp) n.r(Dp.m11162boximpl(f3 - fM4445getMinHeightD9Ej5fM), Dp.m11162boximpl(0.0f), Dp.m11162boximpl(f3))).m11178unboximpl(), ComposableLambdaKt.rememberComposableLambda(-459506658, true, new p() { // from class: androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda6
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return AlertDialogKt.AlertDialogImpl_wrnwzgE$lambda$0$0$1(pVar, pVar2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, DisplayStrings.DS_DICTATION_BOTTOM_SHEET_SPEECH_TIMEOUT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab AlertDialogImpl_wrnwzgE$lambda$0$0$1(p pVar, p pVar2, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-459506658, i2, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:295)");
            }
            pVar.invoke(composer, 0);
            if (pVar2 == null) {
                composer.startReplaceGroup(-1102003461);
            } else {
                composer.startReplaceGroup(795735494);
                pVar2.invoke(composer, 0);
            }
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab AlertDialogImpl_wrnwzgE$lambda$1(a aVar, p pVar, Modifier modifier, p pVar2, p pVar3, p pVar4, p pVar5, Shape shape, long j2, long j3, long j4, long j5, float f2, DialogProperties dialogProperties, int i2, int i3, Composer composer, int i4) {
        m4329AlertDialogImplwrnwzgE(aVar, pVar, modifier, pVar2, pVar3, pVar4, pVar5, shape, j2, j3, j4, j5, f2, dialogProperties, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicAlertDialog(final h.g.a.a<h.ab> r20, androidx.compose.ui.Modifier r21, androidx.compose.ui.window.DialogProperties r22, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AlertDialogKt.BasicAlertDialog(h.g.a.a, androidx.compose.ui.Modifier, androidx.compose.ui.window.DialogProperties, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab BasicAlertDialog$lambda$1(a aVar, Modifier modifier, DialogProperties dialogProperties, p pVar, int i2, int i3, Composer composer, int i4) {
        BasicAlertDialog(aVar, modifier, dialogProperties, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    private static final LayoutDirection flip(LayoutDirection layoutDirection) {
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        int iOrdinal = layoutDirection.ordinal();
        if (iOrdinal == 0) {
            return LayoutDirection.Rtl;
        }
        if (iOrdinal == 1) {
            return LayoutDirection.Ltr;
        }
        throw new i();
    }

    public static final float getDialogMaxWidth() {
        return DialogMaxWidth;
    }

    public static final float getDialogMinWidth() {
        return DialogMinWidth;
    }

    public static final ProvidableCompositionLocal<BasicAlertDialogOverride> getLocalBasicAlertDialogOverride() {
        return LocalBasicAlertDialogOverride;
    }

    public static /* synthetic */ void getLocalBasicAlertDialogOverride$annotations() {
    }
}
