package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cgo {
    public final android.view.autofill.AutofillValue a;

    public cgo(android.view.autofill.AutofillValue autofillValue) {
        this.a = autofillValue;
    }

    public final java.lang.Boolean a() {
        android.view.autofill.AutofillValue autofillValue = this.a;
        if (a$.ExternalSyntheticApiModelOutline1.m(autofillValue)) {
            return java.lang.Boolean.valueOf(a$.ExternalSyntheticApiModelOutline1.m$1(autofillValue));
        }
        return null;
    }

    public final java.lang.CharSequence b() {
        android.view.autofill.AutofillValue autofillValue = this.a;
        if (a$.ExternalSyntheticApiModelOutline1.m$2(autofillValue)) {
            return a$.ExternalSyntheticApiModelOutline1.m(autofillValue);
        }
        return null;
    }
}
