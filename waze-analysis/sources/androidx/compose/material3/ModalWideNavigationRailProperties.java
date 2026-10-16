package androidx.compose.material3;

import androidx.compose.ui.window.SecureFlagPolicy;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ModalWideNavigationRailProperties {
    public static final int $stable = 0;
    private final SecureFlagPolicy securePolicy;
    private final boolean shouldDismissOnBackPress;

    public /* synthetic */ ModalWideNavigationRailProperties(SecureFlagPolicy secureFlagPolicy, boolean z, int i2, o oVar) {
        this((i2 & 1) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, z | (!((i2 & 2) == 0)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ModalWideNavigationRailProperties) && this.securePolicy == ((ModalWideNavigationRailProperties) obj).securePolicy;
    }

    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    public final boolean getShouldDismissOnBackPress() {
        return this.shouldDismissOnBackPress;
    }

    public int hashCode() {
        return (this.securePolicy.hashCode() * 31) + ModalWideNavigationRailProperties$$ExternalSyntheticBackport0.m(this.shouldDismissOnBackPress);
    }

    public ModalWideNavigationRailProperties(SecureFlagPolicy secureFlagPolicy, boolean z) {
        this.securePolicy = secureFlagPolicy;
        this.shouldDismissOnBackPress = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ModalWideNavigationRailProperties() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public ModalWideNavigationRailProperties(boolean z) {
        this(SecureFlagPolicy.Inherit, z);
    }

    public /* synthetic */ ModalWideNavigationRailProperties(boolean z, int i2, o oVar) {
        this(1 == ((z ? 1 : 0) | (i2 & 1)));
    }
}
