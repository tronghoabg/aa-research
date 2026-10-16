package androidx.camera.camera2.pipe;

import androidx.camera.camera2.pipe.OutputStream;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraColorSpaceProfiles extends UnsafeWrapper {
    /* renamed from: getSupportedColorSpaces-hNQ4ISI, reason: not valid java name */
    Set<CameraColorSpace> mo419getSupportedColorSpaceshNQ4ISI(int i2);

    /* renamed from: getSupportedColorSpacesForDynamicRange-sNWL0t8, reason: not valid java name */
    Set<CameraColorSpace> mo420getSupportedColorSpacesForDynamicRangesNWL0t8(int i2, long j2);

    /* renamed from: getSupportedDynamicRangeProfiles-6Yu6yh8, reason: not valid java name */
    Set<OutputStream.DynamicRangeProfile> mo421getSupportedDynamicRangeProfiles6Yu6yh8(String str, int i2);

    /* renamed from: getSupportedImageFormatsForColorSpace-jRxjvBE, reason: not valid java name */
    Set<StreamFormat> mo422getSupportedImageFormatsForColorSpacejRxjvBE(String str);
}
