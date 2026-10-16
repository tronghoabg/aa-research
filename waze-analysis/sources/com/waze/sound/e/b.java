package com.waze.sound.e;

import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.waze.strings.DisplayStrings;
import com.waze.z.a.be;
import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f39836a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final p f39837b = ComposableLambdaKt.composableLambdaInstance(-275232293, false, new a(0));

    /* renamed from: c, reason: collision with root package name */
    private static final p f39838c;

    static {
        ComposableLambdaKt.composableLambdaInstance(-1124080935, false, new a(2));
        f39838c = ComposableLambdaKt.composableLambdaInstance(1777520990, false, new a(3));
        ComposableLambdaKt.composableLambdaInstance(968475763, false, new a(4));
    }

    static final ab a(Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(968475763, i2, -1, "com.waze.sound.presentation.ComposableSingletons$VoiceGuidanceSheetKt.lambda$968475763.<anonymous> (VoiceGuidanceSheet.kt:346)");
            }
            be.c(null, ModalBottomSheetKt.rememberModalBottomSheetState(ModalBottomSheetValue.Expanded, null, null, false, composer, 6, 14), f39838c, true, null, composer, (ModalBottomSheetState.$stable << 3) | DisplayStrings.DS_CATEGORY_SEARCH_AMENITIES_FILTER_CHARGING_STATION, 17);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public static final p b() {
        return f39837b;
    }
}
