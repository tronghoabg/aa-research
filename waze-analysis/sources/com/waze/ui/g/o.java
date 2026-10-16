package com.waze.ui.g;

import androidx.compose.material.SnackbarHostKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f42352a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final h.g.a.q f42353b = ComposableLambdaKt.composableLambdaInstance(-431733890, false, new com.waze.sharedui.web.h(11));

    /* renamed from: c, reason: collision with root package name */
    private static final h.g.a.q f42354c = ComposableLambdaKt.composableLambdaInstance(-1986805199, false, new n(0));

    static final ab a(SnackbarHostState snackbarHostState, Composer composer, int i2) {
        h.g.b.x.f(snackbarHostState, "it");
        if ((i2 & 6) == 0) {
            i2 |= true != composer.changed(snackbarHostState) ? 2 : 4;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1986805199, i2, -1, "com.waze.ui.copilot.ComposableSingletons$CarsSettingsScreenKt.lambda$-1986805199.<anonymous> (CarsSettingsScreen.kt:111)");
            }
            SnackbarHostKt.SnackbarHost(snackbarHostState, null, f42353b, composer, (i2 & 14) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public static final h.g.a.q b() {
        return f42354c;
    }
}
