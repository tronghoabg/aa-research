package androidx.car.app;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class HandshakeInfo {
    private final int mHostCarAppApiLevel;
    private final java.lang.String mHostPackageName;

    private HandshakeInfo() {
        this.mHostPackageName = null;
        this.mHostCarAppApiLevel = 0;
    }

    public int getHostCarAppApiLevel() {
        return this.mHostCarAppApiLevel;
    }

    public java.lang.String getHostPackageName() {
        java.lang.String str = this.mHostPackageName;
        str.getClass();
        return str;
    }

    public HandshakeInfo(java.lang.String str, int i) {
        this.mHostPackageName = str;
        this.mHostCarAppApiLevel = i;
    }
}
