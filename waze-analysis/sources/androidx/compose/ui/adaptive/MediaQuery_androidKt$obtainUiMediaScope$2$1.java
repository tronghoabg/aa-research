package androidx.compose.ui.adaptive;

import android.hardware.input.InputManager;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class MediaQuery_androidKt$obtainUiMediaScope$2$1 extends y implements l<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ InputManager $inputManager;
    final /* synthetic */ UiMediaScopeImpl $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaQuery_androidKt$obtainUiMediaScope$2$1(InputManager inputManager, UiMediaScopeImpl uiMediaScopeImpl) {
        super(1);
        this.$inputManager = inputManager;
        this.$scope = uiMediaScopeImpl;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$2$1$listener$1] */
    @Override // h.g.a.l
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        final UiMediaScopeImpl uiMediaScopeImpl = this.$scope;
        final InputManager inputManager = this.$inputManager;
        final ?? r4 = new InputManager.InputDeviceListener() { // from class: androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$2$1$listener$1
            @Override // android.hardware.input.InputManager.InputDeviceListener
            public void onInputDeviceAdded(int i2) {
                update();
            }

            @Override // android.hardware.input.InputManager.InputDeviceListener
            public void onInputDeviceChanged(int i2) {
                update();
            }

            @Override // android.hardware.input.InputManager.InputDeviceListener
            public void onInputDeviceRemoved(int i2) {
                update();
            }

            public final void update() {
                uiMediaScopeImpl.m7720set_anyPointerZYK4Wgo(MediaQuery_androidKt.resolvePointerPrecision(inputManager));
                uiMediaScopeImpl.setHasPhysicalKeyboard(MediaQuery_androidKt.hasPhysicalKeyboard(inputManager));
            }
        };
        Handler handler = new Handler(Looper.getMainLooper());
        this.$inputManager.registerInputDeviceListener((InputManager.InputDeviceListener) r4, handler);
        r4.update();
        final InputManager inputManager2 = this.$inputManager;
        return new DisposableEffectResult() { // from class: androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$2$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                inputManager2.unregisterInputDeviceListener(r4);
            }
        };
    }
}
