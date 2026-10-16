package androidx.camera.video.internal.compat.quirk;

import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.Quirk;
import androidx.camera.video.Quality;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface VideoQualityQuirk extends Quirk {
    boolean isProblematicVideoQuality(CameraInfoInternal cameraInfoInternal, Quality quality);
}
