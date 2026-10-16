package o4;

import X2.j;
import android.os.Bundle;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ExternalOfferReportingDetails;
import com.android.billingclient.api.ExternalOfferReportingDetailsListener;
import com.android.billingclient.api.i;
import com.android.billingclient.api.zzcb;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zze;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class c extends zze {

    /* renamed from: a, reason: collision with root package name */
    public final ExternalOfferReportingDetailsListener f41350a;

    /* renamed from: b, reason: collision with root package name */
    public final j f41351b;

    /* renamed from: c, reason: collision with root package name */
    public final int f41352c;

    public /* synthetic */ c(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, j jVar, int i5) {
        this.f41350a = externalOfferReportingDetailsListener;
        this.f41351b = jVar;
        this.f41352c = i5;
    }

    @Override // com.google.android.gms.internal.play_billing.zzf
    public final void zza(Bundle bundle) {
        int i5 = this.f41352c;
        j jVar = this.f41351b;
        ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener = this.f41350a;
        if (bundle == null) {
            BillingResult billingResult = i.f20141j;
            jVar.a0(zzcb.zza(95, 24, billingResult), i5);
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, null);
            return;
        }
        int iZzb = zzb.zzb(bundle, "BillingClient");
        BillingResult billingResultA = i.a(iZzb, zzb.zzg(bundle, "BillingClient"));
        if (iZzb != 0) {
            zzb.zzk("BillingClient", "createExternalOfferReportingDetailsAsync() failed. Response code: " + iZzb);
            jVar.a0(zzcb.zza(23, 24, billingResultA), i5);
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResultA, null);
            return;
        }
        try {
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResultA, new ExternalOfferReportingDetails(bundle.getString("CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS")));
        } catch (JSONException e7) {
            zzb.zzl("BillingClient", "Error when parsing invalid external offer reporting details. \n Exception: ", e7);
            BillingResult billingResult2 = i.f20141j;
            jVar.a0(zzcb.zza(104, 24, billingResult2), i5);
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult2, null);
        }
    }
}
