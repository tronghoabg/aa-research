package androidx.webkit;

import java.lang.Throwable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface WebViewOutcomeReceiver<T, E extends Throwable> {

    /* compiled from: WazeSource */
    /* renamed from: androidx.webkit.WebViewOutcomeReceiver$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onError(WebViewOutcomeReceiver webViewOutcomeReceiver, Throwable th) {
        }
    }

    void onError(E e2);

    void onResult(T t);
}
