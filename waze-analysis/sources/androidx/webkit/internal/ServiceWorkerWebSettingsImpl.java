package androidx.webkit.internal;

import android.webkit.ServiceWorkerWebSettings;
import androidx.webkit.ServiceWorkerWebSettingsCompat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.Set;
import org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.a.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class ServiceWorkerWebSettingsImpl extends ServiceWorkerWebSettingsCompat {
    private ServiceWorkerWebSettingsBoundaryInterface mBoundaryInterface;
    private ServiceWorkerWebSettings mFrameworksImpl;

    public ServiceWorkerWebSettingsImpl(InvocationHandler invocationHandler) {
        this.mBoundaryInterface = (ServiceWorkerWebSettingsBoundaryInterface) b.a(ServiceWorkerWebSettingsBoundaryInterface.class, invocationHandler);
    }

    private ServiceWorkerWebSettingsBoundaryInterface getBoundaryInterface() {
        ServiceWorkerWebSettingsBoundaryInterface serviceWorkerWebSettingsBoundaryInterface = this.mBoundaryInterface;
        if (serviceWorkerWebSettingsBoundaryInterface != null) {
            return serviceWorkerWebSettingsBoundaryInterface;
        }
        ServiceWorkerWebSettingsBoundaryInterface serviceWorkerWebSettingsBoundaryInterface2 = (ServiceWorkerWebSettingsBoundaryInterface) b.a(ServiceWorkerWebSettingsBoundaryInterface.class, WebViewGlueCommunicator.getCompatConverter().convertServiceWorkerSettings(this.mFrameworksImpl));
        this.mBoundaryInterface = serviceWorkerWebSettingsBoundaryInterface2;
        return serviceWorkerWebSettingsBoundaryInterface2;
    }

    private ServiceWorkerWebSettings getFrameworksImpl() {
        ServiceWorkerWebSettings serviceWorkerWebSettings = this.mFrameworksImpl;
        if (serviceWorkerWebSettings != null) {
            return serviceWorkerWebSettings;
        }
        ServiceWorkerWebSettings serviceWorkerWebSettingsConvertServiceWorkerSettings = WebViewGlueCommunicator.getCompatConverter().convertServiceWorkerSettings(Proxy.getInvocationHandler(this.mBoundaryInterface));
        this.mFrameworksImpl = serviceWorkerWebSettingsConvertServiceWorkerSettings;
        return serviceWorkerWebSettingsConvertServiceWorkerSettings;
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public boolean getAllowContentAccess() {
        WebViewFeatureInternal.SERVICE_WORKER_CONTENT_ACCESS.isSupportedByFramework();
        return ApiHelperForN.getAllowContentAccess(getFrameworksImpl());
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public boolean getAllowFileAccess() {
        WebViewFeatureInternal.SERVICE_WORKER_FILE_ACCESS.isSupportedByFramework();
        return ApiHelperForN.getAllowFileAccess(getFrameworksImpl());
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public boolean getBlockNetworkLoads() {
        WebViewFeatureInternal.SERVICE_WORKER_BLOCK_NETWORK_LOADS.isSupportedByFramework();
        return ApiHelperForN.getBlockNetworkLoads(getFrameworksImpl());
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public int getCacheMode() {
        WebViewFeatureInternal.SERVICE_WORKER_CACHE_MODE.isSupportedByFramework();
        return ApiHelperForN.getCacheMode(getFrameworksImpl());
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    @Deprecated(forRemoval = true)
    public Set<String> getRequestedWithHeaderOriginAllowList() {
        return Collections.EMPTY_SET;
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public boolean isIncludeCookiesOnShouldInterceptRequestEnabled() {
        if (WebViewFeatureInternal.COOKIE_INTERCEPT.isSupportedByWebView()) {
            return getBoundaryInterface().getIncludeCookiesOnIntercept();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setAllowContentAccess(boolean z) {
        WebViewFeatureInternal.SERVICE_WORKER_CONTENT_ACCESS.isSupportedByFramework();
        ApiHelperForN.setAllowContentAccess(getFrameworksImpl(), z);
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setAllowFileAccess(boolean z) {
        WebViewFeatureInternal.SERVICE_WORKER_FILE_ACCESS.isSupportedByFramework();
        ApiHelperForN.setAllowFileAccess(getFrameworksImpl(), z);
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setBlockNetworkLoads(boolean z) {
        WebViewFeatureInternal.SERVICE_WORKER_BLOCK_NETWORK_LOADS.isSupportedByFramework();
        ApiHelperForN.setBlockNetworkLoads(getFrameworksImpl(), z);
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setCacheMode(int i2) {
        WebViewFeatureInternal.SERVICE_WORKER_CACHE_MODE.isSupportedByFramework();
        ApiHelperForN.setCacheMode(getFrameworksImpl(), i2);
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setIncludeCookiesOnShouldInterceptRequestEnabled(boolean z) {
        if (!WebViewFeatureInternal.COOKIE_INTERCEPT.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        getBoundaryInterface().setIncludeCookiesOnIntercept(z);
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    @Deprecated(forRemoval = true)
    public void setRequestedWithHeaderOriginAllowList(Set<String> set) {
    }

    public ServiceWorkerWebSettingsImpl(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        this.mFrameworksImpl = serviceWorkerWebSettings;
    }
}
