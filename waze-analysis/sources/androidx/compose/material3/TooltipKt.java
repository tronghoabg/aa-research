package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.BasicTooltipDefaults;
import androidx.compose.material3.tokens.PlainTooltipTokens;
import androidx.compose.material3.tokens.RichTooltipTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TooltipKt {
    private static final float PlainTooltipHorizontalPadding = 8.0f;
    private static final float PlainTooltipVerticalPadding = 4.0f;
    private static final float SpacingBetweenTooltipAndAnchor = 4.0f;
    private static final float TooltipMinHeight = 24.0f;
    private static final float TooltipMinWidth = 40.0f;
    private static final PaddingValues PlainTooltipContentPadding = PaddingKt.m2749PaddingValuesYgX7TsA(8.0f, 4.0f);
    private static final float RichTooltipHorizontalPadding = 16.0f;
    private static final float HeightToSubheadFirstLine = 28.0f;
    private static final float HeightFromSubheadToTextFirstLine = 24.0f;
    private static final float TextBottomPadding = 16.0f;
    private static final float ActionLabelMinHeight = 36.0f;
    private static final float ActionLabelBottomPadding = 8.0f;

    /* JADX WARN: Removed duplicated region for block: B:104:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011e  */
    /* renamed from: PlainTooltip-gv3ox5I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m6052PlainTooltipgv3ox5I(final androidx.compose.material3.TooltipScope r28, androidx.compose.ui.Modifier r29, androidx.compose.ui.graphics.Shape r30, float r31, androidx.compose.ui.graphics.Shape r32, long r33, long r35, float r37, float r38, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TooltipKt.m6052PlainTooltipgv3ox5I(androidx.compose.material3.TooltipScope, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, float, androidx.compose.ui.graphics.Shape, long, long, float, float, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010b  */
    /* renamed from: PlainTooltipInternal-kw8QeXY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m6053PlainTooltipInternalkw8QeXY(final androidx.compose.material3.TooltipScope r27, final java.lang.String r28, androidx.compose.ui.Modifier r29, androidx.compose.ui.graphics.Shape r30, float r31, androidx.compose.ui.graphics.Shape r32, long r33, long r35, float r37, float r38, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r39, androidx.compose.runtime.Composer r40, final int r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TooltipKt.m6053PlainTooltipInternalkw8QeXY(androidx.compose.material3.TooltipScope, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, float, androidx.compose.ui.graphics.Shape, long, long, float, float, h.g.a.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab PlainTooltipInternal_kw8QeXY$lambda$0$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m10334setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.Companion.m10307getAssertive0phEisY());
        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        return ab.f48028a;
    }

    static final ab PlainTooltipInternal_kw8QeXY$lambda$1(TooltipScope tooltipScope, String str, Modifier modifier, Shape shape, float f2, Shape shape2, long j2, long j3, float f3, float f4, p pVar, int i2, int i3, int i4, Composer composer, int i5) {
        m6053PlainTooltipInternalkw8QeXY(tooltipScope, str, modifier, shape, f2, shape2, j2, j3, f3, f4, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab PlainTooltip_gv3ox5I$lambda$3(float f2, long j2, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1573998995, i2, -1, "androidx.compose.material3.PlainTooltip.<anonymous> (Tooltip.kt:361)");
            }
            Modifier modifierPadding = PaddingKt.padding(SizeKt.m2826sizeInqDBjuR0$default(Modifier.Companion, TooltipMinWidth, TooltipMinHeight, f2, 0.0f, 8, null), PlainTooltipContentPadding);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM = TooltipKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
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
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(j2)), TextKt.getLocalTextStyle().provides(TypographyKt.getValue(PlainTooltipTokens.INSTANCE.getSupportingTextFont(), composer, 6))}, (p<? super Composer, ? super Integer, ab>) pVar, composer, ProvidedValue.$stable);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab PlainTooltip_gv3ox5I$lambda$4(TooltipScope tooltipScope, Modifier modifier, Shape shape, float f2, Shape shape2, long j2, long j3, float f3, float f4, p pVar, int i2, int i3, Composer composer, int i4) {
        m6052PlainTooltipgv3ox5I(tooltipScope, modifier, shape, f2, shape2, j2, j3, f3, f4, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0106  */
    /* renamed from: RichTooltip-EkvW5A0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m6054RichTooltipEkvW5A0(final androidx.compose.material3.TooltipScope r36, androidx.compose.ui.Modifier r37, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r38, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r39, androidx.compose.ui.graphics.Shape r40, float r41, androidx.compose.ui.graphics.Shape r42, androidx.compose.material3.RichTooltipColors r43, float r44, float r45, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r46, androidx.compose.runtime.Composer r47, final int r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 937
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TooltipKt.m6054RichTooltipEkvW5A0(androidx.compose.material3.TooltipScope, androidx.compose.ui.Modifier, h.g.a.p, h.g.a.p, androidx.compose.ui.graphics.Shape, float, androidx.compose.ui.graphics.Shape, androidx.compose.material3.RichTooltipColors, float, float, h.g.a.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    static final ab RichTooltip_EkvW5A0$lambda$3(p pVar, p pVar2, RichTooltipColors richTooltipColors, p pVar3, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1249811482, i2, -1, "androidx.compose.material3.RichTooltip.<anonymous> (Tooltip.kt:449)");
            }
            TextStyle value = TypographyKt.getValue(RichTooltipTokens.INSTANCE.getActionLabelTextFont(), composer, 6);
            TextStyle value2 = TypographyKt.getValue(RichTooltipTokens.INSTANCE.getSubheadFont(), composer, 6);
            TextStyle value3 = TypographyKt.getValue(RichTooltipTokens.INSTANCE.getSupportingTextFont(), composer, 6);
            Modifier modifierM2757paddingVpY3zN4$default = PaddingKt.m2757paddingVpY3zN4$default(Modifier.Companion, RichTooltipHorizontalPadding, 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int iM = TooltipKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM2757paddingVpY3zN4$default);
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
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (pVar == null) {
                composer.startReplaceGroup(112051624);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(112051625);
                Modifier modifierM2415paddingFromBaselineVpY3zN4$default = AlignmentLineKt.m2415paddingFromBaselineVpY3zN4$default(Modifier.Companion, HeightToSubheadFirstLine, 0.0f, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int iM2 = TooltipKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM2415paddingFromBaselineVpY3zN4$default);
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
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(richTooltipColors.m5407getTitleContentColor0d7_KjU())), TextKt.getLocalTextStyle().provides(value2)}, (p<? super Composer, ? super Integer, ab>) pVar, composer, ProvidedValue.$stable);
                composer.endNode();
                composer.endReplaceGroup();
            }
            Modifier modifierTextVerticalPadding = textVerticalPadding(Modifier.Companion, pVar != null, pVar2 != null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM3 = TooltipKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierTextVerticalPadding);
            a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM3), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(richTooltipColors.m5406getContentColor0d7_KjU())), TextKt.getLocalTextStyle().provides(value3)}, (p<? super Composer, ? super Integer, ab>) pVar3, composer, ProvidedValue.$stable);
            composer.endNode();
            if (pVar2 == null) {
                composer.startReplaceGroup(112784836);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(112784837);
                Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(SizeKt.m2813requiredHeightInVpY3zN4$default(Modifier.Companion, ActionLabelMinHeight, 0.0f, 2, null), 0.0f, 0.0f, 0.0f, ActionLabelBottomPadding, 7, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int iM4 = TooltipKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierM2759paddingqDBjuR0$default);
                a<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor4);
                } else {
                    composer.useNode();
                }
                Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composer, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Updater.m7351setimpl(composer, Integer.valueOf(iM4), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composer, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(richTooltipColors.m5404getActionContentColor0d7_KjU())), TextKt.getLocalTextStyle().provides(value)}, (p<? super Composer, ? super Integer, ab>) pVar2, composer, ProvidedValue.$stable);
                composer.endNode();
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab RichTooltip_EkvW5A0$lambda$4(TooltipScope tooltipScope, Modifier modifier, p pVar, p pVar2, Shape shape, float f2, Shape shape2, RichTooltipColors richTooltipColors, float f3, float f4, p pVar3, int i2, int i3, int i4, Composer composer, int i5) {
        m6054RichTooltipEkvW5A0(tooltipScope, modifier, pVar, pVar2, shape, f2, shape2, richTooltipColors, f3, f4, pVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TooltipBox(final androidx.compose.ui.window.PopupPositionProvider r30, final h.g.a.q<? super androidx.compose.material3.TooltipScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r31, final androidx.compose.material3.TooltipState r32, androidx.compose.ui.Modifier r33, h.g.a.a<h.ab> r34, boolean r35, boolean r36, boolean r37, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 1207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TooltipKt.TooltipBox(androidx.compose.ui.window.PopupPositionProvider, h.g.a.q, androidx.compose.material3.TooltipState, androidx.compose.ui.Modifier, h.g.a.a, boolean, boolean, boolean, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutCoordinates TooltipBox$lambda$1$0(MutableState mutableState) {
        return (LayoutCoordinates) mutableState.getValue();
    }

    private static final float TooltipBox$lambda$11(State<Float> state) {
        return state.getValue().floatValue();
    }

    static final ab TooltipBox$lambda$12(final MutableState mutableState, final State state, final State state2, State state3, q qVar, TooltipScopeImpl tooltipScopeImpl, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-527401546, i2, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:235)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda17
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return TooltipKt.TooltipBox$lambda$12$0$0(mutableState, (LayoutCoordinates) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion, (l) objRememberedValue);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM = TooltipKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierOnGloballyPositioned);
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
            composer.startMovableGroup(-1350495383, Integer.valueOf(TooltipBox$lambda$5(state3)));
            Modifier.Companion companion2 = Modifier.Companion;
            boolean zChanged = composer.changed(state) | composer.changed(state2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new l() { // from class: androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda18
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return TooltipKt.TooltipBox$lambda$12$1$0$0(state, state2, (GraphicsLayerScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion2, (l) objRememberedValue2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM2 = TooltipKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierGraphicsLayer);
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
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            qVar.invoke(tooltipScopeImpl, composer, 6);
            composer.endNode();
            composer.endMovableGroup();
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
    public static final ab TooltipBox$lambda$12$0$0(MutableState mutableState, LayoutCoordinates layoutCoordinates) {
        mutableState.setValue(Offset.m7969boximpl(LayoutCoordinatesKt.positionOnScreen(layoutCoordinates)));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab TooltipBox$lambda$12$1$0$0(State state, State state2, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setScaleX(TooltipBox$lambda$8(state));
        graphicsLayerScope.setScaleY(TooltipBox$lambda$8(state));
        graphicsLayerScope.setAlpha(TooltipBox$lambda$11(state2));
        return ab.f48028a;
    }

    static final ab TooltipBox$lambda$13(PopupPositionProvider popupPositionProvider, q qVar, TooltipState tooltipState, Modifier modifier, a aVar, boolean z, boolean z2, boolean z3, p pVar, int i2, int i3, Composer composer, int i4) {
        TooltipBox(popupPositionProvider, qVar, tooltipState, modifier, aVar, z, z2, z3, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab TooltipBox$lambda$2(final MutableState mutableState, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-23901870, i2, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:181)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda5
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return TooltipKt.TooltipBox$lambda$2$0$0(mutableState, (LayoutCoordinates) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion, (l) objRememberedValue);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM = TooltipKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierOnGloballyPositioned);
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
    public static final ab TooltipBox$lambda$2$0$0(MutableState mutableState, LayoutCoordinates layoutCoordinates) {
        mutableState.setValue(layoutCoordinates);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int TooltipBox$lambda$4$0(MutableState mutableState, MutableState mutableState2) {
        if (mutableState.getValue() == null || mutableState2.getValue() == null) {
            return 0;
        }
        Object value = mutableState.getValue();
        x.c(value);
        long jPositionOnScreen = LayoutCoordinatesKt.positionOnScreen((LayoutCoordinates) value);
        long j2 = jPositionOnScreen & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        Object value2 = mutableState2.getValue();
        x.c(value2);
        long jM7990unboximpl = ((Offset) value2).m7990unboximpl();
        long j3 = MuxerUtil.UNSIGNED_INT_MAX_VALUE & jM7990unboximpl;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM7990unboximpl >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jPositionOnScreen >> 32));
        int i2 = (int) j3;
        int i3 = (int) j2;
        return fIntBitsToFloat <= fIntBitsToFloat2 ? Float.intBitsToFloat(i2) >= Float.intBitsToFloat(i3) ? 3 : 1 : Float.intBitsToFloat(i2) >= Float.intBitsToFloat(i3) ? 4 : 2;
    }

    private static final int TooltipBox$lambda$5(State<Integer> state) {
        return state.getValue().intValue();
    }

    static final FiniteAnimationSpec TooltipBox$lambda$6(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i2) {
        composer.startReplaceGroup(-1664496585);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1664496585, i2, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:217)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    private static final float TooltipBox$lambda$8(State<Float> state) {
        return state.getValue().floatValue();
    }

    static final FiniteAnimationSpec TooltipBox$lambda$9(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i2) {
        composer.startReplaceGroup(-111222965);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-111222965, i2, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:226)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    public static final TooltipState TooltipState(boolean z, boolean z2, MutatorMutex mutatorMutex) {
        return new TooltipStateImpl(z, z2, mutatorMutex);
    }

    public static /* synthetic */ TooltipState TooltipState$default(boolean z, boolean z2, MutatorMutex mutatorMutex, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            mutatorMutex = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        return TooltipState(1 == ((z ? 1 : 0) & ((i2 & 1) ^ 1)), z2 | (!((i2 & 2) == 0)), mutatorMutex);
    }

    public static final float caretX(float f2, int i2, Rect rect) {
        float fMin;
        float left = rect.getLeft();
        float right = rect.getRight();
        float f3 = i2;
        float f4 = (left + right) / 2.0f;
        if (f2 >= f3) {
            return f4;
        }
        float f5 = f2 / 2.0f;
        if (f4 - f5 < 0.0f) {
            fMin = Math.max(f2 - f3, -left);
        } else {
            if (f4 + f5 <= f3) {
                return f5;
            }
            fMin = Math.min(f2 - right, 0.0f);
        }
        return f4 + fMin;
    }

    public static final float getActionLabelBottomPadding() {
        return ActionLabelBottomPadding;
    }

    public static final float getActionLabelMinHeight() {
        return ActionLabelMinHeight;
    }

    public static final float getHeightToSubheadFirstLine() {
        return HeightToSubheadFirstLine;
    }

    public static final PaddingValues getPlainTooltipContentPadding() {
        return PlainTooltipContentPadding;
    }

    public static final float getRichTooltipHorizontalPadding() {
        return RichTooltipHorizontalPadding;
    }

    public static final float getSpacingBetweenTooltipAndAnchor() {
        return SpacingBetweenTooltipAndAnchor;
    }

    public static final float getTooltipMinHeight() {
        return TooltipMinHeight;
    }

    public static final float getTooltipMinWidth() {
        return TooltipMinWidth;
    }

    /* renamed from: layoutCaret-J5j9r9c, reason: not valid java name */
    private static final Modifier m6055layoutCaretJ5j9r9c(Modifier modifier, final MutableState<Matrix> mutableState, final Density density, final long j2, final l<? super MeasureScope, ? extends LayoutCoordinates> lVar, final PopupPositionProvider popupPositionProvider) {
        return LayoutModifierKt.layout(modifier, new q() { // from class: androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda4
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return TooltipKt.layoutCaret_J5j9r9c$lambda$0(j2, lVar, density, popupPositionProvider, mutableState, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1 A[PHI: r0 r33
  0x00d1: PHI (r0v6 int) = (r0v4 int), (r0v13 int), (r0v14 int), (r0v17 int) binds: [B:31:0x00cf, B:27:0x00bd, B:24:0x00b5, B:19:0x009a] A[DONT_GENERATE, DONT_INLINE]
  0x00d1: PHI (r33v5 int) = (r33v3 int), (r33v7 int), (r33v7 int), (r33v8 int) binds: [B:31:0x00cf, B:27:0x00bd, B:24:0x00b5, B:19:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final androidx.compose.ui.layout.MeasureResult layoutCaret_J5j9r9c$lambda$0(long r25, h.g.a.l r27, androidx.compose.ui.unit.Density r28, androidx.compose.ui.window.PopupPositionProvider r29, androidx.compose.runtime.MutableState r30, androidx.compose.ui.layout.MeasureScope r31, androidx.compose.ui.layout.Measurable r32, androidx.compose.ui.unit.Constraints r33) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TooltipKt.layoutCaret_J5j9r9c$lambda$0(long, h.g.a.l, androidx.compose.ui.unit.Density, androidx.compose.ui.window.PopupPositionProvider, androidx.compose.runtime.MutableState, androidx.compose.ui.layout.MeasureScope, androidx.compose.ui.layout.Measurable, androidx.compose.ui.unit.Constraints):androidx.compose.ui.layout.MeasureResult");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab layoutCaret_J5j9r9c$lambda$0$1(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final TooltipState rememberTooltipState(boolean z, boolean z2, MutatorMutex mutatorMutex, Composer composer, int i2, int i3) {
        if ((i3 & 4) != 0) {
            mutatorMutex = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1413230530, i2, -1, "androidx.compose.material3.rememberTooltipState (Tooltip.kt:829)");
        }
        boolean z3 = z2 & ((i3 & 2) == 0);
        boolean z4 = ((((i2 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) > 256 && composer.changed(mutatorMutex)) || (i2 & 384) == 256) | ((((i2 & 112) ^ 48) > 32 && composer.changed(z3)) || (i2 & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z4 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new TooltipStateImpl(1 == ((z ? 1 : 0) & ((i3 & 1) ^ 1)), z3, mutatorMutex);
            composer.updateRememberedValue(objRememberedValue);
        }
        TooltipStateImpl tooltipStateImpl = (TooltipStateImpl) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return tooltipStateImpl;
    }

    public static final Modifier textVerticalPadding(Modifier modifier, boolean z, boolean z2) {
        return (z || z2) ? PaddingKt.m2759paddingqDBjuR0$default(AlignmentLineKt.m2415paddingFromBaselineVpY3zN4$default(modifier, HeightFromSubheadToTextFirstLine, 0.0f, 2, null), 0.0f, 0.0f, 0.0f, TextBottomPadding, 7, null) : PaddingKt.m2757paddingVpY3zN4$default(modifier, 0.0f, PlainTooltipVerticalPadding, 1, null);
    }
}
