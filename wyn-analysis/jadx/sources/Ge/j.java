package Ge;

import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.offerings.QOffering;
import com.qonversion.android.sdk.dto.offerings.QOfferings;
import com.qonversion.android.sdk.listeners.QonversionExperimentAttachCallback;
import com.qonversion.android.sdk.listeners.QonversionOfferingsCallback;
import ef.C2527k;
import ff.AbstractC2640A;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class j implements QonversionExperimentAttachCallback, QonversionOfferingsCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4751a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f4752b;

    public j(u uVar) {
        this.f4752b = uVar;
    }

    @Override // com.qonversion.android.sdk.listeners.QonversionExperimentAttachCallback, com.qonversion.android.sdk.listeners.QonversionOfferingsCallback
    public final void onError(QonversionError error) {
        switch (this.f4751a) {
            case 0:
                AbstractC3340k.e(error, "error");
                this.f4752b.onError(c.l(error));
                break;
            default:
                AbstractC3340k.e(error, "error");
                this.f4752b.onError(c.l(error));
                break;
        }
    }

    @Override // com.qonversion.android.sdk.listeners.QonversionExperimentAttachCallback
    public void onSuccess() {
        this.f4752b.onSuccess(t.a(true));
    }

    public j(u uVar, t tVar) {
        this.f4752b = uVar;
    }

    @Override // com.qonversion.android.sdk.listeners.QonversionOfferingsCallback
    public void onSuccess(QOfferings offerings) {
        AbstractC3340k.e(offerings, "offerings");
        QOffering main = offerings.getMain();
        C2527k c2527k = new C2527k("main", main != null ? c.f(main) : null);
        List<QOffering> availableOfferings = offerings.getAvailableOfferings();
        ArrayList arrayList = new ArrayList(ff.p.a0(availableOfferings, 10));
        Iterator<T> it = availableOfferings.iterator();
        while (it.hasNext()) {
            arrayList.add(c.f((QOffering) it.next()));
        }
        this.f4752b.onSuccess(AbstractC2640A.R(c2527k, new C2527k("availableOfferings", arrayList)));
    }
}
