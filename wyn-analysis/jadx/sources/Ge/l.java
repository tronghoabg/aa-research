package Ge;

import com.qonversion.android.sdk.dto.QRemoteConfigList;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.eligibility.QEligibility;
import com.qonversion.android.sdk.listeners.QonversionEligibilityCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback;
import ef.C2527k;
import ff.AbstractC2641B;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class l implements QonversionEligibilityCallback, QonversionRemoteConfigListCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4755a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f4756b;

    public /* synthetic */ l(u uVar, int i5) {
        this.f4755a = i5;
        this.f4756b = uVar;
    }

    @Override // com.qonversion.android.sdk.listeners.QonversionEligibilityCallback, com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback
    public final void onError(QonversionError error) {
        switch (this.f4755a) {
            case 0:
                AbstractC3340k.e(error, "error");
                this.f4756b.onError(c.l(error));
                break;
            default:
                AbstractC3340k.e(error, "error");
                this.f4756b.onError(c.l(error));
                break;
        }
    }

    @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback
    public void onSuccess(QRemoteConfigList remoteConfigList) {
        AbstractC3340k.e(remoteConfigList, "remoteConfigList");
        this.f4756b.onSuccess(c.e(remoteConfigList));
    }

    @Override // com.qonversion.android.sdk.listeners.QonversionEligibilityCallback
    public void onSuccess(Map eligibilities) {
        AbstractC3340k.e(eligibilities, "eligibilities");
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2641B.D(eligibilities.size()));
        for (Map.Entry entry : eligibilities.entrySet()) {
            Object key = entry.getKey();
            QEligibility qEligibility = (QEligibility) entry.getValue();
            AbstractC3340k.e(qEligibility, "<this>");
            linkedHashMap.put(key, AbstractC2641B.E(new C2527k("status", qEligibility.getStatus().getType())));
        }
        this.f4756b.onSuccess(linkedHashMap);
    }
}
