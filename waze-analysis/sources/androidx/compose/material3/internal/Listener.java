package androidx.compose.material3.internal;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import com.a.a.a.a$$ExternalSyntheticApiModelOutline0;
import h.n.o;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class Listener implements AccessibilityManager.AccessibilityStateChangeListener, State<Boolean> {
    private final MutableState accessibilityEnabled$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final boolean listenToSwitchAccessState;
    private final boolean listenToVoiceAccessState;
    private final Listener$otherA11yServicesListener$1 otherA11yServicesListener;
    private final Listener$touchExplorationListener$1 touchExplorationListener;

    /* compiled from: WazeSource */
    final class Api33Impl {
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        public static final void addAccessibilityServicesStateChangeListener(AccessibilityManager accessibilityManager, AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
            accessibilityManager.addAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
        }

        public static final void removeAccessibilityServicesStateChangeListener(AccessibilityManager accessibilityManager, AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
            accessibilityManager.removeAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
        }
    }

    public Listener(boolean z, boolean z2, boolean z3) {
        this.listenToSwitchAccessState = z2;
        this.listenToVoiceAccessState = z3;
        Listener$otherA11yServicesListener$1 listener$otherA11yServicesListener$1 = null;
        this.touchExplorationListener = z ? new Listener$touchExplorationListener$1() : null;
        if ((z2 || z3) && Build.VERSION.SDK_INT >= 33) {
            listener$otherA11yServicesListener$1 = new Listener$otherA11yServicesListener$1(this);
        }
        this.otherA11yServicesListener = listener$otherA11yServicesListener$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getAccessibilityEnabled() {
        return ((Boolean) this.accessibilityEnabled$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getSwitchAccessEnabled(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i2 = 0; i2 < size; i2++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i2).getSettingsActivityName();
            if (settingsActivityName != null && o.F(settingsActivityName, "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getVoiceAccessEnabled(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i2 = 0; i2 < size; i2++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i2).getSettingsActivityName();
            if (settingsActivityName != null && o.F(settingsActivityName, "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    private final void setAccessibilityEnabled(boolean z) {
        this.accessibilityEnabled$delegate.setValue(Boolean.valueOf(z));
    }

    public final boolean getListenToSwitchAccessState() {
        return this.listenToSwitchAccessState;
    }

    public final boolean getListenToVoiceAccessState() {
        return this.listenToVoiceAccessState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    public Boolean getValue() {
        Listener$touchExplorationListener$1 listener$touchExplorationListener$1;
        Listener$otherA11yServicesListener$1 listener$otherA11yServicesListener$1;
        Listener$otherA11yServicesListener$1 listener$otherA11yServicesListener$12;
        boolean z = false;
        if (getAccessibilityEnabled() && (((listener$touchExplorationListener$1 = this.touchExplorationListener) != null && listener$touchExplorationListener$1.getEnabled()) || ((this.listenToSwitchAccessState && (listener$otherA11yServicesListener$12 = this.otherA11yServicesListener) != null && listener$otherA11yServicesListener$12.getSwitchAccessEnabled()) || (this.listenToVoiceAccessState && (listener$otherA11yServicesListener$1 = this.otherA11yServicesListener) != null && listener$otherA11yServicesListener$1.getVoiceAccessEnabled())))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z) {
        setAccessibilityEnabled(z);
    }

    public final void register(AccessibilityManager accessibilityManager) {
        Listener$otherA11yServicesListener$1 listener$otherA11yServicesListener$1;
        setAccessibilityEnabled(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(this);
        Listener$touchExplorationListener$1 listener$touchExplorationListener$1 = this.touchExplorationListener;
        if (listener$touchExplorationListener$1 != null) {
            listener$touchExplorationListener$1.setEnabled(accessibilityManager.isTouchExplorationEnabled());
            accessibilityManager.addTouchExplorationStateChangeListener(listener$touchExplorationListener$1);
        }
        if (Build.VERSION.SDK_INT < 33 || (listener$otherA11yServicesListener$1 = this.otherA11yServicesListener) == null) {
            return;
        }
        listener$otherA11yServicesListener$1.setSwitchAccessEnabled(getSwitchAccessEnabled(accessibilityManager));
        listener$otherA11yServicesListener$1.setVoiceAccessEnabled(getVoiceAccessEnabled(accessibilityManager));
        Api33Impl.addAccessibilityServicesStateChangeListener(accessibilityManager, a$$ExternalSyntheticApiModelOutline0.m13485m((Object) listener$otherA11yServicesListener$1));
    }

    public final void unregister(AccessibilityManager accessibilityManager) {
        Listener$otherA11yServicesListener$1 listener$otherA11yServicesListener$1;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        Listener$touchExplorationListener$1 listener$touchExplorationListener$1 = this.touchExplorationListener;
        if (listener$touchExplorationListener$1 != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(listener$touchExplorationListener$1);
        }
        if (Build.VERSION.SDK_INT < 33 || (listener$otherA11yServicesListener$1 = this.otherA11yServicesListener) == null) {
            return;
        }
        Api33Impl.removeAccessibilityServicesStateChangeListener(accessibilityManager, a$$ExternalSyntheticApiModelOutline0.m13485m((Object) listener$otherA11yServicesListener$1));
    }
}
