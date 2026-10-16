package androidx.car.app;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class HostInfo {
    private final String mPackageName;
    private final int mUid;

    public HostInfo(String str, int i2) {
        this.mPackageName = (String) Objects.requireNonNull(str);
        this.mUid = i2;
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    public int getUid() {
        return this.mUid;
    }

    public String toString() {
        return this.mPackageName + ", uid: " + this.mUid;
    }
}
