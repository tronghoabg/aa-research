package com.waze.main_screen.bottom_bars.scrollable_eta;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.waze.car_lib.r.cq;
import com.waze.main_screen.y;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f25941a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final h.g.a.p f25942b = ComposableLambdaKt.composableLambdaInstance(973038802, false, new y(11));

    /* renamed from: c, reason: collision with root package name */
    private static final h.g.a.p f25943c = ComposableLambdaKt.composableLambdaInstance(-1357422314, false, new b(1));

    static final ab a(Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1357422314, i2, -1, "com.waze.main_screen.bottom_bars.scrollable_eta.ComposableSingletons$EtaOfflineViewKt.lambda$-1357422314.<anonymous> (EtaOfflineView.kt:15)");
            }
            cq.k(false, null, null, null, null, f25942b, composer, 196608);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public static final h.g.a.p b() {
        return f25943c;
    }
}
