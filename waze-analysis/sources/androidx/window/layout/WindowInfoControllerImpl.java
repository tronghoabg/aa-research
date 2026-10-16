package androidx.window.layout;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import android.view.WindowManager;
import h.g.b.o;
import h.g.b.x;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WindowInfoControllerImpl extends WindowInfoController {

    @Deprecated
    public static final int ENGAGEMENT_CONTROL_FLAG_SUSTAIN_VISUALS = 1;
    private static Method dispatchMethod;
    private static boolean isMethodLoaded;
    private static final Companion Companion = new Companion(null);
    private static final String TAG = "WindowInfoControllerImpl";

    @Override // androidx.window.layout.WindowInfoController
    public void requestVisualState(Context context, VisualStateRequest visualStateRequest) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        x.f(context, "context");
        x.f(visualStateRequest, "request");
        if (!x.n(Looper.getMainLooper(), Looper.myLooper())) {
            throw new IllegalStateException("requestVisualState must be called from the main thread");
        }
        try {
            boolean zIsSustainedVisualsEnabled = visualStateRequest.isSustainedVisualsEnabled();
            WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
            if (windowManager == null) {
                Log.w(TAG, "WindowManager is null. Cannot request visual state.");
                return;
            }
            Method dispatchMethod2 = Companion.getDispatchMethod(windowManager);
            if (dispatchMethod2 != null) {
                dispatchMethod2.invoke(windowManager, Integer.valueOf(zIsSustainedVisualsEnabled ? 1 : 0));
            }
        } catch (Exception e2) {
            Log.e(TAG, "Exception while requesting visual state", e2);
        }
    }

    /* compiled from: WazeSource */
    final class Companion {
        private Companion() {
        }

        public final Method getDispatchMethod(WindowManager windowManager) {
            x.f(windowManager, "windowManager");
            if (!WindowInfoControllerImpl.isMethodLoaded) {
                try {
                    WindowInfoControllerImpl.dispatchMethod = windowManager.getClass().getMethod("requestEngagementControlState", Integer.TYPE);
                } catch (Exception e2) {
                    Log.e(getTAG(), "Failed to find requestEngagementControlState method", e2);
                }
                WindowInfoControllerImpl.isMethodLoaded = true;
            }
            return WindowInfoControllerImpl.dispatchMethod;
        }

        public final String getTAG() {
            return WindowInfoControllerImpl.TAG;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
