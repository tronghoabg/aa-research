package androidx.webkit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class JavaScriptReplyProxy {
    public abstract void executeJavaScript(String str, WebViewOutcomeReceiver<String, JavaScriptExecutionException> webViewOutcomeReceiver);

    public abstract void postMessage(String str);

    public abstract void postMessage(byte[] bArr);
}
