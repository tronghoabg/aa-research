package o4;

import X2.j;
import android.os.Bundle;
import com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.i;
import com.android.billingclient.api.zzcb;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzm;

/* loaded from: classes.dex */
public final class d extends zzm {

    /* renamed from: a, reason: collision with root package name */
    public final AlternativeBillingOnlyAvailabilityListener f41353a;

    /* renamed from: b, reason: collision with root package name */
    public final j f41354b;

    /* renamed from: c, reason: collision with root package name */
    public final int f41355c;

    public /* synthetic */ d(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener, j jVar, int i5) {
        this.f41353a = alternativeBillingOnlyAvailabilityListener;
        this.f41354b = jVar;
        this.f41355c = i5;
    }

    @Override // com.google.android.gms.internal.play_billing.zzn
    public final void zza(Bundle bundle) {
        AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener = this.f41353a;
        int i5 = this.f41355c;
        j jVar = this.f41354b;
        if (bundle == null) {
            BillingResult billingResult = i.f20141j;
            jVar.a0(zzcb.zza(67, 14, billingResult), i5);
            alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
            return;
        }
        int iZzb = zzb.zzb(bundle, "BillingClient");
        BillingResult billingResultA = i.a(iZzb, zzb.zzg(bundle, "BillingClient"));
        if (iZzb != 0) {
            zzb.zzk("BillingClient", "isAlternativeBillingOnlyAvailableAsync() failed. Response code: " + iZzb);
            jVar.a0(zzcb.zza(23, 14, billingResultA), i5);
        }
        alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResultA);
    }
}
