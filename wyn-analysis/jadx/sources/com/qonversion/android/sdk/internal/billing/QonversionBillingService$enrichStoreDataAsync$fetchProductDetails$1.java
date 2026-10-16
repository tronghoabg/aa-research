package com.qonversion.android.sdk.internal.billing;

import com.qonversion.android.sdk.dto.products.QProduct;
import ef.C2515C;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3343n;
import tf.l;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class QonversionBillingService$enrichStoreDataAsync$fetchProductDetails$1 extends AbstractC3343n implements tf.a {
    final /* synthetic */ l $onEnriched;
    final /* synthetic */ List<QProduct> $products;
    final /* synthetic */ QonversionBillingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QonversionBillingService$enrichStoreDataAsync$fetchProductDetails$1(QonversionBillingService qonversionBillingService, List<QProduct> list, l lVar) {
        super(0);
        this.this$0 = qonversionBillingService;
        this.$products = list;
        this.$onEnriched = lVar;
    }

    @Override // tf.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m223invoke();
        return C2515C.f34653a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m223invoke() {
        this.this$0.enrichStoreData(this.$products);
        this.$onEnriched.invoke(this.$products);
    }
}
