package androidx.compose.ui.window;

import android.os.IBinder;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DialogProperties {
    public static final int $stable = 0;
    private final boolean decorFitsSystemWindows;
    private final boolean dismissOnBackPress;
    private final boolean dismissOnClickOutside;
    private final SecureFlagPolicy securePolicy;
    private final boolean usePlatformDefaultWidth;
    private final String windowTitle;
    private final IBinder windowToken;
    private final int windowType;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4, String str, int i2, IBinder iBinder, int i3, o oVar) {
        SecureFlagPolicy secureFlagPolicy2 = (i3 & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy;
        this(1 == ((z ? 1 : 0) | (i3 & 1)), z2 | (!((i3 & 2) == 0)), secureFlagPolicy2, (!((i3 & 8) == 0)) | z3, (!((i3 & 16) == 0)) | z4, (i3 & 32) != 0 ? "" : str, (i3 & 64) != 0 ? 2 : i2, (i3 & 128) != 0 ? null : iBinder);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogProperties)) {
            return false;
        }
        DialogProperties dialogProperties = (DialogProperties) obj;
        return this.dismissOnBackPress == dialogProperties.dismissOnBackPress && this.dismissOnClickOutside == dialogProperties.dismissOnClickOutside && this.securePolicy == dialogProperties.securePolicy && this.usePlatformDefaultWidth == dialogProperties.usePlatformDefaultWidth && this.decorFitsSystemWindows == dialogProperties.decorFitsSystemWindows && this.windowType == dialogProperties.windowType && x.n(this.windowToken, dialogProperties.windowToken);
    }

    public final boolean getDecorFitsSystemWindows() {
        return this.decorFitsSystemWindows;
    }

    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public final String getWindowTitle() {
        return this.windowTitle;
    }

    public final IBinder getWindowToken() {
        return this.windowToken;
    }

    public final int getWindowType() {
        return this.windowType;
    }

    public int hashCode() {
        int iM = (((DialogProperties$$ExternalSyntheticBackport0.m(this.dismissOnBackPress) * 31) + DialogProperties$$ExternalSyntheticBackport0.m(this.dismissOnClickOutside)) * 31) + this.securePolicy.hashCode();
        IBinder iBinder = this.windowToken;
        int iHashCode = iBinder != null ? iBinder.hashCode() : 0;
        boolean z = this.usePlatformDefaultWidth;
        boolean z2 = this.decorFitsSystemWindows;
        return (((((((iM * 31) + DialogProperties$$ExternalSyntheticBackport0.m(z)) * 31) + DialogProperties$$ExternalSyntheticBackport0.m(z2)) * 31) + this.windowType) * 31) + iHashCode;
    }

    public DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4, String str, int i2, IBinder iBinder) {
        this.dismissOnBackPress = z;
        this.dismissOnClickOutside = z2;
        this.securePolicy = secureFlagPolicy;
        this.usePlatformDefaultWidth = z3;
        this.decorFitsSystemWindows = z4;
        this.windowTitle = str;
        this.windowType = i2;
        this.windowToken = iBinder;
    }

    public /* synthetic */ DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy) {
        this(z, z2, secureFlagPolicy, true, true, null, 0, null, 224, null);
    }

    public DialogProperties() {
        this(false, false, null, false, false, null, 0, null, 255, null);
    }

    public /* synthetic */ DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, int i2, o oVar) {
        this(1 == ((z ? 1 : 0) | (i2 & 1)), z2 | (!((i2 & 2) == 0)), (i2 & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4, String str, int i2, o oVar) {
        SecureFlagPolicy secureFlagPolicy2 = (i2 & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy;
        this(1 == ((z ? 1 : 0) | (i2 & 1)), (!((i2 & 2) == 0)) | z2, secureFlagPolicy2, (!((i2 & 8) == 0)) | z3, (!((i2 & 16) == 0)) | z4, (i2 & 32) != 0 ? "" : str);
    }

    public /* synthetic */ DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4) {
        this(z, z2, SecureFlagPolicy.Inherit, z3, true, "", 0, null, 192, null);
    }

    public DialogProperties(boolean z, boolean z2, boolean z3) {
        this(z, z2, SecureFlagPolicy.Inherit, z3, true, null, 0, null, 224, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4, int i2, o oVar) {
        SecureFlagPolicy secureFlagPolicy2 = (i2 & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy;
        this(1 == ((z ? 1 : 0) | (i2 & 1)), (!((i2 & 2) == 0)) | z2, secureFlagPolicy2, (!((i2 & 8) == 0)) | z3, (!((i2 & 16) == 0)) | z4);
    }

    public /* synthetic */ DialogProperties(boolean z, boolean z2, boolean z3, int i2, o oVar) {
        this(1 == ((z ? 1 : 0) | (i2 & 1)), z2 | (!((i2 & 2) == 0)), z3 | (!((i2 & 4) == 0)));
    }

    public /* synthetic */ DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4, String str) {
        this(z, z2, secureFlagPolicy, z3, z4, str, 2, (IBinder) null);
    }
}
