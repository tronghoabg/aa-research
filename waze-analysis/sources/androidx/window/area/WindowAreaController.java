package androidx.window.area;

import android.app.Activity;
import android.os.Build;
import android.util.Log;
import androidx.core.util.Consumer;
import androidx.window.core.BuildConfig;
import androidx.window.core.ExtensionsUtil;
import androidx.window.core.VerificationMode;
import androidx.window.extensions.area.WindowAreaComponent;
import h.f;
import h.g;
import h.g.a.a;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.o;
import h.g.b.x;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class WindowAreaController {
    public static final Companion Companion = new Companion(null);
    private static final String TAG;
    private static WindowAreaControllerDecorator decorator;
    private static final f<WindowAreaController> windowAreaController$delegate;

    static {
        int i2 = ar.f48106a;
        TAG = new m(WindowAreaController.class).c();
        decorator = EmptyDecorator.INSTANCE;
        windowAreaController$delegate = g.a(new a() { // from class: androidx.window.area.WindowAreaController$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return WindowAreaController.windowAreaController_delegate$lambda$0();
            }
        });
    }

    public static final WindowAreaController getOrCreate() {
        return Companion.getOrCreate();
    }

    public static final void overrideDecorator(WindowAreaControllerDecorator windowAreaControllerDecorator) {
        Companion.overrideDecorator(windowAreaControllerDecorator);
    }

    public static final void reset() {
        Companion.reset();
    }

    static final WindowAreaController windowAreaController_delegate$lambda$0() {
        WindowAreaComponent windowAreaComponent = null;
        try {
            ClassLoader classLoader = Companion.getClass().getClassLoader();
            if (classLoader != null) {
                windowAreaComponent = new SafeWindowAreaComponentProvider(classLoader).getWindowAreaComponent();
            }
        } catch (Throwable th) {
            if (BuildConfig.INSTANCE.getVerificationMode() == VerificationMode.LOG) {
                Log.d(TAG, "Failed to load WindowExtensions: ".concat(String.valueOf(th.getMessage())));
            }
        }
        return (Build.VERSION.SDK_INT <= 29 || windowAreaComponent == null || ExtensionsUtil.INSTANCE.getSafeVendorApiLevel() < 3) ? new EmptyWindowAreaControllerImpl() : new WindowAreaControllerImpl(windowAreaComponent);
    }

    public abstract void addWindowAreasListener(Executor executor, Consumer<List<WindowArea>> consumer);

    public abstract WindowAreaSessionPresenter getActivePresentationSession(WindowAreaToken windowAreaToken);

    public abstract void presentContentOnWindowArea(WindowAreaToken windowAreaToken, Activity activity, Executor executor, WindowAreaPresentationSessionCallback windowAreaPresentationSessionCallback);

    public abstract void removeWindowAreasListener(Consumer<List<WindowArea>> consumer);

    public abstract void transferToWindowArea(WindowAreaToken windowAreaToken, Activity activity);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final WindowAreaController getWindowAreaController() {
            return (WindowAreaController) WindowAreaController.windowAreaController$delegate.getValue();
        }

        public final WindowAreaController getOrCreate() {
            return WindowAreaController.decorator.decorate(getWindowAreaController());
        }

        public final void overrideDecorator(WindowAreaControllerDecorator windowAreaControllerDecorator) {
            x.f(windowAreaControllerDecorator, "overridingDecorator");
            WindowAreaController.decorator = windowAreaControllerDecorator;
        }

        public final void reset() {
            WindowAreaController.decorator = EmptyDecorator.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
