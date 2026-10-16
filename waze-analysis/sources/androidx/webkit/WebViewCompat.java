package androidx.webkit;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.ReplaceWith;
import androidx.webkit.WebViewCompat;
import androidx.webkit.internal.ApiFeature;
import androidx.webkit.internal.ApiHelperForO;
import androidx.webkit.internal.ApiHelperForOMR1;
import androidx.webkit.internal.ApiHelperForP;
import androidx.webkit.internal.ApiHelperForQ;
import androidx.webkit.internal.WebMessageAdapter;
import androidx.webkit.internal.WebMessagePortImpl;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import androidx.webkit.internal.WebViewProviderAdapter;
import androidx.webkit.internal.WebViewProviderFactory;
import androidx.webkit.internal.WebViewRenderProcessClientFrameworkAdapter;
import androidx.webkit.internal.WebViewRenderProcessImpl;
import j$.util.Objects;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class WebViewCompat {
    public static final int INJECTION_EVENT_DOCUMENT_END = 1;
    public static final int INJECTION_EVENT_DOCUMENT_START = 0;
    private static final Uri WILDCARD_URI = Uri.parse(ProxyConfig.MATCH_ALL_SCHEMES);
    private static final Uri EMPTY_URI = Uri.parse("");
    private static final WeakHashMap<WebView, WebViewProviderAdapter> sProviderAdapterCache = new WeakHashMap<>();

    /* compiled from: WazeSource */
    @Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
    @Retention(RetentionPolicy.CLASS)
    public @interface ExperimentalAsyncStartUp {
    }

    /* compiled from: WazeSource */
    @Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
    @Retention(RetentionPolicy.CLASS)
    public @interface ExperimentalNavigate {
    }

    /* compiled from: WazeSource */
    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface JavaScriptInjectionEvent {
    }

    /* compiled from: WazeSource */
    class NullReturningWebViewStartUpResult implements WebViewStartUpResult {
        private NullReturningWebViewStartUpResult() {
        }

        @Override // androidx.webkit.WebViewStartUpResult
        public Long getMaxTimePerTaskInUiThreadMillis() {
            return null;
        }

        @Override // androidx.webkit.WebViewStartUpResult
        public List<StartUpLocation> getNonUiThreadBlockingStartUpLocations() {
            return null;
        }

        @Override // androidx.webkit.WebViewStartUpResult
        public Long getTotalTimeInUiThreadMillis() {
            return null;
        }

        @Override // androidx.webkit.WebViewStartUpResult
        public List<StartUpLocation> getUiThreadBlockingStartUpLocations() {
            return null;
        }
    }

    /* compiled from: WazeSource */
    public interface VisualStateCallback {
        void onComplete(long j2);
    }

    /* compiled from: WazeSource */
    public interface WebMessageListener {
        void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z, JavaScriptReplyProxy javaScriptReplyProxy);
    }

    /* compiled from: WazeSource */
    @Deprecated(forRemoval = true)
    public interface WebViewStartUpCallback {
        void onSuccess(WebViewStartUpResult webViewStartUpResult);
    }

    private WebViewCompat() {
    }

    public static ScriptHandler addDocumentStartJavaScript(WebView webView, String str, Set<String> set) {
        if (WebViewFeatureInternal.DOCUMENT_START_SCRIPT.isSupportedByWebView()) {
            return getProvider(webView).addDocumentStartJavaScript(str, (String[]) set.toArray(new String[0]));
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static ScriptHandler addJavaScriptOnEvent(WebView webView, String str, int i2, Set<String> set, JavaScriptExecutionWorld javaScriptExecutionWorld) {
        if (!WebViewFeatureInternal.JS_INJECTION_IN_FRAME_AND_WORLD.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        javaScriptExecutionWorld.checkWebviewRegistration(webView);
        return getProvider(webView).addJavaScriptOnEvent(str, i2, (String[]) set.toArray(new String[0]), javaScriptExecutionWorld.getName());
    }

    public static void addNavigationListener(WebView webView, Executor executor, NavigationListener navigationListener) {
        if (!WebViewFeatureInternal.NAVIGATION_LISTENER.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        getProvider(webView).addNavigationListener(executor, navigationListener);
    }

    public static void addWebMessageListener(WebView webView, String str, Set<String> set, JavaScriptExecutionWorld javaScriptExecutionWorld, WebMessageListener webMessageListener) {
        if (!WebViewFeatureInternal.JS_INJECTION_IN_FRAME_AND_WORLD.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        javaScriptExecutionWorld.checkWebviewRegistration(webView);
        getProvider(webView).addWebMessageListener(str, (String[]) set.toArray(new String[0]), javaScriptExecutionWorld.getName(), webMessageListener);
    }

    private static void checkThread(WebView webView) {
        Looper webViewLooper = ApiHelperForP.getWebViewLooper(webView);
        if (webViewLooper == Looper.myLooper()) {
            return;
        }
        throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + webViewLooper + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
    }

    private static WebViewProviderBoundaryInterface createProvider(WebView webView) {
        return getFactory().createWebView(webView);
    }

    public static WebMessagePortCompat[] createWebMessageChannel(WebView webView) {
        return WebMessagePortImpl.portsToCompat(webView.createWebMessageChannel());
    }

    public static PackageInfo getCurrentLoadedWebViewPackage() {
        return ApiHelperForO.getCurrentWebViewPackage();
    }

    public static PackageInfo getCurrentWebViewPackage(Context context) {
        PackageInfo currentLoadedWebViewPackage = getCurrentLoadedWebViewPackage();
        return currentLoadedWebViewPackage != null ? currentLoadedWebViewPackage : getNotYetLoadedWebViewPackageInfo(context);
    }

    public static JavaScriptExecutionWorld getExecutionWorld(WebView webView, String str) {
        if (!WebViewFeatureInternal.JS_INJECTION_IN_FRAME_AND_WORLD.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        getProvider(webView).getExecutionWorld(str);
        return new JavaScriptExecutionWorld(str, webView);
    }

    private static WebViewProviderFactory getFactory() {
        return WebViewGlueCommunicator.getFactory();
    }

    private static PackageInfo getLoadedWebViewPackageInfo() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    private static PackageInfo getNotYetLoadedWebViewPackageInfo(Context context) {
        try {
            String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static Profile getProfile(WebView webView) {
        if (WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            return getProvider(webView).getProfile();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    private static WebViewProviderAdapter getProvider(WebView webView) {
        if (!WebViewFeatureInternal.PROVIDER_WEAKLY_REF_WEBVIEW.isSupportedByWebView()) {
            return new WebViewProviderAdapter(createProvider(webView));
        }
        WeakHashMap<WebView, WebViewProviderAdapter> weakHashMap = sProviderAdapterCache;
        WebViewProviderAdapter webViewProviderAdapter = weakHashMap.get(webView);
        if (webViewProviderAdapter != null) {
            return webViewProviderAdapter;
        }
        WebViewProviderAdapter webViewProviderAdapter2 = new WebViewProviderAdapter(createProvider(webView));
        weakHashMap.put(webView, webViewProviderAdapter2);
        return webViewProviderAdapter2;
    }

    static WeakHashMap<WebView, WebViewProviderAdapter> getProviderAdapterCacheForTesting() {
        return sProviderAdapterCache;
    }

    public static Uri getSafeBrowsingPrivacyPolicyUrl() {
        WebViewFeatureInternal.SAFE_BROWSING_PRIVACY_POLICY_URL.isSupportedByFramework();
        return ApiHelperForOMR1.getSafeBrowsingPrivacyPolicyUrl();
    }

    public static String getVariationsHeader() {
        if (WebViewFeatureInternal.GET_VARIATIONS_HEADER.isSupportedByWebView()) {
            return getFactory().getStatics().getVariationsHeader();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static WebChromeClient getWebChromeClient(WebView webView) {
        WebViewFeatureInternal.GET_WEB_CHROME_CLIENT.isSupportedByFramework();
        return ApiHelperForO.getWebChromeClient(webView);
    }

    public static WebViewClient getWebViewClient(WebView webView) {
        WebViewFeatureInternal.GET_WEB_VIEW_CLIENT.isSupportedByFramework();
        return ApiHelperForO.getWebViewClient(webView);
    }

    public static WebViewRenderProcess getWebViewRenderProcess(WebView webView) {
        WebViewFeatureInternal.GET_WEB_VIEW_RENDERER.isSupportedByFramework();
        android.webkit.WebViewRenderProcess webViewRenderProcess = ApiHelperForQ.getWebViewRenderProcess(webView);
        if (webViewRenderProcess != null) {
            return WebViewRenderProcessImpl.forFrameworkObject(webViewRenderProcess);
        }
        return null;
    }

    public static WebViewRenderProcessClient getWebViewRenderProcessClient(WebView webView) {
        WebViewFeatureInternal.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE.isSupportedByFramework();
        android.webkit.WebViewRenderProcessClient webViewRenderProcessClient = ApiHelperForQ.getWebViewRenderProcessClient(webView);
        if (webViewRenderProcessClient == null || !(webViewRenderProcessClient instanceof WebViewRenderProcessClientFrameworkAdapter)) {
            return null;
        }
        return ((WebViewRenderProcessClientFrameworkAdapter) webViewRenderProcessClient).getFrameworkRenderProcessClient();
    }

    public static boolean isAudioMuted(WebView webView) {
        if (WebViewFeatureInternal.MUTE_AUDIO.isSupportedByWebView()) {
            return getProvider(webView).isAudioMuted();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static boolean isMultiProcessEnabled() {
        if (WebViewFeatureInternal.MULTI_PROCESS.isSupportedByWebView()) {
            return getFactory().getStatics().isMultiProcessEnabled();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    static /* synthetic */ void lambda$startUpWebView$3(WebViewStartUpConfig webViewStartUpConfig, final WebViewStartUpCallback webViewStartUpCallback, Context context) {
        WebViewGlueCommunicator.getWebViewClassLoader();
        if (WebViewFeatureInternal.ASYNC_WEBVIEW_STARTUP.isSupportedByWebView()) {
            getFactory().startUpWebView(webViewStartUpConfig, new WebViewStartUpCallback() { // from class: androidx.webkit.WebViewCompat$$ExternalSyntheticLambda4
                @Override // androidx.webkit.WebViewCompat.WebViewStartUpCallback
                public final void onSuccess(WebViewStartUpResult webViewStartUpResult) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.webkit.WebViewCompat$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            webViewStartUpCallback.onSuccess(webViewStartUpResult);
                        }
                    });
                }
            });
            return;
        }
        if (webViewStartUpConfig.shouldRunUiThreadStartUpTasks()) {
            WebSettings.getDefaultUserAgent(context.getApplicationContext());
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.webkit.WebViewCompat$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                webViewStartUpCallback.onSuccess(new WebViewCompat.NullReturningWebViewStartUpResult());
            }
        });
    }

    static /* synthetic */ void lambda$startUpWebView$5(WebViewStartUpConfig webViewStartUpConfig, final WebViewOutcomeReceiver webViewOutcomeReceiver, Context context) {
        WebViewGlueCommunicator.getWebViewClassLoader();
        if (WebViewFeatureInternal.ASYNC_WEBVIEW_STARTUP_V2.isSupportedByWebView()) {
            getFactory().startUpWebView(webViewStartUpConfig, (WebViewOutcomeReceiver<WebViewStartUpResult, WebViewStartupException>) webViewOutcomeReceiver);
            return;
        }
        if (WebViewFeatureInternal.ASYNC_WEBVIEW_STARTUP.isSupportedByWebView()) {
            WebViewProviderFactory factory = getFactory();
            Objects.requireNonNull(webViewOutcomeReceiver);
            factory.startUpWebView(webViewStartUpConfig, new WebViewStartUpCallback() { // from class: androidx.webkit.WebViewCompat$$ExternalSyntheticLambda6
                @Override // androidx.webkit.WebViewCompat.WebViewStartUpCallback
                public final void onSuccess(WebViewStartUpResult webViewStartUpResult) {
                    webViewOutcomeReceiver.onResult(webViewStartUpResult);
                }
            });
        } else {
            if (webViewStartUpConfig.shouldRunUiThreadStartUpTasks()) {
                WebSettings.getDefaultUserAgent(context.getApplicationContext());
            }
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.webkit.WebViewCompat$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    webViewOutcomeReceiver.onResult(new WebViewCompat.NullReturningWebViewStartUpResult());
                }
            });
        }
    }

    public static Navigation navigate(WebView webView, String str, NavigationParameters navigationParameters) {
        if (WebViewFeatureInternal.WEBVIEW_NAVIGATE_V1.isSupportedByWebView()) {
            return getProvider(webView).navigate(str, navigationParameters);
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void postVisualStateCallback(WebView webView, long j2, final VisualStateCallback visualStateCallback) {
        webView.postVisualStateCallback(j2, new WebView.VisualStateCallback() { // from class: androidx.webkit.WebViewCompat.1
            @Override // android.webkit.WebView.VisualStateCallback
            public void onComplete(long j3) {
                visualStateCallback.onComplete(j3);
            }
        });
    }

    public static void postWebMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri) {
        if (WILDCARD_URI.equals(uri)) {
            uri = EMPTY_URI;
        }
        ApiFeature.M m = WebViewFeatureInternal.POST_WEB_MESSAGE;
        if (webMessageCompat.getType() == 0) {
            webView.postWebMessage(WebMessagePortImpl.compatToFrameworkMessage(webMessageCompat), uri);
        } else {
            if (!m.isSupportedByWebView() || !WebMessageAdapter.isMessagePayloadTypeSupportedByWebView(webMessageCompat.getType())) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            checkThread(webView);
            getProvider(webView).postWebMessage(webMessageCompat, uri);
        }
    }

    public static void prerenderUrlAsync(WebView webView, String str, CancellationSignal cancellationSignal, Executor executor, PrerenderOperationCallback prerenderOperationCallback) {
        if (!WebViewFeatureInternal.PRERENDER_WITH_URL.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        getProvider(webView).prerenderUrlAsync(str, cancellationSignal, executor, prerenderOperationCallback);
    }

    public static void removeNavigationListener(WebView webView, NavigationListener navigationListener) {
        if (!WebViewFeatureInternal.NAVIGATION_LISTENER.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        getProvider(webView).removeNavigationListener(navigationListener);
    }

    public static void removeWebMessageListener(WebView webView, JavaScriptExecutionWorld javaScriptExecutionWorld, String str) {
        if (!WebViewFeatureInternal.JS_INJECTION_IN_FRAME_AND_WORLD.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        javaScriptExecutionWorld.checkWebviewRegistration(webView);
        getProvider(webView).removeWebMessageListener(str, javaScriptExecutionWorld.getName());
    }

    public static void saveState(WebView webView, Bundle bundle, int i2, boolean z) {
        if (!WebViewFeatureInternal.SAVE_STATE.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        getProvider(webView).saveState(bundle, i2, z);
    }

    public static void setAudioMuted(WebView webView, boolean z) {
        if (!WebViewFeatureInternal.MUTE_AUDIO.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        getProvider(webView).setAudioMuted(z);
    }

    public static void setDefaultTrafficStatsTag(int i2) {
        if (!WebViewFeatureInternal.DEFAULT_TRAFFICSTATS_TAGGING.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        getFactory().getStatics().setDefaultTrafficStatsTag(i2);
    }

    public static void setProfile(WebView webView, String str) {
        if (!WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        getProvider(webView).setProfileWithName(str);
    }

    public static void setSafeBrowsingAllowlist(Set<String> set, ValueCallback<Boolean> valueCallback) {
        ApiFeature.O_MR1 o_mr1 = WebViewFeatureInternal.SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_PREFERRED;
        ApiFeature.O_MR1 o_mr12 = WebViewFeatureInternal.SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_DEPRECATED;
        if (o_mr1.isSupportedByWebView()) {
            getFactory().getStatics().setSafeBrowsingAllowlist(set, valueCallback);
            return;
        }
        ArrayList arrayList = new ArrayList(set);
        o_mr12.isSupportedByFramework();
        ApiHelperForOMR1.setSafeBrowsingWhitelist(arrayList, valueCallback);
    }

    @ReplaceWith(expression = "setSafeBrowsingAllowlist(new HashSet<>(hosts), callback)", imports = {"java.util.HashSet"})
    @Deprecated
    public static void setSafeBrowsingWhitelist(List<String> list, ValueCallback<Boolean> valueCallback) {
        setSafeBrowsingAllowlist(new HashSet(list), valueCallback);
    }

    public static void setWebViewRenderProcessClient(WebView webView, WebViewRenderProcessClient webViewRenderProcessClient) {
        WebViewFeatureInternal.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE.isSupportedByFramework();
        ApiHelperForQ.setWebViewRenderProcessClient(webView, webViewRenderProcessClient);
    }

    @Deprecated
    public static void startSafeBrowsing(Context context, ValueCallback<Boolean> valueCallback) {
        WebViewFeatureInternal.START_SAFE_BROWSING.isSupportedByFramework();
        ApiHelperForOMR1.startSafeBrowsing(context, valueCallback);
    }

    @Deprecated(forRemoval = true)
    public static void startUpWebView(final Context context, final WebViewStartUpConfig webViewStartUpConfig, final WebViewStartUpCallback webViewStartUpCallback) {
        webViewStartUpConfig.getBackgroundExecutor().execute(new Runnable() { // from class: androidx.webkit.WebViewCompat$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                WebViewCompat.lambda$startUpWebView$3(webViewStartUpConfig, webViewStartUpCallback, context);
            }
        });
    }

    public static void setWebViewRenderProcessClient(WebView webView, Executor executor, WebViewRenderProcessClient webViewRenderProcessClient) {
        WebViewFeatureInternal.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE.isSupportedByFramework();
        ApiHelperForQ.setWebViewRenderProcessClient(webView, executor, webViewRenderProcessClient);
    }

    public static void startUpWebView(final Context context, final WebViewStartUpConfig webViewStartUpConfig, final WebViewOutcomeReceiver<WebViewStartUpResult, WebViewStartupException> webViewOutcomeReceiver) {
        webViewStartUpConfig.getBackgroundExecutor().execute(new Runnable() { // from class: androidx.webkit.WebViewCompat$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                WebViewCompat.lambda$startUpWebView$5(webViewStartUpConfig, webViewOutcomeReceiver, context);
            }
        });
    }

    public static void addNavigationListener(WebView webView, NavigationListener navigationListener) {
        final Handler handler = new Handler(Looper.getMainLooper());
        addNavigationListener(webView, new Executor() { // from class: androidx.webkit.WebViewCompat$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, navigationListener);
    }

    public static void prerenderUrlAsync(WebView webView, String str, CancellationSignal cancellationSignal, Executor executor, PrerenderParameters prerenderParameters, PrerenderOperationCallback prerenderOperationCallback) {
        if (WebViewFeatureInternal.PRERENDER_WITH_URL.isSupportedByWebView()) {
            getProvider(webView).prerenderUrlAsync(str, cancellationSignal, executor, prerenderParameters, prerenderOperationCallback);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Deprecated
    public static void prerenderUrlAsync(WebView webView, String str, CancellationSignal cancellationSignal, Executor executor, SpeculativeLoadingParameters speculativeLoadingParameters, PrerenderOperationCallback prerenderOperationCallback) {
        if (WebViewFeatureInternal.PRERENDER_WITH_URL.isSupportedByWebView()) {
            getProvider(webView).prerenderUrlAsync(str, cancellationSignal, executor, speculativeLoadingParameters, prerenderOperationCallback);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void removeWebMessageListener(WebView webView, String str) {
        if (WebViewFeatureInternal.WEB_MESSAGE_LISTENER.isSupportedByWebView()) {
            getProvider(webView).removeWebMessageListener(str);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void addWebMessageListener(WebView webView, String str, Set<String> set, WebMessageListener webMessageListener) {
        if (WebViewFeatureInternal.WEB_MESSAGE_LISTENER.isSupportedByWebView()) {
            getProvider(webView).addWebMessageListener(str, (String[]) set.toArray(new String[0]), webMessageListener);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
