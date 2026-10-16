package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.NavigationDrawerTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class NavigationDrawerItemDefaults {
    public static final int $stable = 0;
    public static final NavigationDrawerItemDefaults INSTANCE = new NavigationDrawerItemDefaults();
    private static final PaddingValues ItemPadding = PaddingKt.m2750PaddingValuesYgX7TsA$default(12.0f, 0.0f, 2, null);

    private NavigationDrawerItemDefaults() {
    }

    /* renamed from: colors-oq7We08, reason: not valid java name */
    public final NavigationDrawerItemColors m5269colorsoq7We08(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, Composer composer, int i2, int i3) {
        long j10;
        long value = (i3 & 1) != 0 ? ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getActiveIndicatorColor(), composer, 6) : j2;
        long jM8263getTransparent0d7_KjU = (i3 & 2) != 0 ? Color.Companion.m8263getTransparent0d7_KjU() : j3;
        long value2 = (i3 & 4) != 0 ? ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getActiveIconColor(), composer, 6) : j4;
        long value3 = (i3 & 8) != 0 ? ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getInactiveIconColor(), composer, 6) : j5;
        long value4 = (i3 & 16) != 0 ? ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getActiveLabelTextColor(), composer, 6) : j6;
        long value5 = (i3 & 32) != 0 ? ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getInactiveLabelTextColor(), composer, 6) : j7;
        long j11 = (i3 & 64) != 0 ? value4 : j8;
        long j12 = (i3 & 128) != 0 ? value5 : j9;
        if (ComposerKt.isTraceInProgress()) {
            j10 = value5;
            ComposerKt.traceEventStart(-1574983348, i2, -1, "androidx.compose.material3.NavigationDrawerItemDefaults.colors (NavigationDrawer.kt:1226)");
        } else {
            j10 = value5;
        }
        DefaultDrawerItemsColor defaultDrawerItemsColor = new DefaultDrawerItemsColor(value2, value3, value4, j10, value, jM8263getTransparent0d7_KjU, j11, j12, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultDrawerItemsColor;
    }

    public final PaddingValues getItemPadding() {
        return ItemPadding;
    }
}
