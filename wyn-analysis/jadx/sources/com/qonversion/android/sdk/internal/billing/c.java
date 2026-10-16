package com.qonversion.android.sdk.internal.billing;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.qonversion.android.sdk.internal.billing.BillingClientWrapper;
import com.qonversion.android.sdk.internal.billing.BillingClientWrapperBase;
import com.qonversion.android.sdk.internal.billing.LegacyBillingClientWrapper;
import java.util.List;
import tf.p;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements PurchaseHistoryResponseListener, ConsumeResponseListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32651b;

    public /* synthetic */ c(Object obj, int i5) {
        this.f32650a = i5;
        this.f32651b = obj;
    }

    @Override // com.android.billingclient.api.ConsumeResponseListener
    public void onConsumeResponse(BillingResult billingResult, String str) {
        BillingClientWrapperBase.C21861.invoke$lambda$0((BillingClientWrapperBase) this.f32651b, billingResult, str);
    }

    @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
    public void onPurchaseHistoryResponse(BillingResult billingResult, List list) {
        switch (this.f32650a) {
            case 0:
                BillingClientWrapper.C21821.invoke$lambda$0((p) this.f32651b, billingResult, list);
                break;
            default:
                LegacyBillingClientWrapper.C21881.invoke$lambda$0((p) this.f32651b, billingResult, list);
                break;
        }
    }
}
