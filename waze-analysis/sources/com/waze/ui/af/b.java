package com.waze.ui.af;

import androidx.compose.material.SnackbarHostKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f41869a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final h.g.a.q f41870b;

    /* renamed from: c, reason: collision with root package name */
    private static final h.g.a.q f41871c = ComposableLambdaKt.composableLambdaInstance(680676652, false, new a());

    /* renamed from: d, reason: collision with root package name */
    private static final h.g.a.q f41872d = ComposableLambdaKt.composableLambdaInstance(-811593468, false, new com.waze.ui.g(12));

    /* renamed from: e, reason: collision with root package name */
    private static final h.g.a.q f41873e = ComposableLambdaKt.composableLambdaInstance(-844465022, false, new com.waze.ui.g(13));

    /* renamed from: f, reason: collision with root package name */
    private static final h.g.a.q f41874f = ComposableLambdaKt.composableLambdaInstance(-463881100, false, new com.waze.ui.g(14));

    /* renamed from: g, reason: collision with root package name */
    private static final h.g.a.p f41875g = ComposableLambdaKt.composableLambdaInstance(-564738880, false, new com.waze.ui.j.a(2));

    /* renamed from: h, reason: collision with root package name */
    private static final h.g.a.q f41876h = ComposableLambdaKt.composableLambdaInstance(987376740, false, new com.waze.ui.g(15));

    /* renamed from: i, reason: collision with root package name */
    private static final h.g.a.p f41877i = ComposableLambdaKt.composableLambdaInstance(-1007803984, false, new com.waze.ui.j.a(3));

    /* renamed from: j, reason: collision with root package name */
    private static final h.g.a.q f41878j = ComposableLambdaKt.composableLambdaInstance(-2007970241, false, new com.waze.ui.g(16));

    /* renamed from: k, reason: collision with root package name */
    private static final h.g.a.q f41879k = ComposableLambdaKt.composableLambdaInstance(-1736860681, false, new com.waze.ui.g(17));

    static {
        int i2 = 18;
        f41870b = ComposableLambdaKt.composableLambdaInstance(1063139135, false, new com.waze.ui.g(i2));
        ComposableLambdaKt.composableLambdaInstance(1396215139, false, new com.waze.ui.j.a(4));
        ComposableLambdaKt.composableLambdaInstance(1653486120, false, new com.waze.ui.f.a(i2));
        ComposableLambdaKt.composableLambdaInstance(-1629527818, false, new com.waze.ui.f.a(19));
        ComposableLambdaKt.composableLambdaInstance(-1783536998, false, new com.waze.ui.f.a(20));
        ComposableLambdaKt.composableLambdaInstance(-1645808668, false, new com.waze.ui.j.a(1));
    }

    static final h.ab a(SnackbarHostState snackbarHostState, Composer composer, int i2) {
        h.g.b.x.f(snackbarHostState, "it");
        if ((i2 & 6) == 0) {
            i2 |= true != composer.changed(snackbarHostState) ? 2 : 4;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(680676652, i2, -1, "com.waze.ui.voices.ComposableSingletons$VoiceSettingsScreenKt.lambda$680676652.<anonymous> (VoiceSettingsScreen.kt:225)");
            }
            SnackbarHostKt.SnackbarHost(snackbarHostState, null, f41870b, composer, (i2 & 14) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    public static final h.g.a.p b() {
        return f41877i;
    }

    public static final h.g.a.q c() {
        return f41879k;
    }

    public static final h.g.a.q d() {
        return f41878j;
    }

    public static final h.g.a.q e() {
        return f41874f;
    }

    public static final h.g.a.p f() {
        return f41875g;
    }

    public static final h.g.a.q g() {
        return f41872d;
    }

    public static final h.g.a.q h() {
        return f41873e;
    }

    public static final h.g.a.q i() {
        return f41871c;
    }

    public static final h.g.a.q j() {
        return f41876h;
    }
}
