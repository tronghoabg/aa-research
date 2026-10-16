package com.waze.coroutines;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.waze.R;
import com.waze.car_lib.r;
import com.waze.strings.DisplayStrings;
import com.waze.z.a.ay;
import com.waze.z.a.az;
import com.waze.z.a.b.y;
import com.waze.z.a.ba;
import com.waze.z.a.be;
import h.ab;
import h.g.a.p;
import h.g.b.ar;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class l implements p {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f23194a;

    public /* synthetic */ l(int i2) {
        this.f23194a = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = 2;
        switch (this.f23194a) {
            case 0:
                org.a.d.k.b bVar = (org.a.d.k.b) obj;
                int i3 = m.f23195a;
                x.f(bVar, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                org.a.d.i.b bVarF = com.waze.ch.a.a.f.f("WazeCoroutines");
                int i4 = ar.f48106a;
                break;
            case 1:
                int i5 = m.f23195a;
                x.f((org.a.d.k.b) obj, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                break;
            case 2:
                int i6 = m.f23195a;
                x.f((org.a.d.k.b) obj, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ThreadResponsivenessDetector");
                x.e(eVarD, "create(...)");
                break;
            case 3:
                int i7 = com.waze.y.b.f45545a;
                x.f((org.a.d.k.b) obj, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                break;
            case 4:
                org.a.d.k.b bVar2 = (org.a.d.k.b) obj;
                int i8 = com.waze.y.b.f45545a;
                x.f(bVar2, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i9 = ar.f48106a;
                break;
            case 5:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i10 = iIntValue & 3;
                int i11 = iIntValue & 1;
                int i12 = com.waze.z.a.i.f46137a;
                if (composer.shouldExecute(i10 != 2, i11)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(863275782, iIntValue, -1, "com.waze.design_components_compose.components.ComposableSingletons$RecenterMapButtonKt.lambda$863275782.<anonymous> (RecenterMapButton.kt:102)");
                    }
                    be.w(PaddingKt.m2755padding3ABfNKs(Modifier.Companion, 10.0f), null, composer, 6, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            case 6:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i13 = iIntValue2 & 3;
                int i14 = iIntValue2 & 1;
                int i15 = com.waze.z.a.l.f46143a;
                if (composer2.shouldExecute(i13 != 2, i14)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1129250929, iIntValue2, -1, "com.waze.design_components_compose.components.ComposableSingletons$WazeTextFieldKt.lambda$1129250929.<anonymous> (WazeTextField.kt:160)");
                    }
                    be.g(com.waze.design_components.b.d.ck, com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.en, null), null, com.waze.bz.a.d(composer2, 0).a(), composer2, 54, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            case 7:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i16 = iIntValue3 & 3;
                int i17 = iIntValue3 & 1;
                int i18 = com.waze.z.a.l.f46143a;
                if (composer3.shouldExecute(i16 != 2, i17)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1350881164, iIntValue3, -1, "com.waze.design_components_compose.components.ComposableSingletons$WazeTextFieldKt.lambda$-1350881164.<anonymous> (WazeTextField.kt:184)");
                    }
                    Object objRememberedValue = composer3.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new r(16);
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    be.q("Hello", (h.g.a.l) objRememberedValue, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), "Label", false, 0, 0, null, null, null, composer3, DisplayStrings.DS_REPORTING_AGENT_CAR_PLAY_ERROR_TITLE, 1008);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                break;
            case 8:
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i19 = iIntValue4 & 3;
                int i20 = iIntValue4 & 1;
                int i21 = com.waze.z.a.l.f46143a;
                if (composer4.shouldExecute(i19 != 2, i20)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1324996332, iIntValue4, -1, "com.waze.design_components_compose.components.ComposableSingletons$WazeTextFieldKt.lambda$1324996332.<anonymous> (WazeTextField.kt:197)");
                    }
                    Object objRememberedValue2 = composer4.rememberedValue();
                    if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new r(15);
                        composer4.updateRememberedValue(objRememberedValue2);
                    }
                    be.q("Hello", (h.g.a.l) objRememberedValue2, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), "Label", false, 0, 0, null, null, new ba("Bad Text", i2), composer4, DisplayStrings.DS_REPORTING_AGENT_CAR_PLAY_ERROR_TITLE, DisplayStrings.DS_REPORT_MENU_V2_CRASH_REPORT_LABEL);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                break;
            case 9:
                Composer composer5 = (Composer) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i22 = iIntValue5 & 3;
                int i23 = iIntValue5 & 1;
                int i24 = com.waze.z.a.l.f46143a;
                if (composer5.shouldExecute(i22 != 2, i23)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(808143107, iIntValue5, -1, "com.waze.design_components_compose.components.ComposableSingletons$WazeTextFieldKt.lambda$808143107.<anonymous> (WazeTextField.kt:211)");
                    }
                    Object objRememberedValue3 = composer5.rememberedValue();
                    if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = new r(14);
                        composer5.updateRememberedValue(objRememberedValue3);
                    }
                    be.q("Hello", (h.g.a.l) objRememberedValue3, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), "Label", false, 0, 0, null, null, ay.f45700a, composer5, 805309878, DisplayStrings.DS_REPORT_MENU_V2_CRASH_REPORT_LABEL);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                break;
            case 10:
                Composer composer6 = (Composer) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i25 = iIntValue6 & 3;
                int i26 = iIntValue6 & 1;
                int i27 = com.waze.z.a.l.f46143a;
                if (composer6.shouldExecute(i25 != 2, i26)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-312091979, iIntValue6, -1, "com.waze.design_components_compose.components.ComposableSingletons$WazeTextFieldKt.lambda$-312091979.<anonymous> (WazeTextField.kt:225)");
                    }
                    Object objRememberedValue4 = composer6.rememberedValue();
                    if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                        objRememberedValue4 = new r(17);
                        composer6.updateRememberedValue(objRememberedValue4);
                    }
                    be.q("Hello", (h.g.a.l) objRememberedValue4, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), "Label", false, 0, 0, null, null, new az(new com.waze.ui.ac.c(R.drawable.icon_t2)), composer6, DisplayStrings.DS_REPORTING_AGENT_CAR_PLAY_ERROR_TITLE, DisplayStrings.DS_REPORT_MENU_V2_CRASH_REPORT_LABEL);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                break;
            case 11:
                Composer composer7 = (Composer) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int i28 = iIntValue7 & 3;
                int i29 = iIntValue7 & 1;
                int i30 = com.waze.z.a.b.b.f45738a;
                if (composer7.shouldExecute(i28 != 2, i29)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(552068524, iIntValue7, -1, "com.waze.design_components_compose.components.bottom_sheet.ComposableSingletons$WazeBottomSheetHandleKt.lambda$552068524.<anonymous> (WazeBottomSheetHandle.kt:23)");
                    }
                    Object objRememberedValue5 = composer7.rememberedValue();
                    if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                        objRememberedValue5 = new com.waze.car_lib.o.a(20);
                        composer7.updateRememberedValue(objRememberedValue5);
                    }
                    y.e((h.g.a.a) objRememberedValue5, composer7, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                break;
            case 12:
                Composer composer8 = (Composer) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                int i31 = iIntValue8 & 3;
                int i32 = iIntValue8 & 1;
                int i33 = com.waze.z.a.d.e.f45945a;
                if (composer8.shouldExecute(i31 != 2, i32)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(194003933, iIntValue8, -1, "com.waze.design_components_compose.components.search_field.ComposableSingletons$SearchFieldKt.lambda$194003933.<anonymous> (SearchField.kt:588)");
                    }
                    IconKt.m4110Iconww6aTOc(PainterResources_androidKt.painterResource(com.waze.design_components.b.d.ae.b(), composer8, 0), (String) null, (Modifier) null, com.waze.bz.a.d(composer8, 0).o(), composer8, Painter.$stable | 48, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                break;
            case 13:
                Composer composer9 = (Composer) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                int i34 = iIntValue9 & 3;
                int i35 = iIntValue9 & 1;
                int i36 = com.waze.z.a.d.e.f45945a;
                if (composer9.shouldExecute(i34 != 2, i35)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(349829810, iIntValue9, -1, "com.waze.design_components_compose.components.search_field.ComposableSingletons$SearchFieldKt.lambda$349829810.<anonymous> (SearchField.kt:879)");
                    }
                    IconKt.m4110Iconww6aTOc(PainterResources_androidKt.painterResource(com.waze.design_components.b.d.aj.b(), composer9, 0), (String) null, SizeKt.m2822size3ABfNKs(Modifier.Companion, 26.0f), com.waze.bz.a.d(composer9, 0).C(), composer9, Painter.$stable | DisplayStrings.DS_DIRT_ROADS, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                break;
            case 14:
                Composer composer10 = (Composer) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                int i37 = iIntValue10 & 3;
                int i38 = iIntValue10 & 1;
                int i39 = com.waze.z.a.d.e.f45945a;
                if (composer10.shouldExecute(i37 != 2, i38)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1528435867, iIntValue10, -1, "com.waze.design_components_compose.components.search_field.ComposableSingletons$SearchFieldKt.lambda$1528435867.<anonymous> (SearchField.kt:899)");
                    }
                    IconKt.m4110Iconww6aTOc(PainterResources_androidKt.painterResource(com.waze.design_components.b.d.aj.b(), composer10, 0), (String) null, SizeKt.m2822size3ABfNKs(Modifier.Companion, 26.0f), com.waze.bz.a.d(composer10, 0).C(), composer10, Painter.$stable | DisplayStrings.DS_DIRT_ROADS, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                break;
            case 15:
                Composer composer11 = (Composer) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                int i40 = iIntValue11 & 3;
                int i41 = iIntValue11 & 1;
                int i42 = com.waze.z.a.d.e.f45945a;
                if (composer11.shouldExecute(i40 != 2, i41)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(328941849, iIntValue11, -1, "com.waze.design_components_compose.components.search_field.ComposableSingletons$SearchFieldKt.lambda$328941849.<anonymous> (SearchField.kt:923)");
                    }
                    IconKt.m4110Iconww6aTOc(PainterResources_androidKt.painterResource(com.waze.design_components.b.d.aj.b(), composer11, 0), (String) null, SizeKt.m2822size3ABfNKs(Modifier.Companion, 26.0f), com.waze.bz.a.d(composer11, 0).C(), composer11, Painter.$stable | DisplayStrings.DS_DIRT_ROADS, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                break;
            case 16:
                Composer composer12 = (Composer) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                int i43 = iIntValue12 & 3;
                int i44 = iIntValue12 & 1;
                int i45 = com.waze.z.a.d.e.f45945a;
                if (composer12.shouldExecute(i43 != 2, i44)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(566811472, iIntValue12, -1, "com.waze.design_components_compose.components.search_field.ComposableSingletons$SearchFieldKt.lambda$566811472.<anonymous> (SearchField.kt:937)");
                    }
                    IconKt.m4110Iconww6aTOc(PainterResources_androidKt.painterResource(com.waze.design_components.b.d.aj.b(), composer12, 0), (String) null, SizeKt.m2822size3ABfNKs(Modifier.Companion, 26.0f), com.waze.bz.a.d(composer12, 0).C(), composer12, Painter.$stable | DisplayStrings.DS_DIRT_ROADS, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                break;
            case 17:
                Composer composer13 = (Composer) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                int i46 = iIntValue13 & 3;
                int i47 = iIntValue13 & 1;
                int i48 = com.waze.z.a.d.e.f45945a;
                if (composer13.shouldExecute(i46 != 2, i47)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1192548399, iIntValue13, -1, "com.waze.design_components_compose.components.search_field.ComposableSingletons$SearchFieldKt.lambda$-1192548399.<anonymous> (SearchField.kt:951)");
                    }
                    IconKt.m4110Iconww6aTOc(PainterResources_androidKt.painterResource(com.waze.design_components.b.d.aj.b(), composer13, 0), (String) null, SizeKt.m2822size3ABfNKs(Modifier.Companion, 26.0f), com.waze.bz.a.d(composer13, 0).C(), composer13, Painter.$stable | DisplayStrings.DS_DIRT_ROADS, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                break;
            case 18:
                Composer composer14 = (Composer) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                int i49 = iIntValue14 & 3;
                int i50 = iIntValue14 & 1;
                int i51 = com.waze.z.a.d.e.f45945a;
                if (composer14.shouldExecute(i49 != 2, i50)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1574169293, iIntValue14, -1, "com.waze.design_components_compose.components.search_field.ComposableSingletons$SearchFieldKt.lambda$-1574169293.<anonymous> (SearchField.kt:991)");
                    }
                    IconKt.m4110Iconww6aTOc(PainterResources_androidKt.painterResource(com.waze.design_components.b.d.aj.b(), composer14, 0), (String) null, SizeKt.m2822size3ABfNKs(Modifier.Companion, 26.0f), com.waze.bz.a.d(composer14, 0).C(), composer14, Painter.$stable | DisplayStrings.DS_DIRT_ROADS, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                break;
            case 19:
                Composer composer15 = (Composer) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                int i52 = iIntValue15 & 3;
                int i53 = iIntValue15 & 1;
                int i54 = com.waze.z.a.d.e.f45945a;
                if (composer15.shouldExecute(i52 != 2, i53)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(329091477, iIntValue15, -1, "com.waze.design_components_compose.components.search_field.ComposableSingletons$SearchFieldKt.lambda$329091477.<anonymous> (SearchField.kt:614)");
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.search_field_action_search_mate, composer15, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer15, Painter.$stable | 48, 124);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer15.skipToGroupEnd();
                }
                break;
            default:
                Composer composer16 = (Composer) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                int i55 = iIntValue16 & 3;
                int i56 = iIntValue16 & 1;
                int i57 = com.waze.z.a.d.e.f45945a;
                if (composer16.shouldExecute(i55 != 2, i56)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1206756080, iIntValue16, -1, "com.waze.design_components_compose.components.search_field.ComposableSingletons$SearchFieldKt.lambda$1206756080.<anonymous> (SearchField.kt:648)");
                    }
                    TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.SEARCH_MATE_MIC_PERMISSION_DIALOG_TEXT, composer16, 0), (Modifier) null, com.waze.bz.a.d(composer16, 0).p(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composer16).a(), composer16, 0, 0, 65530);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer16.skipToGroupEnd();
                }
                break;
        }
        return ab.f48028a;
    }
}
