package cd;

import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;

/* renamed from: cd.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1603i implements ConsentForm.OnConsentFormDismissedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tc.g f19837a;

    public C1603i(tc.g gVar) {
        this.f19837a = gVar;
    }

    @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
    public final void onConsentFormDismissed(FormError formError) {
        tc.g gVar = this.f19837a;
        if (formError != null) {
            gVar.b(Integer.toString(formError.getErrorCode()), formError.getMessage(), null);
        } else {
            gVar.a(null);
        }
    }
}
