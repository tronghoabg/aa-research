package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AppBarDefaults {
    public static final int $stable = 0;
    public static final AppBarDefaults INSTANCE = new AppBarDefaults();
    private static final float TopAppBarElevation = 4.0f;
    private static final float BottomAppBarElevation = 8.0f;
    private static final PaddingValues ContentPadding = PaddingKt.m2752PaddingValuesa9UjIt4$default(AppBarKt.AppBarHorizontalPadding, 0.0f, AppBarKt.AppBarHorizontalPadding, 0.0f, 10, null);

    private AppBarDefaults() {
    }

    /* renamed from: getBottomAppBarElevation-D9Ej5fM, reason: not valid java name */
    public final float m3948getBottomAppBarElevationD9Ej5fM() {
        return BottomAppBarElevation;
    }

    public final WindowInsets getBottomAppBarWindowInsets(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1469837023, i2, -1, "androidx.compose.material.AppBarDefaults.<get-bottomAppBarWindowInsets> (AppBar.kt:450)");
        }
        WindowInsets windowInsetsM2850onlybOOhFvg = WindowInsetsKt.m2850onlybOOhFvg(SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 6), WindowInsetsSides.m2860plusgK_yJZ4(WindowInsetsSides.Companion.m2870getHorizontalJoeWqyM(), WindowInsetsSides.Companion.m2868getBottomJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsetsM2850onlybOOhFvg;
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    /* renamed from: getTopAppBarElevation-D9Ej5fM, reason: not valid java name */
    public final float m3949getTopAppBarElevationD9Ej5fM() {
        return TopAppBarElevation;
    }

    public final WindowInsets getTopAppBarWindowInsets(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-427176825, i2, -1, "androidx.compose.material.AppBarDefaults.<get-topAppBarWindowInsets> (AppBar.kt:443)");
        }
        WindowInsets windowInsetsM2850onlybOOhFvg = WindowInsetsKt.m2850onlybOOhFvg(SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 6), WindowInsetsSides.m2860plusgK_yJZ4(WindowInsetsSides.Companion.m2870getHorizontalJoeWqyM(), WindowInsetsSides.Companion.m2874getTopJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsetsM2850onlybOOhFvg;
    }
}
