package androidx.compose.ui.adaptive;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.input.InputManager;
import android.view.InputDevice;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.UiMediaScope;
import androidx.compose.ui.platform.WindowInfo;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowLayoutInfo;
import h.ab;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class MediaQuery_androidKt {
    private static final boolean hasFallbackCoarsePointer(InputDevice inputDevice) {
        InputDevice.MotionRange motionRange = inputDevice.getMotionRange(0);
        if (motionRange == null || !motionRange.isFromSource(InputDeviceCompat.SOURCE_TOUCHSCREEN)) {
            return false;
        }
        return (inputDevice.getMotionRange(4) == null && inputDevice.getMotionRange(5) == null) ? false : true;
    }

    private static final boolean hasFallbackFinePointer(InputDevice inputDevice) {
        InputDevice.MotionRange motionRange = inputDevice.getMotionRange(0);
        return (motionRange == null || !motionRange.isFromSource(InputDeviceCompat.SOURCE_MOUSE) || inputDevice.getMotionRange(9) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasPhysicalKeyboard(InputManager inputManager) {
        int[] inputDeviceIds;
        if (inputManager != null && (inputDeviceIds = inputManager.getInputDeviceIds()) != null) {
            for (int i2 : inputDeviceIds) {
                InputDevice inputDevice = inputManager.getInputDevice(i2);
                if (inputDevice != null && inputDevice.getKeyboardType() == 2 && !inputDevice.isVirtual()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final boolean hasSource(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    private static final boolean hasValidPointerSource(InputDevice inputDevice, int i2, int i3) {
        return (inputDevice.getSources() & i2) == i2 && inputDevice.getMotionRange(i3, i2) != null;
    }

    static /* synthetic */ boolean hasValidPointerSource$default(InputDevice inputDevice, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return hasValidPointerSource(inputDevice, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isAutomotiveDevice(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.type.automotive");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isCameraAvailable(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.camera.any");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isDocked(Intent intent) {
        return (intent == null || intent.getIntExtra("android.intent.extra.DOCK_STATE", 0) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isImeVisible(WindowInsetsCompat windowInsetsCompat) {
        return windowInsetsCompat != null && windowInsetsCompat.isVisible(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isMicAvailable(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.microphone");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isTvDevice(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.software.leanback");
    }

    public static final UiMediaScope obtainUiMediaScope(Context context, View view, WindowInfo windowInfo, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-590796729, i2, -1, "androidx.compose.ui.adaptive.obtainUiMediaScope (MediaQuery.android.kt:121)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            Object systemService = context.getSystemService("input");
            x.d(systemService, "null cannot be cast to non-null type android.hardware.input.InputManager");
            objRememberedValue = (InputManager) systemService;
            composer.updateRememberedValue(objRememberedValue);
        }
        InputManager inputManager = (InputManager) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = Boolean.valueOf(isImeVisible(ViewCompat.getRootWindowInsets(view)));
            composer.updateRememberedValue(objRememberedValue2);
        }
        boolean zBooleanValue = ((Boolean) objRememberedValue2).booleanValue();
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = new UiMediaScopeImpl(context, inputManager, windowInfo, zBooleanValue);
            composer.updateRememberedValue(objRememberedValue3);
        }
        UiMediaScopeImpl uiMediaScopeImpl = (UiMediaScopeImpl) objRememberedValue3;
        uiMediaScopeImpl.set_windowInfo(windowInfo);
        boolean zChangedInstance = composer.changedInstance(context);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue4 == Composer.Companion.getEmpty()) {
            objRememberedValue4 = (p) new MediaQuery_androidKt$obtainUiMediaScope$1$1(context, uiMediaScopeImpl, null);
            composer.updateRememberedValue(objRememberedValue4);
        }
        int i3 = i2 & 14;
        EffectsKt.LaunchedEffect(context, (p<? super af, ? super e<? super ab>, ? extends Object>) objRememberedValue4, composer, i3);
        boolean zChangedInstance2 = composer.changedInstance(inputManager);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue5 == Composer.Companion.getEmpty()) {
            objRememberedValue5 = (l) new MediaQuery_androidKt$obtainUiMediaScope$2$1(inputManager, uiMediaScopeImpl);
            composer.updateRememberedValue(objRememberedValue5);
        }
        EffectsKt.DisposableEffect(context, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composer, i3);
        boolean zChangedInstance3 = composer.changedInstance(view);
        Object objRememberedValue6 = composer.rememberedValue();
        if (zChangedInstance3 || objRememberedValue6 == Composer.Companion.getEmpty()) {
            objRememberedValue6 = (l) new MediaQuery_androidKt$obtainUiMediaScope$3$1(view, uiMediaScopeImpl);
            composer.updateRememberedValue(objRememberedValue6);
        }
        EffectsKt.DisposableEffect(view, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue6, composer, (i2 >> 3) & 14);
        boolean zChangedInstance4 = composer.changedInstance(context);
        Object objRememberedValue7 = composer.rememberedValue();
        if (zChangedInstance4 || objRememberedValue7 == Composer.Companion.getEmpty()) {
            objRememberedValue7 = (l) new MediaQuery_androidKt$obtainUiMediaScope$4$1(context, uiMediaScopeImpl);
            composer.updateRememberedValue(objRememberedValue7);
        }
        EffectsKt.DisposableEffect(context, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue7, composer, i3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return uiMediaScopeImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resolvePointerPrecision(InputManager inputManager) {
        if (inputManager == null) {
            return UiMediaScope.PointerPrecision.Companion.m7697getNonefpxItnM();
        }
        String strM7697getNonefpxItnM = UiMediaScope.PointerPrecision.Companion.m7697getNonefpxItnM();
        String strM7697getNonefpxItnM2 = UiMediaScope.PointerPrecision.Companion.m7697getNonefpxItnM();
        for (int i2 : inputManager.getInputDeviceIds()) {
            InputDevice inputDevice = inputManager.getInputDevice(i2);
            if (inputDevice != null) {
                if (hasValidPointerSource$default(inputDevice, InputDeviceCompat.SOURCE_MOUSE, 0, 2, null) || hasValidPointerSource$default(inputDevice, InputDeviceCompat.SOURCE_STYLUS, 0, 2, null) || hasValidPointerSource$default(inputDevice, InputDeviceCompat.SOURCE_TOUCHPAD, 0, 2, null)) {
                    return UiMediaScope.PointerPrecision.Companion.m7696getFinefpxItnM();
                }
                if (hasValidPointerSource$default(inputDevice, InputDeviceCompat.SOURCE_TOUCHSCREEN, 0, 2, null)) {
                    strM7697getNonefpxItnM = UiMediaScope.PointerPrecision.Companion.m7695getCoarsefpxItnM();
                } else if (UiMediaScope.PointerPrecision.m7690equalsimpl0(strM7697getNonefpxItnM, UiMediaScope.PointerPrecision.Companion.m7697getNonefpxItnM()) && (hasValidPointerSource$default(inputDevice, InputDeviceCompat.SOURCE_JOYSTICK, 0, 2, null) || hasValidPointerSource$default(inputDevice, 1025, 0, 2, null))) {
                    strM7697getNonefpxItnM = UiMediaScope.PointerPrecision.Companion.m7694getBluntfpxItnM();
                }
                if (hasFallbackFinePointer(inputDevice)) {
                    strM7697getNonefpxItnM2 = UiMediaScope.PointerPrecision.Companion.m7696getFinefpxItnM();
                } else if (!UiMediaScope.PointerPrecision.m7690equalsimpl0(strM7697getNonefpxItnM2, UiMediaScope.PointerPrecision.Companion.m7696getFinefpxItnM()) && hasFallbackCoarsePointer(inputDevice)) {
                    strM7697getNonefpxItnM2 = UiMediaScope.PointerPrecision.Companion.m7695getCoarsefpxItnM();
                }
            }
        }
        return !UiMediaScope.PointerPrecision.m7690equalsimpl0(strM7697getNonefpxItnM, UiMediaScope.PointerPrecision.Companion.m7697getNonefpxItnM()) ? strM7697getNonefpxItnM : strM7697getNonefpxItnM2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resolvePosture(WindowLayoutInfo windowLayoutInfo) {
        Object next;
        List<DisplayFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        ArrayList arrayList = new ArrayList();
        for (Object obj : displayFeatures) {
            if (obj instanceof FoldingFeature) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (x.n(((FoldingFeature) next).getState(), FoldingFeature.State.HALF_OPENED)) {
                break;
            }
        }
        FoldingFeature foldingFeature = (FoldingFeature) next;
        return foldingFeature == null ? UiMediaScope.Posture.Companion.m7706getFlatm18o9QQ() : x.n(foldingFeature.getOrientation(), FoldingFeature.Orientation.HORIZONTAL) ? UiMediaScope.Posture.Companion.m7707getTabletopm18o9QQ() : UiMediaScope.Posture.Companion.m7705getBookm18o9QQ();
    }
}
