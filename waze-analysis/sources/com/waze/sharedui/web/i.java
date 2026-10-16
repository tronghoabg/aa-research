package com.waze.sharedui.web;

import androidx.compose.material.SnackbarHostKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.waze.c.e.bv;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f39354a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final h.g.a.q f39355b = ComposableLambdaKt.composableLambdaInstance(633481642, false, new bv(18));

    /* renamed from: c, reason: collision with root package name */
    private static final h.g.a.q f39356c = ComposableLambdaKt.composableLambdaInstance(-109962147, false, new h(0));

    static {
        ComposableLambdaKt.composableLambdaInstance(-6435805, false, new com.waze.sharedrive.g.ac(2));
    }

    static final h.ab a(SnackbarHostState snackbarHostState, Composer composer, int i2) {
        h.g.b.x.f(snackbarHostState, "it");
        if ((i2 & 6) == 0) {
            i2 |= true != composer.changed(snackbarHostState) ? 2 : 4;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-109962147, i2, -1, "com.waze.sharedui.web.ComposableSingletons$WazeWebViewPageKt.lambda$-109962147.<anonymous> (WazeWebViewPage.kt:64)");
            }
            SnackbarHostKt.SnackbarHost(snackbarHostState, null, f39355b, composer, (i2 & 14) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    public static final h.g.a.q b() {
        return f39356c;
    }
}
