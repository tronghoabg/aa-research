package com.waze.search.v2;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
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
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.util.WavUtil;
import androidx.media3.muxer.MuxerUtil;
import com.waze.R;
import com.waze.strings.DisplayStrings;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cu {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f36302a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final float f36303b = 80.0f;

    /* renamed from: c, reason: collision with root package name */
    private static final float f36304c = 8.0f;

    /* renamed from: d, reason: collision with root package name */
    private static final float f36305d = 12.0f;

    /* renamed from: e, reason: collision with root package name */
    private static final float f36306e = 132.0f;

    /* renamed from: f, reason: collision with root package name */
    private static final float f36307f = 4.0f;

    static {
        int i2 = com.waze.ui.h.f42379a;
    }

    public static final float a() {
        return f36306e;
    }

    static final h.ab b(Context context, String str, h.g.a.l lVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2126298468, i2, -1, "com.waze.search.v2.LegalPopup.<anonymous> (SearchV2.kt:761)");
            }
            TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.SEARCH_LEGAL_POPUP_BODY, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer).a(), composer, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            String strB = com.waze.ui.r.a.c.c.b(R.string.SEARCH_LEGAL_POPUP_BUTTON_MORE, composer, 0);
            long jG = com.waze.bz.a.d(composer, 0).G();
            TextDecoration underline = TextDecoration.Companion.getUnderline();
            TextStyle textStyleA = com.waze.bz.a.h(composer).a();
            Modifier.Companion companion = Modifier.Companion;
            float f2 = f36304c;
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(companion, 0.0f, f2, 0.0f, f2, 5, null);
            boolean zChangedInstance = composer.changedInstance(context) | composer.changed(str) | composer.changed(lVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.nav_connect.b.ab(context, str, lVar, 4);
                composer.updateRememberedValue(objRememberedValue);
            }
            TextKt.m4275Text4IGK_g(strB, com.waze.z.a.be.J(modifierM2759paddingqDBjuR0$default, false, null, (h.g.a.a) objRememberedValue, composer, 6, 15), jG, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, underline, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, textStyleA, composer, 100663296, 0, 65272);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    public static final void c(final int i2, final String str, final boolean z, boolean z2, Composer composer, final int i3, final int i4) {
        int i5;
        boolean z3 = z2;
        int i6 = i3 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-325045527);
        if (i6 == 0) {
            i5 = (true != composerStartRestartGroup.changed(i2) ? 2 : 4) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true != composerStartRestartGroup.changed(str) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i5 |= true != composerStartRestartGroup.changed(z) ? 128 : 256;
        }
        int i7 = i4 & 8;
        boolean z4 = i7 == 0;
        if (i7 != 0) {
            i5 |= DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS;
        } else if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i5 |= true != composerStartRestartGroup.changed(z3) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i5 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i5 & 1)) {
            z3 &= z4;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-325045527, i5, -1, "com.waze.search.v2.ErrorContent (SearchV2.kt:550)");
            }
            float f2 = ((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m2808height3ABfNKs(Modifier.Companion, ((((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 1 ? f2 * 0.5f : f2 - 56.0f) - f36303b) - (z ? 40.0f : 0.0f)), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterHorizontally(), composerStartRestartGroup, 54);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            com.waze.z.a.be.e(new com.waze.ui.ac.f(R.drawable.no_search_results), SizeKt.m2822size3ABfNKs(Modifier.Companion, 90.0f), null, null, null, composerStartRestartGroup, 0, 28);
            TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(i2, composerStartRestartGroup, i5 & 14), PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 16.0f, 0.0f, 0.0f, 13, null), com.waze.bz.a.d(composerStartRestartGroup, 0).o(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composerStartRestartGroup).j(), composerStartRestartGroup, 48, 0, 65528);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.startReplaceGroup(-1472284625);
            composerStartRestartGroup.endReplaceGroup();
            if (z3) {
                composerStartRestartGroup.startReplaceGroup(-1472253687);
                SpacerKt.Spacer(SizeKt.m2808height3ABfNKs(Modifier.Companion, 48.0f), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1472186417);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final boolean z5 = z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.search.v2.cp
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    int i8 = i2;
                    String str2 = str;
                    int i9 = i3;
                    cu.c(i8, str2, z, z5, composer2, RecomposeScopeImplKt.updateChangedFlags(i9 | 1), i4);
                    return h.ab.f48028a;
                }
            });
        }
    }

    public static final void d(com.waze.ui.m.dl dlVar, h.g.a.l lVar, kotlinx.coroutines.b.bm bmVar, float f2, h.g.a.l lVar2, Composer composer, int i2) {
        int i3;
        float f3;
        h.g.b.x.f(dlVar, "state");
        h.g.b.x.f(lVar, "handleEvent");
        h.g.b.x.f(bmVar, "uiRequests");
        h.g.b.x.f(lVar2, "onHeaderUnderPortraitOverlayHeight");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-799140300);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composerStartRestartGroup.changed(dlVar) : composerStartRestartGroup.changedInstance(dlVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(bmVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            f3 = f2;
            i3 |= true != composerStartRestartGroup.changed(f3) ? 1024 : 2048;
        } else {
            f3 = f2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar2) ? 8192 : 16384;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-799140300, i3, -1, "com.waze.search.v2.LocationPreviewSheetContent (SearchV2.kt:192)");
            }
            float fM11178unboximpl = ((Dp) composerStartRestartGroup.consume(com.waze.ui.h.a())).m11178unboximpl();
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.nightmode.m(6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            h.g.a.a aVar = (h.g.a.a) objRememberedValue;
            boolean zChanged = ((i3 & 57344) == 16384) | composerStartRestartGroup.changed(fM11178unboximpl);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.map.canvas.g(lVar2, fM11178unboximpl, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            h.g.a.l lVar3 = (h.g.a.l) objRememberedValue2;
            boolean zChangedInstance = ((i3 & 112) == 32) | composerStartRestartGroup.changedInstance(bmVar);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new com.waze.authentication.as(lVar, bmVar, 15);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            com.waze.ui.m.dc.k(dlVar, aVar, lVar3, (h.g.a.l) objRememberedValue3, f3, composerStartRestartGroup, ((i3 << 3) & 57344) | (i3 & 14) | 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new cr(dlVar, lVar, bmVar, f2, lVar2, i2, 0));
        }
    }

    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    public static final void e(fn fnVar, h hVar, float f2, h.g.a.p pVar, h.g.a.l lVar, Composer composer, int i2) {
        boolean z;
        float fG;
        h.g.b.x.f(fnVar, "state");
        h.g.b.x.f(hVar, "safeDrawingVerticalPadding");
        h.g.b.x.f(pVar, "onItemPositioned");
        h.g.b.x.f(lVar, "handleEvent");
        int i3 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1793066940);
        ?? r15 = 1;
        int i4 = i3 == 0 ? (true != composerStartRestartGroup.changedInstance(fnVar) ? 2 : 4) | i2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(hVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changed(f2) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(lVar) ? 8192 : 16384;
        }
        int i5 = 0;
        if (composerStartRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1793066940, i4, -1, "com.waze.search.v2.ResultsContent (SearchV2.kt:497)");
            }
            int i6 = 0;
            for (Object obj : fnVar.a()) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    h.a.i.p();
                }
                int i8 = i5;
                com.waze.z.a.be.y((r) obj, null, null, ComposableLambdaKt.rememberComposableLambda(-799108414, r15, new com.waze.ui.m.ck(pVar, i6, lVar, (int) r15), composerStartRestartGroup, 54), composerStartRestartGroup, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 6);
                if (i6 != h.a.i.e(fnVar.a())) {
                    composerStartRestartGroup.startReplaceGroup(1367913627);
                    r(composerStartRestartGroup, i8);
                    composerStartRestartGroup.endReplaceGroup();
                    z = true;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1367964219);
                    z = true;
                    if (((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 1) {
                        composerStartRestartGroup.startReplaceGroup(1368343814);
                        fG = com.waze.z.a.be.G(hVar.b(), composerStartRestartGroup, i8) + com.waze.z.a.be.G(hVar.a(), composerStartRestartGroup, i8);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1368458204);
                        fG = com.waze.z.a.be.G(hVar.a(), composerStartRestartGroup, i8) + f2;
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    SpacerKt.Spacer(SizeKt.m2808height3ABfNKs(Modifier.Companion, fG), composerStartRestartGroup, i8);
                    composerStartRestartGroup.endReplaceGroup();
                }
                i5 = i8;
                i6 = i7;
                r15 = z;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new cr(fnVar, hVar, f2, pVar, lVar, i2, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(List list, h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        long jL;
        long jG;
        h.g.b.x.f(list, "chips");
        h.g.b.x.f(lVar, "handleEvent");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1975549178);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(list) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        int i5 = 32;
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        int i6 = 0;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1975549178, i3, -1, "com.waze.search.v2.SearchV2Chips (SearchV2.kt:673)");
            }
            RoundedCornerShape roundedCornerShapeM3086RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(24.0f);
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            if (list.isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(-348880760);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(127224108);
                Modifier modifierM2808height3ABfNKs = SizeKt.m2808height3ABfNKs(Modifier.Companion, 40.0f);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2808height3ABfNKs);
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
                Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(Modifier.Companion, scrollStateRememberScrollState, false, null, false, 14, null);
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
                float f2 = 16.0f;
                SpacerKt.Spacer(SizeKt.m2827width3ABfNKs(Modifier.Companion, 16.0f), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceGroup(-2056349504);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    n nVar = (n) it.next();
                    if (s(nVar)) {
                        composerStartRestartGroup.startReplaceGroup(-212247716);
                        jL = com.waze.bz.a.d(composerStartRestartGroup, i6).L();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-212248896);
                        jL = com.waze.bz.a.d(composerStartRestartGroup, i6).M();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if (s(nVar)) {
                        composerStartRestartGroup.startReplaceGroup(-212243456);
                        jG = com.waze.bz.a.d(composerStartRestartGroup, i6).G();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-212245024);
                        jG = com.waze.bz.a.d(composerStartRestartGroup, i6).o();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                    RoundedCornerShape roundedCornerShape = roundedCornerShapeM3086RoundedCornerShape0680j_4;
                    Modifier modifierClip = ClipKt.clip(BackgroundKt.m1971backgroundbw27NRU(Modifier.Companion, jL, roundedCornerShape), roundedCornerShape);
                    int i7 = (composerStartRestartGroup.changedInstance(nVar) ? 1 : 0) | ((i3 & 112) == i5 ? 1 : i6);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (i7 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new com.waze.car_lib.i.b.d(nVar, lVar, 13);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    BoxScopeInstance boxScopeInstance2 = boxScopeInstance;
                    Modifier modifierM2756paddingVpY3zN4 = PaddingKt.m2756paddingVpY3zN4(com.waze.z.a.be.J(modifierClip, false, null, (h.g.a.a) objRememberedValue, composerStartRestartGroup, 0, 15), f2, 10.0f);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
                    int iB3 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i6));
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2756paddingVpY3zN4);
                    h.g.a.a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Updater.m7351setimpl(composerStartRestartGroup, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB3), ComposeUiNode.Companion.getSetCompositeKeyHash());
                    Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                    Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    Composer composer2 = composerStartRestartGroup;
                    boolean z = i6;
                    long j2 = jG;
                    int i8 = i3;
                    RoundedCornerShape roundedCornerShape2 = roundedCornerShapeM3086RoundedCornerShape0680j_4;
                    TextKt.m4275Text4IGK_g(com.waze.ui.a.l.o(nVar.a(), composerStartRestartGroup, i6), (Modifier) null, j2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composerStartRestartGroup).j(), composer2, 0, 0, 65530);
                    composerStartRestartGroup = composer2;
                    com.waze.speech.k kVarD = nVar.d();
                    if (kVarD instanceof l) {
                        composerStartRestartGroup.startReplaceGroup(-1089629421);
                        p(j2, composerStartRestartGroup, z ? 1 : 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (kVarD instanceof k) {
                        composerStartRestartGroup.startReplaceGroup(-1089497392);
                        if (((k) nVar.d()).a() > 0) {
                            composerStartRestartGroup.startReplaceGroup(-1089457929);
                            SpacerKt.Spacer(SizeKt.m2827width3ABfNKs(Modifier.Companion, 5.0f), composerStartRestartGroup, 6);
                            Modifier modifierM1971backgroundbw27NRU = BackgroundKt.m1971backgroundbw27NRU(SizeKt.m2824sizeVpY3zN4(Modifier.Companion, 18.0f, 16.0f), com.waze.bz.a.d(composerStartRestartGroup, z ? 1 : 0).G(), RoundedCornerShapeKt.getCircleShape());
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), z);
                            int iB4 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, z ? 1 : 0));
                            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1971backgroundbw27NRU);
                            h.g.a.a<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor4);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB4), ComposeUiNode.Companion.getSetCompositeKeyHash());
                            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
                            TextKt.m4275Text4IGK_g(String.valueOf(((k) nVar.d()).a()), BoxScopeInstance.INSTANCE.align(Modifier.Companion, Alignment.Companion.getCenter()), com.waze.bz.a.d(composerStartRestartGroup, z ? 1 : 0).D(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composerStartRestartGroup).c(), composerStartRestartGroup, 0, 0, 65528);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1088837681);
                            p(j2, composerStartRestartGroup, z ? 1 : 0);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1088732622);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endNode();
                    boxScopeInstance = boxScopeInstance2;
                    i6 = z ? 1 : 0;
                    i5 = 32;
                    i3 = i8;
                    f2 = 16.0f;
                    roundedCornerShapeM3086RoundedCornerShape0680j_4 = roundedCornerShape2;
                }
                BoxScopeInstance boxScopeInstance3 = boxScopeInstance;
                composerStartRestartGroup.endReplaceGroup();
                SpacerKt.Spacer(SizeKt.m2827width3ABfNKs(Modifier.Companion, 16.0f), composerStartRestartGroup, 6);
                composerStartRestartGroup.endNode();
                com.waze.ui.l.bh.d(boxScopeInstance3.align(Modifier.Companion, Alignment.Companion.getCenterStart()), true, composerStartRestartGroup, 48);
                com.waze.ui.l.bh.d(boxScopeInstance3.align(Modifier.Companion, Alignment.Companion.getCenterEnd()), i6, composerStartRestartGroup, 48);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.t.c.g(list, lVar, i2, 19));
        }
    }

    public static final void g(final ColumnScope columnScope, final dt dtVar, final h hVar, final float f2, final h.g.a.l lVar, final h.g.a.l lVar2, Composer composer, final int i2) {
        int i3;
        float f3;
        h.g.b.x.f(columnScope, "$this$SearchV2ResultSheetContent");
        h.g.b.x.f(dtVar, "state");
        h.g.b.x.f(hVar, "safeDrawingVerticalPadding");
        h.g.b.x.f(lVar, "onHeaderHeight");
        h.g.b.x.f(lVar2, "handleEvent");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-257560834);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(columnScope) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(dtVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(hVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            f3 = f2;
            i3 |= true != composerStartRestartGroup.changed(f3) ? 1024 : 2048;
        } else {
            f3 = f2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar2) ? 65536 : 131072;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-257560834, i3, -1, "com.waze.search.v2.SearchV2ResultSheetContent (SearchV2.kt:151)");
            }
            composerStartRestartGroup.startReplaceGroup(1592150192);
            final float fMo2127toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo2127toPx0680j_4(((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp);
            composerStartRestartGroup.endReplaceGroup();
            final float fMo2127toPx0680j_42 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo2127toPx0680j_4(f36307f);
            int i5 = i3;
            fo foVarD = dtVar.d();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(dtVar) | composerStartRestartGroup.changed(fMo2127toPx0680j_4) | composerStartRestartGroup.changed(fMo2127toPx0680j_42);
            boolean z = (i5 & 458752) == 131072;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | zChangedInstance) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new h.g.a.p() { // from class: com.waze.search.v2.cl
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        List listA;
                        String strD;
                        int iIntValue = ((Integer) obj).intValue();
                        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj2;
                        int i6 = cu.f36302a;
                        h.g.b.x.f(layoutCoordinates, "item");
                        fo foVarD2 = dtVar.d();
                        fn fnVar = foVarD2 instanceof fn ? (fn) foVarD2 : null;
                        if (fnVar != null && (listA = fnVar.a()) != null) {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (LayoutCoordinatesKt.positionInWindow(layoutCoordinates) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
                            float fMo9743getSizeYbymL2g = ((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & layoutCoordinates.mo9743getSizeYbymL2g())) + fIntBitsToFloat;
                            if (fIntBitsToFloat > 0.0f) {
                                if (fMo9743getSizeYbymL2g <= fMo2127toPx0680j_4 + fMo2127toPx0680j_42) {
                                    r rVar = (r) h.a.i.S(listA, iIntValue);
                                    if (rVar == null || (strD = rVar.d()) == null) {
                                        strD = "";
                                    }
                                    lVar2.invoke(new al(iIntValue, strD));
                                }
                            }
                        }
                        return h.ab.f48028a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            t(columnScope, foVarD, hVar, f3, (h.g.a.p) objRememberedValue, lVar2, lVar, composerStartRestartGroup, ((i5 << 6) & 3670016) | (466830 & i5));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.search.v2.cm
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    ColumnScope columnScope2 = columnScope;
                    dt dtVar2 = dtVar;
                    h hVar2 = hVar;
                    float f4 = f2;
                    int i6 = i2;
                    cu.g(columnScope2, dtVar2, hVar2, f4, lVar, lVar2, composer2, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
                    return h.ab.f48028a;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0838  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x084c  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0864  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0909  */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v3, types: [int] */
    /* JADX WARN: Type inference failed for: r30v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(com.waze.search.v2.dt r34, com.waze.ui.m.dl r35, com.waze.search.v2.h r36, com.waze.search.v2.b r37, com.waze.search.v2.b r38, kotlinx.coroutines.b.bm r39, h.g.a.l r40, h.g.a.l r41, h.g.a.p r42, androidx.compose.runtime.Composer r43, int r44) {
        /*
            Method dump skipped, instructions count: 2357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.v2.cu.h(com.waze.search.v2.dt, com.waze.ui.m.dl, com.waze.search.v2.h, com.waze.search.v2.b, com.waze.search.v2.b, kotlinx.coroutines.b.bm, h.g.a.l, h.g.a.l, h.g.a.p, androidx.compose.runtime.Composer, int):void");
    }

    static final h.ab i(long j2, int i2, Composer composer) {
        p(j2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    public static final void j(Modifier modifier, boolean z, boolean z2, h.g.a.a aVar, h.g.a.a aVar2, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(aVar, "onRecenter");
        h.g.b.x.f(aVar2, "onSearchArea");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-852208278);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z2) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 8192 : 16384;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-852208278, i3, -1, "com.waze.search.v2.LandscapeMapOverlay (SearchV2.kt:405)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.Companion.getTop(), composerStartRestartGroup, 6);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i5 = com.waze.ui.r.f43259a;
            SpacerKt.Spacer(SizeKt.m2827width3ABfNKs(Modifier.Companion, 64.0f), composerStartRestartGroup, 0);
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            com.waze.ui.r.d(BoxScopeInstance.INSTANCE, z2, false, new com.waze.ui.ac.j(R.string.SEARCH_RESULTS_SEARCH_AREA), Alignment.Companion.getTopCenter(), 0.0f, 0.0f, 0.0f, aVar2, composerStartRestartGroup, ((i3 >> 3) & 112) | 221574 | ((i3 << 12) & 234881024));
            composerStartRestartGroup.endNode();
            Modifier modifierM2827width3ABfNKs = SizeKt.m2827width3ABfNKs(Modifier.Companion, 64.0f);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB3 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2827width3ABfNKs);
            h.g.a.a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
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
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB3), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            com.waze.ui.r.e(BoxScopeInstance.INSTANCE, z, 0.0f, aVar, composerStartRestartGroup, (i3 & 112) | DisplayStrings.DS_AAOS_SOUND_OFF | ((i3 << 3) & 57344));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.ui.z.ad(modifier, z, z2, aVar, aVar2, i2, 1));
        }
    }

    static final h.ab k(String str, h.g.a.l lVar, int i2, Composer composer) {
        q(str, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab l(ColumnScope columnScope, fo foVar, h hVar, float f2, h.g.a.p pVar, h.g.a.l lVar, h.g.a.l lVar2, int i2, Composer composer) {
        t(columnScope, foVar, hVar, f2, pVar, lVar, lVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    public static final void m(Modifier modifier, com.waze.ui.ac.n nVar, boolean z, h.g.a.l lVar, List list, Composer composer, int i2) {
        int i3;
        Object obj;
        h.g.b.x.f(lVar, "handleEvent");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(318310357);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? composerStartRestartGroup.changed(nVar) : composerStartRestartGroup.changedInstance(nVar)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(list) ? 8192 : 16384;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(318310357, i3, -1, "com.waze.search.v2.SearchV2HeaderLayout (SearchV2.kt:614)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(BackgroundKt.m1972backgroundbw27NRU$default(modifier, com.waze.bz.a.d(composerStartRestartGroup, 0).h(), null, 2, null), 0.0f, 1, null);
            int i5 = i3 & 7168;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            int i6 = 14;
            if (i5 == 2048 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.bi.a(lVar, i6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierJ = com.waze.z.a.be.J(modifierFillMaxWidth$default, false, null, (h.g.a.a) objRememberedValue, composerStartRestartGroup, 48, 14);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), composerStartRestartGroup, 48);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierJ);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 1) {
                composerStartRestartGroup.startReplaceGroup(-134688030);
                obj = null;
                com.waze.ui.h.d(PaddingKt.m2757paddingVpY3zN4$default(Modifier.Companion, 0.0f, 9.0f, 1, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                obj = null;
                composerStartRestartGroup.startReplaceGroup(-134617412);
                SpacerKt.Spacer(SizeKt.m2808height3ABfNKs(Modifier.Companion, 20.0f), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.startReplaceGroup(-134484856);
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, obj), 16.0f, 0.0f, 0.0f, 16.0f, 6, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 48);
            int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2759paddingqDBjuR0$default);
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
            int i7 = i3;
            TextKt.m4275Text4IGK_g(com.waze.ui.a.l.o(nVar, composerStartRestartGroup, (i3 >> 3) & 14), (Modifier) null, com.waze.bz.a.d(composerStartRestartGroup, 0).o(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m11004boximpl(TextAlign.Companion.m11016getStarte0LSkKk()), 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composerStartRestartGroup).f(), composerStartRestartGroup, 0, 0, 65018);
            composerStartRestartGroup = composerStartRestartGroup;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-1085099448);
                Painter painterPainterResource = PainterResources_androidKt.painterResource(com.waze.design_components.b.d.ag.b(), composerStartRestartGroup, 0);
                ColorFilter colorFilterM8269tintxETnrds$default = ColorFilter.Companion.m8269tintxETnrds$default(ColorFilter.Companion, com.waze.bz.a.d(composerStartRestartGroup, 0).o(), 0, 2, null);
                Modifier modifierM2758paddingqDBjuR0 = PaddingKt.m2758paddingqDBjuR0(SizeKt.m2822size3ABfNKs(Modifier.Companion, 30.0f), 4.0f, 8.0f, 4.0f, 4.0f);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (i5 == 2048 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new com.waze.bi.a(lVar, 15);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                ImageKt.Image(painterPainterResource, (String) null, com.waze.z.a.be.J(modifierM2758paddingqDBjuR0, false, null, (h.g.a.a) objRememberedValue2, composerStartRestartGroup, 0, 15), (Alignment) null, (ContentScale) null, 0.0f, colorFilterM8269tintxETnrds$default, composerStartRestartGroup, Painter.$stable | 48, 56);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1084503194);
                SpacerKt.Spacer(PaddingKt.m2759paddingqDBjuR0$default(SizeKt.m2808height3ABfNKs(Modifier.Companion, 30.0f), 0.0f, 8.0f, 0.0f, 4.0f, 5, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceGroup();
            if (list == null) {
                composerStartRestartGroup.startReplaceGroup(-133031236);
            } else {
                composerStartRestartGroup.startReplaceGroup(-133031235);
                f(list, lVar, composerStartRestartGroup, (i7 >> 6) & 112);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.l.h(modifier, nVar, z, lVar, list, i2, 6));
        }
    }

    static final h.ab n(int i2, Composer composer) {
        r(composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab o(BoxScope boxScope, Modifier modifier, a aVar, float f2, h.g.a.l lVar, int i2, Composer composer) {
        u(boxScope, modifier, aVar, f2, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    private static final void p(final long j2, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-918620093);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(j2) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-918620093, i3, -1, "com.waze.search.v2.ChipChevronImage (SearchV2.kt:734)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(com.waze.design_components.b.d.aq.b(), composerStartRestartGroup, 0), (String) null, SizeKt.m2822size3ABfNKs(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 10.0f, 0.0f, 0.0f, 0.0f, 14, null), 10.0f), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m8269tintxETnrds$default(ColorFilter.Companion, j2, 0, 2, null), composerStartRestartGroup, Painter.$stable | 48, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.search.v2.cq
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return cu.i(j2, i2, (Composer) obj);
                }
            });
        }
    }

    private static final void q(final String str, final h.g.a.l lVar, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(656391347);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(str) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(656391347, i3, -1, "com.waze.search.v2.LegalPopup (SearchV2.kt:746)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            String strB = com.waze.ui.r.a.c.c.b(R.string.SEARCH_LEGAL_POPUP_TITLE, composerStartRestartGroup, 0);
            com.waze.z.a.c.b bVar = new com.waze.z.a.c.b(new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.SEARCH_LEGAL_POPUP_BUTTON_OK, composerStartRestartGroup, 0), com.waze.z.a.b.n.e(null, null, null, 7), false, null, 12));
            int i5 = i3 & 112;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i5 == 32 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.navigate.location_preview.x(lVar, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            com.waze.z.a.c.g gVar = (com.waze.z.a.c.g) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (i5 == 32 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.bi.a(lVar, 13);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            com.waze.z.a.c.q.c(strB, bVar, gVar, (h.g.a.a) objRememberedValue2, null, ComposableLambdaKt.rememberComposableLambda(2126298468, true, new h.g.a.p() { // from class: com.waze.search.v2.cn
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return cu.b(context, str, lVar, (Composer) obj, iIntValue);
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 196608, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.search.v2.co
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return cu.k(str, lVar, i2, (Composer) obj);
                }
            });
        }
    }

    private static final void r(Composer composer, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(328286279);
        if (composerStartRestartGroup.shouldExecute(i2 != 0, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(328286279, i2, -1, "com.waze.search.v2.Separator (SearchV2.kt:535)");
            }
            BoxKt.Box(BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.m2808height3ABfNKs(Modifier.Companion, 1.0f), 0.0f, 1, null), com.waze.bz.a.d(composerStartRestartGroup, 0).K(), null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.search.v2.ct
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return cu.n(i2, (Composer) obj);
                }
            });
        }
    }

    private static final boolean s(n nVar) {
        if (nVar.d() instanceof m) {
            return false;
        }
        com.waze.speech.k kVarD = nVar.d();
        k kVar = kVarD instanceof k ? (k) kVarD : null;
        return kVar == null || kVar.a() != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void t(final androidx.compose.foundation.layout.ColumnScope r19, final com.waze.search.v2.fo r20, final com.waze.search.v2.h r21, final float r22, final h.g.a.p r23, final h.g.a.l r24, final h.g.a.l r25, androidx.compose.runtime.Composer r26, final int r27) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.v2.cu.t(androidx.compose.foundation.layout.ColumnScope, com.waze.search.v2.fo, com.waze.search.v2.h, float, h.g.a.p, h.g.a.l, h.g.a.l, androidx.compose.runtime.Composer, int):void");
    }

    private static final void u(BoxScope boxScope, Modifier modifier, a aVar, float f2, h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        float f3;
        Modifier modifier2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1000320391);
        int i5 = 1;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(boxScope) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        int i6 = i3 | 48;
        if ((i2 & 384) == 0) {
            i6 |= true != ((i2 & 512) == 0 ? composerStartRestartGroup.changed(aVar) : composerStartRestartGroup.changedInstance(aVar)) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            f3 = f2;
            i6 |= true != composerStartRestartGroup.changed(f3) ? 1024 : 2048;
        } else {
            f3 = f2;
        }
        if ((i2 & 24576) == 0) {
            i6 |= true != composerStartRestartGroup.changedInstance(lVar) ? 8192 : 16384;
        }
        if (composerStartRestartGroup.shouldExecute((i6 & 9363) != 9362, i6 & 1)) {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1000320391, i6, -1, "com.waze.search.v2.ActionButton (SearchV2.kt:784)");
            }
            float fMo2127toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo2127toPx0680j_4(1.0f);
            long jK = com.waze.bz.a.d(composerStartRestartGroup, 0).K();
            boolean z = ((i6 & DisplayStrings.DS_TAP_TO_VERIFY) == 256 || ((i6 & 512) != 0 && composerStartRestartGroup.changedInstance(aVar))) | ((57344 & i6) == 16384);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.car_lib.i.b.d(lVar, aVar, 12, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            h.g.a.a aVar2 = (h.g.a.a) objRememberedValue;
            String strO = com.waze.ui.a.l.o(aVar.a(), composerStartRestartGroup, 0);
            Modifier modifierM1972backgroundbw27NRU$default = BackgroundKt.m1972backgroundbw27NRU$default(boxScope.align(companion, Alignment.Companion.getBottomStart()), com.waze.bz.a.d(composerStartRestartGroup, 0).h(), null, 2, null);
            boolean zChanged = composerStartRestartGroup.changed(jK) | composerStartRestartGroup.changed(fMo2127toPx0680j_4);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.ui.m.ct(jK, fMo2127toPx0680j_4, i5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            com.waze.design_components.g.b.h(aVar2, strO, PaddingKt.m2755padding3ABfNKs(PaddingKt.m2759paddingqDBjuR0$default(DrawModifierKt.drawBehind(modifierM1972backgroundbw27NRU$default, (h.g.a.l) objRememberedValue2), 0.0f, 0.0f, 0.0f, f3, 7, null), 16.0f), null, null, null, false, null, composerStartRestartGroup, 0, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new cr(boxScope, modifier2, aVar, f2, lVar, i2, 2));
        }
    }
}
