package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.internal.play_billing.zzgj;

/* loaded from: classes.dex */
public final class c extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExternalOfferInformationDialogListener f20113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f20114b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, Handler handler, ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        super(handler);
        this.f20113a = externalOfferInformationDialogListener;
        this.f20114b = aVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i5, Bundle bundle) {
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(i5);
        ExternalOfferInformationDialogListener externalOfferInformationDialogListener = this.f20113a;
        if (i5 != 0) {
            a aVar = this.f20114b;
            if (bundle == null) {
                BillingResult billingResult = i.f20141j;
                aVar.f(zzcb.zza(97, 25, billingResult));
                externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(billingResult);
                return;
            } else {
                builderNewBuilder.setDebugMessage(com.google.android.gms.internal.play_billing.zzb.zzg(bundle, "BillingClient"));
                int i10 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
                aVar.f(zzcb.zzb(i10 != 0 ? zzgj.zza(i10) : 23, 25, builderNewBuilder.build(), bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS")));
            }
        }
        externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(builderNewBuilder.build());
    }
}
