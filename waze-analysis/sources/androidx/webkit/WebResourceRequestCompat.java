package androidx.webkit;

import android.webkit.WebResourceRequest;
import androidx.webkit.internal.ApiHelperForN;
import androidx.webkit.internal.WebResourceRequestAdapter;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class WebResourceRequestCompat {
    private WebResourceRequestCompat() {
    }

    private static WebResourceRequestAdapter getAdapter(WebResourceRequest webResourceRequest) {
        return WebViewGlueCommunicator.getCompatConverter().convertWebResourceRequest(webResourceRequest);
    }

    public static boolean isRedirect(WebResourceRequest webResourceRequest) {
        WebViewFeatureInternal.WEB_RESOURCE_REQUEST_IS_REDIRECT.isSupportedByFramework();
        return ApiHelperForN.isRedirect(webResourceRequest);
    }
}
