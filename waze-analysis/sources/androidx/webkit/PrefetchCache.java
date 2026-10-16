package androidx.webkit;

import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import androidx.webkit.internal.PrefetchOperationCallbackWithResultAdapter;
import androidx.webkit.internal.SpeculativeLoadingParametersAdapter;
import androidx.webkit.internal.WebViewFeatureInternal;
import j$.util.Objects;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.a.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class PrefetchCache {
    private final ProfileBoundaryInterface mProfileImpl;

    public PrefetchCache(ProfileBoundaryInterface profileBoundaryInterface) {
        this.mProfileImpl = profileBoundaryInterface;
    }

    public void clearMaxPrefetches() {
        if (!WebViewFeatureInternal.PREFETCH_CACHE.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        this.mProfileImpl.clearMaxPrefetches();
    }

    public void clearPrefetchTtl() {
        if (!WebViewFeatureInternal.PREFETCH_CACHE.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        this.mProfileImpl.clearPrefetchTtl();
    }

    public int getMaxPrefetches() {
        if (WebViewFeatureInternal.PREFETCH_CACHE.isSupportedByWebView()) {
            return this.mProfileImpl.getMaxPrefetches();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public int getPrefetchTtlSeconds() {
        if (WebViewFeatureInternal.PREFETCH_CACHE.isSupportedByWebView()) {
            return this.mProfileImpl.getPrefetchTtlSeconds();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public void prefetchUrlAsync(String str, CancellationSignal cancellationSignal, Executor executor, PrefetchParameters prefetchParameters, WebViewOutcomeReceiver<PrefetchResult, PrefetchException> webViewOutcomeReceiver) {
        Objects.requireNonNull(str, "Url can not be null.");
        Objects.requireNonNull(webViewOutcomeReceiver, "OutcomeReceiver can not be null.");
        if (!WebViewFeatureInternal.PROFILE_URL_PREFETCH.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        this.mProfileImpl.prefetchUrl(str, cancellationSignal, executor == null ? new PrefetchCache$$ExternalSyntheticLambda0(new Handler(Looper.getMainLooper())) : executor, b.c(new SpeculativeLoadingParametersAdapter(new SpeculativeLoadingParameters(prefetchParameters))), PrefetchOperationCallbackWithResultAdapter.buildInvocationHandler(webViewOutcomeReceiver));
    }

    public void setMaxPrefetches(int i2) {
        if (!WebViewFeatureInternal.PREFETCH_CACHE.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxPrefetches should be greater than or equal to 1");
        }
        this.mProfileImpl.setMaxPrefetches(i2);
    }

    public void setPrefetchTtlSeconds(int i2) {
        if (!WebViewFeatureInternal.PREFETCH_CACHE.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("prefetchTtlSeconds should be greater than or equal to 1");
        }
        this.mProfileImpl.setPrefetchTtlSeconds(i2);
    }

    public void prefetchUrlAsync(String str, CancellationSignal cancellationSignal, Executor executor, WebViewOutcomeReceiver<PrefetchResult, PrefetchException> webViewOutcomeReceiver) {
        Objects.requireNonNull(str, "Url can not be null.");
        Objects.requireNonNull(webViewOutcomeReceiver, "OutcomeReceiver can not be null.");
        if (WebViewFeatureInternal.PROFILE_URL_PREFETCH.isSupportedByWebView()) {
            if (executor == null) {
                executor = new PrefetchCache$$ExternalSyntheticLambda0(new Handler(Looper.getMainLooper()));
            }
            this.mProfileImpl.prefetchUrl(str, cancellationSignal, executor, PrefetchOperationCallbackWithResultAdapter.buildInvocationHandler(webViewOutcomeReceiver));
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
