package androidx.webkit.internal;

import android.webkit.SafeBrowsingResponse;
import androidx.webkit.SafeBrowsingResponseCompat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.a.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class SafeBrowsingResponseImpl extends SafeBrowsingResponseCompat {
    private SafeBrowsingResponseBoundaryInterface mBoundaryInterface;
    private SafeBrowsingResponse mFrameworksImpl;

    public SafeBrowsingResponseImpl(InvocationHandler invocationHandler) {
        this.mBoundaryInterface = (SafeBrowsingResponseBoundaryInterface) b.a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    private SafeBrowsingResponseBoundaryInterface getBoundaryInterface() {
        SafeBrowsingResponseBoundaryInterface safeBrowsingResponseBoundaryInterface = this.mBoundaryInterface;
        if (safeBrowsingResponseBoundaryInterface != null) {
            return safeBrowsingResponseBoundaryInterface;
        }
        SafeBrowsingResponseBoundaryInterface safeBrowsingResponseBoundaryInterface2 = (SafeBrowsingResponseBoundaryInterface) b.a(SafeBrowsingResponseBoundaryInterface.class, WebViewGlueCommunicator.getCompatConverter().convertSafeBrowsingResponse(this.mFrameworksImpl));
        this.mBoundaryInterface = safeBrowsingResponseBoundaryInterface2;
        return safeBrowsingResponseBoundaryInterface2;
    }

    private SafeBrowsingResponse getFrameworksImpl() {
        SafeBrowsingResponse safeBrowsingResponse = this.mFrameworksImpl;
        if (safeBrowsingResponse != null) {
            return safeBrowsingResponse;
        }
        SafeBrowsingResponse safeBrowsingResponseConvertSafeBrowsingResponse = WebViewGlueCommunicator.getCompatConverter().convertSafeBrowsingResponse(Proxy.getInvocationHandler(this.mBoundaryInterface));
        this.mFrameworksImpl = safeBrowsingResponseConvertSafeBrowsingResponse;
        return safeBrowsingResponseConvertSafeBrowsingResponse;
    }

    @Override // androidx.webkit.SafeBrowsingResponseCompat
    public void backToSafety(boolean z) {
        WebViewFeatureInternal.SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY.isSupportedByFramework();
        ApiHelperForOMR1.backToSafety(getFrameworksImpl(), z);
    }

    @Override // androidx.webkit.SafeBrowsingResponseCompat
    public void proceed(boolean z) {
        WebViewFeatureInternal.SAFE_BROWSING_RESPONSE_PROCEED.isSupportedByFramework();
        ApiHelperForOMR1.proceed(getFrameworksImpl(), z);
    }

    @Override // androidx.webkit.SafeBrowsingResponseCompat
    public void showInterstitial(boolean z) {
        WebViewFeatureInternal.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL.isSupportedByFramework();
        ApiHelperForOMR1.showInterstitial(getFrameworksImpl(), z);
    }

    public SafeBrowsingResponseImpl(SafeBrowsingResponse safeBrowsingResponse) {
        this.mFrameworksImpl = safeBrowsingResponse;
    }
}
