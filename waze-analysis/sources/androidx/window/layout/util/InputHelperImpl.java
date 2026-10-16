package androidx.window.layout.util;

import android.hardware.input.InputManager;
import android.os.Handler;
import android.view.InputDevice;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class InputHelperImpl implements InputHelper {
    private final InputManager inputManager;

    public InputHelperImpl(InputManager inputManager) {
        x.f(inputManager, "inputManager");
        this.inputManager = inputManager;
    }

    @Override // androidx.window.layout.util.InputHelper
    public InputDeviceInfo getInputDevice(int i2) {
        InputDevice inputDevice = this.inputManager.getInputDevice(i2);
        if (inputDevice == null) {
            return null;
        }
        return new InputDeviceInfo(inputDevice.getId(), inputDevice.isVirtual(), inputDevice.getSources(), inputDevice.getKeyboardType(), inputDevice.isEnabled());
    }

    @Override // androidx.window.layout.util.InputHelper
    public int[] getInputDeviceIds() {
        int[] inputDeviceIds = this.inputManager.getInputDeviceIds();
        x.e(inputDeviceIds, "getInputDeviceIds(...)");
        return inputDeviceIds;
    }

    @Override // androidx.window.layout.util.InputHelper
    public boolean isMouseDeviceEnabled(InputDeviceInfo inputDeviceInfo) {
        x.f(inputDeviceInfo, "descriptor");
        return inputDeviceInfo.isMouseEnabled();
    }

    @Override // androidx.window.layout.util.InputHelper
    public boolean isPhysicalKeyboardDevice(InputDeviceInfo inputDeviceInfo) {
        x.f(inputDeviceInfo, "descriptor");
        return inputDeviceInfo.isPhysicalKeyboard();
    }

    @Override // androidx.window.layout.util.InputHelper
    public void registerInputDeviceListener(InputManager.InputDeviceListener inputDeviceListener, Handler handler) {
        x.f(inputDeviceListener, "listener");
        this.inputManager.registerInputDeviceListener(inputDeviceListener, handler);
    }

    @Override // androidx.window.layout.util.InputHelper
    public void unregisterInputDeviceListener(InputManager.InputDeviceListener inputDeviceListener) {
        x.f(inputDeviceListener, "listener");
        this.inputManager.unregisterInputDeviceListener(inputDeviceListener);
    }
}
