package androidx.window.layout.util;

import android.content.Context;
import android.hardware.input.InputManager;
import android.os.Handler;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface InputHelper {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    /* renamed from: androidx.window.layout.util.InputHelper$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ void registerInputDeviceListener$default(InputHelper inputHelper, InputManager.InputDeviceListener inputDeviceListener, Handler handler, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerInputDeviceListener");
            }
            if ((i2 & 2) != 0) {
                handler = null;
            }
            inputHelper.registerInputDeviceListener(inputDeviceListener, handler);
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final InputHelper getInstance(Context context) {
            x.f(context, "context");
            Object systemService = context.getApplicationContext().getSystemService("input");
            x.d(systemService, "null cannot be cast to non-null type android.hardware.input.InputManager");
            return new InputHelperImpl((InputManager) systemService);
        }
    }

    InputDeviceInfo getInputDevice(int i2);

    int[] getInputDeviceIds();

    boolean isMouseDeviceEnabled(InputDeviceInfo inputDeviceInfo);

    boolean isPhysicalKeyboardDevice(InputDeviceInfo inputDeviceInfo);

    void registerInputDeviceListener(InputManager.InputDeviceListener inputDeviceListener, Handler handler);

    void unregisterInputDeviceListener(InputManager.InputDeviceListener inputDeviceListener);
}
