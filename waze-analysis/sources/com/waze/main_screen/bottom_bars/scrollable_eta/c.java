package com.waze.main_screen.bottom_bars.scrollable_eta;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.waze.car_lib.r.cq;
import com.waze.main_screen.y;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f25945a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final h.g.a.p f25946b = ComposableLambdaKt.composableLambdaInstance(-910117368, false, new y(12));

    /* renamed from: c, reason: collision with root package name */
    private static final h.g.a.p f25947c = ComposableLambdaKt.composableLambdaInstance(-1103564724, false, new b(0));

    static final ab a(Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1103564724, i2, -1, "com.waze.main_screen.bottom_bars.scrollable_eta.ComposableSingletons$LockedScreenViewKt.lambda$-1103564724.<anonymous> (LockedScreenView.kt:15)");
            }
            cq.k(false, null, null, null, null, f25946b, composer, 196608);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public static final h.g.a.p b() {
        return f25947c;
    }
}
