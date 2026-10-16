package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shape;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AlertDialogDefaults {
    public static final int $stable = 0;
    public static final AlertDialogDefaults INSTANCE;
    private static final float IconSize;
    private static final float TonalElevation;
    private static final PaddingValues dialogPadding;
    private static final PaddingValues textPadding;

    static {
        AlertDialogDefaults alertDialogDefaults = new AlertDialogDefaults();
        INSTANCE = alertDialogDefaults;
        IconSize = DialogTokens.INSTANCE.m6641getIconSizeD9Ej5fM();
        TonalElevation = 0.0f;
        dialogPadding = PaddingKt.m2748PaddingValues0680j_4(alertDialogDefaults.m4320getDialogPaddingValueD9Ej5fM());
        textPadding = PaddingKt.m2752PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, alertDialogDefaults.m4321getTextPaddingValueD9Ej5fM(), 7, null);
    }

    private AlertDialogDefaults() {
    }

    /* renamed from: getDialogPaddingValue-D9Ej5fM, reason: not valid java name */
    private final float m4320getDialogPaddingValueD9Ej5fM() {
        return PrecisionPointer.getShouldUsePrecisionPointerComponentSizing().getValue().booleanValue() ? 20.0f : 24.0f;
    }

    /* renamed from: getTextPaddingValue-D9Ej5fM, reason: not valid java name */
    private final float m4321getTextPaddingValueD9Ej5fM() {
        return PrecisionPointer.getShouldUsePrecisionPointerComponentSizing().getValue().booleanValue() ? 16.0f : 24.0f;
    }

    public final long getContainerColor(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(616766901, i2, -1, "androidx.compose.material3.AlertDialogDefaults.<get-containerColor> (AlertDialog.kt:230)");
        }
        long value = ColorSchemeKt.getValue(DialogTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final PaddingValues getDialogPadding$material3() {
        return dialogPadding;
    }

    public final long getIconContentColor(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1646653461, i2, -1, "androidx.compose.material3.AlertDialogDefaults.<get-iconContentColor> (AlertDialog.kt:234)");
        }
        long value = ColorSchemeKt.getValue(DialogTokens.INSTANCE.getIconColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m4322getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final Shape getShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-952504159, i2, -1, "androidx.compose.material3.AlertDialogDefaults.<get-shape> (AlertDialog.kt:223)");
        }
        Shape value = ShapesKt.getValue(DialogTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getTextContentColor(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1729845653, i2, -1, "androidx.compose.material3.AlertDialogDefaults.<get-textContentColor> (AlertDialog.kt:242)");
        }
        long value = ColorSchemeKt.getValue(DialogTokens.INSTANCE.getSupportingTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final PaddingValues getTextPadding$material3() {
        return textPadding;
    }

    public final long getTitleContentColor(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(247083549, i2, -1, "androidx.compose.material3.AlertDialogDefaults.<get-titleContentColor> (AlertDialog.kt:238)");
        }
        long value = ColorSchemeKt.getValue(DialogTokens.INSTANCE.getHeadlineColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getTonalElevation-D9Ej5fM, reason: not valid java name */
    public final float m4323getTonalElevationD9Ej5fM() {
        return TonalElevation;
    }
}
