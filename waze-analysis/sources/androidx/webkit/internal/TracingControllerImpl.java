package androidx.webkit.internal;

import androidx.webkit.TracingConfig;
import androidx.webkit.TracingController;
import java.io.OutputStream;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class TracingControllerImpl extends TracingController {
    private TracingControllerBoundaryInterface mBoundaryInterface;
    private android.webkit.TracingController mFrameworksImpl;

    public TracingControllerImpl() {
        WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE.isSupportedByFramework();
        this.mFrameworksImpl = ApiHelperForP.getTracingControllerInstance();
        this.mBoundaryInterface = null;
    }

    private TracingControllerBoundaryInterface getBoundaryInterface() {
        TracingControllerBoundaryInterface tracingControllerBoundaryInterface = this.mBoundaryInterface;
        if (tracingControllerBoundaryInterface != null) {
            return tracingControllerBoundaryInterface;
        }
        TracingControllerBoundaryInterface tracingController = WebViewGlueCommunicator.getFactory().getTracingController();
        this.mBoundaryInterface = tracingController;
        return tracingController;
    }

    private android.webkit.TracingController getFrameworksImpl() {
        android.webkit.TracingController tracingController = this.mFrameworksImpl;
        if (tracingController != null) {
            return tracingController;
        }
        android.webkit.TracingController tracingControllerInstance = ApiHelperForP.getTracingControllerInstance();
        this.mFrameworksImpl = tracingControllerInstance;
        return tracingControllerInstance;
    }

    @Override // androidx.webkit.TracingController
    public boolean isTracing() {
        WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE.isSupportedByFramework();
        return ApiHelperForP.isTracing(getFrameworksImpl());
    }

    @Override // androidx.webkit.TracingController
    public void start(TracingConfig tracingConfig) {
        if (tracingConfig == null) {
            throw new IllegalArgumentException("Tracing config must be non null");
        }
        WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE.isSupportedByFramework();
        ApiHelperForP.start(getFrameworksImpl(), tracingConfig);
    }

    @Override // androidx.webkit.TracingController
    public boolean stop(OutputStream outputStream, Executor executor) {
        WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE.isSupportedByFramework();
        return ApiHelperForP.stop(getFrameworksImpl(), outputStream, executor);
    }
}
