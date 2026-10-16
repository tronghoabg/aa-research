package com.waze.copilot.presentation;

import androidx.compose.material.SnackbarHostKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.waze.c.e.bv;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23105a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final h.g.a.q f23106b = ComposableLambdaKt.composableLambdaInstance(-975487618, false, new bv(4));

    /* renamed from: c, reason: collision with root package name */
    private static final h.g.a.q f23107c = ComposableLambdaKt.composableLambdaInstance(1539776491, false, new a(0));

    static final ab a(SnackbarHostState snackbarHostState, Composer composer, int i2) {
        x.f(snackbarHostState, "it");
        if ((i2 & 6) == 0) {
            i2 |= true != composer.changed(snackbarHostState) ? 2 : 4;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1539776491, i2, -1, "com.waze.copilot.presentation.ComposableSingletons$CopilotMarketplaceFragmentKt.lambda$1539776491.<anonymous> (CopilotMarketplaceFragment.kt:121)");
            }
            SnackbarHostKt.SnackbarHost(snackbarHostState, null, f23106b, composer, (i2 & 14) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public static final h.g.a.q b() {
        return f23107c;
    }
}
