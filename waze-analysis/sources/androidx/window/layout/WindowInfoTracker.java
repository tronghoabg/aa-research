package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.core.util.Consumer;
import androidx.window.WindowSdkExtensions;
import androidx.window.core.ConsumerAdapter;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.adapter.EngagementModeBackend;
import androidx.window.layout.adapter.WindowBackend;
import androidx.window.layout.adapter.extensions.ExtensionWindowBackend;
import androidx.window.layout.adapter.sidecar.SidecarWindowBackend;
import h.f;
import h.g;
import h.g.a.a;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.j;
import java.util.List;
import java.util.concurrent.Executor;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface WindowInfoTracker {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    /* renamed from: androidx.window.layout.WindowInfoTracker$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static WindowLayoutInfo $default$getCurrentWindowLayoutInfo(WindowInfoTracker windowInfoTracker, Context context) {
            x.f(context, "context");
            throw new j("Method was not implemented.");
        }

        public static List $default$getSupportedPostures(WindowInfoTracker windowInfoTracker) {
            throw new j("Method was not implemented.");
        }

        public static void $default$registerWindowEngagementInfoListener(WindowInfoTracker windowInfoTracker, Context context, Executor executor, Consumer consumer) {
            x.f(context, "context");
            x.f(executor, "executor");
            x.f(consumer, "listener");
            throw new j("Method was not implemented.");
        }

        public static void $default$registerWindowLayoutInfoListener(WindowInfoTracker windowInfoTracker, Context context, Executor executor, Consumer consumer) {
            x.f(context, "context");
            x.f(executor, "executor");
            x.f(consumer, "listener");
            throw new j("Method was not implemented.");
        }

        public static void $default$unregisterWindowEngagementInfoListener(WindowInfoTracker windowInfoTracker, Consumer consumer) {
            x.f(consumer, "listener");
            throw new j("Method was not implemented.");
        }

        public static void $default$unregisterWindowLayoutInfoListener(WindowInfoTracker windowInfoTracker, Consumer consumer) {
            x.f(consumer, "listener");
            throw new j("Method was not implemented.");
        }

        public static k $default$windowEngagementInfo(WindowInfoTracker windowInfoTracker, Context context) {
            x.f(context, "context");
            throw new j("Method was not implemented.");
        }

        public static k $default$windowLayoutInfo(WindowInfoTracker windowInfoTracker, Context context) {
            x.f(context, "context");
            Activity activity = context instanceof Activity ? (Activity) context : null;
            k<WindowLayoutInfo> kVarWindowLayoutInfo = activity != null ? windowInfoTracker.windowLayoutInfo(activity) : null;
            if (kVarWindowLayoutInfo != null) {
                return kVarWindowLayoutInfo;
            }
            throw new j("Must override windowLayoutInfo(context) and provide an implementation.");
        }

        static {
            Companion companion = WindowInfoTracker.Companion;
        }

        public static WindowInfoTracker getOrCreate(Context context) {
            return WindowInfoTracker.Companion.getOrCreate(context);
        }

        public static void overrideDecorator(WindowInfoTrackerDecorator windowInfoTrackerDecorator) {
            WindowInfoTracker.Companion.overrideDecorator(windowInfoTrackerDecorator);
        }

        public static void reset() {
            WindowInfoTracker.Companion.reset();
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final boolean DEBUG = false;
        private static final String TAG;
        private static WindowInfoTrackerDecorator decorator;
        private static final f<WindowBackend> extensionBackend$delegate;

        static {
            int i2 = ar.f48106a;
            TAG = new m(WindowInfoTracker.class).c();
            extensionBackend$delegate = g.a(new a() { // from class: androidx.window.layout.WindowInfoTracker$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return WindowInfoTracker.Companion.extensionBackend_delegate$lambda$0();
                }
            });
            decorator = EmptyDecorator.INSTANCE;
        }

        private Companion() {
        }

        static final WindowBackend extensionBackend_delegate$lambda$0() {
            WindowLayoutComponent windowLayoutComponent;
            try {
                ClassLoader classLoader = WindowInfoTracker.class.getClassLoader();
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = classLoader != null ? new SafeWindowLayoutComponentProvider(classLoader, new ConsumerAdapter(classLoader)) : null;
                if (safeWindowLayoutComponentProvider == null || (windowLayoutComponent = safeWindowLayoutComponentProvider.getWindowLayoutComponent()) == null) {
                    return null;
                }
                return ExtensionWindowBackend.Companion.newInstance(windowLayoutComponent, new ConsumerAdapter(classLoader));
            } catch (Throwable unused) {
                if (!DEBUG) {
                    return null;
                }
                Log.d(TAG, "Failed to load WindowExtensions");
                return null;
            }
        }

        public static /* synthetic */ void getExtensionBackend$window$annotations() {
        }

        public final WindowBackend getExtensionBackend$window() {
            return extensionBackend$delegate.getValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final WindowInfoTracker getOrCreate(Context context) {
            x.f(context, "context");
            SidecarWindowBackend extensionBackend$window = getExtensionBackend$window();
            if (extensionBackend$window == null) {
                extensionBackend$window = SidecarWindowBackend.Companion.getInstance(context);
            }
            return decorator.decorate(new WindowInfoTrackerImpl(new WindowMetricsCalculatorCompat(null, 1, 0 == true ? 1 : 0), extensionBackend$window, WindowSdkExtensions.Companion.getInstance(), EngagementModeBackend.Companion.getInstance(context)));
        }

        public final void overrideDecorator(WindowInfoTrackerDecorator windowInfoTrackerDecorator) {
            x.f(windowInfoTrackerDecorator, "overridingDecorator");
            decorator = windowInfoTrackerDecorator;
        }

        public final void reset() {
            decorator = EmptyDecorator.INSTANCE;
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static WindowLayoutInfo getCurrentWindowLayoutInfo(WindowInfoTracker windowInfoTracker, Context context) {
            x.f(context, "context");
            return CC.$default$getCurrentWindowLayoutInfo(windowInfoTracker, context);
        }

        @Deprecated
        public static List<SupportedPosture> getSupportedPostures(WindowInfoTracker windowInfoTracker) {
            return CC.$default$getSupportedPostures(windowInfoTracker);
        }

        public static /* synthetic */ void getSupportedPostures$annotations() {
        }

        @Deprecated
        public static void registerWindowEngagementInfoListener(WindowInfoTracker windowInfoTracker, Context context, Executor executor, Consumer<WindowEngagementInfo> consumer) {
            x.f(context, "context");
            x.f(executor, "executor");
            x.f(consumer, "listener");
            CC.$default$registerWindowEngagementInfoListener(windowInfoTracker, context, executor, consumer);
        }

        @Deprecated
        public static void registerWindowLayoutInfoListener(WindowInfoTracker windowInfoTracker, Context context, Executor executor, Consumer<WindowLayoutInfo> consumer) {
            x.f(context, "context");
            x.f(executor, "executor");
            x.f(consumer, "listener");
            CC.$default$registerWindowLayoutInfoListener(windowInfoTracker, context, executor, consumer);
        }

        @Deprecated
        public static void unregisterWindowEngagementInfoListener(WindowInfoTracker windowInfoTracker, Consumer<WindowEngagementInfo> consumer) {
            x.f(consumer, "listener");
            CC.$default$unregisterWindowEngagementInfoListener(windowInfoTracker, consumer);
        }

        @Deprecated
        public static void unregisterWindowLayoutInfoListener(WindowInfoTracker windowInfoTracker, Consumer<WindowLayoutInfo> consumer) {
            x.f(consumer, "listener");
            CC.$default$unregisterWindowLayoutInfoListener(windowInfoTracker, consumer);
        }

        @Deprecated
        public static k<WindowEngagementInfo> windowEngagementInfo(WindowInfoTracker windowInfoTracker, Context context) {
            x.f(context, "context");
            return CC.$default$windowEngagementInfo(windowInfoTracker, context);
        }

        @Deprecated
        public static k<WindowLayoutInfo> windowLayoutInfo(WindowInfoTracker windowInfoTracker, Context context) {
            x.f(context, "context");
            return CC.$default$windowLayoutInfo(windowInfoTracker, context);
        }
    }

    WindowLayoutInfo getCurrentWindowLayoutInfo(Context context);

    List<SupportedPosture> getSupportedPostures();

    void registerWindowEngagementInfoListener(Context context, Executor executor, Consumer<WindowEngagementInfo> consumer);

    void registerWindowLayoutInfoListener(Context context, Executor executor, Consumer<WindowLayoutInfo> consumer);

    void unregisterWindowEngagementInfoListener(Consumer<WindowEngagementInfo> consumer);

    void unregisterWindowLayoutInfoListener(Consumer<WindowLayoutInfo> consumer);

    k<WindowEngagementInfo> windowEngagementInfo(Context context);

    k<WindowLayoutInfo> windowLayoutInfo(Activity activity);

    k<WindowLayoutInfo> windowLayoutInfo(Context context);
}
