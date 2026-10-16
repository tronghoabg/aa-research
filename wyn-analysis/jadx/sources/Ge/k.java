package Ge;

import com.qonversion.android.sdk.dto.QRemoteConfigList;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigurationAttachCallback;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class k implements QonversionRemoteConfigurationAttachCallback, QonversionRemoteConfigListCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4753a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f4754b;

    public k(u uVar) {
        this.f4754b = uVar;
    }

    @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigurationAttachCallback, com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback
    public final void onError(QonversionError error) {
        switch (this.f4753a) {
            case 0:
                AbstractC3340k.e(error, "error");
                this.f4754b.onError(c.l(error));
                break;
            default:
                AbstractC3340k.e(error, "error");
                this.f4754b.onError(c.l(error));
                break;
        }
    }

    @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigurationAttachCallback
    public void onSuccess() {
        this.f4754b.onSuccess(t.a(true));
    }

    public k(u uVar, t tVar) {
        this.f4754b = uVar;
    }

    @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback
    public void onSuccess(QRemoteConfigList remoteConfigList) {
        AbstractC3340k.e(remoteConfigList, "remoteConfigList");
        this.f4754b.onSuccess(c.e(remoteConfigList));
    }
}
