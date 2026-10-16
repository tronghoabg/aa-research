package androidx.compose.material3.internal;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Listener$otherA11yServicesListener$1 implements AccessibilityManager$AccessibilityServicesStateChangeListener {
    final /* synthetic */ Listener this$0;
    private final MutableState switchAccessEnabled$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final MutableState voiceAccessEnabled$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    Listener$otherA11yServicesListener$1(Listener listener) {
        this.this$0 = listener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getSwitchAccessEnabled() {
        return ((Boolean) this.switchAccessEnabled$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getVoiceAccessEnabled() {
        return ((Boolean) this.voiceAccessEnabled$delegate.getValue()).booleanValue();
    }

    public void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
        setSwitchAccessEnabled(this.this$0.getSwitchAccessEnabled(accessibilityManager));
        setVoiceAccessEnabled(this.this$0.getVoiceAccessEnabled(accessibilityManager));
    }

    public final void setSwitchAccessEnabled(boolean z) {
        this.switchAccessEnabled$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setVoiceAccessEnabled(boolean z) {
        this.voiceAccessEnabled$delegate.setValue(Boolean.valueOf(z));
    }
}
