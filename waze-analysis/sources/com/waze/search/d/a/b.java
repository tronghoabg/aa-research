package com.waze.search.d.a;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import com.waze.c.e.w;
import com.waze.car_lib.r.fl;
import com.waze.nightmode.m;
import com.waze.search.stats.SearchStatsSender$SearchCategoryGroup;
import com.waze.search.stats.e;
import com.waze.search.stats.o;
import com.waze.search.stats.s;
import com.waze.strings.DisplayStrings;
import com.waze.t.c.g;
import com.waze.ui.ac.n;
import h.a.aj;
import h.a.i;
import h.g.a.l;
import h.g.b.x;
import h.k;
import java.util.Iterator;
import java.util.List;
import l.a.bjz;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.waze.ui.ac.i r22, androidx.compose.ui.Modifier r23, androidx.compose.ui.Modifier r24, androidx.compose.ui.graphics.Color r25, androidx.compose.ui.graphics.Color r26, androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.d.a.b.a(com.waze.ui.ac.i, androidx.compose.ui.Modifier, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Color, androidx.compose.ui.graphics.Color, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(Modifier modifier, com.waze.search.d.a.a.a aVar, h.g.a.a aVar2, Composer composer, int i2) {
        Modifier modifier2;
        int i3;
        x.f(aVar, "categoryGroupItem");
        x.f(aVar2, "onClick");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(297496897);
        if (i4 == 0) {
            modifier2 = modifier;
            i3 = (true != composerStartRestartGroup.changed(modifier2) ? 2 : 4) | i2;
        } else {
            modifier2 = modifier;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? composerStartRestartGroup.changed(aVar) : composerStartRestartGroup.changedInstance(aVar)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(297496897, i3, -1, "com.waze.search.emptystate.categories.CategoryChip (CategoriesChipList.kt:129)");
            }
            SurfaceKt.m4217SurfaceLPr_se0(aVar2, modifier2, false, RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(12.0f), com.waze.bz.a.d(composerStartRestartGroup, 0).M(), 0L, null, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1734852262, true, new com.waze.v.b(aVar, 8), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 817889280 | ((i3 << 3) & 112), DisplayStrings.DS_PD_MINUTES_AGO);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w(modifier, aVar, aVar2, i2, 16, null));
        }
    }

    public static final void c(Modifier modifier, List list, Composer composer, int i2) {
        int i3;
        float f2;
        x.f(list, "items");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1385170565);
        int i5 = 2;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(list) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(16.0f) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(16.0f) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1385170565, i3, -1, "com.waze.search.emptystate.categories.CategoriesChipList (CategoriesChipList.kt:59)");
            }
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            int i6 = 3;
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = DecayAnimationSpecKt.exponentialDecay$default(0.0f, 0.0f, 3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            DecayAnimationSpec decayAnimationSpec = (DecayAnimationSpec) objRememberedValue;
            boolean zChanged = composerStartRestartGroup.changed(decayAnimationSpec);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new d(decayAnimationSpec);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            d dVar = (d) objRememberedValue2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-7436673, 0, -1, "com.waze.search.emptystate.categories.sideGradientBrush (CategoriesChipList.kt:114)");
            }
            Brush brushM8176horizontalGradient8A3gB4$default = Brush.Companion.m8176horizontalGradient8A3gB4$default(Brush.Companion, new k[]{new k(Float.valueOf(0.0f), Color.m8218boximpl(com.waze.bz.a.d(composerStartRestartGroup, 0).h())), new k(Float.valueOf(1.0f), Color.m8218boximpl(Color.Companion.m8263getTransparent0d7_KjU()))}, 0.0f, Float.POSITIVE_INFINITY, 0, 8, (Object) null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Object[] objArr = new Object[0];
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new m(i5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableIntState mutableIntState = (MutableIntState) RememberSaveableKt.rememberSaveable(objArr, (h.g.a.a) objRememberedValue3, composerStartRestartGroup, 48);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Modifier modifierM2808height3ABfNKs = SizeKt.m2808height3ABfNKs(modifier, 72.0f);
            boolean zChanged2 = composerStartRestartGroup.changed(mutableIntState);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new fl(mutableIntState, i6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierM2808height3ABfNKs, (l) objRememberedValue4);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnSizeChanged);
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
            Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(SizeKt.m2827width3ABfNKs(Modifier.Companion, mutableIntState.getIntValue() / density.getDensity()), scrollStateRememberScrollState, false, dVar, false, 10, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m2440spacedBy0680j_4(8.0f), Alignment.Companion.getTop(), composerStartRestartGroup, 6);
            int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHorizontalScroll$default);
            h.g.a.a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1405212634);
            Iterator<Integer> it = i.n(list).iterator();
            while (it.hasNext()) {
                int iNextInt = ((aj) it).nextInt();
                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, null);
                if (iNextInt == 0) {
                    iNextInt = 0;
                    f2 = 16.0f;
                } else {
                    f2 = 0.0f;
                }
                Modifier modifierM2828widthInVpY3zN4 = SizeKt.m2828widthInVpY3zN4(SizeKt.wrapContentWidth$default(PaddingKt.m2759paddingqDBjuR0$default(modifierFillMaxHeight$default, f2, 0.0f, iNextInt == list.size() + (-1) ? 16.0f : 0.0f, 0.0f, 10, null), null, false, 3, null), 88.0f, 136.0f);
                com.waze.search.d.a.a.a aVar = (com.waze.search.d.a.a.a) list.get(iNextInt);
                com.waze.search.d.a.a.a aVar2 = (com.waze.search.d.a.a.a) list.get(iNextInt);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(aVar2);
                a aVarRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || aVarRememberedValue == Composer.Companion.getEmpty()) {
                    aVarRememberedValue = new a(aVar2);
                    composerStartRestartGroup.updateRememberedValue(aVarRememberedValue);
                }
                b(modifierM2828widthInVpY3zN4, aVar, (h.g.a.a) aVarRememberedValue, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            BoxKt.Box(boxScopeInstance.align(BackgroundKt.background$default(SizeKt.m2827width3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, null), 20.0f), brushM8176horizontalGradient8A3gB4$default, null, 0.0f, 6, null), Alignment.Companion.getCenterStart()), composerStartRestartGroup, 0);
            BoxKt.Box(boxScopeInstance.align(BackgroundKt.background$default(SizeKt.m2827width3ABfNKs(SizeKt.fillMaxHeight$default(ScaleKt.scale(Modifier.Companion, -1.0f, 1.0f), 0.0f, 1, null), 20.0f), brushM8176horizontalGradient8A3gB4$default, null, 0.0f, 6, null), Alignment.Companion.getCenterEnd()), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new g(modifier, list, i2, 18));
        }
    }

    public static final String d(n nVar, Composer composer, int i2) {
        x.f(nVar, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-550397655, i2, -1, "com.waze.search.model.evaluateString (SearchListItem.kt:19)");
        }
        String strO = com.waze.ui.a.l.o(nVar, composer, i2 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return strO;
    }

    public static final o e(String str, String str2) {
        String str3 = str;
        if (str3 != null && str3.length() != 0) {
            return o.f36080c;
        }
        String str4 = str2;
        return (str4 == null || str4.length() == 0) ? o.f36078a : o.f36079b;
    }

    public static s f() {
        return s.f36105a.a();
    }

    public static /* synthetic */ void i(s sVar, com.waze.search.stats.k kVar, SearchStatsSender$SearchCategoryGroup searchStatsSender$SearchCategoryGroup, Boolean bool, Long l2, Long l3, e eVar, bjz bjzVar, int i2) {
        if ((i2 & 2) != 0) {
            searchStatsSender$SearchCategoryGroup = null;
        }
        if ((i2 & 4) != 0) {
            bool = null;
        }
        if ((i2 & 8) != 0) {
            l2 = null;
        }
        if ((i2 & 16) != 0) {
            l3 = null;
        }
        if ((i2 & 32) != 0) {
            eVar = null;
        }
        sVar.n(kVar, searchStatsSender$SearchCategoryGroup, bool, l2, l3, eVar, bjzVar);
    }
}
