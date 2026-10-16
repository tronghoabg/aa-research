package com.waze.sharedrive;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private final ShareDriveNativeManager f38770a;

    public s(ShareDriveNativeManager shareDriveNativeManager) {
        h.g.b.x.f(shareDriveNativeManager, "nativeManager");
        this.f38770a = shareDriveNativeManager;
    }

    public final void a(boolean z) {
        y.updateMapSharingDisplay$default(this.f38770a, z, null, 2, null);
    }
}
