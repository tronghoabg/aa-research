package o4;

import X2.j;
import android.os.Bundle;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ExternalOfferAvailabilityListener;
import com.android.billingclient.api.i;
import com.android.billingclient.api.zzcb;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzo;

/* loaded from: classes.dex */
public final class e extends zzo {

    /* renamed from: a, reason: collision with root package name */
    public final ExternalOfferAvailabilityListener f41356a;

    /* renamed from: b, reason: collision with root package name */
    public final j f41357b;

    /* renamed from: c, reason: collision with root package name */
    public final int f41358c;

    public /* synthetic */ e(ExternalOfferAvailabilityListener externalOfferAvailabilityListener, j jVar, int i5) {
        this.f41356a = externalOfferAvailabilityListener;
        this.f41357b = jVar;
        this.f41358c = i5;
    }

    @Override // com.google.android.gms.internal.play_billing.zzp
    public final void zza(Bundle bundle) {
        ExternalOfferAvailabilityListener externalOfferAvailabilityListener = this.f41356a;
        int i5 = this.f41358c;
        j jVar = this.f41357b;
        if (bundle == null) {
            BillingResult billingResult = i.f20141j;
            jVar.a0(zzcb.zza(92, 23, billingResult), i5);
            externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);
            return;
        }
        int iZzb = zzb.zzb(bundle, "BillingClient");
        BillingResult billingResultA = i.a(iZzb, zzb.zzg(bundle, "BillingClient"));
        if (iZzb != 0) {
            zzb.zzk("BillingClient", "isExternalOfferAvailableAsync() failed. Response code: " + iZzb);
            jVar.a0(zzcb.zza(23, 23, billingResultA), i5);
        }
        externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResultA);
    }
}
