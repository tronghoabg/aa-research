package cd;

import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;

/* renamed from: cd.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1602h implements UserMessagingPlatform.OnConsentFormLoadFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tc.g f19836a;

    public C1602h(tc.g gVar) {
        this.f19836a = gVar;
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
    public final void onConsentFormLoadFailure(FormError formError) {
        this.f19836a.b(Integer.toString(formError.getErrorCode()), formError.getMessage(), null);
    }
}
