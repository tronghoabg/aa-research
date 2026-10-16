package androidx.compose.ui.autofill;

import android.view.autofill.AutofillValue;
import androidx.compose.ui.autofill.FillableData;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AndroidFillableData implements FillableData {
    public static final int $stable = 8;
    private final AutofillValue autofillValue;

    public AndroidFillableData(AutofillValue autofillValue) {
        this.autofillValue = autofillValue;
    }

    public final AutofillValue getAutofillValue$ui() {
        return this.autofillValue;
    }

    @Override // androidx.compose.ui.autofill.FillableData
    public Boolean getBooleanValue() {
        if (this.autofillValue.isToggle()) {
            return Boolean.valueOf(this.autofillValue.getToggleValue());
        }
        return null;
    }

    @Override // androidx.compose.ui.autofill.FillableData
    public /* synthetic */ long getDateMillisOrDefault(long j2) {
        return FillableData.CC.$default$getDateMillisOrDefault(this, j2);
    }

    @Override // androidx.compose.ui.autofill.FillableData
    public Long getDateMillisValue() {
        if (this.autofillValue.isDate()) {
            return Long.valueOf(this.autofillValue.getDateValue());
        }
        return null;
    }

    @Override // androidx.compose.ui.autofill.FillableData
    public int getListIndexOrDefault(int i2) {
        return this.autofillValue.isList() ? this.autofillValue.getListValue() : i2;
    }

    @Override // androidx.compose.ui.autofill.FillableData
    public Integer getListIndexValue() {
        if (this.autofillValue.isList()) {
            return Integer.valueOf(this.autofillValue.getListValue());
        }
        return null;
    }

    @Override // androidx.compose.ui.autofill.FillableData
    public CharSequence getTextValue() {
        if (this.autofillValue.isText()) {
            return this.autofillValue.getTextValue();
        }
        return null;
    }
}
