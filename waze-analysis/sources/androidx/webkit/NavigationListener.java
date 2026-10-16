package androidx.webkit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface NavigationListener {

    /* compiled from: WazeSource */
    /* renamed from: androidx.webkit.NavigationListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onFirstContentfulPaintMillis(NavigationListener navigationListener, Page page, long j2) {
        }

        public static void $default$onLargestContentfulPaintMillis(NavigationListener navigationListener, Page page, long j2) {
        }

        public static void $default$onNavigationCompleted(NavigationListener navigationListener, Navigation navigation) {
        }

        public static void $default$onNavigationRedirected(NavigationListener navigationListener, Navigation navigation) {
        }

        public static void $default$onNavigationStarted(NavigationListener navigationListener, Navigation navigation) {
        }

        public static void $default$onPageDeleted(NavigationListener navigationListener, Page page) {
        }

        public static void $default$onPageDomContentLoadedEvent(NavigationListener navigationListener, Page page) {
        }

        public static void $default$onPageLoadEvent(NavigationListener navigationListener, Page page) {
        }

        public static void $default$onPerformanceMarkMillis(NavigationListener navigationListener, Page page, String str, long j2) {
        }
    }

    void onFirstContentfulPaintMillis(Page page, long j2);

    void onLargestContentfulPaintMillis(Page page, long j2);

    void onNavigationCompleted(Navigation navigation);

    void onNavigationRedirected(Navigation navigation);

    void onNavigationStarted(Navigation navigation);

    void onPageDeleted(Page page);

    void onPageDomContentLoadedEvent(Page page);

    void onPageLoadEvent(Page page);

    void onPerformanceMarkMillis(Page page, String str, long j2);
}
