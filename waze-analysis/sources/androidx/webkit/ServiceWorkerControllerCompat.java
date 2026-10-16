package androidx.webkit;

import androidx.webkit.internal.ServiceWorkerControllerImpl;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class ServiceWorkerControllerCompat {

    /* compiled from: WazeSource */
    class LAZY_HOLDER {
        static final ServiceWorkerControllerCompat INSTANCE = new ServiceWorkerControllerImpl();

        private LAZY_HOLDER() {
        }
    }

    public static ServiceWorkerControllerCompat getInstance() {
        return LAZY_HOLDER.INSTANCE;
    }

    public abstract ServiceWorkerWebSettingsCompat getServiceWorkerWebSettings();

    public abstract void setServiceWorkerClient(ServiceWorkerClientCompat serviceWorkerClientCompat);
}
