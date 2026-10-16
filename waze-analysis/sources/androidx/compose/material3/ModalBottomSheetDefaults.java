package androidx.compose.material3;

import androidx.compose.ui.window.SecureFlagPolicy;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ModalBottomSheetDefaults {
    public static final int $stable = 0;
    public static final ModalBottomSheetDefaults INSTANCE = new ModalBottomSheetDefaults();
    private static final ModalBottomSheetProperties properties = new ModalBottomSheetProperties();

    private ModalBottomSheetDefaults() {
    }

    public static /* synthetic */ ModalBottomSheetProperties properties$default(ModalBottomSheetDefaults modalBottomSheetDefaults, SecureFlagPolicy secureFlagPolicy, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            secureFlagPolicy = SecureFlagPolicy.Inherit;
        }
        return modalBottomSheetDefaults.properties(secureFlagPolicy, z | (!((i2 & 2) == 0)), z2 | (!((i2 & 4) == 0)));
    }

    public final ModalBottomSheetProperties getProperties() {
        return properties;
    }

    public final ModalBottomSheetProperties properties(SecureFlagPolicy secureFlagPolicy, boolean z, boolean z2) {
        return new ModalBottomSheetProperties(secureFlagPolicy, z2, false, 4, (o) null);
    }
}
