package com.qonversion.android.sdk.internal;

import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.internal.dto.QPermission;
import com.qonversion.android.sdk.internal.purchase.PurchaseHistory;
import ff.p;
import ff.t;
import ff.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import tf.l;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/qonversion/android/sdk/internal/dto/QPermission;", "record", "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QProductCenterManager$grantPermissionsAfterFailedRestore$newPermissions$1 extends AbstractC3343n implements l {
    final /* synthetic */ Map<String, List<String>> $productPermissions;
    final /* synthetic */ Collection<QProduct> $products;
    final /* synthetic */ QProductCenterManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public QProductCenterManager$grantPermissionsAfterFailedRestore$newPermissions$1(Collection<QProduct> collection, Map<String, ? extends List<String>> map, QProductCenterManager qProductCenterManager) {
        super(1);
        this.$products = collection;
        this.$productPermissions = map;
        this.this$0 = qProductCenterManager;
    }

    @Override // tf.l
    @NotNull
    public final List<QPermission> invoke(@NotNull PurchaseHistory record) {
        AbstractC3340k.e(record, "record");
        Collection<QProduct> collection = this.$products;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (AbstractC3340k.a(((QProduct) obj).getStoreID(), com.qonversion.android.sdk.internal.billing.UtilsKt.getProductId(record.getHistoryRecord()))) {
                arrayList.add(obj);
            }
        }
        Map<String, List<String>> map = this.$productPermissions;
        QProductCenterManager qProductCenterManager = this.this$0;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            QProduct qProduct = (QProduct) it.next();
            List<String> list = map.get(qProduct.getQonversionID());
            if (list == null) {
                list = v.f35432a;
            }
            List<String> list2 = list;
            ArrayList arrayList3 = new ArrayList(p.a0(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(qProductCenterManager.createPermission((String) it2.next(), record.getHistoryRecord().getPurchaseTime(), qProduct));
            }
            t.e0(arrayList3, arrayList2);
        }
        return arrayList2;
    }
}
