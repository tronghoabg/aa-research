package androidx.webkit;

import android.os.CancellationSignal;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.WebStorage;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface Profile {
    public static final String DEFAULT_PROFILE_NAME = "Default";

    /* compiled from: WazeSource */
    /* renamed from: androidx.webkit.Profile$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$addCustomHeader(Profile profile, CustomHeader customHeader) {
        }

        public static void $default$addQuicHints(Profile profile, Set set) {
            throw new UnsupportedOperationException("Profile#addQuicHints is not implemented.");
        }

        public static void $default$clearAllCustomHeaders(Profile profile) {
        }

        public static void $default$clearCustomHeader(Profile profile, String str) {
        }

        public static void $default$clearMaxPrerenders(Profile profile) {
            throw new UnsupportedOperationException("Profile#clearMaxPrerenders is not implemented.");
        }

        public static HttpCache $default$getHttpCache(Profile profile) {
            throw new UnsupportedOperationException("Profile#getHttpCache is not implemented.");
        }

        public static int $default$getMaxPrerenders(Profile profile) {
            throw new UnsupportedOperationException("Profile#getMaxPrerenders is not implemented.");
        }

        public static PrefetchCache $default$getPrefetchCache(Profile profile) {
            throw new UnsupportedOperationException("Profile#getPrefetchCache is not implemented.");
        }

        public static boolean $default$hasCustomHeader(Profile profile, String str) {
            return false;
        }

        public static void $default$preconnect(Profile profile, String str) {
            throw new UnsupportedOperationException("Profile#preconnect is not implemented.");
        }

        public static void $default$setMaxPrerenders(Profile profile, int i2) {
            throw new UnsupportedOperationException("Profile#setMaxPrerenders is not implemented.");
        }

        public static void $default$clearCustomHeader(Profile profile, String str, String str2) {
        }
    }

    /* compiled from: WazeSource */
    @Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
    @Retention(RetentionPolicy.CLASS)
    public @interface ExperimentalAddQuicHints {
    }

    /* compiled from: WazeSource */
    @Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
    @Retention(RetentionPolicy.CLASS)
    public @interface ExperimentalPreconnect {
    }

    /* compiled from: WazeSource */
    @Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
    @Retention(RetentionPolicy.CLASS)
    public @interface ExperimentalUrlPrefetch {
    }

    /* compiled from: WazeSource */
    @Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
    @Retention(RetentionPolicy.CLASS)
    public @interface ExperimentalWarmUpRendererProcess {
    }

    void addCustomHeader(CustomHeader customHeader);

    void addQuicHints(Set<String> set);

    void clearAllCustomHeaders();

    void clearCustomHeader(String str);

    void clearCustomHeader(String str, String str2);

    void clearMaxPrerenders();

    CookieManager getCookieManager();

    Set<CustomHeader> getCustomHeaders();

    Set<CustomHeader> getCustomHeaders(String str);

    Set<CustomHeader> getCustomHeaders(String str, String str2);

    GeolocationPermissions getGeolocationPermissions();

    HttpCache getHttpCache();

    int getMaxPrerenders();

    String getName();

    PrefetchCache getPrefetchCache();

    ServiceWorkerController getServiceWorkerController();

    WebStorage getWebStorage();

    boolean hasCustomHeader(String str);

    void preconnect(String str);

    @Deprecated
    void prefetchUrlAsync(String str, CancellationSignal cancellationSignal, Executor executor, SpeculativeLoadingParameters speculativeLoadingParameters, WebViewOutcomeReceiver<Void, PrefetchException> webViewOutcomeReceiver);

    @Deprecated
    void prefetchUrlAsync(String str, CancellationSignal cancellationSignal, Executor executor, WebViewOutcomeReceiver<Void, PrefetchException> webViewOutcomeReceiver);

    void setMaxPrerenders(int i2);

    @Deprecated(forRemoval = true)
    void setSpeculativeLoadingConfig(SpeculativeLoadingConfig speculativeLoadingConfig);

    void warmUpRendererProcess();
}
