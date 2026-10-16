package androidx.compose.material;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.unit.Dp;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ListItemKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void BaselinesOffsetColumn(final List<Dp> list, Modifier modifier, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2, final int i3) {
        int i4;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(872528548);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changedInstance(list) ? 2 : 4) | i2;
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
                ComposerKt.traceEventStart(872528548, i4, -1, "androidx.compose.material.BaselinesOffsetColumn (ListItem.kt:364)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list);
            ListItemKt$BaselinesOffsetColumn$1$1 listItemKt$BaselinesOffsetColumn$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || listItemKt$BaselinesOffsetColumn$1$1RememberedValue == Composer.Companion.getEmpty()) {
                listItemKt$BaselinesOffsetColumn$1$1RememberedValue = new ListItemKt$BaselinesOffsetColumn$1$1(list);
                composerStartRestartGroup.updateRememberedValue(listItemKt$BaselinesOffsetColumn$1$1RememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) listItemKt$BaselinesOffsetColumn$1$1RememberedValue;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            int i7 = ((((i4 & 112) | ((i4 >> 6) & 14)) << 6) & DisplayStrings.DS_TAP_TO_VERIFY) | 6;
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
            pVar.invoke(composerStartRestartGroup, Integer.valueOf((i7 >> 6) & 14));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.ListItemKt$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ListItemKt.BaselinesOffsetColumn$lambda$1(list, modifier2, pVar, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab BaselinesOffsetColumn$lambda$1(List list, Modifier modifier, p pVar, int i2, int i3, Composer composer, int i4) {
        BaselinesOffsetColumn(list, modifier, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ListItem(androidx.compose.ui.Modifier r20, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r21, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r22, boolean r23, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r24, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r25, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ListItemKt.ListItem(androidx.compose.ui.Modifier, h.g.a.p, h.g.a.p, boolean, h.g.a.p, h.g.a.p, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ListItem$lambda$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return ab.f48028a;
    }

    static final ab ListItem$lambda$1(Modifier modifier, p pVar, p pVar2, boolean z, p pVar3, p pVar4, p pVar5, int i2, int i3, Composer composer, int i4) {
        ListItem(modifier, pVar, pVar2, z, pVar3, pVar4, pVar5, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OffsetToBaselineOrCenter-Kz89ssw, reason: not valid java name */
    public static final void m4113OffsetToBaselineOrCenterKz89ssw(final float f2, Modifier modifier, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2, final int i3) {
        int i4;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(953221030);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changed(f2) ? 2 : 4) | i2;
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
                ComposerKt.traceEventStart(953221030, i4, -1, "androidx.compose.material.OffsetToBaselineOrCenter (ListItem.kt:403)");
            }
            int i7 = i4 & 14;
            ListItemKt$OffsetToBaselineOrCenter$1$1 listItemKt$OffsetToBaselineOrCenter$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (i7 == 4 || listItemKt$OffsetToBaselineOrCenter$1$1RememberedValue == Composer.Companion.getEmpty()) {
                listItemKt$OffsetToBaselineOrCenter$1$1RememberedValue = new ListItemKt$OffsetToBaselineOrCenter$1$1(f2);
                composerStartRestartGroup.updateRememberedValue(listItemKt$OffsetToBaselineOrCenter$1$1RememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) listItemKt$OffsetToBaselineOrCenter$1$1RememberedValue;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            int i8 = ((((i4 & 112) | ((i4 >> 6) & 14)) << 6) & DisplayStrings.DS_TAP_TO_VERIFY) | 6;
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
            pVar.invoke(composerStartRestartGroup, Integer.valueOf((i8 >> 6) & 14));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.ListItemKt$$ExternalSyntheticLambda2
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ListItemKt.OffsetToBaselineOrCenter_Kz89ssw$lambda$1(f2, modifier2, pVar, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab OffsetToBaselineOrCenter_Kz89ssw$lambda$1(float f2, Modifier modifier, p pVar, int i2, int i3, Composer composer, int i4) {
        m4113OffsetToBaselineOrCenterKz89ssw(f2, modifier, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    private static final p<Composer, Integer, ab> applyTextStyle(final TextStyle textStyle, final float f2, final p<? super Composer, ? super Integer, ab> pVar) {
        if (pVar == null) {
            return null;
        }
        final LineHeightStyle lineHeightStyle = new LineHeightStyle(LineHeightStyle.Alignment.Companion.m10979getProportionalPIaL0Z0(), LineHeightStyle.Trim.Companion.m11000getBothEVpEnUU(), (o) null);
        return ComposableLambdaKt.composableLambdaInstance(-1000595778, true, new p() { // from class: androidx.compose.material.ListItemKt$$ExternalSyntheticLambda1
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return ListItemKt.applyTextStyle$lambda$0(f2, textStyle, lineHeightStyle, pVar, (Composer) obj, ((Integer) obj2).intValue());
            }
        });
    }

    static final ab applyTextStyle$lambda$0(float f2, final TextStyle textStyle, final LineHeightStyle lineHeightStyle, final p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1000595778, i2, -1, "androidx.compose.material.applyTextStyle.<anonymous> (ListItem.kt:438)");
            }
            CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(f2)), ComposableLambdaKt.rememberComposableLambda(-925826178, true, new p() { // from class: androidx.compose.material.ListItemKt$$ExternalSyntheticLambda3
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ListItemKt.applyTextStyle$lambda$0$0(textStyle, lineHeightStyle, pVar, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab applyTextStyle$lambda$0$0(TextStyle textStyle, LineHeightStyle lineHeightStyle, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-925826178, i2, -1, "androidx.compose.material.applyTextStyle.<anonymous>.<anonymous> (ListItem.kt:439)");
            }
            TextKt.ProvideTextStyle(TextStyle.m10559copyp1EtxEg$default(textStyle, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, lineHeightStyle, 0, 0, null, 15728639, null), pVar, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }
}
