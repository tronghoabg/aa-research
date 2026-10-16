package androidx.webkit.internal;

import androidx.webkit.StartUpLocation;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewStartUpResult;
import j$.util.Objects;
import java.lang.reflect.InvocationHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface;
import org.chromium.support_lib_boundary.a.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class WebViewStartUpCallbackAdapter implements WebViewStartUpCallbackBoundaryInterface {
    private final WebViewCompat.WebViewStartUpCallback mWebViewStartUpCallback;

    /* compiled from: WazeSource */
    class StartUpLocationImpl implements StartUpLocation {
        private final Throwable mThrowable;

        StartUpLocationImpl(Throwable th) {
            this.mThrowable = th;
        }

        @Override // androidx.webkit.StartUpLocation
        public Throwable getStackInformation() {
            return this.mThrowable;
        }
    }

    public WebViewStartUpCallbackAdapter(WebViewCompat.WebViewStartUpCallback webViewStartUpCallback) {
        this.mWebViewStartUpCallback = webViewStartUpCallback;
    }

    private List<StartUpLocation> convertFromThrowables(List<Throwable> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Throwable> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new StartUpLocationImpl(it.next()));
        }
        return arrayList;
    }

    private WebViewStartUpResult webViewStartUpResultFromBoundaryInterface(WebViewStartUpResultBoundaryInterface webViewStartUpResultBoundaryInterface) {
        return new WebViewStartUpResult(convertFromThrowables(webViewStartUpResultBoundaryInterface.getBlockingStartUpLocations()), WebViewFeatureInternal.ASYNC_WEBVIEW_STARTUP_ASYNC_STARTUP_LOCATIONS.isSupportedByWebView() ? convertFromThrowables(webViewStartUpResultBoundaryInterface.getAsyncStartUpLocations()) : null, webViewStartUpResultBoundaryInterface) { // from class: androidx.webkit.internal.WebViewStartUpCallbackAdapter.1
            private final List<StartUpLocation> mAsyncStartUpLocations;
            private final List<StartUpLocation> mBlockingStartUpLocations;
            final /* synthetic */ List val$asyncStartUpLocations;
            final /* synthetic */ List val$blockingStartUpLocations;
            final /* synthetic */ WebViewStartUpResultBoundaryInterface val$result;

            {
                this.val$blockingStartUpLocations = list;
                this.val$asyncStartUpLocations = list;
                this.val$result = webViewStartUpResultBoundaryInterface;
                this.mBlockingStartUpLocations = list;
                this.mAsyncStartUpLocations = list;
            }

            @Override // androidx.webkit.WebViewStartUpResult
            public Long getMaxTimePerTaskInUiThreadMillis() {
                return this.val$result.getMaxTimePerTaskInUiThreadMillis();
            }

            @Override // androidx.webkit.WebViewStartUpResult
            public List<StartUpLocation> getNonUiThreadBlockingStartUpLocations() {
                return this.mAsyncStartUpLocations;
            }

            @Override // androidx.webkit.WebViewStartUpResult
            public Long getTotalTimeInUiThreadMillis() {
                return this.val$result.getTotalTimeInUiThreadMillis();
            }

            @Override // androidx.webkit.WebViewStartUpResult
            public List<StartUpLocation> getUiThreadBlockingStartUpLocations() {
                return this.mBlockingStartUpLocations;
            }
        };
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface
    public void onSuccess(InvocationHandler invocationHandler) {
        this.mWebViewStartUpCallback.onSuccess(webViewStartUpResultFromBoundaryInterface((WebViewStartUpResultBoundaryInterface) Objects.requireNonNull((WebViewStartUpResultBoundaryInterface) b.a(WebViewStartUpResultBoundaryInterface.class, invocationHandler))));
    }
}
