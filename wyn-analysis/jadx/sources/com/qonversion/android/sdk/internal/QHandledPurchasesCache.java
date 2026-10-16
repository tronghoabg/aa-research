package com.qonversion.android.sdk.internal;

import com.android.billingclient.api.Purchase;
import ff.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;", "", "<init>", "()V", "Lcom/android/billingclient/api/Purchase;", "purchase", "", "shouldHandlePurchase", "(Lcom/android/billingclient/api/Purchase;)Z", "Lef/C;", "saveHandledPurchase", "(Lcom/android/billingclient/api/Purchase;)V", "", "purchases", "saveHandledPurchases", "(Ljava/util/Collection;)V", "", "", "handledOrderIDs", "Ljava/util/Set;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QHandledPurchasesCache {

    @NotNull
    private final Set<String> handledOrderIDs = new LinkedHashSet();

    public final void saveHandledPurchase(@NotNull Purchase purchase) {
        AbstractC3340k.e(purchase, "purchase");
        String orderId = purchase.getOrderId();
        if (orderId != null) {
            this.handledOrderIDs.add(orderId);
        }
    }

    public final void saveHandledPurchases(@NotNull Collection<? extends Purchase> purchases) {
        AbstractC3340k.e(purchases, "purchases");
        Set<String> set = this.handledOrderIDs;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = purchases.iterator();
        while (it.hasNext()) {
            String orderId = ((Purchase) it.next()).getOrderId();
            if (orderId != null) {
                arrayList.add(orderId);
            }
        }
        set.addAll(arrayList);
    }

    public final boolean shouldHandlePurchase(@NotNull Purchase purchase) {
        AbstractC3340k.e(purchase, "purchase");
        return !o.k0(this.handledOrderIDs, purchase.getOrderId());
    }
}
