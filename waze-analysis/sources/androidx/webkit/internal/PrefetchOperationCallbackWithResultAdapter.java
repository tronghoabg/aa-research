package androidx.webkit.internal;

import androidx.webkit.PrefetchException;
import androidx.webkit.PrefetchNetworkException;
import androidx.webkit.PrefetchResult;
import androidx.webkit.WebViewOutcomeReceiver;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface;
import org.chromium.support_lib_boundary.a.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class PrefetchOperationCallbackWithResultAdapter implements PrefetchOperationCallbackBoundaryInterface {
    private final WebViewOutcomeReceiver<PrefetchResult, PrefetchException> mCallback;

    private PrefetchOperationCallbackWithResultAdapter(WebViewOutcomeReceiver<PrefetchResult, PrefetchException> webViewOutcomeReceiver) {
        this.mCallback = webViewOutcomeReceiver;
    }

    public static InvocationHandler buildInvocationHandler(WebViewOutcomeReceiver<PrefetchResult, PrefetchException> webViewOutcomeReceiver) {
        return b.c(new PrefetchOperationCallbackWithResultAdapter(webViewOutcomeReceiver));
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"PREFETCH_WITH_CALLBACK_RESULT_V1"};
    }

    @Override // org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface
    public void onFailure(int i2, String str, int i3) {
        if (!WebViewFeatureInternal.PREFETCH_WITH_CALLBACK_RESULT.isSupportedByWebView() && "Duplicate prefetch request".equals(str)) {
            this.mCallback.onResult(new PrefetchResult(true));
            return;
        }
        WebViewOutcomeReceiver<PrefetchResult, PrefetchException> webViewOutcomeReceiver = this.mCallback;
        if (i2 != 1) {
            webViewOutcomeReceiver.onError(new PrefetchException(str));
        } else {
            webViewOutcomeReceiver.onError(new PrefetchNetworkException(str, i3));
        }
    }

    @Override // org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface
    public void onResult(int i2) {
        if (i2 == 0) {
            this.mCallback.onResult(new PrefetchResult(false));
        } else {
            if (i2 != 1) {
                throw new IllegalArgumentException("Given type isn't defined.");
            }
            this.mCallback.onResult(new PrefetchResult(true));
        }
    }

    @Override // org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface
    public void onSuccess() {
        this.mCallback.onResult(new PrefetchResult(false));
    }
}
