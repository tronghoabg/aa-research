package com.waze.copilot.presentation;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.DividerKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.waze.R;
import com.waze.bw.c.d.ct;
import com.waze.strings.DisplayStrings;
import com.waze.ui.e.w;
import com.waze.ui.f.aj;
import com.waze.ui.f.am;
import com.waze.z.a.aa;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class a implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f23104a;

    public /* synthetic */ a(int i2) {
        this.f23104a = i2;
    }

    @Override // h.g.a.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f23104a) {
            case 0:
                return b.a((SnackbarHostState) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 1:
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i2 = com.waze.bw.c.d.e.f18097a;
                x.f((AnimatedVisibilityScope) obj, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2114812144, iIntValue, -1, "com.waze.startstate.mobile.ui.ComposableSingletons$SearchHeaderKt.lambda$2114812144.<anonymous> (SearchHeader.kt:58)");
                }
                com.waze.design_components.g.b.f(new com.waze.z.a.a(com.waze.ui.r.a.c.c.b(R.string.NETWORK_WARNING_TEXT, composer, 0), new com.waze.ui.ac.f(R.drawable.no_network_warning_icon), false, com.waze.z.a.c.f45818d, 44), com.waze.ui.r.a.d.d.a(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 10.0f, 7, null), com.waze.ui.r.a.d.c.aj, null), composer, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return ab.f48028a;
            case 2:
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i3 = com.waze.bw.c.d.e.f18097a;
                x.f((RowScope) obj, "$this$Button");
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(354631031, iIntValue2, -1, "com.waze.startstate.mobile.ui.ComposableSingletons$SearchHeaderKt.lambda$354631031.<anonymous> (SearchHeader.kt:250)");
                    }
                    TextKt.m4275Text4IGK_g("Dictation", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (h.g.a.l<? super TextLayoutResult, ab>) null, (TextStyle) null, composer2, 6, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 122878);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return ab.f48028a;
            case 3:
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i4 = com.waze.bw.c.d.e.f18097a;
                x.f((RowScope) obj, "$this$Button");
                if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-857190688, iIntValue3, -1, "com.waze.startstate.mobile.ui.ComposableSingletons$SearchHeaderKt.lambda$-857190688.<anonymous> (SearchHeader.kt:265)");
                    }
                    TextKt.m4275Text4IGK_g("G-Voice", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (h.g.a.l<? super TextLayoutResult, ab>) null, (TextStyle) null, composer3, 6, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 122878);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return ab.f48028a;
            case 4:
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i5 = com.waze.bw.c.d.e.f18097a;
                x.f((RowScope) obj, "$this$Button");
                if (composer4.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(563599615, iIntValue4, -1, "com.waze.startstate.mobile.ui.ComposableSingletons$SearchHeaderKt.lambda$563599615.<anonymous> (SearchHeader.kt:280)");
                    }
                    TextKt.m4275Text4IGK_g("Agent", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (h.g.a.l<? super TextLayoutResult, ab>) null, (TextStyle) null, composer4, 6, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 122878);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return ab.f48028a;
            case 5:
                Composer composer5 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i6 = com.waze.bw.c.d.e.f18097a;
                x.f((RowScope) obj, "$this$Button");
                if (composer5.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1199876192, iIntValue5, -1, "com.waze.startstate.mobile.ui.ComposableSingletons$SearchHeaderKt.lambda$-1199876192.<anonymous> (SearchHeader.kt:301)");
                    }
                    TextKt.m4275Text4IGK_g("Init", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (h.g.a.l<? super TextLayoutResult, ab>) null, (TextStyle) null, composer5, 6, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 122878);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return ab.f48028a;
            case 6:
                Composer composer6 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i7 = com.waze.bw.c.d.e.f18097a;
                x.f((RowScope) obj, "$this$Button");
                if (composer6.shouldExecute((iIntValue6 & 17) != 16, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1824410935, iIntValue6, -1, "com.waze.startstate.mobile.ui.ComposableSingletons$SearchHeaderKt.lambda$-1824410935.<anonymous> (SearchHeader.kt:316)");
                    }
                    TextKt.m4275Text4IGK_g("Listening", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (h.g.a.l<? super TextLayoutResult, ab>) null, (TextStyle) null, composer6, 6, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 122878);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return ab.f48028a;
            case 7:
                Composer composer7 = (Composer) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                int i8 = com.waze.bw.c.d.e.f18097a;
                x.f((RowScope) obj, "$this$Button");
                if (composer7.shouldExecute((iIntValue7 & 17) != 16, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2050437416, iIntValue7, -1, "com.waze.startstate.mobile.ui.ComposableSingletons$SearchHeaderKt.lambda$2050437416.<anonymous> (SearchHeader.kt:331)");
                    }
                    TextKt.m4275Text4IGK_g("Thinking", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (h.g.a.l<? super TextLayoutResult, ab>) null, (TextStyle) null, composer7, 6, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 122878);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return ab.f48028a;
            case 8:
                Composer composer8 = (Composer) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                int i9 = com.waze.bw.c.d.e.f18097a;
                x.f((RowScope) obj, "$this$Button");
                if (composer8.shouldExecute((iIntValue8 & 17) != 16, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(477147135, iIntValue8, -1, "com.waze.startstate.mobile.ui.ComposableSingletons$SearchHeaderKt.lambda$477147135.<anonymous> (SearchHeader.kt:351)");
                    }
                    TextKt.m4275Text4IGK_g("Speaking", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (h.g.a.l<? super TextLayoutResult, ab>) null, (TextStyle) null, composer8, 6, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 122878);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return ab.f48028a;
            case 9:
                Composer composer9 = (Composer) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                int i10 = com.waze.bw.c.d.e.f18097a;
                x.f((RowScope) obj, "$this$Button");
                if (composer9.shouldExecute((iIntValue9 & 17) != 16, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-147387608, iIntValue9, -1, "com.waze.startstate.mobile.ui.ComposableSingletons$SearchHeaderKt.lambda$-147387608.<anonymous> (SearchHeader.kt:364)");
                    }
                    TextKt.m4275Text4IGK_g("Idle", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (h.g.a.l<? super TextLayoutResult, ab>) null, (TextStyle) null, composer9, 6, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 122878);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return ab.f48028a;
            case 10:
                Composer composer10 = (Composer) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                int i11 = com.waze.bw.c.d.f.f18109a;
                x.f((LazyItemScope) obj, "$this$item");
                if (composer10.shouldExecute((iIntValue10 & 17) != 16, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(744022116, iIntValue10, -1, "com.waze.startstate.mobile.ui.ComposableSingletons$StartStateSheetContentKt.lambda$744022116.<anonymous> (StartStateSheetContent.kt:398)");
                    }
                    ct.m(com.waze.ui.r.a.c.c.b(R.string.DESTINATION_SECTION_UPCOMING_DRIVES_TITLE, composer10, 0), com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.ae, null), composer10, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return ab.f48028a;
            case 11:
                Composer composer11 = (Composer) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                int i12 = com.waze.bw.c.d.f.f18109a;
                x.f((LazyItemScope) obj, "$this$item");
                if (composer11.shouldExecute((iIntValue11 & 17) != 16, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(391088965, iIntValue11, -1, "com.waze.startstate.mobile.ui.ComposableSingletons$StartStateSheetContentKt.lambda$391088965.<anonymous> (StartStateSheetContent.kt:455)");
                    }
                    ct.m(com.waze.ui.r.a.c.c.b(R.string.DESTINATION_SECTION_RECENT_TITLE, composer11, 0), com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.ah, null), composer11, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return ab.f48028a;
            case 12:
                Composer composer12 = (Composer) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                int i13 = com.waze.bw.c.d.f.f18109a;
                x.f((LazyItemScope) obj, "$this$item");
                if (composer12.shouldExecute((iIntValue12 & 17) != 16, iIntValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1270367712, iIntValue12, -1, "com.waze.startstate.mobile.ui.ComposableSingletons$StartStateSheetContentKt.lambda$-1270367712.<anonymous> (StartStateSheetContent.kt:550)");
                    }
                    ct.m(com.waze.ui.r.a.c.c.b(R.string.DESTINATION_SECTION_MORE_TITLE, composer12, 0), com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.ak, null), composer12, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return ab.f48028a;
            case 13:
                Composer composer13 = (Composer) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                int i14 = com.waze.bw.c.d.f.f18109a;
                x.f((LazyItemScope) obj, "$this$item");
                if (composer13.shouldExecute((iIntValue13 & 17) != 16, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1954494350, iIntValue13, -1, "com.waze.startstate.mobile.ui.ComposableSingletons$StartStateSheetContentKt.lambda$1954494350.<anonymous> (StartStateSheetContent.kt:585)");
                    }
                    DividerKt.m4060DivideroMI9zvI(PaddingKt.m2757paddingVpY3zN4$default(Modifier.Companion, 16.0f, 0.0f, 2, null), com.waze.bz.a.d(composer13, 0).K(), 1.0f, 0.0f, composer13, DisplayStrings.DS_DICTATION_BOTTOM_SHEET_SPEECH_TIMEOUT, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                return ab.f48028a;
            case 14:
                Composer composer14 = (Composer) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                int i15 = com.waze.trip_overview.views.b.f41502a;
                x.f((BoxScope) obj, "$this$WazeTooltipPopup");
                if (composer14.shouldExecute((iIntValue14 & 17) != 16, iIntValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-738203773, iIntValue14, -1, "com.waze.trip_overview.views.ComposableSingletons$TripOverviewVehicleTypeSelectorKt.lambda$-738203773.<anonymous> (TripOverviewVehicleTypeSelector.kt:97)");
                    }
                    TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.TRIP_OVERVIEW_VEHICLE_TYPE_SELECTOR_TOOLTIP_TEXT, composer14, 0), SizeKt.m2829widthInVpY3zN4$default(Modifier.Companion, 0.0f, 360.0f, 1, null), com.waze.bz.a.d(composer14, 0).D(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composer14).m(), composer14, 48, 0, 65528);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                return ab.f48028a;
            case 15:
                Composer composer15 = (Composer) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                int i16 = com.waze.ui.b.n.f42077a;
                x.f((Transition.Segment) obj, "$this$animateColor");
                composer15.startReplaceGroup(743814334);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(743814334, iIntValue15, -1, "com.waze.ui.alternate_routes.Segment.<anonymous>.<anonymous> (MapListSegmentedSwitch.kt:137)");
                }
                FiniteAnimationSpec finiteAnimationSpecC = aa.c(com.waze.z.a.x.f46210a);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer15.endReplaceGroup();
                return finiteAnimationSpecC;
            case 16:
                Composer composer16 = (Composer) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                x.f((Transition.Segment) obj, "$this$animateFloat");
                composer16.startReplaceGroup(1092335635);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1092335635, iIntValue16, -1, "com.waze.ui.button_pack.ButtonPackButton.<anonymous> (ButtonPackButton.kt:264)");
                }
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(100, 0, null, 6, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer16.endReplaceGroup();
                return tweenSpecTween$default;
            case 17:
                Transition.Segment segment = (Transition.Segment) obj;
                Composer composer17 = (Composer) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                x.f(segment, "$this$animateDp");
                composer17.startReplaceGroup(-1813957720);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1813957720, iIntValue17, -1, "com.waze.ui.button_pack.ButtonPackButton.<anonymous> (ButtonPackButton.kt:309)");
                }
                TweenSpec tweenSpecTween$default2 = w.a((com.waze.ui.e.x) segment.getTargetState()) ? AnimationSpecKt.tween$default(150, 150, null, 4, null) : AnimationSpecKt.tween$default(150, 0, null, 4, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer17.endReplaceGroup();
                return tweenSpecTween$default2;
            case 18:
                Transition.Segment segment2 = (Transition.Segment) obj;
                Composer composer18 = (Composer) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                x.f(segment2, "$this$animateFloat");
                composer18.startReplaceGroup(-1309893437);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1309893437, iIntValue18, -1, "com.waze.ui.button_pack.ButtonPackButton.<anonymous> (ButtonPackButton.kt:329)");
                }
                TweenSpec tweenSpecTween$default3 = w.a((com.waze.ui.e.x) segment2.getTargetState()) ? AnimationSpecKt.tween$default(150, 0, null, 4, null) : AnimationSpecKt.tween$default(150, 150, null, 4, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer18.endReplaceGroup();
                return tweenSpecTween$default3;
            case 19:
                Transition.Segment segment3 = (Transition.Segment) obj;
                Composer composer19 = (Composer) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                x.f(segment3, "$this$animateFloat");
                composer19.startReplaceGroup(1669727023);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1669727023, iIntValue19, -1, "com.waze.ui.button_pack.ButtonPackButton.<anonymous> (ButtonPackButton.kt:348)");
                }
                TweenSpec tweenSpecTween$default4 = w.a((com.waze.ui.e.x) segment3.getTargetState()) ? AnimationSpecKt.tween$default(150, 0, null, 4, null) : AnimationSpecKt.tween$default(150, 150, null, 4, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer19.endReplaceGroup();
                return tweenSpecTween$default4;
            default:
                aj ajVar = (aj) obj;
                Composer composer20 = (Composer) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                int i17 = com.waze.ui.f.b.f42288a;
                x.f(ajVar, "it");
                composer20.startReplaceGroup(-176345919);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-176345919, iIntValue20, -1, "com.waze.ui.conversation.ComposableSingletons$ConversationLayoutKt.lambda$-1398683606.<anonymous>.<anonymous> (ConversationLayout.kt:280)");
                }
                am amVarD = am.d(com.waze.tide.s.l(ajVar, composer20, 48 | (iIntValue20 & 14)), "Success Message");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer20.endReplaceGroup();
                return amVarD;
        }
    }
}
