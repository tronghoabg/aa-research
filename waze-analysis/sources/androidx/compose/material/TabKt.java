package androidx.compose.material;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnitKt;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.p;
import h.g.a.q;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TabKt {
    private static final float DoubleLineTextBaselineWithIcon = 6.0f;
    private static final float HorizontalTextPadding = 16.0f;
    private static final float LargeTabHeight = 72.0f;
    private static final float SingleLineTextBaselineWithIcon = 14.0f;
    private static final float SmallTabHeight = 48.0f;
    private static final int TabFadeInAnimationDelay = 100;
    private static final int TabFadeInAnimationDuration = 150;
    private static final int TabFadeOutAnimationDuration = 100;
    private static final long IconDistanceFromBaseline = TextUnitKt.getSp(20);
    private static final float TextDistanceFromLeadingIcon = 8.0f;

    /* JADX WARN: Removed duplicated region for block: B:121:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011a  */
    /* renamed from: LeadingIconTab-0nD-MI0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4231LeadingIconTab0nDMI0(final boolean r26, final h.g.a.a<h.ab> r27, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r28, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r29, androidx.compose.ui.Modifier r30, boolean r31, androidx.compose.foundation.interaction.MutableInteractionSource r32, long r33, long r35, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabKt.m4231LeadingIconTab0nDMI0(boolean, h.g.a.a, h.g.a.p, h.g.a.p, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab LeadingIconTab_0nD_MI0$lambda$0(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, a aVar, p pVar, p pVar2, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1415722219, i2, -1, "androidx.compose.material.LeadingIconTab.<anonymous> (Tab.kt:166)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m2757paddingVpY3zN4$default(SelectableKt.m3048selectableO2vRcR0(SizeKt.m2808height3ABfNKs(modifier, SmallTabHeight), z, mutableInteractionSource, indicationNodeFactory, z2, Role.m10309boximpl(Role.Companion.m10323getTabo7Vup1c()), aVar), HorizontalTextPadding, 0.0f, 2, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterVertically(), composer, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
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
            Updater.m7351setimpl(composer, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, ab> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer.getInserting() || !x.n(composer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Integer numValueOf = Integer.valueOf(currentCompositeKeyHash);
                composer.updateRememberedValue(numValueOf);
                composer.apply(numValueOf, setCompositeKeyHash);
            }
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            pVar.invoke(composer, 0);
            SpacerKt.Spacer(SizeKt.m2819requiredWidth3ABfNKs(Modifier.Companion, TextDistanceFromLeadingIcon), composer, 6);
            TextKt.ProvideTextStyle(TextStyle.m10559copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer, 6).getButton(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.Companion.m11011getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), pVar2, composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab LeadingIconTab_0nD_MI0$lambda$1(boolean z, a aVar, p pVar, p pVar2, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, long j2, long j3, int i2, int i3, Composer composer, int i4) {
        m4231LeadingIconTab0nDMI0(z, aVar, pVar, pVar2, modifier, z2, mutableInteractionSource, j2, j3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011f  */
    /* renamed from: Tab-0nD-MI0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4232Tab0nDMI0(final boolean r27, final h.g.a.a<h.ab> r28, androidx.compose.ui.Modifier r29, boolean r30, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r31, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r32, androidx.compose.foundation.interaction.MutableInteractionSource r33, long r34, long r36, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabKt.m4232Tab0nDMI0(boolean, h.g.a.a, androidx.compose.ui.Modifier, boolean, h.g.a.p, h.g.a.p, androidx.compose.foundation.interaction.MutableInteractionSource, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f0  */
    /* renamed from: Tab-EVJuX4I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4233TabEVJuX4I(final boolean r29, final h.g.a.a<h.ab> r30, androidx.compose.ui.Modifier r31, boolean r32, androidx.compose.foundation.interaction.MutableInteractionSource r33, long r34, long r36, final h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabKt.m4233TabEVJuX4I(boolean, h.g.a.a, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, long, long, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final void TabBaselineLayout(final p<? super Composer, ? super Integer, ab> pVar, final p<? super Composer, ? super Integer, ab> pVar2, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1466813041);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(pVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1466813041, i3, -1, "androidx.compose.material.TabBaselineLayout (Tab.kt:297)");
            }
            int i5 = i3 & 14;
            boolean z = i5 == 4;
            boolean z2 = (i3 & 112) == 32;
            TabKt$TabBaselineLayout$2$1 tabKt$TabBaselineLayout$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | z2) || tabKt$TabBaselineLayout$2$1RememberedValue == Composer.Companion.getEmpty()) {
                tabKt$TabBaselineLayout$2$1RememberedValue = new TabKt$TabBaselineLayout$2$1(pVar, pVar2);
                composerStartRestartGroup.updateRememberedValue(tabKt$TabBaselineLayout$2$1RememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) tabKt$TabBaselineLayout$2$1RememberedValue;
            Modifier.Companion companion = Modifier.Companion;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            if (pVar != null) {
                composerStartRestartGroup.startReplaceGroup(-1044948645);
                Modifier modifierM2757paddingVpY3zN4$default = PaddingKt.m2757paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "text"), HorizontalTextPadding, 0.0f, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2757paddingVpY3zN4$default);
                a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, ab> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerStartRestartGroup.getInserting() || !x.n(composerStartRestartGroup.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    Integer numValueOf2 = Integer.valueOf(currentCompositeKeyHash2);
                    composerStartRestartGroup.updateRememberedValue(numValueOf2);
                    composerStartRestartGroup.apply(numValueOf2, setCompositeKeyHash2);
                }
                Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                pVar.invoke(composerStartRestartGroup, Integer.valueOf(i5));
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1044843896);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (pVar2 != null) {
                composerStartRestartGroup.startReplaceGroup(-1044815097);
                Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.Companion, "icon");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId);
                a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, ab> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerStartRestartGroup.getInserting() || !x.n(composerStartRestartGroup.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    Integer numValueOf3 = Integer.valueOf(currentCompositeKeyHash3);
                    composerStartRestartGroup.updateRememberedValue(numValueOf3);
                    composerStartRestartGroup.apply(numValueOf3, setCompositeKeyHash3);
                }
                Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                pVar2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 3) & 14));
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1044752632);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.TabKt$$ExternalSyntheticLambda2
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TabKt.TabBaselineLayout$lambda$2(pVar, pVar2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab TabBaselineLayout$lambda$2(p pVar, p pVar2, int i2, Composer composer, int i3) {
        TabBaselineLayout(pVar, pVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* renamed from: TabTransition-Klgx-Pg, reason: not valid java name */
    private static final void m4234TabTransitionKlgxPg(long j2, final long j3, final boolean z, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        long j4;
        int i3;
        long j5;
        boolean z2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1841653376);
        if (i4 == 0) {
            j4 = j2;
            i3 = (true != composerStartRestartGroup.changed(j4) ? 2 : 4) | i2;
        } else {
            j4 = j2;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            j5 = j3;
            i3 |= true != composerStartRestartGroup.changed(j5) ? 16 : 32;
        } else {
            j5 = j3;
        }
        if ((i2 & 384) == 0) {
            z2 = z;
            i3 |= true != composerStartRestartGroup.changed(z2) ? 128 : 256;
        } else {
            z2 = z;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1841653376, i3, -1, "androidx.compose.material.TabTransition (Tab.kt:266)");
            }
            int i5 = i3 >> 6;
            Transition transitionUpdateTransition = TransitionKt.updateTransition(Boolean.valueOf(z2), (String) null, composerStartRestartGroup, i5 & 14, 2);
            q qVar = new q() { // from class: androidx.compose.material.TabKt$$ExternalSyntheticLambda0
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return TabKt.TabTransition_Klgx_Pg$lambda$0((Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            };
            boolean zBooleanValue = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
            composerStartRestartGroup.startReplaceGroup(90393475);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(90393475, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:282)");
            }
            long j6 = true != zBooleanValue ? j5 : j4;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            ColorSpace colorSpaceM8232getColorSpaceimpl = Color.m8232getColorSpaceimpl(j6);
            boolean zChanged = composerStartRestartGroup.changed(colorSpaceM8232getColorSpaceimpl);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpaceM8232getColorSpaceimpl);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            TwoWayConverter twoWayConverter = (TwoWayConverter) objRememberedValue;
            boolean zBooleanValue2 = ((Boolean) transitionUpdateTransition.getCurrentState()).booleanValue();
            composerStartRestartGroup.startReplaceGroup(90393475);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(90393475, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:282)");
            }
            long j7 = true != zBooleanValue2 ? j5 : j4;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Color colorM8218boximpl = Color.m8218boximpl(j7);
            boolean zBooleanValue3 = ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue();
            composerStartRestartGroup.startReplaceGroup(90393475);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(90393475, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:282)");
            }
            long j8 = true != zBooleanValue3 ? j5 : j4;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM8218boximpl, Color.m8218boximpl(j8), (FiniteAnimationSpec) qVar.invoke(transitionUpdateTransition.getSegment(), composerStartRestartGroup, 0), twoWayConverter, "ColorAnimation", composerStartRestartGroup, 0);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(Color.m8227copywmQWz5c$default(TabTransition_Klgx_Pg$lambda$2(stateCreateTransitionAnimation), 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m8230getAlphaimpl(TabTransition_Klgx_Pg$lambda$2(stateCreateTransitionAnimation))))}, pVar, composerStartRestartGroup, (i5 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final long j9 = j4;
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.TabKt$$ExternalSyntheticLambda1
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TabKt.TabTransition_Klgx_Pg$lambda$3(j9, j3, z, pVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final FiniteAnimationSpec TabTransition_Klgx_Pg$lambda$0(Transition.Segment segment, Composer composer, int i2) {
        composer.startReplaceGroup(297582231);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(297582231, i2, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:271)");
        }
        TweenSpec tweenSpecTween = segment.isTransitioningTo(false, true) ? AnimationSpecKt.tween(150, 100, EasingKt.getLinearEasing()) : AnimationSpecKt.tween$default(100, 0, EasingKt.getLinearEasing(), 2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return tweenSpecTween;
    }

    private static final long TabTransition_Klgx_Pg$lambda$2(State<Color> state) {
        return state.getValue().m8238unboximpl();
    }

    static final ab TabTransition_Klgx_Pg$lambda$3(long j2, long j3, boolean z, p pVar, int i2, Composer composer, int i3) {
        m4234TabTransitionKlgxPg(j2, j3, z, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Tab_0nD_MI0$lambda$0$0(p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1101313667, i2, -1, "androidx.compose.material.Tab.<anonymous>.<anonymous> (Tab.kt:101)");
            }
            TextKt.ProvideTextStyle(TextStyle.m10559copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer, 6).getButton(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.Companion.m11011getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), pVar, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab Tab_0nD_MI0$lambda$1(p pVar, p pVar2, ColumnScope columnScope, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1088373601, i2, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:114)");
            }
            TabBaselineLayout(pVar, pVar2, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab Tab_0nD_MI0$lambda$2(boolean z, a aVar, Modifier modifier, boolean z2, p pVar, p pVar2, MutableInteractionSource mutableInteractionSource, long j2, long j3, int i2, int i3, Composer composer, int i4) {
        m4232Tab0nDMI0(z, aVar, modifier, z2, pVar, pVar2, mutableInteractionSource, j2, j3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab Tab_EVJuX4I$lambda$0(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, a aVar, q qVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-652402312, i2, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:236)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m3048selectableO2vRcR0(modifier, z, mutableInteractionSource, indicationNodeFactory, z2, Role.m10309boximpl(Role.Companion.m10323getTabo7Vup1c()), aVar), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterHorizontally(), composer, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
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
            p<ComposeUiNode, Integer, ab> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer.getInserting() || !x.n(composer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Integer numValueOf = Integer.valueOf(currentCompositeKeyHash);
                composer.updateRememberedValue(numValueOf);
                composer.apply(numValueOf, setCompositeKeyHash);
            }
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            qVar.invoke(ColumnScopeInstance.INSTANCE, composer, 6);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab Tab_EVJuX4I$lambda$1(boolean z, a aVar, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, long j2, long j3, q qVar, int i2, int i3, Composer composer, int i4) {
        m4233TabEVJuX4I(z, aVar, modifier, z2, mutableInteractionSource, j2, j3, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeTextAndIcon(Placeable.PlacementScope placementScope, Density density, Placeable placeable, Placeable placeable2, int i2, int i3, int i4, int i5) {
        int iMo2121roundToPx0680j_4 = density.mo2121roundToPx0680j_4(i4 == i5 ? SingleLineTextBaselineWithIcon : DoubleLineTextBaselineWithIcon) + density.mo2121roundToPx0680j_4(TabRowDefaults.INSTANCE.m4241getIndicatorHeightD9Ej5fM());
        int height = placeable2.getHeight() + density.mo2120roundToPxR2X_6o(IconDistanceFromBaseline);
        int i6 = (i3 - i5) - iMo2121roundToPx0680j_4;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, (i2 - placeable.getWidth()) / 2, i6, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, (i2 - placeable2.getWidth()) / 2, i6 - (height - i4), 0.0f, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeTextOrIcon(Placeable.PlacementScope placementScope, Placeable placeable, int i2) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (i2 - placeable.getHeight()) / 2, 0.0f, 4, null);
    }
}
