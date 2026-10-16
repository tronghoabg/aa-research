package androidx.webkit.internal;

import a.a$$ExternalSyntheticApiModelOutline0;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewOutcomeReceiver;
import androidx.webkit.WebViewStartUpConfig;
import androidx.webkit.WebViewStartUpResult;
import androidx.webkit.WebViewStartupException;
import com.waze.mg$$ExternalSyntheticApiModelOutline0;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewBuilderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.a.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class WebViewProviderFactoryAdapter implements WebViewProviderFactory {
    final WebViewProviderFactoryBoundaryInterface mImpl;

    public WebViewProviderFactoryAdapter(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.mImpl = webViewProviderFactoryBoundaryInterface;
    }

    static /* synthetic */ void lambda$startUpWebView$3(final WebViewOutcomeReceiver webViewOutcomeReceiver, Consumer consumer) {
        final WebViewStartupResultImpl webViewStartupResultImpl = new WebViewStartupResultImpl(consumer);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.webkit.internal.WebViewProviderFactoryAdapter$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                webViewOutcomeReceiver.onResult(webViewStartupResultImpl);
            }
        });
    }

    static /* synthetic */ void lambda$startUpWebView$5(final WebViewOutcomeReceiver webViewOutcomeReceiver, Consumer consumer) {
        final WebViewStartupException webViewStartupExceptionBuildException = WebViewStartupExceptionBuilder.buildException(consumer);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.webkit.internal.WebViewProviderFactoryAdapter$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                webViewOutcomeReceiver.onError(webViewStartupExceptionBuildException);
            }
        });
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) b.a(WebViewProviderBoundaryInterface.class, this.mImpl.createWebView(webView));
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public DropDataContentProviderBoundaryInterface getDropDataProvider() {
        return (DropDataContentProviderBoundaryInterface) b.a(DropDataContentProviderBoundaryInterface.class, this.mImpl.getDropDataProvider());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) b.a(ProfileStoreBoundaryInterface.class, this.mImpl.getProfileStore());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public ProxyControllerBoundaryInterface getProxyController() {
        return (ProxyControllerBoundaryInterface) b.a(ProxyControllerBoundaryInterface.class, this.mImpl.getProxyController());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        return (ServiceWorkerControllerBoundaryInterface) b.a(ServiceWorkerControllerBoundaryInterface.class, this.mImpl.getServiceWorkerController());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) b.a(StaticsBoundaryInterface.class, this.mImpl.getStatics());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public TracingControllerBoundaryInterface getTracingController() {
        return (TracingControllerBoundaryInterface) b.a(TracingControllerBoundaryInterface.class, this.mImpl.getTracingController());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public WebViewBuilderBoundaryInterface getWebViewBuilder() {
        return (WebViewBuilderBoundaryInterface) b.a(WebViewBuilderBoundaryInterface.class, this.mImpl.getWebViewBuilder());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public String[] getWebViewFeatures() {
        return this.mImpl.getSupportedFeatures();
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) b.a(WebkitToCompatConverterBoundaryInterface.class, this.mImpl.getWebkitToCompatConverter());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    @Deprecated
    public void startUpWebView(WebViewStartUpConfig webViewStartUpConfig, final WebViewCompat.WebViewStartUpCallback webViewStartUpCallback) {
        this.mImpl.startUpWebView(b.c(new WebViewStartUpConfigAdapter(webViewStartUpConfig)), b.c(new WebViewStartUpCallbackAdapter(new WebViewCompat.WebViewStartUpCallback() { // from class: androidx.webkit.internal.WebViewProviderFactoryAdapter$$ExternalSyntheticLambda6
            @Override // androidx.webkit.WebViewCompat.WebViewStartUpCallback
            public final void onSuccess(WebViewStartUpResult webViewStartUpResult) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.webkit.internal.WebViewProviderFactoryAdapter$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        webViewStartUpCallback.onSuccess(webViewStartUpResult);
                    }
                });
            }
        })));
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public void startUpWebView(final WebViewStartUpConfig webViewStartUpConfig, final WebViewOutcomeReceiver<WebViewStartUpResult, WebViewStartupException> webViewOutcomeReceiver) {
        Objects.requireNonNull(webViewStartUpConfig);
        this.mImpl.startUpWebView(new Consumer() { // from class: androidx.webkit.internal.WebViewProviderFactoryAdapter$$ExternalSyntheticLambda2
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void u(Object obj) {
                webViewStartUpConfig.accept(mg$$ExternalSyntheticApiModelOutline0.m28519m(obj));
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: androidx.webkit.internal.WebViewProviderFactoryAdapter$$ExternalSyntheticLambda3
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void u(Object obj) {
                WebViewProviderFactoryAdapter.lambda$startUpWebView$3(webViewOutcomeReceiver, a$$ExternalSyntheticApiModelOutline0.m20m(obj));
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: androidx.webkit.internal.WebViewProviderFactoryAdapter$$ExternalSyntheticLambda4
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void u(Object obj) {
                WebViewProviderFactoryAdapter.lambda$startUpWebView$5(webViewOutcomeReceiver, a$$ExternalSyntheticApiModelOutline0.m20m(obj));
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
