package com.waze.o.d.b.b;

import android.content.Context;
import android.content.res.Configuration;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
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
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.R;
import com.waze.asks.ad;
import com.waze.bw.c.d.bo;
import com.waze.bw.c.d.cf;
import com.waze.bw.c.d.ct;
import com.waze.bw.c.d.v;
import com.waze.car_lib.r.co;
import com.waze.car_lib.r.cq;
import com.waze.car_lib.r.eh;
import com.waze.jni.protos.navigate.DriveTo;
import com.waze.main_screen.p.bf;
import com.waze.main_screen.t.al;
import com.waze.navigate.ax;
import com.waze.reports_v2.presentation.bq;
import com.waze.sharedrive.g.ap;
import com.waze.sharedui.web.ao;
import com.waze.strings.DisplayStrings;
import com.waze.ui.f.ak;
import com.waze.ui.g.t;
import com.waze.ui.r;
import com.waze.web.SimpleWebActivity;
import com.waze.z.a.b.n;
import com.waze.z.a.be;
import h.ab;
import h.g.a.l;
import h.g.a.q;
import h.g.b.x;
import h.k;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class b implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f32883a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32884b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f32885c;

    public /* synthetic */ b(h.g.a.a aVar, int i2) {
        this.f32885c = i2;
        this.f32883a = aVar;
        this.f32884b = "Done";
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlinx.coroutines.af] */
    /* JADX WARN: Type inference failed for: r0v22, types: [androidx.compose.foundation.layout.BoxScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [androidx.compose.foundation.layout.BoxScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r0v85, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v97, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v6, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v47, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v68, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v74, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlinx.coroutines.b.bm] */
    /* JADX WARN: Type inference failed for: r3v175, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v212, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v72, types: [androidx.compose.foundation.layout.RowScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v15, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        String str2;
        int i2 = 14;
        byte[] bArr = null;
        float f2 = 8.0f;
        switch (this.f32885c) {
            case 0:
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                x.f((AnimatedVisibilityScope) obj, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(339943911, iIntValue, -1, "com.waze.companinio.ui.mobile.overlay.CompaninioOverlay.<anonymous> (CompaninioOverlay.kt:24)");
                }
                Object obj4 = this.f32884b;
                boolean zChanged = composer.changed(obj4);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new ad(obj4, 12);
                    composer.updateRememberedValue(objRememberedValue);
                }
                h.g.a.a aVar = (h.g.a.a) objRememberedValue;
                boolean zChanged2 = composer.changed(obj4);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new ad(obj4, 13);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                co.d((ak) this.f32883a, aVar, (h.g.a.a) objRememberedValue2, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                break;
            case 1:
                Integer num = (Integer) obj;
                int iIntValue2 = num.intValue();
                Integer num2 = (Integer) obj2;
                int iIntValue3 = num2.intValue();
                List list = (List) obj3;
                x.f(list, "items");
                this.f32883a.c(new k(num, num2));
                ((eh) this.f32884b).g(list, iIntValue2, iIntValue3);
                break;
            case 2:
                break;
            case 3:
                RowScope rowScope = (RowScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                x.f(rowScope, "$this$WazeHeaderImpl");
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= true == composer2.changed(rowScope) ? 4 : 2;
                }
                if (composer2.shouldExecute((iIntValue4 & 19) != 18, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(710147926, iIntValue4, -1, "com.waze.design_components_compose.components.WazeHeader.<anonymous> (WazeHeader.kt:77)");
                    }
                    be.o(this.f32883a, PaddingKt.m2759paddingqDBjuR0$default(rowScope.align(SizeKt.wrapContentWidth$default(Modifier.Companion, null, false, 3, null), Alignment.Companion.getCenterVertically()), 0.0f, 0.0f, 4.0f, 0.0f, 11, null), (String) this.f32884b, null, n.e(com.waze.design_components.button.g.f23359b, com.waze.design_components.button.f.f23354b, null, 4), null, true, false, composer2, 0, 168);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            case 4:
                break;
            case 5:
                com.waze.app_nav.hub.b.e eVar = (com.waze.app_nav.hub.b.e) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                x.f(eVar, "$this$ComposablePopUp");
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= true == ((iIntValue5 & 8) == 0 ? composer3.changed(eVar) : composer3.changedInstance(eVar)) ? 4 : 2;
                }
                if (composer3.shouldExecute((iIntValue5 & 19) != 18, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(300236628, iIntValue5, -1, "com.waze.dialog.createSubmitLogsDialog.<anonymous>.<anonymous> (SubmitLogsDialog.kt:61)");
                    }
                    ActivityResultContracts.StartActivityForResult startActivityForResult = new ActivityResultContracts.StartActivityForResult();
                    Object objRememberedValue3 = composer3.rememberedValue();
                    if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = new com.waze.z.a.d.d(8);
                        composer3.updateRememberedValue(objRememberedValue3);
                    }
                    cq.k(false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1158818032, true, new com.waze.ab.c(eVar, (h.g.a.a) this.f32883a, ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult, (l) objRememberedValue3, composer3, 48), SimpleWebActivity.z((Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext()), com.waze.ui.r.a.c.c.b(R.string.HELP_CENTER, composer3, 0), (String) this.f32884b), 3), composer3, 54), composer3, 196608);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                break;
            case 6:
                Composer composer4 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                x.f((AnimatedVisibilityScope) obj, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2098279619, iIntValue6, -1, "com.waze.main_screen.mid_drive.LandscapeMainContent.<anonymous>.<anonymous> (MidDriveScreen.kt:796)");
                }
                Object obj5 = this.f32883a;
                Modifier modifierAlign = this.f32884b.align(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Alignment.Companion.getBottomStart());
                com.waze.main_screen.af.b.i iVarO = ((bf) obj5).o();
                Object objRememberedValue4 = composer4.rememberedValue();
                if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                    objRememberedValue4 = new com.waze.main_screen.l.a(5);
                    composer4.updateRememberedValue(objRememberedValue4);
                }
                com.waze.main_screen.af.b.h.a(iVarO, (l) objRememberedValue4, modifierAlign, composer4, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                break;
            case 7:
                Composer composer5 = (Composer) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                int i3 = al.f27484a;
                x.f((AnimatedVisibilityScope) obj, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(779941233, iIntValue7, -1, "com.waze.main_screen.pre_drive.PreDriveOverMapComponents.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PreDriveScreen.kt:1097)");
                }
                Object obj6 = this.f32883a;
                Modifier modifierAlign2 = this.f32884b.align(Modifier.Companion, Alignment.Companion.getTopStart());
                boolean zChanged3 = composer5.changed(obj6);
                Object objRememberedValue5 = composer5.rememberedValue();
                if (zChanged3 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                    objRememberedValue5 = new com.waze.car_lib.a.a(obj6, i2);
                    composer5.updateRememberedValue(objRememberedValue5);
                }
                be.w(modifierAlign2, (h.g.a.a) objRememberedValue5, composer5, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                break;
            case 8:
                Composer composer6 = (Composer) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                x.f((com.waze.app_nav.hub.b.e) obj, "$this$ComposablePopUp");
                if (composer6.shouldExecute((iIntValue8 & 17) != 16, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-809347110, iIntValue8, -1, "com.waze.nav_connect.presentation.NavConnectConsentStateHolderImpl.launchDialog.<anonymous>.<anonymous> (NavConnectConsentStateHolder.kt:176)");
                    }
                    cq.k(false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1557429098, true, new com.waze.v.a(this.f32883a, this.f32884b, 10, bArr), composer6, 54), composer6, 196608);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                break;
            case 9:
                int iIntValue9 = ((Integer) obj).intValue();
                int iIntValue10 = ((Integer) obj2).intValue();
                DriveTo.DangerZoneType dangerZoneType = (DriveTo.DangerZoneType) obj3;
                int i4 = ax.f31023a;
                x.f(dangerZoneType, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
                com.waze.shared_infra.h.c cVar = (com.waze.shared_infra.h.c) this.f32884b;
                if (cVar.d() == iIntValue9 && cVar.c() == iIntValue10) {
                    this.f32883a.a(dangerZoneType);
                }
                break;
            case 10:
                RowScope rowScope2 = (RowScope) obj;
                Composer composer7 = (Composer) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                x.f(rowScope2, "$this$WazeHeader");
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= true == composer7.changed(rowScope2) ? 4 : 2;
                }
                if (composer7.shouldExecute((iIntValue11 & 19) != 18, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(189490559, iIntValue11, -1, "com.waze.sharedui.web.WebPageHeaderLayout.<anonymous> (WazeWebViewPage.kt:154)");
                    }
                    Object obj7 = this.f32883a;
                    composer7.startReplaceGroup(1526355107);
                    composer7.endReplaceGroup();
                    if (((ao) this.f32884b).b()) {
                        int i5 = (iIntValue11 & 14) | 48;
                        composer7.startReplaceGroup(1526391656);
                        com.waze.design_components.b.d dVar = com.waze.design_components.b.d.n;
                        boolean zChanged4 = composer7.changed(obj7);
                        Object objRememberedValue6 = composer7.rememberedValue();
                        if (zChanged4 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                            objRememberedValue6 = new bq(obj7, 13);
                            composer7.updateRememberedValue(objRememberedValue6);
                        }
                        be.i(rowScope2, dVar, (h.g.a.a) objRememberedValue6, null, null, 0L, composer7, i5, 28);
                        composer7.endReplaceGroup();
                    } else {
                        composer7.startReplaceGroup(1526479107);
                        composer7.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                break;
            case 11:
                Composer composer8 = (Composer) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                x.f((LazyItemScope) obj, "$this$item");
                if (composer8.shouldExecute((iIntValue12 & 17) != 16, iIntValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(951183857, iIntValue12, -1, "com.waze.sound.presentation.VoiceGuidanceSheetContentLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VoiceGuidanceSheet.kt:150)");
                    }
                    com.waze.sound.e.h.d((String) this.f32884b, this.f32883a, composer8, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                break;
            case 12:
                Composer composer9 = (Composer) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                x.f((LazyItemScope) obj, "$this$item");
                if (composer9.shouldExecute((iIntValue13 & 17) != 16, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2038261724, iIntValue13, -1, "com.waze.startstate.mobile.ui.FavoritesCarousel.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FavoritesCarousel.kt:63)");
                    }
                    Object obj8 = this.f32884b;
                    SpacerKt.Spacer(SizeKt.m2822size3ABfNKs(Modifier.Companion, 16.0f), composer9, 6);
                    Modifier modifierA = com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.ao, null);
                    String strB = com.waze.ui.r.a.c.c.b(R.string.START_STATE_FAVORITE_CAROUSEL_HOME_ITEM_TITLE, composer9, 0);
                    bo boVar = (bo) obj8;
                    if (boVar.d() || !boVar.c()) {
                        composer9.startReplaceGroup(393165817);
                        composer9.endReplaceGroup();
                        str = null;
                    } else {
                        composer9.startReplaceGroup(-264414927);
                        String strB2 = com.waze.ui.r.a.c.c.b(R.string.START_STATE_FAVORITE_CAROUSEL_HOME_ITEM_SUBTITLE, composer9, 0);
                        composer9.endReplaceGroup();
                        str = strB2;
                    }
                    Object obj9 = this.f32883a;
                    com.waze.design_components.b.d dVar2 = com.waze.design_components.b.d.f23304e;
                    boolean zChanged5 = composer9.changed(obj8) | composer9.changed(obj9);
                    Object objRememberedValue7 = composer9.rememberedValue();
                    if (zChanged5 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                        objRememberedValue7 = new ap(obj8, obj9, i, bArr);
                        composer9.updateRememberedValue(objRememberedValue7);
                    }
                    h.g.a.a aVar2 = (h.g.a.a) objRememberedValue7;
                    boolean zChanged6 = composer9.changed(obj8) | composer9.changed(obj9);
                    Object objRememberedValue8 = composer9.rememberedValue();
                    if (zChanged6 || objRememberedValue8 == Composer.Companion.getEmpty()) {
                        objRememberedValue8 = new ap(obj8, obj9, 3, bArr);
                        composer9.updateRememberedValue(objRememberedValue8);
                    }
                    be.E(strB, dVar2, modifierA, str, aVar2, (h.g.a.a) objRememberedValue8, composer9, DisplayStrings.DS_DIRT_ROADS, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                break;
            case 13:
                Composer composer10 = (Composer) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                x.f((LazyItemScope) obj, "$this$item");
                if (composer10.shouldExecute((iIntValue14 & 17) != 16, iIntValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1946403493, iIntValue14, -1, "com.waze.startstate.mobile.ui.FavoritesCarousel.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FavoritesCarousel.kt:91)");
                    }
                    Object obj10 = this.f32884b;
                    SpacerKt.Spacer(SizeKt.m2822size3ABfNKs(Modifier.Companion, 8.0f), composer10, 6);
                    Modifier modifierA2 = com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.ap, null);
                    String strB3 = com.waze.ui.r.a.c.c.b(R.string.START_STATE_FAVORITE_CAROUSEL_WORK_ITEM_TITLE, composer10, 0);
                    bo boVar2 = (bo) obj10;
                    if (boVar2.e() || !boVar2.c()) {
                        composer10.startReplaceGroup(1047536162);
                        composer10.endReplaceGroup();
                        str2 = null;
                    } else {
                        composer10.startReplaceGroup(2111998440);
                        String strB4 = com.waze.ui.r.a.c.c.b(R.string.START_STATE_FAVORITE_CAROUSEL_WORK_ITEM_SUBTITLE, composer10, 0);
                        composer10.endReplaceGroup();
                        str2 = strB4;
                    }
                    Object obj11 = this.f32883a;
                    com.waze.design_components.b.d dVar3 = com.waze.design_components.b.d.f23309j;
                    boolean zChanged7 = composer10.changed(obj10) | composer10.changed(obj11);
                    Object objRememberedValue9 = composer10.rememberedValue();
                    if (zChanged7 || objRememberedValue9 == Composer.Companion.getEmpty()) {
                        objRememberedValue9 = new ap(obj10, obj11, 4, bArr);
                        composer10.updateRememberedValue(objRememberedValue9);
                    }
                    h.g.a.a aVar3 = (h.g.a.a) objRememberedValue9;
                    boolean zChanged8 = composer10.changed(obj10) | composer10.changed(obj11);
                    Object objRememberedValue10 = composer10.rememberedValue();
                    if (zChanged8 || objRememberedValue10 == Composer.Companion.getEmpty()) {
                        objRememberedValue10 = new ap(obj10, obj11, 5, bArr);
                        composer10.updateRememberedValue(objRememberedValue10);
                    }
                    be.E(strB3, dVar3, modifierA2, str2, aVar3, (h.g.a.a) objRememberedValue10, composer10, DisplayStrings.DS_DIRT_ROADS, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                break;
            case 14:
                Composer composer11 = (Composer) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                int i6 = ct.f18062a;
                x.f((LazyItemScope) obj, "$this$item");
                if (composer11.shouldExecute((iIntValue15 & 17) != 16, iIntValue15 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1874165950, iIntValue15, -1, "com.waze.startstate.mobile.ui.StartStateSheetContentLayout.<anonymous>.<anonymous>.<anonymous> (StartStateSheetContent.kt:352)");
                    }
                    v.A(((cf) this.f32883a).a(), a.a.q(this.f32884b), composer11, 0);
                    SpacerKt.Spacer(SizeKt.m2808height3ABfNKs(Modifier.Companion, 16.0f), composer11, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                break;
            case 15:
                Composer composer12 = (Composer) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                int i7 = r.f43259a;
                x.f((AnimatedVisibilityScope) obj, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2130250649, iIntValue16, -1, "com.waze.ui.OverlayTextButton.<anonymous> (MapOverlay.kt:116)");
                }
                Modifier modifierJ = be.J(BackgroundKt.m1971backgroundbw27NRU(com.waze.design_components.d.b.h(SizeKt.m2808height3ABfNKs(Modifier.Companion, 48.0f), RoundedCornerShapeKt.getCircleShape()), com.waze.bz.a.d(composer12, 0).h(), RoundedCornerShapeKt.getCircleShape()), false, null, this.f32883a, composer12, 0, 15);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer12, 0));
                CompositionLocalMap currentCompositionLocalMap = composer12.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer12, modifierJ);
                h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                if (!(composer12.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer12.startReusableNode();
                if (composer12.getInserting()) {
                    composer12.createNode(constructor);
                } else {
                    composer12.useNode();
                }
                Object obj12 = this.f32884b;
                Updater.m7351setimpl(composer12, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composer12, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Updater.m7351setimpl(composer12, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composer12, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composer12, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                TextKt.m4275Text4IGK_g(com.waze.ui.a.l.o((com.waze.ui.ac.n) obj12, composer12, 0), PaddingKt.m2759paddingqDBjuR0$default(BoxScopeInstance.INSTANCE.align(Modifier.Companion, Alignment.Companion.getCenter()), 16.0f, 0.0f, 16.0f, 0.0f, 10, null), com.waze.bz.a.d(composer12, 0).E(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composer12).h(), composer12, 0, 0, 65528);
                composer12.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                break;
            case 16:
                RowScope rowScope3 = (RowScope) obj;
                Composer composer13 = (Composer) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                x.f(rowScope3, "$this$WazeHeader");
                if ((iIntValue17 & 6) == 0) {
                    iIntValue17 |= true == composer13.changed(rowScope3) ? 4 : 2;
                }
                int i8 = iIntValue17;
                if (composer13.shouldExecute((i8 & 19) != 18, i8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(914183051, i8, -1, "com.waze.ui.copilot.CopilotHeaderLayout.<anonymous> (CopilotMarketplaceHeader.kt:48)");
                    }
                    Object obj13 = this.f32883a;
                    t tVar = (t) this.f32884b;
                    String strA = tVar.a();
                    if (strA == null || strA.length() == 0) {
                        composer13.startReplaceGroup(39806135);
                        composer13.endReplaceGroup();
                    } else {
                        int i9 = (i8 & 14) | 48;
                        composer13.startReplaceGroup(39700425);
                        com.waze.design_components.b.d dVar4 = com.waze.design_components.b.d.s;
                        boolean zChanged9 = composer13.changed(obj13);
                        Object objRememberedValue11 = composer13.rememberedValue();
                        if (zChanged9 || objRememberedValue11 == Composer.Companion.getEmpty()) {
                            objRememberedValue11 = new com.waze.sharedrive.c.r(obj13, 6);
                            composer13.updateRememberedValue(objRememberedValue11);
                        }
                        be.i(rowScope3, dVar4, (h.g.a.a) objRememberedValue11, null, null, 0L, composer13, i9, 28);
                        composer13.endReplaceGroup();
                    }
                    if (tVar.c()) {
                        int i10 = (i8 & 14) | 48;
                        composer13.startReplaceGroup(39843273);
                        com.waze.design_components.b.d dVar5 = com.waze.design_components.b.d.n;
                        boolean zChanged10 = composer13.changed(obj13);
                        Object objRememberedValue12 = composer13.rememberedValue();
                        if (zChanged10 || objRememberedValue12 == Composer.Companion.getEmpty()) {
                            objRememberedValue12 = new com.waze.sharedrive.c.r(obj13, 7);
                            composer13.updateRememberedValue(objRememberedValue12);
                        }
                        be.i(rowScope3, dVar5, (h.g.a.a) objRememberedValue12, null, null, 0L, composer13, i10, 28);
                        composer13.endReplaceGroup();
                    } else {
                        composer13.startReplaceGroup(39948983);
                        composer13.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                break;
            case 17:
                BoxWithConstraintsScope boxWithConstraintsScope = (BoxWithConstraintsScope) obj;
                Composer composer14 = (Composer) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                x.f(boxWithConstraintsScope, "$this$BoxWithConstraints");
                if ((iIntValue18 & 6) == 0) {
                    iIntValue18 |= true != composer14.changed(boxWithConstraintsScope) ? 2 : 4;
                }
                if (composer14.shouldExecute((iIntValue18 & 19) != 18, iIntValue18 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2085569172, iIntValue18, -1, "com.waze.ui.location_preview.ActionsLayoutPresent.<anonymous>.<anonymous> (LocationPreviewActionsBar.kt:67)");
                    }
                    ?? r3 = this.f32884b;
                    float fMo2469getMaxWidthD9Ej5fM = boxWithConstraintsScope.mo2469getMaxWidthD9Ej5fM() - 32.0f;
                    int size = r3.size() - 1;
                    float size2 = r3.size();
                    Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(PaddingKt.m2757paddingVpY3zN4$default(ScrollKt.horizontalScroll$default(Modifier.Companion, ScrollKt.rememberScrollState(0, composer14, 0, 1), false, null, false, 14, null), 16.0f, 0.0f, 2, null), 0.0f, 1, null), null, false, 3, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer14, 0);
                    int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer14, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer14.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer14, modifierWrapContentHeight$default);
                    h.g.a.a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                    if (!(composer14.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer14.startReusableNode();
                    if (composer14.getInserting()) {
                        composer14.createNode(constructor2);
                    } else {
                        composer14.useNode();
                    }
                    Updater.m7351setimpl(composer14, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m7351setimpl(composer14, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Updater.m7351setimpl(composer14, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
                    Updater.m7349reconcileimpl(composer14, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                    Updater.m7351setimpl(composer14, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    composer14.startReplaceGroup(-1122824875);
                    int i11 = 0;
                    for (Object obj14 : (Iterable) r3) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            h.a.i.p();
                        }
                        com.waze.ui.k.q.j(SizeKt.m2829widthInVpY3zN4$default(Modifier.Companion, (fMo2469getMaxWidthD9Ej5fM - (size * f2)) / size2, 0.0f, 2, null), (com.waze.ui.m.a) obj14, this.f32883a, composer14, 0);
                        if (i12 < r3.size()) {
                            composer14.startReplaceGroup(-1150626473);
                            SpacerKt.Spacer(SizeKt.m2827width3ABfNKs(Modifier.Companion, f2), composer14, 6);
                            composer14.endReplaceGroup();
                        } else {
                            composer14.startReplaceGroup(-1150552476);
                            composer14.endReplaceGroup();
                        }
                        i11 = i12;
                        f2 = 8.0f;
                    }
                    composer14.endReplaceGroup();
                    composer14.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                break;
            case 18:
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer15 = (Composer) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                x.f(paddingValues, "it");
                if ((iIntValue19 & 6) == 0) {
                    iIntValue19 |= true == composer15.changed(paddingValues) ? 4 : 2;
                }
                if (composer15.shouldExecute((iIntValue19 & 19) != 18, iIntValue19 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(781179062, iIntValue19, -1, "com.waze.ui.login_error.ErrorScreen.<anonymous> (LoginError.kt:182)");
                    }
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(BackgroundKt.m1972backgroundbw27NRU$default(PaddingKt.padding(Modifier.Companion, paddingValues), com.waze.bz.a.d(composer15, 0).h(), null, 2, null), 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getStart(), composer15, 54);
                    int iB3 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer15, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = composer15.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer15, modifierFillMaxSize$default);
                    h.g.a.a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                    if (!(composer15.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer15.startReusableNode();
                    if (composer15.getInserting()) {
                        composer15.createNode(constructor3);
                    } else {
                        composer15.useNode();
                    }
                    ?? r9 = this.f32883a;
                    ?? r0 = this.f32884b;
                    Updater.m7351setimpl(composer15, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m7351setimpl(composer15, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Updater.m7351setimpl(composer15, Integer.valueOf(iB3), ComposeUiNode.Companion.getSetCompositeKeyHash());
                    Updater.m7349reconcileimpl(composer15, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                    Updater.m7351setimpl(composer15, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.launch_icon_64px, composer15, 0), (String) null, SizeKt.m2822size3ABfNKs(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 30.0f, 18.0f, 0.0f, 18.0f, 4, null), 80.0f), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer15, Painter.$stable | DisplayStrings.DS_DIRT_ROADS, 120);
                    TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.MOBILE_LOGIN_ERROR_LOGIN_FAILED_TITLE, composer15, 0), PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 30.0f, 0.0f, 60.0f, 5.0f, 2, null), com.waze.bz.a.d(composer15, 0).o(), TextUnitKt.getSp(26), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m11004boximpl(TextAlign.Companion.m11014getLefte0LSkKk()), 0L, 0, false, 0, 0, (l<? super TextLayoutResult, ab>) null, (TextStyle) null, composer15, 199728, 0, 130512);
                    TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.MOBILE_LOGIN_ERROR_LOGIN_FAILED_MESSAGE, composer15, 0), PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 30.0f, 0.0f, 60.0f, 32.0f, 2, null), com.waze.bz.a.d(composer15, 0).o(), TextUnitKt.getSp(18), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m11004boximpl(TextAlign.Companion.m11014getLefte0LSkKk()), 0L, 0, false, 0, 0, (l<? super TextLayoutResult, ab>) null, (TextStyle) null, composer15, 199728, 0, 130512);
                    be.o(r0, SizeKt.fillMaxWidth$default(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 16.0f, 0.0f, 16.0f, 8.0f, 2, null), 0.0f, 1, null), com.waze.ui.r.a.c.c.b(R.string.MOBILE_LOGIN_ERROR_LOGIN_FAILED_CONFIRM_BUTTON, composer15, 0), null, null, null, false, false, composer15, 48, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_1);
                    be.o(r9, SizeKt.fillMaxWidth$default(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 16.0f, 0.0f, 16.0f, 12.0f, 2, null), 0.0f, 1, null), com.waze.ui.r.a.c.c.b(R.string.MOBILE_LOGIN_ERROR_CANCEL_BUTTON_ANDROID, composer15, 0), null, n.e(com.waze.design_components.button.g.f23359b, null, null, 6), null, false, false, composer15, 48, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_2W_4);
                    composer15.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer15.skipToGroupEnd();
                }
                break;
            case 19:
                Composer composer16 = (Composer) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                x.f((AnimatedVisibilityScope) obj, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1975004625, iIntValue20, -1, "com.waze.ui.main_menu.HeaderTop.<anonymous>.<anonymous>.<anonymous> (MainMenuHeader.kt:137)");
                }
                Object objB = this.f32883a;
                if (objB == null) {
                    composer16.startReplaceGroup(-396098720);
                    objB = com.waze.ui.r.a.c.c.b(R.string.MAIN_MENU_GENERIC_GREETING, composer16, 0);
                } else {
                    composer16.startReplaceGroup(-396099092);
                }
                composer16.endReplaceGroup();
                TextKt.m4275Text4IGK_g((String) objB, RowScope.CC.weight$default(this.f32884b, PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 16.0f, 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false, 2, null), com.waze.bz.a.d(composer16, 0).o(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composer16).g(), composer16, 0, 0, 65528);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                break;
            default:
                Composer composer17 = (Composer) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                x.f((ColumnScope) obj, "$this$Header");
                if (composer17.shouldExecute((iIntValue21 & 17) != 16, iIntValue21 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-167453145, iIntValue21, -1, "com.waze.ui.qr_login.InitialScreen.<anonymous> (QrLogin.kt:149)");
                    }
                    boolean z = ((Configuration) composer17.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 1;
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.launch_icon_64px, composer17, 0), (String) null, z ? SizeKt.m2822size3ABfNKs(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 35.0f, 0.0f, 18.0f, 5, null), 80.0f) : SizeKt.m2822size3ABfNKs(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 12.0f, 0.0f, 12.0f, 5, null), 60.0f), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer17, Painter.$stable | 48, 120);
                    String strB5 = com.waze.ui.r.a.c.c.b(R.string.QR_LOGIN_SUBTITLE, composer17, 0);
                    long jO = com.waze.bz.a.d(composer17, 0).o();
                    long sp = z ? TextUnitKt.getSp(20) : TextUnitKt.getSp(16);
                    ?? r32 = this.f32883a;
                    ?? r02 = this.f32884b;
                    TextKt.m4275Text4IGK_g(strB5, PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 60.0f, 0.0f, 60.0f, z ? 32.0f : 12.0f, 2, null), jO, sp, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m11004boximpl(TextAlign.Companion.m11011getCentere0LSkKk()), 0L, 0, false, 0, 0, (l<? super TextLayoutResult, ab>) null, (TextStyle) null, composer17, 196608, 0, 130512);
                    be.o(r02, SizeKt.fillMaxWidth$default(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 16.0f, 0.0f, 16.0f, 12.0f, 2, null), 0.0f, 1, null), com.waze.ui.r.a.c.c.b(R.string.QR_LOGIN_APPROVE_BUTTON, composer17, 0), null, null, null, false, false, composer17, 48, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_1);
                    be.o(r32, SizeKt.fillMaxWidth$default(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 16.0f, 0.0f, 16.0f, 0.0f, 10, null), 0.0f, 1, null), com.waze.ui.r.a.c.c.b(R.string.QR_LOGIN_REFUSE_BUTTON, composer17, 0), null, n.e(com.waze.design_components.button.g.f23359b, null, null, 6), null, false, false, composer17, 48, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_2W_4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer17.skipToGroupEnd();
                }
                break;
        }
        return ab.f48028a;
    }

    public /* synthetic */ b(Object obj, Object obj2, int i2) {
        this.f32885c = i2;
        this.f32883a = obj;
        this.f32884b = obj2;
    }

    public /* synthetic */ b(Object obj, Object obj2, int i2, byte[] bArr) {
        this.f32885c = i2;
        this.f32884b = obj;
        this.f32883a = obj2;
    }
}
