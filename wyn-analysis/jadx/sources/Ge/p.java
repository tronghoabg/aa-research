package Ge;

import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.listeners.QonversionProductsCallback;
import ff.AbstractC2641B;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class p implements QonversionProductsCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f4761a;

    public p(u uVar) {
        this.f4761a = uVar;
    }

    @Override // com.qonversion.android.sdk.listeners.QonversionProductsCallback
    public final void onError(QonversionError error) {
        AbstractC3340k.e(error, "error");
        this.f4761a.onError(c.l(error));
    }

    @Override // com.qonversion.android.sdk.listeners.QonversionProductsCallback
    public final void onSuccess(Map products) {
        AbstractC3340k.e(products, "products");
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2641B.D(products.size()));
        for (Map.Entry entry : products.entrySet()) {
            linkedHashMap.put(entry.getKey(), c.g((QProduct) entry.getValue()));
        }
        this.f4761a.onSuccess(linkedHashMap);
    }
}
