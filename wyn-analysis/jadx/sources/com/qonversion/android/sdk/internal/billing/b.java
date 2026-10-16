package com.qonversion.android.sdk.internal.billing;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.qonversion.android.sdk.internal.billing.BillingClientWrapper;
import com.qonversion.android.sdk.internal.billing.LegacyBillingClientWrapper;
import java.util.List;
import tf.l;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements ProductDetailsResponseListener, PurchasesResponseListener, SkuDetailsResponseListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingClientWrapperBase f32646b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f32647c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f32648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f32649e;

    public /* synthetic */ b(BillingClientWrapperBase billingClientWrapperBase, List list, l lVar, l lVar2, int i5) {
        this.f32645a = i5;
        this.f32646b = billingClientWrapperBase;
        this.f32649e = list;
        this.f32647c = lVar;
        this.f32648d = lVar2;
    }

    @Override // com.android.billingclient.api.ProductDetailsResponseListener
    public void onProductDetailsResponse(BillingResult billingResult, List list) {
        BillingClientWrapper.C21811.invoke$lambda$0((BillingClientWrapper) this.f32646b, (List) this.f32649e, this.f32647c, this.f32648d, billingResult, list);
    }

    @Override // com.android.billingclient.api.PurchasesResponseListener
    public void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        switch (this.f32645a) {
            case 1:
                BillingClientWrapper.C21841.invoke$lambda$3((BillingClientWrapper) this.f32646b, this.f32647c, (BillingClient) this.f32649e, this.f32648d, billingResult, list);
                break;
            default:
                LegacyBillingClientWrapper.C21901.invoke$lambda$3((LegacyBillingClientWrapper) this.f32646b, this.f32647c, (BillingClient) this.f32649e, this.f32648d, billingResult, list);
                break;
        }
    }

    @Override // com.android.billingclient.api.SkuDetailsResponseListener
    public void onSkuDetailsResponse(BillingResult billingResult, List list) {
        LegacyBillingClientWrapper.C21911.invoke$lambda$0((LegacyBillingClientWrapper) this.f32646b, (List) this.f32649e, this.f32647c, this.f32648d, billingResult, list);
    }

    public /* synthetic */ b(BillingClientWrapperBase billingClientWrapperBase, l lVar, BillingClient billingClient, l lVar2, int i5) {
        this.f32645a = i5;
        this.f32646b = billingClientWrapperBase;
        this.f32647c = lVar;
        this.f32649e = billingClient;
        this.f32648d = lVar2;
    }
}
