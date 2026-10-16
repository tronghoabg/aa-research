package com.waze.ui.r.a.a;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.R;
import com.waze.reports.cx;
import com.waze.sound.gv;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.b.x;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t {
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ Bitmap a(MutableState mutableState) {
        return (Bitmap) mutableState.getValue();
    }

    public static final g d(com.waze.ui.ac.i iVar, Composer composer, int i2) {
        d dVarN;
        x.f(iVar, "imageSource");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-559215631, i2, -1, "com.waze.ui.mobile.infra.resources.rememberWazePainterState (WazePainter.kt:45)");
        }
        if (iVar instanceof com.waze.ui.ac.a) {
            composer.startReplaceGroup(585410249);
            int i3 = a.f43264a;
            dVarN = n(iVar, a.c(), composer, (i2 & 14) | 48);
            composer.endReplaceGroup();
        } else if (iVar instanceof com.waze.ui.ac.e) {
            composer.startReplaceGroup(585602139);
            d dVar = new d(PainterResources_androidKt.painterResource(((com.waze.ui.ac.e) iVar).a(), composer, 0));
            composer.endReplaceGroup();
            dVarN = dVar;
        } else if (iVar instanceof com.waze.ui.ac.f) {
            composer.startReplaceGroup(585719195);
            d dVar2 = new d(PainterResources_androidKt.painterResource(((com.waze.ui.ac.f) iVar).a(), composer, 0));
            composer.endReplaceGroup();
            dVarN = dVar2;
        } else if (iVar instanceof com.waze.ui.ac.g) {
            composer.startReplaceGroup(585833802);
            int i4 = a.f43264a;
            dVarN = n(iVar, a.a(), composer, (i2 & 14) | 48);
            composer.endReplaceGroup();
        } else {
            if (!(iVar instanceof com.waze.ui.ac.h)) {
                composer.startReplaceGroup(-535305955);
                composer.endReplaceGroup();
                throw new h.i();
            }
            composer.startReplaceGroup(586036015);
            int i5 = a.f43264a;
            dVarN = n(iVar, a.b(), composer, (i2 & 14) | 48);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return dVarN;
    }

    public static final Painter e(com.waze.ui.ac.i iVar, Integer num, Composer composer, int i2, int i3) {
        ColorPainter colorPainter;
        x.f(iVar, "imageSource");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-444964354, i2, -1, "com.waze.ui.mobile.infra.resources.wazePainter (WazePainter.kt:32)");
        }
        g gVarD = d(iVar, composer, i2 & 14);
        if (gVarD instanceof d) {
            composer.startReplaceGroup(1885993733);
            composer.endReplaceGroup();
            colorPainter = ((d) gVarD).a();
        } else {
            h.g.b.o oVar = null;
            if (x.n(gVarD, e.f43270a)) {
                composer.startReplaceGroup(-1663694507);
                composer.startReplaceGroup(-1663684061);
                composer.endReplaceGroup();
                colorPainter = new ColorPainter(Color.Companion.m8263getTransparent0d7_KjU(), oVar);
                composer.endReplaceGroup();
            } else if (x.n(gVarD, f.f43271a)) {
                if ((i3 & 2) != 0) {
                    num = null;
                }
                composer.startReplaceGroup(-1663581357);
                if (num == null) {
                    composer.startReplaceGroup(-1663568989);
                    composer.endReplaceGroup();
                    colorPainter = null;
                } else {
                    composer.startReplaceGroup(-1663568988);
                    colorPainter = PainterResources_androidKt.painterResource(num.intValue(), composer, 0);
                    composer.endReplaceGroup();
                }
                if (colorPainter == null) {
                    colorPainter = new ColorPainter(Color.Companion.m8263getTransparent0d7_KjU(), oVar);
                }
                composer.endReplaceGroup();
            } else {
                if (!x.n(gVarD, c.f43268a)) {
                    composer.startReplaceGroup(1885990582);
                    composer.endReplaceGroup();
                    throw new h.i();
                }
                composer.startReplaceGroup(1886002141);
                composer.endReplaceGroup();
                colorPainter = new ColorPainter(Color.Companion.m8263getTransparent0d7_KjU(), oVar);
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return colorPainter;
    }

    public static final void f(com.waze.ui.ab.o oVar, h.g.a.a aVar, Composer composer, int i2) {
        int i3;
        com.waze.ui.ac.f fVar;
        x.f(oVar, "state");
        x.f(aVar, "onClose");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-536336059);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(oVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-536336059, i3, -1, "com.waze.ui.trip_overview.RoutingMessageCard (RoutingMessageCard.kt:32)");
            }
            boolean zChanged = composerStartRestartGroup.changed(oVar.a().ordinal());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                com.waze.ui.ab.n nVarA = oVar.a();
                com.waze.ui.ab.n nVar = com.waze.ui.ab.n.f41750a;
                int iOrdinal = nVarA.ordinal();
                if (iOrdinal == 0) {
                    fVar = new com.waze.ui.ac.f(R.drawable.icon_tier3_no_entry_96px);
                } else {
                    if (iOrdinal != 1) {
                        throw new h.i();
                    }
                    fVar = new com.waze.ui.ac.f(R.drawable.icon_tier3_info_essential_96px);
                }
                objRememberedValue = fVar;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            com.waze.ui.ac.i iVar = (com.waze.ui.ac.i) objRememberedValue;
            com.waze.ui.q.h hVar = com.waze.ui.q.h.f43256a;
            String strB = oVar.b();
            Modifier modifierA = com.waze.ui.r.a.d.d.a(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 16.0f, 7, null), com.waze.ui.r.a.d.c.bC, null);
            int i5 = i3 & 112;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (i5 == 32 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.ui.x.p(aVar, 8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            com.waze.ui.q.g.d(hVar, strB, modifierA, null, iVar, (h.g.a.l) objRememberedValue2, composerStartRestartGroup, DisplayStrings.DS_CRISIS_RESPONSE_INFO, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.main_screen.a.b.a(oVar, aVar, i2, 2));
        }
    }

    public static final void g(com.waze.ui.ab.m mVar, h.g.a.a aVar, Composer composer, int i2) {
        int i3;
        int i4;
        String strB;
        String strB2;
        String strB3;
        x.f(mVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(aVar, "onClose");
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(521164927);
        if (i5 == 0) {
            i3 = (true != composerStartRestartGroup.changed(mVar.ordinal()) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(521164927, i3, -1, "com.waze.ui.trip_overview.PreferredRoutePopup (PreferredRoutePopup.kt:25)");
            }
            int iOrdinal = mVar.ordinal();
            if (iOrdinal == 0) {
                composerStartRestartGroup.startReplaceGroup(-1671673494);
                strB = com.waze.ui.r.a.c.c.b(R.string.TRIP_OVERVIEW_PREFERRED_ROUTE_IS_BEST_POPUP_TITLE_TEXT, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (iOrdinal != 1) {
                    composerStartRestartGroup.startReplaceGroup(-1671675402);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new h.i();
                }
                composerStartRestartGroup.startReplaceGroup(-1671669332);
                strB = com.waze.ui.r.a.c.c.b(R.string.TRIP_OVERVIEW_PREFERRED_ROUTE_IS_SLOWER_POPUP_TITLE_TEXT, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            int iOrdinal2 = mVar.ordinal();
            if (iOrdinal2 == 0) {
                composerStartRestartGroup.startReplaceGroup(-1671663991);
                strB2 = com.waze.ui.r.a.c.c.b(R.string.TRIP_OVERVIEW_PREFERRED_ROUTE_IS_BEST_POPUP_BODY_TEXT, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (iOrdinal2 != 1) {
                    composerStartRestartGroup.startReplaceGroup(-1671665900);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new h.i();
                }
                composerStartRestartGroup.startReplaceGroup(-1671659861);
                strB2 = com.waze.ui.r.a.c.c.b(R.string.TRIP_OVERVIEW_PREFERRED_ROUTE_IS_SLOWER_POPUP_BODY_TEXT, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            int iOrdinal3 = mVar.ordinal();
            if (iOrdinal3 == 0) {
                composerStartRestartGroup.startReplaceGroup(-1671654357);
                strB3 = com.waze.ui.r.a.c.c.b(R.string.TRIP_OVERVIEW_PREFERRED_ROUTE_IS_BEST_POPUP_BUTTON_TEXT, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (iOrdinal3 != 1) {
                    composerStartRestartGroup.startReplaceGroup(-1671656264);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new h.i();
                }
                composerStartRestartGroup.startReplaceGroup(-1671650163);
                strB3 = com.waze.ui.r.a.c.c.b(R.string.TRIP_OVERVIEW_PREFERRED_ROUTE_IS_SLOWER_POPUP_BUTTON_TEXT, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            com.waze.z.a.c.h hVar = new com.waze.z.a.c.h(new com.waze.ui.ac.f(R.drawable.icon_t3_usual_route_96px), ContentScale.Companion.getNone(), com.waze.z.a.c.i.f45844b, 12);
            com.waze.z.a.c.b bVar = new com.waze.z.a.c.b(new com.waze.z.a.c.d(strB3, com.waze.z.a.b.n.e(null, null, null, 7), false, null, 12));
            int i6 = i3 & 112;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i6 == 32 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.navigate.location_preview.x(aVar, 6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            com.waze.z.a.c.g gVar = (com.waze.z.a.c.g) objRememberedValue;
            Modifier modifierA = com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.co, null);
            com.waze.z.a.c.b bVar2 = bVar;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (i6 == 32 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new gv(aVar, 17);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            i4 = 1;
            com.waze.z.a.c.q.e(strB, bVar2, gVar, (h.g.a.a) objRememberedValue2, modifierA, hVar, null, ComposableLambdaKt.rememberComposableLambda(-1662424208, true, new com.waze.main_screen.o(strB2, 5), composerStartRestartGroup, 54), composerStartRestartGroup, 12607488, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i4 = 1;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.main_screen.a.b.a(mVar, aVar, i2, i4));
        }
    }

    static final ab k(com.waze.ui.ac.a aVar, cx cxVar, int i2, Composer composer) {
        o(aVar, cxVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab l(com.waze.ui.ac.g gVar, cx cxVar, int i2, Composer composer) {
        p(gVar, cxVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab m(com.waze.ui.ac.h hVar, cx cxVar, int i2, Composer composer) {
        q(hVar, cxVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final g n(com.waze.ui.ac.i iVar, h.g.a.r rVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1343031568, i2, -1, "com.waze.ui.mobile.infra.resources.painterWrapper (WazePainter.kt:80)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(f.f43271a, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new cx(mutableState);
            composer.updateRememberedValue(objRememberedValue2);
        }
        rVar.invoke(iVar, objRememberedValue2, composer, Integer.valueOf((i2 & 14) | (i2 & 8) | 48 | 384));
        g gVar = (g) mutableState.getValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(com.waze.ui.ac.a aVar, cx cxVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(221180862);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(aVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(cxVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(221180862, i3, -1, "com.waze.ui.mobile.infra.resources.FileImageLoader (WazePainter.kt:87)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            com.bumptech.glide.e.i iVarA = com.bumptech.glide.e.i.a();
            x.e(iVarA, "centerCropTransform(...)");
            k kVar = new k(cxVar);
            String strA = aVar.a();
            boolean zChangedInstance = ((i3 & 14) == 4) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(iVarA) | composerStartRestartGroup.changedInstance(kVar);
            boolean z = (i3 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | zChangedInstance) || objRememberedValue == Composer.Companion.getEmpty()) {
                h hVar = new h(context, aVar, iVarA, kVar, cxVar, 0);
                composerStartRestartGroup.updateRememberedValue(hVar);
                objRememberedValue = hVar;
            }
            EffectsKt.DisposableEffect(strA, (h.g.a.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new j(aVar, cxVar, i2, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(com.waze.ui.ac.g gVar, cx cxVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(638608242);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(gVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(cxVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(638608242, i3, -1, "com.waze.ui.mobile.infra.resources.UrlImageLoader (WazePainter.kt:130)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            com.bumptech.glide.e.i iVarA = com.bumptech.glide.e.i.a();
            x.e(iVarA, "centerCropTransform(...)");
            boolean z = true;
            m mVar = new m(cxVar);
            String strA = gVar.a();
            boolean zChangedInstance = ((i3 & 14) == 4) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(iVarA) | composerStartRestartGroup.changedInstance(mVar);
            if ((i3 & 112) != 32) {
                z = false;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance | z) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new h(context, gVar, iVarA, mVar, cxVar, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.DisposableEffect(strA, (h.g.a.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new j(gVar, cxVar, i2, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(com.waze.ui.ac.h hVar, cx cxVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1926741004);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(hVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(cxVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1926741004, i3, -1, "com.waze.ui.mobile.infra.resources.WazeResourceImageLoader (WazePainter.kt:171)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(h.c.k.f48060a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            af afVar = (af) objRememberedValue;
            q qVarG = com.waze.bz.a.g(composerStartRestartGroup);
            String strB = hVar.b();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(afVar) | composerStartRestartGroup.changedInstance(qVarG);
            boolean z = (i3 & 14) == 4;
            boolean z2 = (i3 & 112) == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if ((z | zChangedInstance | z2) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new i(afVar, qVarG, hVar, cxVar, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.DisposableEffect(strB, (h.g.a.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new j(hVar, cxVar, i2, 0));
        }
    }
}
