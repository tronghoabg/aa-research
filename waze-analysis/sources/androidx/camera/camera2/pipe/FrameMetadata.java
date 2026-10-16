package androidx.camera.camera2.pipe;

import android.hardware.camera2.CaptureResult;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface FrameMetadata extends Metadata, UnsafeWrapper {
    <T> T get(CaptureResult.Key<T> key);

    /* renamed from: getCamera-Dz_R5H8, reason: not valid java name */
    String mo688getCameraDz_R5H8();

    Map<?, Object> getExtraMetadata();

    /* renamed from: getFrameNumber-Ugla2oM, reason: not valid java name */
    long mo689getFrameNumberUgla2oM();

    <T> T getOrDefault(CaptureResult.Key<T> key, T t);
}
