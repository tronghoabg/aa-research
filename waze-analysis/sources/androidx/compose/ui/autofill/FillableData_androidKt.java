package androidx.compose.ui.autofill;

import android.view.autofill.AutofillValue;
import androidx.compose.ui.autofill.FillableData;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FillableData_androidKt {
    public static final FillableData createFromAutofillValue(FillableData.Companion companion, AutofillValue autofillValue) {
        return new AndroidFillableData(autofillValue);
    }

    public static final FillableData createFromBoolean(FillableData.Companion companion, boolean z) {
        return new AndroidFillableData(AutofillValue.forToggle(z));
    }

    public static final FillableData createFromDateMillis(FillableData.Companion companion, long j2) {
        return new AndroidFillableData(AutofillValue.forDate(j2));
    }

    public static final FillableData createFromListIndex(FillableData.Companion companion, int i2) {
        return new AndroidFillableData(AutofillValue.forList(i2));
    }

    public static final FillableData createFromText(FillableData.Companion companion, CharSequence charSequence) {
        return new AndroidFillableData(AutofillValue.forText(AutofillUtils_androidKt.trimToSafeLength(charSequence)));
    }

    public static final AutofillValue toAutofillValue(FillableData fillableData) {
        AndroidFillableData androidFillableData = fillableData instanceof AndroidFillableData ? (AndroidFillableData) fillableData : null;
        if (androidFillableData != null) {
            return androidFillableData.getAutofillValue$ui();
        }
        return null;
    }
}
