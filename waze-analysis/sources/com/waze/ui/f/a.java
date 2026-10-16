package com.waze.ui.f;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.common.util.WavUtil;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.waze.R;
import com.waze.strings.DisplayStrings;
import com.waze.ui.af.ap;
import com.waze.ui.w.b.av;
import com.waze.ui.z.ao;
import com.waze.ui.z.aq;
import com.waze.ui.z.as;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class a implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f42264a;

    public /* synthetic */ a(int i2) {
        this.f42264a = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = 6;
        String str = null;
        switch (this.f42264a) {
            case 0:
                break;
            case 1:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i3 = iIntValue & 3;
                int i4 = iIntValue & 1;
                int i5 = com.waze.ui.p.a.f43180a;
                if (composer.shouldExecute(i3 != 2, i4)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1661651159, iIntValue, -1, "com.waze.ui.map.ComposableSingletons$WazeMapKt.lambda$1661651159.<anonymous> (WazeMap.kt:243)");
                    }
                    com.waze.ui.p.t.m(composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i6 = iIntValue2 & 3;
                int i7 = iIntValue2 & 1;
                int i8 = com.waze.ui.p.a.f43180a;
                if (composer2.shouldExecute(i6 != 2, i7)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-607213243, iIntValue2, -1, "com.waze.ui.map.ComposableSingletons$WazeMapKt.lambda$-607213243.<anonymous> (WazeMap.kt:249)");
                    }
                    com.waze.ui.p.t.m(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            case 3:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i9 = iIntValue3 & 3;
                int i10 = iIntValue3 & 1;
                int i11 = com.waze.ui.p.a.f43180a;
                if (composer3.shouldExecute(i9 != 2, i10)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(271495040, iIntValue3, -1, "com.waze.ui.map.ComposableSingletons$WazeMapKt.lambda$271495040.<anonymous> (WazeMap.kt:256)");
                    }
                    com.waze.ui.p.t.l(0.1234567f, 12.345678f, composer3, 54);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                break;
            case 4:
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i12 = iIntValue4 & 3;
                int i13 = iIntValue4 & 1;
                int i14 = com.waze.ui.v.a.f43484a;
                if (composer4.shouldExecute(i12 != 2, i13)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(549556571, iIntValue4, -1, "com.waze.ui.qr_login.ComposableSingletons$QrLoginKt.lambda$549556571.<anonymous> (QrLogin.kt:57)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                break;
            case 5:
                ((Integer) obj).intValue();
                av avVar = (av) obj2;
                h.g.b.x.f(avVar, "item");
                break;
            case 6:
                Composer composer5 = (Composer) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i15 = iIntValue5 & 3;
                int i16 = iIntValue5 & 1;
                int i17 = com.waze.ui.x.d.f43811a;
                if (composer5.shouldExecute(i15 != 2, i16)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-705603937, iIntValue5, -1, "com.waze.ui.route_settings.ComposableSingletons$RouteSettingsMenuKt.lambda$-705603937.<anonymous> (RouteSettingsMenu.kt:90)");
                    }
                    Object objRememberedValue = composer5.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = EffectsKt.createCompositionCoroutineScope(h.c.k.f48060a, composer5);
                        composer5.updateRememberedValue(objRememberedValue);
                    }
                    kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) objRememberedValue;
                    ModalBottomSheetState modalBottomSheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, null, null, false, composer5, 6, 14);
                    Object objRememberedValue2 = composer5.rememberedValue();
                    if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                        composer5.updateRememberedValue(objRememberedValue2);
                    }
                    MutableState mutableState = (MutableState) objRememberedValue2;
                    Object objRememberedValue3 = composer5.rememberedValue();
                    if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(com.waze.ui.x.e.f43813a, null, 2, null);
                        composer5.updateRememberedValue(objRememberedValue3);
                    }
                    MutableState mutableState2 = (MutableState) objRememberedValue3;
                    Object objRememberedValue4 = composer5.rememberedValue();
                    if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                        objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(com.waze.ui.x.e.f43813a, null, 2, null);
                        composer5.updateRememberedValue(objRememberedValue4);
                    }
                    MutableState mutableState3 = (MutableState) objRememberedValue4;
                    Object objRememberedValue5 = composer5.rememberedValue();
                    if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                        objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(com.waze.ui.x.e.f43813a, null, 2, null);
                        composer5.updateRememberedValue(objRememberedValue5);
                    }
                    MutableState mutableState4 = (MutableState) objRememberedValue5;
                    ModalBottomSheetKt.m4126ModalBottomSheetLayoutGs3lGvM(ComposableLambdaKt.rememberComposableLambda(-1573633103, true, new com.waze.z.a.g.u(mutableState2, mutableState4, mutableState, 13, (byte[]) null), composer5, 54), null, modalBottomSheetStateRememberModalBottomSheetState, false, RoundedCornerShapeKt.m3088RoundedCornerShapea9UjIt4$default(12.0f, 12.0f, 0.0f, 0.0f, 12, null), 0.0f, 0L, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(-243641448, true, new com.waze.ui.t.a(afVar, modalBottomSheetStateRememberModalBottomSheetState, mutableState, mutableState2, mutableState3, mutableState4, 2), composer5, 54), composer5, (ModalBottomSheetState.$stable << 6) | 805306374, DisplayStrings.DS_REPORT_MENU_V2_START_RECORD_LABEL);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                break;
            case 7:
                Composer composer6 = (Composer) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i18 = iIntValue6 & 3;
                int i19 = iIntValue6 & 1;
                int i20 = com.waze.ui.x.d.f43811a;
                if (composer6.shouldExecute(i18 != 2, i19)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1564864443, iIntValue6, -1, "com.waze.ui.route_settings.ComposableSingletons$RouteSettingsMenuKt.lambda$-1564864443.<anonymous> (RouteSettingsMenu.kt:187)");
                    }
                    com.waze.ui.x.f fVar = new com.waze.ui.x.f(true);
                    com.waze.ui.x.f fVar2 = new com.waze.ui.x.f(true);
                    Object objRememberedValue6 = composer6.rememberedValue();
                    if (objRememberedValue6 == Composer.Companion.getEmpty()) {
                        objRememberedValue6 = new com.waze.ui.x.a(false ? 1 : 0);
                        composer6.updateRememberedValue(objRememberedValue6);
                    }
                    com.waze.ui.x.u.i(fVar, fVar2, (h.g.a.l) objRememberedValue6, composer6, DisplayStrings.DS_NONE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                break;
            case 8:
                Composer composer7 = (Composer) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int i21 = iIntValue7 & 3;
                int i22 = iIntValue7 & 1;
                int i23 = com.waze.ui.x.d.f43811a;
                if (composer7.shouldExecute(i21 != 2, i22)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(419867283, iIntValue7, -1, "com.waze.ui.route_settings.ComposableSingletons$RouteSettingsMenuKt.lambda$419867283.<anonymous> (RouteSettingsMenu.kt:264)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                break;
            case 9:
                Composer composer8 = (Composer) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                int i24 = iIntValue8 & 3;
                int i25 = iIntValue8 & 1;
                int i26 = com.waze.ui.z.a.f43856a;
                if (composer8.shouldExecute(i24 != 2, i25)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(322672298, iIntValue8, -1, "com.waze.ui.shared_drive.ComposableSingletons$ConfirmLeaveShareDriveDialogKt.lambda$322672298.<anonymous> (ConfirmLeaveShareDriveDialog.kt:19)");
                    }
                    TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_LIVE_DRIVE_STOP_SHARING_CONFIRMATION_DIALOG_SUBTITLE, composer8, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer8).a(), composer8, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                break;
            case 10:
                Composer composer9 = (Composer) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                int i27 = iIntValue9 & 3;
                int i28 = iIntValue9 & 1;
                int i29 = com.waze.ui.z.b.f43938a;
                if (composer9.shouldExecute(i27 != 2, i28)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1889665234, iIntValue9, -1, "com.waze.ui.shared_drive.ComposableSingletons$LiveShareParticipantListItemKt.lambda$1889665234.<anonymous> (LiveShareParticipantListItem.kt:271)");
                    }
                    TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.ARRIVED, composer9, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer9).m(), composer9, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                break;
            case 11:
                Composer composer10 = (Composer) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                int i30 = iIntValue10 & 3;
                int i31 = iIntValue10 & 1;
                int i32 = com.waze.ui.z.b.f43938a;
                if (composer10.shouldExecute(i30 != 2, i31)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-237987362, iIntValue10, -1, "com.waze.ui.shared_drive.ComposableSingletons$LiveShareParticipantListItemKt.lambda$-237987362.<anonymous> (LiveShareParticipantListItem.kt:339)");
                    }
                    as.x(new com.waze.ui.z.am(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE), null, false, null, composer10, 6, 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                break;
            case 12:
                Composer composer11 = (Composer) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                int i33 = iIntValue11 & 3;
                int i34 = iIntValue11 & 1;
                int i35 = com.waze.ui.z.b.f43938a;
                if (composer11.shouldExecute(i33 != 2, i34)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1851453406, iIntValue11, -1, "com.waze.ui.shared_drive.ComposableSingletons$LiveShareParticipantListItemKt.lambda$-1851453406.<anonymous> (LiveShareParticipantListItem.kt:347)");
                    }
                    as.x(new com.waze.ui.z.al(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, "Olivia", new com.waze.ui.ac.f(com.waze.design_components.b.d.S.b()), false, "9 min"), null, false, null, composer11, 0, 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                break;
            case 13:
                Composer composer12 = (Composer) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                int i36 = iIntValue12 & 3;
                int i37 = iIntValue12 & 1;
                int i38 = com.waze.ui.z.b.f43938a;
                if (composer12.shouldExecute(i36 != 2, i37)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1828292548, iIntValue12, -1, "com.waze.ui.shared_drive.ComposableSingletons$LiveShareParticipantListItemKt.lambda$1828292548.<anonymous> (LiveShareParticipantListItem.kt:364)");
                    }
                    as.x(new com.waze.ui.z.an(ExifInterface.GPS_MEASUREMENT_2D, null, new com.waze.ui.ac.f(com.waze.design_components.b.d.S.b()), true, true), null, false, null, composer12, 0, 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                break;
            case 14:
                Composer composer13 = (Composer) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                int i39 = iIntValue13 & 3;
                int i40 = iIntValue13 & 1;
                int i41 = com.waze.ui.z.b.f43938a;
                if (composer13.shouldExecute(i39 != 2, i40)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(692952856, iIntValue13, -1, "com.waze.ui.shared_drive.ComposableSingletons$LiveShareParticipantListItemKt.lambda$692952856.<anonymous> (LiveShareParticipantListItem.kt:381)");
                    }
                    as.x(new ao(ExifInterface.GPS_MEASUREMENT_3D, "Alex", new com.waze.ui.ac.f(com.waze.design_components.b.d.S.b()), true), null, false, null, composer13, 0, 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                break;
            case 15:
                Composer composer14 = (Composer) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                int i42 = iIntValue14 & 3;
                int i43 = iIntValue14 & 1;
                int i44 = com.waze.ui.z.b.f43938a;
                if (composer14.shouldExecute(i42 != 2, i43)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(81303437, iIntValue14, -1, "com.waze.ui.shared_drive.ComposableSingletons$LiveShareParticipantListItemKt.lambda$81303437.<anonymous> (LiveShareParticipantListItem.kt:397)");
                    }
                    as.x(new com.waze.ui.z.ak("4", "Rachel", new com.waze.ui.ac.f(com.waze.design_components.b.d.S.b()), false), null, false, null, composer14, 0, 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                break;
            case 16:
                Composer composer15 = (Composer) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                int i45 = iIntValue15 & 3;
                int i46 = iIntValue15 & 1;
                int i47 = com.waze.ui.z.c.f43940a;
                if (composer15.shouldExecute(i45 != 2, i46)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1789573749, iIntValue15, -1, "com.waze.ui.shared_drive.ComposableSingletons$SwitchShareDriveDialogKt.lambda$-1789573749.<anonymous> (SwitchShareDriveDialog.kt:29)");
                    }
                    TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_LIVE_DRIVE_SWITCH_SHARE_SUBTITLE, composer15, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer15).a(), composer15, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer15.skipToGroupEnd();
                }
                break;
            case 17:
                ((Integer) obj).intValue();
                aq aqVar = (aq) obj2;
                h.g.b.x.f(aqVar, "item");
                break;
            case 18:
                Composer composer16 = (Composer) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                int i48 = iIntValue16 & 1;
                boolean z = (iIntValue16 & 3) != 2;
                int i49 = com.waze.ui.af.b.f41869a;
                if (composer16.shouldExecute(z, i48)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1653486120, iIntValue16, -1, "com.waze.ui.voices.ComposableSingletons$VoiceSettingsScreenKt.lambda$1653486120.<anonymous> (VoiceSettingsScreen.kt:839)");
                    }
                    com.waze.ui.af.u uVar = new com.waze.ui.af.u("Custom VoiceOption 2", h.a.i.i(ap.d("Custom VoiceOption 1", "Custom VoiceOption 1"), ap.d("Custom VoiceOption 2", "Custom VoiceOption 2"), new com.waze.ui.af.w("Bob", "Bob", null, "eng"), new com.waze.ui.af.r("Doe", "Doe", "Somewhat long description for this very popular voice", "eng")), "o", 8);
                    Object objRememberedValue7 = composer16.rememberedValue();
                    if (objRememberedValue7 == Composer.Companion.getEmpty()) {
                        objRememberedValue7 = new com.waze.ui.x.a(7);
                        composer16.updateRememberedValue(objRememberedValue7);
                    }
                    ap.o(uVar, (h.g.a.l) objRememberedValue7, composer16, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer16.skipToGroupEnd();
                }
                break;
            case 19:
                Composer composer17 = (Composer) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                int i50 = iIntValue17 & 1;
                boolean z2 = (iIntValue17 & 3) != 2;
                int i51 = com.waze.ui.af.b.f41869a;
                if (composer17.shouldExecute(z2, i50)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1629527818, iIntValue17, -1, "com.waze.ui.voices.ComposableSingletons$VoiceSettingsScreenKt.lambda$-1629527818.<anonymous> (VoiceSettingsScreen.kt:872)");
                    }
                    com.waze.ui.af.u uVar2 = new com.waze.ui.af.u(str, h.a.i.h(), "some random text", 9);
                    Object objRememberedValue8 = composer17.rememberedValue();
                    if (objRememberedValue8 == Composer.Companion.getEmpty()) {
                        objRememberedValue8 = new com.waze.ui.x.a(i2);
                        composer17.updateRememberedValue(objRememberedValue8);
                    }
                    ap.o(uVar2, (h.g.a.l) objRememberedValue8, composer17, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer17.skipToGroupEnd();
                }
                break;
            default:
                Composer composer18 = (Composer) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                int i52 = iIntValue18 & 3;
                int i53 = iIntValue18 & 1;
                int i54 = com.waze.ui.af.b.f41869a;
                if (composer18.shouldExecute(i52 != 2, i53)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1783536998, iIntValue18, -1, "com.waze.ui.voices.ComposableSingletons$VoiceSettingsScreenKt.lambda$-1783536998.<anonymous> (VoiceSettingsScreen.kt:934)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer18, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer18.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer18, modifierFillMaxWidth$default);
                    h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    if (!(composer18.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer18.startReusableNode();
                    if (composer18.getInserting()) {
                        composer18.createNode(constructor);
                    } else {
                        composer18.useNode();
                    }
                    Updater.m7351setimpl(composer18, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m7351setimpl(composer18, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Updater.m7351setimpl(composer18, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
                    Updater.m7349reconcileimpl(composer18, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                    Updater.m7351setimpl(composer18, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Object objRememberedValue9 = composer18.rememberedValue();
                    if (objRememberedValue9 == Composer.Companion.getEmpty()) {
                        objRememberedValue9 = new com.waze.ui.o.ac(14);
                        composer18.updateRememberedValue(objRememberedValue9);
                    }
                    h.g.a.a aVar = (h.g.a.a) objRememberedValue9;
                    Object objRememberedValue10 = composer18.rememberedValue();
                    if (objRememberedValue10 == Composer.Companion.getEmpty()) {
                        objRememberedValue10 = new com.waze.ui.o.ac(15);
                        composer18.updateRememberedValue(objRememberedValue10);
                    }
                    ap.D(aVar, (h.g.a.a) objRememberedValue10, composer18, 54);
                    composer18.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer18.skipToGroupEnd();
                }
                break;
        }
        return h.ab.f48028a;
    }
}
