package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.a.r;
import h.g.b.o;
import h.g.b.x;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AndroidFrameInfo implements FrameInfo {
    private final String camera;
    private final Map<CameraId, FrameMetadata> physicalResults;
    private final RequestMetadata requestMetadata;
    private final AndroidFrameMetadata result;
    private final TotalCaptureResult totalCaptureResult;

    private AndroidFrameInfo(TotalCaptureResult totalCaptureResult, String str, RequestMetadata requestMetadata) {
        Map<String, CaptureResult> physicalCaptureResults;
        ArrayMap arrayMapJ;
        x.f(totalCaptureResult, "totalCaptureResult");
        x.f(str, "camera");
        x.f(requestMetadata, "requestMetadata");
        this.totalCaptureResult = totalCaptureResult;
        this.camera = str;
        this.requestMetadata = requestMetadata;
        this.result = new AndroidFrameMetadata(totalCaptureResult, mo201getCameraDz_R5H8(), null);
        try {
            Trace.beginSection("physicalCaptureResults");
            if (Build.VERSION.SDK_INT >= 31) {
                physicalCaptureResults = Api31Compat.getPhysicalCameraTotalResults(this.totalCaptureResult);
                x.d(physicalCaptureResults, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, android.hardware.camera2.CaptureResult>");
            } else {
                physicalCaptureResults = Api28Compat.getPhysicalCaptureResults(this.totalCaptureResult);
            }
            if (physicalCaptureResults == null || physicalCaptureResults.isEmpty()) {
                arrayMapJ = r.j();
            } else {
                ArrayMap arrayMap = new ArrayMap(physicalCaptureResults.size());
                for (Map.Entry<String, CaptureResult> entry : physicalCaptureResults.entrySet()) {
                    String key = entry.getKey();
                    CameraId.m547constructorimpl(key);
                    arrayMap.put(CameraId.m546boximpl(key), new AndroidFrameMetadata(entry.getValue(), key, null));
                }
                arrayMapJ = arrayMap;
            }
            Trace.endSection();
            this.physicalResults = arrayMapJ;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.camera.camera2.pipe.FrameInfo
    /* renamed from: get-EfqyGwQ */
    public FrameMetadata mo200getEfqyGwQ(String str) {
        x.f(str, "camera");
        return this.physicalResults.get(CameraId.m546boximpl(str));
    }

    @Override // androidx.camera.camera2.pipe.FrameInfo
    /* renamed from: getCamera-Dz_R5H8 */
    public String mo201getCameraDz_R5H8() {
        return this.camera;
    }

    @Override // androidx.camera.camera2.pipe.FrameInfo
    /* renamed from: getFrameNumber-Ugla2oM */
    public long mo202getFrameNumberUgla2oM() {
        return this.result.mo689getFrameNumberUgla2oM();
    }

    @Override // androidx.camera.camera2.pipe.FrameInfo
    public FrameMetadata getMetadata() {
        return this.result;
    }

    @Override // androidx.camera.camera2.pipe.FrameInfo
    public RequestMetadata getRequestMetadata() {
        return this.requestMetadata;
    }

    public String toString() {
        return "FrameInfo(camera: " + CameraId.m552toStringimpl(this.result.mo688getCameraDz_R5H8()) + ", frameNumber: " + this.result.mo689getFrameNumberUgla2oM() + ")";
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
    public <T> T unwrapAs(Class<T> cls) {
        T t;
        x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        if (x.n(cls, CaptureResult.class)) {
            Object obj = this.totalCaptureResult;
            x.d(obj, "null cannot be cast to non-null type T of androidx.camera.camera2.pipe.compat.AndroidFrameInfo.unwrapAs");
            return (T) obj;
        }
        if (!x.n(cls, TotalCaptureResult.class) || (t = (T) this.totalCaptureResult) == null) {
            return null;
        }
        return t;
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public /* synthetic */ Object unwrapAs(h.l.c cVar) {
        return UnsafeWrapper.CC.$default$unwrapAs(this, cVar);
    }

    public /* synthetic */ AndroidFrameInfo(TotalCaptureResult totalCaptureResult, String str, RequestMetadata requestMetadata, o oVar) {
        this(totalCaptureResult, str, requestMetadata);
    }
}
