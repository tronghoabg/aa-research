package androidx.webkit.internal;

import androidx.webkit.PrefetchException;
import androidx.webkit.PrefetchNetworkException;
import androidx.webkit.WebViewOutcomeReceiver;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface;
import org.chromium.support_lib_boundary.a.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class PrefetchOperationCallbackAdapter implements PrefetchOperationCallbackBoundaryInterface {
    private final WebViewOutcomeReceiver<Void, PrefetchException> mCallback;

    private PrefetchOperationCallbackAdapter(WebViewOutcomeReceiver<Void, PrefetchException> webViewOutcomeReceiver) {
        this.mCallback = webViewOutcomeReceiver;
    }

    public static InvocationHandler buildInvocationHandler(WebViewOutcomeReceiver<Void, PrefetchException> webViewOutcomeReceiver) {
        return b.c(new PrefetchOperationCallbackAdapter(webViewOutcomeReceiver));
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"PREFETCH_WITH_CALLBACK_RESULT_V1"};
    }

    @Override // org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface
    public void onFailure(int i2, String str, int i3) {
        WebViewOutcomeReceiver<Void, PrefetchException> webViewOutcomeReceiver = this.mCallback;
        if (i2 != 1) {
            webViewOutcomeReceiver.onError(new PrefetchException(str));
        } else {
            webViewOutcomeReceiver.onError(new PrefetchNetworkException(str, i3));
        }
    }

    @Override // org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface
    public void onResult(int i2) {
        if (i2 == 0) {
            this.mCallback.onResult(null);
        } else {
            if (i2 != 1) {
                throw new IllegalArgumentException("Given type isn't defined.");
            }
            this.mCallback.onError(new PrefetchNetworkException("Duplicate prefetch request"));
        }
    }

    @Override // org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface
    public void onSuccess() {
        this.mCallback.onResult(null);
    }
}
