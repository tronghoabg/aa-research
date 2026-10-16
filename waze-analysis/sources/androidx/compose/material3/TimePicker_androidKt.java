package androidx.compose.material3;

import android.content.Context;
import android.content.res.Configuration;
import android.media.AudioManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.media3.common.MimeTypes;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TimePicker_androidKt {
    public static final int defaultTimePickerLayoutType(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-721362352, i2, -1, "androidx.compose.material3.defaultTimePickerLayoutType (TimePicker.android.kt:34)");
        }
        Configuration configuration = (Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        int iM5896getHorizontalQJTpgSE = configuration.screenHeightDp < configuration.screenWidthDp ? TimePickerLayoutType.Companion.m5896getHorizontalQJTpgSE() : TimePickerLayoutType.Companion.m5897getVerticalQJTpgSE();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iM5896getHorizontalQJTpgSE;
    }

    public static final TimeInputErrorHandler rememberTimeInputErrorHandler(boolean z, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(216223160, i2, -1, "androidx.compose.material3.rememberTimeInputErrorHandler (TimePicker.android.kt:45)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        HapticFeedback hapticFeedback = (HapticFeedback) composer.consume(CompositionLocalsKt.getLocalHapticFeedback());
        boolean zChanged = composer.changed(context);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            Object systemService = context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            x.d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            objRememberedValue = (AudioManager) systemService;
            composer.updateRememberedValue(objRememberedValue);
        }
        AudioManager audioManager = (AudioManager) objRememberedValue;
        boolean zChanged2 = composer.changed(hapticFeedback) | composer.changed(audioManager);
        boolean z2 = true;
        if ((((i2 & 14) ^ 6) <= 4 || !composer.changed(z)) && (i2 & 6) != 4) {
            z2 = false;
        }
        boolean z3 = zChanged2 | z2;
        Object objRememberedValue2 = composer.rememberedValue();
        if (z3 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new TimeInputErrorHandlerImpl(hapticFeedback, audioManager, z);
            composer.updateRememberedValue(objRememberedValue2);
        }
        TimeInputErrorHandlerImpl timeInputErrorHandlerImpl = (TimeInputErrorHandlerImpl) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return timeInputErrorHandlerImpl;
    }
}
