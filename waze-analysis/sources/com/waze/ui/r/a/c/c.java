package com.waze.ui.r.a.c;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import com.waze.ui.o.ac;
import h.g.b.x;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f43308a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final ProvidableCompositionLocal f43309b = CompositionLocalKt.staticCompositionLocalOf(new ac(2));

    public static final ProvidableCompositionLocal a() {
        return f43309b;
    }

    public static final String b(int i2, Composer composer, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2060123523, i3, -1, "com.waze.ui.mobile.infra.strings.wazeString (WazeStrings.kt:25)");
        }
        String strA = ((b) composer.consume(f43309b)).a(i2, composer, i3 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return strA;
    }

    public static final String c(String str, Composer composer, int i2) {
        x.f(str, "text");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2014565069, i2, -1, "com.waze.ui.mobile.infra.strings.wazeString (WazeStrings.kt:37)");
        }
        String strB = ((b) composer.consume(f43309b)).b(str, composer, i2 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return strB;
    }

    public static final String d(int i2, Object[] objArr, Composer composer) {
        x.f(objArr, "args");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1305866960, 0, -1, "com.waze.ui.mobile.infra.strings.wazeString (WazeStrings.kt:31)");
        }
        String strE = ((b) composer.consume(f43309b)).e(i2, Arrays.copyOf(objArr, objArr.length), composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return strE;
    }
}
