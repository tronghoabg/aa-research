package Fe;

import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class d implements QonversionEntitlementsCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4079a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f4080b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ae.f f4081c;

    public /* synthetic */ d(h hVar, ae.f fVar, int i5) {
        this.f4079a = i5;
        this.f4080b = hVar;
        this.f4081c = fVar;
    }

    @Override // com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback
    public final void onError(QonversionError error) {
        switch (this.f4079a) {
            case 0:
                AbstractC3340k.e(error, "error");
                Method enclosingMethod = c.class.getEnclosingMethod();
                h.G(this.f4080b, enclosingMethod != null ? enclosingMethod.getName() : null, error, this.f4081c);
                break;
            default:
                AbstractC3340k.e(error, "error");
                Method enclosingMethod2 = g.class.getEnclosingMethod();
                h.G(this.f4080b, enclosingMethod2 != null ? enclosingMethod2.getName() : null, error, this.f4081c);
                break;
        }
    }

    @Override // com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback
    public final void onSuccess(Map entitlements) {
        switch (this.f4079a) {
            case 0:
                AbstractC3340k.e(entitlements, "entitlements");
                this.f4080b.H(this.f4081c);
                break;
            default:
                AbstractC3340k.e(entitlements, "entitlements");
                this.f4080b.H(this.f4081c);
                break;
        }
    }
}
