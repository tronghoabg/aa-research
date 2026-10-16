package defpackage;

import android.content.Context;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;

/* loaded from: classes.dex */
public final class cgn {
    private final Context a;
    private AutofillManager b;

    public cgn(Context context) {
        this.a = context;
    }

    public final AutofillManager a() {
        AutofillManager autofillManager = this.b;
        if (autofillManager != null) {
            return autofillManager;
        }
        AutofillManager autofillManagerM8m = a$$ExternalSyntheticApiModelOutline0.m8m(this.a.getSystemService(a$$ExternalSyntheticApiModelOutline0.m20m$1()));
        if (autofillManagerM8m == null) {
            throw new IllegalStateException("Could not locate AutofillManager from context");
        }
        this.b = autofillManagerM8m;
        return autofillManagerM8m;
    }

    public final void b(View view, int i, AutofillValue autofillValue) {
        a().notifyValueChanged(view, i, autofillValue);
    }

    public final void c(View view, int i, boolean z) {
        a().notifyViewVisibilityChanged(view, i, z);
    }
}
