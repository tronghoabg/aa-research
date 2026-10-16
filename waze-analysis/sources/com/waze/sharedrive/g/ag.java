package com.waze.sharedrive.g;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import com.waze.R;
import com.waze.reports_v2.presentation.bq;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f38615a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final RoundedCornerShape f38616b = RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(12.0f);

    /* renamed from: c, reason: collision with root package name */
    private static final float f38617c = 8.0f;

    /* renamed from: d, reason: collision with root package name */
    private static final float f38618d = 48.0f;

    /* renamed from: e, reason: collision with root package name */
    private static final float f38619e = 4.0f;

    /* renamed from: f, reason: collision with root package name */
    private static final float f38620f = 110.0f;

    /* renamed from: g, reason: collision with root package name */
    private static final float f38621g = 24.0f;

    /* renamed from: h, reason: collision with root package name */
    private static final com.waze.ui.ac.f f38622h = new com.waze.ui.ac.f(R.drawable.happy);

    /* renamed from: i, reason: collision with root package name */
    private static final com.waze.z.a.s f38623i = com.waze.z.a.s.g(com.waze.z.a.s.f46181a, ContentScale.Companion.getCrop(), null, RoundedCornerShapeKt.getCircleShape(), 27);

    static final h.ab a(ah ahVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(82442913, i2, -1, "com.waze.sharedrive.ui.ParticipantPreviewCell.<anonymous> (MultipleParticipantsPreviewContent.kt:122)");
            }
            Modifier modifierM2757paddingVpY3zN4$default = PaddingKt.m2757paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), f38619e, 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), composer, 48);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM2757paddingVpY3zN4$default);
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
            Updater.m7351setimpl(composer, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            boolean zChanged = composer.changed(ahVar.b());
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                com.waze.ui.ac.f fVarB = ahVar.b();
                if (fVarB == null) {
                    fVarB = f38622h;
                }
                h.k kVar = new h.k(fVarB, Boolean.valueOf(!(fVarB instanceof com.waze.ui.ac.g)));
                composer.updateRememberedValue(kVar);
                objRememberedValue = kVar;
            }
            h.k kVar2 = (h.k) objRememberedValue;
            com.waze.z.a.be.e((com.waze.ui.ac.i) kVar2.a(), PaddingKt.m2755padding3ABfNKs(com.waze.ui.r.a.d.d.a(BackgroundKt.m1971backgroundbw27NRU(SizeKt.m2822size3ABfNKs(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 12.0f, 0.0f, 8.0f, 5, null), f38618d), com.waze.bz.a.d(composer, 0).M(), RoundedCornerShapeKt.getCircleShape()), com.waze.ui.r.a.d.c.dw, null), true == ((Boolean) kVar2.b()).booleanValue() ? 8.0f : 0.0f), f38623i, null, null, composer, 384, 24);
            Modifier modifierA = com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.dx, null);
            String strD = ahVar.d();
            if (strD == null) {
                composer.startReplaceGroup(-1375529787);
                strD = com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_PREVIEW_DEFAULT_USER_NAME, composer, 0);
            } else {
                composer.startReplaceGroup(-1375530190);
            }
            composer.endReplaceGroup();
            TextKt.m4275Text4IGK_g(strD, modifierA, com.waze.bz.a.d(composer, 0).o(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m11004boximpl(TextAlign.Companion.m11011getCentere0LSkKk()), 0L, TextOverflow.Companion.m11069getEllipsisgIe3tQ8(), false, 1, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer).j(), composer, 48, DisplayStrings.DS_AAOS_PRIVACY_SETTINGS_DELETE_RECENT_DESTINATION_MESSAGE, 54776);
            TextKt.m4275Text4IGK_g(bf.f(ahVar.a(), true, composer), com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.dy, null), com.waze.bz.a.d(composer, 0).q(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m11004boximpl(TextAlign.Companion.m11011getCentere0LSkKk()), 0L, TextOverflow.Companion.m11069getEllipsisgIe3tQ8(), false, 1, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer).c(), composer, 48, DisplayStrings.DS_AAOS_PRIVACY_SETTINGS_DELETE_RECENT_DESTINATION_MESSAGE, 54776);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    static final h.ab b(ah ahVar, Modifier modifier, int i2, Composer composer) {
        e(ahVar, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    public static final void c(ai aiVar, Modifier modifier, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(aiVar, "participants");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-74755876);
        if (i4 == 0) {
            i3 = i2 | (true != composerStartRestartGroup.changed(aiVar) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-74755876, i3, -1, "com.waze.sharedrive.ui.ParticipantsRow (MultipleParticipantsPreviewContent.kt:48)");
            }
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            Modifier modifierM2808height3ABfNKs = SizeKt.m2808height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), f38620f);
            boolean zChanged = composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.bk.f(lazyListStateRememberLazyListState, 20);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            h.g.a.a aVar = (h.g.a.a) objRememberedValue;
            boolean zChanged2 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new bq(lazyListStateRememberLazyListState, 8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierDrawWithCache = DrawModifierKt.drawWithCache(modifierM2808height3ABfNKs, new ab(f38621g, com.waze.bz.a.d(composerStartRestartGroup, 0).h(), aVar, (h.g.a.a) objRememberedValue2, 0));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM2440spacedBy0680j_4 = Arrangement.INSTANCE.m2440spacedBy0680j_4(f38617c);
            PaddingValues paddingValuesM2750PaddingValuesYgX7TsA$default = PaddingKt.m2750PaddingValuesYgX7TsA$default(16.0f, 0.0f, 2, null);
            Arrangement.HorizontalOrVertical horizontalOrVertical = horizontalOrVerticalM2440spacedBy0680j_4;
            int i5 = i3 & 14;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (i5 == 4 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new com.waze.r.d(aiVar, 13);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            LazyDslKt.LazyRow(modifierDrawWithCache, lazyListStateRememberLazyListState, paddingValuesM2750PaddingValuesYgX7TsA$default, false, horizontalOrVertical, null, null, false, null, (h.g.a.l) objRememberedValue3, composerStartRestartGroup, 24960, DisplayStrings.DS_REPORT_MENU_V2_GAS_REPORT_LABEL);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.copilot.presentation.c(aiVar, modifier, i2, 6, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final ah ahVar, Modifier modifier, Composer composer, int i2) {
        int i3;
        int i4;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1060891547);
        if (i5 == 0) {
            i3 = (true != composerStartRestartGroup.changed(ahVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1060891547, i3, -1, "com.waze.sharedrive.ui.ParticipantPreviewCell (MultipleParticipantsPreviewContent.kt:115)");
            }
            i4 = 2;
            SurfaceKt.m4216SurfaceFjzlyU(SizeKt.m2822size3ABfNKs(modifier, f38620f), f38616b, com.waze.bz.a.d(composerStartRestartGroup, 0).h(), 0L, BorderStrokeKt.m1998BorderStrokecXLIe8U(1.0f, com.waze.bz.a.d(composerStartRestartGroup, 0).y()), 0.0f, ComposableLambdaKt.rememberComposableLambda(82442913, true, new h.g.a.p() { // from class: com.waze.sharedrive.g.ad
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ag.a(ahVar, (Composer) obj, iIntValue);
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572912, 40);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i4 = 2;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new v(ahVar, modifier, i2, i4));
        }
    }
}
