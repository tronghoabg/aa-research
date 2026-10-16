package androidx.webkit.internal;

import android.webkit.WebResourceError;
import androidx.webkit.WebResourceErrorCompat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.a.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class WebResourceErrorImpl extends WebResourceErrorCompat {
    private WebResourceErrorBoundaryInterface mBoundaryInterface;
    private WebResourceError mFrameworksImpl;

    public WebResourceErrorImpl(InvocationHandler invocationHandler) {
        this.mBoundaryInterface = (WebResourceErrorBoundaryInterface) b.a(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    private WebResourceError getFrameworksImpl() {
        WebResourceError webResourceError = this.mFrameworksImpl;
        if (webResourceError != null) {
            return webResourceError;
        }
        WebResourceError webResourceErrorConvertWebResourceError = WebViewGlueCommunicator.getCompatConverter().convertWebResourceError(Proxy.getInvocationHandler(this.mBoundaryInterface));
        this.mFrameworksImpl = webResourceErrorConvertWebResourceError;
        return webResourceErrorConvertWebResourceError;
    }

    @Override // androidx.webkit.WebResourceErrorCompat
    public int getDebugCode() {
        if (WebViewFeatureInternal.NAVIGATION_GET_WEB_RESOURCE_ERROR.isSupportedByWebView()) {
            return this.mBoundaryInterface.getDebugCode();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.WebResourceErrorCompat
    public CharSequence getDescription() {
        return getFrameworksImpl().getDescription();
    }

    @Override // androidx.webkit.WebResourceErrorCompat
    public int getErrorCode() {
        return getFrameworksImpl().getErrorCode();
    }

    public WebResourceErrorImpl(WebResourceError webResourceError) {
        this.mFrameworksImpl = webResourceError;
    }
}
