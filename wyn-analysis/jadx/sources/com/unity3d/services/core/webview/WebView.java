package com.unity3d.services.core.webview;

import Bf.l;
import Fe.c;
import Fe.e;
import R8.v;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import b1.C1494c;
import com.applovin.impl.mediation.ads.f;
import com.moloco.sdk.internal.publisher.H;
import com.unity3d.services.core.configuration.Experiments;
import com.unity3d.services.core.configuration.IExperiments;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker;
import com.unity3d.services.core.webview.bridge.IWebViewBridge;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInterface;
import ef.C2529m;
import ef.EnumC2526j;
import ef.InterfaceC2525i;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;
import k1.J;
import k1.S;
import k1.s0;
import k1.v0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x3.AbstractC4458a;
import x3.AbstractC4467j;
import x3.C4462e;
import x3.InterfaceC4466i;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/unity3d/services/core/webview/WebView;", "Landroid/webkit/WebView;", "Lcom/unity3d/services/core/di/IServiceComponent;", "Landroid/content/Context;", "context", "", "shouldNotRequireGesturePlayback", "Lcom/unity3d/services/core/webview/bridge/IWebViewBridge;", "webViewBridge", "Lcom/unity3d/services/core/webview/bridge/IInvocationCallbackInvoker;", "callbackInvoker", "Lcom/unity3d/services/core/configuration/IExperiments;", "experiments", "<init>", "(Landroid/content/Context;ZLcom/unity3d/services/core/webview/bridge/IWebViewBridge;Lcom/unity3d/services/core/webview/bridge/IInvocationCallbackInvoker;Lcom/unity3d/services/core/configuration/IExperiments;)V", "Lef/C;", "applySafeAreaInsets", "()V", "", "script", "Landroid/webkit/ValueCallback;", "resultCallback", "evaluateJavascript", "(Ljava/lang/String;Landroid/webkit/ValueCallback;)V", "url", "loadUrl", "(Ljava/lang/String;)V", "Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "sdkMetricsSender$delegate", "Lef/i;", "getSdkMetricsSender", "()Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "sdkMetricsSender", "Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;", "webViewBridgeInterface", "Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public class WebView extends android.webkit.WebView implements IServiceComponent {

    /* renamed from: sdkMetricsSender$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC2525i sdkMetricsSender;

    @NotNull
    private final WebViewBridgeInterface webViewBridgeInterface;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(@NotNull Context context) {
        this(context, false, null, null, null, 30, null);
        AbstractC3340k.e(context, "context");
    }

    private final void applySafeAreaInsets() {
        b bVar = new b(this, 0);
        WeakHashMap weakHashMap = S.f38779a;
        J.l(this, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v0 applySafeAreaInsets$lambda$3(WebView this$0, View v2, v0 insets) {
        Object objZ;
        AbstractC3340k.e(this$0, "this$0");
        AbstractC3340k.e(v2, "v");
        AbstractC3340k.e(insets, "insets");
        s0 s0Var = insets.f38877a;
        C1494c c1494cF = s0Var.f(519);
        AbstractC3340k.d(c1494cF, "insets.getInsets(WindowI…Compat.Type.systemBars())");
        C1494c c1494cF2 = s0Var.f(128);
        AbstractC3340k.d(c1494cF2, "insets.getInsets(WindowI…pat.Type.displayCutout())");
        try {
            objZ = Float.valueOf(this$0.getContext().getResources().getDisplayMetrics().density);
        } catch (Throwable th) {
            objZ = e.z(th);
        }
        Object objValueOf = Float.valueOf(1.0f);
        if (objZ instanceof C2529m) {
            objZ = objValueOf;
        }
        float fFloatValue = ((Number) objZ).floatValue();
        int iApplySafeAreaInsets$lambda$3$toPx = applySafeAreaInsets$lambda$3$toPx(Math.max(c1494cF.f19121a, c1494cF2.f19121a), fFloatValue);
        int iApplySafeAreaInsets$lambda$3$toPx2 = applySafeAreaInsets$lambda$3$toPx(Math.max(c1494cF.f19122b, c1494cF2.f19122b), fFloatValue);
        int iApplySafeAreaInsets$lambda$3$toPx3 = applySafeAreaInsets$lambda$3$toPx(Math.max(c1494cF.f19123c, c1494cF2.f19123c), fFloatValue);
        int iApplySafeAreaInsets$lambda$3$toPx4 = applySafeAreaInsets$lambda$3$toPx(Math.max(c1494cF.f19124d, c1494cF2.f19124d), fFloatValue);
        StringBuilder sbH = v.h("\n                (function() {\n                    const root = document.documentElement;\n                    root.style.setProperty('--safe-area-inset-left', '", iApplySafeAreaInsets$lambda$3$toPx, "px');\n                    root.style.setProperty('--safe-area-inset-right', '", iApplySafeAreaInsets$lambda$3$toPx3, "px');\n                    root.style.setProperty('--safe-area-inset-top', '");
        sbH.append(iApplySafeAreaInsets$lambda$3$toPx2);
        sbH.append("px');\n                    root.style.setProperty('--safe-area-inset-bottom', '");
        sbH.append(iApplySafeAreaInsets$lambda$3$toPx4);
        sbH.append("px');\n                })();\n            ");
        this$0.evaluateJavascript(l.V(sbH.toString()), null);
        return insets;
    }

    private static final int applySafeAreaInsets$lambda$3$toPx(int i5, float f10) {
        return (int) (i5 / f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void evaluateJavascript$lambda$1(WebView this$0, String script, ValueCallback valueCallback) {
        AbstractC3340k.e(this$0, "this$0");
        AbstractC3340k.e(script, "$script");
        super.evaluateJavascript(script, valueCallback);
    }

    private final SDKMetricsSender getSdkMetricsSender() {
        return (SDKMetricsSender) this.sdkMetricsSender.getValue();
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(@NotNull String script, @Nullable ValueCallback<String> resultCallback) {
        AbstractC3340k.e(script, "script");
        Utilities.runOnUiThread(new f(this, script, resultCallback, 16));
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    @NotNull
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @Override // android.webkit.WebView
    public void loadUrl(@NotNull String url) {
        AbstractC3340k.e(url, "url");
        DeviceLog.debug("Loading url: ".concat(url));
        super.loadUrl(url);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(@NotNull Context context, boolean z2) {
        this(context, z2, null, null, null, 28, null);
        AbstractC3340k.e(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(@NotNull Context context, boolean z2, @NotNull IWebViewBridge webViewBridge) {
        this(context, z2, webViewBridge, null, null, 24, null);
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(webViewBridge, "webViewBridge");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(@NotNull Context context, boolean z2, @NotNull IWebViewBridge webViewBridge, @NotNull IInvocationCallbackInvoker callbackInvoker) {
        this(context, z2, webViewBridge, callbackInvoker, null, 16, null);
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(webViewBridge, "webViewBridge");
        AbstractC3340k.e(callbackInvoker, "callbackInvoker");
    }

    public /* synthetic */ WebView(Context context, boolean z2, IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker, IExperiments iExperiments, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i5 & 2) != 0 ? false : z2, (i5 & 4) != 0 ? SharedInstances.INSTANCE.getWebViewBridge() : iWebViewBridge, (i5 & 8) != 0 ? SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker() : iInvocationCallbackInvoker, (i5 & 16) != 0 ? new Experiments() : iExperiments);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebView(@NotNull Context context, boolean z2, @NotNull IWebViewBridge webViewBridge, @NotNull IInvocationCallbackInvoker callbackInvoker, @NotNull IExperiments experiments) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super(context);
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(webViewBridge, "webViewBridge");
        AbstractC3340k.e(callbackInvoker, "callbackInvoker");
        AbstractC3340k.e(experiments, "experiments");
        this.sdkMetricsSender = c.y(EnumC2526j.f34669c, new WebView$special$$inlined$inject$default$1(this, ""));
        final WebViewBridgeInterface webViewBridgeInterface = new WebViewBridgeInterface(webViewBridge, callbackInvoker);
        this.webViewBridgeInterface = webViewBridgeInterface;
        WebSettings settings = getSettings();
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setAllowFileAccess(true);
        settings.setBlockNetworkImage(false);
        settings.setBlockNetworkLoads(false);
        settings.setBuiltInZoomControls(false);
        settings.setCacheMode(2);
        settings.setDatabaseEnabled(false);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(false);
        settings.setEnableSmoothTransition(false);
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setJavaScriptEnabled(true);
        settings.setLightTouchEnabled(false);
        settings.setLoadWithOverviewMode(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setMixedContentMode(1);
        settings.setNeedInitialFocus(true);
        settings.setPluginState(WebSettings.PluginState.OFF);
        settings.setRenderPriority(WebSettings.RenderPriority.NORMAL);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(false);
        settings.setSupportZoom(false);
        settings.setUseWideViewPort(true);
        settings.setMediaPlaybackRequiresUserGesture(!z2);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setInitialScale(0);
        setBackgroundColor(0);
        ViewUtilities.setBackground(this, new ColorDrawable(0));
        setBackgroundResource(0);
        boolean zIsWebMessageEnabled = experiments.isWebMessageEnabled();
        if (zIsWebMessageEnabled) {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerEnabledMetric());
        } else {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerDisabledMetric());
        }
        boolean zB0 = H.b0("WEB_MESSAGE_LISTENER");
        if (zB0) {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerSupportedMetric());
        } else {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerUnsupportedMetric());
        }
        if (zIsWebMessageEnabled && zB0) {
            final int i5 = 0;
            AbstractC4467j.a(this, "handleInvocation", tg.b.P("*"), new InterfaceC4466i() { // from class: com.unity3d.services.core.webview.a
                @Override // x3.InterfaceC4466i
                public final void onPostMessage(android.webkit.WebView webView, C4462e c4462e, Uri uri, boolean z10, AbstractC4458a abstractC4458a) throws Exception {
                    switch (i5) {
                        case 0:
                            webViewBridgeInterface.onHandleInvocation(webView, c4462e, uri, z10, abstractC4458a);
                            break;
                        default:
                            webViewBridgeInterface.onHandleCallback(webView, c4462e, uri, z10, abstractC4458a);
                            break;
                    }
                }
            });
            final int i10 = 1;
            AbstractC4467j.a(this, "handleCallback", tg.b.P("*"), new InterfaceC4466i() { // from class: com.unity3d.services.core.webview.a
                @Override // x3.InterfaceC4466i
                public final void onPostMessage(android.webkit.WebView webView, C4462e c4462e, Uri uri, boolean z10, AbstractC4458a abstractC4458a) throws Exception {
                    switch (i10) {
                        case 0:
                            webViewBridgeInterface.onHandleInvocation(webView, c4462e, uri, z10, abstractC4458a);
                            break;
                        default:
                            webViewBridgeInterface.onHandleCallback(webView, c4462e, uri, z10, abstractC4458a);
                            break;
                    }
                }
            });
        } else {
            addJavascriptInterface(webViewBridgeInterface, "webviewbridge");
        }
        applySafeAreaInsets();
    }
}
