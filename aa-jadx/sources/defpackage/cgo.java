package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cgo {
    public final android.view.autofill.AutofillValue a;

    public cgo(android.view.autofill.AutofillValue autofillValue) {
        this.a = autofillValue;
    }

    public final java.lang.Boolean a() {
        android.view.autofill.AutofillValue autofillValue = this.a;
        if (autofillValue.isToggle()) {
            return java.lang.Boolean.valueOf(autofillValue.getToggleValue());
        }
        return null;
    }

    public final java.lang.CharSequence b() {
        android.view.autofill.AutofillValue autofillValue = this.a;
        if (autofillValue.isText()) {
            return autofillValue.getTextValue();
        }
        return null;
    }
}
