package o4;

import X2.j;
import android.os.Bundle;
import com.android.billingclient.api.AlternativeBillingOnlyReportingDetails;
import com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.i;
import com.android.billingclient.api.zzcb;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzc;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class b extends zzc {

    /* renamed from: a, reason: collision with root package name */
    public final AlternativeBillingOnlyReportingDetailsListener f41347a;

    /* renamed from: b, reason: collision with root package name */
    public final j f41348b;

    /* renamed from: c, reason: collision with root package name */
    public final int f41349c;

    public /* synthetic */ b(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener, j jVar, int i5) {
        this.f41347a = alternativeBillingOnlyReportingDetailsListener;
        this.f41348b = jVar;
        this.f41349c = i5;
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    public final void zza(Bundle bundle) {
        int i5 = this.f41349c;
        j jVar = this.f41348b;
        AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener = this.f41347a;
        if (bundle == null) {
            BillingResult billingResult = i.f20141j;
            jVar.a0(zzcb.zza(71, 15, billingResult), i5);
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, null);
            return;
        }
        int iZzb = zzb.zzb(bundle, "BillingClient");
        BillingResult billingResultA = i.a(iZzb, zzb.zzg(bundle, "BillingClient"));
        if (iZzb != 0) {
            zzb.zzk("BillingClient", "createAlternativeBillingOnlyReportingDetailsAsync() failed. Response code: " + iZzb);
            jVar.a0(zzcb.zza(23, 15, billingResultA), i5);
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResultA, null);
            return;
        }
        try {
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResultA, new AlternativeBillingOnlyReportingDetails(bundle.getString("CREATE_ALTERNATIVE_BILLING_ONLY_REPORTING_DETAILS")));
        } catch (JSONException e7) {
            zzb.zzl("BillingClient", "Error when parsing invalid alternative billing only reporting details. \n Exception: ", e7);
            BillingResult billingResult2 = i.f20141j;
            jVar.a0(zzcb.zza(72, 15, billingResult2), i5);
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult2, null);
        }
    }
}
