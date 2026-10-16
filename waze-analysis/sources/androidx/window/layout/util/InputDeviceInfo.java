package androidx.window.layout.util;

import androidx.core.view.InputDeviceCompat;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class InputDeviceInfo {
    private final int id;
    private final boolean isEnabled;
    private final boolean isVirtual;
    private final int keyboardType;
    private final int sources;

    public InputDeviceInfo(int i2, boolean z, int i3, int i4, boolean z2) {
        this.id = i2;
        this.isVirtual = z;
        this.sources = i3;
        this.keyboardType = i4;
        this.isEnabled = z2;
    }

    public static /* synthetic */ InputDeviceInfo copy$default(InputDeviceInfo inputDeviceInfo, int i2, boolean z, int i3, int i4, boolean z2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = inputDeviceInfo.id;
        }
        if ((i5 & 2) != 0) {
            z = inputDeviceInfo.isVirtual;
        }
        if ((i5 & 4) != 0) {
            i3 = inputDeviceInfo.sources;
        }
        if ((i5 & 8) != 0) {
            i4 = inputDeviceInfo.keyboardType;
        }
        if ((i5 & 16) != 0) {
            z2 = inputDeviceInfo.isEnabled;
        }
        boolean z3 = z2;
        int i6 = i3;
        return inputDeviceInfo.copy(i2, z, i6, i4, z3);
    }

    public final int component1() {
        return this.id;
    }

    public final boolean component2() {
        return this.isVirtual;
    }

    public final int component3() {
        return this.sources;
    }

    public final int component4() {
        return this.keyboardType;
    }

    public final boolean component5() {
        return this.isEnabled;
    }

    public final InputDeviceInfo copy(int i2, boolean z, int i3, int i4, boolean z2) {
        return new InputDeviceInfo(i2, z, i3, i4, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputDeviceInfo)) {
            return false;
        }
        InputDeviceInfo inputDeviceInfo = (InputDeviceInfo) obj;
        return this.id == inputDeviceInfo.id && this.isVirtual == inputDeviceInfo.isVirtual && this.sources == inputDeviceInfo.sources && this.keyboardType == inputDeviceInfo.keyboardType && this.isEnabled == inputDeviceInfo.isEnabled;
    }

    public final int getId() {
        return this.id;
    }

    public final int getKeyboardType() {
        return this.keyboardType;
    }

    public final int getSources() {
        return this.sources;
    }

    public int hashCode() {
        return (((((((this.id * 31) + InputDeviceInfo$$ExternalSyntheticBackport0.m(this.isVirtual)) * 31) + this.sources) * 31) + this.keyboardType) * 31) + InputDeviceInfo$$ExternalSyntheticBackport0.m(this.isEnabled);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isMouseEnabled() {
        return supportsSource(InputDeviceCompat.SOURCE_MOUSE) && this.isEnabled && !supportsSource(InputDeviceCompat.SOURCE_STYLUS);
    }

    public final boolean isPhysicalKeyboard() {
        return !this.isVirtual && supportsSource(257) && this.keyboardType == 2 && this.isEnabled;
    }

    public final boolean isVirtual() {
        return this.isVirtual;
    }

    public final boolean supportsSource(int i2) {
        return (this.sources & i2) == i2;
    }

    public String toString() {
        return "InputDeviceInfo(id=" + this.id + ", isVirtual=" + this.isVirtual + ", sources=" + this.sources + ", keyboardType=" + this.keyboardType + ", isEnabled=" + this.isEnabled + ")";
    }
}
