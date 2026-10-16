package com.waze.install;

import android.content.res.Configuration;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.waze.R;
import com.waze.asks.ax;
import com.waze.gas.GasNativeManager;
import com.waze.map.b.Cdo;
import com.waze.map.b.bg;
import com.waze.map.b.bh;
import com.waze.map.b.bi;
import com.waze.map.b.ca;
import com.waze.map.b.cr;
import com.waze.map.b.dn;
import com.waze.map.b.ea;
import com.waze.map.b.ec;
import com.waze.map.b.ed;
import com.waze.strings.DisplayStrings;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class ah {
    public /* synthetic */ ah(byte[] bArr) {
    }

    public static Object a(h.c.e eVar) {
        org.a.d.k.b bVarC = com.waze.web.r.k().a().c();
        int i2 = h.g.b.ar.f48106a;
        Object objD = kotlinx.coroutines.b.ai.d(kotlinx.coroutines.b.ai.Q(((InstallNativeManager) bVarC.a(new h.g.b.m(InstallNativeManager.class), null, null)).getGeoConfigReadyState(), new ag(null)), eVar);
        return objD == h.c.a.a.f48038a ? objD : h.ab.f48028a;
    }

    public static void b(com.waze.ui.ac.n nVar, com.waze.ui.ac.n nVar2, com.waze.ui.ac.n nVar3, h.g.a.a aVar, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(nVar, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(nVar2, "htmlBody");
        h.g.b.x.f(nVar3, "buttonText");
        h.g.b.x.f(aVar, "buttonOnClickListener");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1517121381);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composerStartRestartGroup.changed(nVar) : composerStartRestartGroup.changedInstance(nVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? composerStartRestartGroup.changed(nVar2) : composerStartRestartGroup.changedInstance(nVar2)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != ((i2 & 512) == 0 ? composerStartRestartGroup.changed(nVar3) : composerStartRestartGroup.changedInstance(nVar3)) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1517121381, i3, -1, "com.waze.location.LocationPermissionScreen (LocationPermissionScreen.kt:56)");
            }
            Modifier modifierPadding = PaddingKt.padding(WindowInsetsPaddingKt.windowInsetsPadding(BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), com.waze.bz.a.d(composerStartRestartGroup, 0).h(), null, 2, null), WindowInsets_androidKt.getSafeDrawing(WindowInsets.Companion, composerStartRestartGroup, 6)), ((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 2 ? PaddingKt.m2748PaddingValues0680j_4(16.0f) : PaddingKt.m2751PaddingValuesa9UjIt4(16.0f, 68.0f, 16.0f, 32.0f));
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierPadding);
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
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(ColumnScope.CC.weight$default(ColumnScopeInstance.INSTANCE, Modifier.Companion, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.location_permission, composerStartRestartGroup, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 124);
            TextKt.m4275Text4IGK_g(com.waze.ui.a.l.o(nVar, composerStartRestartGroup, i3 & 14), PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 16.0f, 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composerStartRestartGroup).f(), composerStartRestartGroup, 48, 0, 65532);
            composerStartRestartGroup = composerStartRestartGroup;
            c(com.waze.ui.a.l.o(nVar2, composerStartRestartGroup, (i3 >> 3) & 14), PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 12.0f, 0.0f, 0.0f, 13, null), composerStartRestartGroup, DisplayStrings.DS_DIRT_ROADS);
            composerStartRestartGroup.endNode();
            com.waze.design_components.g.b.h(aVar, com.waze.ui.a.l.o(nVar3, composerStartRestartGroup, (i3 >> 6) & 14), null, null, null, null, false, null, composerStartRestartGroup, (i3 >> 9) & 14, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_5);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.closure.d.b(nVar, nVar2, nVar3, aVar, i2, 7));
        }
    }

    public static void c(String str, Modifier modifier, Composer composer, int i2) {
        int i3;
        Modifier modifier2;
        h.g.b.x.f(str, "html");
        h.g.b.x.f(modifier, "modifier");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(509310311);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(str) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(16.0f) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(509310311, i3, -1, "com.waze.location.HtmlText (LocationPermissionScreen.kt:84)");
            }
            int i5 = i3 & DisplayStrings.DS_TAP_TO_VERIFY;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i5 == 256 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.z.a.d.d(20);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int i6 = i3 & 14;
            h.g.a.l lVar = (h.g.a.l) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (i6 == 4 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new ax(str, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            h.g.a.l lVar2 = (h.g.a.l) objRememberedValue2;
            modifier2 = modifier;
            AndroidView_androidKt.AndroidView(lVar, modifier2, lVar2, composerStartRestartGroup, i3 & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier2 = modifier;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.c.e.t(str, modifier2, i2, 13));
        }
    }

    public static /* synthetic */ void d(ed edVar, List list, List list2, List list3, ca caVar, dn dnVar, bh bhVar, int i2) {
        List listH = (i2 & 1) != 0 ? h.a.i.h() : list;
        List listH2 = (i2 & 2) != 0 ? h.a.i.h() : list2;
        List listH3 = (i2 & 4) != 0 ? h.a.i.h() : list3;
        byte[] bArr = null;
        List listH4 = (i2 & 8) != 0 ? h.a.i.h() : null;
        List listH5 = (i2 & 16) != 0 ? h.a.i.h() : null;
        ca caVar2 = (i2 & 32) != 0 ? new ca(false, null, false, null, null, 1023) : caVar;
        dn dnVar2 = (i2 & 64) != 0 ? new dn(bArr) : dnVar;
        bh bhVar2 = (i2 & 128) != 0 ? bh.f28073a : bhVar;
        h.g.b.x.f(edVar, "<this>");
        h.g.b.x.f(listH, "routes");
        h.g.b.x.f(listH2, "eventsOnRoute");
        h.g.b.x.f(listH3, "markers");
        h.g.b.x.f(listH4, "polylines");
        h.g.b.x.f(listH5, "polygons");
        h.g.b.x.f(caVar2, "additionalContent");
        h.g.b.x.f(dnVar2, "navigation");
        h.g.b.x.f(bhVar2, "scheme");
        edVar.b(new bi(listH, listH2, listH3, listH4, listH5, caVar2, dnVar2, bhVar2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.waze.shared_infra.s.c e(ed edVar, ec ecVar, com.waze.destination_cell.b.e eVar, boolean z, int i2) {
        Object[] objArr = 0;
        if ((i2 & 1) != 0) {
            ecVar = new ea(z, objArr == true ? 1 : 0, 3);
        }
        if ((i2 & 2) != 0) {
            eVar = cr.f28163a;
        }
        Cdo cdo = (i2 & 4) != 0 ? Cdo.f28213a : null;
        z = (i2 & 8) == 0;
        h.g.b.x.f(edVar, "<this>");
        h.g.b.x.f(ecVar, "viewport");
        h.g.b.x.f(eVar, "fit");
        h.g.b.x.f(cdo, "northLockBehavior");
        return edVar.a(new bg(ecVar, eVar, cdo, z & z));
    }

    private ah() {
        throw null;
    }
}
