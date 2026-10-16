package com.qonversion.android.sdk.internal;

import com.android.billingclient.api.Purchase;
import com.qonversion.android.sdk.dto.entitlements.QEntitlement;
import com.qonversion.android.sdk.listeners.QonversionPurchaseCallback;
import ef.C2515C;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3343n;
import tf.a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class QonversionInternal$mainPurchaseCallback$1$onSuccess$1 extends AbstractC3343n implements a {
    final /* synthetic */ Map<String, QEntitlement> $entitlements;
    final /* synthetic */ Purchase $purchase;
    final /* synthetic */ QonversionPurchaseCallback $purchaseCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QonversionInternal$mainPurchaseCallback$1$onSuccess$1(QonversionPurchaseCallback qonversionPurchaseCallback, Map<String, QEntitlement> map, Purchase purchase) {
        super(0);
        this.$purchaseCallback = qonversionPurchaseCallback;
        this.$entitlements = map;
        this.$purchase = purchase;
    }

    @Override // tf.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m210invoke();
        return C2515C.f34653a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m210invoke() {
        this.$purchaseCallback.onSuccess(this.$entitlements, this.$purchase);
    }
}
