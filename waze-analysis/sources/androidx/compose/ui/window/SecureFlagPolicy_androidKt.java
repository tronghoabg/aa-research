package androidx.compose.ui.window;

import h.i;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SecureFlagPolicy_androidKt {

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SecureFlagPolicy.values().length];
            try {
                iArr[SecureFlagPolicy.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SecureFlagPolicy.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SecureFlagPolicy.Inherit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean shouldApplySecureFlag(SecureFlagPolicy secureFlagPolicy, boolean z) {
        SecureFlagPolicy secureFlagPolicy2 = SecureFlagPolicy.Inherit;
        int iOrdinal = secureFlagPolicy.ordinal();
        if (iOrdinal != 0) {
            z = true;
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return false;
                }
                throw new i();
            }
        }
        return z;
    }
}
