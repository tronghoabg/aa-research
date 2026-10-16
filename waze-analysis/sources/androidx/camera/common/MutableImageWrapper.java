package androidx.camera.common;

import android.graphics.Rect;
import android.hardware.SyncFence;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface MutableImageWrapper extends ImageWrapper {
    @Override // androidx.camera.common.ImageWrapper
    Rect getCropRect();

    @Override // androidx.camera.common.ImageWrapper
    int getDataSpace();

    @Override // androidx.camera.common.ImageWrapper
    SyncFence getSyncFence();

    @Override // androidx.camera.common.ImageWrapper
    long getTimestamp();

    void setCropRect(Rect rect);

    void setDataSpace(int i2);

    void setSyncFence(SyncFence syncFence);

    void setTimestamp(long j2);
}
