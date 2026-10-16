package com.qonversion.android.sdk.internal.billing;

import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.android.billingclient.api.SkuDetails;
import com.qonversion.android.sdk.dto.products.QProductStoreDetails;
import com.qonversion.android.sdk.internal.billing.BillingClientWrapper;
import com.qonversion.android.sdk.internal.billing.BillingClientWrapperBase;
import com.qonversion.android.sdk.internal.billing.LegacyBillingClientWrapper;
import java.util.List;
import tf.p;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements PurchaseHistoryResponseListener, AcknowledgePurchaseResponseListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32652a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32653b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32654c;

    public /* synthetic */ d(int i5, Object obj, Object obj2) {
        this.f32652a = i5;
        this.f32653b = obj;
        this.f32654c = obj2;
    }

    @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
    public void onAcknowledgePurchaseResponse(BillingResult billingResult) {
        BillingClientWrapperBase.AnonymousClass1.invoke$lambda$0((String) this.f32653b, (BillingClientWrapperBase) this.f32654c, billingResult);
    }

    @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
    public void onPurchaseHistoryResponse(BillingResult billingResult, List list) {
        switch (this.f32652a) {
            case 0:
                BillingClientWrapper.C21831.invoke$lambda$1((p) this.f32653b, (QProductStoreDetails) this.f32654c, billingResult, list);
                break;
            default:
                LegacyBillingClientWrapper.C21891.invoke$lambda$1((p) this.f32653b, (SkuDetails) this.f32654c, billingResult, list);
                break;
        }
    }
}
