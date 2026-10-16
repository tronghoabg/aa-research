package androidx.camera.camera2.pipe;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraStreamConfigurationMap extends UnsafeWrapper {
    /* renamed from: getHighResolutionOutputSizes-hNQ4ISI, reason: not valid java name */
    List<Size> mo581getHighResolutionOutputSizeshNQ4ISI(int i2);

    List<Range<Integer>> getHighSpeedVideoFpsRanges();

    List<Range<Integer>> getHighSpeedVideoFpsRangesFor(Size size);

    List<Size> getHighSpeedVideoSizes();

    List<Size> getHighSpeedVideoSizesFor(Range<Integer> range);

    List<StreamFormat> getInputFormats();

    /* renamed from: getInputSizes-hNQ4ISI, reason: not valid java name */
    List<Size> mo582getInputSizeshNQ4ISI(int i2);

    List<StreamFormat> getOutputFormats();

    <T> long getOutputMinFrameDuration(Class<T> cls, Size size);

    /* renamed from: getOutputMinFrameDuration-lomOqCM, reason: not valid java name */
    long mo583getOutputMinFrameDurationlomOqCM(int i2, Size size);

    <T> List<Size> getOutputSizes(Class<T> cls);

    /* renamed from: getOutputSizes-hNQ4ISI, reason: not valid java name */
    List<Size> mo584getOutputSizeshNQ4ISI(int i2);

    <T> long getOutputStallDuration(Class<T> cls, Size size);

    /* renamed from: getOutputStallDuration-lomOqCM, reason: not valid java name */
    long mo585getOutputStallDurationlomOqCM(int i2, Size size);

    /* renamed from: getValidOutputFormatsForInput-hNQ4ISI, reason: not valid java name */
    List<StreamFormat> mo586getValidOutputFormatsForInputhNQ4ISI(int i2);

    boolean isOutputSupportedFor(Surface surface);

    <T> boolean isOutputSupportedFor(Class<T> cls);

    /* renamed from: isOutputSupportedFor-hNQ4ISI, reason: not valid java name */
    boolean mo587isOutputSupportedForhNQ4ISI(int i2);
}
