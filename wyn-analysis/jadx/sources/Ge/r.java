package Ge;

import com.qonversion.android.sdk.dto.QRemoteConfig;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigCallback;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class r implements QonversionRemoteConfigCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f4771a;

    public r(u uVar) {
        this.f4771a = uVar;
    }

    @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigCallback
    public final void onError(QonversionError error) {
        AbstractC3340k.e(error, "error");
        this.f4771a.onError(c.l(error));
    }

    @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigCallback
    public final void onSuccess(QRemoteConfig remoteConfig) {
        AbstractC3340k.e(remoteConfig, "remoteConfig");
        this.f4771a.onSuccess(c.d(remoteConfig));
    }
}
