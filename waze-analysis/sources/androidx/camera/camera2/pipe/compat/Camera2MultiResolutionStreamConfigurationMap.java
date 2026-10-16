package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.params.MultiResolutionStreamConfigurationMap;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import android.support.v7.widget.bi$$ExternalSyntheticApiModelOutline0;
import androidx.camera.camera2.pipe.CameraMultiResolutionStreamConfigurationMap;
import androidx.camera.camera2.pipe.StreamFormat;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.a.i;
import h.g.b.x;
import h.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2MultiResolutionStreamConfigurationMap implements CameraMultiResolutionStreamConfigurationMap {
    private final MultiResolutionStreamConfigurationMap multiResolutionStreamConfigurationMap;

    public Camera2MultiResolutionStreamConfigurationMap(MultiResolutionStreamConfigurationMap multiResolutionStreamConfigurationMap) {
        x.f(multiResolutionStreamConfigurationMap, "multiResolutionStreamConfigurationMap");
        this.multiResolutionStreamConfigurationMap = multiResolutionStreamConfigurationMap;
    }

    @Override // androidx.camera.camera2.pipe.CameraMultiResolutionStreamConfigurationMap
    public List<StreamFormat> getInputFormats() {
        int[] inputFormats = this.multiResolutionStreamConfigurationMap.getInputFormats();
        x.e(inputFormats, "getInputFormats(...)");
        ArrayList arrayList = new ArrayList(inputFormats.length);
        for (int i2 : inputFormats) {
            arrayList.add(StreamFormat.m918boximpl(i2));
        }
        return arrayList;
    }

    @Override // androidx.camera.camera2.pipe.CameraMultiResolutionStreamConfigurationMap
    /* renamed from: getInputInfo-hNQ4ISI */
    public List<MultiResolutionStreamInfo> mo567getInputInfohNQ4ISI(int i2) {
        Collection inputInfo = this.multiResolutionStreamConfigurationMap.getInputInfo(i2);
        x.e(inputInfo, "getInputInfo(...)");
        return i.ao(inputInfo);
    }

    @Override // androidx.camera.camera2.pipe.CameraMultiResolutionStreamConfigurationMap
    public List<StreamFormat> getOutputFormats() {
        int[] outputFormats = this.multiResolutionStreamConfigurationMap.getOutputFormats();
        x.e(outputFormats, "getOutputFormats(...)");
        ArrayList arrayList = new ArrayList(outputFormats.length);
        for (int i2 : outputFormats) {
            arrayList.add(StreamFormat.m918boximpl(i2));
        }
        return arrayList;
    }

    @Override // androidx.camera.camera2.pipe.CameraMultiResolutionStreamConfigurationMap
    /* renamed from: getOutputInfo-hNQ4ISI */
    public List<MultiResolutionStreamInfo> mo568getOutputInfohNQ4ISI(int i2) {
        Collection outputInfo = this.multiResolutionStreamConfigurationMap.getOutputInfo(i2);
        x.e(outputInfo, "getOutputInfo(...)");
        return i.ao(outputInfo);
    }

    @Override // androidx.camera.camera2.pipe.CameraMultiResolutionStreamConfigurationMap
    /* renamed from: isConcurrentReadersSupported-hNQ4ISI */
    public boolean mo569isConcurrentReadersSupportedhNQ4ISI(int i2) {
        throw new j("An operation is not implemented: Not yet implemented");
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
    public <T> T unwrapAs(Class<T> cls) {
        x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        if (x.n(cls, bi$$ExternalSyntheticApiModelOutline0.m$2())) {
            Object obj = this.multiResolutionStreamConfigurationMap;
            x.d(obj, "null cannot be cast to non-null type T of androidx.camera.camera2.pipe.compat.Camera2MultiResolutionStreamConfigurationMap.unwrapAs");
            return (T) obj;
        }
        if (x.n(cls, Camera2MultiResolutionStreamConfigurationMap.class)) {
            return (T) this;
        }
        return null;
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public /* synthetic */ Object unwrapAs(h.l.c cVar) {
        return UnsafeWrapper.CC.$default$unwrapAs(this, cVar);
    }
}
