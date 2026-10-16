package androidx.webkit.internal;

import android.webkit.ServiceWorkerController;
import androidx.webkit.ServiceWorkerClientCompat;
import androidx.webkit.ServiceWorkerControllerCompat;
import androidx.webkit.ServiceWorkerWebSettingsCompat;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class ServiceWorkerControllerImpl extends ServiceWorkerControllerCompat {
    private ServiceWorkerControllerBoundaryInterface mBoundaryInterface;
    private ServiceWorkerController mFrameworksImpl;
    private final ServiceWorkerWebSettingsCompat mWebSettings;

    public ServiceWorkerControllerImpl() {
        WebViewFeatureInternal.SERVICE_WORKER_BASIC_USAGE.isSupportedByFramework();
        this.mFrameworksImpl = ApiHelperForN.getServiceWorkerControllerInstance();
        this.mBoundaryInterface = null;
        this.mWebSettings = ApiHelperForN.getServiceWorkerWebSettingsImpl(getFrameworksImpl());
    }

    private ServiceWorkerControllerBoundaryInterface getBoundaryInterface() {
        ServiceWorkerControllerBoundaryInterface serviceWorkerControllerBoundaryInterface = this.mBoundaryInterface;
        if (serviceWorkerControllerBoundaryInterface != null) {
            return serviceWorkerControllerBoundaryInterface;
        }
        ServiceWorkerControllerBoundaryInterface serviceWorkerController = WebViewGlueCommunicator.getFactory().getServiceWorkerController();
        this.mBoundaryInterface = serviceWorkerController;
        return serviceWorkerController;
    }

    private ServiceWorkerController getFrameworksImpl() {
        ServiceWorkerController serviceWorkerController = this.mFrameworksImpl;
        if (serviceWorkerController != null) {
            return serviceWorkerController;
        }
        ServiceWorkerController serviceWorkerControllerInstance = ApiHelperForN.getServiceWorkerControllerInstance();
        this.mFrameworksImpl = serviceWorkerControllerInstance;
        return serviceWorkerControllerInstance;
    }

    @Override // androidx.webkit.ServiceWorkerControllerCompat
    public ServiceWorkerWebSettingsCompat getServiceWorkerWebSettings() {
        return this.mWebSettings;
    }

    @Override // androidx.webkit.ServiceWorkerControllerCompat
    public void setServiceWorkerClient(ServiceWorkerClientCompat serviceWorkerClientCompat) {
        WebViewFeatureInternal.SERVICE_WORKER_BASIC_USAGE.isSupportedByFramework();
        if (serviceWorkerClientCompat == null) {
            ApiHelperForN.setServiceWorkerClient(getFrameworksImpl(), null);
        } else {
            ApiHelperForN.setServiceWorkerClientCompat(getFrameworksImpl(), serviceWorkerClientCompat);
        }
    }
}
