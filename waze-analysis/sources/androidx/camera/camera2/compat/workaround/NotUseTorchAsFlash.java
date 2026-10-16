package androidx.camera.camera2.compat.workaround;

import androidx.camera.camera2.pipe.FrameMetadata;
import h.c.e;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class NotUseTorchAsFlash implements UseTorchAsFlash {
    public static final NotUseTorchAsFlash INSTANCE = new NotUseTorchAsFlash();

    private NotUseTorchAsFlash() {
    }

    @Override // androidx.camera.camera2.compat.workaround.UseTorchAsFlash
    public boolean shouldDisableAePrecapture() {
        return false;
    }

    @Override // androidx.camera.camera2.compat.workaround.UseTorchAsFlash
    public Object shouldUseTorchAsFlash(l<? super e<? super FrameMetadata>, ? extends Object> lVar, e<? super Boolean> eVar) {
        return false;
    }
}
