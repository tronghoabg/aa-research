package com.waze.main_screen.p.a.b.a;

import android.graphics.drawable.Drawable;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.waze.ui.m.cv;
import com.waze.ui.m.dc;
import com.waze.ui.m.dl;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class j implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ State f26789a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26790b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26791c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f26792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f26793e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f26794f;

    public /* synthetic */ j(Modifier modifier, com.waze.ui.r.a.e.b.a aVar, State state, Drawable drawable, com.waze.main_screen.b.a.f fVar, int i2) {
        this.f26794f = i2;
        this.f26793e = modifier;
        this.f26791c = aVar;
        this.f26789a = state;
        this.f26792d = drawable;
        this.f26790b = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.waze.main_screen.b.a.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlinx.coroutines.af] */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlinx.coroutines.af] */
    /* JADX WARN: Type inference failed for: r4v21, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.compose.runtime.State, java.lang.Object] */
    @Override // h.g.a.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i2 = this.f26794f;
        if (i2 == 0) {
            int iIntValue = ((Integer) obj3).intValue();
            ?? r5 = this.f26793e;
            State state = this.f26789a;
            ?? r3 = this.f26792d;
            return ab.h((t) this.f26790b, this.f26791c, r3, state, r5, (AnimatedVisibilityScope) obj, (Composer) obj2, iIntValue);
        }
        if (i2 != 1) {
            Composer composer = (Composer) obj2;
            int iIntValue2 = ((Integer) obj3).intValue();
            h.g.b.x.f((ColumnScope) obj, "$this$SilkyBottomSheet");
            if (composer.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1680648113, iIntValue2, -1, "com.waze.ui.location_preview.LocationPreviewScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LocationPreview.kt:198)");
                }
                ?? r1 = this.f26793e;
                Object obj4 = this.f26792d;
                ?? r32 = this.f26791c;
                ?? r4 = this.f26790b;
                dl dlVar = (dl) r1.getValue();
                boolean zChanged = composer.changed((Object) r4) | composer.changedInstance(r32) | composer.changedInstance(obj4);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new cv(r4, r32, (ModalBottomSheetState) obj4, 0);
                    composer.updateRememberedValue(objRememberedValue);
                }
                h.g.a.a aVar = (h.g.a.a) objRememberedValue;
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new com.waze.ui.b.r(16);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                dc.k(dlVar, aVar, (h.g.a.l) objRememberedValue2, r4, ((Dp) this.f26789a.getValue()).m11178unboximpl(), composer, 384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return h.ab.f48028a;
        }
        Composer composer2 = (Composer) obj2;
        int iIntValue3 = ((Integer) obj3).intValue();
        h.g.b.x.f((AnimatedVisibilityScope) obj, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1940602024, iIntValue3, -1, "com.waze.main_screen.audio_sdk_button.presentation.AudioSdkButton.<anonymous> (AudioSdkButton.kt:47)");
        }
        ?? r11 = this.f26790b;
        Object obj5 = this.f26792d;
        State state2 = this.f26789a;
        Object obj6 = this.f26791c;
        Modifier modifierA = com.waze.ui.r.a.d.d.a(this.f26793e, com.waze.ui.r.a.d.c.cN, null);
        Enum r0 = (Enum) obj6;
        boolean zChanged2 = composer2.changed(r0.ordinal()) | composer2.changed(state2) | composer2.changedInstance(obj5) | composer2.changed((Object) r11);
        Object objRememberedValue3 = composer2.rememberedValue();
        if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
            com.waze.z.a.c.j jVar = new com.waze.z.a.c.j((com.waze.ui.r.a.e.b.a) obj6, (Drawable) obj5, state2, (com.waze.main_screen.b.a.f) r11, 3);
            composer2.updateRememberedValue(jVar);
            objRememberedValue3 = jVar;
        }
        h.g.a.l lVar = (h.g.a.l) objRememberedValue3;
        boolean zChanged3 = composer2.changed(r0.ordinal()) | composer2.changed(state2) | composer2.changedInstance(obj5);
        Object objRememberedValue4 = composer2.rememberedValue();
        if (zChanged3 || objRememberedValue4 == Composer.Companion.getEmpty()) {
            com.waze.ads.c cVar = new com.waze.ads.c(obj6, obj5, state2, 7, (int[]) null);
            composer2.updateRememberedValue(cVar);
            objRememberedValue4 = cVar;
        }
        AndroidView_androidKt.AndroidView(lVar, modifierA, (h.g.a.l) objRememberedValue4, composer2, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return h.ab.f48028a;
    }

    public /* synthetic */ j(Object obj, af afVar, Object obj2, State state, State state2, int i2) {
        this.f26794f = i2;
        this.f26790b = obj;
        this.f26791c = afVar;
        this.f26792d = obj2;
        this.f26789a = state;
        this.f26793e = state2;
    }
}
