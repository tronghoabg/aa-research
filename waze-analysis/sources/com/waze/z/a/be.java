package com.waze.z.a;

import android.content.res.Configuration;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.TransitionKt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import com.waze.R;
import com.waze.fa;
import com.waze.gas.GasNativeManager;
import com.waze.strings.DisplayStrings;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class be {
    public /* synthetic */ be(byte[] bArr) {
    }

    static h.ab A(m mVar, int i2, Composer composer) {
        P(mVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void B(final java.lang.String r33, androidx.compose.ui.Modifier r34, h.g.a.p r35, h.g.a.p r36, boolean r37, java.util.List r38, java.lang.String r39, java.util.List r40, androidx.compose.ui.text.TextStyle r41, boolean r42, androidx.compose.foundation.layout.PaddingValues r43, final h.g.a.a r44, final h.g.a.a r45, androidx.compose.runtime.Composer r46, final int r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.z.a.be.B(java.lang.String, androidx.compose.ui.Modifier, h.g.a.p, h.g.a.p, boolean, java.util.List, java.lang.String, java.util.List, androidx.compose.ui.text.TextStyle, boolean, androidx.compose.foundation.layout.PaddingValues, h.g.a.a, h.g.a.a, androidx.compose.runtime.Composer, int, int, int):void");
    }

    static h.ab C(PaddingValues paddingValues, h.g.a.p pVar, List list, String str, boolean z, TextStyle textStyle, List list2, boolean z2, String str2, h.g.a.p pVar2, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1562446569, i2, -1, "com.waze.design_components_compose.components.DestinationCell.<anonymous> (DestinationCell.kt:92)");
            }
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), paddingValues);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer, 54);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierPadding);
            h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (pVar != null) {
                composer.startReplaceGroup(-316249033);
                pVar.invoke(composer, 0);
                SpacerKt.Spacer(SizeKt.m2827width3ABfNKs(Modifier.Companion, 14.0f), composer, 6);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-316141401);
                composer.endReplaceGroup();
            }
            Modifier modifierWeight$default = RowScope.CC.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m2440spacedBy0680j_4(2.0f), Alignment.Companion.getStart(), composer, 6);
            int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierWeight$default);
            h.g.a.a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            int iB3 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion);
            h.g.a.a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iB3), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            if (z2) {
                composer.startReplaceGroup(1997914501);
                O(composer, 0);
                SpacerKt.Spacer(SizeKt.m2827width3ABfNKs(Modifier.Companion, 4.0f), composer, 6);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1998014445);
                composer.endReplaceGroup();
            }
            TextKt.m4275Text4IGK_g(str2, com.waze.ui.r.a.d.d.a(RowScope.CC.weight$default(rowScopeInstance2, Modifier.Companion, 1.0f, false, 2, null), com.waze.ui.r.a.d.c.X, null), com.waze.bz.a.d(composer, 0).o(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m11069getEllipsisgIe3tQ8(), false, 2, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer).h(), composer, 0, DisplayStrings.DS_AAOS_PRIVACY_SETTINGS_DELETE_RECENT_DESTINATION_MESSAGE, 55288);
            Composer composer2 = composer;
            if (pVar2 != null) {
                composer2.startReplaceGroup(1998426559);
                Modifier modifierAlign = rowScopeInstance2.align(SizeKt.wrapContentWidth$default(Modifier.Companion, null, false, 3, null), Alignment.Companion.getTop());
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int iB4 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierAlign);
                h.g.a.a<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor4);
                } else {
                    composer2.useNode();
                }
                Updater.m7351setimpl(composer2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composer2, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Updater.m7351setimpl(composer2, Integer.valueOf(iB4), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composer2, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composer2, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                pVar2.invoke(composer2, 0);
                composer2.endNode();
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(1998563021);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (list.isEmpty()) {
                composer2.startReplaceGroup(-1910302351);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1910358089);
                com.waze.design_components.g.b.g(list, composer2, 0, 0);
                composer2.endReplaceGroup();
            }
            if (str != null) {
                composer2.startReplaceGroup(-1910236104);
                TextKt.m4275Text4IGK_g(str, com.waze.ui.r.a.d.d.a(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 64.0f, 4.0f, 3, null), com.waze.ui.r.a.d.c.Y, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m11069getEllipsisgIe3tQ8(), false, true != z ? 1 : 2, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, textStyle, composer, 48, 48, 55292);
                composer2 = composer;
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1909740879);
                composer2.endReplaceGroup();
            }
            List list3 = list2;
            if (h.a.i.aw(list3)) {
                composer2.startReplaceGroup(-1909695619);
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    P((m) it.next(), composer2, 0);
                }
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1909614895);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    public static void D(com.waze.ui.ac.i iVar, Modifier modifier, Modifier modifier2, Color color, Composer composer, int i2) {
        int i3;
        Color color2;
        Modifier modifier3;
        h.g.b.x.f(iVar, "source");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1704152960);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(iVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        int i5 = i3 | 384;
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            color2 = color;
            i5 |= true != composerStartRestartGroup.changed(color2) ? 1024 : 2048;
        } else {
            color2 = color;
        }
        int i6 = i5 | 24576;
        if (composerStartRestartGroup.shouldExecute((i6 & 9363) != 9362, i6 & 1)) {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1704152960, i6, -1, "com.waze.design_components_compose.components.ImageDataIcon (DestinationCell.kt:244)");
            }
            e(iVar, modifier, s.g(s.f46181a, null, ColorFilter.Companion.m8269tintxETnrds$default(ColorFilter.Companion, color2.m8238unboximpl(), 0, 2, null), null, 47), null, ComposableLambdaKt.rememberComposableLambda(1890800873, true, new com.waze.v.a(iVar, companion, 3, null), composerStartRestartGroup, 54), composerStartRestartGroup, (i6 & 14) | 24576 | (i6 & 112), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.closure.d.b(iVar, modifier, modifier3, color2, i2, 4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void E(java.lang.String r15, com.waze.design_components.b.d r16, androidx.compose.ui.Modifier r17, java.lang.String r18, h.g.a.a r19, h.g.a.a r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.z.a.be.E(java.lang.String, com.waze.design_components.b.d, androidx.compose.ui.Modifier, java.lang.String, h.g.a.a, h.g.a.a, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void F(h.g.a.a r18, androidx.compose.ui.Modifier r19, h.g.a.a r20, h.g.a.q r21, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.z.a.be.F(h.g.a.a, androidx.compose.ui.Modifier, h.g.a.a, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    public static float G(int i2, Composer composer, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2082726188, i3, -1, "com.waze.design_components_compose.components.pxToDp (ComposeExts.kt:9)");
        }
        float fMo2124toDpu2uoSUM = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo2124toDpu2uoSUM(i2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fMo2124toDpu2uoSUM;
    }

    public static float H(float f2, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1518800145, i2, -1, "com.waze.design_components_compose.components.toPx (ComposeExts.kt:7)");
        }
        float fMo2127toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo2127toPx0680j_4(f2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fMo2127toPx0680j_4;
    }

    public static float I(float f2, Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-606678905, 0, -1, "com.waze.design_components_compose.components.pxToDp (ComposeExts.kt:13)");
        }
        float fMo2123toDpu2uoSUM = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo2123toDpu2uoSUM(f2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fMo2123toDpu2uoSUM;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.compose.ui.Modifier J(androidx.compose.ui.Modifier r13, boolean r14, androidx.compose.ui.semantics.Role r15, h.g.a.a r16, androidx.compose.runtime.Composer r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.z.a.be.J(androidx.compose.ui.Modifier, boolean, androidx.compose.ui.semantics.Role, h.g.a.a, androidx.compose.runtime.Composer, int, int):androidx.compose.ui.Modifier");
    }

    private static long K(com.waze.ui.r.a.e.a.a aVar, boolean z, com.waze.design_components.button.g gVar, com.waze.design_components.button.e eVar) {
        return !z ? aVar.s() : gVar == com.waze.design_components.button.g.f23358a ? aVar.D() : gVar == com.waze.design_components.button.g.f23360c ? aVar.o() : eVar == com.waze.design_components.button.e.f23350b ? aVar.b() : aVar.G();
    }

    private static void L(final as asVar, final float f2, final float f3, final com.waze.design_components.button.g gVar, final com.waze.design_components.button.e eVar, Composer composer, final int i2) {
        int i3;
        float f4;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1577523612);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(asVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(f2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            f4 = f3;
            i3 |= true != composerStartRestartGroup.changed(f4) ? 128 : 256;
        } else {
            f4 = f3;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(gVar.ordinal()) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changed(eVar.ordinal()) ? 8192 : 16384;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1577523612, i3, -1, "com.waze.design_components_compose.components.WazeButtonTimerLayout (WazeButton.kt:284)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            float f5 = 0.0f;
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Animatable animatable = (Animatable) objRememberedValue;
            Long lValueOf = Long.valueOf(asVar.b());
            Long lValueOf2 = Long.valueOf(asVar.a());
            boolean zChangedInstance = ((i3 & 14) == 4) | composerStartRestartGroup.changedInstance(animatable);
            aq aqVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || aqVarRememberedValue == Composer.Companion.getEmpty()) {
                aqVarRememberedValue = new aq(asVar, animatable, null);
                composerStartRestartGroup.updateRememberedValue(aqVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(lValueOf, lValueOf2, (h.g.a.p) aqVarRememberedValue, composerStartRestartGroup, 0);
            Modifier modifierClip = ClipKt.clip(SizeKt.fillMaxWidth$default(SizeKt.m2808height3ABfNKs(Modifier.Companion, f2), 0.0f, 1, null), RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(f4));
            int i5 = (i3 >> 9) & 14;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1955883948, i5, -1, "com.waze.design_components_compose.components.getTimerAlphaValue (WazeButton.kt:330)");
            }
            boolean zV = com.waze.bz.a.d(composerStartRestartGroup, 0).V();
            com.waze.design_components.button.f fVar = com.waze.design_components.button.f.f23353a;
            com.waze.design_components.button.g gVar2 = com.waze.design_components.button.g.f23358a;
            int iOrdinal = gVar.ordinal();
            if (iOrdinal == 0) {
                f5 = zV ? 0.6f : 0.48f;
            } else if (iOrdinal == 1) {
                f5 = 0.16f;
            } else if (iOrdinal != 2) {
                throw new h.i();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Modifier modifierM1972backgroundbw27NRU$default = BackgroundKt.m1972backgroundbw27NRU$default(AlphaKt.alpha(modifierClip, f5), Color.Companion.m8263getTransparent0d7_KjU(), null, 2, null);
            float fFloatValue = ((Number) animatable.getValue()).floatValue();
            com.waze.ui.r.a.e.a.a aVarD = com.waze.bz.a.d(composerStartRestartGroup, 0);
            ProgressIndicatorKt.m4156LinearProgressIndicator_5eSRE(fFloatValue, modifierM1972backgroundbw27NRU$default, gVar == com.waze.design_components.button.g.f23358a ? aVarD.B() : eVar == com.waze.design_components.button.e.f23349a ? aVarD.E() : aVarD.a(), 0L, 0, composerStartRestartGroup, 0, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.z.a.ap
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return be.m(asVar, f2, f3, gVar, eVar, i2, (Composer) obj);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void M(final h.g.a.a r30, final com.waze.z.a.g.s r31, final androidx.compose.ui.Modifier r32, final java.lang.String r33, final com.waze.z.a.am r34, final com.waze.z.a.ar r35, final boolean r36, final int r37, androidx.compose.runtime.Composer r38, final int r39) {
        /*
            Method dump skipped, instructions count: 1324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.z.a.be.M(h.g.a.a, com.waze.z.a.g.s, androidx.compose.ui.Modifier, java.lang.String, com.waze.z.a.am, com.waze.z.a.ar, boolean, int, androidx.compose.runtime.Composer, int):void");
    }

    private static long N(m mVar, Composer composer, int i2) {
        long jQ;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1384236202, i2, -1, "com.waze.design_components_compose.components.color (DestinationCell.kt:228)");
        }
        n nVarB = mVar.b();
        n nVar = n.f46150a;
        int iOrdinal = nVarB.ordinal();
        if (iOrdinal == 0) {
            composer.startReplaceGroup(1188877247);
            jQ = com.waze.bz.a.d(composer, 0).q();
            composer.endReplaceGroup();
        } else if (iOrdinal == 1) {
            composer.startReplaceGroup(1188879973);
            jQ = com.waze.bz.a.d(composer, 0).b();
            composer.endReplaceGroup();
        } else if (iOrdinal == 2) {
            composer.startReplaceGroup(1188882753);
            jQ = com.waze.bz.a.d(composer, 0).J();
            composer.endReplaceGroup();
        } else {
            if (iOrdinal != 3) {
                composer.startReplaceGroup(1188874165);
                composer.endReplaceGroup();
                throw new h.i();
            }
            composer.startReplaceGroup(1188885414);
            jQ = com.waze.bz.a.d(composer, 0).H();
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jQ;
    }

    private static void O(Composer composer, final int i2) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-435177642);
        if (composerStartRestartGroup.shouldExecute(i2 != 0, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-435177642, i2, -1, "com.waze.design_components_compose.components.AdBadge (DestinationCell.kt:207)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m4275Text4IGK_g("Ad", BackgroundKt.m1972backgroundbw27NRU$default(ClipKt.clip(SizeKt.m2808height3ABfNKs(SizeKt.m2827width3ABfNKs(Modifier.Companion, 22.0f), 17.0f), RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(4.0f)), com.waze.bz.a.d(composerStartRestartGroup, 0).k(), null, 2, null), com.waze.bz.a.d(composerStartRestartGroup, 0).q(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m11004boximpl(TextAlign.Companion.m11011getCentere0LSkKk()), 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composerStartRestartGroup).b(), composer2, 6, 0, 65016);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.z.a.p
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return be.z(i2, (Composer) obj);
                }
            });
        }
    }

    private static void P(m mVar, Composer composer, int i2) {
        int i3;
        int i4;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1139621082);
        if (i5 == 0) {
            i3 = (true != composerStartRestartGroup.changed(mVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            int i6 = i3 & 14;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1139621082, i3, -1, "com.waze.design_components_compose.components.SecondaryDescriptionLine (DestinationCell.kt:157)");
            }
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, true != mVar.e() ? 0.0f : 4.0f, 0.0f, 4.0f, 5, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m2440spacedBy0680j_4(4.0f), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 54);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2759paddingqDBjuR0$default);
            h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (mVar.c() != null) {
                composerStartRestartGroup.startReplaceGroup(-1824288820);
                D(mVar.c(), SizeKt.m2822size3ABfNKs(Modifier.Companion, 16.0f), null, Color.m8218boximpl(N(mVar, composerStartRestartGroup, i6)), composerStartRestartGroup, 48);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1824115840);
                composerStartRestartGroup.endReplaceGroup();
            }
            i4 = 0;
            TextKt.m4275Text4IGK_g(com.waze.ui.a.l.o(mVar.d(), composerStartRestartGroup, 0), com.waze.ui.r.a.d.d.a(RowScope.CC.weight$default(rowScopeInstance, PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 4.0f, 0.0f, 11, null), 1.0f, false, 2, null), com.waze.ui.r.a.d.c.aa, null), N(mVar, composerStartRestartGroup, i6), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m11069getEllipsisgIe3tQ8(), false, 3, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composerStartRestartGroup).b(), composerStartRestartGroup, 0, DisplayStrings.DS_AAOS_PRIVACY_SETTINGS_DELETE_RECENT_DESTINATION_MESSAGE, 55288);
            composerStartRestartGroup = composerStartRestartGroup;
            if (mVar.a() != null) {
                composerStartRestartGroup.startReplaceGroup(-1823654126);
                com.waze.design_components.g.b.f(mVar.a(), SizeKt.wrapContentWidth$default(Modifier.Companion, null, false, 3, null), composerStartRestartGroup, 48);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1823579168);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i4 = 0;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new o(mVar, i2, i4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080 A[PHI: r12
  0x0080: PHI (r12v22 int) = (r12v0 int), (r12v7 int), (r12v8 int) binds: [B:46:0x007e, B:56:0x009a, B:55:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.lang.String r20, h.g.a.a r21, h.g.a.q r22, androidx.compose.ui.Modifier r23, androidx.compose.foundation.layout.WindowInsets r24, com.waze.design_components.b.d r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.z.a.be.a(java.lang.String, h.g.a.a, h.g.a.q, androidx.compose.ui.Modifier, androidx.compose.foundation.layout.WindowInsets, com.waze.design_components.b.d, androidx.compose.runtime.Composer, int, int):void");
    }

    public static RoundedCornerShape b(boolean z, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(670514326, i2, -1, "com.waze.design_components_compose.components.wazeTextFieldBackgroundShape (WazeTextField.kt:131)");
        }
        RoundedCornerShape roundedCornerShapeM3087RoundedCornerShapea9UjIt4 = z ? RoundedCornerShapeKt.m3087RoundedCornerShapea9UjIt4(8.0f, 8.0f, 0.0f, 0.0f) : RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(8.0f);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return roundedCornerShapeM3087RoundedCornerShapea9UjIt4;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(androidx.compose.ui.Modifier r23, androidx.compose.material.ModalBottomSheetState r24, h.g.a.p r25, boolean r26, h.g.a.p r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.z.a.be.c(androidx.compose.ui.Modifier, androidx.compose.material.ModalBottomSheetState, h.g.a.p, boolean, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    public static void d(final int i2, Modifier modifier, s sVar, Composer composer, final int i3, final int i4) {
        int i5;
        int i6 = i3 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-310569584);
        if (i6 == 0) {
            i5 = (true != composerStartRestartGroup.changed(i2) ? 2 : 4) | i3;
        } else {
            i5 = i3;
        }
        int i7 = i4 & 2;
        if (i7 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        int i8 = i4 & 4;
        if (i8 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= true != composerStartRestartGroup.changed(sVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i5 & 147) != 146, i5 & 1)) {
            if (i7 != 0) {
                modifier = Modifier.Companion;
            }
            if (i8 != 0) {
                sVar = s.f46181a;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-310569584, i5, -1, "com.waze.design_components_compose.components.WazeImage (WazeImage.kt:150)");
            }
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            f(new com.waze.ui.r.a.a.d(PainterResources_androidKt.painterResource(i2, composerStartRestartGroup, i5 & 14)), ComposableLambdaKt.rememberComposableLambda(305513448, true, new com.waze.ads.c.a(sVar, 8), composerStartRestartGroup, 54), null, null, composerStartRestartGroup, 48, 12);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final s sVar2 = sVar;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.z.a.ax
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i9 = i2;
                    Modifier modifier3 = modifier2;
                    be.d(i9, modifier3, sVar2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                    return h.ab.f48028a;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(final com.waze.ui.ac.i r16, androidx.compose.ui.Modifier r17, com.waze.z.a.s r18, h.g.a.p r19, h.g.a.p r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.z.a.be.e(com.waze.ui.ac.i, androidx.compose.ui.Modifier, com.waze.z.a.s, h.g.a.p, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    public static void f(com.waze.ui.r.a.a.g gVar, h.g.a.q qVar, h.g.a.p pVar, h.g.a.p pVar2, Composer composer, int i2, int i3) {
        int i4;
        h.g.b.x.f(gVar, "painterState");
        h.g.b.x.f(qVar, "success");
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1681989285);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changed(gVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(qVar) ? 16 : 32;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar) ? 128 : 256;
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 |= DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS;
        } else if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i4 & 1)) {
            if (i6 != 0) {
                pVar = null;
            }
            if (i7 != 0) {
                pVar2 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1681989285, i4, -1, "com.waze.design_components_compose.components.WazePainterLoader (WazeImage.kt:49)");
            }
            if (gVar instanceof com.waze.ui.r.a.a.d) {
                composerStartRestartGroup.startReplaceGroup(1484007458);
                qVar.invoke(((com.waze.ui.r.a.a.d) gVar).a(), composerStartRestartGroup, Integer.valueOf((i4 & 112) | Painter.$stable));
                composerStartRestartGroup.endReplaceGroup();
            } else if (h.g.b.x.n(gVar, com.waze.ui.r.a.a.e.f43270a)) {
                composerStartRestartGroup.startReplaceGroup(-1240347211);
                if (pVar == null) {
                    composerStartRestartGroup.startReplaceGroup(-1240347212);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1484009453);
                    pVar.invoke(composerStartRestartGroup, Integer.valueOf((i4 >> 6) & 14));
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            } else if (h.g.b.x.n(gVar, com.waze.ui.r.a.a.f.f43271a)) {
                composerStartRestartGroup.startReplaceGroup(-1240301579);
                if (pVar2 == null) {
                    composerStartRestartGroup.startReplaceGroup(-1240301580);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1484010925);
                    pVar2.invoke(composerStartRestartGroup, Integer.valueOf((i4 >> 9) & 14));
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!h.g.b.x.n(gVar, com.waze.ui.r.a.a.c.f43268a)) {
                    composerStartRestartGroup.startReplaceGroup(1484005905);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new h.i();
                }
                composerStartRestartGroup.startReplaceGroup(-1240267045);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        h.g.a.p pVar3 = pVar;
        h.g.a.p pVar4 = pVar2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w(gVar, qVar, pVar3, pVar4, i2, i3, 2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(final com.waze.design_components.b.d r23, androidx.compose.ui.Modifier r24, com.waze.design_components.b.e r25, long r26, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.z.a.be.g(com.waze.design_components.b.d, androidx.compose.ui.Modifier, com.waze.design_components.b.e, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(java.lang.String r17, androidx.compose.ui.Modifier r18, h.g.a.a r19, androidx.compose.foundation.layout.WindowInsets r20, h.g.a.q r21, com.waze.design_components.b.d r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.z.a.be.h(java.lang.String, androidx.compose.ui.Modifier, h.g.a.a, androidx.compose.foundation.layout.WindowInsets, h.g.a.q, com.waze.design_components.b.d, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(androidx.compose.foundation.layout.RowScope r17, com.waze.design_components.b.d r18, h.g.a.a r19, androidx.compose.ui.Modifier r20, com.waze.design_components.b.e r21, long r22, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.z.a.be.i(androidx.compose.foundation.layout.RowScope, com.waze.design_components.b.d, h.g.a.a, androidx.compose.ui.Modifier, com.waze.design_components.b.e, long, androidx.compose.runtime.Composer, int, int):void");
    }

    static h.ab j(String str, h.g.a.a aVar, h.g.a.q qVar, Modifier modifier, WindowInsets windowInsets, com.waze.design_components.b.d dVar, int i2, int i3, Composer composer) {
        a(str, aVar, qVar, modifier, windowInsets, dVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return h.ab.f48028a;
    }

    public static void k(h.g.a.a aVar, h.g.a.a aVar2, Modifier modifier, WindowInsets windowInsets, Composer composer, int i2) {
        int i3;
        Modifier.Companion companion;
        WindowInsets windowInsets2;
        WindowInsets WindowInsets;
        h.g.b.x.f(aVar, "onBackButtonClick");
        h.g.b.x.f("Done", "optionText");
        h.g.b.x.f(aVar2, "onButtonClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1758945777);
        if ((i2 & 6) == 0) {
            i3 = (true != composerStartRestartGroup.changed("Header with a button") ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed("Done") ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changed(true) ? 8192 : 16384;
        }
        int i4 = 196608 | i3;
        if ((1572864 & i2) == 0) {
            i4 = i3 | 720896;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i4) != 599186, i4 & 1)) {
            int i5 = (-3670017) & i4;
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                companion = Modifier.Companion;
                WindowInsets = WindowInsetsKt.WindowInsets(0, 0, 0, 0);
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                companion = modifier;
                WindowInsets = windowInsets;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1758945777, i5, -1, "com.waze.design_components_compose.components.WazeHeader (WazeHeader.kt:70)");
            }
            windowInsets2 = WindowInsets;
            a("Header with a button", aVar, ComposableLambdaKt.rememberComposableLambda(710147926, true, new com.waze.o.d.b.b.b(aVar2, 3), composerStartRestartGroup, 54), companion, windowInsets2, null, composerStartRestartGroup, (i4 & 14) | 384 | (i4 & 112) | ((i5 >> 6) & 7168), 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            companion = modifier;
            windowInsets2 = windowInsets;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.closure.d.b(aVar, aVar2, companion, windowInsets2, i2, 5));
        }
    }

    public static void l(Modifier modifier, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(1295460369);
        if ((i2 & 6) == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(true) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1295460369, i3, -1, "com.waze.design_components_compose.components.WazeCircularLoader (WazeCircularLoader.kt:15)");
            }
            composerStartRestartGroup.startReplaceGroup(-603094105);
            boolean zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            com.airbnb.lottie.b.w wVarD = com.airbnb.lottie.b.an.d(com.airbnb.lottie.b.ab.b(true != zIsSystemInDarkTheme ? R.raw.circular_infinite_loader_dark : R.raw.circular_infinite_loader_light), composerStartRestartGroup);
            com.airbnb.lottie.b.s sVarH = com.airbnb.lottie.b.o.h(a.a.G(wVarD), false, false, false, 0.0f, Integer.MAX_VALUE, composerStartRestartGroup, 1572864, 958);
            com.airbnb.lottie.h hVarG = a.a.G(wVarD);
            boolean zChanged = composerStartRestartGroup.changed(sVarH);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.authentication.am(sVarH, 14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            com.airbnb.lottie.b.o.c(hVarG, (h.g.a.a) objRememberedValue, modifier, null, null, null, null, false, null, composerStartRestartGroup, (i3 << 6) & DisplayStrings.DS_TAP_TO_VERIFY, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fa(modifier, i2, 7));
        }
    }

    static h.ab m(as asVar, float f2, float f3, com.waze.design_components.button.g gVar, com.waze.design_components.button.e eVar, int i2, Composer composer) {
        L(asVar, f2, f3, gVar, eVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    public static void n(com.waze.ui.ac.i iVar, com.waze.ui.ac.n nVar, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(iVar, "icon");
        h.g.b.x.f(nVar, "text");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1145852092);
        if (i4 == 0) {
            i3 = i2 | (true != composerStartRestartGroup.changed(iVar) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? composerStartRestartGroup.changed(nVar) : composerStartRestartGroup.changedInstance(nVar)) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1145852092, i3, -1, "com.waze.design_components_compose.components.DontTypeWhileDriving (TypingWhileDriving.kt:22)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            IconKt.m4110Iconww6aTOc(com.waze.ui.r.a.a.t.e(iVar, null, composerStartRestartGroup, i3 & 14, 6), (String) null, (Modifier) null, com.waze.bz.a.d(composerStartRestartGroup, 0).b(), composerStartRestartGroup, Painter.$stable | 48, 4);
            SpacerKt.Spacer(SizeKt.m2827width3ABfNKs(Modifier.Companion, 8.0f), composerStartRestartGroup, 6);
            TextKt.m4275Text4IGK_g(com.waze.ui.a.l.o(nVar, composerStartRestartGroup, (i3 >> 3) & 14), (Modifier) null, com.waze.bz.a.d(composerStartRestartGroup, 0).b(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composerStartRestartGroup).h(), composerStartRestartGroup, 0, 0, 65530);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.c.e.t(iVar, nVar, i2, 12, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void o(final h.g.a.a r21, androidx.compose.ui.Modifier r22, java.lang.String r23, com.waze.z.a.am r24, com.waze.z.a.ar r25, com.waze.z.a.g.s r26, boolean r27, boolean r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.z.a.be.o(h.g.a.a, androidx.compose.ui.Modifier, java.lang.String, com.waze.z.a.am, com.waze.z.a.ar, com.waze.z.a.g.s, boolean, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    static h.ab p(h.g.a.a aVar, com.waze.z.a.g.s sVar, Modifier modifier, String str, am amVar, ar arVar, boolean z, int i2, int i3, Composer composer) {
        M(aVar, sVar, modifier, str, amVar, arVar, z, i2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return h.ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011b  */
    /* JADX WARN: Type inference failed for: r3v36, types: [h.g.a.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void q(final java.lang.String r72, final h.g.a.l r73, final androidx.compose.ui.Modifier r74, java.lang.String r75, boolean r76, int r77, int r78, h.g.a.l r79, androidx.compose.ui.text.input.VisualTransformation r80, com.waze.location.q r81, androidx.compose.runtime.Composer r82, final int r83, final int r84) {
        /*
            Method dump skipped, instructions count: 1340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.z.a.be.q(java.lang.String, h.g.a.l, androidx.compose.ui.Modifier, java.lang.String, boolean, int, int, h.g.a.l, androidx.compose.ui.text.input.VisualTransformation, com.waze.location.q, androidx.compose.runtime.Composer, int, int):void");
    }

    public static ad r(com.waze.ui.ac.n nVar, ab abVar, com.waze.ui.ac.i iVar) {
        h.g.b.x.f(nVar, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(abVar, "actionSentiment");
        h.g.b.x.f(iVar, "icon");
        return new ac(nVar, abVar, iVar);
    }

    public static void v(Modifier modifier, u uVar, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(modifier, "modifier");
        h.g.b.x.f(uVar, "mapRecenterState");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1841431321);
        if (i4 == 0) {
            i3 = i2 | (true != composerStartRestartGroup.changed(modifier) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(uVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1841431321, i3, -1, "com.waze.design_components_compose.components.AnimatedRecenterMapButton (RecenterMapButton.kt:71)");
            }
            int iMo2127toPx0680j_4 = (int) ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo2127toPx0680j_4(((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenWidthDp);
            t tVarA = uVar.a();
            t tVar = t.f46188a;
            int iOrdinal = tVarA.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    throw new h.i();
                }
                iMo2127toPx0680j_4 = -iMo2127toPx0680j_4;
            }
            int i5 = i3;
            boolean zC = uVar.c();
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(DisplayStrings.DS_ROUTE_SETTINGS_AVOID_FERRIES_OPTION_TITLE, 0, EasingFunctionsKt.getEaseInOutQuint(), 2, null);
            boolean zChanged = composerStartRestartGroup.changed(iMo2127toPx0680j_4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.c.e.u(iMo2127toPx0680j_4, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EnterTransition enterTransitionSlideInHorizontally = EnterExitTransitionKt.slideInHorizontally(tweenSpecTween$default, (h.g.a.l) objRememberedValue);
            TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(DisplayStrings.DS_ROUTE_SETTINGS_AVOID_FERRIES_OPTION_TITLE, 0, EasingFunctionsKt.getEaseInOutQuint(), 2, null);
            boolean zChanged2 = composerStartRestartGroup.changed(iMo2127toPx0680j_4);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.c.e.u(iMo2127toPx0680j_4, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            AnimatedVisibilityKt.AnimatedVisibility(zC, modifier, enterTransitionSlideInHorizontally, EnterExitTransitionKt.slideOutHorizontally(tweenSpecTween$default2, (h.g.a.l) objRememberedValue2), (String) null, ComposableLambdaKt.rememberComposableLambda(2137928975, true, new com.waze.ads.c.a(uVar, 7), composerStartRestartGroup, 54), composerStartRestartGroup, ((i5 << 3) & 112) | 196608, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.c.e.t(modifier, uVar, i2, 11, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void w(androidx.compose.ui.Modifier r18, h.g.a.a r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.z.a.be.w(androidx.compose.ui.Modifier, h.g.a.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static void x(Modifier modifier, Composer composer, int i2) {
        int i3;
        long j2;
        h.g.b.x.f(modifier, "modifier");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(2036420690);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2036420690, i3, -1, "com.waze.design_components_compose.components.ContentPlaceholder (Placeholder.kt:31)");
            }
            InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
            long jM = com.waze.bz.a.d(composerStartRestartGroup, 0).M();
            long jO = com.waze.bz.a.d(composerStartRestartGroup, 0).O();
            boolean zChanged = composerStartRestartGroup.changed(jM) | composerStartRestartGroup.changed(jO);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                j2 = jM;
                com.waze.parking.i iVar = new com.waze.parking.i(j2, jO, 1);
                composerStartRestartGroup.updateRememberedValue(iVar);
                objRememberedValue = iVar;
            } else {
                j2 = jM;
            }
            long j3 = j2;
            BoxKt.Box(BackgroundKt.m1972backgroundbw27NRU$default(ClipKt.clip(modifier, RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(12.0f)), TransitionKt.m1858animateColorDTcfvLk(infiniteTransitionRememberInfiniteTransition, j3, j3, AnimationSpecKt.m1878infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes((h.g.a.l) objRememberedValue), RepeatMode.Restart, 0L, 4, null), "Placeholder animation", composerStartRestartGroup, InfiniteTransition.$stable | 24576 | (InfiniteRepeatableSpec.$stable << 9), 0).getValue().m8238unboximpl(), null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fa(modifier, i2, 6));
        }
    }

    public static void y(Object obj, Modifier modifier, String str, h.g.a.q qVar, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        String str2;
        h.g.b.x.f(qVar, "content");
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-452659380);
        if (i5 == 0) {
            i4 = (true != ((i2 & 8) == 0 ? composerStartRestartGroup.changed(obj) : composerStartRestartGroup.changedInstance(obj)) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        int i7 = i4 | 384;
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i7 |= true != composerStartRestartGroup.changedInstance(qVar) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i7 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i7 & 1)) {
            Modifier modifier3 = i6 != 0 ? Modifier.Companion : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-452659380, i7, -1, "com.waze.design_components_compose.components.PlaceholderCrossfade (Placeholder.kt:66)");
            }
            int i8 = i7;
            int i9 = i8 << 3;
            int i10 = (i8 & 8) | 384 | (i8 & 14) | (i9 & 7168) | (i9 & 57344);
            str2 = "";
            CrossfadeKt.Crossfade(obj, AnimationModifierKt.animateContentSize$default(modifier3, null, null, 3, null), AnimationSpecKt.tween$default(300, 0, null, 6, null), "", (h.g.a.q<? super Object, ? super Composer, ? super Integer, h.ab>) qVar, composerStartRestartGroup, i10, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            str2 = str;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w(obj, modifier2, str2, qVar, i2, i3, 0));
        }
    }

    static h.ab z(int i2, Composer composer) {
        O(composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    private be() {
        throw null;
    }
}
