package com.waze;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.CarContext;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class au implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f15672a;

    public /* synthetic */ au(int i2) {
        this.f15672a = i2;
    }

    @Override // h.g.a.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        int i3;
        int i4;
        switch (this.f15672a) {
            case 0:
                Composer composer = (Composer) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                int i5 = av.f15779a;
                h.g.b.x.f((AnimatedContentScope) obj, "$this$composable");
                h.g.b.x.f((NavBackStackEntry) obj2, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(950174814, iIntValue, -1, "com.waze.ComposableSingletons$MainActivityExtKt.lambda$950174814.<anonymous> (MainActivityExt.kt:354)");
                }
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                CreationExtras creationExtrasF = org.chromium.support_lib_boundary.a.b.f(current);
                org.a.d.k.b bVarA = org.a.c.a.a(composer);
                int i6 = h.g.b.ar.f48106a;
                com.waze.location.bg.g((com.waze.main_screen.be) org.a.b.c.a.a(new h.g.b.m(com.waze.main_screen.be.class), current.getViewModelStore(), creationExtrasF, bVarA, null), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return h.ab.f48028a;
            case 1:
                int iIntValue2 = ((Integer) obj4).intValue();
                int i7 = av.f15779a;
                h.g.b.x.f((AnimatedContentScope) obj, "$this$composable");
                h.g.b.x.f((NavBackStackEntry) obj2, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1192190615, iIntValue2, -1, "com.waze.ComposableSingletons$MainActivityExtKt.lambda$1192190615.<anonymous> (MainActivityExt.kt:277)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return h.ab.f48028a;
            case 2:
                CarContext carContext = (CarContext) obj;
                com.waze.car_lib.f.hm hmVar = (com.waze.car_lib.f.hm) obj2;
                com.waze.car_lib.o.v vVar = (com.waze.car_lib.o.v) obj3;
                com.waze.car_lib.c.n nVar = (com.waze.car_lib.c.n) obj4;
                h.g.b.x.f(carContext, "context");
                h.g.b.x.f(hmVar, "coordinatorController");
                h.g.b.x.f(vVar, "settingCustomPage");
                h.g.b.x.f(nVar, "analyticsSender");
                return new com.waze.car_lib.screens.bl(carContext, hmVar, vVar, nVar);
            case 3:
                Context context = (Context) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int iIntValue4 = ((Integer) obj3).intValue();
                boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                h.g.b.x.f(context, "context");
                com.waze.design_components.e.c cVar = new com.waze.design_components.e.c(context);
                ((TextView) cVar.findViewById(R.id.result_number_icon_text)).setText(String.valueOf(iIntValue4));
                if (zBooleanValue) {
                    ((ImageView) cVar.findViewById(R.id.result_number_icon_bg)).setImageResource(R.drawable.search_result_pin_circle_parking);
                }
                return com.waze.ad.a.j.a(cVar, iIntValue3, iIntValue3, 1073741824);
            case 4:
                Context context2 = (Context) obj;
                String str = (String) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                h.g.b.x.f(context2, "context");
                String str2 = str;
                boolean z = (str2 == null || str2.length() == 0) ? false : true;
                View viewInflate = LayoutInflater.from(context2).inflate(z ? R.layout.search_result_pin_wide_round : R.layout.search_result_pin_round, (ViewGroup) null);
                ((ImageView) viewInflate.findViewById(R.id.search_result_pin_image)).setVisibility(8);
                TextView textView = (TextView) viewInflate.findViewById(R.id.search_result_pin_index);
                textView.setVisibility(0);
                textView.setText(String.valueOf(iIntValue5));
                FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.search_result_pin_image_container);
                if (zBooleanValue2) {
                    frameLayout.setBackgroundResource(R.drawable.search_result_pin_circle_parking);
                }
                if (z) {
                    ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                    h.g.b.x.d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    ((LinearLayout.LayoutParams) layoutParams).leftMargin = context2.getResources().getDimensionPixelSize(R.dimen.search_map_pin_aaos_margin);
                }
                TextView textView2 = (TextView) viewInflate.findViewById(R.id.search_result_pin_text);
                if (textView2 != null) {
                    if (str == null) {
                    }
                    textView2.setText(str2);
                }
                viewInflate.measure(0, 0);
                viewInflate.layout(0, 0, viewInflate.getMeasuredWidth(), viewInflate.getMeasuredHeight());
                View viewFindViewById = viewInflate.findViewById(R.id.search_result_pin_anchor);
                Point point = viewFindViewById != null ? new Point(viewFindViewById.getLeft(), viewFindViewById.getTop()) : null;
                View viewFindViewById2 = viewInflate.findViewById(R.id.search_result_pin_click_area);
                Rect rect = viewFindViewById2 != null ? new Rect(viewFindViewById2.getLeft(), viewFindViewById2.getTop(), viewInflate.getMeasuredWidth() - viewFindViewById2.getRight(), viewInflate.getMeasuredHeight() - viewFindViewById2.getBottom()) : null;
                h.g.b.x.c(viewInflate);
                return new com.waze.search.v2.g(com.waze.ad.a.j.a(viewInflate, viewInflate.getMeasuredWidth(), viewInflate.getMeasuredHeight(), 1073741824), rect, point);
            case 5:
                String str3 = (String) obj2;
                Composer composer2 = (Composer) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                int i8 = com.waze.ui.f.b.f42288a;
                h.g.b.x.f((AnimatedContentScope) obj, "$this$AnimatedContent");
                h.g.b.x.f(str3, "label");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-872095693, iIntValue6, -1, "com.waze.ui.conversation.ComposableSingletons$ConversationLayoutKt.lambda$-872095693.<anonymous> (ConversationLayout.kt:144)");
                }
                TextKt.m4275Text4IGK_g(str3, PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 4.0f, 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m11004boximpl(TextAlign.Companion.m11011getCentere0LSkKk()), 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer2).m(), composer2, ((iIntValue6 >> 3) & 14) | 48, 0, 65020);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return h.ab.f48028a;
            case 6:
                com.waze.ui.ac.a aVar = (com.waze.ui.ac.a) obj;
                com.waze.reports.cx cxVar = (com.waze.reports.cx) obj2;
                Composer composer3 = (Composer) obj3;
                int iIntValue7 = ((Integer) obj4).intValue();
                int i9 = com.waze.ui.r.a.a.a.f43264a;
                h.g.b.x.f(aVar, "source");
                h.g.b.x.f(cxVar, "callback");
                if ((iIntValue7 & 6) == 0) {
                    i2 = iIntValue7 | (true == composer3.changed(aVar) ? 4 : 2);
                } else {
                    i2 = iIntValue7;
                }
                if ((iIntValue7 & 48) == 0) {
                    i2 |= true != composer3.changed(cxVar) ? 16 : 32;
                }
                if (composer3.shouldExecute((i2 & 147) != 146, i2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1678684110, i2, -1, "com.waze.ui.mobile.infra.resources.ComposableSingletons$WazePainterKt.lambda$1678684110.<anonymous> (WazePainter.kt:50)");
                    }
                    com.waze.ui.r.a.a.t.o(aVar, cxVar, composer3, i2 & 126);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 7:
                com.waze.ui.ac.g gVar = (com.waze.ui.ac.g) obj;
                com.waze.reports.cx cxVar2 = (com.waze.reports.cx) obj2;
                Composer composer4 = (Composer) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                int i10 = com.waze.ui.r.a.a.a.f43264a;
                h.g.b.x.f(gVar, "source");
                h.g.b.x.f(cxVar2, "callback");
                if ((iIntValue8 & 6) == 0) {
                    i3 = iIntValue8 | (true == composer4.changed(gVar) ? 4 : 2);
                } else {
                    i3 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i3 |= true != composer4.changed(cxVar2) ? 16 : 32;
                }
                if (composer4.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1134529180, i3, -1, "com.waze.ui.mobile.infra.resources.ComposableSingletons$WazePainterKt.lambda$-1134529180.<anonymous> (WazePainter.kt:62)");
                    }
                    com.waze.ui.r.a.a.t.p(gVar, cxVar2, composer4, i3 & 126);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 8:
                com.waze.ui.ac.h hVar = (com.waze.ui.ac.h) obj;
                com.waze.reports.cx cxVar3 = (com.waze.reports.cx) obj2;
                Composer composer5 = (Composer) obj3;
                int iIntValue9 = ((Integer) obj4).intValue();
                int i11 = com.waze.ui.r.a.a.a.f43264a;
                h.g.b.x.f(hVar, "source");
                h.g.b.x.f(cxVar3, "callback");
                if ((iIntValue9 & 6) == 0) {
                    i4 = iIntValue9 | (true == composer5.changed(hVar) ? 4 : 2);
                } else {
                    i4 = iIntValue9;
                }
                if ((iIntValue9 & 48) == 0) {
                    i4 |= true != composer5.changed(cxVar3) ? 16 : 32;
                }
                if (composer5.shouldExecute((i4 & 147) != 146, i4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-866458577, i4, -1, "com.waze.ui.mobile.infra.resources.ComposableSingletons$WazePainterKt.lambda$-866458577.<anonymous> (WazePainter.kt:69)");
                    }
                    com.waze.ui.r.a.a.t.q(hVar, cxVar3, composer5, i4 & 126);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return h.ab.f48028a;
            default:
                String str4 = (String) obj2;
                Composer composer6 = (Composer) obj3;
                int iIntValue10 = ((Integer) obj4).intValue();
                int i12 = com.waze.ui.w.a.f43517a;
                h.g.b.x.f((AnimatedContentScope) obj, "$this$AnimatedContent");
                h.g.b.x.f(str4, "newTitle");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1620721459, iIntValue10, -1, "com.waze.ui.reports.ComposableSingletons$ReportsMenuLayoutKt.lambda$1620721459.<anonymous> (ReportsMenuLayout.kt:484)");
                }
                TextKt.m4275Text4IGK_g(str4, com.waze.ui.r.a.d.d.a(PaddingKt.m2756paddingVpY3zN4(Modifier.Companion, 16.0f, 8.0f), com.waze.ui.r.a.d.c.bG, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, TextStyle.m10559copyp1EtxEg$default(com.waze.bz.a.h(composer6).f(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(false), null, 0, 0, null, 16252927, null), composer6, ((iIntValue10 >> 3) & 14) | 48, 0, 65532);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return h.ab.f48028a;
        }
    }
}
