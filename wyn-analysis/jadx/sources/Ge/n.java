package Ge;

import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class n implements QonversionEntitlementsCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f4759a;

    public n(u uVar) {
        this.f4759a = uVar;
    }

    @Override // com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback
    public final void onError(QonversionError error) {
        AbstractC3340k.e(error, "error");
        this.f4759a.onError(c.l(error));
    }

    @Override // com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback
    public final void onSuccess(Map entitlements) {
        AbstractC3340k.e(entitlements, "entitlements");
        this.f4759a.onSuccess(c.a(entitlements));
    }
}
