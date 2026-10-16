package com.qonversion.android.sdk.internal.billing;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import com.qonversion.android.sdk.internal.billing.BillingClientWrapper;
import com.qonversion.android.sdk.internal.billing.LegacyBillingClientWrapper;
import java.util.List;
import tf.l;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements PurchasesResponseListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32655a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f32656b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f32657c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f32658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f32659e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BillingClientWrapperBase f32660f;

    public /* synthetic */ e(BillingClientWrapperBase billingClientWrapperBase, BillingResult billingResult, l lVar, List list, l lVar2, int i5) {
        this.f32655a = i5;
        this.f32660f = billingClientWrapperBase;
        this.f32656b = billingResult;
        this.f32657c = lVar;
        this.f32658d = list;
        this.f32659e = lVar2;
    }

    @Override // com.android.billingclient.api.PurchasesResponseListener
    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        switch (this.f32655a) {
            case 0:
                BillingClientWrapper.C21841.invoke$lambda$3$lambda$2((BillingClientWrapper) this.f32660f, this.f32656b, this.f32657c, this.f32658d, this.f32659e, billingResult, list);
                break;
            default:
                LegacyBillingClientWrapper.C21901.invoke$lambda$3$lambda$2((LegacyBillingClientWrapper) this.f32660f, this.f32656b, this.f32657c, this.f32658d, this.f32659e, billingResult, list);
                break;
        }
    }
}
