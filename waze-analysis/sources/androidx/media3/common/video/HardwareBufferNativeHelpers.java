package androidx.media3.common.video;

import android.graphics.Bitmap;
import android.hardware.HardwareBuffer;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface HardwareBufferNativeHelpers {
    boolean nativeCopyBitmapToHardwareBuffer(Bitmap bitmap, HardwareBuffer hardwareBuffer);

    boolean nativeCopyHardwareBufferToHardwareBuffer(HardwareBuffer hardwareBuffer, HardwareBuffer hardwareBuffer2);
}
