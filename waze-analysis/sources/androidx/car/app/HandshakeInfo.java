package androidx.car.app;

import androidx.car.app.annotations.CarProtocol;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public final class HandshakeInfo {
    private final int mHostCarAppApiLevel;
    private final String mHostPackageName;

    private HandshakeInfo() {
        this.mHostPackageName = null;
        this.mHostCarAppApiLevel = 0;
    }

    public int getHostCarAppApiLevel() {
        return this.mHostCarAppApiLevel;
    }

    public String getHostPackageName() {
        return (String) Objects.requireNonNull(this.mHostPackageName);
    }

    public HandshakeInfo(String str, int i2) {
        this.mHostPackageName = str;
        this.mHostCarAppApiLevel = i2;
    }
}
