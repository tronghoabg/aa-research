package androidx.webkit.internal;

import androidx.webkit.JavaScriptExecutionException;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebViewOutcomeReceiver;
import j$.util.Objects;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.ExecuteJavaScriptCallbackBoundaryInterface;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.a.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class JavaScriptReplyProxyImpl extends JavaScriptReplyProxy {
    private final JsReplyProxyBoundaryInterface mBoundaryInterface;

    public JavaScriptReplyProxyImpl(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.mBoundaryInterface = jsReplyProxyBoundaryInterface;
    }

    public static JavaScriptReplyProxyImpl forInvocationHandler(InvocationHandler invocationHandler) {
        final JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) b.a(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (JavaScriptReplyProxyImpl) jsReplyProxyBoundaryInterface.getOrCreatePeer(new Callable() { // from class: androidx.webkit.internal.JavaScriptReplyProxyImpl$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return JavaScriptReplyProxyImpl.lambda$forInvocationHandler$0(jsReplyProxyBoundaryInterface);
            }
        });
    }

    static /* synthetic */ Object lambda$forInvocationHandler$0(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        return new JavaScriptReplyProxyImpl(jsReplyProxyBoundaryInterface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int toErrorType(int i2) {
        return i2 != 1 ? 0 : 1;
    }

    @Override // androidx.webkit.JavaScriptReplyProxy
    public void executeJavaScript(String str, final WebViewOutcomeReceiver<String, JavaScriptExecutionException> webViewOutcomeReceiver) {
        if (!WebViewFeatureInternal.JS_INJECTION_IN_FRAME_AND_WORLD.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        this.mBoundaryInterface.executeJavaScript(str, webViewOutcomeReceiver == null ? null : b.c(new ExecuteJavaScriptCallbackBoundaryInterface() { // from class: androidx.webkit.internal.JavaScriptReplyProxyImpl.1
            @Override // org.chromium.support_lib_boundary.ExecuteJavaScriptCallbackBoundaryInterface
            public void onFailure(int i2, String str2) {
                webViewOutcomeReceiver.onError(new JavaScriptExecutionException(JavaScriptReplyProxyImpl.this.toErrorType(i2), str2));
            }

            @Override // org.chromium.support_lib_boundary.ExecuteJavaScriptCallbackBoundaryInterface
            public void onSuccess(String str2) {
                webViewOutcomeReceiver.onResult(str2);
            }
        }));
    }

    @Override // androidx.webkit.JavaScriptReplyProxy
    public void postMessage(byte[] bArr) {
        Objects.requireNonNull(bArr, "ArrayBuffer must be non-null");
        if (!WebViewFeatureInternal.WEB_MESSAGE_ARRAY_BUFFER.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        this.mBoundaryInterface.postMessageWithPayload(b.c(new WebMessagePayloadAdapter(bArr)));
    }

    @Override // androidx.webkit.JavaScriptReplyProxy
    public void postMessage(String str) {
        if (WebViewFeatureInternal.WEB_MESSAGE_LISTENER.isSupportedByWebView()) {
            this.mBoundaryInterface.postMessage(str);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
