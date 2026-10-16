package androidx.webkit.internal;

import androidx.webkit.Navigation;
import androidx.webkit.NavigationListener;
import androidx.webkit.Page;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class NavigationListenerAdapter implements WebViewNavigationListenerBoundaryInterface {
    private static final String[] SUPPORTED_FEATURES = {"WEB_VIEW_NAVIGATION_LISTENER_V1", "WEB_VIEW_NAVIGATION_LISTENER_V2"};
    private final NavigationListener mImpl;

    public NavigationListenerAdapter(NavigationListener navigationListener) {
        this.mImpl = navigationListener;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof NavigationListenerAdapter)) {
            return this.mImpl.equals(((NavigationListenerAdapter) obj).mImpl);
        }
        return false;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return SUPPORTED_FEATURES;
    }

    public int hashCode() {
        return this.mImpl.hashCode();
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface
    @Deprecated
    public void onFirstContentfulPaint(InvocationHandler invocationHandler, long j2) {
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface
    public void onFirstContentfulPaintMillis(InvocationHandler invocationHandler, long j2) {
        this.mImpl.onFirstContentfulPaintMillis(Page.forInvocationHandler(invocationHandler), j2);
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface
    public void onLargestContentfulPaintMillis(InvocationHandler invocationHandler, long j2) {
        this.mImpl.onLargestContentfulPaintMillis(Page.forInvocationHandler(invocationHandler), j2);
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface
    public void onNavigationCompleted(InvocationHandler invocationHandler) {
        this.mImpl.onNavigationCompleted(Navigation.forInvocationHandler(invocationHandler));
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface
    public void onNavigationRedirected(InvocationHandler invocationHandler) {
        this.mImpl.onNavigationRedirected(Navigation.forInvocationHandler(invocationHandler));
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface
    public void onNavigationStarted(InvocationHandler invocationHandler) {
        this.mImpl.onNavigationStarted(Navigation.forInvocationHandler(invocationHandler));
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface
    public void onPageDOMContentLoadedEventFired(InvocationHandler invocationHandler) {
        this.mImpl.onPageDomContentLoadedEvent(Page.forInvocationHandler(invocationHandler));
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface
    public void onPageDeleted(InvocationHandler invocationHandler) {
        this.mImpl.onPageDeleted(Page.forInvocationHandler(invocationHandler));
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface
    public void onPageLoadEventFired(InvocationHandler invocationHandler) {
        this.mImpl.onPageLoadEvent(Page.forInvocationHandler(invocationHandler));
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface
    public void onPerformanceMarkMillis(InvocationHandler invocationHandler, String str, long j2) {
        this.mImpl.onPerformanceMarkMillis(Page.forInvocationHandler(invocationHandler), str, j2);
    }
}
