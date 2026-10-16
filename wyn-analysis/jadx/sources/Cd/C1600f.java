package cd;

import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;

/* renamed from: cd.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1600f implements ConsentInformation.OnConsentInfoUpdateFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tc.g f19833a;

    public C1600f(tc.g gVar) {
        this.f19833a = gVar;
    }

    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
    public final void onConsentInfoUpdateFailure(FormError formError) {
        this.f19833a.b(Integer.toString(formError.getErrorCode()), formError.getMessage(), null);
    }
}
