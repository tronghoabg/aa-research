package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.pipe.CameraStreamConfigurationMap;
import androidx.camera.camera2.pipe.StreamFormat;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.a.i;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2StreamConfigurationMap implements CameraStreamConfigurationMap {
    private final StreamConfigurationMap streamConfigurationMap;

    public Camera2StreamConfigurationMap(StreamConfigurationMap streamConfigurationMap) {
        x.f(streamConfigurationMap, "streamConfigurationMap");
        this.streamConfigurationMap = streamConfigurationMap;
    }

    @Override // androidx.camera.camera2.pipe.CameraStreamConfigurationMap
    /* renamed from: getHighResolutionOutputSizes-hNQ4ISI */
    public List<Size> mo581getHighResolutionOutputSizeshNQ4ISI(int i2) {
        List<Size> listX;
        Size[] highResolutionOutputSizes = this.streamConfigurationMap.getHighResolutionOutputSizes(i2);
        return (highResolutionOutputSizes == null || (listX = h.a.c.X(highResolutionOutputSizes)) == null) ? i.h() : listX;
    }

    @Override // androidx.camera.camera2.pipe.CameraStreamConfigurationMap
    public List<Range<Integer>> getHighSpeedVideoFpsRanges() {
        Range<Integer>[] highSpeedVideoFpsRanges = this.streamConfigurationMap.getHighSpeedVideoFpsRanges();
        x.e(highSpeedVideoFpsRanges, "getHighSpeedVideoFpsRanges(...)");
        return h.a.c.X(highSpeedVideoFpsRanges);
    }

    @Override // androidx.camera.camera2.pipe.CameraStreamConfigurationMap
    public List<Range<Integer>> getHighSpeedVideoFpsRangesFor(Size size) {
        List<Range<Integer>> listX;
        x.f(size, "size");
        Range<Integer>[] highSpeedVideoFpsRangesFor = this.streamConfigurationMap.getHighSpeedVideoFpsRangesFor(size);
        return (highSpeedVideoFpsRangesFor == null || (listX = h.a.c.X(highSpeedVideoFpsRangesFor)) == null) ? i.h() : listX;
    }

    @Override // androidx.camera.camera2.pipe.CameraStreamConfigurationMap
    public List<Size> getHighSpeedVideoSizes() {
        Size[] highSpeedVideoSizes = this.streamConfigurationMap.getHighSpeedVideoSizes();
        x.e(highSpeedVideoSizes, "getHighSpeedVideoSizes(...)");
        return h.a.c.X(highSpeedVideoSizes);
    }

    @Override // androidx.camera.camera2.pipe.CameraStreamConfigurationMap
    public List<Size> getHighSpeedVideoSizesFor(Range<Integer> range) {
        x.f(range, "fpsRange");
        Size[] highSpeedVideoSizesFor = this.streamConfigurationMap.getHighSpeedVideoSizesFor(range);
        x.e(highSpeedVideoSizesFor, "getHighSpeedVideoSizesFor(...)");
        return h.a.c.X(highSpeedVideoSizesFor);
    }

    @Override // androidx.camera.camera2.pipe.CameraStreamConfigurationMap
    public List<StreamFormat> getInputFormats() {
        int[] inputFormats = this.streamConfigurationMap.getInputFormats();
        x.e(inputFormats, "getInputFormats(...)");
        ArrayList arrayList = new ArrayList(inputFormats.length);
        for (int i2 : inputFormats) {
            arrayList.add(StreamFormat.m918boximpl(i2));
        }
        return arrayList;
    }

    @Override // androidx.camera.camera2.pipe.CameraStreamConfigurationMap
    /* renamed from: getInputSizes-hNQ4ISI */
    public List<Size> mo582getInputSizeshNQ4ISI(int i2) {
        List<Size> listX;
        Size[] inputSizes = this.streamConfigurationMap.getInputSizes(i2);
        return (inputSizes == null || (listX = h.a.c.X(inputSizes)) == null) ? i.h() : listX;
    }

    @Override // androidx.camera.camera2.pipe.CameraStreamConfigurationMap
    public List<StreamFormat> getOutputFormats() {
        int[] outputFormats = this.streamConfigurationMap.getOutputFormats();
        x.e(outputFormats, "getOutputFormats(...)");
        ArrayList arrayList = new ArrayList(outputFormats.length);
        for (int i2 : outputFormats) {
            arrayList.add(StreamFormat.m918boximpl(i2));
        }
        return arrayList;
    }

    @Override // androidx.camera.camera2.pipe.CameraStreamConfigurationMap
    public <T> long getOutputMinFrameDuration(Class<T> cls, Size size) {
        x.f(cls, "klass");
        x.f(size, "size");
        return this.streamConfigurationMap.getOutputMinFrameDuration(cls, size);
    }

    @Override // androidx.camera.camera2.pipe.CameraStreamConfigurationMap
    /* renamed from: getOutputMinFrameDuration-lomOqCM */
    public long mo583getOutputMinFrameDurationlomOqCM(int i2, Size size) {
        x.f(size, "size");
        return this.streamConfigurationMap.getOutputMinFrameDuration(i2, size);
    }

    @Override // androidx.camera.camera2.pipe.CameraStreamConfigurationMap
    public <T> List<Size> getOutputSizes(Class<T> cls) {
        List<Size> listX;
        x.f(cls, "klass");
        Size[] outputSizes = this.streamConfigurationMap.getOutputSizes(cls);
        return (outputSizes == null || (listX = h.a.c.X(outputSizes)) == null) ? i.h() : listX;
    }

    @Override // androidx.camera.camera2.pipe.CameraStreamConfigurationMap
    /* renamed from: getOutputSizes-hNQ4ISI */
    public List<Size> mo584getOutputSizeshNQ4ISI(int i2) {
        List<Size> listX;
        Size[] outputSizes = this.streamConfigurationMap.getOutputSizes(i2);
        return (outputSizes == null || (listX = h.a.c.X(outputSizes)) == null) ? i.h() : listX;
    }

    @Override // androidx.camera.camera2.pipe.CameraStreamConfigurationMap
    public <T> long getOutputStallDuration(Class<T> cls, Size size) {
        x.f(cls, "klass");
        x.f(size, "size");
        return this.streamConfigurationMap.getOutputStallDuration(cls, size);
    }

    @Override // androidx.camera.camera2.pipe.CameraStreamConfigurationMap
    /* renamed from: getOutputStallDuration-lomOqCM */
    public long mo585getOutputStallDurationlomOqCM(int i2, Size size) {
        x.f(size, "size");
        return this.streamConfigurationMap.getOutputStallDuration(i2, size);
    }

    @Override // androidx.camera.camera2.pipe.CameraStreamConfigurationMap
    /* renamed from: getValidOutputFormatsForInput-hNQ4ISI */
    public List<StreamFormat> mo586getValidOutputFormatsForInputhNQ4ISI(int i2) {
        int[] validOutputFormatsForInput = this.streamConfigurationMap.getValidOutputFormatsForInput(i2);
        x.e(validOutputFormatsForInput, "getValidOutputFormatsForInput(...)");
        ArrayList arrayList = new ArrayList(validOutputFormatsForInput.length);
        for (int i3 : validOutputFormatsForInput) {
            arrayList.add(StreamFormat.m918boximpl(i3));
        }
        return arrayList;
    }

    @Override // androidx.camera.camera2.pipe.CameraStreamConfigurationMap
    public boolean isOutputSupportedFor(Surface surface) {
        x.f(surface, "surface");
        return this.streamConfigurationMap.isOutputSupportedFor(surface);
    }

    @Override // androidx.camera.camera2.pipe.CameraStreamConfigurationMap
    /* renamed from: isOutputSupportedFor-hNQ4ISI */
    public boolean mo587isOutputSupportedForhNQ4ISI(int i2) {
        return this.streamConfigurationMap.isOutputSupportedFor(i2);
    }

    public String toString() {
        String string = this.streamConfigurationMap.toString();
        x.e(string, "toString(...)");
        return string;
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
    public <T> T unwrapAs(Class<T> cls) {
        x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        if (x.n(cls, StreamConfigurationMap.class)) {
            Object obj = this.streamConfigurationMap;
            x.d(obj, "null cannot be cast to non-null type T of androidx.camera.camera2.pipe.compat.Camera2StreamConfigurationMap.unwrapAs");
            return (T) obj;
        }
        if (x.n(cls, Camera2StreamConfigurationMap.class)) {
            return (T) this;
        }
        return null;
    }

    @Override // androidx.camera.camera2.pipe.CameraStreamConfigurationMap
    public <T> boolean isOutputSupportedFor(Class<T> cls) {
        x.f(cls, "klass");
        return StreamConfigurationMap.isOutputSupportedFor(cls);
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public /* synthetic */ Object unwrapAs(h.l.c cVar) {
        return UnsafeWrapper.CC.$default$unwrapAs(this, cVar);
    }
}
