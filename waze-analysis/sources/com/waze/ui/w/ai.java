package com.waze.ui.w;

import android.content.res.Configuration;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.AnchoredDraggableDefaults;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.DraggableAnchors;
import androidx.compose.foundation.gestures.DraggableAnchorsConfig;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import com.waze.R;
import com.waze.sound.gv;
import com.waze.strings.DisplayStrings;
import com.waze.ui.w.b.am;
import com.waze.ui.w.b.ao;
import com.waze.ui.w.b.ap;
import com.waze.ui.w.b.ar;
import com.waze.ui.w.b.av;
import com.waze.ui.w.b.aw;
import com.waze.ui.w.b.ax;
import com.waze.ui.w.b.ay;
import com.waze.ui.w.b.az;
import com.waze.ui.w.b.ba;
import com.waze.ui.w.b.bd;
import com.waze.uid.c.bb;
import com.waze.uid.c.bm;
import com.waze.z.a.as;
import com.waze.z.a.be;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class ai {
    public /* synthetic */ ai(byte[] bArr) {
    }

    private static void A(final ba baVar, final h.g.a.l lVar, final int i2, Composer composer, final int i3) {
        int i4;
        c cVarD;
        int i5 = i3 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(2007732505);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changedInstance(baVar) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changed(i2) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2007732505, i4, -1, "com.waze.ui.reports.MenuLayout (ReportsMenuLayout.kt:151)");
            }
            final com.waze.ui.x.u uVarL = baVar.l();
            final boolean z = ((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 2;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(990631865);
                cVarD = com.waze.ui.u.g.d(bd.f43641a, composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(990634232);
                cVarD = com.waze.ui.u.g.d(bd.f43642b, composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            }
            bd bdVarD = cVarD.d();
            boolean zChangedInstance = ((i4 & 112) == 32) | composerStartRestartGroup.changedInstance(cVarD);
            w wVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || wVarRememberedValue == Composer.Companion.getEmpty()) {
                wVarRememberedValue = new w(cVarD, lVar, (h.c.e) null, 1);
                composerStartRestartGroup.updateRememberedValue(wVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(bdVarD, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) wVarRememberedValue, composerStartRestartGroup, 0);
            final c cVar = cVarD;
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Alignment.Companion.getBottomCenter(), false, ComposableLambdaKt.rememberComposableLambda(-1248121725, true, new h.g.a.q() { // from class: com.waze.ui.w.o
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return ai.l(i2, cVar, lVar, baVar, uVarL, z, (BoxWithConstraintsScope) obj, (Composer) obj2, iIntValue);
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, DisplayStrings.DS_AAOS_ADDRESS_PREVIEW_PHONE_NUMBER, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.ui.w.p
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return ai.d(baVar, lVar, i2, i3, (Composer) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void B(final float f2, Composer composer, final int i2) {
        int i3 = i2 | 6;
        boolean z = (i3 & 3) != 2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-260256520);
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-260256520, i3, -1, "com.waze.ui.reports.BottomSheetDivider (ReportsMenuLayout.kt:511)");
            }
            DividerKt.m4060DivideroMI9zvI(AlphaKt.alpha(Modifier.Companion, 1.0f), com.waze.bz.a.d(composerStartRestartGroup, 0).y(), 0.0f, 0.0f, composerStartRestartGroup, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f2 = 1.0f;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.ui.w.m
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return ai.k(f2, i2, (Composer) obj);
                }
            });
        }
    }

    private static int C(com.waze.ui.x.u uVar) {
        return (uVar.a().size() + 2) / 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void D(final com.waze.ui.x.u uVar, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1680973993);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(uVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1680973993, i3, -1, "com.waze.ui.reports.SheetHeader (ReportsMenuLayout.kt:458)");
            }
            if (C(uVar) > 2) {
                composerStartRestartGroup.startReplaceGroup(1422547300);
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.icon_report_bottom_sheet_handle, composerStartRestartGroup, 0), (String) null, com.waze.ui.r.a.d.d.a(SizeKt.m2808height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 18.0f), com.waze.ui.r.a.d.c.bF, null), Alignment.Companion.getBottomCenter(), ContentScale.Companion.getNone(), 0.0f, ColorFilter.Companion.m8269tintxETnrds$default(ColorFilter.Companion, com.waze.bz.a.d(composerStartRestartGroup, 0).z(), 0, 2, null), composerStartRestartGroup, Painter.$stable | 28080, 32);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1422992708);
                SpacerKt.Spacer(SizeKt.m2808height3ABfNKs(Modifier.Companion, 18.0f), composerStartRestartGroup, 6);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.ui.w.r
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return ai.m(uVar, i2, (Composer) obj);
                }
            });
        }
    }

    static h.ab b(ColumnScope columnScope, List list, av avVar, boolean z, LazyGridState lazyGridState, av avVar2, boolean z2, boolean z3, h.g.a.l lVar, int i2, Composer composer) {
        z(columnScope, list, avVar, z, lazyGridState, avVar2, z2, z3, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static h.ab c(LazyGridItemScope lazyGridItemScope, av avVar, int i2, boolean z, boolean z2, boolean z3, boolean z4, h.g.a.l lVar, int i3, Composer composer) {
        w(lazyGridItemScope, avVar, i2, z, z2, z3, z4, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return h.ab.f48028a;
    }

    static h.ab d(ba baVar, h.g.a.l lVar, int i2, int i3, Composer composer) {
        A(baVar, lVar, i2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return h.ab.f48028a;
    }

    static h.ab e(String str, h.g.a.a aVar, int i2, Composer composer) {
        x(str, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static h.ab f(long j2, long j3, h.g.a.a aVar, h.g.a.a aVar2, int i2, Composer composer) {
        y(j2, j3, aVar, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static h.ab k(float f2, int i2, Composer composer) {
        B(f2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static h.ab l(int i2, c cVar, h.g.a.l lVar, ba baVar, com.waze.ui.x.u uVar, boolean z, BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, int i3) {
        int i4;
        boolean z2;
        Modifier modifierWrapContentSize$default;
        Modifier modifierM2808height3ABfNKs;
        boolean z3;
        int i5;
        String strB;
        boolean zC;
        boolean z4;
        Boolean boolValueOf;
        boolean z5;
        b bVar;
        boolean z6;
        float f2;
        int i6;
        int i7;
        h.g.b.x.f(boxWithConstraintsScope, "$this$BoxWithConstraints");
        if ((i3 & 6) == 0) {
            i4 = i3 | (true != composer.changed(boxWithConstraintsScope) ? 2 : 4);
        } else {
            i4 = i3;
        }
        if (composer.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1248121725, i4, -1, "com.waze.ui.reports.MenuLayout.<anonymous> (ReportsMenuLayout.kt:171)");
            }
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(h.c.k.f48060a, composer);
                composer.updateRememberedValue(objRememberedValue);
            }
            kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) objRememberedValue;
            final float fMo2127toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo2127toPx0680j_4(boxWithConstraintsScope.mo2468getMaxHeightD9Ej5fM());
            boolean zChanged = composer.changed(i2) | composer.changed(fMo2127toPx0680j_4);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf((fMo2127toPx0680j_4 / 2.0f) + i2);
                composer.updateRememberedValue(objRememberedValue2);
            }
            MutableFloatState mutableFloatState = (MutableFloatState) objRememberedValue2;
            Float fValueOf = Float.valueOf(cVar.a());
            boolean zChangedInstance = composer.changedInstance(cVar) | composer.changed(lVar) | composer.changed(fMo2127toPx0680j_4);
            v vVarRememberedValue = composer.rememberedValue();
            if (zChangedInstance || vVarRememberedValue == Composer.Companion.getEmpty()) {
                vVarRememberedValue = new v(cVar, lVar, fMo2127toPx0680j_4, null);
                composer.updateRememberedValue(vVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(fValueOf, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) vVarRememberedValue, composer, 0);
            boolean zChanged2 = composer.changed(baVar);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = Boolean.valueOf(C(baVar.l()) <= 2 && h.g.b.x.n(baVar.m(), ax.f43623a));
                composer.updateRememberedValue(objRememberedValue3);
            }
            boolean zBooleanValue = ((Boolean) objRememberedValue3).booleanValue();
            Modifier.Companion companion = Modifier.Companion;
            float fMo2468getMaxHeightD9Ej5fM = boxWithConstraintsScope.mo2468getMaxHeightD9Ej5fM();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1498072353, 6, -1, "com.waze.ui.reports.getContainingBoxModifier (ReportsMenuLayout.kt:443)");
            }
            if (zBooleanValue) {
                modifierWrapContentSize$default = SizeKt.fillMaxWidth$default(SizeKt.m2808height3ABfNKs(companion, fMo2468getMaxHeightD9Ej5fM), 0.0f, 1, null);
                z2 = false;
            } else {
                z2 = false;
                modifierWrapContentSize$default = SizeKt.wrapContentSize$default(companion, null, false, 3, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new com.waze.ui.o.ac(8);
                composer.updateRememberedValue(objRememberedValue4);
            }
            Modifier modifierJ = be.J(modifierWrapContentSize$default, false, null, (h.g.a.a) objRememberedValue4, composer, 197040, 12);
            int i8 = 9;
            if (zBooleanValue) {
                composer.startReplaceGroup(-1260836523);
                Modifier.Companion companion2 = Modifier.Companion;
                boolean zChanged3 = composer.changed(mutableFloatState) | composer.changed(i2);
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChanged3 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                    objRememberedValue5 = new com.waze.main_screen.p.m(i2, mutableFloatState, i8);
                    composer.updateRememberedValue(objRememberedValue5);
                }
                modifierM2808height3ABfNKs = OnRemeasuredModifierKt.onSizeChanged(companion2, (h.g.a.l) objRememberedValue5);
                composer.endReplaceGroup();
                z3 = true;
            } else {
                composer.startReplaceGroup(-1260727341);
                composer.endReplaceGroup();
                modifierM2808height3ABfNKs = SizeKt.m2808height3ABfNKs(Modifier.Companion, boxWithConstraintsScope.mo2468getMaxHeightD9Ej5fM());
                z3 = false;
            }
            if (ComposerKt.isTraceInProgress()) {
                i5 = 0;
                ComposerKt.traceEventStart(-893934207, 0, -1, "com.waze.ui.reports.getTitleString (ReportsMenuLayout.kt:452)");
            } else {
                i5 = 0;
            }
            boolean z7 = uVar instanceof ao;
            if (z7) {
                composer.startReplaceGroup(-77310696);
                strB = com.waze.ui.r.a.c.c.b(R.string.REPORT_MENU_V2_SHEET_TITLE, composer, i5);
                composer.endReplaceGroup();
            } else {
                if (!(uVar instanceof ap)) {
                    composer.startReplaceGroup(-77311991);
                    composer.endReplaceGroup();
                    throw new h.i();
                }
                composer.startReplaceGroup(-77308027);
                strB = com.waze.ui.r.a.c.c.b(((ap) uVar).b(), composer, i5);
                composer.endReplaceGroup();
            }
            String str = strB;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            LazyGridState lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(i5, i5, composer, i5, 3);
            com.waze.ui.j.h hVarM = baVar.m();
            aw awVar = hVarM instanceof aw ? (aw) hVarM : null;
            am amVarK = awVar != null ? awVar.k() : null;
            com.waze.ui.j.h hVarM2 = baVar.m();
            az azVar = hVarM2 instanceof az ? (az) hVarM2 : null;
            ar arVarK = azVar != null ? azVar.k() : null;
            com.waze.ui.j.h hVarM3 = baVar.m();
            if (h.g.b.x.n(hVarM3, ax.f43623a)) {
                zC = false;
            } else if (hVarM3 instanceof ay) {
                zC = ((ay) hVarM3).k().a();
            } else if (hVarM3 instanceof aw) {
                zC = ((aw) hVarM3).k().a();
            } else {
                if (!(hVarM3 instanceof az)) {
                    throw new h.i();
                }
                zC = ((az) hVarM3).k().c();
            }
            com.waze.ui.x.u uVarL = baVar.l();
            Modifier modifier = modifierM2808height3ABfNKs;
            ao aoVar = uVarL instanceof ao ? (ao) uVarL : null;
            boolean z8 = aoVar != null && aoVar.b();
            Boolean boolValueOf2 = amVarK != null ? Boolean.valueOf(amVarK.b()) : null;
            if (arVarK != null) {
                z4 = z8;
                boolValueOf = Boolean.valueOf(arVarK.b());
            } else {
                z4 = z8;
                boolValueOf = null;
            }
            boolean zChanged4 = composer.changed(boolValueOf) | composer.changed(boolValueOf2);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChanged4 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                if (amVarK != null) {
                    z5 = true;
                    if (amVarK.b()) {
                        bVar = b.f43561b;
                    }
                    objRememberedValue6 = bVar;
                    composer.updateRememberedValue(objRememberedValue6);
                } else {
                    z5 = true;
                }
                bVar = (arVarK == null || arVarK.b() != z5) ? b.f43560a : b.f43562c;
                objRememberedValue6 = bVar;
                composer.updateRememberedValue(objRememberedValue6);
            }
            b bVar2 = (b) objRememberedValue6;
            boolean zChanged5 = composer.changed(u(mutableFloatState)) | composer.changed(uVar) | composer.changed(bVar2.ordinal()) | composer.changed(fMo2127toPx0680j_4) | composer.changed(z) | composer.changed(zC) | composer.changed(z3);
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChanged5 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                float fU = u(mutableFloatState);
                if (z) {
                    f2 = fMo2127toPx0680j_4;
                } else if (z3) {
                    f2 = fMo2127toPx0680j_4 - fU;
                } else {
                    if (z7) {
                        b bVar3 = b.f43560a;
                        int iOrdinal = bVar2.ordinal();
                        z6 = true;
                        if (iOrdinal == 0) {
                            f2 = zC ? fMo2127toPx0680j_4 * 0.3f : fMo2127toPx0680j_4 / 2.0f;
                        } else if (iOrdinal == 1) {
                            f2 = fMo2127toPx0680j_4 - (fMo2127toPx0680j_4 * 0.3f);
                        } else {
                            if (iOrdinal != 2) {
                                throw new h.i();
                            }
                            f2 = fMo2127toPx0680j_4 * 0.75f;
                        }
                    } else {
                        z6 = true;
                        if (!(uVar instanceof ap)) {
                            throw new h.i();
                        }
                        f2 = fMo2127toPx0680j_4 - fU;
                    }
                    objRememberedValue7 = Float.valueOf(f2);
                    composer.updateRememberedValue(objRememberedValue7);
                }
                z6 = true;
                objRememberedValue7 = Float.valueOf(f2);
                composer.updateRememberedValue(objRememberedValue7);
            } else {
                z6 = true;
            }
            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Number) objRememberedValue7).floatValue(), AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null), 0.0f, "compactAnchorAnimation", null, composer, DisplayStrings.DS_AAOS_PRIVACY_SETTINGS_DELETE_RECENT_DESTINATION_MESSAGE, 20);
            Composer composer2 = composer;
            boolean zChanged6 = composer2.changed(((Number) stateAnimateFloatAsState.getValue()).floatValue()) | composer2.changed(z) | composer2.changed(fMo2127toPx0680j_4);
            Object objRememberedValue8 = composer2.rememberedValue();
            if (zChanged6 || objRememberedValue8 == Composer.Companion.getEmpty()) {
                final float fFloatValue = ((Number) stateAnimateFloatAsState.getValue()).floatValue();
                objRememberedValue8 = z ? AnchoredDraggableKt.DraggableAnchors(new com.waze.z.a.ah(fMo2127toPx0680j_4, 3)) : AnchoredDraggableKt.DraggableAnchors(new h.g.a.l() { // from class: com.waze.ui.w.q
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        DraggableAnchorsConfig draggableAnchorsConfig = (DraggableAnchorsConfig) obj;
                        h.g.b.x.f(draggableAnchorsConfig, "$this$DraggableAnchors");
                        draggableAnchorsConfig.at(bd.f43641a, 0.0f);
                        draggableAnchorsConfig.at(bd.f43642b, fFloatValue);
                        draggableAnchorsConfig.at(bd.f43643c, fMo2127toPx0680j_4);
                        return h.ab.f48028a;
                    }
                });
                composer2.updateRememberedValue(objRememberedValue8);
            }
            DraggableAnchors draggableAnchors = (DraggableAnchors) objRememberedValue8;
            boolean zChangedInstance2 = composer2.changedInstance(cVar) | composer2.changedInstance(draggableAnchors);
            w wVarRememberedValue = composer2.rememberedValue();
            if (zChangedInstance2 || wVarRememberedValue == Composer.Companion.getEmpty()) {
                i6 = 0;
                wVarRememberedValue = new w(cVar, draggableAnchors, (h.c.e) null, 0);
                composer2.updateRememberedValue(wVarRememberedValue);
            } else {
                i6 = 0;
            }
            EffectsKt.LaunchedEffect(draggableAnchors, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) wVarRememberedValue, composer2, i6);
            Object objRememberedValue9 = composer2.rememberedValue();
            if (objRememberedValue9 == Composer.Companion.getEmpty()) {
                objRememberedValue9 = SnapshotStateKt.derivedStateOf(new gv(lazyGridStateRememberLazyGridState, 6));
                composer2.updateRememberedValue(objRememberedValue9);
            }
            State state = (State) objRememberedValue9;
            State<Integer> stateAnimateIntAsState = AnimateAsStateKt.animateIntAsState(true != ((Boolean) state.getValue()).booleanValue() ? 20 : 0, null, "radiusAnimation", null, composer2, 384, 10);
            Object objRememberedValue10 = composer2.rememberedValue();
            if (objRememberedValue10 == Composer.Companion.getEmpty()) {
                i7 = 2;
                objRememberedValue10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer2.updateRememberedValue(objRememberedValue10);
            } else {
                i7 = 2;
            }
            MutableState mutableState = (MutableState) objRememberedValue10;
            Object objRememberedValue11 = composer2.rememberedValue();
            if (objRememberedValue11 == Composer.Companion.getEmpty()) {
                objRememberedValue11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, i7, null);
                composer2.updateRememberedValue(objRememberedValue11);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue11;
            RoundedCornerShape roundedCornerShapeM3088RoundedCornerShapea9UjIt4$default = RoundedCornerShapeKt.m3088RoundedCornerShapea9UjIt4$default(v(stateAnimateIntAsState), v(stateAnimateIntAsState), 0.0f, 0.0f, 12, null);
            composer2.startReplaceGroup(-422708412);
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
            Object objRememberedValue12 = composer2.rememberedValue();
            if (objRememberedValue12 == Composer.Companion.getEmpty()) {
                objRememberedValue12 = new g(cVar, scrollStateRememberScrollState);
                composer2.updateRememberedValue(objRememberedValue12);
            }
            g gVar = (g) objRememberedValue12;
            if (!Float.isNaN(cVar.a())) {
                Modifier modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(be.J(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), false, null, new ag(afVar, lVar, cVar), composer2, 54, 14), gVar, null, 2, null);
                boolean zChangedInstance3 = composer2.changedInstance(cVar);
                h hVarRememberedValue = composer2.rememberedValue();
                if (zChangedInstance3 || hVarRememberedValue == Composer.Companion.getEmpty()) {
                    hVarRememberedValue = new h(cVar);
                    composer2.updateRememberedValue(hVarRememberedValue);
                }
                SurfaceKt.m4216SurfaceFjzlyU(AnchoredDraggableKt.anchoredDraggable$default(OffsetKt.offset(modifierNestedScroll$default, (h.g.a.l) hVarRememberedValue), cVar.b(), Orientation.Vertical, false, null, null, AnchoredDraggableDefaults.INSTANCE.flingBehavior(cVar.b(), null, com.waze.z.a.aa.c(com.waze.z.a.x.f46210a), composer2, AnchoredDraggableDefaults.$stable << 9, 2), 28, null), roundedCornerShapeM3088RoundedCornerShapea9UjIt4$default, com.waze.bz.a.d(composer2, 0).h(), 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(115239808, true, new ah(uVar, z, cVar, modifierJ, modifier, str, lVar, baVar, z4, lazyGridStateRememberLazyGridState, afVar, state, mutableState, mutableState2), composer2, 54), composer2, 1572864, 56);
                composer2 = composer2;
            }
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    static h.ab m(com.waze.ui.x.u uVar, int i2, Composer composer) {
        D(uVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    public static /* synthetic */ void o(com.waze.uid.stats.s sVar, com.waze.uid.stats.b bVar, com.waze.uid.stats.c cVar, com.waze.uid.stats.a aVar, Long l2, int i2) {
        if (1 == (i2 & 1)) {
            bVar = null;
        }
        if ((i2 & 2) != 0) {
            cVar = null;
        }
        sVar.e(bVar, cVar, aVar, false, l2);
    }

    public static /* synthetic */ void p(com.waze.uid.stats.s sVar, com.waze.uid.stats.b bVar, com.waze.uid.stats.c cVar, Long l2, Boolean bool, int i2) {
        if (1 == (i2 & 1)) {
            bVar = null;
        }
        if ((i2 & 2) != 0) {
            cVar = null;
        }
        sVar.f(bVar, cVar, false, l2, bool);
    }

    public static /* synthetic */ void q(com.waze.uid.stats.s sVar, com.waze.uid.stats.q qVar, com.waze.uid.stats.b bVar, com.waze.uid.stats.c cVar, int i2) {
        if ((i2 & 8) != 0) {
            cVar = null;
        }
        sVar.B(null, qVar, bVar, cVar, false);
    }

    public static /* synthetic */ void r(com.waze.uid.stats.s sVar, Long l2, com.waze.uid.stats.b bVar, com.waze.uid.stats.c cVar, int i2) {
        if (1 == (i2 & 1)) {
            l2 = null;
        }
        if ((i2 & 4) != 0) {
            cVar = null;
        }
        sVar.C(l2, bVar, cVar, false);
    }

    public static bb s(com.waze.uid.state_impl.g.x xVar, com.waze.uid.e.e eVar) {
        h.g.b.x.f(xVar, "viewType");
        h.g.b.x.f(eVar, "dir");
        return new bb(bm.f44284e, new com.waze.uid.state_impl.g.w(xVar), eVar);
    }

    public static void t(com.waze.ui.k.q qVar, h.g.a.l lVar, int i2, Composer composer, int i3) {
        int i4;
        h.g.b.x.f(qVar, "state");
        h.g.b.x.f(lVar, "actions");
        int i5 = i3 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1180011713);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changedInstance(qVar) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changed(i2) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1180011713, i4, -1, "com.waze.ui.reports.ReportsMenuLayout (ReportsMenuLayout.kt:132)");
            }
            if (qVar instanceof com.waze.ui.w.b.bb) {
                composerStartRestartGroup.startReplaceGroup(-119884669);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(qVar instanceof ba)) {
                    composerStartRestartGroup.startReplaceGroup(-119886087);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new h.i();
                }
                composerStartRestartGroup.startReplaceGroup(578582084);
                A((ba) qVar, lVar, i2, composerStartRestartGroup, i4 & 1022);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.ui.d.l(qVar, lVar, i2, i3, 3));
        }
    }

    private static float u(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    private static int v(State state) {
        return ((Number) state.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void w(final LazyGridItemScope lazyGridItemScope, final av avVar, final int i2, final boolean z, final boolean z2, final boolean z3, final boolean z4, final h.g.a.l lVar, Composer composer, final int i3) {
        int i4;
        Composer composer2;
        int i5 = i3 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1880472002);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changed(lazyGridItemScope) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(avVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changed(i2) ? 128 : 256;
        }
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changed(z) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i4 |= true != composerStartRestartGroup.changed(z2) ? 8192 : 16384;
        }
        if ((196608 & i3) == 0) {
            i4 |= true != composerStartRestartGroup.changed(z3) ? 65536 : 131072;
        }
        if ((1572864 & i3) == 0) {
            i4 |= true != composerStartRestartGroup.changed(z4) ? 524288 : 1048576;
        }
        if ((12582912 & i3) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(lVar) ? 4194304 : 8388608;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i4) != 4793490, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1880472002, i4, -1, "com.waze.ui.reports.MenuItemLayout (ReportsMenuLayout.kt:616)");
            }
            TweenSpec tweenSpecTween$default = z4 ? AnimationSpecKt.tween$default(200, i2 * 50, null, 4, null) : AnimationSpecKt.tween$default(200, 0, null, 6, null);
            float f2 = 0.0f;
            if (true == z3) {
                f2 = 1.0f;
            }
            int i6 = i4;
            TweenSpec tweenSpec = tweenSpecTween$default;
            boolean z5 = true;
            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(f2, tweenSpec, 0.0f, "menuItemAlphaAnimation", null, composerStartRestartGroup, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 20);
            State<Float> stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(true != z3 ? 0.5f : 1.0f, tweenSpec, 0.0f, "gridItemScaleFactorAnimation", null, composerStartRestartGroup, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 20);
            float fFloatValue = z2 ? 1.0f : ((Number) stateAnimateFloatAsState.getValue()).floatValue();
            float fFloatValue2 = z2 ? 1.0f : ((Number) stateAnimateFloatAsState2.getValue()).floatValue();
            State<Float> stateAnimateFloatAsState3 = AnimateAsStateKt.animateFloatAsState(true != z ? 0.0f : 1.0f, null, 0.0f, "selectionIndicatorAlphaAnimation", null, composerStartRestartGroup, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 22);
            float f3 = true != z2 ? 0.0f : 1.0f;
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            Modifier modifierM8394graphicsLayer56HxDYs$default = GraphicsLayerModifierKt.m8394graphicsLayer56HxDYs$default(Modifier.Companion, fFloatValue2, fFloatValue2, fFloatValue, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, null, 1048568, null);
            int i7 = VisibilityThresholdsKt.f1650a;
            Modifier modifierM2757paddingVpY3zN4$default = PaddingKt.m2757paddingVpY3zN4$default(ZIndexModifierKt.zIndex(lazyGridItemScope.animateItem(modifierM8394graphicsLayer56HxDYs$default, null, AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m11287boximpl(InlineClassHelperKt.Uint64Low32), 1, null), null), f3), 0.0f, 12.0f, 1, null);
            if ((i6 & 29360128) != 8388608) {
                z5 = false;
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(avVar) | z5;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.ui.t(lVar, avVar, 13);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierA = com.waze.ui.r.a.d.d.a(SizeKt.wrapContentHeight$default(be.J(modifierM2757paddingVpY3zN4$default, false, null, (h.g.a.a) objRememberedValue, composerStartRestartGroup, 48, 14), null, false, 3, null), com.waze.ui.r.a.d.c.bI, Integer.valueOf(i2));
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
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
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Painter painterPainterResource = PainterResources_androidKt.painterResource(avVar.a(), composerStartRestartGroup, 0);
            Modifier modifierClip = ClipKt.clip(BackgroundKt.m1971backgroundbw27NRU(SizeKt.m2822size3ABfNKs(Modifier.Companion, 80.0f), com.waze.bz.a.d(composerStartRestartGroup, 0).M(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(avVar) | z5;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.ui.t(lVar, avVar, 14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ImageKt.Image(painterPainterResource, (String) null, com.waze.ui.r.a.d.d.a(PaddingKt.m2755padding3ABfNKs(be.J(modifierClip, false, null, (h.g.a.a) objRememberedValue2, composerStartRestartGroup, 0, 15), 8.0f), com.waze.ui.r.a.d.c.bK, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            SpacerKt.Spacer(BorderKt.m1983borderxT4_qwU(SizeKt.m2822size3ABfNKs(AlphaKt.alpha(Modifier.Companion, ((Number) stateAnimateFloatAsState3.getValue()).floatValue()), 80.0f), 2.0f, com.waze.bz.a.d(composerStartRestartGroup, 0).G(), RoundedCornerShapeKt.getCircleShape()), composerStartRestartGroup, 0);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.checkmark_outline_24px, composerStartRestartGroup, 0), (String) null, com.waze.ui.r.a.d.d.b(BackgroundKt.m1971backgroundbw27NRU(PaddingKt.m2755padding3ABfNKs(BackgroundKt.m1971backgroundbw27NRU(boxScopeInstance.align(SizeKt.m2822size3ABfNKs(AlphaKt.alpha(Modifier.Companion, ((Number) stateAnimateFloatAsState3.getValue()).floatValue()), 24.0f), Alignment.Companion.getTopEnd()), com.waze.bz.a.d(composerStartRestartGroup, 0).M(), RoundedCornerShapeKt.getCircleShape()), 2.0f), com.waze.bz.a.d(composerStartRestartGroup, 0).G(), RoundedCornerShapeKt.getCircleShape()), z ? com.waze.ui.r.a.d.c.bL : null), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m8269tintxETnrds$default(ColorFilter.Companion, com.waze.bz.a.d(composerStartRestartGroup, 0).M(), 0, 2, null), composerStartRestartGroup, Painter.$stable | 48, 56);
            composerStartRestartGroup.endNode();
            TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(avVar.b(), composerStartRestartGroup, 0), com.waze.ui.r.a.d.d.a(PaddingKt.m2758paddingqDBjuR0(Modifier.Companion, 0.0f, 8.0f, 0.0f, 0.0f), com.waze.ui.r.a.d.c.bJ, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m11004boximpl(TextAlign.Companion.m11011getCentere0LSkKk()), 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composerStartRestartGroup).n(), composerStartRestartGroup, 48, 0, 65020);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.ui.w.j
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return ai.c(lazyGridItemScope, avVar, i2, z, z2, z3, z4, lVar, i3, (Composer) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void x(final String str, final h.g.a.a aVar, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(2143957121);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(str) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        int i5 = i3;
        if (composerStartRestartGroup.shouldExecute((i5 & 19) != 18, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2143957121, i5, -1, "com.waze.ui.reports.SheetTitle (ReportsMenuLayout.kt:477)");
            }
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(Modifier.Companion, null, false, 3, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composerStartRestartGroup, 0);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWrapContentHeight$default);
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
            Modifier modifierWeight$default = RowScope.CC.weight$default(RowScopeInstance.INSTANCE, SizeKt.wrapContentHeight$default(Modifier.Companion, null, false, 3, null), 1.0f, false, 2, null);
            int i6 = a.f43517a;
            AnimatedContentKt.AnimatedContent(str, modifierWeight$default, null, null, "sheet_title_label_visibility", null, a.c(), composerStartRestartGroup, (i5 & 14) | 1597440, 44);
            Modifier modifierM2822size3ABfNKs = SizeKt.m2822size3ABfNKs(Modifier.Companion, 48.0f);
            int i7 = i5 & 112;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i7 == 32 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new gv(aVar, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierJ = be.J(modifierM2822size3ABfNKs, false, null, (h.g.a.a) objRememberedValue, composerStartRestartGroup, 6, 15);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierJ);
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
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.close_outline_24px, composerStartRestartGroup, 0), (String) null, com.waze.ui.r.a.d.d.a(BoxScopeInstance.INSTANCE.align(Modifier.Companion, Alignment.Companion.getCenter()), com.waze.ui.r.a.d.c.bH, null), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m8269tintxETnrds$default(ColorFilter.Companion, com.waze.bz.a.d(composerStartRestartGroup, 0).o(), 0, 2, null), composerStartRestartGroup, Painter.$stable | 48, 56);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.ui.w.n
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return ai.e(str, aVar, i2, (Composer) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(final long j2, final long j3, final h.g.a.a aVar, final h.g.a.a aVar2, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        int i4;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(207244339);
        if (i5 == 0) {
            i3 = (true != composerStartRestartGroup.changed(j2) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(j3) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(207244339, i3, -1, "com.waze.ui.reports.SubmenuButtons (ReportsMenuLayout.kt:572)");
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalM2440spacedBy0680j_4 = Arrangement.INSTANCE.m2440spacedBy0680j_4(8.0f);
            Modifier modifierM2755padding3ABfNKs = PaddingKt.m2755padding3ABfNKs(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), null, false, 3, null), 16.0f);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM2440spacedBy0680j_4, Alignment.Companion.getTop(), composerStartRestartGroup, 6);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2755padding3ABfNKs);
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
            String strB = com.waze.ui.r.a.c.c.b(R.string.REPORT_MENU_V2_REPORT_CANCEL_BUTTON, composerStartRestartGroup, 0);
            com.waze.z.a.ar arVarE = com.waze.z.a.b.n.e(com.waze.design_components.button.g.f23359b, null, null, 6);
            Modifier modifierA = com.waze.ui.r.a.d.d.a(RowScope.CC.weight$default(rowScopeInstance, SizeKt.wrapContentHeight$default(Modifier.Companion, null, false, 3, null), 1.0f, false, 2, null), com.waze.ui.r.a.d.c.bN, null);
            int i6 = i3 & DisplayStrings.DS_TAP_TO_VERIFY;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i6 == 256 || objRememberedValue == Composer.Companion.getEmpty()) {
                i4 = 3;
                objRememberedValue = new gv(aVar, i4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                i4 = 3;
            }
            be.o((h.g.a.a) objRememberedValue, modifierA, strB, null, arVarE, null, false, false, composerStartRestartGroup, 0, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_2W_4);
            String strB2 = com.waze.ui.r.a.c.c.b(R.string.REPORT_MENU_V2_REPORT_CONFIRM_BUTTON, composerStartRestartGroup, 0);
            as asVar = new as(j2, j3);
            Modifier modifierA2 = com.waze.ui.r.a.d.d.a(RowScope.CC.weight$default(rowScopeInstance, SizeKt.wrapContentHeight$default(Modifier.Companion, null, false, 3, null), 1.0f, false, 2, null), com.waze.ui.r.a.d.c.bM, null);
            int i7 = i3 & 7168;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (i7 == 2048 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new gv(aVar2, 4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composer2 = composerStartRestartGroup;
            be.o((h.g.a.a) objRememberedValue2, modifierA2, strB2, null, null, asVar, false, false, composer2, 0, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_7);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.ui.w.i
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return ai.f(j2, j3, aVar, aVar2, i2, (Composer) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void z(final ColumnScope columnScope, final List list, final av avVar, final boolean z, final LazyGridState lazyGridState, final av avVar2, final boolean z2, final boolean z3, final h.g.a.l lVar, Composer composer, final int i2) {
        ColumnScope columnScope2;
        int i3;
        LazyGridState lazyGridState2;
        Composer composer2;
        Object obj;
        Modifier modifierWrapContentHeight$default;
        int i4;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(680109123);
        if (i5 == 0) {
            columnScope2 = columnScope;
            i3 = (true != composerStartRestartGroup.changed(columnScope2) ? 2 : 4) | i2;
        } else {
            columnScope2 = columnScope;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(list) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(avVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            lazyGridState2 = lazyGridState;
            i3 |= true != composerStartRestartGroup.changed(lazyGridState2) ? 8192 : 16384;
        } else {
            lazyGridState2 = lazyGridState;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(avVar2) ? 65536 : 131072;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z2) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z3) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if (composerStartRestartGroup.shouldExecute((38347923 & i3) != 38347922, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(680109123, i3, -1, "com.waze.ui.reports.ItemsGrid (ReportsMenuLayout.kt:536)");
            }
            if (z) {
                obj = null;
                modifierWrapContentHeight$default = ColumnScope.CC.weight$default(columnScope2, SizeKt.m2808height3ABfNKs(Modifier.Companion, 0.0f), 1.0f, false, 2, null);
            } else {
                obj = null;
                modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(Modifier.Companion, null, false, 3, null);
            }
            Modifier modifierM2757paddingVpY3zN4$default = PaddingKt.m2757paddingVpY3zN4$default(modifierWrapContentHeight$default, 16.0f, 0.0f, 2, obj);
            GridCells.Fixed fixed = new GridCells.Fixed(3);
            Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list) | composerStartRestartGroup.changedInstance(avVar) | composerStartRestartGroup.changedInstance(avVar2);
            boolean z4 = (3670016 & i3) == 1048576;
            boolean z5 = (29360128 & i3) == 8388608;
            boolean z6 = (234881024 & i3) == 67108864;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (((zChangedInstance | z4 | z5) || z6) || objRememberedValue == Composer.Companion.getEmpty()) {
                i4 = i3;
                h.g.a.l lVar2 = new h.g.a.l() { // from class: com.waze.ui.w.k
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        LazyGridScope lazyGridScope = (LazyGridScope) obj2;
                        h.g.b.x.f(lazyGridScope, "$this$LazyVerticalGrid");
                        com.waze.ui.f.a aVar = new com.waze.ui.f.a(5);
                        List list2 = list;
                        lazyGridScope.items(list2.size(), new s(aVar, list2), null, new t(list2), ComposableLambdaKt.composableLambdaInstance(-1942245546, true, new u(list2, avVar, avVar2, z2, z3, lVar)));
                        return h.ab.f48028a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(lVar2);
                objRememberedValue = lVar2;
            } else {
                i4 = i3;
            }
            composer2 = composerStartRestartGroup;
            LazyGridDslKt.LazyVerticalGrid(fixed, modifierM2757paddingVpY3zN4$default, lazyGridState2, null, false, null, spaceEvenly, null, false, null, (h.g.a.l) objRememberedValue, composer2, ((i4 >> 6) & DisplayStrings.DS_TAP_TO_VERIFY) | 1572864, 0, 952);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.ui.w.l
                @Override // h.g.a.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    return ai.b(columnScope, list, avVar, z, lazyGridState, avVar2, z2, z3, lVar, i2, (Composer) obj2);
                }
            });
        }
    }

    private ai() {
        throw null;
    }
}
