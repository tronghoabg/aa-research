package com.waze.sharedrive;

import com.waze.NativeManager;
import com.waze.hw;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class y {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateMapSharingDisplay$default(y yVar, boolean z, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateMapSharingDisplay");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        yVar.updateMapSharingDisplay(z, lVar);
    }

    static final h.ab updateMapSharingDisplay$lambda$0(y yVar, boolean z) {
        h.g.b.x.d(yVar, "null cannot be cast to non-null type com.waze.sharedrive.ShareDriveNativeManager");
        ((ShareDriveNativeManager) yVar).updateMapSharingDisplayNTV(z);
        return null;
    }

    public abstract boolean isShareDriveV2Enabled();

    protected final boolean isShareDriveV2EnabledJNI() {
        return ((ShareDriveNativeManager) this).isShareDriveV2Enabled();
    }

    public abstract boolean isSharingLocation();

    protected final boolean isSharingLocationJNI() {
        return ((ShareDriveNativeManager) this).isSharingLocation();
    }

    public void updateMapSharingDisplay(final boolean z, final h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.sharedrive.w
            @Override // com.waze.hw
            public final Object a() {
                y.updateMapSharingDisplay$lambda$0(this.f38774a, z);
                return null;
            }
        }, lVar != null ? new com.waze.jni.a() { // from class: com.waze.sharedrive.x
            @Override // com.waze.jni.a
            public final void a(Object obj) {
                lVar.invoke((h.ab) obj);
            }
        } : null);
    }

    public final void updateMapSharingDisplay(boolean z) {
        updateMapSharingDisplay$default(this, z, null, 2, null);
    }
}
