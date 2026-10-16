package androidx.camera.camera2.compat;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.compat.workaround.OutputSizesCorrector;
import androidx.camera.camera2.config.CameraScope;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: WazeSource */
@CameraScope
/* loaded from: classes2.dex */
public final class StreamConfigurationMapCompat {
    private final Map<Class<?>, Size[]> cachedClassOutputSizes;
    private final Map<Integer, Size[]> cachedFormatHighResolutionOutputSizes;
    private final Map<Integer, Size[]> cachedFormatOutputSizes;
    private StreamConfigurationMapCompatImpl impl;
    private final OutputSizesCorrector outputSizesCorrector;
    private final String tag;

    /* compiled from: WazeSource */
    public interface StreamConfigurationMapCompatImpl {
        Size[] getHighResolutionOutputSizes(int i2);

        Range<Integer>[] getHighSpeedVideoFpsRanges();

        Range<Integer>[] getHighSpeedVideoFpsRangesFor(Size size);

        Size[] getHighSpeedVideoSizes();

        Size[] getHighSpeedVideoSizesFor(Range<Integer> range);

        Integer[] getOutputFormats();

        long getOutputMinFrameDuration(int i2, Size size);

        Size[] getOutputSizes(int i2);

        <T> Size[] getOutputSizes(Class<T> cls);

        StreamConfigurationMap unwrap();
    }

    public StreamConfigurationMapCompat(StreamConfigurationMap streamConfigurationMap, OutputSizesCorrector outputSizesCorrector) {
        x.f(outputSizesCorrector, "outputSizesCorrector");
        this.outputSizesCorrector = outputSizesCorrector;
        this.tag = "StreamConfigurationMapCompat";
        this.cachedFormatOutputSizes = new LinkedHashMap();
        this.cachedFormatHighResolutionOutputSizes = new LinkedHashMap();
        this.cachedClassOutputSizes = new LinkedHashMap();
        this.impl = Build.VERSION.SDK_INT >= 34 ? new StreamConfigurationMapCompatApi34Impl(streamConfigurationMap) : new StreamConfigurationMapCompatBaseImpl(streamConfigurationMap);
    }

    public final Size[] getHighResolutionOutputSizes(int i2) {
        Map<Integer, Size[]> map = this.cachedFormatHighResolutionOutputSizes;
        Integer numValueOf = Integer.valueOf(i2);
        if (map.containsKey(numValueOf)) {
            Size[] sizeArr = this.cachedFormatHighResolutionOutputSizes.get(numValueOf);
            if (sizeArr != null) {
                return (Size[]) sizeArr.clone();
            }
            return null;
        }
        Size[] highResolutionOutputSizes = this.impl.getHighResolutionOutputSizes(i2);
        if (highResolutionOutputSizes != null && highResolutionOutputSizes.length != 0) {
            highResolutionOutputSizes = this.outputSizesCorrector.applyQuirks(highResolutionOutputSizes, i2);
        }
        this.cachedFormatHighResolutionOutputSizes.put(numValueOf, highResolutionOutputSizes);
        if (highResolutionOutputSizes != null) {
            return (Size[]) highResolutionOutputSizes.clone();
        }
        return null;
    }

    public final Range<Integer>[] getHighSpeedVideoFpsRanges() {
        return this.impl.getHighSpeedVideoFpsRanges();
    }

    public final Range<Integer>[] getHighSpeedVideoFpsRangesFor(Size size) {
        x.f(size, "size");
        return this.impl.getHighSpeedVideoFpsRangesFor(size);
    }

    public final Size[] getHighSpeedVideoSizes() {
        return this.impl.getHighSpeedVideoSizes();
    }

    public final Size[] getHighSpeedVideoSizesFor(Range<Integer> range) {
        x.f(range, "fpsRange");
        return this.impl.getHighSpeedVideoSizesFor(range);
    }

    public final Integer[] getOutputFormats() {
        return this.impl.getOutputFormats();
    }

    public final long getOutputMinFrameDuration(int i2, Size size) {
        x.f(size, "size");
        try {
            return this.impl.getOutputMinFrameDuration(i2, size);
        } catch (RuntimeException e2) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            RuntimeException runtimeException = e2;
            if (!Logger.isWarnEnabled(Log.TAG)) {
                return 0L;
            }
            android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "Unable to get min frame duration for format = " + i2 + " and size = " + size, runtimeException);
            return 0L;
        }
    }

    public final Size[] getOutputSizes(int i2) {
        Map<Integer, Size[]> map = this.cachedFormatOutputSizes;
        Integer numValueOf = Integer.valueOf(i2);
        Size[] outputSizes = null;
        if (map.containsKey(numValueOf)) {
            Size[] sizeArr = this.cachedFormatOutputSizes.get(numValueOf);
            if (sizeArr != null) {
                return (Size[]) sizeArr.clone();
            }
            return null;
        }
        try {
            outputSizes = this.impl.getOutputSizes(i2);
        } catch (Throwable th) {
            Logger.w(this.tag, "Failed to get output sizes for " + i2, th);
        }
        if (outputSizes != null && outputSizes.length != 0) {
            Size[] sizeArrApplyQuirks = this.outputSizesCorrector.applyQuirks(outputSizes, i2);
            this.cachedFormatOutputSizes.put(Integer.valueOf(i2), sizeArrApplyQuirks);
            return (Size[]) sizeArrApplyQuirks.clone();
        }
        Logger.w(this.tag, "Retrieved output sizes array is null or empty for format " + i2);
        return outputSizes;
    }

    public final StreamConfigurationMap toStreamConfigurationMap() {
        return this.impl.unwrap();
    }

    public final <T> Size[] getOutputSizes(Class<T> cls) {
        x.f(cls, "klass");
        Size[] outputSizes = null;
        if (this.cachedClassOutputSizes.containsKey(cls)) {
            Size[] sizeArr = this.cachedClassOutputSizes.get(cls);
            if (sizeArr != null) {
                return (Size[]) sizeArr.clone();
            }
            return null;
        }
        try {
            outputSizes = this.impl.getOutputSizes(cls);
        } catch (Throwable th) {
            String str = this.tag;
            Objects.toString(cls);
            Logger.w(str, "Failed to get output sizes for ".concat(String.valueOf(cls)), th);
        }
        if (outputSizes != null && outputSizes.length != 0) {
            Size[] sizeArrApplyQuirks = this.outputSizesCorrector.applyQuirks(outputSizes, cls);
            this.cachedClassOutputSizes.put(cls, sizeArrApplyQuirks);
            return (Size[]) sizeArrApplyQuirks.clone();
        }
        String str2 = this.tag;
        Objects.toString(cls);
        Logger.w(str2, "Retrieved output sizes array is null or empty for class ".concat(String.valueOf(cls)));
        return outputSizes;
    }
}
