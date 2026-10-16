package Ge;

import android.app.Activity;
import com.qonversion.android.sdk.Qonversion;
import com.qonversion.android.sdk.dto.QPurchaseOptions;
import com.qonversion.android.sdk.dto.QPurchaseUpdatePolicy;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.QonversionErrorCode;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.listeners.QonversionProductsCallback;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class q implements QonversionProductsCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4763b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f4764c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f4765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Boolean f4766e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f4767f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f4768g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Activity f4769h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n f4770i;

    public q(String str, String str2, t tVar, String str3, Boolean bool, String str4, List list, Activity activity, n nVar) {
        this.f4762a = str;
        this.f4763b = str2;
        this.f4764c = tVar;
        this.f4765d = str3;
        this.f4766e = bool;
        this.f4767f = str4;
        this.f4768g = list;
        this.f4769h = activity;
        this.f4770i = nVar;
    }

    @Override // com.qonversion.android.sdk.listeners.QonversionProductsCallback
    public final void onError(QonversionError error) {
        AbstractC3340k.e(error, "error");
        this.f4770i.onError(error);
    }

    @Override // com.qonversion.android.sdk.listeners.QonversionProductsCallback
    public final void onSuccess(Map products) {
        QPurchaseUpdatePolicy qPurchaseUpdatePolicyValueOf;
        AbstractC3340k.e(products, "products");
        QProduct qProduct = (QProduct) products.get(this.f4762a);
        QProduct qProduct2 = (QProduct) products.get(this.f4763b);
        this.f4764c.getClass();
        QPurchaseOptions.Builder builder = new QPurchaseOptions.Builder();
        if (qProduct2 != null) {
            builder.setOldProduct(qProduct2);
        }
        String str = this.f4767f;
        if (str != null) {
            try {
                qPurchaseUpdatePolicyValueOf = QPurchaseUpdatePolicy.valueOf(str);
            } catch (IllegalArgumentException unused) {
                qPurchaseUpdatePolicyValueOf = null;
            }
            if (qPurchaseUpdatePolicyValueOf != null) {
                builder.setUpdatePolicy(qPurchaseUpdatePolicyValueOf);
            }
        }
        String str2 = this.f4765d;
        if (str2 != null) {
            builder.setOfferId(str2);
        }
        if (AbstractC3340k.a(this.f4766e, Boolean.FALSE)) {
            builder.removeOffer();
        }
        List<String> list = this.f4768g;
        if (list != null) {
            builder.setContextKeys(list);
        }
        QPurchaseOptions qPurchaseOptionsBuild = builder.build();
        Activity activity = this.f4769h;
        n nVar = this.f4770i;
        if (qProduct != null && qProduct2 != null) {
            Qonversion.INSTANCE.getSharedInstance().updatePurchase(activity, qProduct, qPurchaseOptionsBuild, nVar);
        } else if (qProduct != null) {
            Qonversion.INSTANCE.getSharedInstance().purchase(activity, qProduct, qPurchaseOptionsBuild, nVar);
        } else {
            nVar.onError(new QonversionError(QonversionErrorCode.ProductNotFound, null, null, 6, null));
        }
    }
}
