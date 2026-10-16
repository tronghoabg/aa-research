package androidx.compose.material3;

import androidx.compose.ui.window.SecureFlagPolicy;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ModalBottomSheetProperties {
    public static final int $stable = 0;
    private final Boolean isAppearanceLightNavigationBars;
    private final Boolean isAppearanceLightStatusBars;
    private final SecureFlagPolicy securePolicy;
    private final boolean shouldDismissOnBackPress;
    private final boolean shouldDismissOnClickOutside;

    public /* synthetic */ ModalBottomSheetProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4, int i2, o oVar) {
        this(z, z2, (i2 & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (!((i2 & 8) == 0)) | z3, (!((i2 & 16) == 0)) | z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModalBottomSheetProperties)) {
            return false;
        }
        ModalBottomSheetProperties modalBottomSheetProperties = (ModalBottomSheetProperties) obj;
        return this.securePolicy == modalBottomSheetProperties.securePolicy && x.n(this.isAppearanceLightStatusBars, modalBottomSheetProperties.isAppearanceLightStatusBars) && x.n(this.isAppearanceLightNavigationBars, modalBottomSheetProperties.isAppearanceLightNavigationBars) && this.shouldDismissOnClickOutside == modalBottomSheetProperties.shouldDismissOnClickOutside && this.shouldDismissOnBackPress == modalBottomSheetProperties.shouldDismissOnBackPress;
    }

    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    public final boolean getShouldDismissOnBackPress() {
        return this.shouldDismissOnBackPress;
    }

    public int hashCode() {
        int iHashCode = this.securePolicy.hashCode() * 31;
        Boolean bool = this.isAppearanceLightStatusBars;
        int iM = (((iHashCode + ModalBottomSheetProperties$$ExternalSyntheticBackport0.m(this.shouldDismissOnBackPress)) * 31) + (bool != null ? ModalBottomSheetProperties$$ExternalSyntheticBackport0.m(bool.booleanValue()) : 0)) * 31;
        Boolean bool2 = this.isAppearanceLightNavigationBars;
        return ((iM + (bool2 != null ? ModalBottomSheetProperties$$ExternalSyntheticBackport0.m(bool2.booleanValue()) : 0)) * 31) + ModalBottomSheetProperties$$ExternalSyntheticBackport0.m(this.shouldDismissOnClickOutside);
    }

    public final Boolean isAppearanceLightNavigationBars$material3() {
        return this.isAppearanceLightNavigationBars;
    }

    public final Boolean isAppearanceLightStatusBars$material3() {
        return this.isAppearanceLightStatusBars;
    }

    public final boolean shouldDismissOnClickOutside() {
        return this.shouldDismissOnClickOutside;
    }

    public ModalBottomSheetProperties() {
        this.securePolicy = SecureFlagPolicy.Inherit;
        this.shouldDismissOnBackPress = true;
        this.shouldDismissOnClickOutside = true;
        this.isAppearanceLightStatusBars = null;
        this.isAppearanceLightNavigationBars = null;
    }

    public /* synthetic */ ModalBottomSheetProperties(SecureFlagPolicy secureFlagPolicy, boolean z, boolean z2, int i2, o oVar) {
        this((i2 & 1) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, z | (!((i2 & 2) == 0)), z2 | (!((i2 & 4) == 0)));
    }

    public ModalBottomSheetProperties(boolean z, boolean z2) {
        this.securePolicy = SecureFlagPolicy.Inherit;
        this.shouldDismissOnBackPress = z;
        this.shouldDismissOnClickOutside = z2;
        this.isAppearanceLightNavigationBars = null;
        this.isAppearanceLightStatusBars = null;
    }

    public /* synthetic */ ModalBottomSheetProperties(boolean z, boolean z2, int i2, o oVar) {
        this(1 == ((z ? 1 : 0) | (i2 & 1)), z2 | (!((i2 & 2) == 0)));
    }

    public ModalBottomSheetProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4) {
        this.shouldDismissOnBackPress = z3;
        this.shouldDismissOnClickOutside = z4;
        this.securePolicy = secureFlagPolicy;
        this.isAppearanceLightStatusBars = Boolean.valueOf(z);
        this.isAppearanceLightNavigationBars = Boolean.valueOf(z2);
    }

    public ModalBottomSheetProperties(SecureFlagPolicy secureFlagPolicy, boolean z, boolean z2) {
        this.securePolicy = secureFlagPolicy;
        this.shouldDismissOnBackPress = z;
        this.shouldDismissOnClickOutside = z2;
        this.isAppearanceLightNavigationBars = null;
        this.isAppearanceLightStatusBars = null;
    }
}
