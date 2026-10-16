package com.waze.bz;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.waze.ConfigManager;
import com.waze.navigate.fy;
import com.waze.ui.r.a.a.q;
import com.waze.ui.r.a.e.e;
import h.g.b.x;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class a {
    public a() {
    }

    public static b c(fy fyVar, ConfigManager configManager, Context context) {
        x.f(fyVar, "tollInfoStatSender");
        x.f(configManager, "configManager");
        x.f(context, "appContext");
        return new d(fyVar, configManager, context);
    }

    public static com.waze.ui.r.a.e.a.a d(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1236735685, i2, -1, "com.waze.ui.mobile.infra.theme.WazeTheme.<get-colors> (WazeTheme.kt:88)");
        }
        com.waze.ui.r.a.e.a.a aVar = (com.waze.ui.r.a.e.a.a) composer.consume(e.f43383e);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return aVar;
    }

    public static Locale e(Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1768965756, 0, -1, "com.waze.ui.mobile.infra.theme.WazeTheme.<get-locale> (WazeTheme.kt:94)");
        }
        Locale localeD = ((com.waze.ui.r.a.c.b) composer.consume(com.waze.ui.r.a.c.c.a())).d(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return localeD;
    }

    public static com.waze.ui.r.a.e.b.a f(Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(283026502, 0, -1, "com.waze.ui.mobile.infra.theme.WazeTheme.<get-lockState> (WazeTheme.kt:100)");
        }
        com.waze.ui.r.a.e.b.a aVar = (com.waze.ui.r.a.e.b.a) composer.consume(com.waze.ui.r.a.e.b.b.a());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return aVar;
    }

    public static q g(Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2117877546, 6, -1, "com.waze.ui.mobile.infra.theme.WazeTheme.<get-resourceLoader> (WazeTheme.kt:91)");
        }
        q qVar = (q) composer.consume(e.f43384f);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return qVar;
    }

    public static com.waze.ui.r.a.e.c.b h(Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1574953532, 0, -1, "com.waze.ui.mobile.infra.theme.WazeTheme.<get-typography> (WazeTheme.kt:85)");
        }
        com.waze.ui.r.a.e.c.b bVar = (com.waze.ui.r.a.e.c.b) composer.consume(e.f43381c);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bVar;
    }

    public static boolean i(Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1199509518, 0, -1, "com.waze.ui.mobile.infra.theme.WazeTheme.<get-isDarkThemeEnabled> (WazeTheme.kt:103)");
        }
        boolean zBooleanValue = ((Boolean) composer.consume(e.f43380b)).booleanValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return zBooleanValue;
    }

    public static boolean j(Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1735193248, 0, -1, "com.waze.ui.mobile.infra.theme.WazeTheme.<get-isRtlLanguage> (WazeTheme.kt:97)");
        }
        boolean zC = ((com.waze.ui.r.a.c.b) composer.consume(com.waze.ui.r.a.c.c.a())).c(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return zC;
    }

    public /* synthetic */ a(byte[] bArr, byte[] bArr2) {
    }
}
