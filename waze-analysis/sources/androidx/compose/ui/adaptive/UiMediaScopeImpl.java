package androidx.compose.ui.adaptive;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.input.InputManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.UiMediaScope;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.unit.DpSize;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class UiMediaScopeImpl implements UiMediaScope {
    public static final int $stable = 0;
    private final MutableState _anyPointer$delegate;
    private final MutableState _windowInfo$delegate;
    private final MutableState hasPhysicalKeyboard$delegate;
    private final MutableState isImeVisible$delegate;
    private final PackageManager packageManager;
    private final MutableState _windowPosture$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(UiMediaScope.Posture.m7698boximpl(UiMediaScope.Posture.Companion.m7706getFlatm18o9QQ()), null, 2, null);
    private final MutableState isDocked$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    public UiMediaScopeImpl(Context context, InputManager inputManager, WindowInfo windowInfo, boolean z) {
        this.packageManager = context.getPackageManager();
        this._windowInfo$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(windowInfo, null, 2, null);
        this._anyPointer$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(UiMediaScope.PointerPrecision.m7687boximpl(MediaQuery_androidKt.resolvePointerPrecision(inputManager)), null, 2, null);
        this.isImeVisible$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        this.hasPhysicalKeyboard$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(MediaQuery_androidKt.hasPhysicalKeyboard(inputManager)), null, 2, null);
    }

    @Override // androidx.compose.ui.UiMediaScope
    public boolean getHasCamera() {
        return MediaQuery_androidKt.isCameraAvailable(this.packageManager);
    }

    @Override // androidx.compose.ui.UiMediaScope
    public boolean getHasMicrophone() {
        return MediaQuery_androidKt.isMicAvailable(this.packageManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasPhysicalKeyboard() {
        return ((Boolean) this.hasPhysicalKeyboard$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.ui.UiMediaScope
    /* renamed from: getKeyboardKind-J9_QTjY */
    public String mo7671getKeyboardKindJ9_QTjY() {
        return getHasPhysicalKeyboard() ? UiMediaScope.KeyboardKind.Companion.m7685getPhysicalJ9_QTjY() : isImeVisible() ? UiMediaScope.KeyboardKind.Companion.m7686getVirtualJ9_QTjY() : UiMediaScope.KeyboardKind.Companion.m7684getNoneJ9_QTjY();
    }

    @Override // androidx.compose.ui.UiMediaScope
    /* renamed from: getPointerPrecision-fpxItnM */
    public String mo7672getPointerPrecisionfpxItnM() {
        return m7718get_anyPointerfpxItnM();
    }

    @Override // androidx.compose.ui.UiMediaScope
    /* renamed from: getViewingDistance-tKro-MQ */
    public String mo7673getViewingDistancetKroMQ() {
        return MediaQuery_androidKt.isTvDevice(this.packageManager) ? UiMediaScope.ViewingDistance.Companion.m7715getFartKroMQ() : (MediaQuery_androidKt.isAutomotiveDevice(this.packageManager) || isDocked()) ? UiMediaScope.ViewingDistance.Companion.m7716getMediumtKroMQ() : UiMediaScope.ViewingDistance.Companion.m7717getNeartKroMQ();
    }

    @Override // androidx.compose.ui.UiMediaScope
    /* renamed from: getWindowHeight-D9Ej5fM */
    public float mo7674getWindowHeightD9Ej5fM() {
        return DpSize.m11260getHeightD9Ej5fM(get_windowInfo().mo10258getContainerDpSizeMYxV2XQ());
    }

    @Override // androidx.compose.ui.UiMediaScope
    /* renamed from: getWindowPosture-m18o9QQ */
    public String mo7675getWindowPosturem18o9QQ() {
        return m7719get_windowPosturem18o9QQ();
    }

    @Override // androidx.compose.ui.UiMediaScope
    /* renamed from: getWindowWidth-D9Ej5fM */
    public float mo7676getWindowWidthD9Ej5fM() {
        return DpSize.m11262getWidthD9Ej5fM(get_windowInfo().mo10258getContainerDpSizeMYxV2XQ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: get_anyPointer-fpxItnM, reason: not valid java name */
    public final String m7718get_anyPointerfpxItnM() {
        return ((UiMediaScope.PointerPrecision) this._anyPointer$delegate.getValue()).m7693unboximpl();
    }

    public final WindowInfo get_windowInfo() {
        return (WindowInfo) this._windowInfo$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: get_windowPosture-m18o9QQ, reason: not valid java name */
    public final String m7719get_windowPosturem18o9QQ() {
        return ((UiMediaScope.Posture) this._windowPosture$delegate.getValue()).m7704unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDocked() {
        return ((Boolean) this.isDocked$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isImeVisible() {
        return ((Boolean) this.isImeVisible$delegate.getValue()).booleanValue();
    }

    public final void setDocked(boolean z) {
        this.isDocked$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setHasPhysicalKeyboard(boolean z) {
        this.hasPhysicalKeyboard$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setImeVisible(boolean z) {
        this.isImeVisible$delegate.setValue(Boolean.valueOf(z));
    }

    /* renamed from: set_anyPointer-ZYK4Wgo, reason: not valid java name */
    public final void m7720set_anyPointerZYK4Wgo(String str) {
        this._anyPointer$delegate.setValue(UiMediaScope.PointerPrecision.m7687boximpl(str));
    }

    public final void set_windowInfo(WindowInfo windowInfo) {
        this._windowInfo$delegate.setValue(windowInfo);
    }

    /* renamed from: set_windowPosture-InyEWag, reason: not valid java name */
    public final void m7721set_windowPostureInyEWag(String str) {
        this._windowPosture$delegate.setValue(UiMediaScope.Posture.m7698boximpl(str));
    }
}
