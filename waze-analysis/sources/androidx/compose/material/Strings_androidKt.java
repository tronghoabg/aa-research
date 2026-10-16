package androidx.compose.material;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Strings_androidKt {
    /* renamed from: getString-4foXLRw, reason: not valid java name */
    public static final String m4215getString4foXLRw(int i2, Composer composer, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-726638443, i3, -1, "androidx.compose.material.getString (Strings.android.kt:25)");
        }
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        String string = Strings.m4203equalsimpl0(i2, Strings.Companion.m4211getNavigationMenuUdPEhr4()) ? resources.getString(com.waze.R.string.navigation_menu) : Strings.m4203equalsimpl0(i2, Strings.Companion.m4207getCloseDrawerUdPEhr4()) ? resources.getString(com.waze.R.string.close_drawer) : Strings.m4203equalsimpl0(i2, Strings.Companion.m4208getCloseSheetUdPEhr4()) ? resources.getString(com.waze.R.string.close_sheet) : Strings.m4203equalsimpl0(i2, Strings.Companion.m4209getDefaultErrorMessageUdPEhr4()) ? resources.getString(com.waze.R.string.default_error_message) : Strings.m4203equalsimpl0(i2, Strings.Companion.m4210getExposedDropdownMenuUdPEhr4()) ? resources.getString(com.waze.R.string.dropdown_menu) : Strings.m4203equalsimpl0(i2, Strings.Companion.m4213getSliderRangeStartUdPEhr4()) ? resources.getString(com.waze.R.string.range_start) : Strings.m4203equalsimpl0(i2, Strings.Companion.m4212getSliderRangeEndUdPEhr4()) ? resources.getString(com.waze.R.string.range_end) : Strings.m4203equalsimpl0(i2, Strings.Companion.m4214getSnackbarPaneTitleUdPEhr4()) ? resources.getString(com.waze.R.string.mc2_snackbar_pane_title) : "";
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return string;
    }
}
