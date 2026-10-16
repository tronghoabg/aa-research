package com.waze.reports;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.waze.R;
import com.waze.gp;
import com.waze.jni.protos.VenueData;
import com.waze.mg;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ee {
    public static void a(ed edVar, String str) {
        if (str == null) {
            return;
        }
        if (str.equals("PARKING_LOT") && edVar.c() > 0) {
            com.waze.app_nav.hub.b.m.c().b(new com.waze.app_nav.hub.b.k("VenueDataWrapper", new gp(com.waze.shared_infra.o.b.a(), 18)));
        } else {
            VenueData.Builder builder = edVar.f33906b;
            if (builder.getCategoriesCount() != 30) {
                builder.addCategories(str);
            }
        }
    }

    public static final void b() {
        File[] fileArrListFiles = new File(com.waze.resources.h.d(mg.f29780a.a())).listFiles();
        if (fileArrListFiles != null) {
            ArrayList arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                String name = file.getName();
                h.g.b.x.e(name, "getName(...)");
                if (h.n.o.ah(name, "newPlaceImage.jpg")) {
                    arrayList.add(file);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
        }
    }

    public static final void c(com.waze.ui.p.i iVar, ab abVar, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(iVar, "mapState");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(526473697);
        if (i4 == 0) {
            i3 = i2 | (true != composerStartRestartGroup.changed(iVar) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(abVar == null ? -1 : abVar.ordinal()) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(526473697, i3, -1, "com.waze.reports.EditMapLocationScreenMap (EditMapLocationScreenMap.kt:45)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            com.waze.ui.p.t.b(iVar, SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), false, null, false, composerStartRestartGroup, (i3 & 14) | 48, 28);
            if (abVar == null) {
                composerStartRestartGroup.startReplaceGroup(-796279838);
            } else {
                composerStartRestartGroup.startReplaceGroup(-796279837);
                e(abVar, composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.t.c.g(iVar, abVar, i2, 15, null));
        }
    }

    static final h.ab d(ab abVar, int i2, Composer composer) {
        e(abVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    private static final void e(final ab abVar, Composer composer, final int i2) {
        int i3;
        BitmapPainter bitmapPainter;
        ColorPainter colorPainter;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1744397252);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(abVar.ordinal()) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1744397252, i3, -1, "com.waze.reports.CenterMarker (EditMapLocationScreenMap.kt:54)");
            }
            int iOrdinal = abVar.ordinal();
            if (iOrdinal == 0) {
                composerStartRestartGroup.startReplaceGroup(-1328509424);
                h.g.b.x.f("location_pin_big_floating.png", "wazeResId");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(183938854, 6, -1, "com.waze.ui.mobile.infra.resources.wazeResourcePainter (WazeResourcePainter.kt:18)");
                }
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                h.g.b.o oVar = null;
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                MutableState mutableState = (MutableState) objRememberedValue;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                MutableState mutableState2 = (MutableState) objRememberedValue2;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = EffectsKt.createCompositionCoroutineScope(h.c.k.f48060a, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) objRememberedValue3;
                com.waze.ui.r.a.a.q qVarG = com.waze.bz.a.g(composerStartRestartGroup);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(afVar) | composerStartRestartGroup.changedInstance(qVarG);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue4 == Composer.Companion.getEmpty()) {
                    com.waze.ui.r.a.a.i iVar = new com.waze.ui.r.a.a.i(afVar, qVarG, mutableState, mutableState2, 2);
                    composerStartRestartGroup.updateRememberedValue(iVar);
                    objRememberedValue4 = iVar;
                }
                EffectsKt.DisposableEffect("location_pin_big_floating.png", (h.g.a.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 6);
                ImageBitmap imageBitmap = (ImageBitmap) mutableState2.getValue();
                BitmapPainter bitmapPainter2 = imageBitmap != null ? new BitmapPainter(imageBitmap, 0L, 0L, 6, null) : null;
                if (bitmapPainter2 == null) {
                    composerStartRestartGroup.startReplaceGroup(-655021772);
                    composerStartRestartGroup.startReplaceGroup(-655021773);
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                    bitmapPainter = null;
                } else {
                    composerStartRestartGroup.startReplaceGroup(671605128);
                    composerStartRestartGroup.endReplaceGroup();
                    bitmapPainter = bitmapPainter2;
                }
                colorPainter = bitmapPainter == null ? new ColorPainter(Color.Companion.m8263getTransparent0d7_KjU(), oVar) : bitmapPainter;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else if (iOrdinal == 1 || iOrdinal == 2) {
                composerStartRestartGroup.startReplaceGroup(-1328506034);
                colorPainter = PainterResources_androidKt.painterResource(R.drawable.housenumber_pin_center, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (iOrdinal == 3) {
                composerStartRestartGroup.startReplaceGroup(-1328503604);
                colorPainter = PainterResources_androidKt.painterResource(R.drawable.housenumber_pin_left, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (iOrdinal != 4) {
                    composerStartRestartGroup.startReplaceGroup(-1328510373);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new h.i();
                }
                composerStartRestartGroup.startReplaceGroup(-1328501203);
                colorPainter = PainterResources_androidKt.painterResource(R.drawable.housenumber_pin_right, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            ImageKt.Image(colorPainter, (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.reports.aa
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return ee.d(abVar, i2, (Composer) obj);
                }
            });
        }
    }
}
