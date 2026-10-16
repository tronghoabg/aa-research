package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.BillingResult;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class f extends com.google.android.gms.internal.play_billing.zzi {

    /* renamed from: a, reason: collision with root package name */
    public final BillingConfigResponseListener f20121a;

    /* renamed from: b, reason: collision with root package name */
    public final X2.j f20122b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20123c;

    public /* synthetic */ f(BillingConfigResponseListener billingConfigResponseListener, X2.j jVar, int i5) {
        this.f20121a = billingConfigResponseListener;
        this.f20122b = jVar;
        this.f20123c = i5;
    }

    @Override // com.google.android.gms.internal.play_billing.zzj
    public final void zza(Bundle bundle) {
        int i5 = this.f20123c;
        X2.j jVar = this.f20122b;
        BillingConfigResponseListener billingConfigResponseListener = this.f20121a;
        if (bundle == null) {
            BillingResult billingResult = i.f20141j;
            jVar.a0(zzcb.zza(63, 13, billingResult), i5);
            billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
        String strZzg = com.google.android.gms.internal.play_billing.zzb.zzg(bundle, "BillingClient");
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(iZzb);
        builderNewBuilder.setDebugMessage(strZzg);
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getBillingConfig() failed. Response code: " + iZzb);
            BillingResult billingResultBuild = builderNewBuilder.build();
            jVar.a0(zzcb.zza(23, 13, billingResultBuild), i5);
            billingConfigResponseListener.onBillingConfigResponse(billingResultBuild, null);
            return;
        }
        if (!bundle.containsKey("BILLING_CONFIG")) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
            builderNewBuilder.setResponseCode(6);
            BillingResult billingResultBuild2 = builderNewBuilder.build();
            jVar.a0(zzcb.zza(64, 13, billingResultBuild2), i5);
            billingConfigResponseListener.onBillingConfigResponse(billingResultBuild2, null);
            return;
        }
        try {
            billingConfigResponseListener.onBillingConfigResponse(builderNewBuilder.build(), new BillingConfig(bundle.getString("BILLING_CONFIG")));
        } catch (JSONException e7) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e7);
            BillingResult billingResult2 = i.f20141j;
            jVar.a0(zzcb.zza(65, 13, billingResult2), i5);
            billingConfigResponseListener.onBillingConfigResponse(billingResult2, null);
        }
    }
}
