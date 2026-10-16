package defpackage;

import android.view.autofill.AutofillValue;

/* loaded from: classes.dex */
public final class cgh {
    public final AutofillValue a;

    public cgh(AutofillValue autofillValue) {
        this.a = autofillValue;
    }

    public final Boolean a() {
        AutofillValue autofillValue = this.a;
        if (autofillValue.isToggle()) {
            return Boolean.valueOf(autofillValue.getToggleValue());
        }
        return null;
    }

    public final CharSequence b() {
        AutofillValue autofillValue = this.a;
        if (autofillValue.isText()) {
            return autofillValue.getTextValue();
        }
        return null;
    }
}
