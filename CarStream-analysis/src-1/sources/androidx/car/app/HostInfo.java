package androidx.car.app;

import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class HostInfo {
    private final String mPackageName;
    private final int mUid;

    public HostInfo(String str, int i) {
        Objects.requireNonNull(str);
        this.mPackageName = str;
        this.mUid = i;
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
