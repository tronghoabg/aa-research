package Fe;

import A7.AbstractC0279p0;
import androidx.fragment.app.FragmentActivity;
import com.qonversion.android.sdk.Qonversion;
import com.qonversion.android.sdk.dto.QPurchaseOptions;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.listeners.QonversionProductsCallback;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class f implements QonversionProductsCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4082a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4083b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f4084c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f4085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ae.f f4086e;

    public f(String str, String str2, FragmentActivity fragmentActivity, h hVar, ae.f fVar) {
        this.f4082a = str;
        this.f4083b = str2;
        this.f4084c = fragmentActivity;
        this.f4085d = hVar;
        this.f4086e = fVar;
    }

    @Override // com.qonversion.android.sdk.listeners.QonversionProductsCallback
    public final void onError(QonversionError error) {
        AbstractC3340k.e(error, "error");
        Method enclosingMethod = b.class.getEnclosingMethod();
        h.G(this.f4085d, enclosingMethod != null ? enclosingMethod.getName() : null, error, this.f4086e);
    }

    @Override // com.qonversion.android.sdk.listeners.QonversionProductsCallback
    public final void onSuccess(Map products) {
        AbstractC3340k.e(products, "products");
        String str = this.f4082a;
        QProduct qProduct = (QProduct) products.get(str);
        ae.f fVar = this.f4086e;
        h hVar = this.f4085d;
        if (qProduct == null) {
            Method enclosingMethod = e.class.getEnclosingMethod();
            hVar.I(enclosingMethod != null ? enclosingMethod.getName() : null, AbstractC0279p0.l("Product with id ", str, " not found"), fVar);
            return;
        }
        QPurchaseOptions.Builder builder = new QPurchaseOptions.Builder();
        String str2 = this.f4083b;
        if (str2 != null) {
            builder.setScreenUid(str2);
        }
        Qonversion.INSTANCE.getSharedInstance().purchase(this.f4084c, qProduct, builder.build(), new d(hVar, fVar, 0));
    }
}
