package cd;

import com.google.android.ump.ConsentForm;
import com.google.android.ump.UserMessagingPlatform;

/* renamed from: cd.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1601g implements UserMessagingPlatform.OnConsentFormLoadSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tc.g f19834a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1605k f19835b;

    public C1601g(C1605k c1605k, tc.g gVar) {
        this.f19835b = c1605k;
        this.f19834a = gVar;
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
    public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
        this.f19835b.f19839a.f19829d.put(Integer.valueOf(consentForm.hashCode()), consentForm);
        this.f19834a.a(consentForm);
    }
}
