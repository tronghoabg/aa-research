package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FloatingActionButtonDefaults {
    public static final int $stable = 0;
    public static final FloatingActionButtonDefaults INSTANCE = new FloatingActionButtonDefaults();

    private FloatingActionButtonDefaults() {
    }

    /* renamed from: elevation-ixp7dh8, reason: not valid java name */
    public final /* synthetic */ FloatingActionButtonElevation m4101elevationixp7dh8(float f2, float f3, Composer composer, int i2, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-654132828, i2, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:215)");
        }
        int i4 = i3 & 2;
        int i5 = i3 & 1;
        if (i4 != 0) {
            f3 = 12.0f;
        }
        float f4 = f3;
        if (1 == i5) {
            f2 = 6.0f;
        }
        FloatingActionButtonElevation floatingActionButtonElevationM4102elevationxZ9QkE = m4102elevationxZ9QkE(f2, f4, 8.0f, 8.0f, composer, (i2 & 14) | DisplayStrings.DS_CATEGORY_SEARCH_AMENITIES_FILTER_CHARGING_STATION | (i2 & 112) | (57344 & (i2 << 6)), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return floatingActionButtonElevationM4102elevationxZ9QkE;
    }

    /* renamed from: elevation-xZ9-QkE, reason: not valid java name */
    public final FloatingActionButtonElevation m4102elevationxZ9QkE(float f2, float f3, float f4, float f5, Composer composer, int i2, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(380403812, i2, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:238)");
        }
        boolean z = true;
        if (1 == (i3 & 1)) {
            f2 = 6.0f;
        }
        float f6 = f2;
        boolean z2 = (((i2 & 14) ^ 6) > 4 && composer.changed(f6)) || (i2 & 6) == 4;
        if ((i3 & 2) != 0) {
            f3 = 12.0f;
        }
        float f7 = f3;
        boolean z3 = (((i2 & 112) ^ 48) > 32 && composer.changed(f7)) || (i2 & 48) == 32;
        if ((i3 & 4) != 0) {
            f4 = 8.0f;
        }
        boolean z4 = z2 | z3;
        boolean z5 = (((i2 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) > 256 && composer.changed(f4)) || (i2 & 384) == 256;
        float f8 = (i3 & 8) != 0 ? 8.0f : f5;
        boolean z6 = z4 | z5;
        if ((((i2 & 7168) ^ DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) <= 2048 || !composer.changed(f8)) && (i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) != 2048) {
            z = false;
        }
        boolean z7 = z6 | z;
        Object objRememberedValue = composer.rememberedValue();
        if (z7 || objRememberedValue == Composer.Companion.getEmpty()) {
            DefaultFloatingActionButtonElevation defaultFloatingActionButtonElevation = new DefaultFloatingActionButtonElevation(f6, f7, f4, f8, null);
            composer.updateRememberedValue(defaultFloatingActionButtonElevation);
            objRememberedValue = defaultFloatingActionButtonElevation;
        }
        DefaultFloatingActionButtonElevation defaultFloatingActionButtonElevation2 = (DefaultFloatingActionButtonElevation) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFloatingActionButtonElevation2;
    }
}
